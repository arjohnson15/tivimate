package com.parse;

import com.parse.ParseObject;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseObjectCoder {
    private static final ParseObjectCoder INSTANCE = new ParseObjectCoder();

    public static ParseObjectCoder get() {
        return INSTANCE;
    }

    public <T extends ParseObject.State.Init<?>> T decode(T t, JSONObject jSONObject, ParseDecoder parseDecoder) {
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!next.equals("__type") && !next.equals("className")) {
                    if (next.equals("objectId")) {
                        t.objectId(jSONObject.getString(next));
                    } else if (next.equals("createdAt")) {
                        t.createdAt(ParseDateFormat.getInstance().parse(jSONObject.getString(next)));
                    } else if (next.equals("updatedAt")) {
                        t.updatedAt(ParseDateFormat.getInstance().parse(jSONObject.getString(next)));
                    } else if (next.equals("ACL")) {
                        t.put("ACL", ParseACL.createACLFromJSONObject(jSONObject.getJSONObject(next), parseDecoder));
                    } else {
                        t.put(next, parseDecoder.decode(jSONObject.get(next)));
                    }
                }
            }
            return t;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public <T extends ParseObject.State> JSONObject encode(T t, ParseOperationSet parseOperationSet, ParseEncoder parseEncoder) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : parseOperationSet.keySet()) {
                jSONObject.put(str, parseEncoder.encode((ParseFieldOperation) parseOperationSet.get(str)));
            }
            if (t.objectId() != null) {
                jSONObject.put("objectId", t.objectId());
            }
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("could not serialize object to JSON");
        }
    }
}
