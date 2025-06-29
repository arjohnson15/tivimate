package p147;

import p069.C1541;
import p251.C3136;

/* renamed from: ˊ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2248 implements InterfaceC2249 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3136 f8950;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2255 f8951;

    public C2248(C2255 c2255, C3136 c3136) {
        this.f8951 = c2255;
        this.f8950 = c3136;
    }

    @Override // p147.InterfaceC2249
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo6239(Exception exc) {
        this.f8950.m7703(exc);
        return true;
    }

    @Override // p147.InterfaceC2249
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean mo6240(C1541 c1541) {
        if (c1541.f6260 != 4 || this.f8951.m6255(c1541)) {
            return false;
        }
        String str = c1541.f6262;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f8950.f12093.m7688(new C2251(c1541.f6261, c1541.f6264, str));
        return true;
    }
}
