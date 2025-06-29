package p341;

import androidx.media3.common.ParserException;
import java.util.Collections;
import p153.C2324;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p254.AbstractC3152;
import p254.C3170;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.C4457;

/* renamed from: ᵎˑ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3888 implements InterfaceC3891 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f14995;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public InterfaceC3178 f14996;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public int f14997;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f14998;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long f14999;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public String f15000;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean f15001;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public long f15002;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f15003;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f15004;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f15005;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 f15006;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f15007;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f15008;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public String f15009;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C2431 f15010;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f15011;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public int f15012;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f15013;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public long f15014;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2324 f15015;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f15016;

    public C3888(String str, int i) {
        this.f15008 = str;
        this.f14995 = i;
        C4457 c4457 = new C4457(1024);
        this.f15006 = c4457;
        byte[] bArr = c4457.f17171;
        this.f15015 = new C2324(bArr.length, bArr);
        this.f14999 = -9223372036854775807L;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ˏᵢ */
    public final void mo9075(int i, long j) {
        this.f14999 = j;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ـﹶ */
    public final void mo9076() {
        this.f15005 = 0;
        this.f14999 = -9223372036854775807L;
        this.f15001 = false;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ٴˎ */
    public final void mo9077(C4457 c4457) throws ParserException {
        int iM6410;
        boolean zM6399;
        AbstractC4464.m10146(this.f14996);
        while (c4457.m10096() > 0) {
            int i = this.f15005;
            if (i != 0) {
                if (i != 1) {
                    C4457 c44572 = this.f15006;
                    C2324 c2324 = this.f15015;
                    if (i == 2) {
                        int iM10086 = ((this.f15003 & (-225)) << 8) | c4457.m10086();
                        this.f14998 = iM10086;
                        if (iM10086 > c44572.f17171.length) {
                            c44572.m10099(iM10086);
                            byte[] bArr = c44572.f17171;
                            c2324.getClass();
                            c2324.m6398(bArr.length, bArr);
                        }
                        this.f15016 = 0;
                        this.f15005 = 3;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(c4457.m10096(), this.f14998 - this.f15016);
                        c4457.m10097(c2324.f9219, this.f15016, iMin);
                        int i2 = this.f15016 + iMin;
                        this.f15016 = i2;
                        if (i2 == this.f14998) {
                            c2324.m6407(0);
                            if (c2324.m6399()) {
                                if (this.f15001) {
                                }
                                this.f15005 = 0;
                            } else {
                                this.f15001 = true;
                                int iM64102 = c2324.m6410(1);
                                int iM64103 = iM64102 == 1 ? c2324.m6410(1) : 0;
                                this.f15011 = iM64103;
                                if (iM64103 != 0) {
                                    throw ParserException.m1097(null, null);
                                }
                                if (iM64102 == 1) {
                                    c2324.m6410((c2324.m6410(2) + 1) * 8);
                                }
                                if (!c2324.m6399()) {
                                    throw ParserException.m1097(null, null);
                                }
                                this.f15004 = c2324.m6410(6);
                                int iM64104 = c2324.m6410(4);
                                int iM64105 = c2324.m6410(3);
                                if (iM64104 != 0 || iM64105 != 0) {
                                    throw ParserException.m1097(null, null);
                                }
                                if (iM64102 == 0) {
                                    int iM6404 = c2324.m6404();
                                    int iM6389 = c2324.m6389();
                                    C3170 c3170M7820 = AbstractC3152.m7820(c2324, true);
                                    this.f15000 = c3170M7820.f12259;
                                    this.f15012 = c3170M7820.f12257;
                                    this.f14997 = c3170M7820.f12258;
                                    int iM63892 = iM6389 - c2324.m6389();
                                    c2324.m6407(iM6404);
                                    byte[] bArr2 = new byte[(iM63892 + 7) / 8];
                                    c2324.m6392(iM63892, bArr2);
                                    C2417 c2417 = new C2417();
                                    c2417.f9614 = this.f15009;
                                    c2417.f9602 = AbstractC2435.m6559("audio/mp4a-latm");
                                    c2417.f9627 = this.f15000;
                                    c2417.f9624 = this.f14997;
                                    c2417.f9600 = this.f15012;
                                    c2417.f9609 = Collections.singletonList(bArr2);
                                    c2417.f9625 = this.f15008;
                                    c2417.f9615 = this.f14995;
                                    C2431 c2431 = new C2431(c2417);
                                    if (!c2431.equals(this.f15010)) {
                                        this.f15010 = c2431;
                                        this.f15014 = 1024000000 / c2431.f9681;
                                        this.f14996.mo7840(c2431);
                                    }
                                } else {
                                    int iM63893 = c2324.m6389();
                                    C3170 c3170M78202 = AbstractC3152.m7820(c2324, true);
                                    this.f15000 = c3170M78202.f12259;
                                    this.f15012 = c3170M78202.f12257;
                                    this.f14997 = c3170M78202.f12258;
                                    c2324.m6408(c2324.m6410((c2324.m6410(2) + 1) * 8) - (iM63893 - c2324.m6389()));
                                }
                                int iM64106 = c2324.m6410(3);
                                this.f15007 = iM64106;
                                if (iM64106 == 0) {
                                    c2324.m6408(8);
                                } else if (iM64106 == 1) {
                                    c2324.m6408(9);
                                } else if (iM64106 == 3 || iM64106 == 4 || iM64106 == 5) {
                                    c2324.m6408(6);
                                } else {
                                    if (iM64106 != 6 && iM64106 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c2324.m6408(1);
                                }
                                boolean zM63992 = c2324.m6399();
                                this.f15013 = zM63992;
                                this.f15002 = 0L;
                                if (zM63992) {
                                    if (iM64102 == 1) {
                                        this.f15002 = c2324.m6410((c2324.m6410(2) + 1) * 8);
                                    } else {
                                        do {
                                            zM6399 = c2324.m6399();
                                            this.f15002 = (this.f15002 << 8) + c2324.m6410(8);
                                        } while (zM6399);
                                    }
                                }
                                if (c2324.m6399()) {
                                    c2324.m6408(8);
                                }
                            }
                            if (this.f15011 != 0) {
                                throw ParserException.m1097(null, null);
                            }
                            if (this.f15004 != 0) {
                                throw ParserException.m1097(null, null);
                            }
                            if (this.f15007 != 0) {
                                throw ParserException.m1097(null, null);
                            }
                            int i3 = 0;
                            do {
                                iM6410 = c2324.m6410(8);
                                i3 += iM6410;
                            } while (iM6410 == 255);
                            int iM64042 = c2324.m6404();
                            if ((iM64042 & 7) == 0) {
                                c44572.m10108(iM64042 >> 3);
                            } else {
                                c2324.m6392(i3 * 8, c44572.f17171);
                                c44572.m10108(0);
                            }
                            this.f14996.mo7841(i3, c44572);
                            AbstractC4464.m10132(this.f14999 != -9223372036854775807L);
                            this.f14996.mo7842(this.f14999, 1, i3, 0, null);
                            this.f14999 += this.f15014;
                            if (this.f15013) {
                                c2324.m6408((int) this.f15002);
                            }
                            this.f15005 = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iM100862 = c4457.m10086();
                    if ((iM100862 & 224) == 224) {
                        this.f15003 = iM100862;
                        this.f15005 = 2;
                    } else if (iM100862 != 86) {
                        this.f15005 = 0;
                    }
                }
            } else if (c4457.m10086() == 86) {
                this.f15005 = 1;
            }
        }
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ᐧʻ */
    public final void mo9078(boolean z) {
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ﹶˆ */
    public final void mo9079(InterfaceC3177 interfaceC3177, C3898 c3898) {
        c3898.m9092();
        c3898.m9091();
        this.f14996 = interfaceC3177.mo4851(c3898.f15099, 1);
        c3898.m9091();
        this.f15009 = c3898.f15096;
    }
}
