package p374;

import p166.C2417;
import p166.C2431;
import p312.C3589;
import p456.C5349;

/* renamed from: ᵢˎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4242 implements InterfaceC4254 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f16467;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C4266 f16468;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4254 f16469;

    public C4242(C4266 c4266, InterfaceC4254 interfaceC4254) {
        this.f16468 = c4266;
        this.f16469 = interfaceC4254;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ʿʼ */
    public final int mo4054(C5349 c5349, C3589 c3589, int i) {
        C4266 c4266 = this.f16468;
        if (c4266.m9728()) {
            return -3;
        }
        if (this.f16467) {
            c3589.f5033 = 4;
            return -4;
        }
        long jMo6165 = c4266.mo6165();
        int iMo4054 = this.f16469.mo4054(c5349, c3589, i);
        if (iMo4054 != -5) {
            long j = c4266.f16574;
            if (j == Long.MIN_VALUE || ((iMo4054 != -4 || c3589.f13807 < j) && !(iMo4054 == -3 && jMo6165 == Long.MIN_VALUE && !c3589.f13806))) {
                return iMo4054;
            }
            c3589.mo8492();
            c3589.f5033 = 4;
            this.f16467 = true;
            return -4;
        }
        C2431 c2431 = (C2431) c5349.f20757;
        c2431.getClass();
        int i2 = c2431.f9680;
        int i3 = c2431.f9668;
        if (i3 != 0 || i2 != 0) {
            if (c4266.f16570 != 0) {
                i3 = 0;
            }
            if (c4266.f16574 != Long.MIN_VALUE) {
                i2 = 0;
            }
            C2417 c2417M6541 = c2431.m6541();
            c2417M6541.f9598 = i3;
            c2417M6541.f9606 = i2;
            c5349.f20757 = new C2431(c2417M6541);
        }
        return -5;
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ˏʾ */
    public final boolean mo4058() {
        return !this.f16468.m9728() && this.f16469.mo4058();
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ـﹶ */
    public final void mo4062() {
        this.f16469.mo4062();
    }

    @Override // p374.InterfaceC4254
    /* renamed from: ᵎـ */
    public final int mo4066(long j) {
        if (this.f16468.m9728()) {
            return -3;
        }
        return this.f16469.mo4066(j);
    }
}
