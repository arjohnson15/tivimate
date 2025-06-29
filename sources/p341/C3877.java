package p341;

import p007.C0946;
import p153.C2324;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p254.AbstractC3152;
import p254.C3167;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;

/* renamed from: ᵎˑ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3877 implements InterfaceC3891 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2324 f14877;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f14878;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f14879;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public C2431 f14880;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f14881;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public long f14882;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f14883;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 f14884;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f14885;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public String f14886;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public InterfaceC3178 f14887;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public long f14888;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f14889;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f14890;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3877() {
        this(0, 0, null);
        this.f14885 = 0;
    }

    public C3877(int i, int i2, String str) {
        this.f14885 = i2;
        switch (i2) {
            case 1:
                C2324 c2324 = new C2324(16, new byte[16]);
                this.f14877 = c2324;
                this.f14884 = new C4457(c2324.f9219);
                this.f14883 = 0;
                this.f14890 = 0;
                this.f14879 = false;
                this.f14888 = -9223372036854775807L;
                this.f14889 = str;
                this.f14878 = i;
                break;
            default:
                C2324 c23242 = new C2324(128, new byte[128]);
                this.f14877 = c23242;
                this.f14884 = new C4457(c23242.f9219);
                this.f14883 = 0;
                this.f14888 = -9223372036854775807L;
                this.f14889 = str;
                this.f14878 = i;
                break;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private final void m9073(boolean z) {
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m9074(boolean z) {
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void mo9075(int i, long j) {
        switch (this.f14885) {
            case 0:
                this.f14888 = j;
                break;
            default:
                this.f14888 = j;
                break;
        }
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo9076() {
        switch (this.f14885) {
            case 0:
                this.f14883 = 0;
                this.f14890 = 0;
                this.f14879 = false;
                this.f14888 = -9223372036854775807L;
                break;
            default:
                this.f14883 = 0;
                this.f14890 = 0;
                this.f14879 = false;
                this.f14888 = -9223372036854775807L;
                break;
        }
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo9077(C4457 c4457) {
        switch (this.f14885) {
            case 0:
                AbstractC4464.m10146(this.f14887);
                while (c4457.m10096() > 0) {
                    int i = this.f14883;
                    C4457 c44572 = this.f14884;
                    if (i == 0) {
                        while (true) {
                            if (c4457.m10096() <= 0) {
                                break;
                            }
                            if (this.f14879) {
                                int iM10086 = c4457.m10086();
                                if (iM10086 == 119) {
                                    this.f14879 = false;
                                    this.f14883 = 1;
                                    byte[] bArr = c44572.f17171;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f14890 = 2;
                                } else {
                                    this.f14879 = iM10086 == 11;
                                }
                            } else {
                                this.f14879 = c4457.m10086() == 11;
                            }
                        }
                    } else if (i == 1) {
                        byte[] bArr2 = c44572.f17171;
                        int iMin = Math.min(c4457.m10096(), 128 - this.f14890);
                        c4457.m10097(bArr2, this.f14890, iMin);
                        int i2 = this.f14890 + iMin;
                        this.f14890 = i2;
                        if (i2 == 128) {
                            C2324 c2324 = this.f14877;
                            c2324.m6407(0);
                            C3167 c3167M7811 = AbstractC3152.m7811(c2324);
                            C2431 c2431 = this.f14880;
                            int i3 = c3167M7811.f12244;
                            int i4 = c3167M7811.f12246;
                            String str = c3167M7811.f12247;
                            if (c2431 == null || i4 != c2431.f9662 || i3 != c2431.f9681 || !AbstractC4470.m10194(str, c2431.f9667)) {
                                C2417 c2417 = new C2417();
                                c2417.f9614 = this.f14886;
                                c2417.f9602 = AbstractC2435.m6559(str);
                                c2417.f9624 = i4;
                                c2417.f9600 = i3;
                                c2417.f9625 = this.f14889;
                                c2417.f9615 = this.f14878;
                                int i5 = c3167M7811.f12248;
                                c2417.f9610 = i5;
                                if ("audio/ac3".equals(str)) {
                                    c2417.f9616 = i5;
                                }
                                C2431 c24312 = new C2431(c2417);
                                this.f14880 = c24312;
                                this.f14887.mo7840(c24312);
                            }
                            this.f14881 = c3167M7811.f12249;
                            this.f14882 = (c3167M7811.f12245 * 1000000) / this.f14880.f9681;
                            c44572.m10108(0);
                            this.f14887.mo7841(128, c44572);
                            this.f14883 = 2;
                        }
                    } else if (i == 2) {
                        int iMin2 = Math.min(c4457.m10096(), this.f14881 - this.f14890);
                        this.f14887.mo7841(iMin2, c4457);
                        int i6 = this.f14890 + iMin2;
                        this.f14890 = i6;
                        if (i6 == this.f14881) {
                            AbstractC4464.m10132(this.f14888 != -9223372036854775807L);
                            this.f14887.mo7842(this.f14888, 1, this.f14881, 0, null);
                            this.f14888 += this.f14882;
                            this.f14883 = 0;
                        }
                    }
                }
                break;
            default:
                AbstractC4464.m10146(this.f14887);
                while (c4457.m10096() > 0) {
                    int i7 = this.f14883;
                    C4457 c44573 = this.f14884;
                    if (i7 == 0) {
                        while (c4457.m10096() > 0) {
                            if (this.f14879) {
                                int iM100862 = c4457.m10086();
                                this.f14879 = iM100862 == 172;
                                if (iM100862 == 64 || iM100862 == 65) {
                                    boolean z = iM100862 == 65;
                                    this.f14883 = 1;
                                    byte[] bArr3 = c44573.f17171;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z ? 65 : 64);
                                    this.f14890 = 2;
                                }
                            } else {
                                this.f14879 = c4457.m10086() == 172;
                            }
                        }
                    } else if (i7 == 1) {
                        byte[] bArr4 = c44573.f17171;
                        int iMin3 = Math.min(c4457.m10096(), 16 - this.f14890);
                        c4457.m10097(bArr4, this.f14890, iMin3);
                        int i8 = this.f14890 + iMin3;
                        this.f14890 = i8;
                        if (i8 == 16) {
                            C2324 c23242 = this.f14877;
                            c23242.m6407(0);
                            C0946 c0946M7814 = AbstractC3152.m7814(c23242);
                            C2431 c24313 = this.f14880;
                            int i9 = c0946M7814.f4158;
                            if (c24313 == null || 2 != c24313.f9662 || i9 != c24313.f9681 || !"audio/ac4".equals(c24313.f9667)) {
                                C2417 c24172 = new C2417();
                                c24172.f9614 = this.f14886;
                                c24172.f9602 = AbstractC2435.m6559("audio/ac4");
                                c24172.f9624 = 2;
                                c24172.f9600 = i9;
                                c24172.f9625 = this.f14889;
                                c24172.f9615 = this.f14878;
                                C2431 c24314 = new C2431(c24172);
                                this.f14880 = c24314;
                                this.f14887.mo7840(c24314);
                            }
                            this.f14881 = c0946M7814.f4156;
                            this.f14882 = (c0946M7814.f4157 * 1000000) / this.f14880.f9681;
                            c44573.m10108(0);
                            this.f14887.mo7841(16, c44573);
                            this.f14883 = 2;
                        }
                    } else if (i7 == 2) {
                        int iMin4 = Math.min(c4457.m10096(), this.f14881 - this.f14890);
                        this.f14887.mo7841(iMin4, c4457);
                        int i10 = this.f14890 + iMin4;
                        this.f14890 = i10;
                        if (i10 == this.f14881) {
                            AbstractC4464.m10132(this.f14888 != -9223372036854775807L);
                            this.f14887.mo7842(this.f14888, 1, this.f14881, 0, null);
                            this.f14888 += this.f14882;
                            this.f14883 = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void mo9078(boolean z) {
        int i = this.f14885;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo9079(InterfaceC3177 interfaceC3177, C3898 c3898) {
        switch (this.f14885) {
            case 0:
                c3898.m9092();
                c3898.m9091();
                this.f14886 = c3898.f15096;
                c3898.m9091();
                this.f14887 = interfaceC3177.mo4851(c3898.f15099, 1);
                break;
            default:
                c3898.m9092();
                c3898.m9091();
                this.f14886 = c3898.f15096;
                c3898.m9091();
                this.f14887 = interfaceC3177.mo4851(c3898.f15099, 1);
                break;
        }
    }
}
