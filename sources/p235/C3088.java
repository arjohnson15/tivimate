package p235;

import p223.AbstractC2978;

/* renamed from: ˑˑ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3088 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final int[] f11916 = new int[256];

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int[] f11917 = new int[3];

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                i2 = (i2 & 1) == 1 ? (i2 >>> 1) ^ (-306674912) : i2 >>> 1;
            }
            f11916[i] = i2;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7589(char[] cArr, boolean z) {
        int[] iArr = this.f11917;
        iArr[0] = 305419896;
        iArr[1] = 591751049;
        iArr[2] = 878082192;
        for (byte b : AbstractC2978.m7351(cArr, z)) {
            m7590((byte) (b & 255));
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7590(byte b) {
        int[] iArr = this.f11917;
        int i = iArr[0];
        int[] iArr2 = f11916;
        int i2 = iArr2[(b ^ i) & 255] ^ (i >>> 8);
        iArr[0] = i2;
        int i3 = iArr[1] + (i2 & 255);
        iArr[1] = i3;
        int i4 = (i3 * 134775813) + 1;
        iArr[1] = i4;
        int i5 = iArr[2];
        iArr[2] = iArr2[(i5 ^ ((byte) (i4 >> 24))) & 255] ^ (i5 >>> 8);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte m7591() {
        int i = this.f11917[2] | 2;
        return (byte) ((i * (i ^ 1)) >>> 8);
    }
}
