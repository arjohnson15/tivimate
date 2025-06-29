package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.ᵎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0656 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0622 f3063;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C0622 f3064;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Class f3065;

    static {
        Class<?> cls;
        Class<?> cls2;
        C0622 c0622 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f3065 = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                c0622 = (C0622) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f3063 = c0622;
        f3064 = new C0622();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m2674(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        if (list instanceof AbstractC0659) {
            throw new ClassCastException();
        }
        C0678 c0678 = (C0678) c0679.f3103;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0678.m2763(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c0678.m2757(i3);
        while (i2 < list.size()) {
            c0678.m2756(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m2675(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        boolean z2 = list instanceof C0673;
        int i2 = 0;
        C0678 c0678 = (C0678) c0679.f3103;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0678.m2755(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c0678.m2751(i, 2);
            int iM2747 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM2747 += C0678.m2747(((Integer) list.get(i3)).intValue());
            }
            c0678.m2757(iM2747);
            while (i2 < list.size()) {
                c0678.m2757(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C0673 c0673 = (C0673) list;
        if (!z) {
            while (i2 < c0673.f3092) {
                c0678.m2755(i, c0673.m2737(i2));
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int iM27472 = 0;
        for (int i4 = 0; i4 < c0673.f3092; i4++) {
            iM27472 += C0678.m2747(c0673.m2737(i4));
        }
        c0678.m2757(iM27472);
        while (i2 < c0673.f3092) {
            c0678.m2757(c0673.m2737(i2));
            i2++;
        }
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static void m2676(C0622 c0622, Object obj, Object obj2) {
        c0622.getClass();
        AbstractC0662 abstractC0662 = (AbstractC0662) obj;
        C0652 c0652 = abstractC0662.zzc;
        C0652 c06522 = ((AbstractC0662) obj2).zzc;
        C0652 c06523 = C0652.f3053;
        if (!c06523.equals(c06522)) {
            if (c06523.equals(c0652)) {
                int i = c0652.f3057 + c06522.f3057;
                int[] iArrCopyOf = Arrays.copyOf(c0652.f3054, i);
                System.arraycopy(c06522.f3054, 0, iArrCopyOf, c0652.f3057, c06522.f3057);
                Object[] objArrCopyOf = Arrays.copyOf(c0652.f3056, i);
                System.arraycopy(c06522.f3056, 0, objArrCopyOf, c0652.f3057, c06522.f3057);
                c0652 = new C0652(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c0652.getClass();
                if (!c06522.equals(c06523)) {
                    if (!c0652.f3055) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c0652.f3057 + c06522.f3057;
                    c0652.m2668(i2);
                    System.arraycopy(c06522.f3054, 0, c0652.f3054, c0652.f3057, c06522.f3057);
                    System.arraycopy(c06522.f3056, 0, c0652.f3056, c0652.f3057, c06522.f3057);
                    c0652.f3057 = i2;
                }
            }
        }
        abstractC0662.zzc = c0652;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static void m2677(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        if (list instanceof AbstractC0659) {
            throw new ClassCastException();
        }
        C0678 c0678 = (C0678) c0679.f3103;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0678.m2752(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int iM2749 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM2749 += C0678.m2749(((Long) list.get(i3)).longValue());
        }
        c0678.m2757(iM2749);
        while (i2 < list.size()) {
            c0678.m2760(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static void m2678(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        if (list instanceof AbstractC0601) {
            throw new ClassCastException();
        }
        C0678 c0678 = (C0678) c0679.f3103;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0678.m2754(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        c0678.m2757(i3);
        while (i2 < list.size()) {
            c0678.m2764(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static int m2679(List list) {
        return list.size() * 4;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static int m2680(List list) {
        return list.size() * 8;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static void m2681(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        if (list instanceof AbstractC0670) {
            throw new ClassCastException();
        }
        C0678 c0678 = (C0678) c0679.f3103;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c0678.m2757(i << 3);
                c0678.m2759(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        c0678.m2757(i3);
        while (i2 < list.size()) {
            c0678.m2759(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static int m2682(List list) {
        int iM2749;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0673) {
            C0673 c0673 = (C0673) list;
            iM2749 = 0;
            while (i < size) {
                iM2749 += C0678.m2749(c0673.m2737(i));
                i++;
            }
        } else {
            iM2749 = 0;
            while (i < size) {
                iM2749 += C0678.m2749(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM2749;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static int m2683(List list) {
        int iM2747;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0673) {
            C0673 c0673 = (C0673) list;
            iM2747 = 0;
            while (i < size) {
                iM2747 += C0678.m2747(c0673.m2737(i));
                i++;
            }
        } else {
            iM2747 = 0;
            while (i < size) {
                iM2747 += C0678.m2747(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM2747;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static int m2684(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0678.m2747(i << 3) + 8) * size;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static int m2685(int i, Object obj, InterfaceC0638 interfaceC0638) {
        return C0678.m2745((AbstractC0625) obj, interfaceC0638) + C0678.m2747(i << 3);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m2686(List list) {
        int iM2749;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0673) {
            C0673 c0673 = (C0673) list;
            iM2749 = 0;
            while (i < size) {
                iM2749 += C0678.m2749(c0673.m2737(i));
                i++;
            }
        } else {
            iM2749 = 0;
            while (i < size) {
                iM2749 += C0678.m2749(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM2749;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m2687(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        boolean z2 = list instanceof C0673;
        int i2 = 0;
        C0678 c0678 = (C0678) c0679.f3103;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    c0678.m2755(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            c0678.m2751(i, 2);
            int iM2747 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM2747 += C0678.m2747((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            c0678.m2757(iM2747);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                c0678.m2757((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        C0673 c0673 = (C0673) list;
        if (!z) {
            while (i2 < c0673.f3092) {
                int iM2737 = c0673.m2737(i2);
                c0678.m2755(i, (iM2737 >> 31) ^ (iM2737 + iM2737));
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int iM27472 = 0;
        for (int i4 = 0; i4 < c0673.f3092; i4++) {
            int iM27372 = c0673.m2737(i4);
            iM27472 += C0678.m2747((iM27372 >> 31) ^ (iM27372 + iM27372));
        }
        c0678.m2757(iM27472);
        while (i2 < c0673.f3092) {
            int iM27373 = c0673.m2737(i2);
            c0678.m2757((iM27373 >> 31) ^ (iM27373 + iM27373));
            i2++;
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static int m2688(List list) {
        int iM2747;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0673) {
            C0673 c0673 = (C0673) list;
            iM2747 = 0;
            while (i < size) {
                int iM2737 = c0673.m2737(i);
                iM2747 += C0678.m2747((iM2737 >> 31) ^ (iM2737 + iM2737));
                i++;
            }
        } else {
            iM2747 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM2747 += C0678.m2747((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iM2747;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m2689(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        boolean z2 = list instanceof C0673;
        int i2 = 0;
        C0678 c0678 = (C0678) c0679.f3103;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0678.m2754(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c0678.m2751(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            c0678.m2757(i3);
            while (i2 < list.size()) {
                c0678.m2764(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C0673 c0673 = (C0673) list;
        if (!z) {
            while (i2 < c0673.f3092) {
                c0678.m2754(i, c0673.m2737(i2));
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c0673.f3092; i6++) {
            c0673.m2737(i6);
            i5 += 4;
        }
        c0678.m2757(i5);
        while (i2 < c0673.f3092) {
            c0678.m2764(c0673.m2737(i2));
            i2++;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m2690(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        boolean z2 = list instanceof C0673;
        int i2 = 0;
        C0678 c0678 = (C0678) c0679.f3103;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0678.m2754(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c0678.m2751(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            c0678.m2757(i3);
            while (i2 < list.size()) {
                c0678.m2764(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C0673 c0673 = (C0673) list;
        if (!z) {
            while (i2 < c0673.f3092) {
                c0678.m2754(i, c0673.m2737(i2));
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c0673.f3092; i6++) {
            c0673.m2737(i6);
            i5 += 4;
        }
        c0678.m2757(i5);
        while (i2 < c0673.f3092) {
            c0678.m2764(c0673.m2737(i2));
            i2++;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m2691(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        if (list instanceof AbstractC0659) {
            throw new ClassCastException();
        }
        C0678 c0678 = (C0678) c0679.f3103;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0678.m2752(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int iM2749 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM2749 += C0678.m2749(((Long) list.get(i3)).longValue());
        }
        c0678.m2757(iM2749);
        while (i2 < list.size()) {
            c0678.m2760(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static boolean m2692(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static void m2693(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        boolean z2 = list instanceof C0673;
        int i2 = 0;
        C0678 c0678 = (C0678) c0679.f3103;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0678.m2762(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c0678.m2751(i, 2);
            int iM2749 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM2749 += C0678.m2749(((Integer) list.get(i3)).intValue());
            }
            c0678.m2757(iM2749);
            while (i2 < list.size()) {
                c0678.m2753(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C0673 c0673 = (C0673) list;
        if (!z) {
            while (i2 < c0673.f3092) {
                c0678.m2762(i, c0673.m2737(i2));
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int iM27492 = 0;
        for (int i4 = 0; i4 < c0673.f3092; i4++) {
            iM27492 += C0678.m2749(c0673.m2737(i4));
        }
        c0678.m2757(iM27492);
        while (i2 < c0673.f3092) {
            c0678.m2753(c0673.m2737(i2));
            i2++;
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static int m2694(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0659) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM2749 = 0;
        for (int i = 0; i < size; i++) {
            iM2749 += C0678.m2749(((Long) list.get(i)).longValue());
        }
        return iM2749;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static int m2695(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0659) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM2749 = 0;
        for (int i = 0; i < size; i++) {
            iM2749 += C0678.m2749(((Long) list.get(i)).longValue());
        }
        return iM2749;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static int m2696(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0659) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM2749 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM2749 += C0678.m2749((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iM2749;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static Object m2697(Object obj, int i, int i2, Object obj2, C0622 c0622) {
        Object obj3 = obj2;
        if (obj2 == null) {
            c0622.getClass();
            AbstractC0662 abstractC0662 = (AbstractC0662) obj;
            C0652 c0652 = abstractC0662.zzc;
            obj3 = c0652;
            if (c0652 == C0652.f3053) {
                C0652 c0652M2667 = C0652.m2667();
                abstractC0662.zzc = c0652M2667;
                obj3 = c0652M2667;
            }
        }
        c0622.getClass();
        ((C0652) obj3).m2669(i << 3, Long.valueOf(i2));
        return obj3;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m2698(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        if (list instanceof AbstractC0659) {
            throw new ClassCastException();
        }
        C0678 c0678 = (C0678) c0679.f3103;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0678.m2763(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c0678.m2757(i3);
        while (i2 < list.size()) {
            c0678.m2756(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m2699(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        if (list instanceof AbstractC0659) {
            throw new ClassCastException();
        }
        C0678 c0678 = (C0678) c0679.f3103;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c0678.m2752(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int iM2749 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM2749 += C0678.m2749((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        c0678.m2757(iM2749);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c0678.m2760((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static int m2700(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0678.m2747(i << 3) + 4) * size;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static void m2701(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        boolean z2 = list instanceof C0673;
        int i2 = 0;
        C0678 c0678 = (C0678) c0679.f3103;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    c0678.m2762(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c0678.m2751(i, 2);
            int iM2749 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM2749 += C0678.m2749(((Integer) list.get(i3)).intValue());
            }
            c0678.m2757(iM2749);
            while (i2 < list.size()) {
                c0678.m2753(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C0673 c0673 = (C0673) list;
        if (!z) {
            while (i2 < c0673.f3092) {
                c0678.m2762(i, c0673.m2737(i2));
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int iM27492 = 0;
        for (int i4 = 0; i4 < c0673.f3092; i4++) {
            iM27492 += C0678.m2749(c0673.m2737(i4));
        }
        c0678.m2757(iM27492);
        while (i2 < c0673.f3092) {
            c0678.m2753(c0673.m2737(i2));
            i2++;
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static void m2702(int i, List list, C0679 c0679, boolean z) throws zzbw {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0679.getClass();
        if (list instanceof AbstractC0677) {
            throw new ClassCastException();
        }
        C0678 c0678 = (C0678) c0679.f3103;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0678.m2763(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        c0678.m2751(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        c0678.m2757(i3);
        while (i2 < list.size()) {
            c0678.m2756(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }
}
