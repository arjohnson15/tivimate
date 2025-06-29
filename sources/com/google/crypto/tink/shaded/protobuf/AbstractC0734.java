package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˉᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0734 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final AbstractC0777 f3541;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final AbstractC0777 f3542;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Class f3543;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C0755 f3544;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f3543 = cls;
        f3541 = m2974(false);
        f3542 = m2974(true);
        f3544 = new C0755();
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static void m2967(int i, List list, C0756 c0756) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0756.getClass();
        boolean z = list instanceof InterfaceC0742;
        C0735 c0735 = (C0735) c0756.f3598;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                c0735.m3038(i, 2);
                int i3 = c0735.f3548;
                try {
                    int iM3035 = C0735.m3035(str.length() * 3);
                    int iM30352 = C0735.m3035(str.length());
                    byte[] bArr = c0735.f3549;
                    int i4 = c0735.f3550;
                    if (iM30352 == iM3035) {
                        int i5 = i3 + iM30352;
                        c0735.f3548 = i5;
                        int iMo31 = AbstractC0778.f3639.mo31(str, bArr, i5, i4 - i5);
                        c0735.f3548 = i3;
                        c0735.m3045((iMo31 - i3) - iM30352);
                        c0735.f3548 = iMo31;
                    } else {
                        c0735.m3045(AbstractC0778.m3216(str));
                        int i6 = c0735.f3548;
                        c0735.f3548 = AbstractC0778.f3639.mo31(str, bArr, i6, i4 - i6);
                    }
                } catch (C0750 e) {
                    c0735.f3548 = i3;
                    C0735.f3546.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                    byte[] bytes = str.getBytes(AbstractC0731.f3531);
                    try {
                        c0735.m3045(bytes.length);
                        c0735.m3039(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e2) {
                        throw new CodedOutputStream$OutOfSpaceException(e2);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    throw new CodedOutputStream$OutOfSpaceException(e3);
                }
            }
            return;
        }
        InterfaceC0742 interfaceC0742 = (InterfaceC0742) list;
        for (int i7 = 0; i7 < list.size(); i7++) {
            Object objMo2928 = interfaceC0742.mo2928(i7);
            if (objMo2928 instanceof String) {
                String str2 = (String) objMo2928;
                c0735.m3038(i, 2);
                int i8 = c0735.f3548;
                try {
                    int iM30353 = C0735.m3035(str2.length() * 3);
                    int iM30354 = C0735.m3035(str2.length());
                    byte[] bArr2 = c0735.f3549;
                    int i9 = c0735.f3550;
                    if (iM30354 == iM30353) {
                        int i10 = i8 + iM30354;
                        c0735.f3548 = i10;
                        int iMo312 = AbstractC0778.f3639.mo31(str2, bArr2, i10, i9 - i10);
                        c0735.f3548 = i8;
                        c0735.m3045((iMo312 - i8) - iM30354);
                        c0735.f3548 = iMo312;
                    } else {
                        c0735.m3045(AbstractC0778.m3216(str2));
                        int i11 = c0735.f3548;
                        c0735.f3548 = AbstractC0778.f3639.mo31(str2, bArr2, i11, i9 - i11);
                    }
                } catch (C0750 e4) {
                    c0735.f3548 = i8;
                    C0735.f3546.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
                    byte[] bytes2 = str2.getBytes(AbstractC0731.f3531);
                    try {
                        c0735.m3045(bytes2.length);
                        c0735.m3039(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e5) {
                        throw new CodedOutputStream$OutOfSpaceException(e5);
                    }
                } catch (IndexOutOfBoundsException e6) {
                    throw new CodedOutputStream$OutOfSpaceException(e6);
                }
            } else {
                c0735.m3038(i, 2);
                c0735.m3041((AbstractC0748) objMo2928);
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m2968(List list) {
        return list.size();
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static void m2969(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0735.m3046(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0735.m3038(i, 2);
        int iM3020 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM3020 += C0735.m3020(((Long) list.get(i3)).longValue());
        }
        c0735.m3045(iM3020);
        while (i2 < list.size()) {
            c0735.m3044(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m2970(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0784) {
            AbstractC0784 abstractC0784 = (AbstractC0784) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0784.m3231(0);
            throw null;
        }
        int iM3036 = 0;
        for (int i = 0; i < size; i++) {
            iM3036 += C0735.m3036(((Integer) list.get(i)).intValue());
        }
        return iM3036;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static int m2971(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM3030 = C0735.m3030(i) * size;
        if (list instanceof InterfaceC0742) {
            InterfaceC0742 interfaceC0742 = (InterfaceC0742) list;
            while (i2 < size) {
                Object objMo2928 = interfaceC0742.mo2928(i2);
                iM3030 = (objMo2928 instanceof AbstractC0748 ? C0735.m3021((AbstractC0748) objMo2928) : C0735.m3014((String) objMo2928)) + iM3030;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM3030 = (obj instanceof AbstractC0748 ? C0735.m3021((AbstractC0748) obj) : C0735.m3014((String) obj)) + iM3030;
                i2++;
            }
        }
        return iM3030;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static boolean m2972(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static void m2973(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c0735.getClass();
                c0735.m3043(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c0735.m3038(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C0735.f3546;
            i3 += 8;
        }
        c0735.m3045(i3);
        while (i2 < list.size()) {
            c0735.m3037(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static AbstractC0777 m2974(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC0777) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static int m2975(int i, List list, InterfaceC0727 interfaceC0727) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3025 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM3025 += C0735.m3025(i, (AbstractC0758) list.get(i2), interfaceC0727);
        }
        return iM3025;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static int m2976(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0784) {
            AbstractC0784 abstractC0784 = (AbstractC0784) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0784.m3231(0);
            throw null;
        }
        int iM3036 = 0;
        for (int i = 0; i < size; i++) {
            iM3036 += C0735.m3036(((Integer) list.get(i)).intValue());
        }
        return iM3036;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static void m2977(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0735.m3043(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0735.m3038(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C0735.f3546;
            i3 += 8;
        }
        c0735.m3045(i3);
        while (i2 < list.size()) {
            c0735.m3037(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static int m2978(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0735.m3030(i) * size) + m3012(list);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static int m2979(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0735.m3030(i) * list.size()) + m2998(list);
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static void m2980(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c0735.m3038(i, 0);
                c0735.m3047(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c0735.m3038(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C0735.f3546;
            i3++;
        }
        c0735.m3045(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            c0735.m3047(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static int m2981(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0784) {
            AbstractC0784 abstractC0784 = (AbstractC0784) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0784.m3231(0);
            throw null;
        }
        int iM3035 = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iM3035 += C0735.m3035((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM3035;
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static void m2982(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c0735.m3038(i, 0);
                c0735.m3045((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c0735.m3038(i, 2);
        int iM3035 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM3035 += C0735.m3035((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0735.m3045(iM3035);
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            c0735.m3045((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static int m2983(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0735.m3030(i) * size) + m2976(list);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static int m2984(int i, Object obj, InterfaceC0727 interfaceC0727) {
        int iM3030 = C0735.m3030(i);
        int iMo3166 = ((AbstractC0758) obj).mo3166(interfaceC0727);
        return C0735.m3035(iMo3166) + iMo3166 + iM3030;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m2985(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0735.m3034(i) * size;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m2986(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3030 = C0735.m3030(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM3030 += C0735.m3021((AbstractC0748) list.get(i2));
        }
        return iM3030;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static int m2987(int i, List list, InterfaceC0727 interfaceC0727) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3030 = C0735.m3030(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iMo3166 = ((AbstractC0758) list.get(i2)).mo3166(interfaceC0727);
            iM3030 += C0735.m3035(iMo3166) + iMo3166;
        }
        return iM3030;
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static void m2988(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0735.m3048(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0735.m3038(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C0735.f3546;
            i3 += 4;
        }
        c0735.m3045(i3);
        while (i2 < list.size()) {
            c0735.m3042(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static void m2989(int i, List list, C0756 c0756, InterfaceC0727 interfaceC0727) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0756.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0756.m3142(i, list.get(i2), interfaceC0727);
        }
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static int m2990(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0782) {
            AbstractC0782 abstractC0782 = (AbstractC0782) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0782.m3223(0);
            throw null;
        }
        int iM3020 = 0;
        for (int i = 0; i < size; i++) {
            iM3020 += C0735.m3020(((Long) list.get(i)).longValue());
        }
        return iM3020;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static void m2991(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c0735.getClass();
                c0735.m3048(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c0735.m3038(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C0735.f3546;
            i3 += 4;
        }
        c0735.m3045(i3);
        while (i2 < list.size()) {
            c0735.m3042(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m2992(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0735.m3027(i) * size;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m2993(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0735.m3032(i) * size;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m2994(List list) {
        return list.size() * 4;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static void m2995(int i, List list, C0756 c0756) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0756.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            AbstractC0748 abstractC0748 = (AbstractC0748) list.get(i2);
            C0735 c0735 = (C0735) c0756.f3598;
            c0735.m3038(i, 2);
            c0735.m3041(abstractC0748);
        }
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static void m2996(AbstractC0777 abstractC0777, Object obj, Object obj2) {
        ((C0755) abstractC0777).getClass();
        AbstractC0785 abstractC0785 = (AbstractC0785) obj;
        C0741 c0741 = abstractC0785.unknownFields;
        C0741 c07412 = ((AbstractC0785) obj2).unknownFields;
        C0741 c07413 = C0741.f3558;
        if (!c07413.equals(c07412)) {
            if (c07413.equals(c0741)) {
                int i = c0741.f3562 + c07412.f3562;
                int[] iArrCopyOf = Arrays.copyOf(c0741.f3559, i);
                System.arraycopy(c07412.f3559, 0, iArrCopyOf, c0741.f3562, c07412.f3562);
                Object[] objArrCopyOf = Arrays.copyOf(c0741.f3561, i);
                System.arraycopy(c07412.f3561, 0, objArrCopyOf, c0741.f3562, c07412.f3562);
                c0741 = new C0741(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c0741.getClass();
                if (!c07412.equals(c07413)) {
                    if (!c0741.f3560) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c0741.f3562 + c07412.f3562;
                    c0741.m3057(i2);
                    System.arraycopy(c07412.f3559, 0, c0741.f3559, c0741.f3562, c07412.f3562);
                    System.arraycopy(c07412.f3561, 0, c0741.f3561, c0741.f3562, c07412.f3562);
                    c0741.f3562 = i2;
                }
            }
        }
        abstractC0785.unknownFields = c0741;
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static void m2997(int i, List list, C0756 c0756, InterfaceC0727 interfaceC0727) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0756.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0756.m3144(i, list.get(i2), interfaceC0727);
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static int m2998(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0782) {
            AbstractC0782 abstractC0782 = (AbstractC0782) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0782.m3223(0);
            throw null;
        }
        int iM3020 = 0;
        for (int i = 0; i < size; i++) {
            iM3020 += C0735.m3020(((Long) list.get(i)).longValue());
        }
        return iM3020;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static int m2999(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0735.m3030(i) * size) + m3006(list);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static int m3000(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0735.m3030(i) * size) + m2981(list);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static void m3001(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0735.m3046(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0735.m3038(i, 2);
        int iM3020 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM3020 += C0735.m3020(((Long) list.get(i3)).longValue());
        }
        c0735.m3045(iM3020);
        while (i2 < list.size()) {
            c0735.m3044(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static void m3002(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c0735.m3038(i, 0);
                c0735.m3045(iIntValue);
            }
            return;
        }
        c0735.m3038(i, 2);
        int iM3035 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM3035 += C0735.m3035(((Integer) list.get(i3)).intValue());
        }
        c0735.m3045(iM3035);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c0735.m3045(((Integer) list.get(i4)).intValue());
        }
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static void m3003(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c0735.m3046(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c0735.m3038(i, 2);
        int iM3020 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM3020 += C0735.m3020((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0735.m3045(iM3020);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c0735.m3044((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static void m3004(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c0735.m3038(i, 0);
                c0735.m3040(iIntValue);
            }
            return;
        }
        c0735.m3038(i, 2);
        int iM3036 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM3036 += C0735.m3036(((Integer) list.get(i3)).intValue());
        }
        c0735.m3045(iM3036);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c0735.m3040(((Integer) list.get(i4)).intValue());
        }
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static void m3005(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0735.m3043(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0735.m3038(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C0735.f3546;
            i3 += 8;
        }
        c0735.m3045(i3);
        while (i2 < list.size()) {
            c0735.m3037(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static int m3006(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0782) {
            AbstractC0782 abstractC0782 = (AbstractC0782) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0782.m3223(0);
            throw null;
        }
        int iM3020 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM3020 += C0735.m3020((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM3020;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static Object m3007(Object obj, int i, List list, Object obj2, AbstractC0777 abstractC0777) {
        return obj2;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m3008(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0735.m3030(i) * size) + m2970(list);
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static void m3009(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0735.m3048(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0735.m3038(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C0735.f3546;
            i3 += 4;
        }
        c0735.m3045(i3);
        while (i2 < list.size()) {
            c0735.m3042(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static int m3010(List list) {
        return list.size() * 8;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static int m3011(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0735.m3030(i) * size) + m2990(list);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static int m3012(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0784) {
            AbstractC0784 abstractC0784 = (AbstractC0784) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0784.m3231(0);
            throw null;
        }
        int iM3035 = 0;
        for (int i = 0; i < size; i++) {
            iM3035 += C0735.m3035(((Integer) list.get(i)).intValue());
        }
        return iM3035;
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static void m3013(int i, List list, C0756 c0756, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0735 c0735 = (C0735) c0756.f3598;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c0735.m3038(i, 0);
                c0735.m3040(iIntValue);
            }
            return;
        }
        c0735.m3038(i, 2);
        int iM3036 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM3036 += C0735.m3036(((Integer) list.get(i3)).intValue());
        }
        c0735.m3045(iM3036);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c0735.m3040(((Integer) list.get(i4)).intValue());
        }
    }
}
