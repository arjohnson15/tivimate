package com.parse;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class ParseJSONUtils {
    public static JSONObject create(JSONObject jSONObject, Collection<String> collection) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!collection.contains(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return jSONObject2;
    }

    public static int getInt(JSONObject jSONObject, List<String> list) throws JSONException {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                return jSONObject.getInt(it.next());
            } catch (JSONException unused) {
            }
        }
        throw new JSONException("No value for " + list);
    }

    public static Iterable<String> keys(final JSONObject jSONObject) {
        Objects.requireNonNull(jSONObject);
        return new Iterable() { // from class: com.parse.ʿˊ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return jSONObject.keys();
            }
        };
    }
}
