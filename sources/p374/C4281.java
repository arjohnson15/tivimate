package p374;

import p036.InterfaceC1239;
import p076.C1653;
import p383.AbstractC4470;
import p438.C5077;
import p438.C5085;

/* renamed from: ᵢˎ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4281 implements InterfaceC4294, InterfaceC4295 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f16619;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public InterfaceC4294 f16620;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C1653 f16621;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public InterfaceC4277 f16622;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4290 f16623;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public InterfaceC4295 f16624;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public long f16625 = -9223372036854775807L;

    public C4281(C4290 c4290, C1653 c1653, long j) {
        this.f16623 = c4290;
        this.f16621 = c1653;
        this.f16619 = j;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ʽᐧ */
    public final boolean mo6160() {
        InterfaceC4294 interfaceC4294 = this.f16620;
        return interfaceC4294 != null && interfaceC4294.mo6160();
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˉי */
    public final long mo6161() {
        InterfaceC4294 interfaceC4294 = this.f16620;
        int i = AbstractC4470.f17202;
        return interfaceC4294.mo6161();
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˉⁱ */
    public final long mo6162(InterfaceC1239[] interfaceC1239Arr, boolean[] zArr, InterfaceC4254[] interfaceC4254Arr, boolean[] zArr2, long j) {
        long j2 = this.f16625;
        long j3 = (j2 == -9223372036854775807L || j != this.f16619) ? j : j2;
        this.f16625 = -9223372036854775807L;
        InterfaceC4294 interfaceC4294 = this.f16620;
        int i = AbstractC4470.f17202;
        return interfaceC4294.mo6162(interfaceC1239Arr, zArr, interfaceC4254Arr, zArr2, j3);
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˋⁱ */
    public final void mo6163(InterfaceC4295 interfaceC4295, long j) {
        this.f16624 = interfaceC4295;
        InterfaceC4294 interfaceC4294 = this.f16620;
        if (interfaceC4294 != null) {
            long j2 = this.f16625;
            if (j2 == -9223372036854775807L) {
                j2 = this.f16619;
            }
            interfaceC4294.mo6163(this, j2);
        }
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˎٴ */
    public final long mo6164(long j) {
        InterfaceC4294 interfaceC4294 = this.f16620;
        int i = AbstractC4470.f17202;
        return interfaceC4294.mo6164(j);
    }

    @Override // p374.InterfaceC4295
    /* renamed from: ˏʾ */
    public final void mo9719(InterfaceC4294 interfaceC4294) {
        InterfaceC4295 interfaceC4295 = this.f16624;
        int i = AbstractC4470.f17202;
        interfaceC4295.mo9719(this);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᴵ */
    public final long mo6165() {
        InterfaceC4294 interfaceC4294 = this.f16620;
        int i = AbstractC4470.f17202;
        return interfaceC4294.mo6165();
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᵢ */
    public final boolean mo6166(C5077 c5077) {
        InterfaceC4294 interfaceC4294 = this.f16620;
        return interfaceC4294 != null && interfaceC4294.mo6166(c5077);
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑʽ */
    public final long mo6167(long j, C5085 c5085) {
        InterfaceC4294 interfaceC4294 = this.f16620;
        int i = AbstractC4470.f17202;
        return interfaceC4294.mo6167(j, c5085);
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑי */
    public final void mo6168() {
        InterfaceC4294 interfaceC4294 = this.f16620;
        if (interfaceC4294 != null) {
            interfaceC4294.mo6168();
            return;
        }
        InterfaceC4277 interfaceC4277 = this.f16622;
        if (interfaceC4277 != null) {
            interfaceC4277.mo6117();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9740(C4290 c4290) {
        long j = this.f16625;
        if (j == -9223372036854775807L) {
            j = this.f16619;
        }
        InterfaceC4277 interfaceC4277 = this.f16622;
        interfaceC4277.getClass();
        InterfaceC4294 interfaceC4294Mo6113 = interfaceC4277.mo6113(c4290, this.f16621, j);
        this.f16620 = interfaceC4294Mo6113;
        if (this.f16624 != null) {
            interfaceC4294Mo6113.mo6163(this, j);
        }
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᴵʿ */
    public final C4241 mo6169() {
        InterfaceC4294 interfaceC4294 = this.f16620;
        int i = AbstractC4470.f17202;
        return interfaceC4294.mo6169();
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᵎˏ */
    public final void mo6170(long j) {
        InterfaceC4294 interfaceC4294 = this.f16620;
        int i = AbstractC4470.f17202;
        interfaceC4294.mo6170(j);
    }

    @Override // p374.InterfaceC4258
    /* renamed from: ᵎـ */
    public final void mo7664(InterfaceC4280 interfaceC4280) {
        InterfaceC4295 interfaceC4295 = this.f16624;
        int i = AbstractC4470.f17202;
        interfaceC4295.mo7664(this);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹳˎ */
    public final void mo6171(long j) {
        InterfaceC4294 interfaceC4294 = this.f16620;
        int i = AbstractC4470.f17202;
        interfaceC4294.mo6171(j);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹶˆ */
    public final long mo6173() {
        InterfaceC4294 interfaceC4294 = this.f16620;
        int i = AbstractC4470.f17202;
        return interfaceC4294.mo6173();
    }
}
