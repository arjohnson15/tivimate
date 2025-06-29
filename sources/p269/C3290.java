package p269;

import android.os.Build;
import p023.C1150;
import p331.C3768;
import p457.C5391;

/* renamed from: ـˑ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3290 extends AbstractC3288 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String f12823 = C5391.m12164("NetworkMeteredCtrlr");

    @Override // p269.InterfaceC3287
    /* renamed from: ʽᐧ */
    public final boolean mo4160(C3768 c3768) {
        return c3768.f14565.f20802 == 5;
    }

    @Override // p269.AbstractC3288
    /* renamed from: ʿʼ */
    public final boolean mo8101(Object obj) {
        C1150 c1150 = (C1150) obj;
        int i = Build.VERSION.SDK_INT;
        boolean z = c1150.f4797;
        if (i < 26) {
            C5391.m12163().m12168(f12823, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (z) {
                return false;
            }
        } else if (z && c1150.f4796) {
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
