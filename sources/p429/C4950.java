package p429;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import java.util.Iterator;
import p043.C1294;
import p210.C2804;
import p238.AbstractC3095;
import ʾי.ˑʽ;

/* renamed from: ﹶˎ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4950 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final ˑʽ f18724;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C4950 f18725 = new C4950();

    static {
        C1294 c1294 = new C1294();
        c1294.m4593(C4972.class, C4971.f18798);
        c1294.m4593(C4946.class, C4962.f18760);
        c1294.m4593(C4952.class, C4947.f18716);
        c1294.m4593(C4945.class, C4985.f18829);
        c1294.m4593(C4969.class, C4963.f18767);
        c1294.m4593(C4976.class, C4970.f18794);
        c1294.f5315 = true;
        f18724 = new ˑʽ(13, c1294);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C4945 m11070(C2804 c2804) {
        Object next;
        String strM7613;
        c2804.m7085();
        Context context = c2804.f10936;
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        c2804.m7085();
        String str = c2804.f10935.f10918;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        String str4 = packageInfo.versionName;
        String str5 = str4 == null ? strValueOf : str4;
        String str6 = Build.MANUFACTURER;
        c2804.m7085();
        int iMyPid = Process.myPid();
        Iterator it = AbstractC4967.m11074(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C4976) next).f18807 == iMyPid) {
                break;
            }
        }
        C4976 c4976 = (C4976) next;
        if (c4976 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                strM7613 = Process.myProcessName();
            } else if ((i < 28 || (strM7613 = Application.getProcessName()) == null) && (strM7613 = AbstractC3095.m7613()) == null) {
                strM7613 = "";
            }
            c4976 = new C4976(iMyPid, 0, strM7613, false);
        }
        c2804.m7085();
        return new C4945(str, str2, str3, new C4969(packageName, str5, strValueOf, str6, c4976, AbstractC4967.m11074(context)));
    }
}
