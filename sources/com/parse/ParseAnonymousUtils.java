package com.parse;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class ParseAnonymousUtils {
    public static Map<String, String> getAuthData() {
        HashMap map = new HashMap();
        map.put("id", UUID.randomUUID().toString());
        return map;
    }

    public static boolean isLinked(ParseUser parseUser) {
        return parseUser.isLinked("anonymous");
    }
}
