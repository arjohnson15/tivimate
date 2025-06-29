package p256;

import p166.C2431;
import p166.InterfaceC2442;
import p254.C3156;
import p254.C3175;
import p254.InterfaceC3178;
import p383.AbstractC4470;
import p383.C4457;
import ˆʽ.ᵎˏ;

/* renamed from: יᴵ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3197 implements InterfaceC3178 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2431 f12434;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public InterfaceC3178 f12435;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3175 f12436 = new C3175();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f12437;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f12438;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C2431 f12439;

    public C3197(int i, int i2, C2431 c2431) {
        this.f12437 = i2;
        this.f12434 = c2431;
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ʽᐧ */
    public final int mo7839(InterfaceC2442 interfaceC2442, int i, boolean z) {
        InterfaceC3178 interfaceC3178 = this.f12435;
        int i2 = AbstractC4470.f17202;
        return interfaceC3178.mo7843(interfaceC2442, i, z);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ʿʼ */
    public final void mo7840(C2431 c2431) {
        C2431 c24312 = this.f12434;
        if (c24312 != null) {
            c2431 = c2431.m6542(c24312);
        }
        this.f12439 = c2431;
        InterfaceC3178 interfaceC3178 = this.f12435;
        int i = AbstractC4470.f17202;
        interfaceC3178.mo7840(c2431);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ˑʽ */
    public final /* synthetic */ void mo7841(int i, C4457 c4457) {
        ᵎˏ.ـﹶ(this, c4457, i);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ـﹶ */
    public final void mo7842(long j, int i, int i2, int i3, C3156 c3156) {
        long j2 = this.f12438;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f12435 = this.f12436;
        }
        InterfaceC3178 interfaceC3178 = this.f12435;
        int i4 = AbstractC4470.f17202;
        interfaceC3178.mo7842(j, i, i2, i3, c3156);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ٴˎ */
    public final int mo7843(InterfaceC2442 interfaceC2442, int i, boolean z) {
        return mo7839(interfaceC2442, i, z);
    }

    @Override // p254.InterfaceC3178
    /* renamed from: ﹳﹳ */
    public final void mo7844(C4457 c4457, int i, int i2) {
        InterfaceC3178 interfaceC3178 = this.f12435;
        int i3 = AbstractC4470.f17202;
        interfaceC3178.mo7841(i, c4457);
    }
}
