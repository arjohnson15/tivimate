package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p331.C3758;

/* renamed from: com.google.android.gms.internal.measurement.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0527 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C0553 f2871 = new C0553(6);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m2391(int i, byte[] bArr, int i2, int i3, InterfaceC0465 interfaceC0465, C0382 c0382) {
        C0521 c0521 = (C0521) interfaceC0465;
        int iM2411 = m2411(bArr, i2, c0382);
        c0521.m2382(c0382.f2648);
        while (iM2411 < i3) {
            int iM24112 = m2411(bArr, iM2411, c0382);
            if (i != c0382.f2648) {
                break;
            }
            iM2411 = m2411(bArr, iM24112, c0382);
            c0521.m2382(c0382.f2648);
        }
        return iM2411;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m2392(InterfaceC0494 interfaceC0494, int i, byte[] bArr, int i2, int i3, InterfaceC0465 interfaceC0465, C0382 c0382) throws zzlk {
        int i4 = (i & (-8)) | 4;
        AbstractC0583 abstractC0583Mo1845 = interfaceC0494.mo1845();
        int iM2406 = m2406(abstractC0583Mo1845, interfaceC0494, bArr, i2, i3, i4, c0382);
        interfaceC0494.mo1846(abstractC0583Mo1845);
        c0382.f2647 = abstractC0583Mo1845;
        interfaceC0465.add(abstractC0583Mo1845);
        while (iM2406 < i3) {
            int iM2411 = m2411(bArr, iM2406, c0382);
            if (i != c0382.f2648) {
                break;
            }
            AbstractC0583 abstractC0583Mo18452 = interfaceC0494.mo1845();
            int iM24062 = m2406(abstractC0583Mo18452, interfaceC0494, bArr, iM2411, i3, i4, c0382);
            interfaceC0494.mo1846(abstractC0583Mo18452);
            c0382.f2647 = abstractC0583Mo18452;
            interfaceC0465.add(abstractC0583Mo18452);
            iM2406 = iM24062;
        }
        return iM2406;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static void m2393(Object obj) {
        ((C0360) obj).f2604 = false;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static C0335 m2394(C0335 c0335, ﹶˋ.ـﹶ r8, C0420 c0420, Boolean bool, Boolean bool2) {
        C0335 c03352 = new C0335();
        Iterator itM1869 = c0335.m1869();
        while (itM1869.hasNext()) {
            int iIntValue = ((Integer) itM1869.next()).intValue();
            if (c0335.m1877(iIntValue)) {
                InterfaceC0489 interfaceC0489Mo1817 = c0420.mo1817(r8, Arrays.asList(c0335.m1868(iIntValue), new C0477(Double.valueOf(iIntValue)), c0335));
                if (interfaceC0489Mo1817.mo1875().equals(bool)) {
                    return c03352;
                }
                if (bool2 == null || interfaceC0489Mo1817.mo1875().equals(bool2)) {
                    c03352.m1864(iIntValue, interfaceC0489Mo1817);
                }
            }
        }
        return c03352;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static C0360 m2395(Object obj, Object obj2) {
        C0360 c0360 = (C0360) obj;
        C0360 c03602 = (C0360) obj2;
        if (!c03602.isEmpty()) {
            if (!c0360.f2604) {
                if (c0360.isEmpty()) {
                    c0360 = new C0360();
                } else {
                    C0360 c03603 = new C0360(c0360);
                    c03603.f2604 = true;
                    c0360 = c03603;
                }
            }
            c0360.m1995();
            if (!c03602.isEmpty()) {
                c0360.putAll(c03602);
            }
        }
        return c0360;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static int m2396(byte[] bArr, int i, C0382 c0382) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c0382.f2646 = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        c0382.f2646 = j2;
        return i3;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static void m2397(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static C0360 m2398() {
        C0360 c0360 = C0360.f2603;
        if (c0360.isEmpty()) {
            return new C0360();
        }
        C0360 c03602 = new C0360(c0360);
        c03602.f2604 = true;
        return c03602;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static InterfaceC0489 m2399(C0335 c0335, ﹶˋ.ـﹶ r11, ArrayList arrayList, boolean z) {
        InterfaceC0489 interfaceC0489Mo1817;
        AbstractC0543.m2439(1, "reduce", arrayList);
        AbstractC0543.m2442("reduce", 2, arrayList);
        InterfaceC0489 interfaceC0489M8736 = ((C3758) r11.ˎˑ).m8736(r11, (InterfaceC0489) arrayList.get(0));
        if (!(interfaceC0489M8736 instanceof AbstractC0381)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            interfaceC0489Mo1817 = ((C3758) r11.ˎˑ).m8736(r11, (InterfaceC0489) arrayList.get(1));
            if (interfaceC0489Mo1817 instanceof C0421) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c0335.m1872() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC0489Mo1817 = null;
        }
        AbstractC0381 abstractC0381 = (AbstractC0381) interfaceC0489M8736;
        int iM1872 = c0335.m1872();
        int i = z ? 0 : iM1872 - 1;
        int i2 = z ? iM1872 - 1 : 0;
        int i3 = z ? 1 : -1;
        if (interfaceC0489Mo1817 == null) {
            interfaceC0489Mo1817 = c0335.m1868(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (c0335.m1877(i)) {
                interfaceC0489Mo1817 = abstractC0381.mo1817(r11, Arrays.asList(interfaceC0489Mo1817, c0335.m1868(i), new C0477(Double.valueOf(i)), c0335));
                if (interfaceC0489Mo1817 instanceof C0421) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return interfaceC0489Mo1817;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static float m2400(int i, byte[] bArr) {
        return Float.intBitsToFloat(m2409(i, bArr));
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m2401(byte[] bArr, int i, C0382 c0382) throws zzlk {
        int iM2411 = m2411(bArr, i, c0382);
        int i2 = c0382.f2648;
        if (i2 < 0) {
            throw zzlk.m1613();
        }
        if (i2 > bArr.length - iM2411) {
            throw zzlk.m1616();
        }
        if (i2 == 0) {
            c0382.f2647 = C0315.f2430;
            return iM2411;
        }
        c0382.f2647 = C0315.m1833(bArr, iM2411, i2);
        return iM2411 + i2;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m2402(int i, byte[] bArr, int i2, int i3, C0405 c0405, C0382 c0382) throws zzlk {
        if ((i >>> 3) == 0) {
            throw new zzlk("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM2396 = m2396(bArr, i2, c0382);
            c0405.m2139(i, Long.valueOf(c0382.f2646));
            return iM2396;
        }
        if (i4 == 1) {
            c0405.m2139(i, Long.valueOf(m2415(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM2411 = m2411(bArr, i2, c0382);
            int i5 = c0382.f2648;
            if (i5 < 0) {
                throw zzlk.m1613();
            }
            if (i5 > bArr.length - iM2411) {
                throw zzlk.m1616();
            }
            if (i5 == 0) {
                c0405.m2139(i, C0315.f2430);
            } else {
                c0405.m2139(i, C0315.m1833(bArr, iM2411, i5));
            }
            return iM2411 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzlk("Protocol message contained an invalid tag (zero).");
            }
            c0405.m2139(i, Integer.valueOf(m2409(i2, bArr)));
            return i2 + 4;
        }
        C0405 c0405M2137 = C0405.m2137();
        int i6 = (i & (-8)) | 4;
        int i7 = c0382.f2649 + 1;
        c0382.f2649 = i7;
        if (i7 >= 100) {
            throw new zzlk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iM24112 = m2411(bArr, i2, c0382);
            int i9 = c0382.f2648;
            i8 = i9;
            if (i9 == i6) {
                i2 = iM24112;
                break;
            }
            int iM2402 = m2402(i8, bArr, iM24112, i3, c0405M2137, c0382);
            i8 = i9;
            i2 = iM2402;
        }
        c0382.f2649--;
        if (i2 > i3 || i8 != i6) {
            throw zzlk.m1614();
        }
        c0405.m2139(i, c0405M2137);
        return i2;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static int m2403(InterfaceC0494 interfaceC0494, int i, byte[] bArr, int i2, int i3, InterfaceC0465 interfaceC0465, C0382 c0382) throws zzlk {
        AbstractC0583 abstractC0583Mo1845 = interfaceC0494.mo1845();
        int iM2407 = m2407(abstractC0583Mo1845, interfaceC0494, bArr, i2, i3, c0382);
        interfaceC0494.mo1846(abstractC0583Mo1845);
        c0382.f2647 = abstractC0583Mo1845;
        interfaceC0465.add(abstractC0583Mo1845);
        while (iM2407 < i3) {
            int iM2411 = m2411(bArr, iM2407, c0382);
            if (i != c0382.f2648) {
                break;
            }
            AbstractC0583 abstractC0583Mo18452 = interfaceC0494.mo1845();
            int iM24072 = m2407(abstractC0583Mo18452, interfaceC0494, bArr, iM2411, i3, c0382);
            interfaceC0494.mo1846(abstractC0583Mo18452);
            c0382.f2647 = abstractC0583Mo18452;
            interfaceC0465.add(abstractC0583Mo18452);
            iM2407 = iM24072;
        }
        return iM2407;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static boolean m2404(Object obj) {
        return !((C0360) obj).f2604;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static double m2405(int i, byte[] bArr) {
        return Double.longBitsToDouble(m2415(i, bArr));
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m2406(Object obj, InterfaceC0494 interfaceC0494, byte[] bArr, int i, int i2, int i3, C0382 c0382) throws zzlk {
        C0474 c0474 = (C0474) interfaceC0494;
        int i4 = c0382.f2649 + 1;
        c0382.f2649 = i4;
        if (i4 >= 100) {
            throw new zzlk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iM2278 = c0474.m2278(obj, bArr, i, i2, i3, c0382);
        c0382.f2649--;
        c0382.f2647 = obj;
        return iM2278;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m2407(Object obj, InterfaceC0494 interfaceC0494, byte[] bArr, int i, int i2, C0382 c0382) throws zzlk {
        int iM2412 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM2412 = m2412(i3, bArr, iM2412, c0382);
            i3 = c0382.f2648;
        }
        int i4 = iM2412;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzlk.m1616();
        }
        int i5 = c0382.f2649 + 1;
        c0382.f2649 = i5;
        if (i5 >= 100) {
            throw new zzlk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i3 + i4;
        interfaceC0494.mo1847(obj, bArr, i4, i6, c0382);
        c0382.f2649--;
        c0382.f2647 = obj;
        return i6;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static void m2408(Object obj, Object obj2) {
        C0360 c0360 = (C0360) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (c0360.isEmpty()) {
            return;
        }
        Iterator it = c0360.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static int m2409(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static int m2410(byte[] bArr, int i, C0382 c0382) throws zzlk {
        int iM2411 = m2411(bArr, i, c0382);
        int i2 = c0382.f2648;
        if (i2 < 0) {
            throw zzlk.m1613();
        }
        if (i2 == 0) {
            c0382.f2647 = "";
            return iM2411;
        }
        AbstractC0446.f2751.getClass();
        if ((iM2411 | i2 | ((bArr.length - iM2411) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(iM2411), Integer.valueOf(i2)));
        }
        int i3 = iM2411 + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (iM2411 < i3) {
            byte b = bArr[iM2411];
            if (b < 0) {
                break;
            }
            iM2411++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (iM2411 < i3) {
            int i5 = iM2411 + 1;
            byte b2 = bArr[iM2411];
            if (b2 >= 0) {
                int i6 = i4 + 1;
                cArr[i4] = (char) b2;
                while (i5 < i3) {
                    byte b3 = bArr[i5];
                    if (b3 < 0) {
                        break;
                    }
                    i5++;
                    cArr[i6] = (char) b3;
                    i6++;
                }
                i4 = i6;
                iM2411 = i5;
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    throw zzlk.m1615();
                }
                iM2411 += 2;
                byte b4 = bArr[i5];
                int i7 = i4 + 1;
                if (b2 < -62 || AbstractC0361.m2009(b4)) {
                    throw zzlk.m1615();
                }
                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                i4 = i7;
            } else if (b2 < -16) {
                if (i5 >= i3 - 1) {
                    throw zzlk.m1615();
                }
                int i8 = iM2411 + 2;
                byte b5 = bArr[i5];
                iM2411 += 3;
                byte b6 = bArr[i8];
                int i9 = i4 + 1;
                if (AbstractC0361.m2009(b5) || ((b2 == -32 && b5 < -96) || ((b2 == -19 && b5 >= -96) || AbstractC0361.m2009(b6)))) {
                    throw zzlk.m1615();
                }
                cArr[i4] = (char) (((b5 & 63) << 6) | ((b2 & 15) << 12) | (b6 & 63));
                i4 = i9;
            } else {
                if (i5 >= i3 - 2) {
                    throw zzlk.m1615();
                }
                byte b7 = bArr[i5];
                int i10 = iM2411 + 3;
                byte b8 = bArr[iM2411 + 2];
                iM2411 += 4;
                byte b9 = bArr[i10];
                int i11 = i4 + 1;
                if (AbstractC0361.m2009(b7) || (((b7 + 112) + (b2 << 28)) >> 30) != 0 || AbstractC0361.m2009(b8) || AbstractC0361.m2009(b9)) {
                    throw zzlk.m1615();
                }
                int i12 = ((b7 & 63) << 12) | ((b2 & 7) << 18) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i4] = (char) ((i12 >>> 10) + 55232);
                cArr[i11] = (char) ((i12 & 1023) + 56320);
                i4 += 2;
            }
        }
        c0382.f2647 = new String(cArr, 0, i4);
        return i3;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static int m2411(byte[] bArr, int i, C0382 c0382) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m2412(b, bArr, i2, c0382);
        }
        c0382.f2648 = b;
        return i2;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m2412(int i, byte[] bArr, int i2, C0382 c0382) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c0382.f2648 = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c0382.f2648 = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c0382.f2648 = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c0382.f2648 = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c0382.f2648 = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static int m2413(byte[] bArr, int i, InterfaceC0465 interfaceC0465, C0382 c0382) throws zzlk {
        C0521 c0521 = (C0521) interfaceC0465;
        int iM2411 = m2411(bArr, i, c0382);
        int i2 = c0382.f2648 + iM2411;
        while (iM2411 < i2) {
            iM2411 = m2411(bArr, iM2411, c0382);
            c0521.m2382(c0382.f2648);
        }
        if (iM2411 == i2) {
            return iM2411;
        }
        throw zzlk.m1616();
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static C0360 m2414(Object obj) {
        return (C0360) obj;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static long m2415(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
