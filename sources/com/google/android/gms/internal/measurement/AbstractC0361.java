package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Level;
import java.util.logging.Logger;
import p200.C2755;
import p353.AbstractC4020;
import p353.C4011;
import p353.C4018;

/* renamed from: com.google.android.gms.internal.measurement.ˈʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0361 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static volatile AbstractC4020 f2605;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static int m1996(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0346.m1929(i) * size) + m2034(list);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m1997(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0346.m1918(i) * size;
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static int m1998(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0346.m1929(i) * size) + m2020(list);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static long m1999(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static void m2000(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        if (list instanceof AbstractC0491) {
            throw new ClassCastException();
        }
        C0346 c0346 = (C0346) c0355.f2536;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c0346.getClass();
                c0346.m1944(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c0346.m1939(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C0346.f2469;
            i3 += 8;
        }
        c0346.m1935(i3);
        while (i2 < list.size()) {
            c0346.m1932(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static int m2001(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static void m2002(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        boolean z2 = list instanceof C0548;
        int i2 = 0;
        C0346 c0346 = (C0346) c0355.f2536;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0346.m1944(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c0346.m1939(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = C0346.f2469;
                i3 += 8;
            }
            c0346.m1935(i3);
            while (i2 < list.size()) {
                c0346.m1932(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C0548 c0548 = (C0548) list;
        if (!z) {
            while (i2 < c0548.f2897) {
                c0346.m1944(i, c0548.m2469(i2));
                i2++;
            }
            return;
        }
        c0346.m1939(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c0548.f2897; i6++) {
            c0548.m2469(i6);
            Logger logger2 = C0346.f2469;
            i5 += 8;
        }
        c0346.m1935(i5);
        while (i2 < c0548.f2897) {
            c0346.m1932(c0548.m2469(i2));
            i2++;
        }
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static int m2003(List list) {
        return list.size() << 3;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m2004(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        if (list instanceof AbstractC0468) {
            throw new ClassCastException();
        }
        C0346 c0346 = (C0346) c0355.f2536;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c0346.m1939(i, 0);
                c0346.m1943(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c0346.m1939(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C0346.f2469;
            i3++;
        }
        c0346.m1935(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            c0346.m1943(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static void m2005(Object obj, Object obj2) {
        AbstractC0583 abstractC0583 = (AbstractC0583) obj;
        C0405 c0405 = abstractC0583.zzb;
        C0405 c04052 = ((AbstractC0583) obj2).zzb;
        C0405 c04053 = C0405.f2688;
        if (!c04053.equals(c04052)) {
            if (c04053.equals(c0405)) {
                int i = c0405.f2692 + c04052.f2692;
                int[] iArrCopyOf = Arrays.copyOf(c0405.f2689, i);
                System.arraycopy(c04052.f2689, 0, iArrCopyOf, c0405.f2692, c04052.f2692);
                Object[] objArrCopyOf = Arrays.copyOf(c0405.f2691, i);
                System.arraycopy(c04052.f2691, 0, objArrCopyOf, c0405.f2692, c04052.f2692);
                c0405 = new C0405(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c0405.getClass();
                if (!c04052.equals(c04053)) {
                    if (!c0405.f2690) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c0405.f2692 + c04052.f2692;
                    c0405.m2138(i2);
                    System.arraycopy(c04052.f2689, 0, c0405.f2689, c0405.f2692, c04052.f2692);
                    System.arraycopy(c04052.f2691, 0, c0405.f2691, c0405.f2692, c04052.f2692);
                    c0405.f2692 = i2;
                }
            }
        }
        abstractC0583.zzb = c0405;
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static void m2006(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        boolean z2 = list instanceof C0548;
        int i2 = 0;
        C0346 c0346 = (C0346) c0355.f2536;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    c0346.m1940(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            c0346.m1939(i, 2);
            int iM1922 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iM1922 += C0346.m1922((jLongValue2 >> 63) ^ (jLongValue2 << 1));
            }
            c0346.m1935(iM1922);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                c0346.m1934((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                i2++;
            }
            return;
        }
        C0548 c0548 = (C0548) list;
        if (!z) {
            while (i2 < c0548.f2897) {
                long jM2469 = c0548.m2469(i2);
                c0346.m1940(i, (jM2469 >> 63) ^ (jM2469 << 1));
                i2++;
            }
            return;
        }
        c0346.m1939(i, 2);
        int iM19222 = 0;
        for (int i4 = 0; i4 < c0548.f2897; i4++) {
            long jM24692 = c0548.m2469(i4);
            iM19222 += C0346.m1922((jM24692 >> 63) ^ (jM24692 << 1));
        }
        c0346.m1935(iM19222);
        while (i2 < c0548.f2897) {
            long jM24693 = c0548.m2469(i2);
            c0346.m1934((jM24693 >> 63) ^ (jM24693 << 1));
            i2++;
        }
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static void m2007(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        if (list instanceof AbstractC0470) {
            throw new ClassCastException();
        }
        C0346 c0346 = (C0346) c0355.f2536;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c0346.getClass();
                c0346.m1942(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c0346.m1939(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C0346.f2469;
            i3 += 4;
        }
        c0346.m1935(i3);
        while (i2 < list.size()) {
            c0346.m1938(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static int m2008(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM1929 = C0346.m1929(i) * size;
        if (list instanceof InterfaceC0499) {
            InterfaceC0499 interfaceC0499 = (InterfaceC0499) list;
            while (i2 < size) {
                Object objM2334 = interfaceC0499.m2334();
                if (objM2334 instanceof C0315) {
                    int iMo1834 = ((C0315) objM2334).mo1834();
                    iM1929 = C0346.m1913(iMo1834) + iMo1834 + iM1929;
                } else {
                    iM1929 = C0346.m1919((String) objM2334) + iM1929;
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof C0315) {
                    int iMo18342 = ((C0315) obj).mo1834();
                    iM1929 = C0346.m1913(iMo18342) + iMo18342 + iM1929;
                } else {
                    iM1929 = C0346.m1919((String) obj) + iM1929;
                }
                i2++;
            }
        }
        return iM1929;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static boolean m2009(byte b) {
        return b > -65;
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static void m2010(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        boolean z2 = list instanceof C0521;
        int i2 = 0;
        C0346 c0346 = (C0346) c0355.f2536;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0346.m1931(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c0346.m1939(i, 2);
            int iM1913 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM1913 += C0346.m1913(((Integer) list.get(i3)).intValue());
            }
            c0346.m1935(iM1913);
            while (i2 < list.size()) {
                c0346.m1935(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C0521 c0521 = (C0521) list;
        if (!z) {
            while (i2 < c0521.f2866) {
                c0346.m1931(i, c0521.m2381(i2));
                i2++;
            }
            return;
        }
        c0346.m1939(i, 2);
        int iM19132 = 0;
        for (int i4 = 0; i4 < c0521.f2866; i4++) {
            iM19132 += C0346.m1913(c0521.m2381(i4));
        }
        c0346.m1935(iM19132);
        while (i2 < c0521.f2866) {
            c0346.m1935(c0521.m2381(i2));
            i2++;
        }
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static int m2011(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0346.m1929(i) * size) + m2026(list);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static int m2012(List list) {
        int iM1922;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0521) {
            C0521 c0521 = (C0521) list;
            iM1922 = 0;
            while (i < size) {
                iM1922 += C0346.m1922(c0521.m2381(i));
                i++;
            }
        } else {
            iM1922 = 0;
            while (i < size) {
                iM1922 += C0346.m1922(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM1922;
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static int m2013(List list) {
        int iM1913;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0521) {
            C0521 c0521 = (C0521) list;
            iM1913 = 0;
            while (i < size) {
                iM1913 += C0346.m1913(c0521.m2381(i));
                i++;
            }
        } else {
            iM1913 = 0;
            while (i < size) {
                iM1913 += C0346.m1913(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM1913;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static void m2014(Object obj, int i, InterfaceC0465 interfaceC0465, InterfaceC0566 interfaceC0566) {
        if (interfaceC0566 == null) {
            return;
        }
        boolean z = interfaceC0465 instanceof RandomAccess;
        C0405 c0405 = C0405.f2688;
        C0405 c04052 = null;
        if (!z) {
            Iterator it = interfaceC0465.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!interfaceC0566.mo2337(iIntValue)) {
                    if (c04052 == null) {
                        AbstractC0583 abstractC0583 = (AbstractC0583) obj;
                        C0405 c0405M2137 = abstractC0583.zzb;
                        if (c0405M2137 == c0405) {
                            c0405M2137 = C0405.m2137();
                            abstractC0583.zzb = c0405M2137;
                        }
                        c04052 = c0405M2137;
                    }
                    c04052.m2139(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return;
        }
        int size = interfaceC0465.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) interfaceC0465.get(i3);
            int iIntValue2 = num.intValue();
            if (interfaceC0566.mo2337(iIntValue2)) {
                if (i3 != i2) {
                    interfaceC0465.set(i2, num);
                }
                i2++;
            } else {
                if (c04052 == null) {
                    AbstractC0583 abstractC05832 = (AbstractC0583) obj;
                    C0405 c0405M21372 = abstractC05832.zzb;
                    if (c0405M21372 == c0405) {
                        c0405M21372 = C0405.m2137();
                        abstractC05832.zzb = c0405M21372;
                    }
                    c04052 = c0405M21372;
                }
                c04052.m2139(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            interfaceC0465.subList(i2, size).clear();
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static int m2015(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM1929 = C0346.m1929(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iMo1834 = ((C0315) list.get(i2)).mo1834();
            iM1929 += C0346.m1913(iMo1834) + iMo1834;
        }
        return iM1929;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m2016(int i, List list, C0355 c0355) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C0315 c0315 = (C0315) list.get(i2);
            C0346 c0346 = (C0346) c0355.f2536;
            c0346.m1939(i, 2);
            c0346.m1936(c0315);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m2017(int i, List list, InterfaceC0494 interfaceC0494) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM1926 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM1926 += C0346.m1926(i, (AbstractC0563) list.get(i2), interfaceC0494);
        }
        return iM1926;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static int m2018(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0346.m1929(i) * size) + m2012(list);
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static void m2019(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        boolean z2 = list instanceof C0548;
        int i2 = 0;
        C0346 c0346 = (C0346) c0355.f2536;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0346.m1940(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c0346.m1939(i, 2);
            int iM1922 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM1922 += C0346.m1922(((Long) list.get(i3)).longValue());
            }
            c0346.m1935(iM1922);
            while (i2 < list.size()) {
                c0346.m1934(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C0548 c0548 = (C0548) list;
        if (!z) {
            while (i2 < c0548.f2897) {
                c0346.m1940(i, c0548.m2469(i2));
                i2++;
            }
            return;
        }
        c0346.m1939(i, 2);
        int iM19222 = 0;
        for (int i4 = 0; i4 < c0548.f2897; i4++) {
            iM19222 += C0346.m1922(c0548.m2469(i4));
        }
        c0346.m1935(iM19222);
        while (i2 < c0548.f2897) {
            c0346.m1934(c0548.m2469(i2));
            i2++;
        }
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static int m2020(List list) {
        int iM1922;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0548) {
            C0548 c0548 = (C0548) list;
            iM1922 = 0;
            while (i < size) {
                long jM2469 = c0548.m2469(i);
                iM1922 += C0346.m1922((jM2469 >> 63) ^ (jM2469 << 1));
                i++;
            }
        } else {
            iM1922 = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM1922 += C0346.m1922((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
        }
        return iM1922;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m2021(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        boolean z2 = list instanceof C0521;
        int i2 = 0;
        C0346 c0346 = (C0346) c0355.f2536;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0346.m1937(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c0346.m1939(i, 2);
            int iM1922 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM1922 += C0346.m1922(((Integer) list.get(i3)).intValue());
            }
            c0346.m1935(iM1922);
            while (i2 < list.size()) {
                c0346.m1933(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C0521 c0521 = (C0521) list;
        if (!z) {
            while (i2 < c0521.f2866) {
                c0346.m1937(i, c0521.m2381(i2));
                i2++;
            }
            return;
        }
        c0346.m1939(i, 2);
        int iM19222 = 0;
        for (int i4 = 0; i4 < c0521.f2866; i4++) {
            iM19222 += C0346.m1922(c0521.m2381(i4));
        }
        c0346.m1935(iM19222);
        while (i2 < c0521.f2866) {
            c0346.m1933(c0521.m2381(i2));
            i2++;
        }
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static int m2022(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0346.m1929(i) * size) + m2028(list);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m2023(int i, Object obj, InterfaceC0494 interfaceC0494) {
        int iM1913 = C0346.m1913(i << 3);
        int iMo2513 = ((AbstractC0563) obj).mo2513(interfaceC0494);
        return C0346.m1913(iMo2513) + iMo2513 + iM1913;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C0539 m2024(Context context, File file) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                C2755 c2755 = new C2755(0);
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String str = "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName();
                        C0539 c0539 = new C0539(c2755);
                        bufferedReader.close();
                        return c0539;
                    }
                    String[] strArrSplit = line.split(" ", 3);
                    if (strArrSplit.length != 3) {
                        String str2 = "Invalid: " + line;
                    } else {
                        String str3 = new String(strArrSplit[0]);
                        String strDecode = Uri.decode(new String(strArrSplit[1]));
                        String strDecode2 = (String) map.get(strArrSplit[2]);
                        if (strDecode2 == null) {
                            String str4 = new String(strArrSplit[2]);
                            strDecode2 = Uri.decode(str4);
                            if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                map.put(str4, strDecode2);
                            }
                        }
                        C2755 c27552 = (C2755) c2755.get(str3);
                        if (c27552 == null) {
                            c27552 = new C2755(0);
                            c2755.put(str3, c27552);
                        }
                        c27552.put(strDecode, strDecode2);
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static AbstractC4020 m2025(Context context) {
        File file;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            AbstractC4020 c4011 = C4018.f15467;
            try {
                file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            } catch (RuntimeException e) {
            }
            AbstractC4020 c40112 = file.exists() ? new C4011(file) : c4011;
            if (c40112.mo9268()) {
                c4011 = new C4011(m2024(context, (File) c40112.mo9269()));
            }
            return c4011;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static int m2026(List list) {
        int iM1922;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0521) {
            C0521 c0521 = (C0521) list;
            iM1922 = 0;
            while (i < size) {
                iM1922 += C0346.m1922(c0521.m2381(i));
                i++;
            }
        } else {
            iM1922 = 0;
            while (i < size) {
                iM1922 += C0346.m1922(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM1922;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static void m2027(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        boolean z2 = list instanceof C0521;
        int i2 = 0;
        C0346 c0346 = (C0346) c0355.f2536;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0346.m1942(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c0346.m1939(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = C0346.f2469;
                i3 += 4;
            }
            c0346.m1935(i3);
            while (i2 < list.size()) {
                c0346.m1938(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C0521 c0521 = (C0521) list;
        if (!z) {
            while (i2 < c0521.f2866) {
                c0346.m1942(i, c0521.m2381(i2));
                i2++;
            }
            return;
        }
        c0346.m1939(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c0521.f2866; i6++) {
            c0521.m2381(i6);
            Logger logger2 = C0346.f2469;
            i5 += 4;
        }
        c0346.m1935(i5);
        while (i2 < c0521.f2866) {
            c0346.m1938(c0521.m2381(i2));
            i2++;
        }
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static int m2028(List list) {
        int iM1913;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0521) {
            C0521 c0521 = (C0521) list;
            iM1913 = 0;
            while (i < size) {
                int iM2381 = c0521.m2381(i);
                iM1913 += C0346.m1913((iM2381 >> 31) ^ (iM2381 << 1));
                i++;
            }
        } else {
            iM1913 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM1913 += C0346.m1913((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
        }
        return iM1913;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static boolean m2029(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public static void m2030(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        boolean z2 = list instanceof C0548;
        int i2 = 0;
        C0346 c0346 = (C0346) c0355.f2536;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0346.m1940(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c0346.m1939(i, 2);
            int iM1922 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM1922 += C0346.m1922(((Long) list.get(i3)).longValue());
            }
            c0346.m1935(iM1922);
            while (i2 < list.size()) {
                c0346.m1934(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C0548 c0548 = (C0548) list;
        if (!z) {
            while (i2 < c0548.f2897) {
                c0346.m1940(i, c0548.m2469(i2));
                i2++;
            }
            return;
        }
        c0346.m1939(i, 2);
        int iM19222 = 0;
        for (int i4 = 0; i4 < c0548.f2897; i4++) {
            iM19222 += C0346.m1922(c0548.m2469(i4));
        }
        c0346.m1935(iM19222);
        while (i2 < c0548.f2897) {
            c0346.m1934(c0548.m2469(i2));
            i2++;
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static void m2031(int i, List list, C0355 c0355) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        boolean z = list instanceof InterfaceC0499;
        C0346 c0346 = (C0346) c0355.f2536;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                c0346.m1939(i, 2);
                int i3 = c0346.f2472;
                try {
                    int iM1913 = C0346.m1913(str.length() * 3);
                    int iM19132 = C0346.m1913(str.length());
                    byte[] bArr = c0346.f2473;
                    if (iM19132 == iM1913) {
                        int i4 = i3 + iM19132;
                        c0346.f2472 = i4;
                        int iM2231 = AbstractC0446.m2231(str, bArr, i4, c0346.m1945());
                        c0346.f2472 = i3;
                        c0346.m1935((iM2231 - i3) - iM19132);
                        c0346.f2472 = iM2231;
                    } else {
                        c0346.m1935(AbstractC0446.m2233(str));
                        c0346.f2472 = AbstractC0446.m2231(str, bArr, c0346.f2472, c0346.m1945());
                    }
                } catch (C0564 e) {
                    c0346.f2472 = i3;
                    C0346.f2469.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                    byte[] bytes = str.getBytes(AbstractC0412.f2705);
                    try {
                        c0346.m1935(bytes.length);
                        c0346.m1941(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e2) {
                        throw new zzkl$zzb(e2);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    throw new zzkl$zzb(e3);
                }
            }
            return;
        }
        InterfaceC0499 interfaceC0499 = (InterfaceC0499) list;
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object objM2334 = interfaceC0499.m2334();
            if (objM2334 instanceof String) {
                String str2 = (String) objM2334;
                c0346.m1939(i, 2);
                int i6 = c0346.f2472;
                try {
                    int iM19133 = C0346.m1913(str2.length() * 3);
                    int iM19134 = C0346.m1913(str2.length());
                    byte[] bArr2 = c0346.f2473;
                    if (iM19134 == iM19133) {
                        int i7 = i6 + iM19134;
                        c0346.f2472 = i7;
                        int iM22312 = AbstractC0446.m2231(str2, bArr2, i7, c0346.m1945());
                        c0346.f2472 = i6;
                        c0346.m1935((iM22312 - i6) - iM19134);
                        c0346.f2472 = iM22312;
                    } else {
                        c0346.m1935(AbstractC0446.m2233(str2));
                        c0346.f2472 = AbstractC0446.m2231(str2, bArr2, c0346.f2472, c0346.m1945());
                    }
                } catch (C0564 e4) {
                    c0346.f2472 = i6;
                    C0346.f2469.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
                    byte[] bytes2 = str2.getBytes(AbstractC0412.f2705);
                    try {
                        c0346.m1935(bytes2.length);
                        c0346.m1941(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e5) {
                        throw new zzkl$zzb(e5);
                    }
                } catch (IndexOutOfBoundsException e6) {
                    throw new zzkl$zzb(e6);
                }
            } else {
                c0346.m1939(i, 2);
                c0346.m1936((C0315) objM2334);
            }
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static int m2032(int i, List list, InterfaceC0494 interfaceC0494) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM1929 = C0346.m1929(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iMo2513 = ((AbstractC0563) list.get(i2)).mo2513(interfaceC0494);
            iM1929 += C0346.m1913(iMo2513) + iMo2513;
        }
        return iM1929;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static void m2033(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        boolean z2 = list instanceof C0548;
        int i2 = 0;
        C0346 c0346 = (C0346) c0355.f2536;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0346.m1944(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c0346.m1939(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = C0346.f2469;
                i3 += 8;
            }
            c0346.m1935(i3);
            while (i2 < list.size()) {
                c0346.m1932(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C0548 c0548 = (C0548) list;
        if (!z) {
            while (i2 < c0548.f2897) {
                c0346.m1944(i, c0548.m2469(i2));
                i2++;
            }
            return;
        }
        c0346.m1939(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c0548.f2897; i6++) {
            c0548.m2469(i6);
            Logger logger2 = C0346.f2469;
            i5 += 8;
        }
        c0346.m1935(i5);
        while (i2 < c0548.f2897) {
            c0346.m1932(c0548.m2469(i2));
            i2++;
        }
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static int m2034(List list) {
        int iM1922;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0548) {
            C0548 c0548 = (C0548) list;
            iM1922 = 0;
            while (i < size) {
                iM1922 += C0346.m1922(c0548.m2469(i));
                i++;
            }
        } else {
            iM1922 = 0;
            while (i < size) {
                iM1922 += C0346.m1922(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iM1922;
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static void m2035(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        boolean z2 = list instanceof C0521;
        int i2 = 0;
        C0346 c0346 = (C0346) c0355.f2536;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0346.m1942(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c0346.m1939(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = C0346.f2469;
                i3 += 4;
            }
            c0346.m1935(i3);
            while (i2 < list.size()) {
                c0346.m1938(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C0521 c0521 = (C0521) list;
        if (!z) {
            while (i2 < c0521.f2866) {
                c0346.m1942(i, c0521.m2381(i2));
                i2++;
            }
            return;
        }
        c0346.m1939(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c0521.f2866; i6++) {
            c0521.m2381(i6);
            Logger logger2 = C0346.f2469;
            i5 += 4;
        }
        c0346.m1935(i5);
        while (i2 < c0521.f2866) {
            c0346.m1938(c0521.m2381(i2));
            i2++;
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static int m2036(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0346.m1929(i) * list.size()) + m2041(list);
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static int m2037(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0346.m1929(i) * size) + m2013(list);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static void m2038(int i, List list, C0355 c0355, InterfaceC0494 interfaceC0494) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0355.m1971(i, list.get(i2), interfaceC0494);
        }
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static int m2039(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0346.m1924(i) * size;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m2040(List list) {
        return list.size();
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static int m2041(List list) {
        int iM1922;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0548) {
            C0548 c0548 = (C0548) list;
            iM1922 = 0;
            while (i < size) {
                iM1922 += C0346.m1922(c0548.m2469(i));
                i++;
            }
        } else {
            iM1922 = 0;
            while (i < size) {
                iM1922 += C0346.m1922(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iM1922;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m2042(int i, List list, C0355 c0355, InterfaceC0494 interfaceC0494) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0355.m1986(i, list.get(i2), interfaceC0494);
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static int m2043(List list) {
        return list.size() << 2;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static int m2044(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0346.m1925(i) * size;
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public static void m2045(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        boolean z2 = list instanceof C0521;
        int i2 = 0;
        C0346 c0346 = (C0346) c0355.f2536;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    c0346.m1931(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            c0346.m1939(i, 2);
            int iM1913 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM1913 += C0346.m1913((iIntValue2 >> 31) ^ (iIntValue2 << 1));
            }
            c0346.m1935(iM1913);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                c0346.m1935((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                i2++;
            }
            return;
        }
        C0521 c0521 = (C0521) list;
        if (!z) {
            while (i2 < c0521.f2866) {
                int iM2381 = c0521.m2381(i2);
                c0346.m1931(i, (iM2381 >> 31) ^ (iM2381 << 1));
                i2++;
            }
            return;
        }
        c0346.m1939(i, 2);
        int iM19132 = 0;
        for (int i4 = 0; i4 < c0521.f2866; i4++) {
            int iM23812 = c0521.m2381(i4);
            iM19132 += C0346.m1913((iM23812 >> 31) ^ (iM23812 << 1));
        }
        c0346.m1935(iM19132);
        while (i2 < c0521.f2866) {
            int iM23813 = c0521.m2381(i2);
            c0346.m1935((iM23813 >> 31) ^ (iM23813 << 1));
            i2++;
        }
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static void m2046(int i, List list, C0355 c0355, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0355.getClass();
        boolean z2 = list instanceof C0521;
        int i2 = 0;
        C0346 c0346 = (C0346) c0355.f2536;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0346.m1937(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c0346.m1939(i, 2);
            int iM1922 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM1922 += C0346.m1922(((Integer) list.get(i3)).intValue());
            }
            c0346.m1935(iM1922);
            while (i2 < list.size()) {
                c0346.m1933(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C0521 c0521 = (C0521) list;
        if (!z) {
            while (i2 < c0521.f2866) {
                c0346.m1937(i, c0521.m2381(i2));
                i2++;
            }
            return;
        }
        c0346.m1939(i, 2);
        int iM19222 = 0;
        for (int i4 = 0; i4 < c0521.f2866; i4++) {
            iM19222 += C0346.m1922(c0521.m2381(i4));
        }
        c0346.m1935(iM19222);
        while (i2 < c0521.f2866) {
            c0346.m1933(c0521.m2381(i2));
            i2++;
        }
    }
}
