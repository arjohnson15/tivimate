package p042;

import java.security.DigestException;
import java.security.MessageDigest;
import ˆʽ.ᵎˏ;

/* renamed from: ʽˎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1288 extends MessageDigest {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5293;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f5294;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f5295;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f5296;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final byte[] f5297;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f5298;

    public C1288() {
        super("MD4");
        this.f5296 = 1732584193;
        this.f5293 = -271733879;
        this.f5295 = -1732584194;
        this.f5298 = 271733878;
        this.f5297 = new byte[64];
    }

    @Override // java.security.MessageDigestSpi
    public final int engineDigest(byte[] bArr, int i, int i2) throws DigestException {
        if (i < 0 || i + i2 >= bArr.length) {
            throw new DigestException("Wrong offset or not enough space to store the digest");
        }
        int iMin = Math.min(i2, 16);
        System.arraycopy(engineDigest(), 0, bArr, i, iMin);
        return iMin;
    }

    @Override // java.security.MessageDigestSpi
    public final byte[] engineDigest() {
        long j = this.f5294;
        int i = (int) (j % 64);
        int i2 = i < 56 ? 64 - i : 128 - i;
        byte[] bArr = new byte[i2];
        bArr[0] = Byte.MIN_VALUE;
        long j2 = j << 3;
        int i3 = i2 - 8;
        int i4 = 0;
        while (i4 < 8) {
            bArr[i3] = (byte) (j2 >>> (i4 << 3));
            i4++;
            i3++;
        }
        engineUpdate(bArr, 0, i2);
        int i5 = this.f5296;
        int i6 = this.f5293;
        int i7 = this.f5295;
        int i8 = this.f5298;
        byte[] bArr2 = {(byte) i5, (byte) (i5 >>> 8), (byte) (i5 >>> 16), (byte) (i5 >>> 24), (byte) i6, (byte) (i6 >>> 8), (byte) (i6 >>> 16), (byte) (i6 >>> 24), (byte) i7, (byte) (i7 >>> 8), (byte) (i7 >>> 16), (byte) (i7 >>> 24), (byte) i8, (byte) (i8 >>> 8), (byte) (i8 >>> 16), (byte) (i8 >>> 24)};
        engineReset();
        return bArr2;
    }

    @Override // java.security.MessageDigestSpi
    public final int engineGetDigestLength() {
        return 16;
    }

    @Override // java.security.MessageDigestSpi
    public final void engineReset() {
        this.f5296 = 1732584193;
        this.f5293 = -271733879;
        this.f5295 = -1732584194;
        this.f5298 = 271733878;
        this.f5294 = 0L;
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte b) {
        long j = this.f5294;
        int i = (int) (j % 64);
        byte[] bArr = this.f5297;
        bArr[i] = b;
        this.f5294 = j + 1;
        if (i == 63) {
            m4580(0, bArr);
        }
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        long j = this.f5294;
        int i3 = (int) (j % 64);
        int i4 = 64 - i3;
        this.f5294 = j + i2;
        byte[] bArr2 = this.f5297;
        int i5 = 0;
        if (i2 >= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i4);
            m4580(0, bArr2);
            while (true) {
                int i6 = i4 + 64;
                if (i4 + 63 >= i2) {
                    break;
                }
                m4580(i4 + i, bArr);
                i4 = i6;
            }
            i5 = i4;
            i3 = 0;
        }
        if (i5 < i2) {
            System.arraycopy(bArr, i + i5, bArr2, i3, i2 - i5);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4580(int i, byte[] bArr) {
        int i2 = this.f5296;
        int i3 = this.f5293;
        int i4 = this.f5295;
        int i5 = this.f5298;
        int[] iArr = new int[16];
        int i6 = i;
        for (int i7 = 0; i7 < 16; i7++) {
            int i8 = i6 + 3;
            int i9 = ((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255) | ((bArr[i6 + 2] & 255) << 16);
            i6 += 4;
            iArr[i7] = i9 | ((bArr[i8] & 255) << 24);
        }
        int i10 = this.f5296;
        int i11 = this.f5293;
        int i12 = this.f5295;
        int i13 = ~i11;
        int i14 = this.f5298;
        int i15 = iArr[0];
        int i16 = ((i11 & i12) | (i13 & i14)) + i15 + i10;
        int i17 = (i16 << 3) | (i16 >>> 29);
        int i18 = (i17 & i11) | ((~i17) & i12);
        int i19 = iArr[1];
        int i20 = i18 + i19 + i14;
        int i21 = (i20 >>> 25) | (i20 << 7);
        int i22 = (i21 & i17) | ((~i21) & i11);
        int i23 = iArr[2];
        int i24 = i22 + i23 + i12;
        int i25 = (i24 << 11) | (i24 >>> 21);
        int i26 = (i25 & i21) | ((~i25) & i17);
        int i27 = iArr[3];
        int i28 = i26 + i27 + i11;
        int i29 = (i28 << 19) | (i28 >>> 13);
        int i30 = ((~i29) & i21) | (i29 & i25);
        int i31 = iArr[4];
        int i32 = i30 + i31 + i17;
        int i33 = (i32 << 3) | (i32 >>> 29);
        int i34 = ((~i33) & i25) | (i33 & i29);
        int i35 = iArr[5];
        int i36 = i34 + i35 + i21;
        int i37 = (i36 >>> 25) | (i36 << 7);
        int i38 = ((~i37) & i29) | (i37 & i33);
        int i39 = iArr[6];
        int i40 = i38 + i39 + i25;
        int i41 = (i40 >>> 21) | (i40 << 11);
        int i42 = ((~i41) & i33) | (i41 & i37);
        int i43 = iArr[7];
        int i44 = i42 + i43 + i29;
        int i45 = (i44 >>> 13) | (i44 << 19);
        int i46 = ((~i45) & i37) | (i45 & i41);
        int i47 = iArr[8];
        int i48 = i46 + i47 + i33;
        int i49 = (i48 >>> 29) | (i48 << 3);
        int i50 = ((~i49) & i41) | (i49 & i45);
        int i51 = iArr[9];
        int i52 = i50 + i51 + i37;
        int i53 = (i52 >>> 25) | (i52 << 7);
        int i54 = (i53 & i49) | ((~i53) & i45);
        int i55 = iArr[10];
        int i56 = i54 + i55 + i41;
        int i57 = (i56 << 11) | (i56 >>> 21);
        int i58 = (i57 & i53) | ((~i57) & i49);
        int i59 = iArr[11];
        int i60 = i58 + i59 + i45;
        int i61 = (i60 << 19) | (i60 >>> 13);
        int i62 = (i61 & i57) | ((~i61) & i53);
        int i63 = iArr[12];
        int i64 = i62 + i63 + i49;
        int i65 = (i64 << 3) | (i64 >>> 29);
        int i66 = (i65 & i61) | ((~i65) & i57);
        int i67 = iArr[13];
        int i68 = i66 + i67 + i53;
        int i69 = (i68 << 7) | (i68 >>> 25);
        int i70 = (i69 & i65) | ((~i69) & i61);
        int i71 = iArr[14];
        int i72 = i70 + i71 + i57;
        int i73 = (i72 << 11) | (i72 >>> 21);
        int i74 = (i73 & i69) | ((~i73) & i65);
        int i75 = iArr[15];
        int i76 = i74 + i75 + i61;
        int i77 = (i76 << 19) | (i76 >>> 13);
        int i78 = ᵎˏ.ˋˊ(((i73 | i69) & i77) | (i73 & i69), i15, 1518500249, i65);
        int i79 = (i78 >>> 29) | (i78 << 3);
        int i80 = ᵎˏ.ˋˊ(((i77 | i73) & i79) | (i77 & i73), i31, 1518500249, i69);
        int i81 = (i80 >>> 27) | (i80 << 5);
        int i82 = ᵎˏ.ˋˊ(((i79 | i77) & i81) | (i79 & i77), i47, 1518500249, i73);
        int i83 = (i82 >>> 23) | (i82 << 9);
        int i84 = ᵎˏ.ˋˊ(((i81 | i79) & i83) | (i81 & i79), i63, 1518500249, i77);
        int i85 = (i84 >>> 19) | (i84 << 13);
        int i86 = ᵎˏ.ˋˊ(((i83 | i81) & i85) | (i83 & i81), i19, 1518500249, i79);
        int i87 = (i86 >>> 29) | (i86 << 3);
        int i88 = ᵎˏ.ˋˊ(((i85 | i83) & i87) | (i85 & i83), i35, 1518500249, i81);
        int i89 = (i88 >>> 27) | (i88 << 5);
        int i90 = ᵎˏ.ˋˊ(((i87 | i85) & i89) | (i87 & i85), i51, 1518500249, i83);
        int i91 = (i90 >>> 23) | (i90 << 9);
        int i92 = ᵎˏ.ˋˊ(((i89 | i87) & i91) | (i89 & i87), i67, 1518500249, i85);
        int i93 = (i92 >>> 19) | (i92 << 13);
        int i94 = ᵎˏ.ˋˊ(((i91 | i89) & i93) | (i91 & i89), i23, 1518500249, i87);
        int i95 = (i94 >>> 29) | (i94 << 3);
        int i96 = ᵎˏ.ˋˊ(((i93 | i91) & i95) | (i93 & i91), i39, 1518500249, i89);
        int i97 = (i96 >>> 27) | (i96 << 5);
        int i98 = ᵎˏ.ˋˊ(((i95 | i93) & i97) | (i95 & i93), i55, 1518500249, i91);
        int i99 = (i98 >>> 23) | (i98 << 9);
        int i100 = ᵎˏ.ˋˊ(((i97 | i95) & i99) | (i97 & i95), i71, 1518500249, i93);
        int i101 = (i100 >>> 19) | (i100 << 13);
        int i102 = ᵎˏ.ˋˊ(((i99 | i97) & i101) | (i99 & i97), i27, 1518500249, i95);
        int i103 = (i102 >>> 29) | (i102 << 3);
        int i104 = ᵎˏ.ˋˊ(((i101 | i99) & i103) | (i101 & i99), i43, 1518500249, i97);
        int i105 = (i104 >>> 27) | (i104 << 5);
        int i106 = ᵎˏ.ˋˊ(((i103 | i101) & i105) | (i103 & i101), i59, 1518500249, i99);
        int i107 = (i106 >>> 23) | (i106 << 9);
        int i108 = ᵎˏ.ˋˊ(((i105 | i103) & i107) | (i105 & i103), i75, 1518500249, i101);
        int i109 = (i108 >>> 19) | (i108 << 13);
        int i110 = ᵎˏ.ˋˊ((i109 ^ i107) ^ i105, i15, 1859775393, i103);
        int i111 = (i110 >>> 29) | (i110 << 3);
        int i112 = ᵎˏ.ˋˊ((i111 ^ i109) ^ i107, i47, 1859775393, i105);
        int i113 = (i112 >>> 23) | (i112 << 9);
        int i114 = ᵎˏ.ˋˊ((i113 ^ i111) ^ i109, i31, 1859775393, i107);
        int i115 = (i114 >>> 21) | (i114 << 11);
        int i116 = ᵎˏ.ˋˊ((i115 ^ i113) ^ i111, i63, 1859775393, i109);
        int i117 = (i116 >>> 17) | (i116 << 15);
        int i118 = ᵎˏ.ˋˊ((i117 ^ i115) ^ i113, i23, 1859775393, i111);
        int i119 = (i118 >>> 29) | (i118 << 3);
        int i120 = ᵎˏ.ˋˊ((i119 ^ i117) ^ i115, i55, 1859775393, i113);
        int i121 = (i120 >>> 23) | (i120 << 9);
        int i122 = ᵎˏ.ˋˊ((i121 ^ i119) ^ i117, i39, 1859775393, i115);
        int i123 = (i122 >>> 21) | (i122 << 11);
        int i124 = ᵎˏ.ˋˊ((i123 ^ i121) ^ i119, i71, 1859775393, i117);
        int i125 = (i124 >>> 17) | (i124 << 15);
        int i126 = ᵎˏ.ˋˊ((i125 ^ i123) ^ i121, i19, 1859775393, i119);
        int i127 = (i126 >>> 29) | (i126 << 3);
        int i128 = ᵎˏ.ˋˊ((i127 ^ i125) ^ i123, i51, 1859775393, i121);
        int i129 = (i128 >>> 23) | (i128 << 9);
        int i130 = ᵎˏ.ˋˊ((i129 ^ i127) ^ i125, i35, 1859775393, i123);
        int i131 = (i130 >>> 21) | (i130 << 11);
        int i132 = ᵎˏ.ˋˊ((i131 ^ i129) ^ i127, i67, 1859775393, i125);
        int i133 = (i132 >>> 17) | (i132 << 15);
        int i134 = ᵎˏ.ˋˊ((i133 ^ i131) ^ i129, i27, 1859775393, i127);
        int i135 = (i134 >>> 29) | (i134 << 3);
        int i136 = ᵎˏ.ˋˊ((i135 ^ i133) ^ i131, i59, 1859775393, i129);
        int i137 = (i136 >>> 23) | (i136 << 9);
        int i138 = ᵎˏ.ˋˊ((i137 ^ i135) ^ i133, i43, 1859775393, i131);
        int i139 = (i138 >>> 21) | (i138 << 11);
        int i140 = ᵎˏ.ˋˊ((i139 ^ i137) ^ i135, i75, 1859775393, i133);
        this.f5296 = i135 + i2;
        this.f5293 = ((i140 >>> 17) | (i140 << 15)) + i3;
        this.f5295 = i139 + i4;
        this.f5298 = i137 + i5;
    }
}
