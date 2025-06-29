package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.ᵢᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0073 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final AbstractC0072 f497;

    static {
        f497 = (AbstractC0029.f391 && AbstractC0029.f396 && !AbstractC0043.m472()) ? new C0015(1) : new C0015(0);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m511(String str) {
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
                                throw new C0021(i2, length2);
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
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m512(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m513(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                b = -1;
            }
            return b;
        }
        if (i3 == 1) {
            return m512(b, bArr[i]);
        }
        if (i3 == 2) {
            return m514(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m514(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
