package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p334.C3789;

/* renamed from: com.google.android.gms.internal.measurement.ⁱﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0543 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final /* synthetic */ int[] f2884 = {1, 2, 3, 4, 5, 6, 7};

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C0372 f2885;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static EnumC0356 m2436(String str) throws NumberFormatException {
        EnumC0356 enumC0356;
        if (str == null || str.isEmpty()) {
            enumC0356 = null;
        } else {
            enumC0356 = (EnumC0356) EnumC0356.f2541.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (enumC0356 != null) {
            return enumC0356;
        }
        throw new IllegalArgumentException(ᵎﹳ.ᐧʻ.ﾞˊ("Unsupported commandId ", str));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static HashMap m2437(C0402 c0402) {
        HashMap map = new HashMap();
        c0402.getClass();
        Iterator it = new ArrayList(c0402.f2685.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object objM2444 = m2444(c0402.mo1870(str));
            if (objM2444 != null) {
                map.put(str, objM2444);
            }
        }
        return map;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static boolean m2438(InterfaceC0489 interfaceC0489, InterfaceC0489 interfaceC04892) {
        if (!interfaceC0489.getClass().equals(interfaceC04892.getClass())) {
            return false;
        }
        if ((interfaceC0489 instanceof C0550) || (interfaceC0489 instanceof C0385)) {
            return true;
        }
        if (!(interfaceC0489 instanceof C0477)) {
            return interfaceC0489 instanceof C0429 ? interfaceC0489.mo1876().equals(interfaceC04892.mo1876()) : interfaceC0489 instanceof C0469 ? interfaceC0489.mo1875().equals(interfaceC04892.mo1875()) : interfaceC0489 == interfaceC04892;
        }
        if (Double.isNaN(interfaceC0489.mo1860().doubleValue()) || Double.isNaN(interfaceC04892.mo1860().doubleValue())) {
            return false;
        }
        return interfaceC0489.mo1860().equals(interfaceC04892.mo1860());
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static void m2439(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static void m2440(EnumC0356 enumC0356, int i, ArrayList arrayList) {
        m2439(i, enumC0356.name(), arrayList);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static int m2441(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d)) * (d > 0.0d ? 1 : -1)) % 4.294967296E9d);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static void m2442(String str, int i, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static synchronized void m2443(C0372 c0372) {
        if (f2885 != null) {
            throw new IllegalStateException("init() already called");
        }
        f2885 = c0372;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static Object m2444(InterfaceC0489 interfaceC0489) {
        if (InterfaceC0489.f2823.equals(interfaceC0489)) {
            return null;
        }
        if (InterfaceC0489.f2827.equals(interfaceC0489)) {
            return "";
        }
        if (interfaceC0489 instanceof C0402) {
            return m2437((C0402) interfaceC0489);
        }
        if (!(interfaceC0489 instanceof C0335)) {
            return !interfaceC0489.mo1860().isNaN() ? interfaceC0489.mo1860() : interfaceC0489.mo1876();
        }
        ArrayList arrayList = new ArrayList();
        C0335 c0335 = (C0335) interfaceC0489;
        c0335.getClass();
        int i = 0;
        while (i < c0335.m1872()) {
            if (i >= c0335.m1872()) {
                throw new NoSuchElementException(ـˈ.ˉᵎ.ˉⁱ("Out of bounds index: ", i));
            }
            int i2 = i + 1;
            Object objM2444 = m2444(c0335.m1868(i));
            if (objM2444 != null) {
                arrayList.add(objM2444);
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static double m2445(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == -0.0d) {
            return d;
        }
        return Math.floor(Math.abs(d)) * (d > 0.0d ? 1 : -1);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m2446(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m2447(EnumC0356 enumC0356, int i, ArrayList arrayList) {
        m2446(i, enumC0356.name(), arrayList);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static boolean m2448(InterfaceC0489 interfaceC0489) {
        if (interfaceC0489 == null) {
            return false;
        }
        Double dMo1860 = interfaceC0489.mo1860();
        return !dMo1860.isNaN() && dMo1860.doubleValue() >= 0.0d && dMo1860.equals(Double.valueOf(Math.floor(dMo1860.doubleValue())));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m2449(C0315 c0315) {
        StringBuilder sb = new StringBuilder(c0315.mo1834());
        for (int i = 0; i < c0315.mo1834(); i++) {
            byte bMo1836 = c0315.mo1836(i);
            if (bMo1836 == 34) {
                sb.append("\\\"");
            } else if (bMo1836 == 39) {
                sb.append("\\'");
            } else if (bMo1836 != 92) {
                switch (bMo1836) {
                    case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo1836 < 32 || bMo1836 > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo1836 >>> 6) & 3) + 48));
                            sb.append((char) (((bMo1836 >>> 3) & 7) + 48));
                            sb.append((char) ((bMo1836 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bMo1836);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m2450(ﹶˋ.ـﹶ r5) {
        int iM2441 = m2441(r5.יʻ("runtime.counter").mo1860().doubleValue() + 1.0d);
        if (iM2441 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        r5.ˆʿ("runtime.counter", new C0477(Double.valueOf(iM2441)));
    }
}
