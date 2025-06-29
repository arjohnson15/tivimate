package p406;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p070.AbstractC1549;
import p457.C5391;
import ﾞﹶ.ᵢʿ;

/* renamed from: ﹳʿ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4662 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f17792 = C5391.m12164("ProcessUtils");

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final boolean m10567(Context context) {
        String strM10563;
        Object next;
        Object objInvoke;
        if (Build.VERSION.SDK_INT >= 28) {
            strM10563 = C4659.f17786.m10563();
        } else {
            strM10563 = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, ᵢʿ.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
            } catch (Throwable th) {
                C5391.m12163().m12165(f17792, "Unable to check ActivityThread for processName", th);
            }
            if (objInvoke instanceof String) {
                strM10563 = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        strM10563 = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        return AbstractC1549.m5138(strM10563, context.getApplicationInfo().processName);
    }
}
