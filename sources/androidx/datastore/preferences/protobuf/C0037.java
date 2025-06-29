package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.AbstractC0002;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import p334.C3789;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0037 implements InterfaceC0025 {

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final int[] f416 = new int[0];

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final Unsafe f417 = AbstractC0029.m312();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object[] f418;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC0052 f419;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int f420;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final AbstractC0020 f421;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final AbstractC0055 f422;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C0009 f423;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int[] f424;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f425;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int[] f426;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f427;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f428;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C0014 f429;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f430;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f431;

    public C0037(int[] iArr, Object[] objArr, int i, int i2, AbstractC0052 abstractC0052, boolean z, int[] iArr2, int i3, int i4, C0009 c0009, AbstractC0020 abstractC0020, AbstractC0055 abstractC0055, C0041 c0041, C0014 c0014) {
        this.f426 = iArr;
        this.f418 = objArr;
        this.f425 = i;
        this.f430 = i2;
        this.f427 = abstractC0052 instanceof AbstractC0083;
        this.f428 = z;
        this.f424 = iArr2;
        this.f431 = i3;
        this.f420 = i4;
        this.f423 = c0009;
        this.f421 = abstractC0020;
        this.f422 = abstractC0055;
        this.f419 = abstractC0052;
        this.f429 = c0014;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static int m355(long j, Object obj) {
        return ((Integer) AbstractC0029.f392.m494(j, obj)).intValue();
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static void m356(int i, Object obj, C0030 c0030) throws IOException {
        if (!(obj instanceof String)) {
            c0030.m327(i, (C0056) obj);
        } else {
            ((C0040) c0030.f398).m419(i, (String) obj);
        }
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static C0037 m357(C0063 c0063, C0009 c0009, AbstractC0020 abstractC0020, AbstractC0055 abstractC0055, C0041 c0041, C0014 c0014) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iObjectFieldOffset;
        String str;
        int i24;
        int iObjectFieldOffset2;
        int i25;
        Field fieldM362;
        int i26;
        char cCharAt9;
        int i27;
        int i28;
        Field fieldM3622;
        Field fieldM3623;
        int i29;
        char cCharAt10;
        int i30;
        char cCharAt11;
        int i31;
        char cCharAt12;
        int i32;
        char cCharAt13;
        char cCharAt14;
        int i33 = 0;
        boolean z = c0063.m499() == 2;
        String strM497 = c0063.m497();
        int length = strM497.length();
        int iCharAt3 = strM497.charAt(0);
        if (iCharAt3 >= 55296) {
            int i34 = iCharAt3 & 8191;
            int i35 = 1;
            int i36 = 13;
            while (true) {
                i = i35 + 1;
                cCharAt14 = strM497.charAt(i35);
                if (cCharAt14 < 55296) {
                    break;
                }
                i34 |= (cCharAt14 & 8191) << i36;
                i36 += 13;
                i35 = i;
            }
            iCharAt3 = i34 | (cCharAt14 << i36);
        } else {
            i = 1;
        }
        int i37 = i + 1;
        int iCharAt4 = strM497.charAt(i);
        if (iCharAt4 >= 55296) {
            int i38 = iCharAt4 & 8191;
            int i39 = 13;
            while (true) {
                i32 = i37 + 1;
                cCharAt13 = strM497.charAt(i37);
                if (cCharAt13 < 55296) {
                    break;
                }
                i38 |= (cCharAt13 & 8191) << i39;
                i39 += 13;
                i37 = i32;
            }
            iCharAt4 = i38 | (cCharAt13 << i39);
            i37 = i32;
        }
        if (iCharAt4 == 0) {
            iArr = f416;
            i6 = 0;
            i4 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i5 = 0;
            i3 = 0;
        } else {
            int i40 = i37 + 1;
            int iCharAt5 = strM497.charAt(i37);
            if (iCharAt5 >= 55296) {
                int i41 = iCharAt5 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    cCharAt8 = strM497.charAt(i40);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                iCharAt5 = i41 | (cCharAt8 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int iCharAt6 = strM497.charAt(i40);
            if (iCharAt6 >= 55296) {
                int i44 = iCharAt6 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    cCharAt7 = strM497.charAt(i43);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                iCharAt6 = i44 | (cCharAt7 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            iCharAt = strM497.charAt(i43);
            if (iCharAt >= 55296) {
                int i47 = iCharAt & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    cCharAt6 = strM497.charAt(i46);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                iCharAt = i47 | (cCharAt6 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            iCharAt2 = strM497.charAt(i46);
            if (iCharAt2 >= 55296) {
                int i50 = iCharAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    cCharAt5 = strM497.charAt(i49);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                iCharAt2 = i50 | (cCharAt5 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int iCharAt7 = strM497.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    cCharAt4 = strM497.charAt(i52);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                iCharAt7 = i53 | (cCharAt4 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int iCharAt8 = strM497.charAt(i52);
            if (iCharAt8 >= 55296) {
                int i56 = iCharAt8 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    cCharAt3 = strM497.charAt(i55);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                iCharAt8 = i56 | (cCharAt3 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int iCharAt9 = strM497.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = i58;
                int i61 = 13;
                while (true) {
                    i8 = i60 + 1;
                    cCharAt2 = strM497.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i60 = i8;
                }
                iCharAt9 = i59 | (cCharAt2 << i61);
                i2 = i8;
            } else {
                i2 = i58;
            }
            int i62 = i2 + 1;
            int iCharAt10 = strM497.charAt(i2);
            if (iCharAt10 >= 55296) {
                int i63 = iCharAt10 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i7 = i64 + 1;
                    cCharAt = strM497.charAt(i64);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i64 = i7;
                }
                iCharAt10 = i63 | (cCharAt << i65);
                i62 = i7;
            }
            int[] iArr2 = new int[iCharAt10 + iCharAt8 + iCharAt9];
            i3 = (iCharAt5 * 2) + iCharAt6;
            i4 = iCharAt8;
            i5 = iCharAt10;
            i33 = iCharAt5;
            i37 = i62;
            int i66 = iCharAt7;
            iArr = iArr2;
            i6 = i66;
        }
        Unsafe unsafe = f417;
        Object[] objArrM496 = c0063.m496();
        Class<?> cls = c0063.m498().getClass();
        int i67 = i37;
        int[] iArr3 = new int[i6 * 3];
        Object[] objArr = new Object[i6 * 2];
        int i68 = i5 + i4;
        int i69 = i5;
        int i70 = i67;
        int i71 = i68;
        int i72 = 0;
        int i73 = 0;
        while (i70 < length) {
            int i74 = i70 + 1;
            int iCharAt11 = strM497.charAt(i70);
            if (iCharAt11 >= 55296) {
                int i75 = iCharAt11 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i31 = i76 + 1;
                    cCharAt12 = strM497.charAt(i76);
                    i15 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i31;
                    length = i15;
                }
                iCharAt11 = i75 | (cCharAt12 << i77);
                i16 = i31;
            } else {
                i15 = length;
                i16 = i74;
            }
            int i78 = i16 + 1;
            int iCharAt12 = strM497.charAt(i16);
            if (iCharAt12 >= 55296) {
                int i79 = iCharAt12 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i30 = i80 + 1;
                    cCharAt11 = strM497.charAt(i80);
                    i17 = i5;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i30;
                    i5 = i17;
                }
                iCharAt12 = i79 | (cCharAt11 << i81);
                i18 = i30;
            } else {
                i17 = i5;
                i18 = i78;
            }
            int i82 = iCharAt12 & 255;
            boolean z2 = z;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            if (i82 >= 51) {
                int i83 = i18 + 1;
                int iCharAt13 = strM497.charAt(i18);
                if (iCharAt13 >= 55296) {
                    int i84 = iCharAt13 & 8191;
                    int i85 = i83;
                    int i86 = 13;
                    while (true) {
                        i29 = i85 + 1;
                        cCharAt10 = strM497.charAt(i85);
                        i19 = iCharAt2;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i84 |= (cCharAt10 & 8191) << i86;
                        i86 += 13;
                        i85 = i29;
                        iCharAt2 = i19;
                    }
                    iCharAt13 = i84 | (cCharAt10 << i86);
                    i28 = i29;
                } else {
                    i19 = iCharAt2;
                    i28 = i83;
                }
                int i87 = i82 - 51;
                int i88 = i28;
                if (i87 == 9 || i87 == 17) {
                    objArr[((i73 / 3) * 2) + 1] = objArrM496[i3];
                    i3++;
                } else if (i87 == 12 && (iCharAt3 & 1) == 1) {
                    objArr[((i73 / 3) * 2) + 1] = objArrM496[i3];
                    i3++;
                }
                int i89 = iCharAt13 * 2;
                Object obj = objArrM496[i89];
                if (obj instanceof Field) {
                    fieldM3622 = (Field) obj;
                } else {
                    fieldM3622 = m362((String) obj, cls);
                    objArrM496[i89] = fieldM3622;
                }
                int i90 = iCharAt;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM3622);
                int i91 = i89 + 1;
                Object obj2 = objArrM496[i91];
                if (obj2 instanceof Field) {
                    fieldM3623 = (Field) obj2;
                } else {
                    fieldM3623 = m362((String) obj2, cls);
                    objArrM496[i91] = fieldM3623;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM3623);
                i20 = i3;
                iObjectFieldOffset = iObjectFieldOffset3;
                str = strM497;
                i22 = iCharAt12;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i25 = 0;
                i21 = i90;
                i24 = i88;
            } else {
                i19 = iCharAt2;
                int i92 = iCharAt;
                i20 = i3 + 1;
                Field fieldM3624 = m362((String) objArrM496[i3], cls);
                i21 = i92;
                if (i82 == 9 || i82 == 17) {
                    i22 = iCharAt12;
                    i23 = 1;
                    objArr[((i73 / 3) * 2) + 1] = fieldM3624.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i22 = iCharAt12;
                        i23 = 1;
                        i27 = i3 + 2;
                        objArr[((i73 / 3) * 2) + 1] = objArrM496[i20];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i22 = iCharAt12;
                        i23 = 1;
                        if ((iCharAt3 & 1) == 1) {
                            i27 = i3 + 2;
                            objArr[((i73 / 3) * 2) + 1] = objArrM496[i20];
                        }
                    } else if (i82 == 50) {
                        int i93 = i69 + 1;
                        iArr[i69] = i73;
                        int i94 = (i73 / 3) * 2;
                        int i95 = i3 + 2;
                        objArr[i94] = objArrM496[i20];
                        if ((iCharAt12 & 2048) != 0) {
                            i20 = i3 + 3;
                            objArr[i94 + 1] = objArrM496[i95];
                            i22 = iCharAt12;
                            i69 = i93;
                            i23 = 1;
                        } else {
                            i69 = i93;
                            i20 = i95;
                            i22 = iCharAt12;
                            i23 = 1;
                        }
                    } else {
                        i22 = iCharAt12;
                        i23 = 1;
                    }
                    i20 = i27;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM3624);
                if ((iCharAt3 & 1) != i23 || i82 > 17) {
                    str = strM497;
                    i24 = i18;
                    iObjectFieldOffset2 = 0;
                    i25 = 0;
                } else {
                    i24 = i18 + 1;
                    int iCharAt14 = strM497.charAt(i18);
                    if (iCharAt14 >= 55296) {
                        int i96 = iCharAt14 & 8191;
                        int i97 = 13;
                        while (true) {
                            i26 = i24 + 1;
                            cCharAt9 = strM497.charAt(i24);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i96 |= (cCharAt9 & 8191) << i97;
                            i97 += 13;
                            i24 = i26;
                        }
                        iCharAt14 = i96 | (cCharAt9 << i97);
                        i24 = i26;
                    }
                    int i98 = (iCharAt14 / 32) + (i33 * 2);
                    Object obj3 = objArrM496[i98];
                    if (obj3 instanceof Field) {
                        fieldM362 = (Field) obj3;
                    } else {
                        fieldM362 = m362((String) obj3, cls);
                        objArrM496[i98] = fieldM362;
                    }
                    str = strM497;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM362);
                    i25 = iCharAt14 % 32;
                }
                if (i82 >= 18 && i82 <= 49) {
                    iArr[i71] = iObjectFieldOffset;
                    i71++;
                }
            }
            int i99 = i73 + 1;
            iArr3[i73] = iCharAt11;
            int i100 = i73 + 2;
            int i101 = i33;
            int i102 = i22;
            Unsafe unsafe2 = unsafe;
            iArr3[i99] = ((i102 & 256) != 0 ? 268435456 : 0) | ((i102 & 512) != 0 ? 536870912 : 0) | (i82 << 20) | iObjectFieldOffset;
            i73 += 3;
            iArr3[i100] = (i25 << 20) | iObjectFieldOffset2;
            i70 = i24;
            strM497 = str;
            i33 = i101;
            iCharAt = i21;
            length = i15;
            i5 = i17;
            unsafe = unsafe2;
            iCharAt2 = i19;
            i3 = i20;
            z = z2;
        }
        return new C0037(iArr3, objArr, iCharAt, iCharAt2, c0063.m498(), z, iArr, i5, i68, c0009, abstractC0020, abstractC0055, c0041, c0014);
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static long m358(long j, Object obj) {
        return ((Long) AbstractC0029.f392.m494(j, obj)).longValue();
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static int m359(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static List m360(AbstractC0052 abstractC0052, long j) {
        return (List) AbstractC0029.f392.m494(j, abstractC0052);
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static long m361(int i) {
        return i & 1048575;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static Field m362(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM50 = AbstractC0002.m50("Field ", str, " for ");
            sbM50.append(cls.getName());
            sbM50.append(" not found. Known fields are ");
            sbM50.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM50.toString());
        }
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static C0037 m363(C0063 c0063, C0009 c0009, AbstractC0020 abstractC0020, AbstractC0055 abstractC0055, C0041 c0041, C0014 c0014) {
        if (c0063 instanceof C0063) {
            return m357(c0063, c0009, abstractC0020, abstractC0055, c0041, c0014);
        }
        c0063.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ʽᐧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo299(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0037.mo299(java.lang.Object):boolean");
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final void m364(Object obj, C0030 c0030) throws IOException {
        int i;
        int[] iArr = this.f426;
        int length = iArr.length;
        Unsafe unsafe = f417;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM386 = m386(i4);
            int i5 = iArr[i4];
            int iM359 = m359(iM386);
            if (this.f428 || iM359 > 17) {
                i = 0;
            } else {
                int i6 = iArr[i4 + 2];
                int i7 = i6 & 1048575;
                if (i7 != i2) {
                    i3 = unsafe.getInt(obj, i7);
                    i2 = i7;
                }
                i = 1 << (i6 >>> 20);
            }
            long j = iM386 & 1048575;
            switch (iM359) {
                case 0:
                    if ((i & i3) != 0) {
                        c0030.m335(i5, AbstractC0029.f392.mo224(j, obj));
                        continue;
                    }
                case 1:
                    if ((i & i3) != 0) {
                        c0030.m339(i5, AbstractC0029.f392.mo229(j, obj));
                    } else {
                        continue;
                    }
                case 2:
                    if ((i & i3) != 0) {
                        c0030.m329(i5, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case 3:
                    if ((i & i3) != 0) {
                        c0030.m341(i5, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case 4:
                    if ((i & i3) != 0) {
                        c0030.m343(i5, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                case 5:
                    if ((i & i3) != 0) {
                        c0030.m338(i5, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if ((i & i3) != 0) {
                        c0030.m328(i5, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i & i3) != 0) {
                        c0030.m337(i5, AbstractC0029.f392.mo228(j, obj));
                    } else {
                        continue;
                    }
                case 8:
                    if ((i & i3) != 0) {
                        m356(i5, unsafe.getObject(obj, j), c0030);
                    } else {
                        continue;
                    }
                case 9:
                    if ((i & i3) != 0) {
                        c0030.m332(i5, unsafe.getObject(obj, j), m381(i4));
                    } else {
                        continue;
                    }
                case 10:
                    if ((i & i3) != 0) {
                        c0030.m327(i5, (C0056) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                case 11:
                    if ((i & i3) != 0) {
                        c0030.m336(i5, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                case 12:
                    if ((i & i3) != 0) {
                        c0030.m342(i5, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                case 13:
                    if ((i & i3) != 0) {
                        c0030.m330(i5, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                case 14:
                    if ((i & i3) != 0) {
                        c0030.m331(i5, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case 15:
                    if ((i & i3) != 0) {
                        c0030.m340(i5, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                case 16:
                    if ((i & i3) != 0) {
                        c0030.m333(i5, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                case 17:
                    if ((i & i3) != 0) {
                        c0030.m334(i5, unsafe.getObject(obj, j), m381(i4));
                    } else {
                        continue;
                    }
                case 18:
                    AbstractC0074.m521(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    continue;
                case 19:
                    AbstractC0074.m539(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    continue;
                case 20:
                    AbstractC0074.m517(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    continue;
                case 21:
                    AbstractC0074.m549(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    continue;
                case 22:
                    AbstractC0074.m561(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    continue;
                case 23:
                    AbstractC0074.m525(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    continue;
                case 24:
                    AbstractC0074.m557(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    continue;
                case 25:
                    AbstractC0074.m528(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    continue;
                case 26:
                    AbstractC0074.m515(iArr[i4], (List) unsafe.getObject(obj, j), c0030);
                    break;
                case 27:
                    AbstractC0074.m537(iArr[i4], (List) unsafe.getObject(obj, j), c0030, m381(i4));
                    break;
                case 28:
                    AbstractC0074.m543(iArr[i4], (List) unsafe.getObject(obj, j), c0030);
                    break;
                case 29:
                    AbstractC0074.m550(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    break;
                case 30:
                    AbstractC0074.m552(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    break;
                case 31:
                    AbstractC0074.m536(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    break;
                case 32:
                    AbstractC0074.m553(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    break;
                case 33:
                    AbstractC0074.m530(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    break;
                case 34:
                    AbstractC0074.m551(iArr[i4], (List) unsafe.getObject(obj, j), c0030, false);
                    break;
                case 35:
                    AbstractC0074.m521(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 36:
                    AbstractC0074.m539(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 37:
                    AbstractC0074.m517(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 38:
                    AbstractC0074.m549(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 39:
                    AbstractC0074.m561(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 40:
                    AbstractC0074.m525(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 41:
                    AbstractC0074.m557(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 42:
                    AbstractC0074.m528(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 43:
                    AbstractC0074.m550(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 44:
                    AbstractC0074.m552(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 45:
                    AbstractC0074.m536(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 46:
                    AbstractC0074.m553(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 47:
                    AbstractC0074.m530(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 48:
                    AbstractC0074.m551(iArr[i4], (List) unsafe.getObject(obj, j), c0030, true);
                    break;
                case 49:
                    AbstractC0074.m545(iArr[i4], (List) unsafe.getObject(obj, j), c0030, m381(i4));
                    break;
                case 50:
                    m378(c0030, i5, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (m374(i5, i4, obj)) {
                        c0030.m335(i5, ((Double) AbstractC0029.f392.m494(j, obj)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (m374(i5, i4, obj)) {
                        c0030.m339(i5, ((Float) AbstractC0029.f392.m494(j, obj)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (m374(i5, i4, obj)) {
                        c0030.m329(i5, m358(j, obj));
                        break;
                    }
                    break;
                case 54:
                    if (m374(i5, i4, obj)) {
                        c0030.m341(i5, m358(j, obj));
                        break;
                    }
                    break;
                case 55:
                    if (m374(i5, i4, obj)) {
                        c0030.m343(i5, m355(j, obj));
                        break;
                    }
                    break;
                case 56:
                    if (m374(i5, i4, obj)) {
                        c0030.m338(i5, m358(j, obj));
                        break;
                    }
                    break;
                case 57:
                    if (m374(i5, i4, obj)) {
                        c0030.m328(i5, m355(j, obj));
                        break;
                    }
                    break;
                case 58:
                    if (m374(i5, i4, obj)) {
                        c0030.m337(i5, ((Boolean) AbstractC0029.f392.m494(j, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (m374(i5, i4, obj)) {
                        m356(i5, unsafe.getObject(obj, j), c0030);
                        break;
                    }
                    break;
                case 60:
                    if (m374(i5, i4, obj)) {
                        c0030.m332(i5, unsafe.getObject(obj, j), m381(i4));
                        break;
                    }
                    break;
                case 61:
                    if (m374(i5, i4, obj)) {
                        c0030.m327(i5, (C0056) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (m374(i5, i4, obj)) {
                        c0030.m336(i5, m355(j, obj));
                        break;
                    }
                    break;
                case 63:
                    if (m374(i5, i4, obj)) {
                        c0030.m342(i5, m355(j, obj));
                        break;
                    }
                    break;
                case 64:
                    if (m374(i5, i4, obj)) {
                        c0030.m330(i5, m355(j, obj));
                        break;
                    }
                    break;
                case 65:
                    if (m374(i5, i4, obj)) {
                        c0030.m331(i5, m358(j, obj));
                        break;
                    }
                    break;
                case 66:
                    if (m374(i5, i4, obj)) {
                        c0030.m340(i5, m355(j, obj));
                        break;
                    }
                    break;
                case 67:
                    if (m374(i5, i4, obj)) {
                        c0030.m333(i5, m358(j, obj));
                        break;
                    }
                    break;
                case 68:
                    if (m374(i5, i4, obj)) {
                        c0030.m334(i5, unsafe.getObject(obj, j), m381(i4));
                        break;
                    }
                    break;
            }
        }
        ((C0067) this.f422).getClass();
        ((AbstractC0083) obj).unknownFields.m478(c0030);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ʿʼ */
    public final void mo300(Object obj, C0030 c0030) throws IOException {
        c0030.getClass();
        if (!this.f428) {
            m364(obj, c0030);
            return;
        }
        int[] iArr = this.f426;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iM386 = m386(i);
            int i2 = iArr[i];
            switch (m359(iM386)) {
                case 0:
                    if (m382(i, obj)) {
                        c0030.m335(i2, AbstractC0029.f392.mo224(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m382(i, obj)) {
                        c0030.m339(i2, AbstractC0029.f392.mo229(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m382(i, obj)) {
                        c0030.m329(i2, AbstractC0029.f392.m489(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m382(i, obj)) {
                        c0030.m341(i2, AbstractC0029.f392.m489(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m382(i, obj)) {
                        c0030.m343(i2, AbstractC0029.f392.m492(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m382(i, obj)) {
                        c0030.m338(i2, AbstractC0029.f392.m489(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m382(i, obj)) {
                        c0030.m328(i2, AbstractC0029.f392.m492(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m382(i, obj)) {
                        c0030.m337(i2, AbstractC0029.f392.mo228(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m382(i, obj)) {
                        m356(i2, AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m382(i, obj)) {
                        c0030.m332(i2, AbstractC0029.f392.m494(iM386 & 1048575, obj), m381(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m382(i, obj)) {
                        c0030.m327(i2, (C0056) AbstractC0029.f392.m494(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m382(i, obj)) {
                        c0030.m336(i2, AbstractC0029.f392.m492(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m382(i, obj)) {
                        c0030.m342(i2, AbstractC0029.f392.m492(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m382(i, obj)) {
                        c0030.m330(i2, AbstractC0029.f392.m492(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m382(i, obj)) {
                        c0030.m331(i2, AbstractC0029.f392.m489(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m382(i, obj)) {
                        c0030.m340(i2, AbstractC0029.f392.m492(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m382(i, obj)) {
                        c0030.m333(i2, AbstractC0029.f392.m489(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m382(i, obj)) {
                        c0030.m334(i2, AbstractC0029.f392.m494(iM386 & 1048575, obj), m381(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    AbstractC0074.m521(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 19:
                    AbstractC0074.m539(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 20:
                    AbstractC0074.m517(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 21:
                    AbstractC0074.m549(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 22:
                    AbstractC0074.m561(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 23:
                    AbstractC0074.m525(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 24:
                    AbstractC0074.m557(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 25:
                    AbstractC0074.m528(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 26:
                    AbstractC0074.m515(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030);
                    break;
                case 27:
                    AbstractC0074.m537(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, m381(i));
                    break;
                case 28:
                    AbstractC0074.m543(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030);
                    break;
                case 29:
                    AbstractC0074.m550(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 30:
                    AbstractC0074.m552(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 31:
                    AbstractC0074.m536(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 32:
                    AbstractC0074.m553(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 33:
                    AbstractC0074.m530(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 34:
                    AbstractC0074.m551(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, false);
                    break;
                case 35:
                    AbstractC0074.m521(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 36:
                    AbstractC0074.m539(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 37:
                    AbstractC0074.m517(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 38:
                    AbstractC0074.m549(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 39:
                    AbstractC0074.m561(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 40:
                    AbstractC0074.m525(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 41:
                    AbstractC0074.m557(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 42:
                    AbstractC0074.m528(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 43:
                    AbstractC0074.m550(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 44:
                    AbstractC0074.m552(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 45:
                    AbstractC0074.m536(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 46:
                    AbstractC0074.m553(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 47:
                    AbstractC0074.m530(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 48:
                    AbstractC0074.m551(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, true);
                    break;
                case 49:
                    AbstractC0074.m545(iArr[i], (List) AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030, m381(i));
                    break;
                case 50:
                    m378(c0030, i2, AbstractC0029.f392.m494(iM386 & 1048575, obj), i);
                    break;
                case 51:
                    if (m374(i2, i, obj)) {
                        c0030.m335(i2, ((Double) AbstractC0029.f392.m494(iM386 & 1048575, obj)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m374(i2, i, obj)) {
                        c0030.m339(i2, ((Float) AbstractC0029.f392.m494(iM386 & 1048575, obj)).floatValue());
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m374(i2, i, obj)) {
                        c0030.m329(i2, m358(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m374(i2, i, obj)) {
                        c0030.m341(i2, m358(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m374(i2, i, obj)) {
                        c0030.m343(i2, m355(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m374(i2, i, obj)) {
                        c0030.m338(i2, m358(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m374(i2, i, obj)) {
                        c0030.m328(i2, m355(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m374(i2, i, obj)) {
                        c0030.m337(i2, ((Boolean) AbstractC0029.f392.m494(iM386 & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m374(i2, i, obj)) {
                        m356(i2, AbstractC0029.f392.m494(iM386 & 1048575, obj), c0030);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m374(i2, i, obj)) {
                        c0030.m332(i2, AbstractC0029.f392.m494(iM386 & 1048575, obj), m381(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m374(i2, i, obj)) {
                        c0030.m327(i2, (C0056) AbstractC0029.f392.m494(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m374(i2, i, obj)) {
                        c0030.m336(i2, m355(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m374(i2, i, obj)) {
                        c0030.m342(i2, m355(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m374(i2, i, obj)) {
                        c0030.m330(i2, m355(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m374(i2, i, obj)) {
                        c0030.m331(i2, m358(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m374(i2, i, obj)) {
                        c0030.m340(i2, m355(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m374(i2, i, obj)) {
                        c0030.m333(i2, m358(iM386 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m374(i2, i, obj)) {
                        c0030.m334(i2, AbstractC0029.f392.m494(iM386 & 1048575, obj), m381(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((C0067) this.f422).getClass();
        ((AbstractC0083) obj).unknownFields.m478(c0030);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m365(Object obj, int i, Object obj2, C0062 c0062, InterfaceC0017 interfaceC0017) {
        long jM386 = m386(i) & 1048575;
        Object objM494 = AbstractC0029.f392.m494(jM386, obj);
        C0014 c0014 = this.f429;
        if (objM494 == null) {
            c0014.getClass();
            objM494 = C0085.f519.m583();
            AbstractC0029.m314(jM386, obj, objM494);
        } else {
            c0014.getClass();
            if (!((C0085) objM494).f520) {
                C0085 c0085M583 = C0085.f519.m583();
                C0014.m234(c0085M583, objM494);
                AbstractC0029.m314(jM386, obj, c0085M583);
                objM494 = c0085M583;
            }
        }
        c0014.getClass();
        interfaceC0017.mo254((C0085) objM494, ((C0061) obj2).f479, c0062);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int m366(int i) {
        if (i < this.f425 || i > this.f430) {
            return -1;
        }
        int[] iArr = this.f426;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m367(Object obj, int i, InterfaceC0017 interfaceC0017) {
        if ((536870912 & i) != 0) {
            AbstractC0029.m314(i & 1048575, obj, interfaceC0017.mo249());
        } else if (this.f427) {
            AbstractC0029.m314(i & 1048575, obj, interfaceC0017.mo255());
        } else {
            AbstractC0029.m314(i & 1048575, obj, interfaceC0017.mo277());
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m368(AbstractC0083 abstractC0083, Object obj, int i) {
        return m382(i, abstractC0083) == m382(i, obj);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m369(int i) {
        if (this.f418[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m370(int i, Object obj) {
        if (this.f428) {
            return;
        }
        int i2 = this.f426[i + 2];
        long j = i2 & 1048575;
        AbstractC0029.m319(j, obj, AbstractC0029.f392.m492(j, obj) | (1 << (i2 >>> 20)));
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m371(AbstractC0083 abstractC0083, AbstractC0083 abstractC00832, int i) {
        long jM386 = m386(i) & 1048575;
        if (m382(i, abstractC00832)) {
            AbstractC0057 abstractC0057 = AbstractC0029.f392;
            Object objM494 = abstractC0057.m494(jM386, abstractC0083);
            Object objM4942 = abstractC0057.m494(jM386, abstractC00832);
            if (objM494 != null && objM4942 != null) {
                AbstractC0029.m314(jM386, abstractC0083, AbstractC0077.m564(objM494, objM4942));
                m370(i, abstractC0083);
            } else if (objM4942 != null) {
                AbstractC0029.m314(jM386, abstractC0083, objM4942);
                m370(i, abstractC0083);
            }
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final Object m372(int i) {
        return this.f418[(i / 3) * 2];
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m373(Object obj, long j, InterfaceC0017 interfaceC0017, InterfaceC0025 interfaceC0025, C0062 c0062) {
        interfaceC0017.mo246(this.f421.mo288(j, obj), interfaceC0025, c0062);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final boolean m374(int i, int i2, Object obj) {
        return AbstractC0029.f392.m492((long) (this.f426[i2 + 2] & 1048575), obj) == i;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m375(Object obj, int i, Object obj2) {
        int i2 = this.f426[i];
        if (AbstractC0029.f392.m494(m386(i) & 1048575, obj) == null) {
            return;
        }
        m369(i);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final int m376(AbstractC0052 abstractC0052) {
        int i;
        int iM393;
        int iM404;
        Unsafe unsafe = f417;
        int i2 = -1;
        int i3 = 0;
        int iM44 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f426;
            if (i3 >= iArr.length) {
                ((C0067) this.f422).getClass();
                return ((AbstractC0083) abstractC0052).unknownFields.m477() + iM44;
            }
            int iM386 = m386(i3);
            int i5 = iArr[i3];
            int iM359 = m359(iM386);
            if (iM359 <= 17) {
                int i6 = iArr[i3 + 2];
                int i7 = i6 & 1048575;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i4 = unsafe.getInt(abstractC0052, i7);
                    i2 = i7;
                }
            } else {
                i = 0;
            }
            long j = iM386 & 1048575;
            switch (iM359) {
                case 0:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m393(i5);
                        iM44 += iM393;
                        break;
                    }
                case 1:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m405(i5);
                        iM44 += iM393;
                        break;
                    }
                case 2:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m394(i5, unsafe.getLong(abstractC0052, j));
                        iM44 += iM393;
                        break;
                    }
                case 3:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m396(i5, unsafe.getLong(abstractC0052, j));
                        iM44 += iM393;
                        break;
                    }
                case 4:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m400(i5, unsafe.getInt(abstractC0052, j));
                        iM44 += iM393;
                        break;
                    }
                case 5:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m397(i5);
                        iM44 += iM393;
                        break;
                    }
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m407(i5);
                        iM44 += iM393;
                        break;
                    }
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m402(i5);
                        iM44 += iM393;
                        break;
                    }
                case 8:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0052, j);
                        iM404 = object instanceof C0056 ? C0040.m404(i5, (C0056) object) : C0040.m392(i5, (String) object);
                        iM44 = iM404 + iM44;
                        break;
                    }
                case 9:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = AbstractC0074.m532(i5, unsafe.getObject(abstractC0052, j), m381(i3));
                        iM44 += iM393;
                        break;
                    }
                case 10:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m404(i5, (C0056) unsafe.getObject(abstractC0052, j));
                        iM44 += iM393;
                        break;
                    }
                case 11:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m409(i5, unsafe.getInt(abstractC0052, j));
                        iM44 += iM393;
                        break;
                    }
                case 12:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m408(i5, unsafe.getInt(abstractC0052, j));
                        iM44 += iM393;
                        break;
                    }
                case 13:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m399(i5);
                        iM44 += iM393;
                        break;
                    }
                case 14:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m390(i5);
                        iM44 += iM393;
                        break;
                    }
                case 15:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m403(i5, unsafe.getInt(abstractC0052, j));
                        iM44 += iM393;
                        break;
                    }
                case 16:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m406(i5, unsafe.getLong(abstractC0052, j));
                        iM44 += iM393;
                        break;
                    }
                case 17:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM393 = C0040.m391(i5, (AbstractC0052) unsafe.getObject(abstractC0052, j), m381(i3));
                        iM44 += iM393;
                        break;
                    }
                case 18:
                    iM393 = AbstractC0074.m533(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 19:
                    iM393 = AbstractC0074.m541(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 20:
                    iM393 = AbstractC0074.m527(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 21:
                    iM393 = AbstractC0074.m559(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 22:
                    iM393 = AbstractC0074.m531(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 23:
                    iM393 = AbstractC0074.m533(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 24:
                    iM393 = AbstractC0074.m541(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 25:
                    iM393 = AbstractC0074.m540(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 26:
                    iM393 = AbstractC0074.m519(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 27:
                    iM393 = AbstractC0074.m535(i5, (List) unsafe.getObject(abstractC0052, j), m381(i3));
                    iM44 += iM393;
                    break;
                case 28:
                    iM393 = AbstractC0074.m534(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 29:
                    iM393 = AbstractC0074.m526(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 30:
                    iM393 = AbstractC0074.m556(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 31:
                    iM393 = AbstractC0074.m541(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 32:
                    iM393 = AbstractC0074.m533(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 33:
                    iM393 = AbstractC0074.m548(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 34:
                    iM393 = AbstractC0074.m547(i5, (List) unsafe.getObject(abstractC0052, j));
                    iM44 += iM393;
                    break;
                case 35:
                    int iM558 = AbstractC0074.m558((List) unsafe.getObject(abstractC0052, j));
                    if (iM558 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM558, C0040.m401(i5), iM558, iM44);
                        break;
                    }
                case 36:
                    int iM542 = AbstractC0074.m542((List) unsafe.getObject(abstractC0052, j));
                    if (iM542 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM542, C0040.m401(i5), iM542, iM44);
                        break;
                    }
                case 37:
                    int iM546 = AbstractC0074.m546((List) unsafe.getObject(abstractC0052, j));
                    if (iM546 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM546, C0040.m401(i5), iM546, iM44);
                        break;
                    }
                case 38:
                    int iM538 = AbstractC0074.m538((List) unsafe.getObject(abstractC0052, j));
                    if (iM538 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM538, C0040.m401(i5), iM538, iM44);
                        break;
                    }
                case 39:
                    int iM524 = AbstractC0074.m524((List) unsafe.getObject(abstractC0052, j));
                    if (iM524 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM524, C0040.m401(i5), iM524, iM44);
                        break;
                    }
                case 40:
                    int iM5582 = AbstractC0074.m558((List) unsafe.getObject(abstractC0052, j));
                    if (iM5582 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM5582, C0040.m401(i5), iM5582, iM44);
                        break;
                    }
                case 41:
                    int iM5422 = AbstractC0074.m542((List) unsafe.getObject(abstractC0052, j));
                    if (iM5422 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM5422, C0040.m401(i5), iM5422, iM44);
                        break;
                    }
                case 42:
                    int iM516 = AbstractC0074.m516((List) unsafe.getObject(abstractC0052, j));
                    if (iM516 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM516, C0040.m401(i5), iM516, iM44);
                        break;
                    }
                case 43:
                    int iM560 = AbstractC0074.m560((List) unsafe.getObject(abstractC0052, j));
                    if (iM560 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM560, C0040.m401(i5), iM560, iM44);
                        break;
                    }
                case 44:
                    int iM518 = AbstractC0074.m518((List) unsafe.getObject(abstractC0052, j));
                    if (iM518 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM518, C0040.m401(i5), iM518, iM44);
                        break;
                    }
                case 45:
                    int iM5423 = AbstractC0074.m542((List) unsafe.getObject(abstractC0052, j));
                    if (iM5423 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM5423, C0040.m401(i5), iM5423, iM44);
                        break;
                    }
                case 46:
                    int iM5583 = AbstractC0074.m558((List) unsafe.getObject(abstractC0052, j));
                    if (iM5583 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM5583, C0040.m401(i5), iM5583, iM44);
                        break;
                    }
                case 47:
                    int iM529 = AbstractC0074.m529((List) unsafe.getObject(abstractC0052, j));
                    if (iM529 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM529, C0040.m401(i5), iM529, iM44);
                        break;
                    }
                case 48:
                    int iM554 = AbstractC0074.m554((List) unsafe.getObject(abstractC0052, j));
                    if (iM554 <= 0) {
                        break;
                    } else {
                        iM44 = AbstractC0002.m44(iM554, C0040.m401(i5), iM554, iM44);
                        break;
                    }
                case 49:
                    iM393 = AbstractC0074.m523(i5, (List) unsafe.getObject(abstractC0052, j), m381(i3));
                    iM44 += iM393;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0052, j);
                    Object objM372 = m372(i3);
                    this.f429.getClass();
                    iM393 = C0014.m235(object2, i5, objM372);
                    iM44 += iM393;
                    break;
                case 51:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m393(i5);
                        iM44 += iM393;
                        break;
                    }
                case 52:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m405(i5);
                        iM44 += iM393;
                        break;
                    }
                case 53:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m394(i5, m358(j, abstractC0052));
                        iM44 += iM393;
                        break;
                    }
                case 54:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m396(i5, m358(j, abstractC0052));
                        iM44 += iM393;
                        break;
                    }
                case 55:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m400(i5, m355(j, abstractC0052));
                        iM44 += iM393;
                        break;
                    }
                case 56:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m397(i5);
                        iM44 += iM393;
                        break;
                    }
                case 57:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m407(i5);
                        iM44 += iM393;
                        break;
                    }
                case 58:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m402(i5);
                        iM44 += iM393;
                        break;
                    }
                case 59:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC0052, j);
                        iM404 = object3 instanceof C0056 ? C0040.m404(i5, (C0056) object3) : C0040.m392(i5, (String) object3);
                        iM44 = iM404 + iM44;
                        break;
                    }
                case 60:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = AbstractC0074.m532(i5, unsafe.getObject(abstractC0052, j), m381(i3));
                        iM44 += iM393;
                        break;
                    }
                case 61:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m404(i5, (C0056) unsafe.getObject(abstractC0052, j));
                        iM44 += iM393;
                        break;
                    }
                case 62:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m409(i5, m355(j, abstractC0052));
                        iM44 += iM393;
                        break;
                    }
                case 63:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m408(i5, m355(j, abstractC0052));
                        iM44 += iM393;
                        break;
                    }
                case 64:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m399(i5);
                        iM44 += iM393;
                        break;
                    }
                case 65:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m390(i5);
                        iM44 += iM393;
                        break;
                    }
                case 66:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m403(i5, m355(j, abstractC0052));
                        iM44 += iM393;
                        break;
                    }
                case 67:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m406(i5, m358(j, abstractC0052));
                        iM44 += iM393;
                        break;
                    }
                case 68:
                    if (!m374(i5, i3, abstractC0052)) {
                        break;
                    } else {
                        iM393 = C0040.m391(i5, (AbstractC0052) unsafe.getObject(abstractC0052, j), m381(i3));
                        iM44 += iM393;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ˏᵢ */
    public final int mo301(AbstractC0052 abstractC0052) {
        return this.f428 ? m377(abstractC0052) : m376(abstractC0052);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ˑʽ */
    public final Object mo302() {
        this.f423.getClass();
        return ((AbstractC0083) this.f419).mo581(4);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final int m377(AbstractC0052 abstractC0052) {
        int iM393;
        Unsafe unsafe = f417;
        int i = 0;
        int iM44 = 0;
        while (true) {
            int[] iArr = this.f426;
            if (i >= iArr.length) {
                ((C0067) this.f422).getClass();
                return ((AbstractC0083) abstractC0052).unknownFields.m477() + iM44;
            }
            int iM386 = m386(i);
            int iM359 = m359(iM386);
            int i2 = iArr[i];
            long j = iM386 & 1048575;
            if (iM359 >= EnumC0036.f411.m354() && iM359 <= EnumC0036.f413.m354()) {
                int i3 = iArr[i + 2];
            }
            switch (iM359) {
                case 0:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m393(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 1:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m405(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 2:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m394(i2, AbstractC0029.m311(abstractC0052, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 3:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m396(i2, AbstractC0029.m311(abstractC0052, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 4:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m400(i2, AbstractC0029.m326(abstractC0052, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 5:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m397(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m407(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m402(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 8:
                    if (m382(i, abstractC0052)) {
                        Object objM315 = AbstractC0029.m315(j, abstractC0052);
                        if (!(objM315 instanceof C0056)) {
                            iM393 = C0040.m392(i2, (String) objM315);
                            break;
                        } else {
                            iM393 = C0040.m404(i2, (C0056) objM315);
                            break;
                        }
                    } else {
                        i += 3;
                    }
                case 9:
                    if (m382(i, abstractC0052)) {
                        iM393 = AbstractC0074.m532(i2, AbstractC0029.m315(j, abstractC0052), m381(i));
                        break;
                    } else {
                        i += 3;
                    }
                case 10:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m404(i2, (C0056) AbstractC0029.m315(j, abstractC0052));
                        break;
                    } else {
                        i += 3;
                    }
                case 11:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m409(i2, AbstractC0029.m326(abstractC0052, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 12:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m408(i2, AbstractC0029.m326(abstractC0052, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 13:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m399(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 14:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m390(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 15:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m403(i2, AbstractC0029.m326(abstractC0052, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 16:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m406(i2, AbstractC0029.m311(abstractC0052, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 17:
                    if (m382(i, abstractC0052)) {
                        iM393 = C0040.m391(i2, (AbstractC0052) AbstractC0029.m315(j, abstractC0052), m381(i));
                        break;
                    } else {
                        i += 3;
                    }
                case 18:
                    iM393 = AbstractC0074.m533(i2, m360(abstractC0052, j));
                    break;
                case 19:
                    iM393 = AbstractC0074.m541(i2, m360(abstractC0052, j));
                    break;
                case 20:
                    iM393 = AbstractC0074.m527(i2, m360(abstractC0052, j));
                    break;
                case 21:
                    iM393 = AbstractC0074.m559(i2, m360(abstractC0052, j));
                    break;
                case 22:
                    iM393 = AbstractC0074.m531(i2, m360(abstractC0052, j));
                    break;
                case 23:
                    iM393 = AbstractC0074.m533(i2, m360(abstractC0052, j));
                    break;
                case 24:
                    iM393 = AbstractC0074.m541(i2, m360(abstractC0052, j));
                    break;
                case 25:
                    iM393 = AbstractC0074.m540(i2, m360(abstractC0052, j));
                    break;
                case 26:
                    iM393 = AbstractC0074.m519(i2, m360(abstractC0052, j));
                    break;
                case 27:
                    iM393 = AbstractC0074.m535(i2, m360(abstractC0052, j), m381(i));
                    break;
                case 28:
                    iM393 = AbstractC0074.m534(i2, m360(abstractC0052, j));
                    break;
                case 29:
                    iM393 = AbstractC0074.m526(i2, m360(abstractC0052, j));
                    break;
                case 30:
                    iM393 = AbstractC0074.m556(i2, m360(abstractC0052, j));
                    break;
                case 31:
                    iM393 = AbstractC0074.m541(i2, m360(abstractC0052, j));
                    break;
                case 32:
                    iM393 = AbstractC0074.m533(i2, m360(abstractC0052, j));
                    break;
                case 33:
                    iM393 = AbstractC0074.m548(i2, m360(abstractC0052, j));
                    break;
                case 34:
                    iM393 = AbstractC0074.m547(i2, m360(abstractC0052, j));
                    break;
                case 35:
                    int iM558 = AbstractC0074.m558((List) unsafe.getObject(abstractC0052, j));
                    if (iM558 > 0) {
                        iM44 = AbstractC0002.m44(iM558, C0040.m401(i2), iM558, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 36:
                    int iM542 = AbstractC0074.m542((List) unsafe.getObject(abstractC0052, j));
                    if (iM542 > 0) {
                        iM44 = AbstractC0002.m44(iM542, C0040.m401(i2), iM542, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 37:
                    int iM546 = AbstractC0074.m546((List) unsafe.getObject(abstractC0052, j));
                    if (iM546 > 0) {
                        iM44 = AbstractC0002.m44(iM546, C0040.m401(i2), iM546, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 38:
                    int iM538 = AbstractC0074.m538((List) unsafe.getObject(abstractC0052, j));
                    if (iM538 > 0) {
                        iM44 = AbstractC0002.m44(iM538, C0040.m401(i2), iM538, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 39:
                    int iM524 = AbstractC0074.m524((List) unsafe.getObject(abstractC0052, j));
                    if (iM524 > 0) {
                        iM44 = AbstractC0002.m44(iM524, C0040.m401(i2), iM524, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 40:
                    int iM5582 = AbstractC0074.m558((List) unsafe.getObject(abstractC0052, j));
                    if (iM5582 > 0) {
                        iM44 = AbstractC0002.m44(iM5582, C0040.m401(i2), iM5582, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 41:
                    int iM5422 = AbstractC0074.m542((List) unsafe.getObject(abstractC0052, j));
                    if (iM5422 > 0) {
                        iM44 = AbstractC0002.m44(iM5422, C0040.m401(i2), iM5422, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 42:
                    int iM516 = AbstractC0074.m516((List) unsafe.getObject(abstractC0052, j));
                    if (iM516 > 0) {
                        iM44 = AbstractC0002.m44(iM516, C0040.m401(i2), iM516, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 43:
                    int iM560 = AbstractC0074.m560((List) unsafe.getObject(abstractC0052, j));
                    if (iM560 > 0) {
                        iM44 = AbstractC0002.m44(iM560, C0040.m401(i2), iM560, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 44:
                    int iM518 = AbstractC0074.m518((List) unsafe.getObject(abstractC0052, j));
                    if (iM518 > 0) {
                        iM44 = AbstractC0002.m44(iM518, C0040.m401(i2), iM518, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 45:
                    int iM5423 = AbstractC0074.m542((List) unsafe.getObject(abstractC0052, j));
                    if (iM5423 > 0) {
                        iM44 = AbstractC0002.m44(iM5423, C0040.m401(i2), iM5423, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 46:
                    int iM5583 = AbstractC0074.m558((List) unsafe.getObject(abstractC0052, j));
                    if (iM5583 > 0) {
                        iM44 = AbstractC0002.m44(iM5583, C0040.m401(i2), iM5583, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 47:
                    int iM529 = AbstractC0074.m529((List) unsafe.getObject(abstractC0052, j));
                    if (iM529 > 0) {
                        iM44 = AbstractC0002.m44(iM529, C0040.m401(i2), iM529, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 48:
                    int iM554 = AbstractC0074.m554((List) unsafe.getObject(abstractC0052, j));
                    if (iM554 > 0) {
                        iM44 = AbstractC0002.m44(iM554, C0040.m401(i2), iM554, iM44);
                    } else {
                        continue;
                    }
                    i += 3;
                case 49:
                    iM393 = AbstractC0074.m523(i2, m360(abstractC0052, j), m381(i));
                    break;
                case 50:
                    Object objM3152 = AbstractC0029.m315(j, abstractC0052);
                    Object objM372 = m372(i);
                    this.f429.getClass();
                    iM393 = C0014.m235(objM3152, i2, objM372);
                    break;
                case 51:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m393(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 52:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m405(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 53:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m394(i2, m358(j, abstractC0052));
                        break;
                    } else {
                        i += 3;
                    }
                case 54:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m396(i2, m358(j, abstractC0052));
                        break;
                    } else {
                        i += 3;
                    }
                case 55:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m400(i2, m355(j, abstractC0052));
                        break;
                    } else {
                        i += 3;
                    }
                case 56:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m397(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 57:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m407(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 58:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m402(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 59:
                    if (m374(i2, i, abstractC0052)) {
                        Object objM3153 = AbstractC0029.m315(j, abstractC0052);
                        if (!(objM3153 instanceof C0056)) {
                            iM393 = C0040.m392(i2, (String) objM3153);
                            break;
                        } else {
                            iM393 = C0040.m404(i2, (C0056) objM3153);
                            break;
                        }
                    } else {
                        i += 3;
                    }
                case 60:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = AbstractC0074.m532(i2, AbstractC0029.m315(j, abstractC0052), m381(i));
                        break;
                    } else {
                        i += 3;
                    }
                case 61:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m404(i2, (C0056) AbstractC0029.m315(j, abstractC0052));
                        break;
                    } else {
                        i += 3;
                    }
                case 62:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m409(i2, m355(j, abstractC0052));
                        break;
                    } else {
                        i += 3;
                    }
                case 63:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m408(i2, m355(j, abstractC0052));
                        break;
                    } else {
                        i += 3;
                    }
                case 64:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m399(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 65:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m390(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 66:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m403(i2, m355(j, abstractC0052));
                        break;
                    } else {
                        i += 3;
                    }
                case 67:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m406(i2, m358(j, abstractC0052));
                        break;
                    } else {
                        i += 3;
                    }
                case 68:
                    if (m374(i2, i, abstractC0052)) {
                        iM393 = C0040.m391(i2, (AbstractC0052) AbstractC0029.m315(j, abstractC0052), m381(i));
                        break;
                    } else {
                        i += 3;
                    }
                default:
                    i += 3;
            }
            iM44 = iM393 + iM44;
            i += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0140 A[SYNTHETIC] */
    /* renamed from: ˑﾞ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m378(androidx.datastore.preferences.protobuf.C0030 r23, int r24, java.lang.Object r25, int r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0037.m378(androidx.datastore.preferences.protobuf.ˋˉ, int, java.lang.Object, int):void");
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m379(int i, int i2, Object obj) {
        AbstractC0029.m319(this.f426[i2 + 2] & 1048575, obj, i);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ـﹶ */
    public final void mo303(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.f431;
        while (true) {
            iArr = this.f424;
            i = this.f420;
            if (i2 >= i) {
                break;
            }
            long jM386 = m386(iArr[i2]) & 1048575;
            Object objM494 = AbstractC0029.f392.m494(jM386, obj);
            if (objM494 != null) {
                this.f429.getClass();
                ((C0085) objM494).f520 = false;
                AbstractC0029.m314(jM386, obj, objM494);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.f421.mo289(iArr[i], obj);
            i++;
        }
        ((C0067) this.f422).getClass();
        ((AbstractC0083) obj).unknownFields.f460 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0217, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ٴˎ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo304(androidx.datastore.preferences.protobuf.AbstractC0083 r12) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0037.mo304(androidx.datastore.preferences.protobuf.ﾞˊ):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ᐧʻ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo305(androidx.datastore.preferences.protobuf.AbstractC0083 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0037.mo305(androidx.datastore.preferences.protobuf.ﾞˊ, java.lang.Object):boolean");
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m380(Object obj, int i, InterfaceC0017 interfaceC0017, InterfaceC0025 interfaceC0025, C0062 c0062) {
        interfaceC0017.mo264(this.f421.mo288(i & 1048575, obj), interfaceC0025, c0062);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final InterfaceC0025 m381(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f418;
        InterfaceC0025 interfaceC0025 = (InterfaceC0025) objArr[i2];
        if (interfaceC0025 != null) {
            return interfaceC0025;
        }
        InterfaceC0025 interfaceC0025M308 = C0028.f387.m308((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC0025M308;
        return interfaceC0025M308;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final boolean m382(int i, Object obj) {
        if (!this.f428) {
            int i2 = this.f426[i + 2];
            return (AbstractC0029.f392.m492((long) (i2 & 1048575), obj) & (1 << (i2 >>> 20))) != 0;
        }
        int iM386 = m386(i);
        long j = iM386 & 1048575;
        switch (m359(iM386)) {
            case 0:
                return AbstractC0029.f392.mo224(j, obj) != 0.0d;
            case 1:
                return AbstractC0029.f392.mo229(j, obj) != 0.0f;
            case 2:
                return AbstractC0029.f392.m489(j, obj) != 0;
            case 3:
                return AbstractC0029.f392.m489(j, obj) != 0;
            case 4:
                return AbstractC0029.f392.m492(j, obj) != 0;
            case 5:
                return AbstractC0029.f392.m489(j, obj) != 0;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return AbstractC0029.f392.m492(j, obj) != 0;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return AbstractC0029.f392.mo228(j, obj);
            case 8:
                Object objM494 = AbstractC0029.f392.m494(j, obj);
                if (objM494 instanceof String) {
                    return !((String) objM494).isEmpty();
                }
                if (objM494 instanceof C0056) {
                    return !C0056.f467.equals(objM494);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC0029.f392.m494(j, obj) != null;
            case 10:
                return !C0056.f467.equals(AbstractC0029.f392.m494(j, obj));
            case 11:
                return AbstractC0029.f392.m492(j, obj) != 0;
            case 12:
                return AbstractC0029.f392.m492(j, obj) != 0;
            case 13:
                return AbstractC0029.f392.m492(j, obj) != 0;
            case 14:
                return AbstractC0029.f392.m489(j, obj) != 0;
            case 15:
                return AbstractC0029.f392.m492(j, obj) != 0;
            case 16:
                return AbstractC0029.f392.m489(j, obj) != 0;
            case 17:
                return AbstractC0029.f392.m494(j, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m383(Object obj, int i, InterfaceC0017 interfaceC0017) {
        boolean z = (536870912 & i) != 0;
        AbstractC0020 abstractC0020 = this.f421;
        if (z) {
            interfaceC0017.mo250(abstractC0020.mo288(i & 1048575, obj));
        } else {
            interfaceC0017.mo268(abstractC0020.mo288(i & 1048575, obj));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x05ee A[Catch: all -> 0x024a, TryCatch #2 {all -> 0x024a, blocks: (B:132:0x05e9, B:134:0x05ee, B:136:0x05f5, B:138:0x05fc, B:73:0x0245, B:76:0x024d, B:77:0x025d, B:78:0x026d, B:79:0x027d, B:80:0x028d, B:81:0x02a3, B:82:0x02b3, B:83:0x02c3, B:84:0x02d3, B:85:0x02e3, B:86:0x02f3, B:87:0x0303, B:88:0x0313, B:89:0x0323, B:90:0x0333, B:91:0x0343, B:92:0x0353, B:93:0x0363, B:94:0x0373, B:95:0x0389, B:96:0x0399, B:97:0x03a9, B:98:0x03bd, B:99:0x03c5, B:100:0x03d5, B:101:0x03e5, B:102:0x03f5, B:103:0x0405, B:104:0x0415, B:105:0x0425, B:106:0x0435, B:107:0x0445, B:109:0x044e, B:110:0x046b, B:111:0x047f, B:112:0x0492, B:113:0x04a5, B:114:0x04b8, B:115:0x04cb, B:116:0x04e1, B:117:0x04f4, B:118:0x0507, B:120:0x0510, B:121:0x052d, B:122:0x0541, B:123:0x054c, B:124:0x0561, B:125:0x0574, B:126:0x0587, B:127:0x059a, B:128:0x05ad, B:129:0x05bf, B:130:0x05d3), top: B:158:0x05e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0602 A[SYNTHETIC] */
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m384(androidx.datastore.preferences.protobuf.AbstractC0055 r18, java.lang.Object r19, androidx.datastore.preferences.protobuf.InterfaceC0017 r20, androidx.datastore.preferences.protobuf.C0062 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0037.m384(androidx.datastore.preferences.protobuf.ٴﹶ, java.lang.Object, androidx.datastore.preferences.protobuf.ʿˊ, androidx.datastore.preferences.protobuf.ᴵʿ):void");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ﹳﹳ */
    public final void mo306(Object obj, InterfaceC0017 interfaceC0017, C0062 c0062) throws Throwable {
        c0062.getClass();
        m384(this.f422, obj, interfaceC0017, c0062);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0025
    /* renamed from: ﹶˆ */
    public final void mo307(AbstractC0083 abstractC0083, AbstractC0083 abstractC00832) {
        abstractC00832.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f426;
            if (i >= iArr.length) {
                if (this.f428) {
                    return;
                }
                AbstractC0074.m544(this.f422, abstractC0083, abstractC00832);
                return;
            }
            int iM386 = m386(i);
            long j = 1048575 & iM386;
            int i2 = iArr[i];
            switch (m359(iM386)) {
                case 0:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0057 abstractC0057 = AbstractC0029.f392;
                        abstractC0057.mo226(abstractC0083, j, abstractC0057.mo224(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 1:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0057 abstractC00572 = AbstractC0029.f392;
                        abstractC00572.mo230(abstractC0083, j, abstractC00572.mo229(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 2:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m324(abstractC0083, j, AbstractC0029.f392.m489(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 3:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m324(abstractC0083, j, AbstractC0029.f392.m489(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 4:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m319(j, abstractC0083, AbstractC0029.f392.m492(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 5:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m324(abstractC0083, j, AbstractC0029.f392.m489(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m319(j, abstractC0083, AbstractC0029.f392.m492(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0057 abstractC00573 = AbstractC0029.f392;
                        abstractC00573.mo227(abstractC0083, j, abstractC00573.mo228(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 8:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m314(j, abstractC0083, AbstractC0029.f392.m494(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 9:
                    m371(abstractC0083, abstractC00832, i);
                    break;
                case 10:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m314(j, abstractC0083, AbstractC0029.f392.m494(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 11:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m319(j, abstractC0083, AbstractC0029.f392.m492(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 12:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m319(j, abstractC0083, AbstractC0029.f392.m492(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 13:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m319(j, abstractC0083, AbstractC0029.f392.m492(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 14:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m324(abstractC0083, j, AbstractC0029.f392.m489(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 15:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m319(j, abstractC0083, AbstractC0029.f392.m492(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 16:
                    if (!m382(i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m324(abstractC0083, j, AbstractC0029.f392.m489(j, abstractC00832));
                        m370(i, abstractC0083);
                        break;
                    }
                case 17:
                    m371(abstractC0083, abstractC00832, i);
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
                    this.f421.mo287(abstractC0083, abstractC00832, j);
                    break;
                case 50:
                    Class cls = AbstractC0074.f500;
                    AbstractC0057 abstractC00574 = AbstractC0029.f392;
                    Object objM494 = abstractC00574.m494(j, abstractC0083);
                    Object objM4942 = abstractC00574.m494(j, abstractC00832);
                    this.f429.getClass();
                    AbstractC0029.m314(j, abstractC0083, C0014.m234(objM494, objM4942));
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
                    if (!m374(i2, i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m314(j, abstractC0083, AbstractC0029.f392.m494(j, abstractC00832));
                        m379(i2, i, abstractC0083);
                        break;
                    }
                case 60:
                    m385(abstractC0083, abstractC00832, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m374(i2, i, abstractC00832)) {
                        break;
                    } else {
                        AbstractC0029.m314(j, abstractC0083, AbstractC0029.f392.m494(j, abstractC00832));
                        m379(i2, i, abstractC0083);
                        break;
                    }
                case 68:
                    m385(abstractC0083, abstractC00832, i);
                    break;
            }
            i += 3;
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m385(AbstractC0083 abstractC0083, AbstractC0083 abstractC00832, int i) {
        int iM386 = m386(i);
        int i2 = this.f426[i];
        long j = iM386 & 1048575;
        if (m374(i2, i, abstractC00832)) {
            AbstractC0057 abstractC0057 = AbstractC0029.f392;
            Object objM494 = abstractC0057.m494(j, abstractC0083);
            Object objM4942 = abstractC0057.m494(j, abstractC00832);
            if (objM494 != null && objM4942 != null) {
                AbstractC0029.m314(j, abstractC0083, AbstractC0077.m564(objM494, objM4942));
                m379(i2, i, abstractC0083);
            } else if (objM4942 != null) {
                AbstractC0029.m314(j, abstractC0083, objM4942);
                m379(i2, i, abstractC0083);
            }
        }
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final int m386(int i) {
        return this.f426[i + 1];
    }
}
