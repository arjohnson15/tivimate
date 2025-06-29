package p041;

import android.view.ViewGroup;
import androidx.fragment.app.C0107;
import p061.AbstractC1420;
import p065.C1509;
import p065.C1514;
import p070.AbstractC1547;
import p262.InterfaceC3253;
import p262.InterfaceC3254;
import p262.InterfaceC3255;
import p288.C3397;
import p331.C3761;
import p338.InterfaceC3865;
import p430.C5000;
import p430.C5009;
import p430.C5010;
import ﹶⁱ.ـﹶ;

/* renamed from: ʽˉ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1275 extends AbstractC1547 implements InterfaceC3865 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f5236;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ Object f5237;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f5238;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Object f5239;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1275(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.f5236 = i;
        this.f5238 = obj;
        this.f5239 = obj2;
        this.f5237 = obj3;
    }

    @Override // p338.InterfaceC3865
    /* renamed from: ـﹶ */
    public final Object mo1053() {
        switch (this.f5236) {
            case 0:
                return ((C5010) this.f5238).f19012.ʽᐧ(((C5009) this.f5237).f19004.f18961, ((C5000) this.f5239).m11088());
            case 1:
                C1514 c1514 = (C1514) this.f5238;
                if (c1514.f6167) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                InterfaceC3255 interfaceC3255Mo8011 = ((InterfaceC3253) ((C3761) this.f5239).f14527).mo8011((String) this.f5237);
                if (c1514.f6164) {
                    if (((C1509) c1514.f6171).f6141 == 3) {
                        ـﹶ.ﹳˎ(interfaceC3255Mo8011, "PRAGMA synchronous = NORMAL");
                    } else {
                        ـﹶ.ﹳˎ(interfaceC3255Mo8011, "PRAGMA synchronous = FULL");
                    }
                    InterfaceC3254 interfaceC3254Mo6108 = interfaceC3255Mo8011.mo6108("PRAGMA busy_timeout");
                    try {
                        interfaceC3254Mo6108.mo6098();
                        long jMo6095 = interfaceC3254Mo6108.mo6095(0);
                        interfaceC3254Mo6108.close();
                        if (jMo6095 < 3000) {
                            ـﹶ.ﹳˎ(interfaceC3255Mo8011, "PRAGMA busy_timeout = 3000");
                        }
                        ((AbstractC1420) c1514.f6165).mo4920(interfaceC3255Mo8011);
                    } catch (Throwable th) {
                        interfaceC3254Mo6108.close();
                        throw th;
                    }
                } else {
                    try {
                        c1514.f6167 = true;
                        C1514.m5092(c1514, interfaceC3255Mo8011);
                    } finally {
                        c1514.f6167 = false;
                    }
                }
                return interfaceC3255Mo8011;
            default:
                ((C0107) this.f5238).f667.mo6045((ViewGroup) this.f5239, this.f5237);
                return C3397.f13249;
        }
    }
}
