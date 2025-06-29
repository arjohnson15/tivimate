package p143;

import p018.C1116;
import p283.C3380;
import p332.AbstractC3777;
import p409.InterfaceC4675;

/* renamed from: ˉـ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2228 extends C3380 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final InterfaceC4675 f8870;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3380 f8871;

    public C2228(C1116 c1116, C3380 c3380) {
        this.f8871 = c3380;
        C2226 c2226 = (C2226) c1116.f4733;
        byte[] bArr = c2226.f8857;
        InterfaceC4675 interfaceC4675M10574 = c2226.f8854.m10574(c2226.f8855);
        interfaceC4675M10574.mo6780(bArr);
        this.f8870 = interfaceC4675M10574;
    }

    @Override // p332.AbstractC3777
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC3777 mo6213(int i, byte[] bArr) {
        this.f8870.mo6779(bArr, 0, i);
        this.f8871.mo6213(i, bArr);
        return this;
    }

    @Override // p332.AbstractC3777
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC3777 mo6214(byte b) {
        this.f8870.mo6782(b);
        this.f8871.mo6214(b);
        return this;
    }
}
