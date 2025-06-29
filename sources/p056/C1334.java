package p056;

import java.util.Arrays;
import p383.AbstractC4464;

/* renamed from: ʾˈ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1334 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f5420;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float f5421;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public int f5422;

    /* renamed from: ˉי, reason: contains not printable characters */
    public short[] f5423;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public short[] f5424;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public int f5425;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f5426;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public int f5427;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f5428;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f5429;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f5430;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final float f5431;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f5432;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f5433;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f5434;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f5435;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public short[] f5436;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public int f5437;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public int f5438;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public int f5439;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float f5440;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final short[] f5441;

    public C1334(int i, int i2, float f, float f2, int i3) {
        this.f5433 = i;
        this.f5420 = i2;
        this.f5431 = f;
        this.f5440 = f2;
        this.f5421 = i / i3;
        this.f5434 = i / 400;
        int i4 = i / 65;
        this.f5435 = i4;
        int i5 = i4 * 2;
        this.f5430 = i5;
        this.f5441 = new short[i5];
        this.f5423 = new short[i5 * i2];
        this.f5424 = new short[i5 * i2];
        this.f5436 = new short[i5 * i2];
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m4646(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m4647(short[] sArr, int i, int i2) {
        int i3 = this.f5430 / i2;
        int i4 = this.f5420;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f5441[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final short[] m4648(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f5420;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4649(short[] sArr, int i, int i2) {
        short[] sArrM4648 = m4648(this.f5424, this.f5426, i2);
        this.f5424 = sArrM4648;
        int i3 = this.f5420;
        System.arraycopy(sArr, i * i3, sArrM4648, this.f5426 * i3, i3 * i2);
        this.f5426 += i2;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m4650() {
        int i;
        int i2;
        float f;
        int iM4651;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.f5426;
        float f2 = this.f5431;
        float f3 = this.f5440;
        float f4 = f2 / f3;
        float f5 = this.f5421 * f3;
        double d = f4;
        int i12 = this.f5433;
        int i13 = this.f5420;
        int i14 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i15 = this.f5428;
            int i16 = this.f5430;
            if (i15 >= i16) {
                int i17 = 0;
                while (true) {
                    int i18 = this.f5427;
                    if (i18 > 0) {
                        int iMin = Math.min(i16, i18);
                        m4649(this.f5423, i17, iMin);
                        this.f5427 -= iMin;
                        i17 += iMin;
                        i2 = i11;
                        f = f5;
                        i = i12;
                    } else {
                        short[] sArr = this.f5423;
                        int i19 = i12 > 4000 ? i12 / 4000 : 1;
                        int i20 = this.f5435;
                        int i21 = this.f5434;
                        if (i13 == i14 && i19 == i14) {
                            iM4651 = m4651(sArr, i17, i21, i20);
                            i2 = i11;
                            f = f5;
                            i = i12;
                        } else {
                            m4647(sArr, i17, i19);
                            i = i12;
                            i2 = i11;
                            short[] sArr2 = this.f5441;
                            f = f5;
                            int iM46512 = m4651(sArr2, 0, i21 / i19, i20 / i19);
                            if (i19 != 1) {
                                int i22 = iM46512 * i19;
                                int i23 = i19 * 4;
                                int i24 = i22 - i23;
                                int i25 = i22 + i23;
                                if (i24 >= i21) {
                                    i21 = i24;
                                }
                                if (i25 <= i20) {
                                    i20 = i25;
                                }
                                if (i13 == 1) {
                                    iM4651 = m4651(sArr, i17, i21, i20);
                                } else {
                                    m4647(sArr, i17, 1);
                                    iM4651 = m4651(sArr2, 0, i21, i20);
                                }
                            } else {
                                iM4651 = iM46512;
                            }
                        }
                        int i26 = this.f5422;
                        int i27 = this.f5425;
                        if (i26 == 0 || (i3 = this.f5437) == 0 || i27 > i26 * 3 || i26 * 2 <= this.f5439 * 3) {
                            i3 = iM4651;
                        }
                        this.f5439 = i26;
                        this.f5437 = iM4651;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f5423;
                            if (f4 >= 2.0f) {
                                i5 = (int) (i3 / (f4 - 1.0f));
                            } else {
                                this.f5427 = (int) (((2.0f - f4) * i3) / (f4 - 1.0f));
                                i5 = i3;
                            }
                            short[] sArrM4648 = m4648(this.f5424, this.f5426, i5);
                            this.f5424 = sArrM4648;
                            int i28 = i17;
                            m4646(i5, this.f5420, sArrM4648, this.f5426, sArr3, i28, sArr3, i17 + i3);
                            this.f5426 += i5;
                            i17 = i3 + i5 + i28;
                        } else {
                            int i29 = i17;
                            short[] sArr4 = this.f5423;
                            if (f4 < 0.5f) {
                                i4 = (int) ((i3 * f4) / (1.0f - f4));
                            } else {
                                this.f5427 = (int) ((((2.0f * f4) - 1.0f) * i3) / (1.0f - f4));
                                i4 = i3;
                            }
                            int i30 = i3 + i4;
                            short[] sArrM46482 = m4648(this.f5424, this.f5426, i30);
                            this.f5424 = sArrM46482;
                            System.arraycopy(sArr4, i29 * i13, sArrM46482, this.f5426 * i13, i3 * i13);
                            m4646(i4, this.f5420, this.f5424, this.f5426 + i3, sArr4, i29 + i3, sArr4, i29);
                            this.f5426 += i30;
                            i17 = i29 + i4;
                        }
                    }
                    if (i17 + i16 > i15) {
                        break;
                    }
                    i12 = i;
                    i11 = i2;
                    f5 = f;
                    i14 = 1;
                }
                int i31 = this.f5428 - i17;
                short[] sArr5 = this.f5423;
                System.arraycopy(sArr5, i17 * i13, sArr5, 0, i31 * i13);
                this.f5428 = i31;
            }
            if (f != 1.0f || this.f5426 == (i6 = i2)) {
            }
            int i32 = i;
            int i33 = (int) (i32 / f);
            int i34 = i32;
            while (true) {
                if (i33 <= 16384 && i34 <= 16384) {
                    break;
                }
                i33 /= 2;
                i34 /= 2;
            }
            int i35 = this.f5426 - i6;
            short[] sArrM46483 = m4648(this.f5436, this.f5429, i35);
            this.f5436 = sArrM46483;
            System.arraycopy(this.f5424, i6 * i13, sArrM46483, this.f5429 * i13, i35 * i13);
            this.f5426 = i6;
            this.f5429 += i35;
            int i36 = 0;
            while (true) {
                i7 = this.f5429;
                i8 = i7 - 1;
                if (i36 >= i8) {
                    break;
                }
                while (true) {
                    i9 = this.f5432 + 1;
                    int i37 = i9 * i33;
                    i10 = this.f5438;
                    if (i37 <= i10 * i34) {
                        break;
                    }
                    this.f5424 = m4648(this.f5424, this.f5426, 1);
                    for (int i38 = 0; i38 < i13; i38++) {
                        short[] sArr6 = this.f5424;
                        int i39 = (this.f5426 * i13) + i38;
                        short[] sArr7 = this.f5436;
                        int i40 = (i36 * i13) + i38;
                        short s = sArr7[i40];
                        short s2 = sArr7[i40 + i13];
                        int i41 = this.f5438 * i34;
                        int i42 = this.f5432;
                        int i43 = i42 * i33;
                        int i44 = (i42 + 1) * i33;
                        int i45 = i44 - i41;
                        int i46 = i44 - i43;
                        sArr6[i39] = (short) ((((i46 - i45) * s2) + (s * i45)) / i46);
                    }
                    this.f5438++;
                    this.f5426++;
                }
                this.f5432 = i9;
                if (i9 == i34) {
                    this.f5432 = 0;
                    AbstractC4464.m10132(i10 == i33);
                    this.f5438 = 0;
                }
                i36++;
            }
            if (i8 == 0) {
                return;
            }
            short[] sArr8 = this.f5436;
            System.arraycopy(sArr8, i8 * i13, sArr8, 0, (i7 - i8) * i13);
            this.f5429 -= i8;
            return;
        }
        m4649(this.f5423, 0, this.f5428);
        this.f5428 = 0;
        i2 = i11;
        f = f5;
        i = i12;
        if (f != 1.0f) {
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m4651(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f5420;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f5422 = i6 / i7;
        this.f5425 = i8 / i5;
        return i7;
    }
}
