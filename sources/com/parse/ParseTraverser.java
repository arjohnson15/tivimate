package com.parse;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class ParseTraverser {
    private boolean traverseParseObjects = false;
    private boolean yieldRoot = false;

    private void traverseInternal(Object obj, boolean z, IdentityHashMap<Object, Object> identityHashMap) {
        ParseUser unresolvedUser;
        HashSet hashSet;
        if (obj == null || identityHashMap.containsKey(obj)) {
            return;
        }
        if (!z || visit(obj)) {
            identityHashMap.put(obj, obj);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    try {
                        traverseInternal(jSONObject.get(itKeys.next()), true, identityHashMap);
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                }
                return;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        traverseInternal(jSONArray.get(i), true, identityHashMap);
                    } catch (JSONException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it = ((Map) obj).values().iterator();
                while (it.hasNext()) {
                    traverseInternal(it.next(), true, identityHashMap);
                }
                return;
            }
            if (obj instanceof List) {
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    traverseInternal(it2.next(), true, identityHashMap);
                }
                return;
            }
            if (!(obj instanceof ParseObject)) {
                if ((obj instanceof ParseACL) && (unresolvedUser = ((ParseACL) obj).getUnresolvedUser()) != null && unresolvedUser.isCurrentUser()) {
                    traverseInternal(unresolvedUser, true, identityHashMap);
                    return;
                }
                return;
            }
            if (this.traverseParseObjects) {
                ParseObject parseObject = (ParseObject) obj;
                synchronized (parseObject.mutex) {
                    hashSet = new HashSet(parseObject.keySet());
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    traverseInternal(parseObject.get((String) it3.next()), true, identityHashMap);
                }
            }
        }
    }

    public ParseTraverser setTraverseParseObjects(boolean z) {
        this.traverseParseObjects = z;
        return this;
    }

    public ParseTraverser setYieldRoot(boolean z) {
        this.yieldRoot = z;
        return this;
    }

    public void traverse(Object obj) {
        traverseInternal(obj, this.yieldRoot, new IdentityHashMap<>());
    }

    public abstract boolean visit(Object obj);
}
