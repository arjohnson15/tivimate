package com.parse;

import com.parse.boltsinternal.Task;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ParseCloud {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static String f3665;

    public static <T> Task<T> callFunctionInBackground(String str, Map<String, ?> map) {
        return (Task<T>) ParseUser.getCurrentSessionTokenAsync().onSuccessTask(new C0855(str, 16, map));
    }

    public static <T> void callFunctionInBackground(String str, Map<String, ?> map, FunctionCallback<T> functionCallback) {
        f3665 = (String) map.get("requestToken");
        ParseTaskUtils.callbackOnMainThreadAsync(callFunctionInBackground(str, map), functionCallback);
    }

    public static ParseCloudCodeController getCloudCodeController() {
        return ParseCorePlugins.getInstance().getCloudCodeController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$callFunctionInBackground$0(String str, Map map, Task task) {
        return getCloudCodeController().callFunctionInBackground(str, map, (String) task.getResult());
    }
}
