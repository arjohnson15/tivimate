package p374;

import p312.C3589;
import p456.C5349;

/* renamed from: ᵢˎ.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4288 implements InterfaceC4254 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f16685;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4254 f16686;

    public C4288(InterfaceC4254 interfaceC4254, long j) {
        this.f16686 = interfaceC4254;
        this.f16685 = j;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ʿʼ */
    public final int mo4054(C5349 c5349, C3589 c3589, int i) {
        int iMo4054 = this.f16686.mo4054(c5349, c3589, i);
        if (iMo4054 == -4) {
            c3589.f13807 += this.f16685;
        }
        return iMo4054;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ˏʾ */
    public final boolean mo4058() {
        return this.f16686.mo4058();
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ـﹶ */
    public final void mo4062() {
        this.f16686.mo4062();
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ᵎـ */
    public final int mo4066(long j) {
        return this.f16686.mo4066(j - this.f16685);
    }
}
