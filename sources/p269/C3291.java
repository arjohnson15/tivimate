package p269;

import android.os.Build;
import p023.C1150;
import p331.C3768;
import p457.C5391;

/* renamed from: ـˑ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3291 extends AbstractC3288 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String f12824 = C5391.m12164("NetworkNotRoamingCtrlr");

    @Override // p269.InterfaceC3287
    /* renamed from: ʽᐧ */
    public final boolean mo4160(C3768 c3768) {
        return c3768.f14565.f20802 == 4;
    }

    @Override // p269.AbstractC3288
    /* renamed from: ʿʼ */
    public final boolean mo8101(Object obj) {
        C1150 c1150 = (C1150) obj;
        int i = Build.VERSION.SDK_INT;
        boolean z = c1150.f4797;
        if (i < 24) {
            C5391.m12163().m12168(f12824, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            if (z) {
                return false;
            }
        } else if (z && c1150.f4798) {
            return false;
        }
        return true;
    }

    @Override // p269.AbstractC3288
    /* renamed from: ﹳﹳ */
    public final int mo8102() {
        return 7;
    }
}
