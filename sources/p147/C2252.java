package p147;

import p069.C1541;
import p251.C3136;

/* renamed from: ˊ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2252 implements InterfaceC2249 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3136 f8968;

    public C2252(C3136 c3136) {
        this.f8968 = c3136;
    }

    @Override // p147.InterfaceC2249
    /* renamed from: ʽᐧ */
    public final boolean mo6239(Exception exc) {
        return false;
    }

    @Override // p147.InterfaceC2249
    /* renamed from: ـﹶ */
    public final boolean mo6240(C1541 c1541) {
        int i = c1541.f6260;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.f8968.m7702(c1541.f6263);
        return true;
    }
}
