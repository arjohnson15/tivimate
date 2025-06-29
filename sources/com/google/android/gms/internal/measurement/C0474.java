package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import p334.C3789;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.ٴⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0474 implements InterfaceC0494 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object[] f2797;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC0563 f2798;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f2799;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f2800;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int[] f2801;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int[] f2802;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f2803;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f2804;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final int[] f2796 = new int[0];

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final Unsafe f2795 = AbstractC0547.m2467();

    public C0474(int[] iArr, Object[] objArr, int i, int i2, AbstractC0563 abstractC0563, int[] iArr2, int i3, int i4, C0553 c0553) {
        this.f2801 = iArr;
        this.f2797 = objArr;
        this.f2800 = i;
        this.f2804 = i2;
        boolean z = abstractC0563 instanceof AbstractC0583;
        this.f2802 = iArr2;
        this.f2803 = i3;
        this.f2799 = i4;
        this.f2798 = abstractC0563;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static boolean m2264(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0583) {
            return ((AbstractC0583) obj).m2540();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0281  */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.C0474 m2265(com.google.android.gms.internal.measurement.C0371 r31, com.google.android.gms.internal.measurement.C0553 r32) {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0474.m2265(com.google.android.gms.internal.measurement.ˉʼ, com.google.android.gms.internal.measurement.ﹳـ):com.google.android.gms.internal.measurement.ٴⁱ");
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static Field m2266(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static long m2267(long j, Object obj) {
        return ((Long) AbstractC0547.m2458(j, obj)).longValue();
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static C0405 m2268(Object obj) {
        AbstractC0583 abstractC0583 = (AbstractC0583) obj;
        C0405 c0405 = abstractC0583.zzb;
        if (c0405 != C0405.f2688) {
            return c0405;
        }
        C0405 c0405M2137 = C0405.m2137();
        abstractC0583.zzb = c0405M2137;
        return c0405M2137;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static int m2269(long j, Object obj) {
        return ((Integer) AbstractC0547.m2458(j, obj)).intValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ʽᐧ */
    public final int mo1841(AbstractC0583 abstractC0583) {
        int i;
        int i2;
        int i3;
        int iM1928;
        int iM2003;
        int iM1929;
        int iM1913;
        Unsafe unsafe = f2795;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f2801;
            if (i7 >= iArr.length) {
                return C0553.m2473(C0553.m2474(abstractC0583)) + i8;
            }
            int iM2274 = m2274(i7);
            int i9 = (267386880 & iM2274) >>> 20;
            int i10 = iArr[i7];
            int i11 = iArr[i7 + 2];
            int i12 = i11 & i4;
            if (i9 <= 17) {
                if (i12 != i5) {
                    i6 = i12 == i4 ? 0 : unsafe.getInt(abstractC0583, i12);
                    i5 = i12;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = iM2274 & i4;
            if (i9 >= EnumC0434.f2735.m2207()) {
                EnumC0434.f2737.m2207();
            }
            switch (i9) {
                case 0:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1928(i10);
                        i8 += iM1928;
                        break;
                    }
                case 1:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1915(i10);
                        i8 += iM1928;
                        break;
                    }
                case 2:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1930(i10, unsafe.getLong(abstractC0583, j));
                        i8 += iM1928;
                        break;
                    }
                case 3:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1910(i10, unsafe.getLong(abstractC0583, j));
                        i8 += iM1928;
                        break;
                    }
                case 4:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1923(i10, unsafe.getInt(abstractC0583, j));
                        i8 += iM1928;
                        break;
                    }
                case 5:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1924(i10);
                        i8 += iM1928;
                        break;
                    }
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1925(i10);
                        i8 += iM1928;
                        break;
                    }
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1918(i10);
                        i8 += iM1928;
                        break;
                    }
                case 8:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0583, j);
                        iM1928 = object instanceof C0315 ? C0346.m1927(i10, (C0315) object) : C0346.m1911(i10, (String) object);
                        i8 += iM1928;
                        break;
                    }
                case 9:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = AbstractC0361.m2023(i10, unsafe.getObject(abstractC0583, j), m2276(i7));
                        i8 += iM1928;
                        break;
                    }
                case 10:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1927(i10, (C0315) unsafe.getObject(abstractC0583, j));
                        i8 += iM1928;
                        break;
                    }
                case 11:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1920(i10, unsafe.getInt(abstractC0583, j));
                        i8 += iM1928;
                        break;
                    }
                case 12:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1916(i10, unsafe.getInt(abstractC0583, j));
                        i8 += iM1928;
                        break;
                    }
                case 13:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1921(i10);
                        i8 += iM1928;
                        break;
                    }
                case 14:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1917(i10);
                        i8 += iM1928;
                        break;
                    }
                case 15:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1912(i10, unsafe.getInt(abstractC0583, j));
                        i8 += iM1928;
                        break;
                    }
                case 16:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1914(i10, unsafe.getLong(abstractC0583, j));
                        i8 += iM1928;
                        break;
                    }
                case 17:
                    if (!m2283(abstractC0583, i7, i, i2, i3)) {
                        break;
                    } else {
                        iM1928 = C0346.m1926(i10, (AbstractC0563) unsafe.getObject(abstractC0583, j), m2276(i7));
                        i8 += iM1928;
                        break;
                    }
                case 18:
                    iM1928 = AbstractC0361.m2039(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 19:
                    iM1928 = AbstractC0361.m2044(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 20:
                    iM1928 = AbstractC0361.m2036(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 21:
                    iM1928 = AbstractC0361.m1996(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 22:
                    iM1928 = AbstractC0361.m2011(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 23:
                    iM1928 = AbstractC0361.m2039(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 24:
                    iM1928 = AbstractC0361.m2044(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 25:
                    iM1928 = AbstractC0361.m1997(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 26:
                    iM1928 = AbstractC0361.m2008(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 27:
                    iM1928 = AbstractC0361.m2032(i10, (List) unsafe.getObject(abstractC0583, j), m2276(i7));
                    i8 += iM1928;
                    break;
                case 28:
                    iM1928 = AbstractC0361.m2015(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 29:
                    iM1928 = AbstractC0361.m2037(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 30:
                    iM1928 = AbstractC0361.m2018(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 31:
                    iM1928 = AbstractC0361.m2044(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 32:
                    iM1928 = AbstractC0361.m2039(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 33:
                    iM1928 = AbstractC0361.m2022(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 34:
                    iM1928 = AbstractC0361.m1998(i10, (List) unsafe.getObject(abstractC0583, j));
                    i8 += iM1928;
                    break;
                case 35:
                    iM2003 = AbstractC0361.m2003((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 36:
                    iM2003 = AbstractC0361.m2043((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 37:
                    iM2003 = AbstractC0361.m2041((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 38:
                    iM2003 = AbstractC0361.m2034((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 39:
                    iM2003 = AbstractC0361.m2026((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 40:
                    iM2003 = AbstractC0361.m2003((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 41:
                    iM2003 = AbstractC0361.m2043((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 42:
                    iM2003 = AbstractC0361.m2040((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 43:
                    iM2003 = AbstractC0361.m2013((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 44:
                    iM2003 = AbstractC0361.m2012((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 45:
                    iM2003 = AbstractC0361.m2043((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 46:
                    iM2003 = AbstractC0361.m2003((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 47:
                    iM2003 = AbstractC0361.m2028((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 48:
                    iM2003 = AbstractC0361.m2020((List) unsafe.getObject(abstractC0583, j));
                    if (iM2003 <= 0) {
                        break;
                    } else {
                        iM1929 = C0346.m1929(i10);
                        iM1913 = C0346.m1913(iM2003);
                        i8 += iM1913 + iM1929 + iM2003;
                        break;
                    }
                case 49:
                    iM1928 = AbstractC0361.m2017(i10, (List) unsafe.getObject(abstractC0583, j), m2276(i7));
                    i8 += iM1928;
                    break;
                case 50:
                    AbstractC0527.m2408(unsafe.getObject(abstractC0583, j), m2281(i7));
                    break;
                case 51:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1928(i10);
                        i8 += iM1928;
                        break;
                    }
                case 52:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1915(i10);
                        i8 += iM1928;
                        break;
                    }
                case 53:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1930(i10, m2267(j, abstractC0583));
                        i8 += iM1928;
                        break;
                    }
                case 54:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1910(i10, m2267(j, abstractC0583));
                        i8 += iM1928;
                        break;
                    }
                case 55:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1923(i10, m2269(j, abstractC0583));
                        i8 += iM1928;
                        break;
                    }
                case 56:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1924(i10);
                        i8 += iM1928;
                        break;
                    }
                case 57:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1925(i10);
                        i8 += iM1928;
                        break;
                    }
                case 58:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1918(i10);
                        i8 += iM1928;
                        break;
                    }
                case 59:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(abstractC0583, j);
                        iM1928 = object2 instanceof C0315 ? C0346.m1927(i10, (C0315) object2) : C0346.m1911(i10, (String) object2);
                        i8 += iM1928;
                        break;
                    }
                case 60:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = AbstractC0361.m2023(i10, unsafe.getObject(abstractC0583, j), m2276(i7));
                        i8 += iM1928;
                        break;
                    }
                case 61:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1927(i10, (C0315) unsafe.getObject(abstractC0583, j));
                        i8 += iM1928;
                        break;
                    }
                case 62:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1920(i10, m2269(j, abstractC0583));
                        i8 += iM1928;
                        break;
                    }
                case 63:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1916(i10, m2269(j, abstractC0583));
                        i8 += iM1928;
                        break;
                    }
                case 64:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1921(i10);
                        i8 += iM1928;
                        break;
                    }
                case 65:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1917(i10);
                        i8 += iM1928;
                        break;
                    }
                case 66:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1912(i10, m2269(j, abstractC0583));
                        i8 += iM1928;
                        break;
                    }
                case 67:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1914(i10, m2267(j, abstractC0583));
                        i8 += iM1928;
                        break;
                    }
                case 68:
                    if (!m2280(i10, i7, abstractC0583)) {
                        break;
                    } else {
                        iM1928 = C0346.m1926(i10, (AbstractC0563) unsafe.getObject(abstractC0583, j), m2276(i7));
                        i8 += iM1928;
                        break;
                    }
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ʿʼ */
    public final void mo1842(Object obj, C0355 c0355) throws zzkl$zzb {
        int i;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        C0474 c0474 = this;
        c0355.getClass();
        int[] iArr2 = c0474.f2801;
        int length = iArr2.length;
        Unsafe unsafe = f2795;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i9 < length) {
            int iM2274 = c0474.m2274(i9);
            int i10 = iArr2[i9];
            int i11 = (267386880 & iM2274) >>> 20;
            if (i11 <= 17) {
                int i12 = iArr2[i9 + 2];
                int i13 = i12 & i6;
                if (i13 != i7) {
                    i8 = i13 == i6 ? 0 : unsafe.getInt(obj, i13);
                    i7 = i13;
                }
                i = i7;
                i2 = i8;
                i3 = 1 << (i12 >>> 20);
            } else {
                i = i7;
                i2 = i8;
                i3 = 0;
            }
            long j = iM2274 & i6;
            C0346 c0346 = (C0346) c0355.f2536;
            switch (i11) {
                case 0:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m2283(obj, i9, i5, i2, i3)) {
                        c0355.m1985(i10, AbstractC0547.m2462(j, obj));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 1:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m2283(obj, i9, i5, i2, i3)) {
                        c0355.m1968(i10, AbstractC0547.m2464(j, obj));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 2:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m2283(obj, i9, i5, i2, i3)) {
                        c0355.m1970(i10, unsafe.getLong(obj, j));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 3:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m2283(obj, i9, i5, i2, i3)) {
                        c0355.m1982(i10, unsafe.getLong(obj, j));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 4:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m2283(obj, i9, i5, i2, i3)) {
                        c0355.m1981(i10, unsafe.getInt(obj, j));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 5:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m2283(obj, i9, i5, i2, i3)) {
                        c0355.m1980(i10, unsafe.getLong(obj, j));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m2283(obj, i9, i5, i2, i3)) {
                        c0355.m1973(i10, unsafe.getInt(obj, j));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m2283(obj, i9, i5, i2, i3)) {
                        c0355.m1969(i10, AbstractC0547.m2461(j, obj));
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 8:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    if (m2283(obj, i9, i, i2, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            String str = (String) object;
                            c0346.m1939(i10, 2);
                            int i14 = c0346.f2472;
                            try {
                                int iM1913 = C0346.m1913(str.length() * 3);
                                int iM19132 = C0346.m1913(str.length());
                                byte[] bArr = c0346.f2473;
                                if (iM19132 == iM1913) {
                                    int i15 = i14 + iM19132;
                                    c0346.f2472 = i15;
                                    int iM2231 = AbstractC0446.m2231(str, bArr, i15, c0346.m1945());
                                    c0346.f2472 = i14;
                                    c0346.m1935((iM2231 - i14) - iM19132);
                                    c0346.f2472 = iM2231;
                                } else {
                                    c0346.m1935(AbstractC0446.m2233(str));
                                    c0346.f2472 = AbstractC0446.m2231(str, bArr, c0346.f2472, c0346.m1945());
                                }
                            } catch (C0564 e) {
                                c0346.f2472 = i14;
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
                        } else {
                            c0355.m1975(i10, (C0315) object);
                        }
                    }
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 9:
                    iArr = iArr2;
                    i4 = length;
                    if (m2283(obj, i9, i, i2, i3)) {
                        c0355.m1971(i10, unsafe.getObject(obj, j), c0474.m2276(i9));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 10:
                    iArr = iArr2;
                    i4 = length;
                    if (m2283(obj, i9, i, i2, i3)) {
                        c0355.m1975(i10, (C0315) unsafe.getObject(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 11:
                    iArr = iArr2;
                    i4 = length;
                    if (m2283(obj, i9, i, i2, i3)) {
                        c0355.m1984(i10, unsafe.getInt(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 12:
                    iArr = iArr2;
                    i4 = length;
                    if (m2283(obj, i9, i, i2, i3)) {
                        c0355.m1979(i10, unsafe.getInt(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 13:
                    iArr = iArr2;
                    i4 = length;
                    if (m2283(obj, i9, i, i2, i3)) {
                        c0355.m1977(i10, unsafe.getInt(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 14:
                    iArr = iArr2;
                    i4 = length;
                    if (m2283(obj, i9, i, i2, i3)) {
                        c0355.m1974(i10, unsafe.getLong(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 15:
                    iArr = iArr2;
                    i4 = length;
                    if (m2283(obj, i9, i, i2, i3)) {
                        c0355.m1972(i10, unsafe.getInt(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 16:
                    iArr = iArr2;
                    i4 = length;
                    if (m2283(obj, i9, i, i2, i3)) {
                        c0355.m1983(i10, unsafe.getLong(obj, j));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 17:
                    iArr = iArr2;
                    i4 = length;
                    if (m2283(obj, i9, i, i2, i3)) {
                        c0355.m1986(i10, unsafe.getObject(obj, j), c0474.m2276(i9));
                    }
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 18:
                    AbstractC0361.m2000(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 19:
                    AbstractC0361.m2007(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 20:
                    AbstractC0361.m2019(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 21:
                    AbstractC0361.m2030(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 22:
                    AbstractC0361.m2046(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 23:
                    AbstractC0361.m2002(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 24:
                    AbstractC0361.m2027(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 25:
                    AbstractC0361.m2004(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 26:
                    AbstractC0361.m2031(iArr2[i9], (List) unsafe.getObject(obj, j), c0355);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 27:
                    AbstractC0361.m2038(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, c0474.m2276(i9));
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 28:
                    AbstractC0361.m2016(iArr2[i9], (List) unsafe.getObject(obj, j), c0355);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 29:
                    AbstractC0361.m2010(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 30:
                    AbstractC0361.m2021(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 31:
                    AbstractC0361.m2035(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 32:
                    AbstractC0361.m2033(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 33:
                    AbstractC0361.m2045(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 34:
                    AbstractC0361.m2006(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, false);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 35:
                    AbstractC0361.m2000(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 36:
                    AbstractC0361.m2007(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 37:
                    AbstractC0361.m2019(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 38:
                    AbstractC0361.m2030(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 39:
                    AbstractC0361.m2046(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 40:
                    AbstractC0361.m2002(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 41:
                    AbstractC0361.m2027(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 42:
                    AbstractC0361.m2004(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 43:
                    AbstractC0361.m2010(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 44:
                    AbstractC0361.m2021(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 45:
                    AbstractC0361.m2035(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 46:
                    AbstractC0361.m2033(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 47:
                    AbstractC0361.m2045(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 48:
                    AbstractC0361.m2006(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, true);
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 49:
                    AbstractC0361.m2042(iArr2[i9], (List) unsafe.getObject(obj, j), c0355, c0474.m2276(i9));
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        AbstractC0527.m2397(c0474.m2281(i9));
                        throw null;
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 51:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1985(i10, ((Double) AbstractC0547.m2458(j, obj)).doubleValue());
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 52:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1968(i10, ((Float) AbstractC0547.m2458(j, obj)).floatValue());
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 53:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1970(i10, m2267(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 54:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1982(i10, m2267(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 55:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1981(i10, m2269(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 56:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1980(i10, m2267(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 57:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1973(i10, m2269(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 58:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1969(i10, ((Boolean) AbstractC0547.m2458(j, obj)).booleanValue());
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 59:
                    if (c0474.m2280(i10, i9, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            String str2 = (String) object2;
                            c0346.m1939(i10, 2);
                            int i16 = c0346.f2472;
                            try {
                                int iM19133 = C0346.m1913(str2.length() * 3);
                                int iM19134 = C0346.m1913(str2.length());
                                byte[] bArr2 = c0346.f2473;
                                if (iM19134 == iM19133) {
                                    int i17 = i16 + iM19134;
                                    c0346.f2472 = i17;
                                    int iM22312 = AbstractC0446.m2231(str2, bArr2, i17, c0346.m1945());
                                    c0346.f2472 = i16;
                                    c0346.m1935((iM22312 - i16) - iM19134);
                                    c0346.f2472 = iM22312;
                                } else {
                                    c0346.m1935(AbstractC0446.m2233(str2));
                                    c0346.f2472 = AbstractC0446.m2231(str2, bArr2, c0346.f2472, c0346.m1945());
                                }
                            } catch (C0564 e4) {
                                c0346.f2472 = i16;
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
                            c0355.m1975(i10, (C0315) object2);
                        }
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 60:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1971(i10, unsafe.getObject(obj, j), c0474.m2276(i9));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 61:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1975(i10, (C0315) unsafe.getObject(obj, j));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 62:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1984(i10, m2269(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 63:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1979(i10, m2269(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 64:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1977(i10, m2269(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 65:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1974(i10, m2267(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 66:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1972(i10, m2269(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 67:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1983(i10, m2267(j, obj));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                case 68:
                    if (c0474.m2280(i10, i9, obj)) {
                        c0355.m1986(i10, unsafe.getObject(obj, j), c0474.m2276(i9));
                    }
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
                default:
                    iArr = iArr2;
                    i4 = length;
                    i5 = i;
                    i9 += 3;
                    i6 = 1048575;
                    c0474 = this;
                    i8 = i2;
                    iArr2 = iArr;
                    length = i4;
                    i7 = i5;
            }
        }
        ((AbstractC0583) obj).zzb.m2141(c0355);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m2270(Object obj, int i, Object obj2) {
        int[] iArr = this.f2801;
        int i2 = iArr[i];
        if (m2280(i2, i, obj2)) {
            long jM2274 = m2274(i) & 1048575;
            Unsafe unsafe = f2795;
            Object object = unsafe.getObject(obj2, jM2274);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC0494 interfaceC0494M2276 = m2276(i);
            if (!m2280(i2, i, obj)) {
                if (m2264(object)) {
                    AbstractC0583 abstractC0583Mo1845 = interfaceC0494M2276.mo1845();
                    interfaceC0494M2276.mo1843(abstractC0583Mo1845, object);
                    unsafe.putObject(obj, jM2274, abstractC0583Mo1845);
                } else {
                    unsafe.putObject(obj, jM2274, object);
                }
                AbstractC0547.m2460(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM2274);
            if (!m2264(object2)) {
                AbstractC0583 abstractC0583Mo18452 = interfaceC0494M2276.mo1845();
                interfaceC0494M2276.mo1843(abstractC0583Mo18452, object2);
                unsafe.putObject(obj, jM2274, abstractC0583Mo18452);
                object2 = abstractC0583Mo18452;
            }
            interfaceC0494M2276.mo1843(object2, object);
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC0566 m2271(int i) {
        return (InterfaceC0566) this.f2797[((i / 3) << 1) + 1];
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final boolean m2272(AbstractC0583 abstractC0583, Object obj, int i) {
        return m2286(i, abstractC0583) == m2286(i, obj);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int m2273(int i, int i2) {
        int[] iArr = this.f2801;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final int m2274(int i) {
        return this.f2801[i + 1];
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final Object m2275(int i, int i2, Object obj) {
        InterfaceC0494 interfaceC0494M2276 = m2276(i2);
        if (!m2280(i, i2, obj)) {
            return interfaceC0494M2276.mo1845();
        }
        Object object = f2795.getObject(obj, m2274(i2) & 1048575);
        if (m2264(object)) {
            return object;
        }
        AbstractC0583 abstractC0583Mo1845 = interfaceC0494M2276.mo1845();
        if (object != null) {
            interfaceC0494M2276.mo1843(abstractC0583Mo1845, object);
        }
        return abstractC0583Mo1845;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC0494 m2276(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.f2797;
        InterfaceC0494 interfaceC0494 = (InterfaceC0494) objArr[i2];
        if (interfaceC0494 != null) {
            return interfaceC0494;
        }
        InterfaceC0494 interfaceC0494M2222 = C0440.f2745.m2222((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC0494M2222;
        return interfaceC0494M2222;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m2277(Object obj, Object obj2, int i) {
        if (m2286(i, obj2)) {
            long jM2274 = m2274(i) & 1048575;
            Unsafe unsafe = f2795;
            Object object = unsafe.getObject(obj2, jM2274);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f2801[i] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC0494 interfaceC0494M2276 = m2276(i);
            if (!m2286(i, obj)) {
                if (m2264(object)) {
                    AbstractC0583 abstractC0583Mo1845 = interfaceC0494M2276.mo1845();
                    interfaceC0494M2276.mo1843(abstractC0583Mo1845, object);
                    unsafe.putObject(obj, jM2274, abstractC0583Mo1845);
                } else {
                    unsafe.putObject(obj, jM2274, object);
                }
                m2285(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM2274);
            if (!m2264(object2)) {
                AbstractC0583 abstractC0583Mo18452 = interfaceC0494M2276.mo1845();
                interfaceC0494M2276.mo1843(abstractC0583Mo18452, object2);
                unsafe.putObject(obj, jM2274, abstractC0583Mo18452);
                object2 = abstractC0583Mo18452;
            }
            interfaceC0494M2276.mo1843(object2, object);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:457:0x0bb5 A[PHI: r5 r9 r12 r13 r14 r22 r34
  0x0bb5: PHI (r5v78 int) = 
  (r5v49 int)
  (r5v50 int)
  (r5v51 int)
  (r5v52 int)
  (r5v53 int)
  (r5v54 int)
  (r5v56 int)
  (r5v61 int)
  (r5v71 int)
  (r5v79 int)
 binds: [B:455:0x0ba2, B:452:0x0b81, B:449:0x0b5d, B:446:0x0b3c, B:443:0x0b1b, B:440:0x0af9, B:432:0x0acc, B:413:0x0a45, B:394:0x09b9, B:385:0x0953] A[DONT_GENERATE, DONT_INLINE]
  0x0bb5: PHI (r9v74 byte[]) = 
  (r9v50 byte[])
  (r9v51 byte[])
  (r9v52 byte[])
  (r9v53 byte[])
  (r9v54 byte[])
  (r9v55 byte[])
  (r9v57 byte[])
  (r9v60 byte[])
  (r9v67 byte[])
  (r9v75 byte[])
 binds: [B:455:0x0ba2, B:452:0x0b81, B:449:0x0b5d, B:446:0x0b3c, B:443:0x0b1b, B:440:0x0af9, B:432:0x0acc, B:413:0x0a45, B:394:0x09b9, B:385:0x0953] A[DONT_GENERATE, DONT_INLINE]
  0x0bb5: PHI (r12v81 com.google.android.gms.internal.measurement.ˉᴵ) = 
  (r12v56 com.google.android.gms.internal.measurement.ˉᴵ)
  (r12v57 com.google.android.gms.internal.measurement.ˉᴵ)
  (r12v58 com.google.android.gms.internal.measurement.ˉᴵ)
  (r12v59 com.google.android.gms.internal.measurement.ˉᴵ)
  (r12v60 com.google.android.gms.internal.measurement.ˉᴵ)
  (r12v61 com.google.android.gms.internal.measurement.ˉᴵ)
  (r12v63 com.google.android.gms.internal.measurement.ˉᴵ)
  (r12v66 com.google.android.gms.internal.measurement.ˉᴵ)
  (r12v73 com.google.android.gms.internal.measurement.ˉᴵ)
  (r12v82 com.google.android.gms.internal.measurement.ˉᴵ)
 binds: [B:455:0x0ba2, B:452:0x0b81, B:449:0x0b5d, B:446:0x0b3c, B:443:0x0b1b, B:440:0x0af9, B:432:0x0acc, B:413:0x0a45, B:394:0x09b9, B:385:0x0953] A[DONT_GENERATE, DONT_INLINE]
  0x0bb5: PHI (r13v70 int) = 
  (r13v44 int)
  (r13v45 int)
  (r13v46 int)
  (r13v47 int)
  (r13v48 int)
  (r13v49 int)
  (r13v51 int)
  (r13v54 int)
  (r13v61 int)
  (r13v71 int)
 binds: [B:455:0x0ba2, B:452:0x0b81, B:449:0x0b5d, B:446:0x0b3c, B:443:0x0b1b, B:440:0x0af9, B:432:0x0acc, B:413:0x0a45, B:394:0x09b9, B:385:0x0953] A[DONT_GENERATE, DONT_INLINE]
  0x0bb5: PHI (r14v65 com.google.android.gms.internal.measurement.ٴⁱ) = 
  (r14v41 com.google.android.gms.internal.measurement.ٴⁱ)
  (r14v42 com.google.android.gms.internal.measurement.ٴⁱ)
  (r14v43 com.google.android.gms.internal.measurement.ٴⁱ)
  (r14v44 com.google.android.gms.internal.measurement.ٴⁱ)
  (r14v45 com.google.android.gms.internal.measurement.ٴⁱ)
  (r14v46 com.google.android.gms.internal.measurement.ٴⁱ)
  (r14v48 com.google.android.gms.internal.measurement.ٴⁱ)
  (r14v51 com.google.android.gms.internal.measurement.ٴⁱ)
  (r14v58 com.google.android.gms.internal.measurement.ٴⁱ)
  (r14v66 com.google.android.gms.internal.measurement.ٴⁱ)
 binds: [B:455:0x0ba2, B:452:0x0b81, B:449:0x0b5d, B:446:0x0b3c, B:443:0x0b1b, B:440:0x0af9, B:432:0x0acc, B:413:0x0a45, B:394:0x09b9, B:385:0x0953] A[DONT_GENERATE, DONT_INLINE]
  0x0bb5: PHI (r22v20 int) = 
  (r22v2 int)
  (r22v3 int)
  (r22v4 int)
  (r22v5 int)
  (r22v6 int)
  (r22v7 int)
  (r22v9 int)
  (r22v14 int)
  (r22v17 int)
  (r22v21 int)
 binds: [B:455:0x0ba2, B:452:0x0b81, B:449:0x0b5d, B:446:0x0b3c, B:443:0x0b1b, B:440:0x0af9, B:432:0x0acc, B:413:0x0a45, B:394:0x09b9, B:385:0x0953] A[DONT_GENERATE, DONT_INLINE]
  0x0bb5: PHI (r34v28 sun.misc.Unsafe) = 
  (r34v9 sun.misc.Unsafe)
  (r34v10 sun.misc.Unsafe)
  (r34v11 sun.misc.Unsafe)
  (r34v12 sun.misc.Unsafe)
  (r34v13 sun.misc.Unsafe)
  (r34v14 sun.misc.Unsafe)
  (r34v16 sun.misc.Unsafe)
  (r34v19 sun.misc.Unsafe)
  (r34v23 sun.misc.Unsafe)
  (r34v29 sun.misc.Unsafe)
 binds: [B:455:0x0ba2, B:452:0x0b81, B:449:0x0b5d, B:446:0x0b3c, B:443:0x0b1b, B:440:0x0af9, B:432:0x0acc, B:413:0x0a45, B:394:0x09b9, B:385:0x0953] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0bb8  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0bc1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x08e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:580:0x08d2 A[SYNTHETIC] */
    /* renamed from: ˏʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m2278(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.measurement.C0382 r42) {
        /*
            Method dump skipped, instructions count: 3326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0474.m2278(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.ˉᴵ):int");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ˏᵢ */
    public final void mo1843(Object obj, Object obj2) {
        if (!m2264(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f2801;
            if (i >= iArr.length) {
                AbstractC0361.m2005(obj, obj2);
                return;
            }
            int iM2274 = m2274(i);
            long j = iM2274 & 1048575;
            int i2 = iArr[i];
            switch ((iM2274 & 267386880) >>> 20) {
                case 0:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0547.m2453(obj, j, AbstractC0547.f2890.mo2301(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 1:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0547.m2463(obj, j, AbstractC0547.f2890.mo2305(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 2:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0486 abstractC0486 = AbstractC0547.f2890;
                        abstractC0486.m2302(obj, j, abstractC0486.m2297(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 3:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0486 abstractC04862 = AbstractC0547.f2890;
                        abstractC04862.m2302(obj, j, abstractC04862.m2297(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 4:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0547.m2460(j, obj, AbstractC0547.f2890.m2296(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 5:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0486 abstractC04863 = AbstractC0547.f2890;
                        abstractC04863.m2302(obj, j, abstractC04863.m2297(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0547.m2460(j, obj, AbstractC0547.f2890.m2296(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0547.m2455(obj, j, AbstractC0547.f2890.mo2298(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 8:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0547.m2466(j, obj, AbstractC0547.m2458(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 9:
                    m2277(obj, obj2, i);
                    break;
                case 10:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0547.m2466(j, obj, AbstractC0547.m2458(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 11:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0547.m2460(j, obj, AbstractC0547.f2890.m2296(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 12:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0547.m2460(j, obj, AbstractC0547.f2890.m2296(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 13:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0547.m2460(j, obj, AbstractC0547.f2890.m2296(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 14:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0486 abstractC04864 = AbstractC0547.f2890;
                        abstractC04864.m2302(obj, j, abstractC04864.m2297(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 15:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0547.m2460(j, obj, AbstractC0547.f2890.m2296(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 16:
                    if (!m2286(i, obj2)) {
                        break;
                    } else {
                        AbstractC0486 abstractC04865 = AbstractC0547.f2890;
                        abstractC04865.m2302(obj, j, abstractC04865.m2297(j, obj2));
                        m2285(i, obj);
                        break;
                    }
                case 17:
                    m2277(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    InterfaceC0465 interfaceC0465Mo2107 = (InterfaceC0465) AbstractC0547.m2458(j, obj);
                    InterfaceC0465 interfaceC0465 = (InterfaceC0465) AbstractC0547.m2458(j, obj2);
                    int size = interfaceC0465Mo2107.size();
                    int size2 = interfaceC0465.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC0325) interfaceC0465Mo2107).f2443) {
                            interfaceC0465Mo2107 = interfaceC0465Mo2107.mo2107(size2 + size);
                        }
                        interfaceC0465Mo2107.addAll(interfaceC0465);
                    }
                    if (size > 0) {
                        interfaceC0465 = interfaceC0465Mo2107;
                    }
                    AbstractC0547.m2466(j, obj, interfaceC0465);
                    break;
                case 50:
                    AbstractC0547.m2466(j, obj, AbstractC0527.m2395(AbstractC0547.m2458(j, obj), AbstractC0547.m2458(j, obj2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!m2280(i2, i, obj2)) {
                        break;
                    } else {
                        AbstractC0547.m2466(j, obj, AbstractC0547.m2458(j, obj2));
                        AbstractC0547.m2460(iArr[i + 2] & 1048575, obj, i2);
                        break;
                    }
                case 60:
                    m2270(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m2280(i2, i, obj2)) {
                        break;
                    } else {
                        AbstractC0547.m2466(j, obj, AbstractC0547.m2458(j, obj2));
                        AbstractC0547.m2460(iArr[i + 2] & 1048575, obj, i2);
                        break;
                    }
                case 68:
                    m2270(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ˑʽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1844(com.google.android.gms.internal.measurement.AbstractC0583 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0474.mo1844(com.google.android.gms.internal.measurement.ﾞﹶ, java.lang.Object):boolean");
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m2279(Object obj, int i, Object obj2) {
        f2795.putObject(obj, m2274(i) & 1048575, obj2);
        m2285(i, obj);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean m2280(int i, int i2, Object obj) {
        return AbstractC0547.f2890.m2296((long) (this.f2801[i2 + 2] & 1048575), obj) == i;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ـﹶ */
    public final AbstractC0583 mo1845() {
        return (AbstractC0583) ((AbstractC0583) this.f2798).mo1622(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ٴˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1846(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = m2264(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.AbstractC0583
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.measurement.ﾞﹶ r0 = (com.google.android.gms.internal.measurement.AbstractC0583) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.m2537(r2)
            r0.zza = r1
            r0.m2539()
        L1a:
            int[] r0 = r7.f2801
            int r2 = r0.length
        L1d:
            if (r1 >= r2) goto L7c
            int r3 = r7.m2274(r1)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            r6 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r6
            int r3 = r3 >>> 20
            r6 = 9
            if (r3 == r6) goto L66
            r6 = 60
            if (r3 == r6) goto L50
            r6 = 68
            if (r3 == r6) goto L50
            switch(r3) {
                case 17: goto L66;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L4c;
                case 27: goto L4c;
                case 28: goto L4c;
                case 29: goto L4c;
                case 30: goto L4c;
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L79
        L3d:
            sun.misc.Unsafe r3 = com.google.android.gms.internal.measurement.C0474.f2795
            java.lang.Object r6 = r3.getObject(r8, r4)
            if (r6 == 0) goto L79
            com.google.android.gms.internal.measurement.AbstractC0527.m2393(r6)
            r3.putObject(r8, r4, r6)
            goto L79
        L4c:
            com.google.android.gms.internal.measurement.AbstractC0370.m2074(r4, r8)
            goto L79
        L50:
            r3 = r0[r1]
            boolean r3 = r7.m2280(r3, r1, r8)
            if (r3 == 0) goto L79
            com.google.android.gms.internal.measurement.ᴵˎ r3 = r7.m2276(r1)
            sun.misc.Unsafe r6 = com.google.android.gms.internal.measurement.C0474.f2795
            java.lang.Object r4 = r6.getObject(r8, r4)
            r3.mo1846(r4)
            goto L79
        L66:
            boolean r3 = r7.m2286(r1, r8)
            if (r3 == 0) goto L79
            com.google.android.gms.internal.measurement.ᴵˎ r3 = r7.m2276(r1)
            sun.misc.Unsafe r6 = com.google.android.gms.internal.measurement.C0474.f2795
            java.lang.Object r4 = r6.getObject(r8, r4)
            r3.mo1846(r4)
        L79:
            int r1 = r1 + 3
            goto L1d
        L7c:
            com.google.android.gms.internal.measurement.C0553.m2475(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0474.mo1846(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ᐧʻ */
    public final void mo1847(Object obj, byte[] bArr, int i, int i2, C0382 c0382) {
        m2278(obj, bArr, i, i2, 0, c0382);
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Object m2281(int i) {
        return this.f2797[(i / 3) << 1];
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final Object m2282(int i, Object obj) {
        InterfaceC0494 interfaceC0494M2276 = m2276(i);
        long jM2274 = m2274(i) & 1048575;
        if (!m2286(i, obj)) {
            return interfaceC0494M2276.mo1845();
        }
        Object object = f2795.getObject(obj, jM2274);
        if (m2264(object)) {
            return object;
        }
        AbstractC0583 abstractC0583Mo1845 = interfaceC0494M2276.mo1845();
        if (object != null) {
            interfaceC0494M2276.mo1843(abstractC0583Mo1845, object);
        }
        return abstractC0583Mo1845;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final boolean m2283(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m2286(i, obj) : (i3 & i4) != 0;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m2284(Object obj, int i, Object obj2, int i2) {
        f2795.putObject(obj, m2274(i2) & 1048575, obj2);
        AbstractC0547.m2460(this.f2801[i2 + 2] & 1048575, obj, i);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m2285(int i, Object obj) {
        int i2 = this.f2801[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC0547.m2460(j, obj, (1 << (i2 >>> 20)) | AbstractC0547.f2890.m2296(j, obj));
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final boolean m2286(int i, Object obj) {
        int i2 = this.f2801[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & AbstractC0547.f2890.m2296(j, obj)) != 0;
        }
        int iM2274 = m2274(i);
        long j2 = iM2274 & 1048575;
        switch ((iM2274 & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC0547.f2890.mo2301(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC0547.f2890.mo2305(j2, obj)) != 0;
            case 2:
                return AbstractC0547.f2890.m2297(j2, obj) != 0;
            case 3:
                return AbstractC0547.f2890.m2297(j2, obj) != 0;
            case 4:
                return AbstractC0547.f2890.m2296(j2, obj) != 0;
            case 5:
                return AbstractC0547.f2890.m2297(j2, obj) != 0;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return AbstractC0547.f2890.m2296(j2, obj) != 0;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return AbstractC0547.f2890.mo2298(j2, obj);
            case 8:
                Object objM2458 = AbstractC0547.m2458(j2, obj);
                if (objM2458 instanceof String) {
                    return !((String) objM2458).isEmpty();
                }
                if (objM2458 instanceof C0315) {
                    return !C0315.f2430.equals(objM2458);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC0547.m2458(j2, obj) != null;
            case 10:
                return !C0315.f2430.equals(AbstractC0547.m2458(j2, obj));
            case 11:
                return AbstractC0547.f2890.m2296(j2, obj) != 0;
            case 12:
                return AbstractC0547.f2890.m2296(j2, obj) != 0;
            case 13:
                return AbstractC0547.f2890.m2296(j2, obj) != 0;
            case 14:
                return AbstractC0547.f2890.m2297(j2, obj) != 0;
            case 15:
                return AbstractC0547.f2890.m2296(j2, obj) != 0;
            case 16:
                return AbstractC0547.f2890.m2297(j2, obj) != 0;
            case 17:
                return AbstractC0547.m2458(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ﹳﹳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1848(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0474.mo1848(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[PHI: r3
  0x00d8: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01fe, B:41:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0494
    /* renamed from: ﹶˆ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo1849(com.google.android.gms.internal.measurement.AbstractC0583 r12) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0474.mo1849(com.google.android.gms.internal.measurement.ﾞﹶ):int");
    }
}
