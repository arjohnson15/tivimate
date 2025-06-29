package p317;

import p070.AbstractC1549;
import ﹶⁱ.ـﹶ;

/* renamed from: ᴵ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3619 extends AbstractC3630 {
    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static Integer m8556(String str) {
        boolean z;
        int i;
        int i2;
        ـﹶ.ˏʾ(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i4 = -2147483647;
        if (AbstractC1549.m5145(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + iDigit) {
                return null;
            }
            i3 = i2 - iDigit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static Long m8557(String str) {
        boolean z;
        ـﹶ.ˏʾ(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (AbstractC1549.m5145(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                i = 1;
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 != j2) {
                    return null;
                }
                j4 = j / 10;
                if (j3 < j4) {
                    return null;
                }
            }
            long j5 = j3 * 10;
            long j6 = iDigit;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i++;
            j2 = -256204778801521550L;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }
}
