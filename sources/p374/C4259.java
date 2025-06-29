package p374;

import p036.InterfaceC1239;
import p438.C5077;
import p438.C5085;
import p438.C5101;

/* renamed from: ᵢˎ.ˎˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4259 implements InterfaceC4294, InterfaceC4295 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f16546;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public InterfaceC4295 f16547;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4294 f16548;

    public C4259(InterfaceC4294 interfaceC4294, long j) {
        this.f16548 = interfaceC4294;
        this.f16546 = j;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ʽᐧ */
    public final boolean mo6160() {
        return this.f16548.mo6160();
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˉי */
    public final long mo6161() {
        long jMo6161 = this.f16548.mo6161();
        if (jMo6161 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f16546 + jMo6161;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˉⁱ */
    public final long mo6162(InterfaceC1239[] interfaceC1239Arr, boolean[] zArr, InterfaceC4254[] interfaceC4254Arr, boolean[] zArr2, long j) {
        InterfaceC4254[] interfaceC4254Arr2 = new InterfaceC4254[interfaceC4254Arr.length];
        int i = 0;
        while (true) {
            InterfaceC4254 interfaceC4254 = null;
            if (i >= interfaceC4254Arr.length) {
                break;
            }
            C4288 c4288 = (C4288) interfaceC4254Arr[i];
            if (c4288 != null) {
                interfaceC4254 = c4288.f16686;
            }
            interfaceC4254Arr2[i] = interfaceC4254;
            i++;
        }
        long j2 = this.f16546;
        long jMo6162 = this.f16548.mo6162(interfaceC1239Arr, zArr, interfaceC4254Arr2, zArr2, j - j2);
        for (int i2 = 0; i2 < interfaceC4254Arr.length; i2++) {
            InterfaceC4254 interfaceC42542 = interfaceC4254Arr2[i2];
            if (interfaceC42542 == null) {
                interfaceC4254Arr[i2] = null;
            } else {
                InterfaceC4254 interfaceC42543 = interfaceC4254Arr[i2];
                if (interfaceC42543 == null || ((C4288) interfaceC42543).f16686 != interfaceC42542) {
                    interfaceC4254Arr[i2] = new C4288(interfaceC42542, j2);
                }
            }
        }
        return jMo6162 + j2;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˋⁱ */
    public final void mo6163(InterfaceC4295 interfaceC4295, long j) {
        this.f16547 = interfaceC4295;
        this.f16548.mo6163(this, j - this.f16546);
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˎٴ */
    public final long mo6164(long j) {
        long j2 = this.f16546;
        return this.f16548.mo6164(j - j2) + j2;
    }

    @Override // p374.InterfaceC4295
    /* renamed from: ˏʾ */
    public final void mo9719(InterfaceC4294 interfaceC4294) {
        InterfaceC4295 interfaceC4295 = this.f16547;
        interfaceC4295.getClass();
        interfaceC4295.mo9719(this);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᴵ */
    public final long mo6165() {
        long jMo6165 = this.f16548.mo6165();
        if (jMo6165 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f16546 + jMo6165;
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ˏᵢ */
    public final boolean mo6166(C5077 c5077) {
        C5101 c5101 = new C5101();
        c5101.f19424 = c5077.f19294;
        c5101.f19425 = c5077.f19295;
        c5101.f19426 = c5077.f19296 - this.f16546;
        return this.f16548.mo6166(new C5077(c5101));
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑʽ */
    public final long mo6167(long j, C5085 c5085) {
        long j2 = this.f16546;
        return this.f16548.mo6167(j - j2, c5085) + j2;
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ˑי */
    public final void mo6168() {
        this.f16548.mo6168();
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᴵʿ */
    public final C4241 mo6169() {
        return this.f16548.mo6169();
    }

    @Override // p374.InterfaceC4294
    /* renamed from: ᵎˏ */
    public final void mo6170(long j) {
        this.f16548.mo6170(j - this.f16546);
    }

    @Override // p374.InterfaceC4258
    /* renamed from: ᵎـ */
    public final void mo7664(InterfaceC4280 interfaceC4280) {
        InterfaceC4295 interfaceC4295 = this.f16547;
        interfaceC4295.getClass();
        interfaceC4295.mo7664(this);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹳˎ */
    public final void mo6171(long j) {
        this.f16548.mo6171(j - this.f16546);
    }

    @Override // p374.InterfaceC4280
    /* renamed from: ﹶˆ */
    public final long mo6173() {
        long jMo6173 = this.f16548.mo6173();
        if (jMo6173 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f16546 + jMo6173;
    }
}
