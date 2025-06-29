package p175;

import p141.C2193;
import p153.C2324;
import p254.AbstractC3152;
import p254.C3167;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import ˈי.ʾˈ;

/* renamed from: ˋˏ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2476 implements InterfaceC2486 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2324 f9831 = new C2324(3);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f9832 = -9223372036854775807L;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public InterfaceC3178 f9833;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2193 f9834;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f9835;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f9836;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f9837;

    public C2476(C2193 c2193) {
        this.f9834 = c2193;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo6599(long j) {
        AbstractC4464.m10132(this.f9832 == -9223372036854775807L);
        this.f9832 = j;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo6600(InterfaceC3177 interfaceC3177, int i) {
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(i, 1);
        this.f9833 = interfaceC3178Mo4851;
        interfaceC3178Mo4851.mo7840(this.f9834.f8622);
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo6601(long j, long j2) {
        this.f9832 = j;
        this.f9836 = j2;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo6602(C4457 c4457, long j, int i, boolean z) {
        int iM10086 = c4457.m10086() & 3;
        int iM100862 = c4457.m10086() & 255;
        long j2 = ʾˈ.ᵎـ(this.f9836, j, this.f9832, this.f9834.f8620);
        if (iM10086 != 0) {
            if (iM10086 == 1 || iM10086 == 2) {
                int i2 = this.f9837;
                if (i2 > 0) {
                    InterfaceC3178 interfaceC3178 = this.f9833;
                    int i3 = AbstractC4470.f17202;
                    interfaceC3178.mo7842(this.f9835, 1, i2, 0, null);
                    this.f9837 = 0;
                }
            } else if (iM10086 != 3) {
                throw new IllegalArgumentException(String.valueOf(iM10086));
            }
            int iM10096 = c4457.m10096();
            InterfaceC3178 interfaceC31782 = this.f9833;
            interfaceC31782.getClass();
            interfaceC31782.mo7841(iM10096, c4457);
            int i4 = this.f9837 + iM10096;
            this.f9837 = i4;
            this.f9835 = j2;
            if (z && iM10086 == 3) {
                InterfaceC3178 interfaceC31783 = this.f9833;
                int i5 = AbstractC4470.f17202;
                interfaceC31783.mo7842(j2, 1, i4, 0, null);
                this.f9837 = 0;
                return;
            }
            return;
        }
        int i6 = this.f9837;
        if (i6 > 0) {
            InterfaceC3178 interfaceC31784 = this.f9833;
            int i7 = AbstractC4470.f17202;
            interfaceC31784.mo7842(this.f9835, 1, i6, 0, null);
            this.f9837 = 0;
        }
        if (iM100862 == 1) {
            int iM100962 = c4457.m10096();
            InterfaceC3178 interfaceC31785 = this.f9833;
            interfaceC31785.getClass();
            interfaceC31785.mo7841(iM100962, c4457);
            InterfaceC3178 interfaceC31786 = this.f9833;
            int i8 = AbstractC4470.f17202;
            interfaceC31786.mo7842(j2, 1, iM100962, 0, null);
            return;
        }
        byte[] bArr = c4457.f17171;
        C2324 c2324 = this.f9831;
        c2324.getClass();
        c2324.m6398(bArr.length, bArr);
        c2324.m6391(2);
        for (int i9 = 0; i9 < iM100862; i9++) {
            C3167 c3167M7811 = AbstractC3152.m7811(c2324);
            InterfaceC3178 interfaceC31787 = this.f9833;
            interfaceC31787.getClass();
            int i10 = c3167M7811.f12249;
            interfaceC31787.mo7841(i10, c4457);
            InterfaceC3178 interfaceC31788 = this.f9833;
            int i11 = AbstractC4470.f17202;
            interfaceC31788.mo7842(j2, 1, c3167M7811.f12249, 0, null);
            j2 += (c3167M7811.f12245 / c3167M7811.f12244) * 1000000;
            c2324.m6391(i10);
        }
    }
}
