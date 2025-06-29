package p072;

import p148.AbstractC2269;
import p148.C2274;
import p288.C3395;
import p330.C3753;
import p330.InterfaceC3746;
import p330.InterfaceC3747;

/* renamed from: ʿʽ.ⁱⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1635 extends C2274 {
    private volatile boolean threadLocalIsSet;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final ThreadLocal f6411;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1635(InterfaceC3746 interfaceC3746, InterfaceC3747 interfaceC3747) {
        C1645 c1645 = C1645.f6427;
        super(interfaceC3746, interfaceC3747.mo3966(c1645) == null ? interfaceC3747.mo3967(c1645) : interfaceC3747);
        this.f6411 = new ThreadLocal();
        if (interfaceC3746.mo3963().mo3966(C3753.f14515) instanceof AbstractC1636) {
            return;
        }
        Object objM6280 = AbstractC2269.m6280(interfaceC3747, null);
        AbstractC2269.m6288(interfaceC3747, objM6280);
        m5273(interfaceC3747, objM6280);
    }

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public final void m5273(InterfaceC3747 interfaceC3747, Object obj) {
        this.threadLocalIsSet = true;
        this.f6411.set(new C3395(interfaceC3747, obj));
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final boolean m5274() {
        boolean z = this.threadLocalIsSet && this.f6411.get() == null;
        this.f6411.remove();
        return !z;
    }

    @Override // p148.C2274, p072.C1634
    /* renamed from: ﹳˎ */
    public final void mo5177(Object obj) {
        if (this.threadLocalIsSet) {
            C3395 c3395 = (C3395) this.f6411.get();
            if (c3395 != null) {
                AbstractC2269.m6288((InterfaceC3747) c3395.f13245, c3395.f13244);
            }
            this.f6411.remove();
        }
        Object objM5289 = AbstractC1642.m5289(obj);
        InterfaceC3746 interfaceC3746 = this.f9019;
        InterfaceC3747 interfaceC3747Mo3963 = interfaceC3746.mo3963();
        Object objM6280 = AbstractC2269.m6280(interfaceC3747Mo3963, null);
        C1635 c1635M5306 = objM6280 != AbstractC2269.f9006 ? AbstractC1642.m5306(interfaceC3746, interfaceC3747Mo3963, objM6280) : null;
        try {
            this.f9019.mo3974(objM5289);
        } finally {
            if (c1635M5306 == null || c1635M5306.m5274()) {
                AbstractC2269.m6288(interfaceC3747Mo3963, objM6280);
            }
        }
    }
}
