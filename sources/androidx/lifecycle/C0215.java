package androidx.lifecycle;

/* renamed from: androidx.lifecycle.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0215 implements InterfaceC0221 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC0221 f1227;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f1228 = -1;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0244 f1229;

    public C0215(AbstractC0244 abstractC0244, InterfaceC0221 interfaceC0221) {
        this.f1229 = abstractC0244;
        this.f1227 = interfaceC0221;
    }

    @Override // androidx.lifecycle.InterfaceC0221
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo1011(Object obj) {
        int i = this.f1228;
        int i2 = this.f1229.f1293;
        if (i != i2) {
            this.f1228 = i2;
            this.f1227.mo1011(obj);
        }
    }
}
