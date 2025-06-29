package p376;

import java.io.IOException;
import p070.C1551;
import p070.C1556;
import p070.C1561;
import p293.C3474;
import p317.AbstractC3616;
import p317.AbstractC3629;
import p338.InterfaceC3864;
import p366.C4143;
import p366.C4149;
import p366.C4158;
import p366.C4167;
import ـˈ.ˉᵎ;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵢˑ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4318 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final char[] f16773 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6 A[PHI: r7
  0x00e6: PHI (r7v2 ᵔﾞ.ﹳˎ) = 
  (r7v1 ᵔﾞ.ﹳˎ)
  (r7v1 ᵔﾞ.ﹳˎ)
  (r7v1 ᵔﾞ.ﹳˎ)
  (r7v6 ᵔﾞ.ﹳˎ)
  (r7v1 ᵔﾞ.ﹳˎ)
  (r7v7 ᵔﾞ.ﹳˎ)
  (r7v1 ᵔﾞ.ﹳˎ)
  (r7v1 ᵔﾞ.ﹳˎ)
  (r7v8 ᵔﾞ.ﹳˎ)
  (r7v1 ᵔﾞ.ﹳˎ)
  (r7v1 ᵔﾞ.ﹳˎ)
  (r7v1 ᵔﾞ.ﹳˎ)
 binds: [B:8:0x007b, B:10:0x0083, B:12:0x008b, B:48:0x011d, B:44:0x010d, B:46:0x0110, B:38:0x00fe, B:32:0x00e4, B:34:0x00e8, B:16:0x00a4, B:19:0x00b0, B:22:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.LinkedHashMap m9809(java.util.ArrayList r27) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p376.AbstractC4318.m9809(java.util.ArrayList):java.util.LinkedHashMap");
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final void m9810(C4149 c4149, int i, InterfaceC3864 interfaceC3864) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iM9548 = c4149.m9548() & 65535;
            long jM9548 = c4149.m9548() & 65535;
            long j2 = j - 4;
            if (j2 < jM9548) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            c4149.mo9526(jM9548);
            C4143 c4143 = c4149.f16049;
            long j3 = c4143.f16041;
            interfaceC3864.mo1054(Integer.valueOf(iM9548), Long.valueOf(jM9548));
            long j4 = (c4143.f16041 + jM9548) - j3;
            if (j4 < 0) {
                throw new IOException(ˉᵎ.ˉⁱ("unsupported zip: too many bytes processed for ", iM9548));
            }
            if (j4 > 0) {
                c4143.skip(j4);
            }
            j = j2 - jM9548;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final String m9811(int i) {
        ـﹶ.ˏʾ(16);
        return "0x".concat(Integer.toString(i, 16));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int m9812(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final int m9813(C4158 c4158, int i) {
        int i2;
        int i3 = i + 1;
        int length = c4158.f16074.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= length) {
                i2 = (i4 + length) >>> 1;
                int i5 = c4158.f16075[i2];
                if (i5 >= i3) {
                    if (i5 <= i3) {
                        break;
                    }
                    length = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C4319 m9814(C4149 c4149) throws IOException {
        String str;
        long j;
        int iM9550 = c4149.m9550();
        if (iM9550 != 33639248) {
            throw new IOException("bad zip: expected " + m9811(33639248) + " but was " + m9811(iM9550));
        }
        c4149.skip(4L);
        short sM9548 = c4149.m9548();
        int i = sM9548 & 65535;
        if ((sM9548 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m9811(i));
        }
        int iM9548 = c4149.m9548() & 65535;
        int iM95482 = c4149.m9548() & 65535;
        int iM95483 = c4149.m9548() & 65535;
        long jM9550 = c4149.m9550() & 4294967295L;
        C1551 c1551 = new C1551();
        c1551.f6284 = c4149.m9550() & 4294967295L;
        C1551 c15512 = new C1551();
        c15512.f6284 = c4149.m9550() & 4294967295L;
        int iM95484 = c4149.m9548() & 65535;
        int iM95485 = c4149.m9548() & 65535;
        int iM95486 = c4149.m9548() & 65535;
        c4149.skip(8L);
        C1551 c15513 = new C1551();
        c15513.f6284 = c4149.m9550() & 4294967295L;
        String strMo9506 = c4149.mo9506(iM95484);
        if (AbstractC3616.m8546(strMo9506, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (c15512.f6284 == 4294967295L) {
            j = 8;
            str = strMo9506;
        } else {
            str = strMo9506;
            j = 0;
        }
        if (c1551.f6284 == 4294967295L) {
            j += 8;
        }
        if (c15513.f6284 == 4294967295L) {
            j += 8;
        }
        long j2 = j;
        C1561 c1561 = new C1561();
        C1561 c15612 = new C1561();
        C1561 c15613 = new C1561();
        C1556 c1556 = new C1556();
        String str2 = str;
        m9810(c4149, iM95485, new C4323(c1556, j2, c15512, c4149, c1551, c15513, c1561, c15612, c15613));
        if (j2 > 0 && !c1556.f6294) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strMo95062 = c4149.mo9506(iM95486);
        String str3 = C4167.f16083;
        return new C4319(C3474.m8339("/").m9579(str2), AbstractC3629.m8561(str2, "/", false), strMo95062, jM9550, c1551.f6284, c15512.f6284, iM9548, c15513.f6284, iM95483, iM95482, (Long) c1561.f6302, (Long) c15612.f6302, (Long) c15613.f6302, 57344);
    }
}
