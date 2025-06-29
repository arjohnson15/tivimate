package com.parse;

import com.parse.ParseQuery;
import com.parse.http.ParseHttpRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseRESTQueryCommand extends ParseRESTCommand {
    private ParseRESTQueryCommand(String str, ParseHttpRequest.Method method, Map<String, ?> map, String str2) {
        super(str, method, map, str2);
    }

    public static <T extends ParseObject> Map<String, String> encode(ParseQuery.State<T> state, boolean z) {
        PointerEncoder pointerEncoder = PointerEncoder.get();
        HashMap map = new HashMap();
        List<String> listOrder = state.order();
        if (!listOrder.isEmpty()) {
            map.put("order", ParseTextUtils.join(",", listOrder));
        }
        ParseQuery.QueryConstraints queryConstraintsConstraints = state.constraints();
        if (!queryConstraintsConstraints.isEmpty()) {
            map.put("where", ((JSONObject) pointerEncoder.encode(queryConstraintsConstraints)).toString());
        }
        Set<String> setSelectedKeys = state.selectedKeys();
        if (setSelectedKeys != null) {
            map.put("keys", ParseTextUtils.join(",", setSelectedKeys));
        }
        Set<String> setIncludes = state.includes();
        if (!setIncludes.isEmpty()) {
            map.put("include", ParseTextUtils.join(",", setIncludes));
        }
        int iLimit = state.limit();
        if (iLimit >= 0) {
            map.put("limit", Integer.toString(iLimit));
        }
        if (z) {
            map.put("count", Integer.toString(1));
        } else {
            int iSkip = state.skip();
            if (iSkip > 0) {
                map.put("skip", Integer.toString(iSkip));
            }
        }
        for (Map.Entry<String, Object> entry : state.extraOptions().entrySet()) {
            map.put(entry.getKey(), pointerEncoder.encode(entry.getValue()).toString());
        }
        if (state.isTracingEnabled()) {
            map.put("trace", Integer.toString(1));
        }
        return map;
    }

    public static <T extends ParseObject> ParseRESTQueryCommand findCommand(ParseQuery.State<T> state, String str) {
        return new ParseRESTQueryCommand(ᵎﹳ.ᐧʻ.ﾞˊ("classes/", state.className()), ParseHttpRequest.Method.GET, encode(state, false), str);
    }
}
