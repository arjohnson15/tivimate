package p430;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p013.C1053;
import p158.AbstractC2339;
import p317.AbstractC3616;
import p317.AbstractC3629;
import p366.C4143;

/* renamed from: ﹶˏ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4991 implements InterfaceC5003 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final C4991 f18855 = new C4991();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C4991 f18854 = new C4991();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m11077(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4 = 0;
        int i5 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 32) != 0 ? false : z3;
        boolean z8 = (i3 & 64) != 0 ? false : z4;
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = 32;
            int i7 = 43;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || AbstractC3616.m8546(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !m11081(iCharCount, length, str)))) || (iCodePointAt == 43 && z7)))) {
                C4143 c4143 = new C4143();
                c4143.m9502(i5, iCharCount, str);
                C4143 c41432 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i7 && z7) {
                            String str3 = z5 ? "+" : "%2B";
                            c4143.m9502(i4, str3.length(), str3);
                        } else {
                            if (iCodePointAt2 >= i6 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z8) && !AbstractC3616.m8546(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z5 && (!z6 || m11081(iCharCount, length, str))))) {
                                    c4143.m9498(iCodePointAt2);
                                }
                            }
                            if (c41432 == null) {
                                c41432 = new C4143();
                            }
                            c41432.m9498(iCodePointAt2);
                            while (!c41432.m9503()) {
                                byte b = c41432.readByte();
                                c4143.m9509(37);
                                char[] cArr = C5004.f18952;
                                c4143.m9509(cArr[((b & 255) >> 4) & 15]);
                                c4143.m9509(cArr[b & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i4 = 0;
                    i6 = 32;
                    i7 = 43;
                }
                return c4143.m9515();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i5, length);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static String m11078(String str, int i, int i2, boolean z, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C4143 c4143 = new C4143();
                c4143.m9502(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iM6439 = AbstractC2339.m6439(str.charAt(iCharCount + 1));
                        int iM64392 = AbstractC2339.m6439(str.charAt(i4));
                        if (iM6439 == -1 || iM64392 == -1) {
                            c4143.m9498(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c4143.m9509((iM6439 << 4) + iM64392);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c4143.m9509(32);
                        iCharCount++;
                    } else {
                        c4143.m9498(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c4143.m9515();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static ArrayList m11079(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM8527 = AbstractC3616.m8527(str, '&', i, false, 4);
            if (iM8527 == -1) {
                iM8527 = str.length();
            }
            int iM85272 = AbstractC3616.m8527(str, '=', i, false, 4);
            if (iM85272 == -1 || iM85272 > iM8527) {
                arrayList.add(str.substring(i, iM8527));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iM85272));
                arrayList.add(str.substring(iM85272 + 1, iM8527));
            }
            i = iM8527 + 1;
        }
        return arrayList;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C5005 m11080(C4991 c4991, String str) {
        C5005 c5005 = new C5005(str);
        C5005.f18980.put(str, c5005);
        return c5005;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static boolean m11081(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && AbstractC2339.m6439(str.charAt(i + 1)) != -1 && AbstractC2339.m6439(str.charAt(i3)) != -1;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public synchronized C5005 m11082(String str) {
        C5005 c5005;
        try {
            LinkedHashMap linkedHashMap = C5005.f18980;
            c5005 = (C5005) linkedHashMap.get(str);
            if (c5005 == null) {
                c5005 = (C5005) linkedHashMap.get(AbstractC3629.m8560(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : AbstractC3629.m8560(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (c5005 == null) {
                    c5005 = new C5005(str);
                }
                linkedHashMap.put(str, c5005);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c5005;
    }

    @Override // p430.InterfaceC5003
    /* renamed from: ٴˎ */
    public void mo10431(C5004 c5004, List list) {
    }

    @Override // p430.InterfaceC5003
    /* renamed from: ᐧʻ */
    public List mo10432(C5004 c5004) {
        return C1053.f4449;
    }
}
