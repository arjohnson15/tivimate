package p366;

import java.io.Serializable;
import java.util.Arrays;
import p317.AbstractC3625;
import p317.AbstractC3629;
import p376.AbstractC4318;
import ˆʽ.ᵎˏ;
import ˎˊ.ˆʿ;
import ˏʼ.ʽᐧ;

/* renamed from: ᵔﾞ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4155 implements Serializable, Comparable {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C4155 f16067 = new C4155(new byte[0]);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public transient int f16068;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public transient String f16069;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final byte[] f16070;

    public C4155(byte[] bArr) {
        this.f16070 = bArr;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static /* synthetic */ C4155 m9557(C4155 c4155, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return c4155.mo9562(i, i2);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m9558(C4155 c4155, C4155 c41552) {
        c4155.getClass();
        return c4155.mo9560(0, c41552.f16070);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4155) {
            C4155 c4155 = (C4155) obj;
            int iMo9566 = c4155.mo9566();
            byte[] bArr = this.f16070;
            if (iMo9566 == bArr.length && c4155.mo9561(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f16068;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f16070);
        this.f16068 = iHashCode;
        return iHashCode;
    }

    public String toString() {
        C4155 c4155;
        byte b;
        int i;
        byte[] bArr = this.f16070;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 < 2048) {
                                if (i4 != 64) {
                                    break;
                                }
                            } else if (55296 > i9 || i9 >= 57344) {
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    break;
                                }
                                i3 += i9 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 > 1114111) {
                                    if (i4 != 64) {
                                        break;
                                    }
                                } else if (55296 > i11 || i11 >= 57344) {
                                    if (i11 >= 65536) {
                                        i = i4 + 1;
                                        if (i4 == 64) {
                                            break;
                                        }
                                        if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                            break;
                                        }
                                        i3 += i11 < 65536 ? 1 : 2;
                                        i2 += 4;
                                        i4 = i;
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if (i4 != 64) {
                break;
            }
        }
        i3 = -1;
        if (i3 != -1) {
            String strM9564 = m9564();
            String strM8559 = AbstractC3629.m8559(AbstractC3629.m8559(AbstractC3629.m8559(strM9564.substring(0, i3), "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (i3 >= strM9564.length()) {
                return "[text=" + strM8559 + ']';
            }
            return "[size=" + bArr.length + " text=" + strM8559 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + mo9571() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(ᵎˏ.ᵎـ(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (64 == bArr.length) {
            c4155 = this;
        } else {
            ʽᐧ.ﹳﹳ(64, bArr.length);
            c4155 = new C4155(Arrays.copyOfRange(bArr, 0, 64));
        }
        sb.append(c4155.mo9571());
        sb.append("…]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: ʽᐧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(p366.C4155 r10) {
        /*
            r9 = this;
            int r0 = r9.mo9566()
            int r1 = r10.mo9566()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        Le:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L29
            byte r7 = r9.mo9565(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.mo9565(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L23
            int r4 = r4 + 1
            goto Le
        L23:
            if (r7 >= r8) goto L27
        L25:
            r3 = -1
            goto L2f
        L27:
            r3 = 1
            goto L2f
        L29:
            if (r0 != r1) goto L2c
            goto L2f
        L2c:
            if (r0 >= r1) goto L27
            goto L25
        L2f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p366.C4155.compareTo(ᵔﾞ.ˏᵢ):int");
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int mo9560(int i, byte[] bArr) {
        byte[] bArr2 = this.f16070;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax <= length) {
            while (!ˆʿ.ـﹶ(bArr2, iMax, bArr, 0, bArr.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean mo9561(int i, int i2, int i3, byte[] bArr) {
        if (i >= 0) {
            byte[] bArr2 = this.f16070;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && ˆʿ.ـﹶ(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public C4155 mo9562(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = mo9566();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f16070;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException(ᵎˏ.ᵎـ(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i2 - i < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        ʽᐧ.ﹳﹳ(i2, bArr.length);
        return new C4155(Arrays.copyOfRange(bArr, i, i2));
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean mo9563(int i, C4155 c4155, int i2) {
        return c4155.mo9561(0, i, i2, this.f16070);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final String m9564() {
        String str = this.f16069;
        if (str != null) {
            return str;
        }
        String str2 = new String(mo9569(), AbstractC3625.f13869);
        this.f16069 = str2;
        return str2;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public byte mo9565(int i) {
        return this.f16070[i];
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int mo9566() {
        return this.f16070.length;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public void mo9567(C4143 c4143, int i) {
        c4143.m9521(this.f16070, 0, i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String mo9568() {
        byte[] bArr = AbstractC4159.f16076;
        byte[] bArr2 = this.f16070;
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr2[i];
            byte b6 = bArr2[i5];
            bArr3[i2] = bArr[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, AbstractC3625.f13869);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public byte[] mo9569() {
        return this.f16070;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public C4155 mo9570() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f16070;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C4155(bArrCopyOf);
            }
            i++;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public String mo9571() {
        byte[] bArr = this.f16070;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC4318.f16773;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int mo9572(int i, byte[] bArr) {
        if (i == -1234567890) {
            i = mo9566();
        }
        byte[] bArr2 = this.f16070;
        for (int iMin = Math.min(i, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (ˆʿ.ـﹶ(bArr2, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }
}
