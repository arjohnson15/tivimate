package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.ʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0015 extends AbstractC0072 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ int f359;

    public /* synthetic */ C0015(int i) {
        this.f359 = i;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static int m236(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            AbstractC0072 abstractC0072 = AbstractC0073.f497;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return AbstractC0073.m512(i, AbstractC0029.m321(j, bArr));
        }
        if (i2 == 2) {
            return AbstractC0073.m514(i, AbstractC0029.m321(j, bArr), AbstractC0029.m321(j + 1, bArr));
        }
        throw new AssertionError();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0072
    /* renamed from: ˉי, reason: contains not printable characters */
    public final int mo237(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        int i4 = i;
        byte b = -16;
        byte b2 = -62;
        int i5 = -1;
        switch (this.f359) {
            case 0:
                while (i4 < i2 && bArr[i4] >= 0) {
                    i4++;
                }
                if (i4 < i2) {
                    while (i4 < i2) {
                        int i6 = i4 + 1;
                        byte b3 = bArr[i4];
                        if (b3 < 0) {
                            if (b3 < -32) {
                                if (i6 >= i2) {
                                    return b3;
                                }
                                if (b3 >= -62) {
                                    i4 += 2;
                                    if (bArr[i6] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b3 >= -16) {
                                if (i6 >= i2 - 2) {
                                    return AbstractC0073.m513(bArr, i6, i2);
                                }
                                int i7 = i4 + 2;
                                byte b4 = bArr[i6];
                                if (b4 <= -65 && (((b4 + 112) + (b3 << 28)) >> 30) == 0) {
                                    int i8 = i4 + 3;
                                    if (bArr[i7] <= -65) {
                                        i4 += 4;
                                        if (bArr[i8] > -65) {
                                        }
                                    }
                                }
                                return -1;
                            }
                            if (i6 >= i2 - 1) {
                                return AbstractC0073.m513(bArr, i6, i2);
                            }
                            int i9 = i4 + 2;
                            byte b5 = bArr[i6];
                            if (b5 <= -65 && ((b3 != -32 || b5 >= -96) && (b3 != -19 || b5 < -96))) {
                                i4 += 3;
                                if (bArr[i9] > -65) {
                                }
                            }
                            return -1;
                        }
                        i4 = i6;
                    }
                }
                return 0;
            default:
                if (((bArr.length - i2) | i4 | i2) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                long j2 = i4;
                int i10 = (int) (i2 - j2);
                if (i10 < 16) {
                    i3 = 0;
                } else {
                    long j3 = j2;
                    i3 = 0;
                    while (true) {
                        if (i3 < i10) {
                            long j4 = j3 + 1;
                            if (AbstractC0029.m321(j3, bArr) >= 0) {
                                i3++;
                                j3 = j4;
                            }
                        } else {
                            i3 = i10;
                        }
                    }
                }
                int i11 = i10 - i3;
                long j5 = j2 + i3;
                while (true) {
                    byte bM321 = 0;
                    while (true) {
                        if (i11 > 0) {
                            long j6 = j5 + 1;
                            bM321 = AbstractC0029.m321(j5, bArr);
                            if (bM321 >= 0) {
                                i11 += i5;
                                j5 = j6;
                            } else {
                                j5 = j6;
                            }
                        }
                    }
                    if (i11 == 0) {
                        return 0;
                    }
                    int i12 = i11 - 1;
                    if (bM321 < -32) {
                        if (i12 == 0) {
                            return bM321;
                        }
                        i11 -= 2;
                        if (bM321 >= b2) {
                            long j7 = j5 + 1;
                            if (AbstractC0029.m321(j5, bArr) <= -65) {
                                j5 = j7;
                                b = -16;
                                b2 = -62;
                                i5 = -1;
                            }
                        }
                    } else if (bM321 < b) {
                        if (i12 < 2) {
                            return m236(j5, bArr, bM321, i12);
                        }
                        i11 -= 3;
                        long j8 = j5 + 1;
                        byte bM3212 = AbstractC0029.m321(j5, bArr);
                        if (bM3212 <= -65 && (bM321 != -32 || bM3212 >= -96)) {
                            if (bM321 == -19) {
                                j = j8;
                                if (bM3212 < -96) {
                                }
                            } else {
                                j = j8;
                            }
                            j5 += 2;
                            if (AbstractC0029.m321(j, bArr) <= -65) {
                                b = -16;
                                b2 = -62;
                                i5 = -1;
                            }
                        }
                    } else {
                        if (i12 < 3) {
                            return m236(j5, bArr, bM321, i12);
                        }
                        i11 -= 4;
                        long j9 = j5 + 1;
                        byte bM3213 = AbstractC0029.m321(j5, bArr);
                        if (bM3213 <= -65 && (((bM3213 + 112) + (bM321 << 28)) >> 30) == 0) {
                            long j10 = j5 + 2;
                            if (AbstractC0029.m321(j9, bArr) <= -65) {
                                j5 += 3;
                                if (AbstractC0029.m321(j10, bArr) <= -65) {
                                    b = -16;
                                    b2 = -62;
                                    i5 = -1;
                                }
                            }
                        }
                    }
                }
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0072
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String mo238(byte[] r20, int r21, int r22) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0015.mo238(byte[], int, int):java.lang.String");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0072
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int mo239(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        long j;
        String str2;
        String str3;
        int i5;
        char cCharAt2;
        switch (this.f359) {
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
                                    throw new C0021(i7, length);
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
                            throw new C0021(i7 - 1, length);
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
                        AbstractC0029.m313(bArr, j2, (byte) cCharAt2);
                        i13++;
                        j2 = 1 + j2;
                    }
                }
                if (i13 != length2) {
                    while (i13 < length2) {
                        char cCharAt5 = str.charAt(i13);
                        if (cCharAt5 < 128 && j2 < j3) {
                            AbstractC0029.m313(bArr, j2, (byte) cCharAt5);
                            str3 = str5;
                            j2 += j;
                            str2 = str4;
                        } else if (cCharAt5 >= 2048 || j2 > j3 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j2 > j3 - 3) {
                                if (j2 > j3 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i13 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new C0021(i13, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j2);
                                }
                                int i14 = i13 + 1;
                                if (i14 != length2) {
                                    char cCharAt6 = str.charAt(i14);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        AbstractC0029.m313(bArr, j2, (byte) ((codePoint2 >>> 18) | 240));
                                        AbstractC0029.m313(bArr, j2 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j4 = 3 + j2;
                                        AbstractC0029.m313(bArr, j2 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j2 += 4;
                                        AbstractC0029.m313(bArr, j4, (byte) ((codePoint2 & 63) | 128));
                                        i13 = i14;
                                    } else {
                                        i13 = i14;
                                    }
                                }
                                throw new C0021(i13 - 1, length2);
                            }
                            AbstractC0029.m313(bArr, j2, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j5 = j2 + 2;
                            AbstractC0029.m313(bArr, j2 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j2 += 3;
                            AbstractC0029.m313(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j6 = j2 + j;
                            AbstractC0029.m313(bArr, j2, (byte) ((cCharAt5 >>> 6) | 960));
                            j2 += 2;
                            AbstractC0029.m313(bArr, j6, (byte) ((cCharAt5 & '?') | 128));
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
}
