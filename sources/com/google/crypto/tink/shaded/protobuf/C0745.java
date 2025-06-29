package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.AbstractC0001;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0745 extends AbstractC0001 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ int f3585;

    public /* synthetic */ C0745(int i) {
        this.f3585 = i;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static int m3102(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            AbstractC0001 abstractC0001 = AbstractC0778.f3639;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return AbstractC0778.m3218(i, AbstractC0768.m3195(j, bArr));
        }
        if (i2 == 2) {
            return AbstractC0778.m3220(i, AbstractC0768.m3195(j, bArr), AbstractC0768.m3195(j + 1, bArr));
        }
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.AbstractC0001
    /* renamed from: ˈٴ */
    public final int mo30(byte[] bArr, int i, int i2) {
        int i3;
        byte b;
        int i4 = i;
        int i5 = -1;
        int i6 = 2;
        switch (this.f3585) {
            case 0:
                while (i4 < i2 && bArr[i4] >= 0) {
                    i4++;
                }
                if (i4 < i2) {
                    while (i4 < i2) {
                        int i7 = i4 + 1;
                        byte b2 = bArr[i4];
                        if (b2 < 0) {
                            if (b2 < -32) {
                                if (i7 >= i2) {
                                    return b2;
                                }
                                if (b2 >= -62) {
                                    i4 += 2;
                                    if (bArr[i7] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b2 < -16) {
                                if (i7 >= i2 - 1) {
                                    return AbstractC0778.m3219(bArr, i7, i2);
                                }
                                int i8 = i4 + 2;
                                byte b3 = bArr[i7];
                                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                                    i4 += 3;
                                    if (bArr[i8] > -65) {
                                    }
                                }
                            } else {
                                if (i7 >= i2 - 2) {
                                    return AbstractC0778.m3219(bArr, i7, i2);
                                }
                                int i9 = i4 + 2;
                                byte b4 = bArr[i7];
                                if (b4 <= -65 && (((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                                    int i10 = i4 + 3;
                                    if (bArr[i9] <= -65) {
                                        i4 += 4;
                                        if (bArr[i10] > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i4 = i7;
                    }
                }
                return 0;
            default:
                if (((bArr.length - i2) | i4 | i2) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                long j = i4;
                int i11 = (int) (i2 - j);
                if (i11 < 16) {
                    i3 = 0;
                } else {
                    int i12 = 8 - (((int) j) & 7);
                    long j2 = j;
                    i3 = 0;
                    while (true) {
                        if (i3 < i12) {
                            long j3 = j2 + 1;
                            if (AbstractC0768.m3195(j2, bArr) >= 0) {
                                i3++;
                                j2 = j3;
                            }
                        } else {
                            while (true) {
                                int i13 = i3 + 8;
                                if (i13 <= i11 && (AbstractC0768.f3622.m3206(AbstractC0768.f3623 + j2, bArr) & (-9187201950435737472L)) == 0) {
                                    j2 += 8;
                                    i3 = i13;
                                }
                            }
                            while (true) {
                                if (i3 < i11) {
                                    long j4 = j2 + 1;
                                    if (AbstractC0768.m3195(j2, bArr) >= 0) {
                                        i3++;
                                        j2 = j4;
                                    }
                                } else {
                                    i3 = i11;
                                }
                            }
                        }
                    }
                }
                int i14 = i11 - i3;
                long j5 = j + i3;
                while (true) {
                    byte bM3195 = 0;
                    while (true) {
                        if (i14 > 0) {
                            long j6 = j5 + 1;
                            bM3195 = AbstractC0768.m3195(j5, bArr);
                            if (bM3195 >= 0) {
                                i14 += i5;
                                j5 = j6;
                            } else {
                                j5 = j6;
                            }
                        }
                    }
                    if (i14 == 0) {
                        return 0;
                    }
                    int i15 = i14 - 1;
                    if (bM3195 < -32) {
                        if (i15 == 0) {
                            return bM3195;
                        }
                        i14 -= 2;
                        if (bM3195 >= -62) {
                            long j7 = j5 + 1;
                            if (AbstractC0768.m3195(j5, bArr) <= -65) {
                                j5 = j7;
                                i5 = -1;
                                i6 = 2;
                            }
                        }
                    } else if (bM3195 < -16) {
                        if (i15 < i6) {
                            return m3102(j5, bArr, bM3195, i15);
                        }
                        i14 -= 3;
                        long j8 = j5 + 1;
                        byte bM31952 = AbstractC0768.m3195(j5, bArr);
                        if (bM31952 <= -65) {
                            if (bM3195 == -32) {
                                b = -96;
                                if (bM31952 >= -96) {
                                }
                            } else {
                                b = -96;
                            }
                            if (bM3195 != -19 || bM31952 < b) {
                                j5 += 2;
                                if (AbstractC0768.m3195(j8, bArr) <= -65) {
                                    i5 = -1;
                                    i6 = 2;
                                }
                            }
                        }
                    } else {
                        if (i15 < 3) {
                            return m3102(j5, bArr, bM3195, i15);
                        }
                        i14 -= 4;
                        long j9 = j5 + 1;
                        byte bM31953 = AbstractC0768.m3195(j5, bArr);
                        if (bM31953 <= -65 && (((bM31953 + 112) + (bM3195 << 28)) >> 30) == 0) {
                            long j10 = 2 + j5;
                            if (AbstractC0768.m3195(j9, bArr) <= -65) {
                                j5 += 3;
                                if (AbstractC0768.m3195(j10, bArr) <= -65) {
                                    i5 = -1;
                                    i6 = 2;
                                }
                            }
                        }
                    }
                }
                return -1;
        }
    }

    @Override // android.support.v4.media.session.AbstractC0001
    /* renamed from: ˏᴵ */
    public final int mo31(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        long j;
        String str2;
        String str3;
        int i5;
        char cCharAt2;
        switch (this.f3585) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length && (i4 = i7 + i) < i6 && (cCharAt = str.charAt(i7)) < 128) {
                    bArr[i4] = (byte) cCharAt;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                int i8 = i + i7;
                while (i7 < length) {
                    char cCharAt3 = str.charAt(i7);
                    if (cCharAt3 < 128 && i8 < i6) {
                        bArr[i8] = (byte) cCharAt3;
                        i8++;
                    } else if (cCharAt3 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt3 >>> 6) | 960);
                        i8 += 2;
                        bArr[i9] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i8 > i6 - 3) {
                            if (i8 > i6 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i3)))) {
                                    throw new C0750(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i8);
                            }
                            int i10 = i7 + 1;
                            if (i10 != str.length()) {
                                char cCharAt4 = str.charAt(i10);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i11 = i8 + 3;
                                    bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 += 4;
                                    bArr[i11] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new C0750(i7 - 1, length);
                        }
                        bArr[i8] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i12 = i8 + 2;
                        bArr[i8 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i8 += 3;
                        bArr[i12] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i7++;
                }
                return i8;
            default:
                long j2 = i;
                long j3 = i2 + j2;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i13 = 0;
                while (true) {
                    j = 1;
                    if (i13 < length2 && (cCharAt2 = str.charAt(i13)) < 128) {
                        AbstractC0768.m3189(bArr, j2, (byte) cCharAt2);
                        i13++;
                        j2 = 1 + j2;
                    }
                }
                if (i13 != length2) {
                    while (i13 < length2) {
                        char cCharAt5 = str.charAt(i13);
                        if (cCharAt5 < 128 && j2 < j3) {
                            AbstractC0768.m3189(bArr, j2, (byte) cCharAt5);
                            str3 = str5;
                            j2 += j;
                            str2 = str4;
                        } else if (cCharAt5 >= 2048 || j2 > j3 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j2 > j3 - 3) {
                                if (j2 > j3 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i13 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new C0750(i13, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j2);
                                }
                                int i14 = i13 + 1;
                                if (i14 != length2) {
                                    char cCharAt6 = str.charAt(i14);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        AbstractC0768.m3189(bArr, j2, (byte) ((codePoint2 >>> 18) | 240));
                                        AbstractC0768.m3189(bArr, j2 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j4 = 3 + j2;
                                        AbstractC0768.m3189(bArr, j2 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j2 += 4;
                                        AbstractC0768.m3189(bArr, j4, (byte) ((codePoint2 & 63) | 128));
                                        i13 = i14;
                                    } else {
                                        i13 = i14;
                                    }
                                }
                                throw new C0750(i13 - 1, length2);
                            }
                            AbstractC0768.m3189(bArr, j2, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j5 = j2 + 2;
                            AbstractC0768.m3189(bArr, j2 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j2 += 3;
                            AbstractC0768.m3189(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j6 = j2 + j;
                            AbstractC0768.m3189(bArr, j2, (byte) ((cCharAt5 >>> 6) | 960));
                            j2 += 2;
                            AbstractC0768.m3189(bArr, j6, (byte) ((cCharAt5 & '?') | 128));
                        }
                        i13++;
                        str4 = str2;
                        str5 = str3;
                        j = 1;
                    }
                }
                return (int) j2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    @Override // android.support.v4.media.session.AbstractC0001
    /* renamed from: ᴵʿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String mo32(byte[] r18, int r19, int r20) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C0745.mo32(byte[], int, int):java.lang.String");
    }
}
