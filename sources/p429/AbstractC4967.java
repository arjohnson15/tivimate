package p429;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013.AbstractC1039;
import p013.AbstractC1041;
import p013.C1053;
import p070.AbstractC1549;
import p077.C1673;

/* renamed from: ﹶˎ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4967 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1673 f18777 = new C1673("session_id");

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static ArrayList m11074(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            arrayList2.add(new C4976(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, AbstractC1549.m5138(str2, str)));
        }
        return arrayList2;
    }
}
