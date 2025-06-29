package p175;

import java.util.Locale;
import p141.C2193;
import p141.C2217;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4470;
import p383.C4457;
import ˈי.ʾˈ;
import ـˈ.ˉᵎ;

/* renamed from: ˋˏ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2478 implements InterfaceC2486 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public InterfaceC3178 f9848;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2193 f9851;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long f9850 = -9223372036854775807L;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f9852 = 0;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f9849 = -1;

    public C2478(C2193 c2193) {
        this.f9851 = c2193;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ʽᐧ */
    public final void mo6599(long j) {
        this.f9850 = j;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ˑʽ */
    public final void mo6600(InterfaceC3177 interfaceC3177, int i) {
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(i, 1);
        this.f9848 = interfaceC3178Mo4851;
        interfaceC3178Mo4851.mo7840(this.f9851.f8622);
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ـﹶ */
    public final void mo6601(long j, long j2) {
        this.f9850 = j;
        this.f9852 = j2;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ﹳﹳ */
    public final void mo6602(C4457 c4457, long j, int i, boolean z) {
        int iM6189;
        this.f9848.getClass();
        int i2 = this.f9849;
        if (i2 != -1 && i != (iM6189 = C2217.m6189(i2))) {
            int i3 = AbstractC4470.f17202;
            Locale locale = Locale.US;
            ˉᵎ.ˋⁱ("Received RTP packet with unexpected sequence number. Expected: ", iM6189, "; received: ", i, ".");
        }
        long j2 = ʾˈ.ᵎـ(this.f9852, j, this.f9850, this.f9851.f8620);
        int iM10096 = c4457.m10096();
        this.f9848.mo7841(iM10096, c4457);
        this.f9848.mo7842(j2, 1, iM10096, 0, null);
        this.f9849 = i;
    }
}
