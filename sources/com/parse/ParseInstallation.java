package com.parse;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.parse.ParseObject;
import com.parse.boltsinternal.Task;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

@ParseClassName("_Installation")
/* loaded from: classes.dex */
public class ParseInstallation extends ParseObject {
    private static final List<String> READ_ONLY_FIELDS = DesugarCollections.unmodifiableList(Arrays.asList("deviceType", "installationId", "deviceToken", "pushType", "timeZone", "localeIdentifier", "appVersion", "appName", "parseVersion", "appIdentifier", "objectId"));

    public static ParseCurrentInstallationController getCurrentInstallationController() {
        return ParseCorePlugins.getInstance().getCurrentInstallationController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$handleSaveResultAsync$2(Task task) {
        return getCurrentInstallationController().setAsync(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$saveAsync$1(String str, Task task, Task task2) {
        int code;
        Task taskLambda$saveAsync$33;
        if (task2.getError() == null || !(task2.getError() instanceof ParseException) || ((code = ((ParseException) task2.getError()).getCode()) != 101 && (code != 135 || getObjectId() != null))) {
            return task2;
        }
        synchronized (this.mutex) {
            setState(new ParseObject.State.Builder(getState()).objectId(null).build());
            markAllFieldsDirty();
            taskLambda$saveAsync$33 = super.lambda$saveAsync$33(str, task);
        }
        return taskLambda$saveAsync$33;
    }

    private void updateLocaleIdentifier() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (TextUtils.isEmpty(language)) {
            return;
        }
        if (language.equals("iw")) {
            language = "he";
        }
        if (language.equals("in")) {
            language = "id";
        }
        if (language.equals("ji")) {
            language = "yi";
        }
        if (!TextUtils.isEmpty(country)) {
            Locale locale2 = Locale.US;
            language = ᵎﹳ.ᐧʻ.ˋⁱ(language, "-", country);
        }
        if (language.equals(get("localeIdentifier"))) {
            return;
        }
        performPut("localeIdentifier", language);
    }

    private void updateTimezone() {
        String id = TimeZone.getDefault().getID();
        if ((id.indexOf(47) > 0 || id.equals("GMT")) && !id.equals(get("timeZone"))) {
            performPut("timeZone", id);
        }
    }

    private void updateVersionInfo() {
        synchronized (this.mutex) {
            try {
                try {
                    Context applicationContext = Parse.getApplicationContext();
                    String packageName = applicationContext.getPackageName();
                    PackageManager packageManager = applicationContext.getPackageManager();
                    String strValueOf = String.valueOf(packageManager.getPackageInfo(packageName, 0).versionCode);
                    String string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString();
                    if (packageName != null && !packageName.equals(get("appIdentifier"))) {
                        performPut("appIdentifier", packageName);
                    }
                    if (string != null && !string.equals(get("appName"))) {
                        performPut("appName", string);
                    }
                    if (strValueOf != null && !strValueOf.equals(get("appVersion"))) {
                        performPut("appVersion", strValueOf);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    PLog.w("com.parse.ParseInstallation", "Cannot load package info; will not be saved to installation");
                }
                performPut("parseVersion", "unspecified");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getInstallationId() {
        return getString("installationId");
    }

    @Override // com.parse.ParseObject
    public Task<Void> handleSaveResultAsync(ParseObject.State state, ParseOperationSet parseOperationSet) {
        Task<Void> taskHandleSaveResultAsync = super.handleSaveResultAsync(state, parseOperationSet);
        return state == null ? taskHandleSaveResultAsync : taskHandleSaveResultAsync.onSuccessTask(new C0798(7, this));
    }

    @Override // com.parse.ParseObject
    public boolean isKeyMutable(String str) {
        return !READ_ONLY_FIELDS.contains(str);
    }

    @Override // com.parse.ParseObject
    public boolean needsDefaultACL() {
        return false;
    }

    @Override // com.parse.ParseObject
    /* renamed from: saveAsync */
    public Task<Void> lambda$saveAsync$33(String str, Task<Void> task) {
        return super.lambda$saveAsync$33(str, task).continueWithTask(new C0813(this, str, task, 17));
    }

    @Override // com.parse.ParseObject
    public void updateBeforeSave() {
        super.updateBeforeSave();
        if (getCurrentInstallationController().isCurrent(this)) {
            updateTimezone();
            updateVersionInfo();
            updateDeviceInfo();
            updateLocaleIdentifier();
        }
    }

    public void updateDeviceInfo() {
        updateDeviceInfo(ParsePlugins.get().installationId());
    }

    public void updateDeviceInfo(InstallationId installationId) {
        if (!has("installationId")) {
            performPut("installationId", installationId.get());
        }
        if ("android".equals(get("deviceType"))) {
            return;
        }
        performPut("deviceType", "android");
    }
}
