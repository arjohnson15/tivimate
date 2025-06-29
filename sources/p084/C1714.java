package p084;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013.AbstractC1039;
import p013.AbstractC1041;
import p013.C1053;
import p070.AbstractC1549;
import p122.AbstractC1907;
import p122.C1913;
import p122.C1963;

/* renamed from: ʿٴ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1714 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1714 f6685 = new C1714();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1714 f6684 = new C1714();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1913 m5433(C1714 c1714, String str, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        c1714.getClass();
        C1963 c1963 = new C1963();
        c1963.f7496 = str;
        c1963.f7493 = i;
        byte b = (byte) (c1963.f7494 | 1);
        c1963.f7495 = i2;
        c1963.f7497 = false;
        c1963.f7494 = (byte) (((byte) (b | 2)) | 4);
        return c1963.m5643();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static ArrayList m5434(Context context) {
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = C1053.f4449;
        }
        ArrayList arrayListM4015 = AbstractC1041.m4015(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM4015.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1039.m4012(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            C1963 c1963 = new C1963();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            c1963.f7496 = str2;
            c1963.f7493 = runningAppProcessInfo.pid;
            byte b = (byte) (c1963.f7494 | 1);
            c1963.f7495 = runningAppProcessInfo.importance;
            c1963.f7494 = (byte) (b | 2);
            c1963.f7497 = AbstractC1549.m5138(str2, str);
            c1963.f7494 = (byte) (c1963.f7494 | 4);
            arrayList2.add(c1963.m5643());
        }
        return arrayList2;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean m5435(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public AbstractC1907 m5436(Context context) {
        Object next;
        String processName;
        int iMyPid = Process.myPid();
        Iterator it = m5434(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C1913) ((AbstractC1907) next)).f7255 == iMyPid) {
                break;
            }
        }
        AbstractC1907 abstractC1907 = (AbstractC1907) next;
        if (abstractC1907 != null) {
            return abstractC1907;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            processName = Process.myProcessName();
        } else if (i < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        return m5433(this, processName, iMyPid, 0, 12);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m5437(String str) {
        if (m5435(3)) {
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m5438(String str) {
        if (m5435(2)) {
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m5439(String str, Exception exc) {
        if (m5435(5)) {
        }
    }
}
