package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.יᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0446 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C0553 f2751;

    static {
        if (AbstractC0547.f2889) {
            boolean z = AbstractC0547.f2894;
        }
        f2751 = new C0553(9);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m2231(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        f2751.getClass();
        int length = str.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
            bArr[i4] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                    if (i7 > i5 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                            throw new C0564(i6, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                    }
                    int i9 = i6 + 1;
                    if (i9 != str.length()) {
                        char cCharAt3 = str.charAt(i9);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i10 = i7 + 3;
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i10] = (byte) ((codePoint & 63) | 128);
                            i6 = i9;
                        } else {
                            i6 = i9;
                        }
                    }
                    throw new C0564(i6 - 1, length);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i11 = i7 + 2;
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
            }
            i6++;
        }
        return i7;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static /* synthetic */ int m2232(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return (b2 << 8) ^ b;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b3 = bArr[i];
        byte b4 = bArr[i + 1];
        if (b > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << 16) ^ ((b3 << 8) ^ b);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m2233(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new C0564(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException(ˆʽ.ᵎˏ.ˏᴵ("UTF-8 length does not fit in int: ", i3 + 4294967296L));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static boolean m2234(byte[] bArr, int i, int i2) {
        int iM2232;
        f2751.getClass();
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            iM2232 = 0;
        } else {
            while (i < i2) {
                int i3 = i + 1;
                iM2232 = bArr[i];
                if (iM2232 < 0) {
                    if (iM2232 >= -32) {
                        if (iM2232 >= -16) {
                            if (i3 < i2 - 2) {
                                int i4 = i + 2;
                                byte b = bArr[i3];
                                if (b <= -65) {
                                    if ((((b + 112) + (iM2232 << 28)) >> 30) == 0) {
                                        int i5 = i + 3;
                                        if (bArr[i4] <= -65) {
                                            i += 4;
                                            if (bArr[i5] > -65) {
                                            }
                                        }
                                    }
                                }
                                iM2232 = -1;
                                break;
                            }
                            iM2232 = m2232(bArr, i3, i2);
                            break;
                        }
                        if (i3 < i2 - 1) {
                            int i6 = i + 2;
                            byte b2 = bArr[i3];
                            if (b2 <= -65 && ((iM2232 != -32 || b2 >= -96) && (iM2232 != -19 || b2 < -96))) {
                                i += 3;
                                if (bArr[i6] > -65) {
                                }
                            }
                            iM2232 = -1;
                            break;
                        }
                        iM2232 = m2232(bArr, i3, i2);
                        break;
                    }
                    if (i3 >= i2) {
                        break;
                    }
                    if (iM2232 >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    iM2232 = -1;
                    break;
                }
                i = i3;
            }
            iM2232 = 0;
        }
        return iM2232 == 0;
    }
}
