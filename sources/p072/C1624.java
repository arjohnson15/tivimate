package p072;

import p330.InterfaceC3746;

/* renamed from: ʿʽ.ᵎʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1624 extends C1602 {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C1634 f6399;

    public C1624(InterfaceC3746 interfaceC3746, C1634 c1634) {
        super(1, interfaceC3746);
        this.f6399 = c1634;
    }

    @Override // p072.C1602
    /* renamed from: ᐧⁱ */
    public final String mo5212() {
        return "AwaitContinuation";
    }

    @Override // p072.C1602
    /* renamed from: ﹳˎ */
    public final Throwable mo5217(C1634 c1634) {
        Throwable thM5184;
        C1634 c16342 = this.f6399;
        c16342.getClass();
        Object obj = C1634.f6410.get(c16342);
        return (!(obj instanceof C1590) || (thM5184 = ((C1590) obj).m5184()) == null) ? obj instanceof C1626 ? ((C1626) obj).f6402 : c1634.mo5169() : thM5184;
    }
}
