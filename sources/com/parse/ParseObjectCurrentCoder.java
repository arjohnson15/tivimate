package com.parse;

import com.parse.ParseObject;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseObjectCurrentCoder extends ParseObjectCoder {
    private static final ParseObjectCurrentCoder INSTANCE = new ParseObjectCurrentCoder();

    public static ParseObjectCurrentCoder get() {
        return INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    @Override // com.parse.ParseObjectCoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T extends com.parse.ParseObject.State.Init<?>> T decode(T r9, org.json.JSONObject r10, com.parse.ParseDecoder r11) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.parse.ParseObjectCurrentCoder.decode(com.parse.ParseObject$State$Init, org.json.JSONObject, com.parse.ParseDecoder):com.parse.ParseObject$State$Init");
    }

    @Override // com.parse.ParseObjectCoder
    public <T extends ParseObject.State> JSONObject encode(T t, ParseOperationSet parseOperationSet, ParseEncoder parseEncoder) throws JSONException {
        if (parseOperationSet != null) {
            throw new IllegalArgumentException("Parameter ParseOperationSet is not null");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (String str : t.keySet()) {
                jSONObject2.put(str, parseEncoder.encode(t.get(str)));
            }
            if (t.createdAt() > 0) {
                jSONObject2.put("createdAt", ParseDateFormat.getInstance().format(new Date(t.createdAt())));
            }
            if (t.updatedAt() > 0) {
                jSONObject2.put("updatedAt", ParseDateFormat.getInstance().format(new Date(t.updatedAt())));
            }
            if (t.objectId() != null) {
                jSONObject2.put("objectId", t.objectId());
            }
            jSONObject.put("data", jSONObject2);
            jSONObject.put("classname", t.className());
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("could not serialize object to JSON");
        }
    }
}
