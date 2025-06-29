package p248;

import p134.C2085;
import p256.AbstractC3190;
import p424.C4894;

/* renamed from: יˆ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3121 extends AbstractC3190 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Object f12046;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ int f12047 = 0;

    public C3121(C2085 c2085, int i) {
        super(i, c2085.f8217 - 1);
        this.f12046 = c2085;
    }

    public C3121(C4894 c4894, long j, long j2) {
        super(j, j2);
        this.f12046 = c4894;
    }

    @Override // p256.InterfaceC3194
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final long mo7665() {
        switch (this.f12047) {
            case 0:
                m7890();
                return ((C2085) this.f12046).f8218[(int) this.f12388];
            default:
                m7890();
                return ((C4894) this.f12046).m11013(this.f12388);
        }
    }

    @Override // p256.InterfaceC3194
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long mo7666() {
        switch (this.f12047) {
            case 0:
                return ((C2085) this.f12046).m5918((int) this.f12388) + mo7665();
            default:
                m7890();
                return ((C4894) this.f12046).m11009(this.f12388);
        }
    }
}
