package com.parse;

import com.parse.boltsinternal.Task;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseCloudCodeController {
    final ParseHttpClient restClient;

    public ParseCloudCodeController(ParseHttpClient parseHttpClient) {
        this.restClient = parseHttpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$callFunctionInBackground$0(Task task) {
        return convertCloudResponse(task.getResult());
    }

    public <T> Task<T> callFunctionInBackground(String str, Map<String, ?> map, String str2) {
        return (Task<T>) ParseRESTCloudCommand.callFunctionCommand(str, map, str2).executeAsync(this.restClient).onSuccess(new C0798(3, this));
    }

    public Object convertCloudResponse(Object obj) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.isNull("result")) {
                return null;
            }
            obj = jSONObject.opt("result");
        }
        Object objDecode = ParseDecoder.get().decode(obj);
        return objDecode != null ? objDecode : obj;
    }
}
