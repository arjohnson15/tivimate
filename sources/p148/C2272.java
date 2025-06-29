package p148;

import p072.AbstractC1610;
import p072.AbstractC1636;
import p072.C1602;
import p072.InterfaceC1621;
import p072.InterfaceC1639;
import p072.RunnableC1625;
import p330.InterfaceC3747;

/* renamed from: ˊʻ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2272 extends AbstractC1636 implements InterfaceC1621 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1621 f9015;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final AbstractC1636 f9016;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f9017;

    /* JADX WARN: Multi-variable type inference failed */
    public C2272(AbstractC1636 abstractC1636, String str) {
        InterfaceC1621 interfaceC1621 = abstractC1636 instanceof InterfaceC1621 ? (InterfaceC1621) abstractC1636 : null;
        this.f9015 = interfaceC1621 == null ? AbstractC1610.f6388 : interfaceC1621;
        this.f9016 = abstractC1636;
        this.f9017 = str;
    }

    @Override // p072.AbstractC1636
    public final String toString() {
        return this.f9017;
    }

    @Override // p072.AbstractC1636
    /* renamed from: ʽˆ */
    public final void mo5275(InterfaceC3747 interfaceC3747, Runnable runnable) {
        this.f9016.mo5275(interfaceC3747, runnable);
    }

    @Override // p072.InterfaceC1621
    /* renamed from: ʿʼ */
    public final void mo5197(long j, C1602 c1602) {
        this.f9015.mo5197(j, c1602);
    }

    @Override // p072.AbstractC1636
    /* renamed from: ˈﹳ */
    public final void mo5198(InterfaceC3747 interfaceC3747, Runnable runnable) {
        this.f9016.mo5198(interfaceC3747, runnable);
    }

    @Override // p072.AbstractC1636
    /* renamed from: ٴᐧ */
    public final boolean mo5276(InterfaceC3747 interfaceC3747) {
        return this.f9016.mo5276(interfaceC3747);
    }

    @Override // p072.InterfaceC1621
    /* renamed from: ᵎـ */
    public final InterfaceC1639 mo5200(long j, RunnableC1625 runnableC1625, InterfaceC3747 interfaceC3747) {
        return this.f9015.mo5200(j, runnableC1625, interfaceC3747);
    }
}
