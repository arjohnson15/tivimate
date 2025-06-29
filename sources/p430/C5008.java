package p430;

import p366.InterfaceC4160;

/* renamed from: ﹶˏ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5008 extends AbstractC4996 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ int f18997;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ byte[] f18998;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C5002 f18999;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f19000;

    public C5008(C5002 c5002, int i, byte[] bArr, int i2) {
        this.f18999 = c5002;
        this.f18997 = i;
        this.f18998 = bArr;
        this.f19000 = i2;
    }

    @Override // p430.AbstractC4996
    public final long contentLength() {
        return this.f18997;
    }

    @Override // p430.AbstractC4996
    public final C5002 contentType() {
        return this.f18999;
    }

    @Override // p430.AbstractC4996
    public final void writeTo(InterfaceC4160 interfaceC4160) {
        interfaceC4160.write(this.f18998, this.f19000, this.f18997);
    }
}
