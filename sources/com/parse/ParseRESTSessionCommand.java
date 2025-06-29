package com.parse;

import com.parse.http.ParseHttpRequest;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseRESTSessionCommand extends ParseRESTCommand {
    private ParseRESTSessionCommand(String str, ParseHttpRequest.Method method, JSONObject jSONObject, String str2) {
        super(str, method, jSONObject, str2);
    }

    public static ParseRESTSessionCommand revoke(String str) {
        return new ParseRESTSessionCommand("logout", ParseHttpRequest.Method.POST, new JSONObject(), str);
    }
}
