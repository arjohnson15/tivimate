package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0074 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final AbstractC0055 f498;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final AbstractC0055 f499;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Class f500;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C0067 f501;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f500 = cls;
        f498 = m522(false);
        f499 = m522(true);
        f501 = new C0067();
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static void m515(int i, List list, C0030 c0030) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0030.getClass();
        boolean z = list instanceof InterfaceC0019;
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0040.m419(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC0019 interfaceC0019 = (InterfaceC0019) list;
        while (i2 < list.size()) {
            Object objMo283 = interfaceC0019.mo283(i2);
            if (objMo283 instanceof String) {
                c0040.m419(i, (String) objMo283);
            } else {
                c0040.m430(i, (C0056) objMo283);
            }
            i2++;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m516(List list) {
        return list.size();
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static void m517(int i, List list, C0030 c0030, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0040.m425(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int iM395 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM395 += C0040.m395(((Long) list.get(i3)).longValue());
        }
        c0040.m412(iM395);
        while (i2 < list.size()) {
            c0040.m426(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m518(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0082) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM389 = 0;
        for (int i = 0; i < size; i++) {
            iM389 += C0040.m389(((Integer) list.get(i)).intValue());
        }
        return iM389;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static int m519(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM401 = C0040.m401(i) * size;
        if (list instanceof InterfaceC0019) {
            InterfaceC0019 interfaceC0019 = (InterfaceC0019) list;
            while (i2 < size) {
                Object objMo283 = interfaceC0019.mo283(i2);
                iM401 = (objMo283 instanceof C0056 ? C0040.m388((C0056) objMo283) : C0040.m398((String) objMo283)) + iM401;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM401 = (obj instanceof C0056 ? C0040.m388((C0056) obj) : C0040.m398((String) obj)) + iM401;
                i2++;
            }
        }
        return iM401;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static boolean m520(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static void m521(int i, List list, C0030 c0030, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c0040.getClass();
                c0040.m428(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C0040.f433;
            i3 += 8;
        }
        c0040.m412(i3);
        while (i2 < list.size()) {
            c0040.m413(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static AbstractC0055 m522(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC0055) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static int m523(int i, List list, InterfaceC0025 interfaceC0025) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM391 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM391 += C0040.m391(i, (AbstractC0052) list.get(i2), interfaceC0025);
        }
        return iM391;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static int m524(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0082) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM389 = 0;
        for (int i = 0; i < size; i++) {
            iM389 += C0040.m389(((Integer) list.get(i)).intValue());
        }
        return iM389;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static void m525(int i, List list, C0030 c0030, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0040.m428(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C0040.f433;
            i3 += 8;
        }
        c0040.m412(i3);
        while (i2 < list.size()) {
            c0040.m413(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static int m526(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0040.m401(i) * size) + m560(list);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static int m527(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0040.m401(i) * list.size()) + m546(list);
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static void m528(int i, List list, C0030 c0030, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0040.m431(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C0040.f433;
            i3++;
        }
        c0040.m412(i3);
        while (i2 < list.size()) {
            c0040.m432(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static int m529(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0082) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM387 = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iM387 += C0040.m387((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM387;
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static void m530(int i, List list, C0030 c0030, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c0040.m414(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int iM387 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM387 += C0040.m387((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0040.m412(iM387);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            c0040.m412((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static int m531(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0040.m401(i) * size) + m524(list);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static int m532(int i, Object obj, InterfaceC0025 interfaceC0025) {
        int iM401 = C0040.m401(i);
        int iM479 = ((AbstractC0052) obj).m479(interfaceC0025);
        return C0040.m387(iM479) + iM479 + iM401;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m533(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0040.m397(i) * size;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m534(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM401 = C0040.m401(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM401 += C0040.m388((C0056) list.get(i2));
        }
        return iM401;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static int m535(int i, List list, InterfaceC0025 interfaceC0025) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM401 = C0040.m401(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iM479 = ((AbstractC0052) list.get(i2)).m479(interfaceC0025);
            iM401 += C0040.m387(iM479) + iM479;
        }
        return iM401;
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static void m536(int i, List list, C0030 c0030, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0040.m416(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C0040.f433;
            i3 += 4;
        }
        c0040.m412(i3);
        while (i2 < list.size()) {
            c0040.m418(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static void m537(int i, List list, C0030 c0030, InterfaceC0025 interfaceC0025) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0030.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0030.m332(i, list.get(i2), interfaceC0025);
        }
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static int m538(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0071) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM395 = 0;
        for (int i = 0; i < size; i++) {
            iM395 += C0040.m395(((Long) list.get(i)).longValue());
        }
        return iM395;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static void m539(int i, List list, C0030 c0030, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c0040.getClass();
                c0040.m416(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C0040.f433;
            i3 += 4;
        }
        c0040.m412(i3);
        while (i2 < list.size()) {
            c0040.m418(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m540(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0040.m402(i) * size;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m541(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0040.m407(i) * size;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m542(List list) {
        return list.size() * 4;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static void m543(int i, List list, C0030 c0030) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0030.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((C0040) c0030.f398).m430(i, (C0056) list.get(i2));
        }
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static void m544(AbstractC0055 abstractC0055, AbstractC0083 abstractC0083, AbstractC0083 abstractC00832) {
        ((C0067) abstractC0055).getClass();
        C0051 c0051 = abstractC0083.unknownFields;
        C0051 c00512 = abstractC00832.unknownFields;
        if (!c00512.equals(C0051.f458)) {
            int i = c0051.f462 + c00512.f462;
            int[] iArrCopyOf = Arrays.copyOf(c0051.f459, i);
            System.arraycopy(c00512.f459, 0, iArrCopyOf, c0051.f462, c00512.f462);
            Object[] objArrCopyOf = Arrays.copyOf(c0051.f461, i);
            System.arraycopy(c00512.f461, 0, objArrCopyOf, c0051.f462, c00512.f462);
            c0051 = new C0051(i, iArrCopyOf, objArrCopyOf, true);
        }
        abstractC0083.unknownFields = c0051;
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static void m545(int i, List list, C0030 c0030, InterfaceC0025 interfaceC0025) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0030.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0030.m334(i, list.get(i2), interfaceC0025);
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static int m546(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0071) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM395 = 0;
        for (int i = 0; i < size; i++) {
            iM395 += C0040.m395(((Long) list.get(i)).longValue());
        }
        return iM395;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static int m547(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0040.m401(i) * size) + m554(list);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static int m548(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0040.m401(i) * size) + m529(list);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static void m549(int i, List list, C0030 c0030, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0040.m425(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int iM395 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM395 += C0040.m395(((Long) list.get(i3)).longValue());
        }
        c0040.m412(iM395);
        while (i2 < list.size()) {
            c0040.m426(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static void m550(int i, List list, C0030 c0030, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0040.m414(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int iM387 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM387 += C0040.m387(((Integer) list.get(i3)).intValue());
        }
        c0040.m412(iM387);
        while (i2 < list.size()) {
            c0040.m412(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static void m551(int i, List list, C0030 c0030, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c0040.m425(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int iM395 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM395 += C0040.m395((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0040.m412(iM395);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c0040.m426((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static void m552(int i, List list, C0030 c0030, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0040.m415(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int iM389 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM389 += C0040.m389(((Integer) list.get(i3)).intValue());
        }
        c0040.m412(iM389);
        while (i2 < list.size()) {
            c0040.m434(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static void m553(int i, List list, C0030 c0030, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0040.m428(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C0040.f433;
            i3 += 8;
        }
        c0040.m412(i3);
        while (i2 < list.size()) {
            c0040.m413(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static int m554(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0071) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM395 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM395 += C0040.m395((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM395;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static Object m555(int i, List list, Object obj, AbstractC0055 abstractC0055) {
        return obj;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m556(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0040.m401(i) * size) + m518(list);
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static void m557(int i, List list, C0030 c0030, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0040.m416(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C0040.f433;
            i3 += 4;
        }
        c0040.m412(i3);
        while (i2 < list.size()) {
            c0040.m418(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static int m558(List list) {
        return list.size() * 8;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static int m559(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0040.m401(i) * size) + m538(list);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static int m560(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0082) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM387 = 0;
        for (int i = 0; i < size; i++) {
            iM387 += C0040.m387(((Integer) list.get(i)).intValue());
        }
        return iM387;
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static void m561(int i, List list, C0030 c0030, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0040 c0040 = (C0040) c0030.f398;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0040.m415(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0040.m411(i, 2);
        int iM389 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM389 += C0040.m389(((Integer) list.get(i3)).intValue());
        }
        c0040.m412(iM389);
        while (i2 < list.size()) {
            c0040.m434(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}
