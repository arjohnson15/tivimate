package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.File;
import java.io.Serializable;
import p007.ExecutorC0955;
import p404.AbstractC4630;
import ـˈ.ˎـ;
import ᵢ.ʿʼ;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC4630.m10531(context, new ExecutorC0955(1), new ʿʼ(10, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                ʿʼ r7 = new ʿʼ(10, this);
                try {
                    AbstractC4630.m10516(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    r7.ʿʼ(10, (Serializable) null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    r7.ʿʼ(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            ʿʼ r6 = new ʿʼ(10, this);
            if (Build.VERSION.SDK_INT < 24) {
                r6.ʿʼ(13, (Serializable) null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                r6.ʿʼ(12, (Serializable) null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        ʿʼ r0 = new ʿʼ(10, this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            r0.ʿʼ(16, (Serializable) null);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (AbstractC4630.m10525(i >= 24 ? ˎـ.ˑʽ(context).getCodeCacheDir() : i >= 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
            r0.ʿʼ(14, (Serializable) null);
        } else {
            r0.ʿʼ(15, (Serializable) null);
        }
    }
}
