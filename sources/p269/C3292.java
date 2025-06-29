package p269;

import android.os.Build;
import p023.C1150;
import p279.AbstractC3370;
import p331.C3768;

/* renamed from: ـˑ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3292 extends AbstractC3288 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ int f12825;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3292(AbstractC3370 abstractC3370, int i) {
        super(abstractC3370);
        this.f12825 = i;
    }

    @Override // p269.InterfaceC3287
    /* renamed from: ʽᐧ */
    public final boolean mo4160(C3768 c3768) {
        switch (this.f12825) {
            case 0:
                return c3768.f14565.f20801;
            case 1:
                return c3768.f14565.f20799;
            case 2:
                return c3768.f14565.f20802 == 2;
            case 3:
                int i = c3768.f14565.f20802;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return c3768.f14565.f20803;
        }
    }

    @Override // p269.AbstractC3288
    /* renamed from: ʿʼ */
    public final boolean mo8101(Object obj) {
        switch (this.f12825) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                C1150 c1150 = (C1150) obj;
                int i = Build.VERSION.SDK_INT;
                boolean z = c1150.f4797;
                if (i >= 26) {
                    if (!z || !c1150.f4795) {
                        return true;
                    }
                } else if (!z) {
                    return true;
                }
                return false;
            case 3:
                C1150 c11502 = (C1150) obj;
                return !c11502.f4797 || c11502.f4796;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }

    @Override // p269.AbstractC3288
    /* renamed from: ﹳﹳ */
    public final int mo8102() {
        switch (this.f12825) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 7;
            default:
                return 9;
        }
    }
}
