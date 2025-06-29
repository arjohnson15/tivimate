package p175;

import java.util.Locale;
import p141.C2193;
import p141.C2217;
import p166.C2417;
import p166.C2431;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import ˈי.ʾˈ;
import ـˈ.ˉᵎ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˋˏ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2485 implements InterfaceC2486 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2193 f9903;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f9904;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f9905;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f9906;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean f9907;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f9908;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long f9909;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public InterfaceC3178 f9910;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f9911;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f9912;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f9913;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f9914;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f9915;

    public C2485(C2193 c2193, int i) {
        this.f9911 = i;
        switch (i) {
            case 1:
                this.f9903 = c2193;
                this.f9914 = -9223372036854775807L;
                this.f9913 = -1;
                this.f9909 = -9223372036854775807L;
                this.f9904 = 0L;
                this.f9912 = -1;
                this.f9915 = -1;
                this.f9905 = -1;
                break;
            default:
                this.f9903 = c2193;
                this.f9914 = -9223372036854775807L;
                this.f9913 = -1;
                break;
        }
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ʽᐧ */
    public final void mo6599(long j) {
        switch (this.f9911) {
            case 0:
                AbstractC4464.m10132(this.f9914 == -9223372036854775807L);
                this.f9914 = j;
                break;
            default:
                AbstractC4464.m10132(this.f9914 == -9223372036854775807L);
                this.f9914 = j;
                break;
        }
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ˑʽ */
    public final void mo6600(InterfaceC3177 interfaceC3177, int i) {
        switch (this.f9911) {
            case 0:
                InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(i, 2);
                this.f9910 = interfaceC3178Mo4851;
                interfaceC3178Mo4851.mo7840(this.f9903.f8622);
                break;
            default:
                InterfaceC3178 interfaceC3178Mo48512 = interfaceC3177.mo4851(i, 2);
                this.f9910 = interfaceC3178Mo48512;
                interfaceC3178Mo48512.mo7840(this.f9903.f8622);
                break;
        }
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ـﹶ */
    public final void mo6601(long j, long j2) {
        switch (this.f9911) {
            case 0:
                this.f9914 = j;
                this.f9912 = 0;
                this.f9904 = j2;
                break;
            default:
                this.f9914 = j;
                this.f9913 = -1;
                this.f9904 = j2;
                break;
        }
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ﹳﹳ */
    public final void mo6602(C4457 c4457, long j, int i, boolean z) {
        int i2;
        int i3;
        C2193 c2193 = this.f9903;
        switch (this.f9911) {
            case 0:
                AbstractC4464.m10146(this.f9910);
                int i4 = c4457.f17169;
                int iM10100 = c4457.m10100();
                boolean z2 = (iM10100 & 1024) > 0;
                if ((iM10100 & 512) != 0 || (iM10100 & 504) != 0 || (iM10100 & 7) != 0) {
                    AbstractC4464.m10144("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                    break;
                } else {
                    if (z2) {
                        if (this.f9907 && this.f9912 > 0) {
                            InterfaceC3178 interfaceC3178 = this.f9910;
                            interfaceC3178.getClass();
                            interfaceC3178.mo7842(this.f9909, this.f9908 ? 1 : 0, this.f9912, 0, null);
                            this.f9912 = 0;
                            this.f9909 = -9223372036854775807L;
                            this.f9908 = false;
                            this.f9907 = false;
                        }
                        this.f9907 = true;
                        if ((c4457.m10078() & 252) < 128) {
                            AbstractC4464.m10144("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                            break;
                        } else {
                            byte[] bArr = c4457.f17171;
                            bArr[i4] = 0;
                            bArr[i4 + 1] = 0;
                            c4457.m10108(i4);
                        }
                    } else if (this.f9907) {
                        int iM6189 = C2217.m6189(this.f9913);
                        if (i < iM6189) {
                            int i5 = AbstractC4470.f17202;
                            Locale locale = Locale.US;
                            AbstractC4464.m10144("RtpH263Reader", ˉᵎ.ˋⁱ("Received RTP packet with unexpected sequence number. Expected: ", iM6189, "; received: ", i, ". Dropping packet."));
                            break;
                        }
                    } else {
                        AbstractC4464.m10144("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        break;
                    }
                    if (this.f9912 == 0) {
                        boolean z3 = this.f9906;
                        int i6 = c4457.f17169;
                        if (((c4457.m10110() >> 10) & 63) == 32) {
                            int iM10078 = c4457.m10078();
                            int i7 = (iM10078 >> 1) & 1;
                            if (!z3 && i7 == 0) {
                                int i8 = (iM10078 >> 2) & 7;
                                if (i8 == 1) {
                                    this.f9915 = 128;
                                    this.f9905 = 96;
                                } else {
                                    int i9 = i8 - 2;
                                    this.f9915 = 176 << i9;
                                    this.f9905 = 144 << i9;
                                }
                            }
                            c4457.m10108(i6);
                            this.f9908 = i7 == 0;
                        } else {
                            c4457.m10108(i6);
                            this.f9908 = false;
                        }
                        if (!this.f9906 && this.f9908) {
                            int i10 = this.f9915;
                            C2431 c2431 = c2193.f8622;
                            if (i10 != c2431.f9684 || this.f9905 != c2431.f9687) {
                                InterfaceC3178 interfaceC31782 = this.f9910;
                                C2417 c2417M6541 = c2431.m6541();
                                c2417M6541.f9607 = this.f9915;
                                c2417M6541.f9620 = this.f9905;
                                ᐧʻ.ˋˊ(c2417M6541, interfaceC31782);
                            }
                            this.f9906 = true;
                        }
                    }
                    int iM10096 = c4457.m10096();
                    this.f9910.mo7841(iM10096, c4457);
                    this.f9912 += iM10096;
                    this.f9909 = ʾˈ.ᵎـ(this.f9904, j, this.f9914, 90000);
                    if (z) {
                        InterfaceC3178 interfaceC31783 = this.f9910;
                        interfaceC31783.getClass();
                        interfaceC31783.mo7842(this.f9909, this.f9908 ? 1 : 0, this.f9912, 0, null);
                        this.f9912 = 0;
                        this.f9909 = -9223372036854775807L;
                        this.f9908 = false;
                        this.f9907 = false;
                    }
                    this.f9913 = i;
                    break;
                }
                break;
            default:
                AbstractC4464.m10146(this.f9910);
                int iM10086 = c4457.m10086();
                if ((iM10086 & 8) == 8) {
                    if (this.f9908 && this.f9913 > 0) {
                        InterfaceC3178 interfaceC31784 = this.f9910;
                        interfaceC31784.getClass();
                        interfaceC31784.mo7842(this.f9909, this.f9907 ? 1 : 0, this.f9913, 0, null);
                        this.f9913 = -1;
                        this.f9909 = -9223372036854775807L;
                        this.f9908 = false;
                    }
                    this.f9908 = true;
                } else if (this.f9908) {
                    int iM61892 = C2217.m6189(this.f9912);
                    if (i < iM61892) {
                        int i11 = AbstractC4470.f17202;
                        Locale locale2 = Locale.US;
                        AbstractC4464.m10144("RtpVp9Reader", ˉᵎ.ˋⁱ("Received RTP packet with unexpected sequence number. Expected: ", iM61892, "; received: ", i, ". Dropping packet."));
                        break;
                    }
                } else {
                    AbstractC4464.m10144("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                    break;
                }
                if ((iM10086 & 128) == 0 || (c4457.m10086() & 128) == 0 || c4457.m10096() >= 1) {
                    int i12 = iM10086 & 16;
                    AbstractC4464.m10124("VP9 flexible mode is not supported.", i12 == 0);
                    if ((iM10086 & 32) != 0) {
                        c4457.m10085(1);
                        if (c4457.m10096() >= 1) {
                            if (i12 == 0) {
                                c4457.m10085(1);
                            }
                        }
                    }
                    if ((iM10086 & 2) != 0) {
                        int iM100862 = c4457.m10086();
                        int i13 = (iM100862 >> 5) & 7;
                        if ((iM100862 & 16) != 0) {
                            int i14 = i13 + 1;
                            if (c4457.m10096() >= i14 * 4) {
                                for (int i15 = 0; i15 < i14; i15++) {
                                    this.f9915 = c4457.m10100();
                                    this.f9905 = c4457.m10100();
                                }
                            }
                        }
                        if ((iM100862 & 8) != 0) {
                            int iM100863 = c4457.m10086();
                            if (c4457.m10096() >= iM100863) {
                                for (int i16 = 0; i16 < iM100863; i16++) {
                                    int iM101002 = (c4457.m10100() & 12) >> 2;
                                    if (c4457.m10096() < iM101002) {
                                        break;
                                    } else {
                                        c4457.m10085(iM101002);
                                    }
                                }
                            }
                        }
                    }
                    if (this.f9913 == -1 && this.f9908) {
                        this.f9907 = (c4457.m10078() & 4) == 0;
                    }
                    if (!this.f9906 && (i2 = this.f9915) != -1 && (i3 = this.f9905) != -1) {
                        C2431 c24312 = c2193.f8622;
                        if (i2 != c24312.f9684 || i3 != c24312.f9687) {
                            InterfaceC3178 interfaceC31785 = this.f9910;
                            C2417 c2417M65412 = c24312.m6541();
                            c2417M65412.f9607 = this.f9915;
                            c2417M65412.f9620 = this.f9905;
                            ᐧʻ.ˋˊ(c2417M65412, interfaceC31785);
                        }
                        this.f9906 = true;
                    }
                    int iM100962 = c4457.m10096();
                    this.f9910.mo7841(iM100962, c4457);
                    int i17 = this.f9913;
                    if (i17 == -1) {
                        this.f9913 = iM100962;
                    } else {
                        this.f9913 = i17 + iM100962;
                    }
                    this.f9909 = ʾˈ.ᵎـ(this.f9904, j, this.f9914, 90000);
                    if (z) {
                        InterfaceC3178 interfaceC31786 = this.f9910;
                        interfaceC31786.getClass();
                        interfaceC31786.mo7842(this.f9909, this.f9907 ? 1 : 0, this.f9913, 0, null);
                        this.f9913 = -1;
                        this.f9909 = -9223372036854775807L;
                        this.f9908 = false;
                    }
                    this.f9912 = i;
                    break;
                }
                break;
        }
    }
}
