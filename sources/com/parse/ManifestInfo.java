package com.parse;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ManifestInfo {
    private static final Object lock = new Object();
    static int versionCode = -1;
    static String versionName;

    private static Context getContext() {
        return Parse.getApplicationContext();
    }

    public static List<ResolveInfo> getIntentReceivers(String... strArr) {
        Context context = getContext();
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.addAll(packageManager.queryBroadcastReceivers(new Intent(str), 32));
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((ResolveInfo) arrayList.get(size)).activityInfo.packageName.equals(packageName)) {
                arrayList.remove(size);
            }
        }
        return arrayList;
    }

    private static PackageManager getPackageManager() {
        return getContext().getPackageManager();
    }

    public static int getVersionCode() {
        synchronized (lock) {
            if (versionCode == -1) {
                try {
                    versionCode = getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e) {
                    PLog.e("com.parse.ManifestInfo", "Couldn't find info about own package", e);
                }
            }
        }
        return versionCode;
    }

    public static String getVersionName() {
        synchronized (lock) {
            if (versionName == null) {
                try {
                    versionName = getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    PLog.e("com.parse.ManifestInfo", "Couldn't find info about own package", e);
                    versionName = "unknown";
                }
                if (versionName == null) {
                    versionName = "unknown";
                }
            }
        }
        return versionName;
    }
}
