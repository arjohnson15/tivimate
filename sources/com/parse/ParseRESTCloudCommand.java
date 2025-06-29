package com.parse;

import com.parse.http.ParseHttpRequest;
import java.util.Map;

/* loaded from: classes.dex */
class ParseRESTCloudCommand extends ParseRESTCommand {
    private ParseRESTCloudCommand(String str, ParseHttpRequest.Method method, Map<String, ?> map, String str2) {
        super(str, method, map, str2);
    }

    public static ParseRESTCloudCommand callFunctionCommand(String str, Map<String, ?> map, String str2) {
        return new ParseRESTCloudCommand(ᵎﹳ.ᐧʻ.ﾞˊ("functions/", str), ParseHttpRequest.Method.POST, map, str2);
    }
}
