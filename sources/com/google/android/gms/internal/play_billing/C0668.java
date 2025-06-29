package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import p334.C3789;
import sun.misc.Unsafe;
import ᵎﹳ.ᐧʻ;

/* renamed from: com.google.android.gms.internal.play_billing.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0668 implements InterfaceC0638 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object[] f3076;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC0625 f3077;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C0622 f3078;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f3079;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f3080;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int[] f3081;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int[] f3082;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f3083;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f3084;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final AbstractC0587 f3085;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final int[] f3075 = new int[0];

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final Unsafe f3074 = AbstractC0603.m2584();

    public C0668(int[] iArr, Object[] objArr, int i, int i2, AbstractC0625 abstractC0625, int[] iArr2, int i3, int i4, AbstractC0587 abstractC0587, C0622 c0622, C0671 c0671) {
        this.f3081 = iArr;
        this.f3076 = objArr;
        this.f3080 = i;
        this.f3084 = i2;
        this.f3082 = iArr2;
        this.f3083 = i3;
        this.f3079 = i4;
        this.f3085 = abstractC0587;
        this.f3078 = c0622;
        this.f3077 = abstractC0625;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0282  */
    /* renamed from: ʿˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.play_billing.C0668 m2715(com.google.android.gms.internal.play_billing.C0642 r33, com.google.android.gms.internal.play_billing.AbstractC0587 r34, com.google.android.gms.internal.play_billing.C0622 r35, com.google.android.gms.internal.play_billing.C0671 r36) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C0668.m2715(com.google.android.gms.internal.play_billing.ٴﹶ, com.google.android.gms.internal.play_billing.ʻʿ, com.google.android.gms.internal.play_billing.ˎᵢ, com.google.android.gms.internal.play_billing.ﹳˑ):com.google.android.gms.internal.play_billing.ⁱʿ");
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static int m2716(long j, Object obj) {
        return ((Integer) AbstractC0603.m2601(j, obj)).intValue();
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static boolean m2717(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0662) {
            return ((AbstractC0662) obj).m2707();
        }
        return true;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static Field m2718(String str, Class cls) {
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

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static long m2719(long j, Object obj) {
        return ((Long) AbstractC0603.m2601(j, obj)).longValue();
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static int m2720(int i) {
        return (i >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ʽᐧ */
    public final void mo2624(Object obj, Object obj2) {
        if (!m2717(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f3081;
            if (i >= iArr.length) {
                AbstractC0656.m2676(this.f3078, obj, obj2);
                return;
            }
            int iM2730 = m2730(i);
            int i2 = iM2730 & 1048575;
            int iM2720 = m2720(iM2730);
            int i3 = iArr[i];
            long j = i2;
            switch (iM2720) {
                case 0:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2585(obj, j, AbstractC0603.f2970.mo2565(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 1:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2586(obj, j, AbstractC0603.f2970.mo2562(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 2:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2589(obj, j, AbstractC0603.m2595(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 3:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2589(obj, j, AbstractC0603.m2595(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 4:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2596(j, obj, AbstractC0603.m2594(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 5:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2589(obj, j, AbstractC0603.m2595(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2596(j, obj, AbstractC0603.m2594(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2588(obj, j, AbstractC0603.f2970.mo2567(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 8:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2592(j, obj, AbstractC0603.m2601(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 9:
                    m2723(obj, i, obj2);
                    break;
                case 10:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2592(j, obj, AbstractC0603.m2601(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 11:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2596(j, obj, AbstractC0603.m2594(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 12:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2596(j, obj, AbstractC0603.m2594(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 13:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2596(j, obj, AbstractC0603.m2594(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 14:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2589(obj, j, AbstractC0603.m2595(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 15:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2596(j, obj, AbstractC0603.m2594(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 16:
                    if (!m2729(i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2589(obj, j, AbstractC0603.m2595(j, obj2));
                        m2724(i, obj);
                        break;
                    }
                case 17:
                    m2723(obj, i, obj2);
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
                    this.f3085.mo2551(j, obj, obj2);
                    break;
                case 50:
                    Class cls = AbstractC0656.f3065;
                    AbstractC0603.m2592(j, obj, C0618.m2623(AbstractC0603.m2601(j, obj), AbstractC0603.m2601(j, obj2)));
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
                    if (!m2733(i3, i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2592(j, obj, AbstractC0603.m2601(j, obj2));
                        AbstractC0603.m2596(iArr[i + 2] & 1048575, obj, i3);
                        break;
                    }
                case 60:
                    m2727(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m2733(i3, i, obj2)) {
                        break;
                    } else {
                        AbstractC0603.m2592(j, obj, AbstractC0603.m2601(j, obj2));
                        AbstractC0603.m2596(iArr[i + 2] & 1048575, obj, i3);
                        break;
                    }
                case 68:
                    m2727(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ʿʼ */
    public final AbstractC0662 mo2625() {
        return (AbstractC0662) ((AbstractC0662) this.f3077).mo2555(4);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object m2721(int i, Object obj) {
        InterfaceC0638 interfaceC0638M2731 = m2731(i);
        int iM2730 = m2730(i) & 1048575;
        if (!m2729(i, obj)) {
            return interfaceC0638M2731.mo2625();
        }
        Object object = f3074.getObject(obj, iM2730);
        if (m2717(object)) {
            return object;
        }
        AbstractC0662 abstractC0662Mo2625 = interfaceC0638M2731.mo2625();
        if (object != null) {
            interfaceC0638M2731.mo2624(abstractC0662Mo2625, object);
        }
        return abstractC0662Mo2625;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final InterfaceC0614 m2722(int i) {
        int i2 = i / 3;
        return (InterfaceC0614) this.f3076[i2 + i2 + 1];
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m2723(Object obj, int i, Object obj2) {
        if (m2729(i, obj2)) {
            int iM2730 = m2730(i) & 1048575;
            Unsafe unsafe = f3074;
            long j = iM2730;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f3081[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC0638 interfaceC0638M2731 = m2731(i);
            if (!m2729(i, obj)) {
                if (m2717(object)) {
                    AbstractC0662 abstractC0662Mo2625 = interfaceC0638M2731.mo2625();
                    interfaceC0638M2731.mo2624(abstractC0662Mo2625, object);
                    unsafe.putObject(obj, j, abstractC0662Mo2625);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m2724(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m2717(object2)) {
                AbstractC0662 abstractC0662Mo26252 = interfaceC0638M2731.mo2625();
                interfaceC0638M2731.mo2624(abstractC0662Mo26252, object2);
                unsafe.putObject(obj, j, abstractC0662Mo26252);
                object2 = abstractC0662Mo26252;
            }
            interfaceC0638M2731.mo2624(object2, object);
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m2724(int i, Object obj) {
        int i2 = this.f3081[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC0603.m2596(j, obj, (1 << (i2 >>> 20)) | AbstractC0603.m2594(j, obj));
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m2725(Object obj, int i, Object obj2) {
        f3074.putObject(obj, m2730(i) & 1048575, obj2);
        m2724(i, obj);
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object m2726(int i, int i2, Object obj) {
        InterfaceC0638 interfaceC0638M2731 = m2731(i2);
        if (!m2733(i, i2, obj)) {
            return interfaceC0638M2731.mo2625();
        }
        Object object = f3074.getObject(obj, m2730(i2) & 1048575);
        if (m2717(object)) {
            return object;
        }
        AbstractC0662 abstractC0662Mo2625 = interfaceC0638M2731.mo2625();
        if (object != null) {
            interfaceC0638M2731.mo2624(abstractC0662Mo2625, object);
        }
        return abstractC0662Mo2625;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m2727(Object obj, int i, Object obj2) {
        int[] iArr = this.f3081;
        int i2 = iArr[i];
        if (m2733(i2, i, obj2)) {
            int iM2730 = m2730(i) & 1048575;
            Unsafe unsafe = f3074;
            long j = iM2730;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC0638 interfaceC0638M2731 = m2731(i);
            if (!m2733(i2, i, obj)) {
                if (m2717(object)) {
                    AbstractC0662 abstractC0662Mo2625 = interfaceC0638M2731.mo2625();
                    interfaceC0638M2731.mo2624(abstractC0662Mo2625, object);
                    unsafe.putObject(obj, j, abstractC0662Mo2625);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                AbstractC0603.m2596(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m2717(object2)) {
                AbstractC0662 abstractC0662Mo26252 = interfaceC0638M2731.mo2625();
                interfaceC0638M2731.mo2624(abstractC0662Mo26252, object2);
                unsafe.putObject(obj, j, abstractC0662Mo26252);
                object2 = abstractC0662Mo26252;
            }
            interfaceC0638M2731.mo2624(object2, object);
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean m2728(AbstractC0662 abstractC0662, Object obj, int i) {
        return m2729(i, abstractC0662) == m2729(i, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ˏᵢ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2626(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C0668.mo2626(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ˑʽ */
    public final void mo2627(Object obj, C0679 c0679) throws zzbw {
        int i;
        int i2;
        int i3;
        Unsafe unsafe = f3074;
        int i4 = 1048575;
        boolean z = false;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f3081;
            if (i7 >= iArr.length) {
                this.f3078.getClass();
                C0622.m2636(C0622.m2633(obj), c0679);
                return;
            }
            int iM2730 = m2730(i7);
            int iM2720 = m2720(iM2730);
            int i8 = iArr[i7];
            if (iM2720 <= 17) {
                int i9 = iArr[i7 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i3 = 1 << (i9 >>> 20);
                i = i5;
                i2 = i6;
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = iM2730 & i4;
            switch (iM2720) {
                case 0:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2783(i8, AbstractC0603.m2600(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2769(i8, AbstractC0603.m2582(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2775(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2766(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2772(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2768(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2771(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2777(i8, AbstractC0603.m2599(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m2734(obj, i7, i, i2, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((C0678) c0679.f3103).m2758(i8, (String) object);
                            break;
                        } else {
                            c0679.m2778(i8, (C0615) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2781(i8, unsafe.getObject(obj, j), m2731(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2778(i8, (C0615) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2782(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2767(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2770(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2780(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2776(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2765(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m2734(obj, i7, i, i2, i3)) {
                        c0679.m2779(i8, unsafe.getObject(obj, j), m2731(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    AbstractC0656.m2702(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 19:
                    AbstractC0656.m2678(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 20:
                    AbstractC0656.m2677(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 21:
                    AbstractC0656.m2691(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 22:
                    AbstractC0656.m2693(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 23:
                    AbstractC0656.m2698(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 24:
                    AbstractC0656.m2689(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 25:
                    AbstractC0656.m2681(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 26:
                    int i11 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = AbstractC0656.f3065;
                    if (list != null && !list.isEmpty()) {
                        c0679.m2774(i11, list);
                        break;
                    } else {
                        break;
                    }
                case 27:
                    int i12 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC0638 interfaceC0638M2731 = m2731(i7);
                    Class cls2 = AbstractC0656.f3065;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            c0679.m2781(i12, list2.get(i13), interfaceC0638M2731);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 28:
                    int i14 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = AbstractC0656.f3065;
                    if (list3 != null && !list3.isEmpty()) {
                        c0679.m2773(i14, list3);
                        break;
                    } else {
                        break;
                    }
                case 29:
                    AbstractC0656.m2675(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 30:
                    AbstractC0656.m2701(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 31:
                    AbstractC0656.m2690(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 32:
                    AbstractC0656.m2674(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 33:
                    AbstractC0656.m2687(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 34:
                    AbstractC0656.m2699(iArr[i7], (List) unsafe.getObject(obj, j), c0679, z);
                    break;
                case 35:
                    AbstractC0656.m2702(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 36:
                    AbstractC0656.m2678(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 37:
                    AbstractC0656.m2677(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 38:
                    AbstractC0656.m2691(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 39:
                    AbstractC0656.m2693(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 40:
                    AbstractC0656.m2698(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 41:
                    AbstractC0656.m2689(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 42:
                    AbstractC0656.m2681(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 43:
                    AbstractC0656.m2675(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 44:
                    AbstractC0656.m2701(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 45:
                    AbstractC0656.m2690(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 46:
                    AbstractC0656.m2674(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 47:
                    AbstractC0656.m2687(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 48:
                    AbstractC0656.m2699(iArr[i7], (List) unsafe.getObject(obj, j), c0679, true);
                    break;
                case 49:
                    int i15 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC0638 interfaceC0638M27312 = m2731(i7);
                    Class cls4 = AbstractC0656.f3065;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i16 = 0; i16 < list4.size(); i16++) {
                            c0679.m2779(i15, list4.get(i16), interfaceC0638M27312);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        int i17 = i7 / 3;
                        ᐧʻ.ᵎˏ(this.f3076[i17 + i17]);
                        throw null;
                    }
                    break;
                case 51:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2783(i8, ((Double) AbstractC0603.m2601(j, obj)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2769(i8, ((Float) AbstractC0603.m2601(j, obj)).floatValue());
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2775(i8, m2719(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2766(i8, m2719(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2772(i8, m2716(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2768(i8, m2719(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2771(i8, m2716(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2777(i8, ((Boolean) AbstractC0603.m2601(j, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m2733(i8, i7, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((C0678) c0679.f3103).m2758(i8, (String) object2);
                            break;
                        } else {
                            c0679.m2778(i8, (C0615) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2781(i8, unsafe.getObject(obj, j), m2731(i7));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2778(i8, (C0615) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2782(i8, m2716(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2767(i8, m2716(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2770(i8, m2716(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2780(i8, m2719(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2776(i8, m2716(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2765(i8, m2719(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m2733(i8, i7, obj)) {
                        c0679.m2779(i8, unsafe.getObject(obj, j), m2731(i7));
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
            z = false;
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean m2729(int i, Object obj) {
        int i2 = this.f3081[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & AbstractC0603.m2594(j, obj)) != 0;
        }
        int iM2730 = m2730(i);
        long j2 = iM2730 & 1048575;
        switch (m2720(iM2730)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC0603.f2970.mo2565(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC0603.f2970.mo2562(j2, obj)) != 0;
            case 2:
                return AbstractC0603.m2595(j2, obj) != 0;
            case 3:
                return AbstractC0603.m2595(j2, obj) != 0;
            case 4:
                return AbstractC0603.m2594(j2, obj) != 0;
            case 5:
                return AbstractC0603.m2595(j2, obj) != 0;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return AbstractC0603.m2594(j2, obj) != 0;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return AbstractC0603.f2970.mo2567(j2, obj);
            case 8:
                Object objM2601 = AbstractC0603.m2601(j2, obj);
                if (objM2601 instanceof String) {
                    return !((String) objM2601).isEmpty();
                }
                if (objM2601 instanceof C0615) {
                    return !C0615.f2983.equals(objM2601);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC0603.m2601(j2, obj) != null;
            case 10:
                return !C0615.f2983.equals(AbstractC0603.m2601(j2, obj));
            case 11:
                return AbstractC0603.m2594(j2, obj) != 0;
            case 12:
                return AbstractC0603.m2594(j2, obj) != 0;
            case 13:
                return AbstractC0603.m2594(j2, obj) != 0;
            case 14:
                return AbstractC0603.m2595(j2, obj) != 0;
            case 15:
                return AbstractC0603.m2594(j2, obj) != 0;
            case 16:
                return AbstractC0603.m2595(j2, obj) != 0;
            case 17:
                return AbstractC0603.m2601(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final int m2730(int i) {
        return this.f3081[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ـﹶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2628(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = m2717(r7)
            if (r0 != 0) goto L8
            goto L86
        L8:
            boolean r0 = r7 instanceof com.google.android.gms.internal.play_billing.AbstractC0662
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r7
            com.google.android.gms.internal.play_billing.ᵢʿ r0 = (com.google.android.gms.internal.play_billing.AbstractC0662) r0
            r0.m2708()
            r0.zza = r1
            r0.m2710()
        L18:
            int[] r0 = r6.f3081
            int r2 = r0.length
            if (r1 >= r2) goto L7e
            int r2 = r6.m2730(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = m2720(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L68
            r5 = 60
            if (r2 == r5) goto L52
            r5 = 68
            if (r2 == r5) goto L52
            switch(r2) {
                case 17: goto L68;
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
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L7b
        L3a:
            sun.misc.Unsafe r0 = com.google.android.gms.internal.play_billing.C0668.f3074
            java.lang.Object r2 = r0.getObject(r7, r3)
            if (r2 == 0) goto L7b
            r5 = r2
            com.google.android.gms.internal.play_billing.ˊᵔ r5 = (com.google.android.gms.internal.play_billing.C0612) r5
            r5.m2618()
            r0.putObject(r7, r3, r2)
            goto L7b
        L4c:
            com.google.android.gms.internal.play_billing.ʻʿ r0 = r6.f3085
            r0.mo2552(r3, r7)
            goto L7b
        L52:
            r0 = r0[r1]
            boolean r0 = r6.m2733(r0, r1, r7)
            if (r0 == 0) goto L7b
            com.google.android.gms.internal.play_billing.ـᵎ r0 = r6.m2731(r1)
            sun.misc.Unsafe r2 = com.google.android.gms.internal.play_billing.C0668.f3074
            java.lang.Object r2 = r2.getObject(r7, r3)
            r0.mo2628(r2)
            goto L7b
        L68:
            boolean r0 = r6.m2729(r1, r7)
            if (r0 == 0) goto L7b
            com.google.android.gms.internal.play_billing.ـᵎ r0 = r6.m2731(r1)
            sun.misc.Unsafe r2 = com.google.android.gms.internal.play_billing.C0668.f3074
            java.lang.Object r2 = r2.getObject(r7, r3)
            r0.mo2628(r2)
        L7b:
            int r1 = r1 + 3
            goto L18
        L7e:
            com.google.android.gms.internal.play_billing.ˎᵢ r0 = r6.f3078
            r0.getClass()
            com.google.android.gms.internal.play_billing.C0622.m2634(r7)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C0668.mo2628(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04d9  */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ٴˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo2629(com.google.android.gms.internal.play_billing.AbstractC0662 r19) {
        /*
            Method dump skipped, instructions count: 2100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C0668.mo2629(com.google.android.gms.internal.play_billing.ᵢʿ):int");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ᐧʻ */
    public final boolean mo2630(AbstractC0662 abstractC0662, Object obj) {
        boolean zM2692;
        int i = 0;
        while (true) {
            int[] iArr = this.f3081;
            if (i >= iArr.length) {
                this.f3078.getClass();
                return abstractC0662.zzc.equals(((AbstractC0662) obj).zzc);
            }
            int iM2730 = m2730(i);
            long j = iM2730 & 1048575;
            switch (m2720(iM2730)) {
                case 0:
                    if (!m2728(abstractC0662, obj, i)) {
                        break;
                    } else {
                        AbstractC0596 abstractC0596 = AbstractC0603.f2970;
                        if (Double.doubleToLongBits(abstractC0596.mo2565(j, abstractC0662)) != Double.doubleToLongBits(abstractC0596.mo2565(j, obj))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 1:
                    if (!m2728(abstractC0662, obj, i)) {
                        break;
                    } else {
                        AbstractC0596 abstractC05962 = AbstractC0603.f2970;
                        if (Float.floatToIntBits(abstractC05962.mo2562(j, abstractC0662)) != Float.floatToIntBits(abstractC05962.mo2562(j, obj))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 2:
                    if (!m2728(abstractC0662, obj, i) || AbstractC0603.m2595(j, abstractC0662) != AbstractC0603.m2595(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 3:
                    if (!m2728(abstractC0662, obj, i) || AbstractC0603.m2595(j, abstractC0662) != AbstractC0603.m2595(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 4:
                    if (!m2728(abstractC0662, obj, i) || AbstractC0603.m2594(j, abstractC0662) != AbstractC0603.m2594(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 5:
                    if (!m2728(abstractC0662, obj, i) || AbstractC0603.m2595(j, abstractC0662) != AbstractC0603.m2595(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!m2728(abstractC0662, obj, i) || AbstractC0603.m2594(j, abstractC0662) != AbstractC0603.m2594(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!m2728(abstractC0662, obj, i)) {
                        break;
                    } else {
                        AbstractC0596 abstractC05963 = AbstractC0603.f2970;
                        if (abstractC05963.mo2567(j, abstractC0662) != abstractC05963.mo2567(j, obj)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                    }
                case 8:
                    if (!m2728(abstractC0662, obj, i) || !AbstractC0656.m2692(AbstractC0603.m2601(j, abstractC0662), AbstractC0603.m2601(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 9:
                    if (!m2728(abstractC0662, obj, i) || !AbstractC0656.m2692(AbstractC0603.m2601(j, abstractC0662), AbstractC0603.m2601(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 10:
                    if (!m2728(abstractC0662, obj, i) || !AbstractC0656.m2692(AbstractC0603.m2601(j, abstractC0662), AbstractC0603.m2601(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 11:
                    if (!m2728(abstractC0662, obj, i) || AbstractC0603.m2594(j, abstractC0662) != AbstractC0603.m2594(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 12:
                    if (!m2728(abstractC0662, obj, i) || AbstractC0603.m2594(j, abstractC0662) != AbstractC0603.m2594(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 13:
                    if (!m2728(abstractC0662, obj, i) || AbstractC0603.m2594(j, abstractC0662) != AbstractC0603.m2594(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 14:
                    if (!m2728(abstractC0662, obj, i) || AbstractC0603.m2595(j, abstractC0662) != AbstractC0603.m2595(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 15:
                    if (!m2728(abstractC0662, obj, i) || AbstractC0603.m2594(j, abstractC0662) != AbstractC0603.m2594(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 16:
                    if (!m2728(abstractC0662, obj, i) || AbstractC0603.m2595(j, abstractC0662) != AbstractC0603.m2595(j, obj)) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                case 17:
                    if (!m2728(abstractC0662, obj, i) || !AbstractC0656.m2692(AbstractC0603.m2601(j, abstractC0662), AbstractC0603.m2601(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
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
                    zM2692 = AbstractC0656.m2692(AbstractC0603.m2601(j, abstractC0662), AbstractC0603.m2601(j, obj));
                    break;
                case 50:
                    zM2692 = AbstractC0656.m2692(AbstractC0603.m2601(j, abstractC0662), AbstractC0603.m2601(j, obj));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j2 = iArr[i + 2] & 1048575;
                    if (AbstractC0603.m2594(j2, abstractC0662) != AbstractC0603.m2594(j2, obj) || !AbstractC0656.m2692(AbstractC0603.m2601(j, abstractC0662), AbstractC0603.m2601(j, obj))) {
                        break;
                    } else {
                        continue;
                        i += 3;
                    }
                    break;
                default:
                    i += 3;
            }
            if (zM2692) {
                i += 3;
            }
        }
        return false;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC0638 m2731(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f3076;
        InterfaceC0638 interfaceC0638 = (InterfaceC0638) objArr[i3];
        if (interfaceC0638 != null) {
            return interfaceC0638;
        }
        InterfaceC0638 interfaceC0638M2557 = C0592.f2957.m2557((Class) objArr[i3 + 1]);
        objArr[i3] = interfaceC0638M2557;
        return interfaceC0638M2557;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m2732(Object obj, int i, Object obj2, int i2) {
        f3074.putObject(obj, m2730(i2) & 1048575, obj2);
        AbstractC0603.m2596(this.f3081[i2 + 2] & 1048575, obj, i);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final boolean m2733(int i, int i2, Object obj) {
        return AbstractC0603.m2594((long) (this.f3081[i2 + 2] & 1048575), obj) == i;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final boolean m2734(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m2729(i, obj) : (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0df4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:660:0x0e0a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c9  */
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m2735(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, com.google.android.gms.internal.play_billing.C0654 r44) throws com.google.android.gms.internal.play_billing.zzdc {
        /*
            Method dump skipped, instructions count: 3930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C0668.m2735(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.ᵎˏ):int");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ﹳﹳ */
    public final void mo2631(Object obj, byte[] bArr, int i, int i2, C0654 c0654) throws zzdc {
        m2735(obj, bArr, i, i2, 0, c0654);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01eb, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC0638
    /* renamed from: ﹶˆ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo2632(com.google.android.gms.internal.play_billing.AbstractC0662 r11) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C0668.mo2632(com.google.android.gms.internal.play_billing.ᵢʿ):int");
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final int m2736(int i, int i2) {
        int[] iArr = this.f3081;
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
}
