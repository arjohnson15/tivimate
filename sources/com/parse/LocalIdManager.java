package com.parse;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class LocalIdManager {
    private final File diskPath;
    private final Random random = new Random();

    public static class MapEntry {
        String objectId;
        int retainCount;

        private MapEntry() {
        }
    }

    public LocalIdManager(File file) {
        this.diskPath = new File(file, "LocalId");
    }

    private synchronized MapEntry getMapEntry(String str) {
        MapEntry mapEntry;
        if (!isLocalId(str)) {
            throw new IllegalStateException("Tried to get invalid local id: \"" + str + "\".");
        }
        try {
            JSONObject fileToJSONObject = ParseFileUtils.readFileToJSONObject(new File(this.diskPath, str));
            mapEntry = new MapEntry();
            mapEntry.retainCount = fileToJSONObject.optInt("retainCount", 0);
            mapEntry.objectId = fileToJSONObject.optString("objectId", null);
        } catch (IOException | JSONException unused) {
            return new MapEntry();
        }
        return mapEntry;
    }

    private boolean isLocalId(String str) {
        if (!str.startsWith("local_")) {
            return false;
        }
        for (int i = 6; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                return false;
            }
        }
        return true;
    }

    private synchronized void putMapEntry(String str, MapEntry mapEntry) {
        if (!isLocalId(str)) {
            throw new IllegalStateException("Tried to get invalid local id: \"" + str + "\".");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("retainCount", mapEntry.retainCount);
            String str2 = mapEntry.objectId;
            if (str2 != null) {
                jSONObject.put("objectId", str2);
            }
            File file = new File(this.diskPath, str);
            if (!this.diskPath.exists()) {
                this.diskPath.mkdirs();
            }
            try {
                ParseFileUtils.writeJSONObjectToFile(file, jSONObject);
            } catch (IOException unused) {
            }
        } catch (JSONException e) {
            throw new IllegalStateException("Error creating local id map entry.", e);
        }
    }

    private synchronized void removeMapEntry(String str) {
        if (!isLocalId(str)) {
            throw new IllegalStateException("Tried to get invalid local id: \"" + str + "\".");
        }
        ParseFileUtils.deleteQuietly(new File(this.diskPath, str));
    }

    public synchronized String createLocalId() {
        String str;
        str = "local_" + Long.toHexString(this.random.nextLong());
        if (!isLocalId(str)) {
            throw new IllegalStateException("Generated an invalid local id: \"" + str + "\". This should never happen. Open a bug at https://github.com/parse-community/parse-server");
        }
        return str;
    }

    public synchronized String getObjectId(String str) {
        return getMapEntry(str).objectId;
    }

    public synchronized void releaseLocalIdOnDisk(String str) {
        try {
            MapEntry mapEntry = getMapEntry(str);
            int i = mapEntry.retainCount - 1;
            mapEntry.retainCount = i;
            if (i > 0) {
                putMapEntry(str, mapEntry);
            } else {
                removeMapEntry(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setObjectId(String str, String str2) {
        try {
            MapEntry mapEntry = getMapEntry(str);
            if (mapEntry.retainCount > 0) {
                if (mapEntry.objectId != null) {
                    throw new IllegalStateException("Tried to set an objectId for a localId that already has one.");
                }
                mapEntry.objectId = str2;
                putMapEntry(str, mapEntry);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
