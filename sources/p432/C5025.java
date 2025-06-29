package p432;

import ᵎﹳ.ᐧʻ;

/* renamed from: ﹶٴ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5025 extends AbstractC5026 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f19069;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int[] f19070;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f19071;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f19072;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f19073;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f19074;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static int m11125(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static int m11126(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static int m11127(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static void m11128(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // p432.AbstractC5026
    /* renamed from: ʿʼ */
    public final int mo11116() {
        return 16;
    }

    @Override // p432.AbstractC5026
    /* renamed from: ˉי */
    public final void mo11117(AbstractC5026 abstractC5026) {
        m11129((C5025) abstractC5026);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m11129(C5025 c5025) {
        m11130(c5025);
        this.f19073 = c5025.f19073;
        this.f19069 = c5025.f19069;
        this.f19071 = c5025.f19071;
        this.f19072 = c5025.f19072;
        int[] iArr = this.f19070;
        int[] iArr2 = c5025.f19070;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f19074 = c5025.f19074;
    }

    @Override // p432.AbstractC5026
    /* renamed from: ˏᵢ */
    public final void mo11119(int i, byte[] bArr) {
        int i2 = this.f19074;
        int i3 = i2 + 1;
        this.f19074 = i3;
        this.f19070[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            mo11122();
        }
    }

    @Override // p432.AbstractC5026
    /* renamed from: ˑʽ */
    public final int mo11120(int i, byte[] bArr) {
        m11133();
        m11128(bArr, this.f19073, i);
        m11128(bArr, this.f19069, i + 4);
        m11128(bArr, this.f19071, i + 8);
        m11128(bArr, this.f19072, i + 12);
        mo11124();
        return 16;
    }

    @Override // p432.AbstractC5026
    /* renamed from: ـﹶ */
    public final AbstractC5026 mo11121() {
        C5025 c5025 = new C5025(this);
        c5025.f19070 = new int[16];
        c5025.m11129(this);
        return c5025;
    }

    @Override // p432.AbstractC5026
    /* renamed from: ٴˎ */
    public final void mo11122() {
        int i = this.f19073;
        int i2 = this.f19069;
        int i3 = this.f19071;
        int i4 = this.f19072;
        int iM11125 = m11125(i2, i3, i4) + i;
        int[] iArr = this.f19070;
        int i5 = ᐧʻ.ˏʾ(iM11125, iArr[0], -680876936, 7, i2);
        int i6 = ᐧʻ.ˏʾ(m11125(i5, i2, i3) + i4, iArr[1], -389564586, 12, i5);
        int i7 = ᐧʻ.ˏʾ(m11125(i6, i5, i2) + i3, iArr[2], 606105819, 17, i6);
        int i8 = ᐧʻ.ˏʾ(m11125(i7, i6, i5) + i2, iArr[3], -1044525330, 22, i7);
        int i9 = ᐧʻ.ˏʾ(m11125(i8, i7, i6) + i5, iArr[4], -176418897, 7, i8);
        int i10 = ᐧʻ.ˏʾ(m11125(i9, i8, i7) + i6, iArr[5], 1200080426, 12, i9);
        int i11 = ᐧʻ.ˏʾ(m11125(i10, i9, i8) + i7, iArr[6], -1473231341, 17, i10);
        int i12 = ᐧʻ.ˏʾ(m11125(i11, i10, i9) + i8, iArr[7], -45705983, 22, i11);
        int i13 = ᐧʻ.ˏʾ(m11125(i12, i11, i10) + i9, iArr[8], 1770035416, 7, i12);
        int i14 = ᐧʻ.ˏʾ(m11125(i13, i12, i11) + i10, iArr[9], -1958414417, 12, i13);
        int i15 = ᐧʻ.ˏʾ(m11125(i14, i13, i12) + i11, iArr[10], -42063, 17, i14);
        int i16 = ᐧʻ.ˏʾ(m11125(i15, i14, i13) + i12, iArr[11], -1990404162, 22, i15);
        int i17 = ᐧʻ.ˏʾ(m11125(i16, i15, i14) + i13, iArr[12], 1804603682, 7, i16);
        int i18 = ᐧʻ.ˏʾ(m11125(i17, i16, i15) + i14, iArr[13], -40341101, 12, i17);
        int i19 = ᐧʻ.ˏʾ(m11125(i18, i17, i16) + i15, iArr[14], -1502002290, 17, i18);
        int i20 = ᐧʻ.ˏʾ(m11125(i19, i18, i17) + i16, iArr[15], 1236535329, 22, i19);
        int i21 = ᐧʻ.ˏʾ(m11127(i20, i19, i18) + i17, iArr[1], -165796510, 5, i20);
        int i22 = ᐧʻ.ˏʾ(m11127(i21, i20, i19) + i18, iArr[6], -1069501632, 9, i21);
        int i23 = ᐧʻ.ˏʾ(m11127(i22, i21, i20) + i19, iArr[11], 643717713, 14, i22);
        int i24 = ᐧʻ.ˏʾ(m11127(i23, i22, i21) + i20, iArr[0], -373897302, 20, i23);
        int i25 = ᐧʻ.ˏʾ(m11127(i24, i23, i22) + i21, iArr[5], -701558691, 5, i24);
        int i26 = ᐧʻ.ˏʾ(m11127(i25, i24, i23) + i22, iArr[10], 38016083, 9, i25);
        int i27 = ᐧʻ.ˏʾ(m11127(i26, i25, i24) + i23, iArr[15], -660478335, 14, i26);
        int i28 = ᐧʻ.ˏʾ(m11127(i27, i26, i25) + i24, iArr[4], -405537848, 20, i27);
        int i29 = ᐧʻ.ˏʾ(m11127(i28, i27, i26) + i25, iArr[9], 568446438, 5, i28);
        int i30 = ᐧʻ.ˏʾ(m11127(i29, i28, i27) + i26, iArr[14], -1019803690, 9, i29);
        int i31 = ᐧʻ.ˏʾ(m11127(i30, i29, i28) + i27, iArr[3], -187363961, 14, i30);
        int i32 = ᐧʻ.ˏʾ(m11127(i31, i30, i29) + i28, iArr[8], 1163531501, 20, i31);
        int i33 = ᐧʻ.ˏʾ(m11127(i32, i31, i30) + i29, iArr[13], -1444681467, 5, i32);
        int i34 = ᐧʻ.ˏʾ(m11127(i33, i32, i31) + i30, iArr[2], -51403784, 9, i33);
        int i35 = ᐧʻ.ˏʾ(m11127(i34, i33, i32) + i31, iArr[7], 1735328473, 14, i34);
        int i36 = ᐧʻ.ˏʾ(m11127(i35, i34, i33) + i32, iArr[12], -1926607734, 20, i35);
        int i37 = ᐧʻ.ˏʾ(i33 + ((i36 ^ i35) ^ i34), iArr[5], -378558, 4, i36);
        int i38 = ᐧʻ.ˏʾ(i34 + ((i37 ^ i36) ^ i35), iArr[8], -2022574463, 11, i37);
        int i39 = ᐧʻ.ˏʾ(i35 + ((i38 ^ i37) ^ i36), iArr[11], 1839030562, 16, i38);
        int i40 = ᐧʻ.ˏʾ(i36 + ((i39 ^ i38) ^ i37), iArr[14], -35309556, 23, i39);
        int i41 = ᐧʻ.ˏʾ(i37 + ((i40 ^ i39) ^ i38), iArr[1], -1530992060, 4, i40);
        int i42 = ᐧʻ.ˏʾ(i38 + ((i41 ^ i40) ^ i39), iArr[4], 1272893353, 11, i41);
        int i43 = ᐧʻ.ˏʾ(i39 + ((i42 ^ i41) ^ i40), iArr[7], -155497632, 16, i42);
        int i44 = ᐧʻ.ˏʾ(i40 + ((i43 ^ i42) ^ i41), iArr[10], -1094730640, 23, i43);
        int i45 = ᐧʻ.ˏʾ(i41 + ((i44 ^ i43) ^ i42), iArr[13], 681279174, 4, i44);
        int i46 = ᐧʻ.ˏʾ(i42 + ((i45 ^ i44) ^ i43), iArr[0], -358537222, 11, i45);
        int i47 = ᐧʻ.ˏʾ(i43 + ((i46 ^ i45) ^ i44), iArr[3], -722521979, 16, i46);
        int iM11126 = m11126(i44 + ((i47 ^ i46) ^ i45) + iArr[6] + 76029189, 23) + i47;
        int i48 = ᐧʻ.ˏʾ(i45 + ((iM11126 ^ i47) ^ i46), iArr[9], -640364487, 4, iM11126);
        int i49 = ᐧʻ.ˏʾ(i46 + ((i48 ^ iM11126) ^ i47), iArr[12], -421815835, 11, i48);
        int i50 = ᐧʻ.ˏʾ(i47 + ((i49 ^ i48) ^ iM11126), iArr[15], 530742520, 16, i49);
        int i51 = ᐧʻ.ˏʾ(iM11126 + ((i50 ^ i49) ^ i48), iArr[2], -995338651, 23, i50);
        int i52 = ᐧʻ.ˏʾ(i48 + (((~i49) | i51) ^ i50), iArr[0], -198630844, 6, i51);
        int i53 = ᐧʻ.ˏʾ(i49 + (((~i50) | i52) ^ i51), iArr[7], 1126891415, 10, i52);
        int i54 = ᐧʻ.ˏʾ(i50 + (((~i51) | i53) ^ i52), iArr[14], -1416354905, 15, i53);
        int i55 = ᐧʻ.ˏʾ(i51 + (((~i52) | i54) ^ i53), iArr[5], -57434055, 21, i54);
        int i56 = ᐧʻ.ˏʾ(i52 + (((~i53) | i55) ^ i54), iArr[12], 1700485571, 6, i55);
        int i57 = ᐧʻ.ˏʾ(i53 + (((~i54) | i56) ^ i55), iArr[3], -1894986606, 10, i56);
        int iM111262 = m11126(((i54 + (((~i55) | i57) ^ i56)) + iArr[10]) - 1051523, 15) + i57;
        int i58 = ᐧʻ.ˏʾ(i55 + (((~i56) | iM111262) ^ i57), iArr[1], -2054922799, 21, iM111262);
        int i59 = ᐧʻ.ˏʾ(i56 + (((~i57) | i58) ^ iM111262), iArr[8], 1873313359, 6, i58);
        int i60 = ᐧʻ.ˏʾ(i57 + (((~iM111262) | i59) ^ i58), iArr[15], -30611744, 10, i59);
        int i61 = ᐧʻ.ˏʾ(iM111262 + (((~i58) | i60) ^ i59), iArr[6], -1560198380, 15, i60);
        int i62 = ᐧʻ.ˏʾ(i58 + (((~i59) | i61) ^ i60), iArr[13], 1309151649, 21, i61);
        int i63 = ᐧʻ.ˏʾ(i59 + (((~i60) | i62) ^ i61), iArr[4], -145523070, 6, i62);
        int i64 = ᐧʻ.ˏʾ(i60 + (((~i61) | i63) ^ i62), iArr[11], -1120210379, 10, i63);
        int i65 = ᐧʻ.ˏʾ(i61 + (((~i62) | i64) ^ i63), iArr[2], 718787259, 15, i64);
        int i66 = ᐧʻ.ˏʾ(i62 + (((~i63) | i65) ^ i64), iArr[9], -343485551, 21, i65);
        this.f19073 += i63;
        this.f19069 += i66;
        this.f19071 += i65;
        this.f19072 += i64;
        this.f19074 = 0;
        for (int i67 = 0; i67 != iArr.length; i67++) {
            iArr[i67] = 0;
        }
    }

    @Override // p432.AbstractC5026
    /* renamed from: ᐧʻ */
    public final void mo11123(long j) {
        if (this.f19074 > 14) {
            mo11122();
        }
        int[] iArr = this.f19070;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // p432.AbstractC5026
    /* renamed from: ﹶˆ */
    public final void mo11124() {
        super.mo11124();
        this.f19073 = 1732584193;
        this.f19069 = -271733879;
        this.f19071 = -1732584194;
        this.f19072 = 271733878;
        this.f19074 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f19070;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}
