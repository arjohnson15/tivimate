package com.parse;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ParseACL implements Parcelable {
    public static final Parcelable.Creator<ParseACL> CREATOR = new Parcelable.Creator<ParseACL>() { // from class: com.parse.ParseACL.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseACL createFromParcel(Parcel parcel) {
            return new ParseACL(parcel, new ParseObjectParcelDecoder());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseACL[] newArray(int i) {
            return new ParseACL[i];
        }
    };
    private final Map<String, Permissions> permissionsById = new HashMap();
    private boolean shared;
    private ParseUser unresolvedUser;

    public static class Permissions {
        private final boolean readPermission;
        private final boolean writePermission;

        public Permissions(Permissions permissions) {
            this.readPermission = permissions.readPermission;
            this.writePermission = permissions.writePermission;
        }

        public Permissions(boolean z, boolean z2) {
            this.readPermission = z;
            this.writePermission = z2;
        }

        public static Permissions createPermissionsFromJSONObject(JSONObject jSONObject) {
            return new Permissions(jSONObject.optBoolean("read", false), jSONObject.optBoolean("write", false));
        }

        public static Permissions createPermissionsFromParcel(Parcel parcel) {
            return new Permissions(parcel.readByte() == 1, parcel.readByte() == 1);
        }

        public boolean getReadPermission() {
            return this.readPermission;
        }

        public boolean getWritePermission() {
            return this.writePermission;
        }

        public JSONObject toJSONObject() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.readPermission) {
                    jSONObject.put("read", true);
                }
                if (this.writePermission) {
                    jSONObject.put("write", true);
                }
                return jSONObject;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public void toParcel(Parcel parcel) {
            parcel.writeByte(this.readPermission ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.writePermission ? (byte) 1 : (byte) 0);
        }
    }

    public static class UserResolutionListener implements GetCallback<ParseObject> {
        private final WeakReference<ParseACL> parent;

        public UserResolutionListener(ParseACL parseACL) {
            this.parent = new WeakReference<>(parseACL);
        }

        @Override // com.parse.ParseCallback2
        public void done(ParseObject parseObject, ParseException parseException) {
            try {
                ParseACL parseACL = this.parent.get();
                if (parseACL != null) {
                    parseACL.resolveUser((ParseUser) parseObject);
                }
            } finally {
                parseObject.unregisterSaveListener(this);
            }
        }
    }

    public ParseACL() {
    }

    public ParseACL(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
        this.shared = parcel.readByte() == 1;
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.permissionsById.put(parcel.readString(), Permissions.createPermissionsFromParcel(parcel));
        }
        if (parcel.readByte() == 1) {
            ParseUser parseUser = (ParseUser) parseParcelDecoder.decode(parcel);
            this.unresolvedUser = parseUser;
            parseUser.registerSaveListener(new UserResolutionListener(this));
        }
    }

    public ParseACL(ParseACL parseACL) {
        for (String str : parseACL.permissionsById.keySet()) {
            this.permissionsById.put(str, new Permissions(parseACL.permissionsById.get(str)));
        }
        ParseUser parseUser = parseACL.unresolvedUser;
        this.unresolvedUser = parseUser;
        if (parseUser != null) {
            parseUser.registerSaveListener(new UserResolutionListener(this));
        }
    }

    public static ParseACL createACLFromJSONObject(JSONObject jSONObject, ParseDecoder parseDecoder) {
        ParseACL parseACL = new ParseACL();
        for (String str : ParseJSONUtils.keys(jSONObject)) {
            if (str.equals("unresolvedUser")) {
                try {
                    parseACL.unresolvedUser = (ParseUser) parseDecoder.decode(jSONObject.getJSONObject(str));
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    parseACL.permissionsById.put(str, Permissions.createPermissionsFromJSONObject(jSONObject.getJSONObject(str)));
                } catch (JSONException e2) {
                    throw new RuntimeException("could not decode ACL: " + e2.getMessage());
                }
            }
        }
        return parseACL;
    }

    public static ParseACL getDefaultACL() {
        return getDefaultACLController().get();
    }

    private static ParseDefaultACLController getDefaultACLController() {
        return ParseCorePlugins.getInstance().getDefaultACLController();
    }

    private boolean isUnresolvedUser(ParseUser parseUser) {
        ParseUser parseUser2;
        if (parseUser == null || (parseUser2 = this.unresolvedUser) == null) {
            return false;
        }
        return parseUser == parseUser2 || (parseUser.getObjectId() == null && parseUser.getOrCreateLocalId().equals(this.unresolvedUser.getOrCreateLocalId()));
    }

    private void prepareUnresolvedUser(ParseUser parseUser) {
        if (isUnresolvedUser(parseUser)) {
            return;
        }
        this.permissionsById.remove("*unresolved");
        this.unresolvedUser = parseUser;
        parseUser.registerSaveListener(new UserResolutionListener(this));
    }

    private void setPermissionsIfNonEmpty(String str, boolean z, boolean z2) {
        if (z || z2) {
            this.permissionsById.put(str, new Permissions(z, z2));
        } else {
            this.permissionsById.remove(str);
        }
    }

    private void setUnresolvedReadAccess(ParseUser parseUser, boolean z) {
        prepareUnresolvedUser(parseUser);
        setReadAccess("*unresolved", z);
    }

    private void setUnresolvedWriteAccess(ParseUser parseUser, boolean z) {
        prepareUnresolvedUser(parseUser);
        setWriteAccess("*unresolved", z);
    }

    public ParseACL copy() {
        return new ParseACL(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean getPublicReadAccess() {
        return getReadAccess("*");
    }

    public boolean getReadAccess(ParseUser parseUser) {
        if (isUnresolvedUser(parseUser)) {
            return getReadAccess("*unresolved");
        }
        if (parseUser.isLazy()) {
            return false;
        }
        if (parseUser.getObjectId() != null) {
            return getReadAccess(parseUser.getObjectId());
        }
        throw new IllegalArgumentException("cannot getReadAccess for a user with null id");
    }

    public boolean getReadAccess(String str) {
        if (str == null) {
            throw new IllegalArgumentException("cannot getReadAccess for null userId");
        }
        Permissions permissions = this.permissionsById.get(str);
        return permissions != null && permissions.getReadPermission();
    }

    public ParseUser getUnresolvedUser() {
        return this.unresolvedUser;
    }

    public boolean getWriteAccess(String str) {
        if (str == null) {
            throw new IllegalArgumentException("cannot getWriteAccess for null userId");
        }
        Permissions permissions = this.permissionsById.get(str);
        return permissions != null && permissions.getWritePermission();
    }

    public boolean hasUnresolvedUser() {
        return this.unresolvedUser != null;
    }

    public boolean isShared() {
        return this.shared;
    }

    public void resolveUser(ParseUser parseUser) {
        if (isUnresolvedUser(parseUser)) {
            if (this.permissionsById.containsKey("*unresolved")) {
                this.permissionsById.put(parseUser.getObjectId(), this.permissionsById.get("*unresolved"));
                this.permissionsById.remove("*unresolved");
            }
            this.unresolvedUser = null;
        }
    }

    public void setReadAccess(ParseUser parseUser, boolean z) {
        if (parseUser.getObjectId() != null) {
            setReadAccess(parseUser.getObjectId(), z);
        } else {
            if (!parseUser.isLazy()) {
                throw new IllegalArgumentException("cannot setReadAccess for a user with null id");
            }
            setUnresolvedReadAccess(parseUser, z);
        }
    }

    public void setReadAccess(String str, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("cannot setReadAccess for null userId");
        }
        setPermissionsIfNonEmpty(str, z, getWriteAccess(str));
    }

    public void setShared(boolean z) {
        this.shared = z;
    }

    public void setWriteAccess(ParseUser parseUser, boolean z) {
        if (parseUser.getObjectId() != null) {
            setWriteAccess(parseUser.getObjectId(), z);
        } else {
            if (!parseUser.isLazy()) {
                throw new IllegalArgumentException("cannot setWriteAccess for a user with null id");
            }
            setUnresolvedWriteAccess(parseUser, z);
        }
    }

    public void setWriteAccess(String str, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("cannot setWriteAccess for null userId");
        }
        setPermissionsIfNonEmpty(str, getReadAccess(str), z);
    }

    public JSONObject toJSONObject(ParseEncoder parseEncoder) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : this.permissionsById.keySet()) {
                jSONObject.put(str, this.permissionsById.get(str).toJSONObject());
            }
            ParseUser parseUser = this.unresolvedUser;
            if (parseUser != null) {
                jSONObject.put("unresolvedUser", parseEncoder.encode(parseUser));
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, new ParseObjectParcelEncoder());
    }

    public void writeToParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        parcel.writeByte(this.shared ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.permissionsById.size());
        for (String str : this.permissionsById.keySet()) {
            parcel.writeString(str);
            this.permissionsById.get(str).toParcel(parcel);
        }
        parcel.writeByte(this.unresolvedUser != null ? (byte) 1 : (byte) 0);
        ParseUser parseUser = this.unresolvedUser;
        if (parseUser != null) {
            parseParcelEncoder.encode(parseUser, parcel);
        }
    }
}
