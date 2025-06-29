package androidx.lifecycle;

/* renamed from: androidx.lifecycle.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0214 extends AbstractC0226 implements InterfaceC0213 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final InterfaceC0262 f1225;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0244 f1226;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214(AbstractC0244 abstractC0244, InterfaceC0262 interfaceC0262, InterfaceC0221 interfaceC0221) {
        super(abstractC0244, interfaceC0221);
        this.f1226 = abstractC0244;
        this.f1225 = interfaceC0262;
    }

    @Override // androidx.lifecycle.AbstractC0226
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean mo1008(InterfaceC0262 interfaceC0262) {
        return this.f1225 == interfaceC0262;
    }

    @Override // androidx.lifecycle.InterfaceC0213
    /* renamed from: ـﹶ */
    public final void mo607(InterfaceC0262 interfaceC0262, EnumC0247 enumC0247) {
        InterfaceC0262 interfaceC02622 = this.f1225;
        EnumC0230 enumC0230 = ((C0236) interfaceC02622.getLifecycle()).f1275;
        if (enumC0230 == EnumC0230.f1254) {
            this.f1226.m1043(this.f1247);
            return;
        }
        EnumC0230 enumC02302 = null;
        while (enumC02302 != enumC0230) {
            m1028(mo1009());
            enumC02302 = enumC0230;
            enumC0230 = ((C0236) interfaceC02622.getLifecycle()).f1275;
        }
    }

    @Override // androidx.lifecycle.AbstractC0226
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean mo1009() {
        return ((C0236) this.f1225.getLifecycle()).f1275.m1030(EnumC0230.f1253);
    }

    @Override // androidx.lifecycle.AbstractC0226
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo1010() {
        this.f1225.getLifecycle().mo1031(this);
    }
}
