package p072;

/* renamed from: ʿʽ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1638 implements InterfaceC1640 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1605[] f6412;

    public C1638(C1605[] c1605Arr) {
        this.f6412 = c1605Arr;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f6412 + ']';
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5279() {
        for (C1605 c1605 : this.f6412) {
            InterfaceC1639 interfaceC1639 = c1605.f6378;
            if (interfaceC1639 == null) {
                interfaceC1639 = null;
            }
            interfaceC1639.mo5179();
        }
    }

    @Override // p072.InterfaceC1640
    /* renamed from: ـﹶ */
    public final void mo5221(Throwable th) {
        m5279();
    }
}
