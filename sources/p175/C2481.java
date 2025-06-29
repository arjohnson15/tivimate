package p175;

import java.util.Locale;
import p141.C2193;
import p141.C2217;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import ˈי.ʾˈ;
import ـˈ.ˉᵎ;

/* renamed from: ˋˏ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2481 implements InterfaceC2486 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final int[] f9870 = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final int[] f9871 = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f9872;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f9873;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f9874;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2193 f9875;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f9876;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f9877;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public InterfaceC3178 f9878;

    public C2481(C2193 c2193) {
        this.f9875 = c2193;
        String str = c2193.f8622.f9667;
        str.getClass();
        this.f9872 = "audio/amr-wb".equals(str);
        this.f9874 = c2193.f8620;
        this.f9873 = -9223372036854775807L;
        this.f9877 = -1;
        this.f9876 = 0L;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ʽᐧ */
    public final void mo6599(long j) {
        this.f9873 = j;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ˑʽ */
    public final void mo6600(InterfaceC3177 interfaceC3177, int i) {
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(i, 1);
        this.f9878 = interfaceC3178Mo4851;
        interfaceC3178Mo4851.mo7840(this.f9875.f8622);
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ـﹶ */
    public final void mo6601(long j, long j2) {
        this.f9873 = j;
        this.f9876 = j2;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ﹳﹳ */
    public final void mo6602(C4457 c4457, long j, int i, boolean z) {
        int iM6189;
        AbstractC4464.m10146(this.f9878);
        int i2 = this.f9877;
        if (i2 != -1 && i != (iM6189 = C2217.m6189(i2))) {
            int i3 = AbstractC4470.f17202;
            Locale locale = Locale.US;
            AbstractC4464.m10144("RtpAmrReader", ˉᵎ.ˋⁱ("Received RTP packet with unexpected sequence number. Expected: ", iM6189, "; received: ", i, "."));
        }
        c4457.m10085(1);
        int iM10078 = (c4457.m10078() >> 3) & 15;
        boolean z2 = (iM10078 >= 0 && iM10078 <= 8) || iM10078 == 15;
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        boolean z3 = this.f9872;
        sb.append(z3 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(iM10078);
        AbstractC4464.m10124(sb.toString(), z2);
        int i4 = z3 ? f9871[iM10078] : f9870[iM10078];
        int iM10096 = c4457.m10096();
        AbstractC4464.m10124("compound payload not supported currently", iM10096 == i4);
        this.f9878.mo7841(iM10096, c4457);
        this.f9878.mo7842(ʾˈ.ᵎـ(this.f9876, j, this.f9873, this.f9874), 1, iM10096, 0, null);
        this.f9877 = i;
    }
}
