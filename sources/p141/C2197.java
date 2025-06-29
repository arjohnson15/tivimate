package p141;

import p076.C1659;
import p374.C4296;
import ـˈ.ˉᵎ;

/* renamed from: ˉˑ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2197 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1659 f8643;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f8644;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4296 f8645;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2211 f8646;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ C2210 f8647;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f8648;

    public C2197(C2210 c2210, C2194 c2194, int i, InterfaceC2201 interfaceC2201) {
        this.f8647 = c2210;
        this.f8643 = new C1659(ˉᵎ.ˉⁱ("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ", i));
        C4296 c4296 = new C4296(c2210.f8746, null, null);
        this.f8645 = c4296;
        this.f8646 = new C2211(c2210, c2194, i, c4296, interfaceC2201);
        c4296.f16722 = c2210.f8740;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6125() {
        this.f8643.m5334(this.f8646.f8756, this.f8647.f8740, 0);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6126() {
        if (this.f8648) {
            return;
        }
        this.f8646.f8756.f8682 = true;
        this.f8648 = true;
        C2210.m6159(this.f8647);
    }
}
