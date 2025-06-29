package p175;

import java.math.RoundingMode;
import p141.C2193;
import p153.C2324;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4470;
import p383.C4457;
import p395.AbstractC4535;
import ˈי.ʾˈ;

/* renamed from: ˋˏ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2482 implements InterfaceC2486 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2324 f9879 = new C2324(3);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f9880;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public InterfaceC3178 f9881;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f9882;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2193 f9883;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f9884;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f9885;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f9886;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public long f9887;

    public C2482(C2193 c2193) {
        this.f9883 = c2193;
        this.f9882 = c2193.f8620;
        String str = (String) c2193.f8624.get("mode");
        str.getClass();
        if (AbstractC4535.m10360(str, "AAC-hbr")) {
            this.f9886 = 13;
            this.f9880 = 3;
        } else {
            if (!AbstractC4535.m10360(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f9886 = 6;
            this.f9880 = 2;
        }
        this.f9884 = this.f9880 + this.f9886;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ʽᐧ */
    public final void mo6599(long j) {
        this.f9885 = j;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ˑʽ */
    public final void mo6600(InterfaceC3177 interfaceC3177, int i) {
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(i, 1);
        this.f9881 = interfaceC3178Mo4851;
        interfaceC3178Mo4851.mo7840(this.f9883.f8622);
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ـﹶ */
    public final void mo6601(long j, long j2) {
        this.f9885 = j;
        this.f9887 = j2;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ﹳﹳ */
    public final void mo6602(C4457 c4457, long j, int i, boolean z) {
        this.f9881.getClass();
        short sM10102 = c4457.m10102();
        int i2 = sM10102 / this.f9884;
        long j2 = ʾˈ.ᵎـ(this.f9887, j, this.f9885, this.f9882);
        C2324 c2324 = this.f9879;
        c2324.m6401(c4457);
        int i3 = this.f9880;
        int i4 = this.f9886;
        if (i2 == 1) {
            int iM6410 = c2324.m6410(i4);
            c2324.m6408(i3);
            this.f9881.mo7841(c4457.m10096(), c4457);
            if (z) {
                this.f9881.mo7842(j2, 1, iM6410, 0, null);
                return;
            }
            return;
        }
        c4457.m10085((sM10102 + 7) / 8);
        long jM10166 = j2;
        for (int i5 = 0; i5 < i2; i5++) {
            int iM64102 = c2324.m6410(i4);
            c2324.m6408(i3);
            this.f9881.mo7841(iM64102, c4457);
            this.f9881.mo7842(jM10166, 1, iM64102, 0, null);
            jM10166 += AbstractC4470.m10166(i2, 1000000L, this.f9882, RoundingMode.FLOOR);
        }
    }
}
