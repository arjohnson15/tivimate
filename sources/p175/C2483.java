package p175;

import androidx.media3.common.ParserException;
import p141.C2193;
import p141.C2217;
import p153.C2324;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p345.C3930;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import ˈי.ʾˈ;
import ـˈ.ˉᵎ;

/* renamed from: ˋˏ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2483 implements InterfaceC2486 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f9888;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f9889;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long f9890;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public InterfaceC3178 f9891;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2193 f9892;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f9893;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f9894;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f9895;

    public C2483(C2193 c2193) {
        this.f9892 = c2193;
        try {
            this.f9888 = m6606(c2193.f8624);
            this.f9895 = -9223372036854775807L;
            this.f9889 = -1;
            this.f9893 = 0;
            this.f9894 = 0L;
            this.f9890 = -9223372036854775807L;
        } catch (ParserException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m6606(C3930 c3930) throws ParserException {
        String str = (String) c3930.get("config");
        int i = 0;
        i = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] bArrM10210 = AbstractC4470.m10210(str);
            C2324 c2324 = new C2324(bArrM10210.length, bArrM10210);
            int iM6410 = c2324.m6410(1);
            if (iM6410 != 0) {
                throw new ParserException(ˉᵎ.ˉⁱ("unsupported audio mux version: ", iM6410), null, true, 0);
            }
            AbstractC4464.m10124("Only supports allStreamsSameTimeFraming.", c2324.m6410(1) == 1);
            int iM64102 = c2324.m6410(6);
            AbstractC4464.m10124("Only suppors one program.", c2324.m6410(4) == 0);
            AbstractC4464.m10124("Only suppors one layer.", c2324.m6410(3) == 0);
            i = iM64102;
        }
        return i + 1;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ʽᐧ */
    public final void mo6599(long j) {
        AbstractC4464.m10132(this.f9895 == -9223372036854775807L);
        this.f9895 = j;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ˑʽ */
    public final void mo6600(InterfaceC3177 interfaceC3177, int i) {
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(i, 2);
        this.f9891 = interfaceC3178Mo4851;
        int i2 = AbstractC4470.f17202;
        interfaceC3178Mo4851.mo7840(this.f9892.f8622);
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ـﹶ */
    public final void mo6601(long j, long j2) {
        this.f9895 = j;
        this.f9893 = 0;
        this.f9894 = j2;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ﹳﹳ */
    public final void mo6602(C4457 c4457, long j, int i, boolean z) {
        AbstractC4464.m10146(this.f9891);
        int iM6189 = C2217.m6189(this.f9889);
        if (this.f9893 > 0 && iM6189 < i) {
            InterfaceC3178 interfaceC3178 = this.f9891;
            interfaceC3178.getClass();
            interfaceC3178.mo7842(this.f9890, 1, this.f9893, 0, null);
            this.f9893 = 0;
            this.f9890 = -9223372036854775807L;
        }
        for (int i2 = 0; i2 < this.f9888; i2++) {
            int i3 = 0;
            while (c4457.f17169 < c4457.f17170) {
                int iM10086 = c4457.m10086();
                i3 += iM10086;
                if (iM10086 != 255) {
                    break;
                }
            }
            this.f9891.mo7841(i3, c4457);
            this.f9893 += i3;
        }
        this.f9890 = ʾˈ.ᵎـ(this.f9894, j, this.f9895, this.f9892.f8620);
        if (z) {
            InterfaceC3178 interfaceC31782 = this.f9891;
            interfaceC31782.getClass();
            interfaceC31782.mo7842(this.f9890, 1, this.f9893, 0, null);
            this.f9893 = 0;
            this.f9890 = -9223372036854775807L;
        }
        this.f9889 = i;
    }
}
