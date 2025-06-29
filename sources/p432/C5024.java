package p432;

import ᵎﹳ.ᐧʻ;

/* renamed from: ﹶٴ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5024 extends AbstractC5026 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f19063;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int[] f19064;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f19065;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f19066;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f19067;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f19068;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static int m11112(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static int m11113(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static int m11114(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static void m11115(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // p432.AbstractC5026
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int mo11116() {
        return 16;
    }

    @Override // p432.AbstractC5026
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo11117(AbstractC5026 abstractC5026) {
        m11118((C5024) abstractC5026);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m11118(C5024 c5024) {
        m11130(c5024);
        this.f19067 = c5024.f19067;
        this.f19063 = c5024.f19063;
        this.f19065 = c5024.f19065;
        this.f19066 = c5024.f19066;
        int[] iArr = this.f19064;
        int[] iArr2 = c5024.f19064;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f19068 = c5024.f19068;
    }

    @Override // p432.AbstractC5026
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void mo11119(int i, byte[] bArr) {
        int i2 = this.f19068;
        int i3 = i2 + 1;
        this.f19068 = i3;
        this.f19064[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            mo11122();
        }
    }

    @Override // p432.AbstractC5026
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int mo11120(int i, byte[] bArr) {
        m11133();
        m11115(bArr, this.f19067, i);
        m11115(bArr, this.f19063, i + 4);
        m11115(bArr, this.f19065, i + 8);
        m11115(bArr, this.f19066, i + 12);
        mo11124();
        return 16;
    }

    @Override // p432.AbstractC5026
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC5026 mo11121() {
        C5024 c5024 = new C5024(this);
        c5024.f19064 = new int[16];
        c5024.m11118(this);
        return c5024;
    }

    @Override // p432.AbstractC5026
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void mo11122() {
        int i = this.f19067;
        int i2 = this.f19063;
        int i3 = this.f19065;
        int i4 = this.f19066;
        int iM11112 = m11112(i2, i3, i4) + i;
        int[] iArr = this.f19064;
        int iM11113 = m11113(iM11112 + iArr[0], 3);
        int iM111132 = m11113(m11112(iM11113, i2, i3) + i4 + iArr[1], 7);
        int iM111133 = m11113(m11112(iM111132, iM11113, i2) + i3 + iArr[2], 11);
        int iM111134 = m11113(m11112(iM111133, iM111132, iM11113) + i2 + iArr[3], 19);
        int iM111135 = m11113(m11112(iM111134, iM111133, iM111132) + iM11113 + iArr[4], 3);
        int iM111136 = m11113(m11112(iM111135, iM111134, iM111133) + iM111132 + iArr[5], 7);
        int iM111137 = m11113(m11112(iM111136, iM111135, iM111134) + iM111133 + iArr[6], 11);
        int iM111138 = m11113(m11112(iM111137, iM111136, iM111135) + iM111134 + iArr[7], 19);
        int iM111139 = m11113(m11112(iM111138, iM111137, iM111136) + iM111135 + iArr[8], 3);
        int iM1111310 = m11113(m11112(iM111139, iM111138, iM111137) + iM111136 + iArr[9], 7);
        int iM1111311 = m11113(m11112(iM1111310, iM111139, iM111138) + iM111137 + iArr[10], 11);
        int iM1111312 = m11113(m11112(iM1111311, iM1111310, iM111139) + iM111138 + iArr[11], 19);
        int iM1111313 = m11113(m11112(iM1111312, iM1111311, iM1111310) + iM111139 + iArr[12], 3);
        int iM1111314 = m11113(m11112(iM1111313, iM1111312, iM1111311) + iM1111310 + iArr[13], 7);
        int iM1111315 = m11113(m11112(iM1111314, iM1111313, iM1111312) + iM1111311 + iArr[14], 11);
        int iM1111316 = m11113(m11112(iM1111315, iM1111314, iM1111313) + iM1111312 + iArr[15], 19);
        int i5 = ᐧʻ.ˉי(m11114(iM1111316, iM1111315, iM1111314) + iM1111313, iArr[0], 1518500249, 3);
        int i6 = ᐧʻ.ˉי(m11114(i5, iM1111316, iM1111315) + iM1111314, iArr[4], 1518500249, 5);
        int i7 = ᐧʻ.ˉי(m11114(i6, i5, iM1111316) + iM1111315, iArr[8], 1518500249, 9);
        int i8 = ᐧʻ.ˉי(m11114(i7, i6, i5) + iM1111316, iArr[12], 1518500249, 13);
        int i9 = ᐧʻ.ˉי(m11114(i8, i7, i6) + i5, iArr[1], 1518500249, 3);
        int i10 = ᐧʻ.ˉי(m11114(i9, i8, i7) + i6, iArr[5], 1518500249, 5);
        int i11 = ᐧʻ.ˉי(m11114(i10, i9, i8) + i7, iArr[9], 1518500249, 9);
        int i12 = ᐧʻ.ˉי(m11114(i11, i10, i9) + i8, iArr[13], 1518500249, 13);
        int i13 = ᐧʻ.ˉי(m11114(i12, i11, i10) + i9, iArr[2], 1518500249, 3);
        int i14 = ᐧʻ.ˉי(m11114(i13, i12, i11) + i10, iArr[6], 1518500249, 5);
        int i15 = ᐧʻ.ˉי(m11114(i14, i13, i12) + i11, iArr[10], 1518500249, 9);
        int i16 = ᐧʻ.ˉי(m11114(i15, i14, i13) + i12, iArr[14], 1518500249, 13);
        int i17 = ᐧʻ.ˉי(m11114(i16, i15, i14) + i13, iArr[3], 1518500249, 3);
        int i18 = ᐧʻ.ˉי(m11114(i17, i16, i15) + i14, iArr[7], 1518500249, 5);
        int i19 = ᐧʻ.ˉי(m11114(i18, i17, i16) + i15, iArr[11], 1518500249, 9);
        int i20 = ᐧʻ.ˉי(m11114(i19, i18, i17) + i16, iArr[15], 1518500249, 13);
        int i21 = ᐧʻ.ˉי(i17 + ((i20 ^ i19) ^ i18), iArr[0], 1859775393, 3);
        int i22 = ᐧʻ.ˉי(i18 + ((i21 ^ i20) ^ i19), iArr[8], 1859775393, 9);
        int i23 = ᐧʻ.ˉי(i19 + ((i22 ^ i21) ^ i20), iArr[4], 1859775393, 11);
        int i24 = ᐧʻ.ˉי(i20 + ((i23 ^ i22) ^ i21), iArr[12], 1859775393, 15);
        int i25 = ᐧʻ.ˉי(i21 + ((i24 ^ i23) ^ i22), iArr[2], 1859775393, 3);
        int i26 = ᐧʻ.ˉי(i22 + ((i25 ^ i24) ^ i23), iArr[10], 1859775393, 9);
        int i27 = ᐧʻ.ˉי(i23 + ((i26 ^ i25) ^ i24), iArr[6], 1859775393, 11);
        int i28 = ᐧʻ.ˉי(i24 + ((i27 ^ i26) ^ i25), iArr[14], 1859775393, 15);
        int i29 = ᐧʻ.ˉי(i25 + ((i28 ^ i27) ^ i26), iArr[1], 1859775393, 3);
        int i30 = ᐧʻ.ˉי(i26 + ((i29 ^ i28) ^ i27), iArr[9], 1859775393, 9);
        int i31 = ᐧʻ.ˉי(i27 + ((i30 ^ i29) ^ i28), iArr[5], 1859775393, 11);
        int i32 = ᐧʻ.ˉי(i28 + ((i31 ^ i30) ^ i29), iArr[13], 1859775393, 15);
        int i33 = ᐧʻ.ˉי(i29 + ((i32 ^ i31) ^ i30), iArr[3], 1859775393, 3);
        int i34 = ᐧʻ.ˉי(i30 + ((i33 ^ i32) ^ i31), iArr[11], 1859775393, 9);
        int i35 = ᐧʻ.ˉי(i31 + ((i34 ^ i33) ^ i32), iArr[7], 1859775393, 11);
        int i36 = ᐧʻ.ˉי(i32 + ((i35 ^ i34) ^ i33), iArr[15], 1859775393, 15);
        this.f19067 += i33;
        this.f19063 += i36;
        this.f19065 += i35;
        this.f19066 += i34;
        this.f19068 = 0;
        for (int i37 = 0; i37 != iArr.length; i37++) {
            iArr[i37] = 0;
        }
    }

    @Override // p432.AbstractC5026
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void mo11123(long j) {
        if (this.f19068 > 14) {
            mo11122();
        }
        int[] iArr = this.f19064;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // p432.AbstractC5026
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void mo11124() {
        super.mo11124();
        this.f19067 = 1732584193;
        this.f19063 = -271733879;
        this.f19065 = -1732584194;
        this.f19066 = 271733878;
        this.f19068 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f19064;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}
