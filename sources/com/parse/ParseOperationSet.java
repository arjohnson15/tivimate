package com.parse;

import android.os.Parcel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseOperationSet extends HashMap<String, ParseFieldOperation> {
    private boolean isSaveEventually;
    private final String uuid;

    public ParseOperationSet() {
        this(UUID.randomUUID().toString());
    }

    public ParseOperationSet(ParseOperationSet parseOperationSet) {
        super(parseOperationSet);
        this.isSaveEventually = false;
        this.uuid = parseOperationSet.getUUID();
        this.isSaveEventually = parseOperationSet.isSaveEventually;
    }

    private ParseOperationSet(String str) {
        this.isSaveEventually = false;
        this.uuid = str;
    }

    public static ParseOperationSet fromParcel(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
        ParseOperationSet parseOperationSet = new ParseOperationSet(parcel.readString());
        parseOperationSet.setIsSaveEventually(parcel.readByte() == 1);
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            parseOperationSet.put(parcel.readString(), (ParseFieldOperation) parseParcelDecoder.decode(parcel));
        }
        return parseOperationSet;
    }

    public static ParseOperationSet fromRest(JSONObject jSONObject, ParseDecoder parseDecoder) {
        Iterator<String> itKeys = jSONObject.keys();
        String[] strArr = new String[jSONObject.length()];
        int i = 0;
        while (itKeys.hasNext()) {
            strArr[i] = itKeys.next();
            i++;
        }
        JSONObject jSONObject2 = new JSONObject(jSONObject, strArr);
        String str = (String) jSONObject2.remove("__uuid");
        ParseOperationSet parseOperationSet = str == null ? new ParseOperationSet() : new ParseOperationSet(str);
        boolean zOptBoolean = jSONObject2.optBoolean("__isSaveEventually");
        jSONObject2.remove("__isSaveEventually");
        parseOperationSet.setIsSaveEventually(zOptBoolean);
        Iterator<String> itKeys2 = jSONObject2.keys();
        while (itKeys2.hasNext()) {
            String next = itKeys2.next();
            Object objDecode = parseDecoder.decode(jSONObject2.get(next));
            if (next.equals("ACL")) {
                objDecode = ParseACL.createACLFromJSONObject(jSONObject2.getJSONObject(next), parseDecoder);
            }
            parseOperationSet.put(next, objDecode instanceof ParseFieldOperation ? (ParseFieldOperation) objDecode : new ParseSetOperation(objDecode));
        }
        return parseOperationSet;
    }

    public String getUUID() {
        return this.uuid;
    }

    public boolean isSaveEventually() {
        return this.isSaveEventually;
    }

    public void mergeFrom(ParseOperationSet parseOperationSet) {
        for (String str : parseOperationSet.keySet()) {
            ParseFieldOperation parseFieldOperationMergeWithPrevious = parseOperationSet.get(str);
            ParseFieldOperation parseFieldOperation = get(str);
            if (parseFieldOperation != null) {
                parseFieldOperationMergeWithPrevious = parseFieldOperation.mergeWithPrevious(parseFieldOperationMergeWithPrevious);
            }
            put(str, parseFieldOperationMergeWithPrevious);
        }
    }

    public void setIsSaveEventually(boolean z) {
        this.isSaveEventually = z;
    }

    public void toParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        parcel.writeString(this.uuid);
        parcel.writeByte(this.isSaveEventually ? (byte) 1 : (byte) 0);
        parcel.writeInt(size());
        for (String str : keySet()) {
            parcel.writeString(str);
            parseParcelEncoder.encode(get(str), parcel);
        }
    }

    public JSONObject toRest(ParseEncoder parseEncoder) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : keySet()) {
            jSONObject.put(str, ((ParseFieldOperation) get(str)).encode(parseEncoder));
        }
        jSONObject.put("__uuid", this.uuid);
        if (this.isSaveEventually) {
            jSONObject.put("__isSaveEventually", true);
        }
        return jSONObject;
    }
}
