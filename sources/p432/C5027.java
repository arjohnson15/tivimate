package p432;

import ˏʼ.ʽᐧ;

/* renamed from: ﹶٴ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5027 extends AbstractC5026 {

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final int[] f19078 = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f19079;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f19080;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int[] f19081 = new int[64];

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f19082;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f19083;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f19084;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f19085;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f19086;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f19087;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f19088;

    public C5027() {
        mo11124();
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static int m11134(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static int m11135(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static int m11136(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static int m11137(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    @Override // p432.AbstractC5026
    /* renamed from: ʿʼ */
    public final int mo11116() {
        return 32;
    }

    @Override // p432.AbstractC5026
    /* renamed from: ˉי */
    public final void mo11117(AbstractC5026 abstractC5026) {
        m11138((C5027) abstractC5026);
    }

    @Override // p432.AbstractC5026
    /* renamed from: ˏᵢ */
    public final void mo11119(int i, byte[] bArr) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int i3 = this.f19082;
        this.f19081[i3] = i2;
        int i4 = i3 + 1;
        this.f19082 = i4;
        if (i4 == 16) {
            mo11122();
        }
    }

    @Override // p432.AbstractC5026
    /* renamed from: ˑʽ */
    public final int mo11120(int i, byte[] bArr) {
        m11133();
        ʽᐧ.ᵎˏ(bArr, this.f19087, i);
        ʽᐧ.ᵎˏ(bArr, this.f19079, i + 4);
        ʽᐧ.ᵎˏ(bArr, this.f19085, i + 8);
        ʽᐧ.ᵎˏ(bArr, this.f19086, i + 12);
        ʽᐧ.ᵎˏ(bArr, this.f19084, i + 16);
        ʽᐧ.ᵎˏ(bArr, this.f19088, i + 20);
        ʽᐧ.ᵎˏ(bArr, this.f19080, i + 24);
        ʽᐧ.ᵎˏ(bArr, this.f19083, i + 28);
        mo11124();
        return 32;
    }

    @Override // p432.AbstractC5026
    /* renamed from: ـﹶ */
    public final AbstractC5026 mo11121() {
        C5027 c5027 = new C5027(this);
        c5027.f19081 = new int[64];
        c5027.m11138(this);
        return c5027;
    }

    @Override // p432.AbstractC5026
    /* renamed from: ٴˎ */
    public final void mo11122() {
        int[] iArr;
        int i = 16;
        while (true) {
            iArr = this.f19081;
            if (i > 63) {
                break;
            }
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
            i++;
        }
        int iM11137 = this.f19087;
        int iM111372 = this.f19079;
        int iM111373 = this.f19085;
        int iM111374 = this.f19086;
        int i5 = this.f19084;
        int i6 = this.f19088;
        int i7 = this.f19080;
        int i8 = this.f19083;
        int i9 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            int iM11134 = m11134(i5, i6, i7) + m11136(i5);
            int[] iArr2 = f19078;
            int i11 = iM11134 + iArr2[i9] + iArr[i9] + i8;
            int i12 = iM111374 + i11;
            int iM111375 = m11137(iM11137, iM111372, iM111373) + m11135(iM11137) + i11;
            int i13 = i9 + 1;
            int iM111342 = m11134(i12, i5, i6) + m11136(i12) + iArr2[i13] + iArr[i13] + i7;
            int i14 = iM111373 + iM111342;
            int iM111376 = m11137(iM111375, iM11137, iM111372) + m11135(iM111375) + iM111342;
            int i15 = i9 + 2;
            int iM111343 = m11134(i14, i12, i5) + m11136(i14) + iArr2[i15] + iArr[i15] + i6;
            int i16 = iM111372 + iM111343;
            int iM111377 = m11137(iM111376, iM111375, iM11137) + m11135(iM111376) + iM111343;
            int i17 = i9 + 3;
            int iM111344 = m11134(i16, i14, i12) + m11136(i16) + iArr2[i17] + iArr[i17] + i5;
            int i18 = iM11137 + iM111344;
            int iM111378 = m11137(iM111377, iM111376, iM111375) + m11135(iM111377) + iM111344;
            int i19 = i9 + 4;
            int iM111345 = m11134(i18, i16, i14) + m11136(i18) + iArr2[i19] + iArr[i19] + i12;
            i8 = iM111375 + iM111345;
            iM111374 = m11137(iM111378, iM111377, iM111376) + m11135(iM111378) + iM111345;
            int i20 = i9 + 5;
            int iM111346 = m11134(i8, i18, i16) + m11136(i8) + iArr2[i20] + iArr[i20] + i14;
            i7 = iM111376 + iM111346;
            iM111373 = m11137(iM111374, iM111378, iM111377) + m11135(iM111374) + iM111346;
            int i21 = i9 + 6;
            int iM111347 = m11134(i7, i8, i18) + m11136(i7) + iArr2[i21] + iArr[i21] + i16;
            i6 = iM111377 + iM111347;
            iM111372 = m11137(iM111373, iM111374, iM111378) + m11135(iM111373) + iM111347;
            int i22 = i9 + 7;
            int iM111348 = m11134(i6, i7, i8) + m11136(i6) + iArr2[i22] + iArr[i22] + i18;
            i5 = iM111378 + iM111348;
            iM11137 = m11137(iM111372, iM111373, iM111374) + m11135(iM111372) + iM111348;
            i9 += 8;
        }
        this.f19087 += iM11137;
        this.f19079 += iM111372;
        this.f19085 += iM111373;
        this.f19086 += iM111374;
        this.f19084 += i5;
        this.f19088 += i6;
        this.f19080 += i7;
        this.f19083 += i8;
        this.f19082 = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            iArr[i23] = 0;
        }
    }

    @Override // p432.AbstractC5026
    /* renamed from: ᐧʻ */
    public final void mo11123(long j) {
        if (this.f19082 > 14) {
            mo11122();
        }
        int[] iArr = this.f19081;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m11138(C5027 c5027) {
        m11130(c5027);
        this.f19087 = c5027.f19087;
        this.f19079 = c5027.f19079;
        this.f19085 = c5027.f19085;
        this.f19086 = c5027.f19086;
        this.f19084 = c5027.f19084;
        this.f19088 = c5027.f19088;
        this.f19080 = c5027.f19080;
        this.f19083 = c5027.f19083;
        int[] iArr = this.f19081;
        int[] iArr2 = c5027.f19081;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f19082 = c5027.f19082;
    }

    @Override // p432.AbstractC5026
    /* renamed from: ﹶˆ */
    public final void mo11124() {
        super.mo11124();
        this.f19087 = 1779033703;
        this.f19079 = -1150833019;
        this.f19085 = 1013904242;
        this.f19086 = -1521486534;
        this.f19084 = 1359893119;
        this.f19088 = -1694144372;
        this.f19080 = 528734635;
        this.f19083 = 1541459225;
        this.f19082 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f19081;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}
