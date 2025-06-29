package p224;

/* renamed from: ˏᵔ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2981 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f11458;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f11459;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public byte[] f11460;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public byte[] f11461;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7404(byte[] bArr) {
        this.f11461 = bArr;
        this.f11458 = 0;
        this.f11459 = 0;
        if (this.f11460 == null) {
            this.f11460 = new byte[256];
        }
        for (int i = 0; i < 256; i++) {
            this.f11460[i] = (byte) i;
        }
        int length = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = bArr[length] & 255;
            byte[] bArr2 = this.f11460;
            byte b = bArr2[i3];
            i2 = (i4 + b + i2) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
            length = (length + 1) % bArr.length;
        }
    }
}
