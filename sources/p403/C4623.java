package p403;

import p254.C3174;
import p254.C3180;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ﹳ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4623 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f17710;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f17711;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f17712;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int[] f17713;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public long[] f17714;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f17715;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f17716;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3178 f17717;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f17718;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f17719;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f17720;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f17721;

    public C4623(int i, int i2, long j, int i3, InterfaceC3178 interfaceC3178) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        AbstractC4464.m10142(z);
        this.f17720 = j;
        this.f17711 = i3;
        this.f17717 = interfaceC3178;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f17710 = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.f17716 = i2 == 2 ? i4 | 1650720768 : -1;
        this.f17714 = new long[512];
        this.f17713 = new int[512];
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3180 m10510(long j) {
        int i = (int) (j / ((this.f17720 * 1) / this.f17711));
        int iM10165 = AbstractC4470.m10165(this.f17713, i, true, true);
        if (this.f17713[iM10165] == i) {
            C3174 c3174M10511 = m10511(iM10165);
            return new C3180(c3174M10511, c3174M10511);
        }
        C3174 c3174M105112 = m10511(iM10165);
        int i2 = iM10165 + 1;
        return i2 < this.f17714.length ? new C3180(c3174M105112, m10511(i2)) : new C3180(c3174M105112, c3174M105112);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3174 m10511(int i) {
        return new C3174(((this.f17720 * 1) / this.f17711) * this.f17713[i], this.f17714[i]);
    }
}
