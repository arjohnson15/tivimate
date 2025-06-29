package p341;

import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p254.C3169;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.C4457;

/* renamed from: ᵎˑ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3901 implements InterfaceC3891 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3169 f15125;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public InterfaceC3178 f15126;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f15127;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f15128;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public long f15129;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public long f15130;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f15131;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f15132;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4457 f15133;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public String f15134;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f15135 = 0;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f15136;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f15137;

    public C3901(String str, int i) {
        C4457 c4457 = new C4457(4);
        this.f15133 = c4457;
        c4457.f17171[0] = -1;
        this.f15125 = new C3169();
        this.f15129 = -9223372036854775807L;
        this.f15132 = str;
        this.f15136 = i;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ˏᵢ */
    public final void mo9075(int i, long j) {
        this.f15129 = j;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ـﹶ */
    public final void mo9076() {
        this.f15135 = 0;
        this.f15131 = 0;
        this.f15127 = false;
        this.f15129 = -9223372036854775807L;
    }

    @Override // p341.InterfaceC3891
    /* renamed from: ٴˎ */
    public final void mo9077(C4457 c4457) {
        AbstractC4464.m10146(this.f15126);
        while (c4457.m10096() > 0) {
            int i = this.f15135;
            C4457 c44572 = this.f15133;
            if (i == 0) {
                byte[] bArr = c4457.f17171;
                int i2 = c4457.f17169;
                int i3 = c4457.f17170;
                while (true) {
                    if (i2 >= i3) {
                        c4457.m10108(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f15127 && (b & 224) == 224;
                    this.f15127 = z;
                    if (z2) {
                        c4457.m10108(i2 + 1);
                        this.f15127 = false;
                        c44572.f17171[1] = bArr[i2];
                        this.f15131 = 2;
                        this.f15135 = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(c4457.m10096(), 4 - this.f15131);
                c4457.m10097(c44572.f17171, this.f15131, iMin);
                int i4 = this.f15131 + iMin;
                this.f15131 = i4;
                if (i4 >= 4) {
                    c44572.m10108(0);
                    int iM10092 = c44572.m10092();
                    C3169 c3169 = this.f15125;
                    if (c3169.m7837(iM10092)) {
                        this.f15128 = c3169.f12250;
                        if (!this.f15137) {
                            this.f15130 = (c3169.f12254 * 1000000) / c3169.f12252;
                            C2417 c2417 = new C2417();
                            c2417.f9614 = this.f15134;
                            c2417.f9602 = AbstractC2435.m6559((String) c3169.f12255);
                            c2417.f9605 = 4096;
                            c2417.f9624 = c3169.f12256;
                            c2417.f9600 = c3169.f12252;
                            c2417.f9625 = this.f15132;
                            c2417.f9615 = this.f15136;
                            this.f15126.mo7840(new C2431(c2417));
                            this.f15137 = true;
                        }
                        c44572.m10108(0);
                        this.f15126.mo7841(4, c44572);
                        this.f15135 = 2;
                    } else {
                        this.f15131 = 0;
                        this.f15135 = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(c4457.m10096(), this.f15128 - this.f15131);
                this.f15126.mo7841(iMin2, c4457);
                int i5 = this.f15131 + iMin2;
                this.f15131 = i5;
                if (i5 >= this.f15128) {
                    AbstractC4464.m10132(this.f15129 != -9223372036854775807L);
                    this.f15126.mo7842(this.f15129, 1, this.f15128, 0, null);
                    this.f15129 += this.f15130;
                    this.f15131 = 0;
                    this.f15135 = 0;
                }
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
        this.f15134 = c3898.f15096;
        c3898.m9091();
        this.f15126 = interfaceC3177.mo4851(c3898.f15099, 1);
    }
}
