package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.AbstractC0002;
import androidx.datastore.preferences.protobuf.AbstractC0080;
import com.google.android.gms.internal.play_billing.C0654;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import p334.C3789;
import p395.AbstractC4535;
import sun.misc.Unsafe;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0744 implements InterfaceC0727 {

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final int[] f3569 = new int[0];

    /* renamed from: ˑי, reason: contains not printable characters */
    public static final Unsafe f3570 = AbstractC0768.m3186();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object[] f3571;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC0758 f3572;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int f3573;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final AbstractC0775 f3574;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final AbstractC0777 f3575;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C0721 f3576;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int[] f3577;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f3578;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int[] f3579;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f3580;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f3581;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C0787 f3582;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f3583;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int f3584;

    public C0744(int[] iArr, Object[] objArr, int i, int i2, AbstractC0758 abstractC0758, boolean z, int[] iArr2, int i3, int i4, C0721 c0721, AbstractC0775 abstractC0775, AbstractC0777 abstractC0777, C0751 c0751, C0787 c0787) {
        this.f3579 = iArr;
        this.f3571 = objArr;
        this.f3578 = i;
        this.f3583 = i2;
        this.f3580 = abstractC0758 instanceof AbstractC0785;
        this.f3581 = z;
        this.f3577 = iArr2;
        this.f3584 = i3;
        this.f3573 = i4;
        this.f3576 = c0721;
        this.f3574 = abstractC0775;
        this.f3575 = abstractC0777;
        this.f3572 = abstractC0758;
        this.f3582 = c0787;
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static void m3060(int i, Object obj, C0756 c0756) throws CodedOutputStream$OutOfSpaceException {
        if (!(obj instanceof String)) {
            c0756.m3137(i, (AbstractC0748) obj);
            return;
        }
        String str = (String) obj;
        C0735 c0735 = (C0735) c0756.f3598;
        c0735.m3038(i, 2);
        int i2 = c0735.f3548;
        try {
            int iM3035 = C0735.m3035(str.length() * 3);
            int iM30352 = C0735.m3035(str.length());
            byte[] bArr = c0735.f3549;
            int i3 = c0735.f3550;
            if (iM30352 == iM3035) {
                int i4 = i2 + iM30352;
                c0735.f3548 = i4;
                int iMo31 = AbstractC0778.f3639.mo31(str, bArr, i4, i3 - i4);
                c0735.f3548 = i2;
                c0735.m3045((iMo31 - i2) - iM30352);
                c0735.f3548 = iMo31;
            } else {
                c0735.m3045(AbstractC0778.m3216(str));
                int i5 = c0735.f3548;
                c0735.f3548 = AbstractC0778.f3639.mo31(str, bArr, i5, i3 - i5);
            }
        } catch (C0750 e) {
            c0735.f3548 = i2;
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

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static C0744 m3061(C0767 c0767, C0721 c0721, AbstractC0775 abstractC0775, AbstractC0777 abstractC0777, C0751 c0751, C0787 c0787) {
        if (c0767 instanceof C0767) {
            return m3066(c0767, c0721, abstractC0775, abstractC0777, c0751, c0787);
        }
        c0767.getClass();
        throw new ClassCastException();
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static int m3062(long j, Object obj) {
        return ((Integer) AbstractC0768.f3622.m3211(j, obj)).intValue();
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static void m3063(Object obj) {
        if (m3070(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static int m3064(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static List m3065(AbstractC0785 abstractC0785, long j) {
        return (List) AbstractC0768.f3622.m3211(j, abstractC0785);
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C0744 m3066(C0767 c0767, C0721 c0721, AbstractC0775 abstractC0775, AbstractC0777 abstractC0777, C0751 c0751, C0787 c0787) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        char cCharAt5;
        int i10;
        char cCharAt6;
        int i11;
        char cCharAt7;
        int i12;
        char cCharAt8;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        int i19;
        int i20;
        int iObjectFieldOffset2;
        int i21;
        Field fieldM3067;
        char cCharAt9;
        int i22;
        int i23;
        Field fieldM30672;
        Field fieldM30673;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        int i28 = 0;
        boolean z = c0767.m3179() == 2;
        String strM3177 = c0767.m3177();
        int length = strM3177.length();
        if (strM3177.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (strM3177.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int iCharAt4 = strM3177.charAt(i);
        if (iCharAt4 >= 55296) {
            int i31 = iCharAt4 & 8191;
            int i32 = 13;
            while (true) {
                i27 = i30 + 1;
                cCharAt13 = strM3177.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i27;
            }
            iCharAt4 = i31 | (cCharAt13 << i32);
            i30 = i27;
        }
        if (iCharAt4 == 0) {
            iArr = f3569;
            i3 = 0;
            i4 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i2 = 0;
            iCharAt3 = 0;
        } else {
            int i33 = i30 + 1;
            int iCharAt5 = strM3177.charAt(i30);
            if (iCharAt5 >= 55296) {
                int i34 = iCharAt5 & 8191;
                int i35 = 13;
                while (true) {
                    i12 = i33 + 1;
                    cCharAt8 = strM3177.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i12;
                }
                iCharAt5 = i34 | (cCharAt8 << i35);
                i33 = i12;
            }
            int i36 = i33 + 1;
            int iCharAt6 = strM3177.charAt(i33);
            if (iCharAt6 >= 55296) {
                int i37 = iCharAt6 & 8191;
                int i38 = 13;
                while (true) {
                    i11 = i36 + 1;
                    cCharAt7 = strM3177.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i11;
                }
                iCharAt6 = i37 | (cCharAt7 << i38);
                i36 = i11;
            }
            int i39 = i36 + 1;
            int iCharAt7 = strM3177.charAt(i36);
            if (iCharAt7 >= 55296) {
                int i40 = iCharAt7 & 8191;
                int i41 = 13;
                while (true) {
                    i10 = i39 + 1;
                    cCharAt6 = strM3177.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i10;
                }
                iCharAt7 = i40 | (cCharAt6 << i41);
                i39 = i10;
            }
            int i42 = i39 + 1;
            iCharAt = strM3177.charAt(i39);
            if (iCharAt >= 55296) {
                int i43 = iCharAt & 8191;
                int i44 = 13;
                while (true) {
                    i9 = i42 + 1;
                    cCharAt5 = strM3177.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i9;
                }
                iCharAt = i43 | (cCharAt5 << i44);
                i42 = i9;
            }
            int i45 = i42 + 1;
            int iCharAt8 = strM3177.charAt(i42);
            if (iCharAt8 >= 55296) {
                int i46 = iCharAt8 & 8191;
                int i47 = 13;
                while (true) {
                    i8 = i45 + 1;
                    cCharAt4 = strM3177.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i8;
                }
                iCharAt8 = i46 | (cCharAt4 << i47);
                i45 = i8;
            }
            int i48 = i45 + 1;
            iCharAt2 = strM3177.charAt(i45);
            if (iCharAt2 >= 55296) {
                int i49 = iCharAt2 & 8191;
                int i50 = 13;
                while (true) {
                    i7 = i48 + 1;
                    cCharAt3 = strM3177.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i7;
                }
                iCharAt2 = i49 | (cCharAt3 << i50);
                i48 = i7;
            }
            int i51 = i48 + 1;
            int iCharAt9 = strM3177.charAt(i48);
            if (iCharAt9 >= 55296) {
                int i52 = iCharAt9 & 8191;
                int i53 = 13;
                while (true) {
                    i6 = i51 + 1;
                    cCharAt2 = strM3177.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i6;
                }
                iCharAt9 = i52 | (cCharAt2 << i53);
                i51 = i6;
            }
            int i54 = i51 + 1;
            iCharAt3 = strM3177.charAt(i51);
            if (iCharAt3 >= 55296) {
                int i55 = iCharAt3 & 8191;
                int i56 = i54;
                int i57 = 13;
                while (true) {
                    i5 = i56 + 1;
                    cCharAt = strM3177.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i55 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i56 = i5;
                }
                iCharAt3 = i55 | (cCharAt << i57);
                i54 = i5;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt9];
            i2 = (iCharAt5 * 2) + iCharAt6;
            i3 = iCharAt7;
            i4 = iCharAt8;
            iArr = iArr2;
            i28 = iCharAt5;
            i30 = i54;
        }
        Unsafe unsafe = f3570;
        Object[] objArrM3176 = c0767.m3176();
        Class<?> cls = c0767.m3178().getClass();
        int[] iArr3 = new int[i4 * 3];
        Object[] objArr = new Object[i4 * 2];
        int i58 = iCharAt2 + iCharAt3;
        int i59 = i58;
        int i60 = iCharAt3;
        int i61 = 0;
        int i62 = 0;
        while (i30 < length) {
            int i63 = i30 + 1;
            int iCharAt10 = strM3177.charAt(i30);
            if (iCharAt10 >= 55296) {
                int i64 = iCharAt10 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i26 = i65 + 1;
                    cCharAt12 = strM3177.charAt(i65);
                    i13 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt12 & 8191) << i66;
                    i66 += 13;
                    i65 = i26;
                    length = i13;
                }
                iCharAt10 = i64 | (cCharAt12 << i66);
                i14 = i26;
            } else {
                i13 = length;
                i14 = i63;
            }
            int i67 = i14 + 1;
            int iCharAt11 = strM3177.charAt(i14);
            if (iCharAt11 >= 55296) {
                int i68 = iCharAt11 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i25 = i69 + 1;
                    cCharAt11 = strM3177.charAt(i69);
                    i15 = i58;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i68 |= (cCharAt11 & 8191) << i70;
                    i70 += 13;
                    i69 = i25;
                    i58 = i15;
                }
                iCharAt11 = i68 | (cCharAt11 << i70);
                i16 = i25;
            } else {
                i15 = i58;
                i16 = i67;
            }
            int i71 = iCharAt11 & 255;
            int i72 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i61] = i62;
                i61++;
            }
            if (i71 >= 51) {
                int i73 = i16 + 1;
                int iCharAt12 = strM3177.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i74 = iCharAt12 & 8191;
                    int i75 = i73;
                    int i76 = 13;
                    while (true) {
                        i24 = i75 + 1;
                        cCharAt10 = strM3177.charAt(i75);
                        i17 = iCharAt;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i74 |= (cCharAt10 & 8191) << i76;
                        i76 += 13;
                        i75 = i24;
                        iCharAt = i17;
                    }
                    iCharAt12 = i74 | (cCharAt10 << i76);
                    i23 = i24;
                } else {
                    i17 = iCharAt;
                    i23 = i73;
                }
                int i77 = i71 - 51;
                int i78 = i23;
                if (i77 == 9 || i77 == 17) {
                    objArr[((i62 / 3) * 2) + 1] = objArrM3176[i2];
                    i2++;
                } else if (i77 == 12 && !z) {
                    objArr[((i62 / 3) * 2) + 1] = objArrM3176[i2];
                    i2++;
                }
                int i79 = iCharAt12 * 2;
                Object obj = objArrM3176[i79];
                if (obj instanceof Field) {
                    fieldM30672 = (Field) obj;
                } else {
                    fieldM30672 = m3067((String) obj, cls);
                    objArrM3176[i79] = fieldM30672;
                }
                int i80 = i2;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM30672);
                int i81 = i79 + 1;
                Object obj2 = objArrM3176[i81];
                if (obj2 instanceof Field) {
                    fieldM30673 = (Field) obj2;
                } else {
                    fieldM30673 = m3067((String) obj2, cls);
                    objArrM3176[i81] = fieldM30673;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM30673);
                i20 = 0;
                i18 = i3;
                i21 = i80;
                i19 = i78;
            } else {
                i17 = iCharAt;
                int i82 = i2 + 1;
                Field fieldM30674 = m3067((String) objArrM3176[i2], cls);
                i18 = i3;
                if (i71 == 9 || i71 == 17) {
                    objArr[((i62 / 3) * 2) + 1] = fieldM30674.getType();
                } else {
                    if (i71 == 27 || i71 == 49) {
                        i22 = i2 + 2;
                        objArr[((i62 / 3) * 2) + 1] = objArrM3176[i82];
                    } else if (i71 == 12 || i71 == 30 || i71 == 44) {
                        if (!z) {
                            i22 = i2 + 2;
                            objArr[((i62 / 3) * 2) + 1] = objArrM3176[i82];
                        }
                    } else if (i71 == 50) {
                        int i83 = i60 + 1;
                        iArr[i60] = i62;
                        int i84 = (i62 / 3) * 2;
                        int i85 = i2 + 2;
                        objArr[i84] = objArrM3176[i82];
                        if ((iCharAt11 & 2048) != 0) {
                            i82 = i2 + 3;
                            objArr[i84 + 1] = objArrM3176[i85];
                            i60 = i83;
                        } else {
                            i60 = i83;
                            i82 = i85;
                        }
                    }
                    i82 = i22;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM30674);
                if ((iCharAt11 & 4096) != 4096 || i71 > 17) {
                    iObjectFieldOffset = 1048575;
                    i19 = i16;
                    i20 = 0;
                } else {
                    int i86 = i16 + 1;
                    int iCharAt13 = strM3177.charAt(i16);
                    if (iCharAt13 >= 55296) {
                        int i87 = iCharAt13 & 8191;
                        int i88 = 13;
                        while (true) {
                            i19 = i86 + 1;
                            cCharAt9 = strM3177.charAt(i86);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i87 |= (cCharAt9 & 8191) << i88;
                            i88 += 13;
                            i86 = i19;
                        }
                        iCharAt13 = i87 | (cCharAt9 << i88);
                    } else {
                        i19 = i86;
                    }
                    int i89 = (iCharAt13 / 32) + (i28 * 2);
                    Object obj3 = objArrM3176[i89];
                    if (obj3 instanceof Field) {
                        fieldM3067 = (Field) obj3;
                    } else {
                        fieldM3067 = m3067((String) obj3, cls);
                        objArrM3176[i89] = fieldM3067;
                    }
                    i20 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM3067);
                }
                if (i71 >= 18 && i71 <= 49) {
                    iArr[i59] = iObjectFieldOffset3;
                    i59++;
                }
                int i90 = i82;
                iObjectFieldOffset2 = iObjectFieldOffset3;
                i21 = i90;
            }
            int i91 = i62 + 1;
            iArr3[i62] = iCharAt10;
            int i92 = i62 + 2;
            String str = strM3177;
            iArr3[i91] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i71 << 20) | iObjectFieldOffset2;
            i62 += 3;
            iArr3[i92] = (i20 << 20) | iObjectFieldOffset;
            i2 = i21;
            iCharAt3 = i72;
            strM3177 = str;
            i3 = i18;
            length = i13;
            i58 = i15;
            i30 = i19;
            iCharAt = i17;
        }
        return new C0744(iArr3, objArr, i3, iCharAt, c0767.m3178(), z, iArr, iCharAt3, i58, c0721, abstractC0775, abstractC0777, c0751, c0787);
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static Field m3067(String str, Class cls) {
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

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static long m3068(int i) {
        return i & 1048575;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static long m3069(long j, Object obj) {
        return ((Long) AbstractC0768.f3622.m3211(j, obj)).longValue();
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static boolean m3070(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0785) {
            return ((AbstractC0785) obj).m3244();
        }
        return true;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m3071(int i, int i2, Object obj) {
        AbstractC0768.m3199(this.f3579[i2 + 2] & 1048575, obj, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ʽᐧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2934(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C0744.mo2934(java.lang.Object):boolean");
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final void m3072(Object obj, long j, C0746 c0746, InterfaceC0727 interfaceC0727, C0747 c0747) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo455;
        List listMo2951 = this.f3574.mo2951(j, obj);
        int i = c0746.f3586;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.m2923();
        }
        do {
            Object objMo2938 = interfaceC0727.mo2938();
            c0746.m3105(objMo2938, interfaceC0727, c0747);
            interfaceC0727.mo2939(objMo2938);
            listMo2951.add(objMo2938);
            AbstractC0080 abstractC0080 = c0746.f3588;
            if (abstractC0080.mo454() || c0746.f3589 != 0) {
                return;
            } else {
                iMo455 = abstractC0080.mo455();
            }
        } while (iMo455 == i);
        c0746.f3589 = iMo455;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ʿʼ */
    public final void mo2935(Object obj, Object obj2) {
        m3063(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f3579;
            if (i >= iArr.length) {
                AbstractC0734.m2996(this.f3575, obj, obj2);
                return;
            }
            int iM3077 = m3077(i);
            long j = 1048575 & iM3077;
            int i2 = iArr[i];
            switch (m3064(iM3077)) {
                case 0:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3187(obj, j, AbstractC0768.f3622.mo3154(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 1:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3197(obj, j, AbstractC0768.f3622.mo3160(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 2:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3182(obj, j, AbstractC0768.f3622.m3206(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 3:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3182(obj, j, AbstractC0768.f3622.m3206(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 4:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3199(j, obj, AbstractC0768.f3622.m3209(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 5:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3182(obj, j, AbstractC0768.f3622.m3206(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3199(j, obj, AbstractC0768.f3622.m3209(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3196(obj, j, AbstractC0768.f3622.mo3159(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 8:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3185(j, obj, AbstractC0768.f3622.m3211(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 9:
                    m3084(obj, i, obj2);
                    break;
                case 10:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3185(j, obj, AbstractC0768.f3622.m3211(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 11:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3199(j, obj, AbstractC0768.f3622.m3209(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 12:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3199(j, obj, AbstractC0768.f3622.m3209(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 13:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3199(j, obj, AbstractC0768.f3622.m3209(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 14:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3182(obj, j, AbstractC0768.f3622.m3206(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 15:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3199(j, obj, AbstractC0768.f3622.m3209(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 16:
                    if (!m3090(i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3182(obj, j, AbstractC0768.f3622.m3206(j, obj2));
                        m3094(i, obj);
                        break;
                    }
                case 17:
                    m3084(obj, i, obj2);
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
                    this.f3574.mo2950(j, obj, obj2);
                    break;
                case 50:
                    Class cls = AbstractC0734.f3543;
                    AbstractC0771 abstractC0771 = AbstractC0768.f3622;
                    Object objM3211 = abstractC0771.m3211(j, obj);
                    Object objM32112 = abstractC0771.m3211(j, obj2);
                    this.f3582.getClass();
                    AbstractC0768.m3185(j, obj, C0787.m3255(objM3211, objM32112));
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
                    if (!m3073(i2, i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3185(j, obj, AbstractC0768.f3622.m3211(j, obj2));
                        m3071(i2, i, obj);
                        break;
                    }
                case 60:
                    m3096(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m3073(i2, i, obj2)) {
                        break;
                    } else {
                        AbstractC0768.m3185(j, obj, AbstractC0768.f3622.m3211(j, obj2));
                        m3071(i2, i, obj);
                        break;
                    }
                case 68:
                    m3096(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final boolean m3073(int i, int i2, Object obj) {
        return AbstractC0768.f3622.m3209((long) (this.f3579[i2 + 2] & 1048575), obj) == i;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final Object m3074(int i, Object obj) {
        InterfaceC0727 interfaceC0727M3081 = m3081(i);
        long jM3077 = m3077(i) & 1048575;
        if (!m3090(i, obj)) {
            return interfaceC0727M3081.mo2938();
        }
        Object object = f3570.getObject(obj, jM3077);
        if (m3070(object)) {
            return object;
        }
        Object objMo2938 = interfaceC0727M3081.mo2938();
        if (object != null) {
            interfaceC0727M3081.mo2935(objMo2938, object);
        }
        return objMo2938;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0217, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ˉי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo2936(com.google.crypto.tink.shaded.protobuf.AbstractC0785 r12) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C0744.mo2936(com.google.crypto.tink.shaded.protobuf.ﾞˊ):int");
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int m3075(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C0654 c0654) throws InvalidProtocolBufferException {
        Unsafe unsafe = f3570;
        long j2 = this.f3579[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(AbstractC4535.m10338(i, bArr)));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(AbstractC4535.m10359(i, bArr)));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int iM10328 = AbstractC4535.m10328(bArr, i, c0654);
                    unsafe.putObject(obj, j, Long.valueOf(c0654.f3059));
                    unsafe.putInt(obj, j2, i4);
                    return iM10328;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int iM10374 = AbstractC4535.m10374(bArr, i, c0654);
                    unsafe.putObject(obj, j, Integer.valueOf(c0654.f3061));
                    unsafe.putInt(obj, j2, i4);
                    return iM10374;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC4535.m10375(i, bArr)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC4535.m10340(i, bArr)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int iM103282 = AbstractC4535.m10328(bArr, i, c0654);
                    unsafe.putObject(obj, j, Boolean.valueOf(c0654.f3059 != 0));
                    unsafe.putInt(obj, j2, i4);
                    return iM103282;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int iM103742 = AbstractC4535.m10374(bArr, i, c0654);
                    int i13 = c0654.f3061;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !AbstractC0778.m3217(bArr, iM103742, iM103742 + i13)) {
                            throw InvalidProtocolBufferException.m2921();
                        }
                        unsafe.putObject(obj, j, new String(bArr, iM103742, i13, AbstractC0731.f3531));
                        iM103742 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iM103742;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object objM3086 = m3086(i4, i8, obj);
                    int iM10348 = AbstractC4535.m10348(objM3086, m3081(i8), bArr, i, i2, c0654);
                    m3100(obj, i4, objM3086, i8);
                    return iM10348;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int iM10356 = AbstractC4535.m10356(bArr, i, c0654);
                    unsafe.putObject(obj, j, c0654.f3060);
                    unsafe.putInt(obj, j2, i4);
                    return iM10356;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int iM103743 = AbstractC4535.m10374(bArr, i, c0654);
                    int i14 = c0654.f3061;
                    m3088(i8);
                    unsafe.putObject(obj, j, Integer.valueOf(i14));
                    unsafe.putInt(obj, j2, i4);
                    return iM103743;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int iM103744 = AbstractC4535.m10374(bArr, i, c0654);
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC0080.m568(c0654.f3061)));
                    unsafe.putInt(obj, j2, i4);
                    return iM103744;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int iM103283 = AbstractC4535.m10328(bArr, i, c0654);
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC0080.m566(c0654.f3059)));
                    unsafe.putInt(obj, j2, i4);
                    return iM103283;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object objM30862 = m3086(i4, i8, obj);
                    int iM10386 = AbstractC4535.m10386(objM30862, m3081(i8), bArr, i, i2, (i3 & (-8)) | 4, c0654);
                    m3100(obj, i4, objM30862, i8);
                    return iM10386;
                }
                break;
        }
        return i;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m3076(Object obj, int i, Object obj2) {
        int i2 = this.f3579[i];
        if (AbstractC0768.f3622.m3211(m3077(i) & 1048575, obj) == null) {
            return;
        }
        m3088(i);
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final int m3077(int i) {
        return this.f3579[i + 1];
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int m3078(AbstractC0785 abstractC0785) {
        int iM3026;
        Unsafe unsafe = f3570;
        int i = 0;
        int iM36 = 0;
        while (true) {
            int[] iArr = this.f3579;
            if (i >= iArr.length) {
                ((C0755) this.f3575).getClass();
                return abstractC0785.unknownFields.m3055() + iM36;
            }
            int iM3077 = m3077(i);
            int iM3064 = m3064(iM3077);
            int i2 = iArr[i];
            long j = iM3077 & 1048575;
            if (iM3064 >= EnumC0743.f3564.m3059() && iM3064 <= EnumC0743.f3566.m3059()) {
                int i3 = iArr[i + 2];
            }
            switch (iM3064) {
                case 0:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3026(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 1:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3019(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 2:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3015(i2, AbstractC0768.m3188(abstractC0785, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 3:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3018(i2, AbstractC0768.m3188(abstractC0785, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 4:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3028(i2, AbstractC0768.m3183(abstractC0785, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 5:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3034(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3032(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3027(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 8:
                    if (m3090(i, abstractC0785)) {
                        Object objM3184 = AbstractC0768.m3184(abstractC0785, j);
                        if (!(objM3184 instanceof AbstractC0748)) {
                            iM3026 = C0735.m3031(i2, (String) objM3184);
                            break;
                        } else {
                            iM3026 = C0735.m3016(i2, (AbstractC0748) objM3184);
                            break;
                        }
                    } else {
                        i += 3;
                    }
                case 9:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = AbstractC0734.m2984(i2, AbstractC0768.m3184(abstractC0785, j), m3081(i));
                        break;
                    } else {
                        i += 3;
                    }
                case 10:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3016(i2, (AbstractC0748) AbstractC0768.m3184(abstractC0785, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 11:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3029(i2, AbstractC0768.m3183(abstractC0785, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 12:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3017(i2, AbstractC0768.m3183(abstractC0785, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 13:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3024(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 14:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3023(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 15:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3033(i2, AbstractC0768.m3183(abstractC0785, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 16:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3022(i2, AbstractC0768.m3188(abstractC0785, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 17:
                    if (m3090(i, abstractC0785)) {
                        iM3026 = C0735.m3025(i2, (AbstractC0758) AbstractC0768.m3184(abstractC0785, j), m3081(i));
                        break;
                    } else {
                        i += 3;
                    }
                case 18:
                    iM3026 = AbstractC0734.m2985(i2, m3065(abstractC0785, j));
                    break;
                case 19:
                    iM3026 = AbstractC0734.m2993(i2, m3065(abstractC0785, j));
                    break;
                case 20:
                    iM3026 = AbstractC0734.m2979(i2, m3065(abstractC0785, j));
                    break;
                case 21:
                    iM3026 = AbstractC0734.m3011(i2, m3065(abstractC0785, j));
                    break;
                case 22:
                    iM3026 = AbstractC0734.m2983(i2, m3065(abstractC0785, j));
                    break;
                case 23:
                    iM3026 = AbstractC0734.m2985(i2, m3065(abstractC0785, j));
                    break;
                case 24:
                    iM3026 = AbstractC0734.m2993(i2, m3065(abstractC0785, j));
                    break;
                case 25:
                    iM3026 = AbstractC0734.m2992(i2, m3065(abstractC0785, j));
                    break;
                case 26:
                    iM3026 = AbstractC0734.m2971(i2, m3065(abstractC0785, j));
                    break;
                case 27:
                    iM3026 = AbstractC0734.m2987(i2, m3065(abstractC0785, j), m3081(i));
                    break;
                case 28:
                    iM3026 = AbstractC0734.m2986(i2, m3065(abstractC0785, j));
                    break;
                case 29:
                    iM3026 = AbstractC0734.m2978(i2, m3065(abstractC0785, j));
                    break;
                case 30:
                    iM3026 = AbstractC0734.m3008(i2, m3065(abstractC0785, j));
                    break;
                case 31:
                    iM3026 = AbstractC0734.m2993(i2, m3065(abstractC0785, j));
                    break;
                case 32:
                    iM3026 = AbstractC0734.m2985(i2, m3065(abstractC0785, j));
                    break;
                case 33:
                    iM3026 = AbstractC0734.m3000(i2, m3065(abstractC0785, j));
                    break;
                case 34:
                    iM3026 = AbstractC0734.m2999(i2, m3065(abstractC0785, j));
                    break;
                case 35:
                    int iM3010 = AbstractC0734.m3010((List) unsafe.getObject(abstractC0785, j));
                    if (iM3010 > 0) {
                        iM36 = AbstractC0002.m36(iM3010, C0735.m3030(i2), iM3010, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 36:
                    int iM2994 = AbstractC0734.m2994((List) unsafe.getObject(abstractC0785, j));
                    if (iM2994 > 0) {
                        iM36 = AbstractC0002.m36(iM2994, C0735.m3030(i2), iM2994, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 37:
                    int iM2998 = AbstractC0734.m2998((List) unsafe.getObject(abstractC0785, j));
                    if (iM2998 > 0) {
                        iM36 = AbstractC0002.m36(iM2998, C0735.m3030(i2), iM2998, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 38:
                    int iM2990 = AbstractC0734.m2990((List) unsafe.getObject(abstractC0785, j));
                    if (iM2990 > 0) {
                        iM36 = AbstractC0002.m36(iM2990, C0735.m3030(i2), iM2990, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 39:
                    int iM2976 = AbstractC0734.m2976((List) unsafe.getObject(abstractC0785, j));
                    if (iM2976 > 0) {
                        iM36 = AbstractC0002.m36(iM2976, C0735.m3030(i2), iM2976, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 40:
                    int iM30102 = AbstractC0734.m3010((List) unsafe.getObject(abstractC0785, j));
                    if (iM30102 > 0) {
                        iM36 = AbstractC0002.m36(iM30102, C0735.m3030(i2), iM30102, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 41:
                    int iM29942 = AbstractC0734.m2994((List) unsafe.getObject(abstractC0785, j));
                    if (iM29942 > 0) {
                        iM36 = AbstractC0002.m36(iM29942, C0735.m3030(i2), iM29942, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 42:
                    int iM2968 = AbstractC0734.m2968((List) unsafe.getObject(abstractC0785, j));
                    if (iM2968 > 0) {
                        iM36 = AbstractC0002.m36(iM2968, C0735.m3030(i2), iM2968, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 43:
                    int iM3012 = AbstractC0734.m3012((List) unsafe.getObject(abstractC0785, j));
                    if (iM3012 > 0) {
                        iM36 = AbstractC0002.m36(iM3012, C0735.m3030(i2), iM3012, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 44:
                    int iM2970 = AbstractC0734.m2970((List) unsafe.getObject(abstractC0785, j));
                    if (iM2970 > 0) {
                        iM36 = AbstractC0002.m36(iM2970, C0735.m3030(i2), iM2970, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 45:
                    int iM29943 = AbstractC0734.m2994((List) unsafe.getObject(abstractC0785, j));
                    if (iM29943 > 0) {
                        iM36 = AbstractC0002.m36(iM29943, C0735.m3030(i2), iM29943, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 46:
                    int iM30103 = AbstractC0734.m3010((List) unsafe.getObject(abstractC0785, j));
                    if (iM30103 > 0) {
                        iM36 = AbstractC0002.m36(iM30103, C0735.m3030(i2), iM30103, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 47:
                    int iM2981 = AbstractC0734.m2981((List) unsafe.getObject(abstractC0785, j));
                    if (iM2981 > 0) {
                        iM36 = AbstractC0002.m36(iM2981, C0735.m3030(i2), iM2981, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 48:
                    int iM3006 = AbstractC0734.m3006((List) unsafe.getObject(abstractC0785, j));
                    if (iM3006 > 0) {
                        iM36 = AbstractC0002.m36(iM3006, C0735.m3030(i2), iM3006, iM36);
                    } else {
                        continue;
                    }
                    i += 3;
                case 49:
                    iM3026 = AbstractC0734.m2975(i2, m3065(abstractC0785, j), m3081(i));
                    break;
                case 50:
                    Object objM31842 = AbstractC0768.m3184(abstractC0785, j);
                    Object objM3080 = m3080(i);
                    this.f3582.getClass();
                    C0787.m3250(objM31842, objM3080);
                    continue;
                    i += 3;
                case 51:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3026(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 52:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3019(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 53:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3015(i2, m3069(j, abstractC0785));
                        break;
                    } else {
                        i += 3;
                    }
                case 54:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3018(i2, m3069(j, abstractC0785));
                        break;
                    } else {
                        i += 3;
                    }
                case 55:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3028(i2, m3062(j, abstractC0785));
                        break;
                    } else {
                        i += 3;
                    }
                case 56:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3034(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 57:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3032(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 58:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3027(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 59:
                    if (m3073(i2, i, abstractC0785)) {
                        Object objM31843 = AbstractC0768.m3184(abstractC0785, j);
                        if (!(objM31843 instanceof AbstractC0748)) {
                            iM3026 = C0735.m3031(i2, (String) objM31843);
                            break;
                        } else {
                            iM3026 = C0735.m3016(i2, (AbstractC0748) objM31843);
                            break;
                        }
                    } else {
                        i += 3;
                    }
                case 60:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = AbstractC0734.m2984(i2, AbstractC0768.m3184(abstractC0785, j), m3081(i));
                        break;
                    } else {
                        i += 3;
                    }
                case 61:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3016(i2, (AbstractC0748) AbstractC0768.m3184(abstractC0785, j));
                        break;
                    } else {
                        i += 3;
                    }
                case 62:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3029(i2, m3062(j, abstractC0785));
                        break;
                    } else {
                        i += 3;
                    }
                case 63:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3017(i2, m3062(j, abstractC0785));
                        break;
                    } else {
                        i += 3;
                    }
                case 64:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3024(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 65:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3023(i2);
                        break;
                    } else {
                        i += 3;
                    }
                case 66:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3033(i2, m3062(j, abstractC0785));
                        break;
                    } else {
                        i += 3;
                    }
                case 67:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3022(i2, m3069(j, abstractC0785));
                        break;
                    } else {
                        i += 3;
                    }
                case 68:
                    if (m3073(i2, i, abstractC0785)) {
                        iM3026 = C0735.m3025(i2, (AbstractC0758) AbstractC0768.m3184(abstractC0785, j), m3081(i));
                        break;
                    } else {
                        i += 3;
                    }
                default:
                    i += 3;
            }
            iM36 = iM3026 + iM36;
            i += 3;
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m3079(AbstractC0785 abstractC0785, Object obj, int i) {
        return m3090(i, abstractC0785) == m3090(i, obj);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final Object m3080(int i) {
        return this.f3571[(i / 3) * 2];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ˏᵢ */
    public final void mo2937(Object obj, byte[] bArr, int i, int i2, C0654 c0654) throws InvalidProtocolBufferException {
        if (this.f3581) {
            m3087(obj, bArr, i, i2, c0654);
        } else {
            m3085(obj, bArr, i, i2, 0, c0654);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ˑʽ */
    public final Object mo2938() {
        this.f3576.getClass();
        return ((AbstractC0785) this.f3572).m3245();
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final InterfaceC0727 m3081(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f3571;
        InterfaceC0727 interfaceC0727 = (InterfaceC0727) objArr[i2];
        if (interfaceC0727 != null) {
            return interfaceC0727;
        }
        InterfaceC0727 interfaceC0727M3049 = C0736.f3551.m3049((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC0727M3049;
        return interfaceC0727M3049;
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final void m3082(Object obj, int i, C0746 c0746) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i) != 0) {
            c0746.m3110(2);
            AbstractC0768.m3185(i & 1048575, obj, c0746.f3588.mo445());
        } else if (!this.f3580) {
            AbstractC0768.m3185(i & 1048575, obj, c0746.m3106());
        } else {
            c0746.m3110(2);
            AbstractC0768.m3185(i & 1048575, obj, c0746.f3588.mo440());
        }
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final void m3083(Object obj, int i, C0746 c0746, InterfaceC0727 interfaceC0727, C0747 c0747) throws InvalidProtocolBufferException {
        int iMo455;
        List listMo2951 = this.f3574.mo2951(i & 1048575, obj);
        int i2 = c0746.f3586;
        if ((i2 & 7) != 2) {
            throw InvalidProtocolBufferException.m2923();
        }
        do {
            Object objMo2938 = interfaceC0727.mo2938();
            c0746.m3116(objMo2938, interfaceC0727, c0747);
            interfaceC0727.mo2939(objMo2938);
            listMo2951.add(objMo2938);
            AbstractC0080 abstractC0080 = c0746.f3588;
            if (abstractC0080.mo454() || c0746.f3589 != 0) {
                return;
            } else {
                iMo455 = abstractC0080.mo455();
            }
        } while (iMo455 == i2);
        c0746.f3589 = iMo455;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final void m3084(Object obj, int i, Object obj2) {
        if (m3090(i, obj2)) {
            long jM3077 = m3077(i) & 1048575;
            Unsafe unsafe = f3570;
            Object object = unsafe.getObject(obj2, jM3077);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f3579[i] + " is present but null: " + obj2);
            }
            InterfaceC0727 interfaceC0727M3081 = m3081(i);
            if (!m3090(i, obj)) {
                if (m3070(object)) {
                    Object objMo2938 = interfaceC0727M3081.mo2938();
                    interfaceC0727M3081.mo2935(objMo2938, object);
                    unsafe.putObject(obj, jM3077, objMo2938);
                } else {
                    unsafe.putObject(obj, jM3077, object);
                }
                m3094(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM3077);
            if (!m3070(object2)) {
                Object objMo29382 = interfaceC0727M3081.mo2938();
                interfaceC0727M3081.mo2935(objMo29382, object2);
                unsafe.putObject(obj, jM3077, objMo29382);
                object2 = objMo29382;
            }
            interfaceC0727M3081.mo2935(object2, object);
        }
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final int m3085(Object obj, byte[] bArr, int i, int i2, int i3, C0654 c0654) {
        Unsafe unsafe;
        int i4;
        int i5;
        int iM10364;
        int iM3093;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iM10328;
        int i19;
        int i20;
        C0744 c0744 = this;
        byte[] bArr2 = bArr;
        int i21 = i2;
        int i22 = i3;
        C0654 c06542 = c0654;
        m3063(obj);
        Unsafe unsafe2 = f3570;
        int iM10344 = i;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1048575;
        while (true) {
            if (iM10344 < i21) {
                int i28 = iM10344 + 1;
                byte b = bArr2[iM10344];
                if (b < 0) {
                    iM10364 = AbstractC4535.m10364(b, bArr2, i28, c06542);
                    i5 = c06542.f3061;
                } else {
                    i5 = b;
                    iM10364 = i28;
                }
                int i29 = i5 >>> 3;
                int i30 = i5 & 7;
                int i31 = c0744.f3583;
                int i32 = iM10364;
                int i33 = c0744.f3578;
                int i34 = i5;
                if (i29 > i23) {
                    iM3093 = (i29 < i33 || i29 > i31) ? -1 : c0744.m3093(i29, i24 / 3);
                    i6 = -1;
                } else {
                    iM3093 = (i29 < i33 || i29 > i31) ? -1 : c0744.m3093(i29, 0);
                    i6 = -1;
                }
                if (iM3093 == i6) {
                    i7 = i27;
                    i8 = i29;
                    unsafe = unsafe2;
                    i4 = i22;
                    i9 = i32;
                    i10 = i34;
                    i11 = 0;
                    i12 = i26;
                } else {
                    int[] iArr = c0744.f3579;
                    int i35 = iArr[iM3093 + 1];
                    int iM3064 = m3064(i35);
                    long j = i35 & 1048575;
                    if (iM3064 <= 17) {
                        int i36 = iArr[iM3093 + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i27) {
                            if (i27 != 1048575) {
                                unsafe2.putInt(obj, i27, i26);
                            }
                            i14 = i38;
                            i13 = unsafe2.getInt(obj, i38);
                        } else {
                            i13 = i26;
                            i14 = i27;
                        }
                        switch (iM3064) {
                            case 0:
                                i8 = i29;
                                i15 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                if (i30 == 1) {
                                    AbstractC0768.m3187(obj, j, AbstractC4535.m10338(i15, bArr2));
                                    iM10344 = i15 + 8;
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            case 1:
                                i8 = i29;
                                i15 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                if (i30 == 5) {
                                    AbstractC0768.m3197(obj, j, AbstractC4535.m10359(i15, bArr2));
                                    iM10344 = i15 + 4;
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            case 2:
                            case 3:
                                i8 = i29;
                                i15 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                if (i30 == 0) {
                                    iM10328 = AbstractC4535.m10328(bArr2, i15, c06542);
                                    unsafe2.putLong(obj, j, c06542.f3059);
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    iM10344 = iM10328;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            case 4:
                            case 11:
                                i8 = i29;
                                i15 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                if (i30 == 0) {
                                    iM10344 = AbstractC4535.m10374(bArr2, i15, c06542);
                                    unsafe2.putInt(obj, j, c06542.f3061);
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            case 5:
                            case 14:
                                i8 = i29;
                                i19 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                if (i30 == 1) {
                                    unsafe2.putLong(obj, j, AbstractC4535.m10375(i19, bArr2));
                                    iM10344 = i19 + 8;
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i15 = i19;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                            case 13:
                                i8 = i29;
                                i19 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                if (i30 == 5) {
                                    unsafe2.putInt(obj, j, AbstractC4535.m10340(i19, bArr2));
                                    iM10344 = i19 + 4;
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i15 = i19;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                                i8 = i29;
                                i19 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                if (i30 == 0) {
                                    int iM103282 = AbstractC4535.m10328(bArr2, i19, c06542);
                                    AbstractC0768.m3196(obj, j, c06542.f3059 != 0);
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    iM10344 = iM103282;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i15 = i19;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            case 8:
                                i8 = i29;
                                i19 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                if (i30 == 2) {
                                    iM10344 = (i35 & 536870912) == 0 ? AbstractC4535.m10371(bArr2, i19, c06542) : AbstractC4535.m10391(bArr2, i19, c06542);
                                    unsafe2.putObject(obj, j, c06542.f3060);
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i15 = i19;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            case 9:
                                i8 = i29;
                                i19 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                if (i30 == 2) {
                                    Object objM3074 = c0744.m3074(i18, obj);
                                    iM10344 = AbstractC4535.m10348(objM3074, c0744.m3081(i18), bArr, i19, i2, c0654);
                                    c0744.m3092(obj, i18, objM3074);
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i15 = i19;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            case 10:
                                i8 = i29;
                                i19 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                if (i30 == 2) {
                                    iM10344 = AbstractC4535.m10356(bArr2, i19, c06542);
                                    unsafe2.putObject(obj, j, c06542.f3060);
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i15 = i19;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            case 12:
                                i8 = i29;
                                i19 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                if (i30 == 0) {
                                    iM10344 = AbstractC4535.m10374(bArr2, i19, c06542);
                                    int i39 = c06542.f3061;
                                    c0744.m3088(i18);
                                    unsafe2.putInt(obj, j, i39);
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i15 = i19;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            case 15:
                                i8 = i29;
                                i19 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                if (i30 == 0) {
                                    iM10344 = AbstractC4535.m10374(bArr2, i19, c06542);
                                    unsafe2.putInt(obj, j, AbstractC0080.m568(c06542.f3061));
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i15 = i19;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            case 16:
                                i8 = i29;
                                i19 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                if (i30 == 0) {
                                    iM10328 = AbstractC4535.m10328(bArr2, i19, c06542);
                                    unsafe2.putLong(obj, j, AbstractC0080.m566(c06542.f3059));
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    iM10344 = iM10328;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i15 = i19;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            case 17:
                                if (i30 == 3) {
                                    Object objM30742 = c0744.m3074(iM3093, obj);
                                    i17 = i14;
                                    i16 = i34;
                                    i18 = iM3093;
                                    i8 = i29;
                                    iM10344 = AbstractC4535.m10386(objM30742, c0744.m3081(iM3093), bArr, i32, i2, (i29 << 3) | 4, c0654);
                                    c0744.m3092(obj, i18, objM30742);
                                    i26 = i13 | i37;
                                    i21 = i2;
                                    i24 = i18;
                                    i23 = i8;
                                    i25 = i16;
                                    i27 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i8 = i29;
                                    i19 = i32;
                                    i16 = i34;
                                    i17 = i14;
                                    i18 = iM3093;
                                    i15 = i19;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i11 = i18;
                                    i10 = i16;
                                    i7 = i17;
                                    i4 = i3;
                                    i12 = i13;
                                    break;
                                }
                            default:
                                i8 = i29;
                                i15 = i32;
                                i16 = i34;
                                i17 = i14;
                                i18 = iM3093;
                                i9 = i15;
                                unsafe = unsafe2;
                                i11 = i18;
                                i10 = i16;
                                i7 = i17;
                                i4 = i3;
                                i12 = i13;
                                break;
                        }
                    } else {
                        i8 = i29;
                        int i40 = iM3093;
                        if (iM3064 != 27) {
                            i12 = i26;
                            i7 = i27;
                            if (iM3064 <= 49) {
                                unsafe = unsafe2;
                                i11 = i40;
                                iM10344 = m3101(obj, bArr, i32, i2, i34, i30, i40, i35, iM3064, j, c0654);
                                if (iM10344 != i32) {
                                    c0744 = this;
                                    bArr2 = bArr;
                                    i21 = i2;
                                    i22 = i3;
                                    c06542 = c0654;
                                    i23 = i8;
                                    i25 = i34;
                                    i26 = i12;
                                    i27 = i7;
                                    unsafe2 = unsafe;
                                    i24 = i11;
                                } else {
                                    i4 = i3;
                                    i9 = iM10344;
                                }
                            } else {
                                i20 = i32;
                                unsafe = unsafe2;
                                i11 = i40;
                                if (iM3064 != 50) {
                                    iM10344 = m3075(obj, bArr, i20, i2, i34, i8, i30, i35, iM3064, j, i11, c0654);
                                    if (iM10344 != i20) {
                                        c0744 = this;
                                        bArr2 = bArr;
                                        i21 = i2;
                                        i22 = i3;
                                        c06542 = c0654;
                                        i24 = i11;
                                        i23 = i8;
                                        i25 = i34;
                                        i26 = i12;
                                        i27 = i7;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i9 = iM10344;
                                        i11 = i11;
                                    }
                                } else if (i30 == 2) {
                                    m3097(j, obj, i11);
                                    throw null;
                                }
                            }
                            i10 = i34;
                        } else if (i30 == 2) {
                            AbstractC0724 abstractC0724 = (AbstractC0724) ((InterfaceC0780) unsafe2.getObject(obj, j));
                            boolean zM2932 = abstractC0724.m2932();
                            InterfaceC0780 interfaceC0780 = abstractC0724;
                            if (!zM2932) {
                                int size = abstractC0724.size();
                                InterfaceC0780 interfaceC0780Mo2949 = abstractC0724.mo2949(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj, j, interfaceC0780Mo2949);
                                interfaceC0780 = interfaceC0780Mo2949;
                            }
                            iM10344 = AbstractC4535.m10378(c0744.m3081(i40), i34, bArr, i32, i2, interfaceC0780, c0654);
                            i21 = i2;
                            i24 = i40;
                            i23 = i8;
                            i25 = i34;
                            i26 = i26;
                            i27 = i27;
                            i22 = i3;
                        } else {
                            i12 = i26;
                            i7 = i27;
                            i20 = i32;
                            unsafe = unsafe2;
                            i11 = i40;
                        }
                        i4 = i3;
                        i9 = i20;
                        i10 = i34;
                    }
                }
                if (i10 != i4 || i4 == 0) {
                    AbstractC0785 abstractC0785 = (AbstractC0785) obj;
                    C0741 c0741M3054 = abstractC0785.unknownFields;
                    if (c0741M3054 == C0741.f3558) {
                        c0741M3054 = C0741.m3054();
                        abstractC0785.unknownFields = c0741M3054;
                    }
                    iM10344 = AbstractC4535.m10344(i10, bArr, i9, i2, c0741M3054, c0654);
                    c0744 = this;
                    bArr2 = bArr;
                    i21 = i2;
                    c06542 = c0654;
                    i22 = i4;
                    i25 = i10;
                    i23 = i8;
                    i26 = i12;
                    i27 = i7;
                    unsafe2 = unsafe;
                    i24 = i11;
                } else {
                    iM10344 = i9;
                    i25 = i10;
                    i26 = i12;
                    i27 = i7;
                }
            } else {
                unsafe = unsafe2;
                i4 = i22;
            }
        }
        if (i27 != 1048575) {
            unsafe.putInt(obj, i27, i26);
        }
        for (int i41 = this.f3584; i41 < this.f3573; i41++) {
            m3076(obj, this.f3577[i41], null);
        }
        if (i4 == 0) {
            if (iM10344 != i2) {
                throw InvalidProtocolBufferException.m2925();
            }
        } else if (iM10344 > i2 || i25 != i4) {
            throw InvalidProtocolBufferException.m2925();
        }
        return iM10344;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ـﹶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2939(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = m3070(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC0785
            if (r0 == 0) goto L17
            r0 = r8
            com.google.crypto.tink.shaded.protobuf.ﾞˊ r0 = (com.google.crypto.tink.shaded.protobuf.AbstractC0785) r0
            r0.m3247()
            r0.m3243()
            r0.m3246()
        L17:
            int[] r0 = r7.f3579
            int r0 = r0.length
            r1 = 0
        L1b:
            if (r1 >= r0) goto L62
            int r2 = r7.m3077(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            int r2 = m3064(r2)
            r5 = 9
            if (r2 == r5) goto L4c
            switch(r2) {
                case 17: goto L4c;
                case 18: goto L46;
                case 19: goto L46;
                case 20: goto L46;
                case 21: goto L46;
                case 22: goto L46;
                case 23: goto L46;
                case 24: goto L46;
                case 25: goto L46;
                case 26: goto L46;
                case 27: goto L46;
                case 28: goto L46;
                case 29: goto L46;
                case 30: goto L46;
                case 31: goto L46;
                case 32: goto L46;
                case 33: goto L46;
                case 34: goto L46;
                case 35: goto L46;
                case 36: goto L46;
                case 37: goto L46;
                case 38: goto L46;
                case 39: goto L46;
                case 40: goto L46;
                case 41: goto L46;
                case 42: goto L46;
                case 43: goto L46;
                case 44: goto L46;
                case 45: goto L46;
                case 46: goto L46;
                case 47: goto L46;
                case 48: goto L46;
                case 49: goto L46;
                case 50: goto L32;
                default: goto L31;
            }
        L31:
            goto L5f
        L32:
            sun.misc.Unsafe r2 = com.google.crypto.tink.shaded.protobuf.C0744.f3570
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L5f
            com.google.crypto.tink.shaded.protobuf.ﾞᐧ r6 = r7.f3582
            r6.getClass()
            com.google.crypto.tink.shaded.protobuf.C0787.m3254(r5)
            r2.putObject(r8, r3, r5)
            goto L5f
        L46:
            com.google.crypto.tink.shaded.protobuf.ᵢʿ r2 = r7.f3574
            r2.mo2952(r3, r8)
            goto L5f
        L4c:
            boolean r2 = r7.m3090(r1, r8)
            if (r2 == 0) goto L5f
            com.google.crypto.tink.shaded.protobuf.ʿˊ r2 = r7.m3081(r1)
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.C0744.f3570
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.mo2939(r3)
        L5f:
            int r1 = r1 + 3
            goto L1b
        L62:
            com.google.crypto.tink.shaded.protobuf.ⁱʿ r0 = r7.f3575
            r0.mo3135(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C0744.mo2939(java.lang.Object):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ٴˎ */
    public final void mo2940(Object obj, C0746 c0746, C0747 c0747) throws Throwable {
        c0747.getClass();
        m3063(obj);
        m3099(this.f3575, obj, c0746, c0747);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ᐧʻ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2941(com.google.crypto.tink.shaded.protobuf.AbstractC0785 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C0744.mo2941(com.google.crypto.tink.shaded.protobuf.ﾞˊ, java.lang.Object):boolean");
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object m3086(int i, int i2, Object obj) {
        InterfaceC0727 interfaceC0727M3081 = m3081(i2);
        if (!m3073(i, i2, obj)) {
            return interfaceC0727M3081.mo2938();
        }
        Object object = f3570.getObject(obj, m3077(i2) & 1048575);
        if (m3070(object)) {
            return object;
        }
        Object objMo2938 = interfaceC0727M3081.mo2938();
        if (object != null) {
            interfaceC0727M3081.mo2935(objMo2938, object);
        }
        return objMo2938;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x009c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* renamed from: ᴵʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3087(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.play_billing.C0654 r35) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C0744.m3087(java.lang.Object, byte[], int, int, com.google.android.gms.internal.play_billing.ᵎˏ):void");
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m3088(int i) {
        if (this.f3571[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final void m3089(Object obj, C0756 c0756) throws CodedOutputStream$OutOfSpaceException {
        int i;
        int[] iArr = this.f3579;
        int length = iArr.length;
        Unsafe unsafe = f3570;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < length) {
            int iM3077 = m3077(i3);
            int i6 = iArr[i3];
            int iM3064 = m3064(iM3077);
            if (iM3064 <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i4) {
                    i5 = unsafe.getInt(obj, i8);
                    i4 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            int i9 = i;
            long j = iM3077 & i2;
            switch (iM3064) {
                case 0:
                    if ((i5 & i9) != 0) {
                        c0756.m3145(i6, AbstractC0768.f3622.mo3154(j, obj));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 1:
                    if ((i5 & i9) != 0) {
                        c0756.m3149(i6, AbstractC0768.f3622.mo3160(j, obj));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 2:
                    if ((i5 & i9) != 0) {
                        c0756.m3139(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 3:
                    if ((i5 & i9) != 0) {
                        c0756.m3151(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 4:
                    if ((i5 & i9) != 0) {
                        c0756.m3153(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 5:
                    if ((i5 & i9) != 0) {
                        c0756.m3148(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if ((i5 & i9) != 0) {
                        c0756.m3138(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i5 & i9) != 0) {
                        c0756.m3147(i6, AbstractC0768.f3622.mo3159(j, obj));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 8:
                    if ((i5 & i9) != 0) {
                        m3060(i6, unsafe.getObject(obj, j), c0756);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 9:
                    if ((i5 & i9) != 0) {
                        c0756.m3142(i6, unsafe.getObject(obj, j), m3081(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 10:
                    if ((i5 & i9) != 0) {
                        c0756.m3137(i6, (AbstractC0748) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 11:
                    if ((i5 & i9) != 0) {
                        c0756.m3146(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 12:
                    if ((i5 & i9) != 0) {
                        c0756.m3152(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 13:
                    if ((i5 & i9) != 0) {
                        c0756.m3140(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 14:
                    if ((i5 & i9) != 0) {
                        c0756.m3141(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 15:
                    if ((i5 & i9) != 0) {
                        c0756.m3150(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 16:
                    if ((i5 & i9) != 0) {
                        c0756.m3143(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 17:
                    if ((i5 & i9) != 0) {
                        c0756.m3144(i6, unsafe.getObject(obj, j), m3081(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 18:
                    AbstractC0734.m2973(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 19:
                    AbstractC0734.m2991(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 20:
                    AbstractC0734.m2969(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 21:
                    AbstractC0734.m3001(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 22:
                    AbstractC0734.m3013(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 23:
                    AbstractC0734.m2977(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 24:
                    AbstractC0734.m3009(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 25:
                    AbstractC0734.m2980(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 26:
                    AbstractC0734.m2967(iArr[i3], (List) unsafe.getObject(obj, j), c0756);
                    break;
                case 27:
                    AbstractC0734.m2989(iArr[i3], (List) unsafe.getObject(obj, j), c0756, m3081(i3));
                    break;
                case 28:
                    AbstractC0734.m2995(iArr[i3], (List) unsafe.getObject(obj, j), c0756);
                    break;
                case 29:
                    AbstractC0734.m3002(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    break;
                case 30:
                    AbstractC0734.m3004(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    break;
                case 31:
                    AbstractC0734.m2988(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    break;
                case 32:
                    AbstractC0734.m3005(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    break;
                case 33:
                    AbstractC0734.m2982(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    break;
                case 34:
                    AbstractC0734.m3003(iArr[i3], (List) unsafe.getObject(obj, j), c0756, false);
                    break;
                case 35:
                    AbstractC0734.m2973(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 36:
                    AbstractC0734.m2991(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 37:
                    AbstractC0734.m2969(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 38:
                    AbstractC0734.m3001(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 39:
                    AbstractC0734.m3013(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 40:
                    AbstractC0734.m2977(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 41:
                    AbstractC0734.m3009(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 42:
                    AbstractC0734.m2980(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 43:
                    AbstractC0734.m3002(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 44:
                    AbstractC0734.m3004(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 45:
                    AbstractC0734.m2988(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 46:
                    AbstractC0734.m3005(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 47:
                    AbstractC0734.m2982(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 48:
                    AbstractC0734.m3003(iArr[i3], (List) unsafe.getObject(obj, j), c0756, true);
                    break;
                case 49:
                    AbstractC0734.m2997(iArr[i3], (List) unsafe.getObject(obj, j), c0756, m3081(i3));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object objM3080 = m3080(i3);
                        this.f3582.getClass();
                        ᵎﹳ.ᐧʻ.ᵎˏ(objM3080);
                        throw null;
                    }
                    break;
                case 51:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3145(i6, ((Double) AbstractC0768.f3622.m3211(j, obj)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3149(i6, ((Float) AbstractC0768.f3622.m3211(j, obj)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3139(i6, m3069(j, obj));
                        break;
                    }
                    break;
                case 54:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3151(i6, m3069(j, obj));
                        break;
                    }
                    break;
                case 55:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3153(i6, m3062(j, obj));
                        break;
                    }
                    break;
                case 56:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3148(i6, m3069(j, obj));
                        break;
                    }
                    break;
                case 57:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3138(i6, m3062(j, obj));
                        break;
                    }
                    break;
                case 58:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3147(i6, ((Boolean) AbstractC0768.f3622.m3211(j, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (m3073(i6, i3, obj)) {
                        m3060(i6, unsafe.getObject(obj, j), c0756);
                        break;
                    }
                    break;
                case 60:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3142(i6, unsafe.getObject(obj, j), m3081(i3));
                        break;
                    }
                    break;
                case 61:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3137(i6, (AbstractC0748) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3146(i6, m3062(j, obj));
                        break;
                    }
                    break;
                case 63:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3152(i6, m3062(j, obj));
                        break;
                    }
                    break;
                case 64:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3140(i6, m3062(j, obj));
                        break;
                    }
                    break;
                case 65:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3141(i6, m3069(j, obj));
                        break;
                    }
                    break;
                case 66:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3150(i6, m3062(j, obj));
                        break;
                    }
                    break;
                case 67:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3143(i6, m3069(j, obj));
                        break;
                    }
                    break;
                case 68:
                    if (m3073(i6, i3, obj)) {
                        c0756.m3144(i6, unsafe.getObject(obj, j), m3081(i3));
                        break;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        ((C0755) this.f3575).getClass();
        ((AbstractC0785) obj).unknownFields.m3056(c0756);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final boolean m3090(int i, Object obj) {
        int i2 = this.f3579[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & AbstractC0768.f3622.m3209(j, obj)) != 0;
        }
        int iM3077 = m3077(i);
        long j2 = iM3077 & 1048575;
        switch (m3064(iM3077)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC0768.f3622.mo3154(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC0768.f3622.mo3160(j2, obj)) != 0;
            case 2:
                return AbstractC0768.f3622.m3206(j2, obj) != 0;
            case 3:
                return AbstractC0768.f3622.m3206(j2, obj) != 0;
            case 4:
                return AbstractC0768.f3622.m3209(j2, obj) != 0;
            case 5:
                return AbstractC0768.f3622.m3206(j2, obj) != 0;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return AbstractC0768.f3622.m3209(j2, obj) != 0;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return AbstractC0768.f3622.mo3159(j2, obj);
            case 8:
                Object objM3211 = AbstractC0768.f3622.m3211(j2, obj);
                if (objM3211 instanceof String) {
                    return !((String) objM3211).isEmpty();
                }
                if (objM3211 instanceof AbstractC0748) {
                    return !AbstractC0748.f3592.equals(objM3211);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC0768.f3622.m3211(j2, obj) != null;
            case 10:
                return !AbstractC0748.f3592.equals(AbstractC0768.f3622.m3211(j2, obj));
            case 11:
                return AbstractC0768.f3622.m3209(j2, obj) != 0;
            case 12:
                return AbstractC0768.f3622.m3209(j2, obj) != 0;
            case 13:
                return AbstractC0768.f3622.m3209(j2, obj) != 0;
            case 14:
                return AbstractC0768.f3622.m3206(j2, obj) != 0;
            case 15:
                return AbstractC0768.f3622.m3209(j2, obj) != 0;
            case 16:
                return AbstractC0768.f3622.m3206(j2, obj) != 0;
            case 17:
                return AbstractC0768.f3622.m3211(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final int m3091(AbstractC0785 abstractC0785) {
        int i;
        int iM3026;
        int iM3016;
        Unsafe unsafe = f3570;
        int i2 = 0;
        int iM36 = 0;
        int i3 = 1048575;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f3579;
            if (i2 >= iArr.length) {
                ((C0755) this.f3575).getClass();
                return abstractC0785.unknownFields.m3055() + iM36;
            }
            int iM3077 = m3077(i2);
            int i5 = iArr[i2];
            int iM3064 = m3064(iM3077);
            if (iM3064 <= 17) {
                int i6 = iArr[i2 + 2];
                int i7 = i6 & 1048575;
                i = 1 << (i6 >>> 20);
                if (i7 != i3) {
                    i4 = unsafe.getInt(abstractC0785, i7);
                    i3 = i7;
                }
            } else {
                i = 0;
            }
            long j = iM3077 & 1048575;
            switch (iM3064) {
                case 0:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3026(i5);
                        iM36 += iM3026;
                        break;
                    }
                case 1:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3019(i5);
                        iM36 += iM3026;
                        break;
                    }
                case 2:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3015(i5, unsafe.getLong(abstractC0785, j));
                        iM36 += iM3026;
                        break;
                    }
                case 3:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3018(i5, unsafe.getLong(abstractC0785, j));
                        iM36 += iM3026;
                        break;
                    }
                case 4:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3028(i5, unsafe.getInt(abstractC0785, j));
                        iM36 += iM3026;
                        break;
                    }
                case 5:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3034(i5);
                        iM36 += iM3026;
                        break;
                    }
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3032(i5);
                        iM36 += iM3026;
                        break;
                    }
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3027(i5);
                        iM36 += iM3026;
                        break;
                    }
                case 8:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0785, j);
                        iM3016 = object instanceof AbstractC0748 ? C0735.m3016(i5, (AbstractC0748) object) : C0735.m3031(i5, (String) object);
                        iM36 = iM3016 + iM36;
                        break;
                    }
                case 9:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = AbstractC0734.m2984(i5, unsafe.getObject(abstractC0785, j), m3081(i2));
                        iM36 += iM3026;
                        break;
                    }
                case 10:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3016(i5, (AbstractC0748) unsafe.getObject(abstractC0785, j));
                        iM36 += iM3026;
                        break;
                    }
                case 11:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3029(i5, unsafe.getInt(abstractC0785, j));
                        iM36 += iM3026;
                        break;
                    }
                case 12:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3017(i5, unsafe.getInt(abstractC0785, j));
                        iM36 += iM3026;
                        break;
                    }
                case 13:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3024(i5);
                        iM36 += iM3026;
                        break;
                    }
                case 14:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3023(i5);
                        iM36 += iM3026;
                        break;
                    }
                case 15:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3033(i5, unsafe.getInt(abstractC0785, j));
                        iM36 += iM3026;
                        break;
                    }
                case 16:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3022(i5, unsafe.getLong(abstractC0785, j));
                        iM36 += iM3026;
                        break;
                    }
                case 17:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        iM3026 = C0735.m3025(i5, (AbstractC0758) unsafe.getObject(abstractC0785, j), m3081(i2));
                        iM36 += iM3026;
                        break;
                    }
                case 18:
                    iM3026 = AbstractC0734.m2985(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 19:
                    iM3026 = AbstractC0734.m2993(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 20:
                    iM3026 = AbstractC0734.m2979(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 21:
                    iM3026 = AbstractC0734.m3011(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 22:
                    iM3026 = AbstractC0734.m2983(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 23:
                    iM3026 = AbstractC0734.m2985(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 24:
                    iM3026 = AbstractC0734.m2993(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 25:
                    iM3026 = AbstractC0734.m2992(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 26:
                    iM3026 = AbstractC0734.m2971(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 27:
                    iM3026 = AbstractC0734.m2987(i5, (List) unsafe.getObject(abstractC0785, j), m3081(i2));
                    iM36 += iM3026;
                    break;
                case 28:
                    iM3026 = AbstractC0734.m2986(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 29:
                    iM3026 = AbstractC0734.m2978(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 30:
                    iM3026 = AbstractC0734.m3008(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 31:
                    iM3026 = AbstractC0734.m2993(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 32:
                    iM3026 = AbstractC0734.m2985(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 33:
                    iM3026 = AbstractC0734.m3000(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 34:
                    iM3026 = AbstractC0734.m2999(i5, (List) unsafe.getObject(abstractC0785, j));
                    iM36 += iM3026;
                    break;
                case 35:
                    int iM3010 = AbstractC0734.m3010((List) unsafe.getObject(abstractC0785, j));
                    if (iM3010 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM3010, C0735.m3030(i5), iM3010, iM36);
                        break;
                    }
                case 36:
                    int iM2994 = AbstractC0734.m2994((List) unsafe.getObject(abstractC0785, j));
                    if (iM2994 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM2994, C0735.m3030(i5), iM2994, iM36);
                        break;
                    }
                case 37:
                    int iM2998 = AbstractC0734.m2998((List) unsafe.getObject(abstractC0785, j));
                    if (iM2998 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM2998, C0735.m3030(i5), iM2998, iM36);
                        break;
                    }
                case 38:
                    int iM2990 = AbstractC0734.m2990((List) unsafe.getObject(abstractC0785, j));
                    if (iM2990 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM2990, C0735.m3030(i5), iM2990, iM36);
                        break;
                    }
                case 39:
                    int iM2976 = AbstractC0734.m2976((List) unsafe.getObject(abstractC0785, j));
                    if (iM2976 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM2976, C0735.m3030(i5), iM2976, iM36);
                        break;
                    }
                case 40:
                    int iM30102 = AbstractC0734.m3010((List) unsafe.getObject(abstractC0785, j));
                    if (iM30102 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM30102, C0735.m3030(i5), iM30102, iM36);
                        break;
                    }
                case 41:
                    int iM29942 = AbstractC0734.m2994((List) unsafe.getObject(abstractC0785, j));
                    if (iM29942 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM29942, C0735.m3030(i5), iM29942, iM36);
                        break;
                    }
                case 42:
                    int iM2968 = AbstractC0734.m2968((List) unsafe.getObject(abstractC0785, j));
                    if (iM2968 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM2968, C0735.m3030(i5), iM2968, iM36);
                        break;
                    }
                case 43:
                    int iM3012 = AbstractC0734.m3012((List) unsafe.getObject(abstractC0785, j));
                    if (iM3012 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM3012, C0735.m3030(i5), iM3012, iM36);
                        break;
                    }
                case 44:
                    int iM2970 = AbstractC0734.m2970((List) unsafe.getObject(abstractC0785, j));
                    if (iM2970 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM2970, C0735.m3030(i5), iM2970, iM36);
                        break;
                    }
                case 45:
                    int iM29943 = AbstractC0734.m2994((List) unsafe.getObject(abstractC0785, j));
                    if (iM29943 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM29943, C0735.m3030(i5), iM29943, iM36);
                        break;
                    }
                case 46:
                    int iM30103 = AbstractC0734.m3010((List) unsafe.getObject(abstractC0785, j));
                    if (iM30103 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM30103, C0735.m3030(i5), iM30103, iM36);
                        break;
                    }
                case 47:
                    int iM2981 = AbstractC0734.m2981((List) unsafe.getObject(abstractC0785, j));
                    if (iM2981 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM2981, C0735.m3030(i5), iM2981, iM36);
                        break;
                    }
                case 48:
                    int iM3006 = AbstractC0734.m3006((List) unsafe.getObject(abstractC0785, j));
                    if (iM3006 <= 0) {
                        break;
                    } else {
                        iM36 = AbstractC0002.m36(iM3006, C0735.m3030(i5), iM3006, iM36);
                        break;
                    }
                case 49:
                    iM3026 = AbstractC0734.m2975(i5, (List) unsafe.getObject(abstractC0785, j), m3081(i2));
                    iM36 += iM3026;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0785, j);
                    Object objM3080 = m3080(i2);
                    this.f3582.getClass();
                    C0787.m3250(object2, objM3080);
                    break;
                case 51:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3026(i5);
                        iM36 += iM3026;
                        break;
                    }
                case 52:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3019(i5);
                        iM36 += iM3026;
                        break;
                    }
                case 53:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3015(i5, m3069(j, abstractC0785));
                        iM36 += iM3026;
                        break;
                    }
                case 54:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3018(i5, m3069(j, abstractC0785));
                        iM36 += iM3026;
                        break;
                    }
                case 55:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3028(i5, m3062(j, abstractC0785));
                        iM36 += iM3026;
                        break;
                    }
                case 56:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3034(i5);
                        iM36 += iM3026;
                        break;
                    }
                case 57:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3032(i5);
                        iM36 += iM3026;
                        break;
                    }
                case 58:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3027(i5);
                        iM36 += iM3026;
                        break;
                    }
                case 59:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC0785, j);
                        iM3016 = object3 instanceof AbstractC0748 ? C0735.m3016(i5, (AbstractC0748) object3) : C0735.m3031(i5, (String) object3);
                        iM36 = iM3016 + iM36;
                        break;
                    }
                case 60:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = AbstractC0734.m2984(i5, unsafe.getObject(abstractC0785, j), m3081(i2));
                        iM36 += iM3026;
                        break;
                    }
                case 61:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3016(i5, (AbstractC0748) unsafe.getObject(abstractC0785, j));
                        iM36 += iM3026;
                        break;
                    }
                case 62:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3029(i5, m3062(j, abstractC0785));
                        iM36 += iM3026;
                        break;
                    }
                case 63:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3017(i5, m3062(j, abstractC0785));
                        iM36 += iM3026;
                        break;
                    }
                case 64:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3024(i5);
                        iM36 += iM3026;
                        break;
                    }
                case 65:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3023(i5);
                        iM36 += iM3026;
                        break;
                    }
                case 66:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3033(i5, m3062(j, abstractC0785));
                        iM36 += iM3026;
                        break;
                    }
                case 67:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3022(i5, m3069(j, abstractC0785));
                        iM36 += iM3026;
                        break;
                    }
                case 68:
                    if (!m3073(i5, i2, abstractC0785)) {
                        break;
                    } else {
                        iM3026 = C0735.m3025(i5, (AbstractC0758) unsafe.getObject(abstractC0785, j), m3081(i2));
                        iM36 += iM3026;
                        break;
                    }
            }
            i2 += 3;
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m3092(Object obj, int i, Object obj2) {
        f3570.putObject(obj, m3077(i) & 1048575, obj2);
        m3094(i, obj);
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final int m3093(int i, int i2) {
        int[] iArr = this.f3579;
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

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void m3094(int i, Object obj) {
        int i2 = this.f3579[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC0768.m3199(j, obj, (1 << (i2 >>> 20)) | AbstractC0768.f3622.m3209(j, obj));
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final void m3095(Object obj, int i, C0746 c0746) throws InvalidProtocolBufferException.InvalidWireTypeException {
        boolean z = (536870912 & i) != 0;
        AbstractC0775 abstractC0775 = this.f3574;
        if (z) {
            c0746.m3112(abstractC0775.mo2951(i & 1048575, obj), true);
        } else {
            c0746.m3112(abstractC0775.mo2951(i & 1048575, obj), false);
        }
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m3096(Object obj, int i, Object obj2) {
        int[] iArr = this.f3579;
        int i2 = iArr[i];
        if (m3073(i2, i, obj2)) {
            long jM3077 = m3077(i) & 1048575;
            Unsafe unsafe = f3570;
            Object object = unsafe.getObject(obj2, jM3077);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            InterfaceC0727 interfaceC0727M3081 = m3081(i);
            if (!m3073(i2, i, obj)) {
                if (m3070(object)) {
                    Object objMo2938 = interfaceC0727M3081.mo2938();
                    interfaceC0727M3081.mo2935(objMo2938, object);
                    unsafe.putObject(obj, jM3077, objMo2938);
                } else {
                    unsafe.putObject(obj, jM3077, object);
                }
                m3071(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM3077);
            if (!m3070(object2)) {
                Object objMo29382 = interfaceC0727M3081.mo2938();
                interfaceC0727M3081.mo2935(objMo29382, object2);
                unsafe.putObject(obj, jM3077, objMo29382);
                object2 = objMo29382;
            }
            interfaceC0727M3081.mo2935(object2, object);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ﹳﹳ */
    public final int mo2942(AbstractC0785 abstractC0785) {
        return this.f3581 ? m3078(abstractC0785) : m3091(abstractC0785);
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m3097(long j, Object obj, int i) {
        Unsafe unsafe = f3570;
        Object objM3080 = m3080(i);
        Object object = unsafe.getObject(obj, j);
        this.f3582.getClass();
        if (C0787.m3252(object)) {
            C0765 c0765M3251 = C0787.m3251();
            C0787.m3255(c0765M3251, object);
            unsafe.putObject(obj, j, c0765M3251);
        }
        C0787.m3253(objM3080);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0727
    /* renamed from: ﹶˆ */
    public final void mo2943(Object obj, C0756 c0756) throws CodedOutputStream$OutOfSpaceException {
        c0756.getClass();
        if (!this.f3581) {
            m3089(obj, c0756);
            return;
        }
        int[] iArr = this.f3579;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iM3077 = m3077(i);
            int i2 = iArr[i];
            switch (m3064(iM3077)) {
                case 0:
                    if (m3090(i, obj)) {
                        c0756.m3145(i2, AbstractC0768.f3622.mo3154(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m3090(i, obj)) {
                        c0756.m3149(i2, AbstractC0768.f3622.mo3160(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m3090(i, obj)) {
                        c0756.m3139(i2, AbstractC0768.f3622.m3206(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m3090(i, obj)) {
                        c0756.m3151(i2, AbstractC0768.f3622.m3206(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m3090(i, obj)) {
                        c0756.m3153(i2, AbstractC0768.f3622.m3209(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m3090(i, obj)) {
                        c0756.m3148(i2, AbstractC0768.f3622.m3206(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m3090(i, obj)) {
                        c0756.m3138(i2, AbstractC0768.f3622.m3209(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m3090(i, obj)) {
                        c0756.m3147(i2, AbstractC0768.f3622.mo3159(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m3090(i, obj)) {
                        m3060(i2, AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m3090(i, obj)) {
                        c0756.m3142(i2, AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), m3081(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m3090(i, obj)) {
                        c0756.m3137(i2, (AbstractC0748) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m3090(i, obj)) {
                        c0756.m3146(i2, AbstractC0768.f3622.m3209(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m3090(i, obj)) {
                        c0756.m3152(i2, AbstractC0768.f3622.m3209(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m3090(i, obj)) {
                        c0756.m3140(i2, AbstractC0768.f3622.m3209(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m3090(i, obj)) {
                        c0756.m3141(i2, AbstractC0768.f3622.m3206(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m3090(i, obj)) {
                        c0756.m3150(i2, AbstractC0768.f3622.m3209(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m3090(i, obj)) {
                        c0756.m3143(i2, AbstractC0768.f3622.m3206(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m3090(i, obj)) {
                        c0756.m3144(i2, AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), m3081(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    AbstractC0734.m2973(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 19:
                    AbstractC0734.m2991(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 20:
                    AbstractC0734.m2969(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 21:
                    AbstractC0734.m3001(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 22:
                    AbstractC0734.m3013(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 23:
                    AbstractC0734.m2977(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 24:
                    AbstractC0734.m3009(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 25:
                    AbstractC0734.m2980(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 26:
                    AbstractC0734.m2967(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756);
                    break;
                case 27:
                    AbstractC0734.m2989(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, m3081(i));
                    break;
                case 28:
                    AbstractC0734.m2995(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756);
                    break;
                case 29:
                    AbstractC0734.m3002(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 30:
                    AbstractC0734.m3004(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 31:
                    AbstractC0734.m2988(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 32:
                    AbstractC0734.m3005(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 33:
                    AbstractC0734.m2982(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 34:
                    AbstractC0734.m3003(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, false);
                    break;
                case 35:
                    AbstractC0734.m2973(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 36:
                    AbstractC0734.m2991(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 37:
                    AbstractC0734.m2969(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 38:
                    AbstractC0734.m3001(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 39:
                    AbstractC0734.m3013(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 40:
                    AbstractC0734.m2977(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 41:
                    AbstractC0734.m3009(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 42:
                    AbstractC0734.m2980(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 43:
                    AbstractC0734.m3002(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 44:
                    AbstractC0734.m3004(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 45:
                    AbstractC0734.m2988(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 46:
                    AbstractC0734.m3005(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 47:
                    AbstractC0734.m2982(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 48:
                    AbstractC0734.m3003(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, true);
                    break;
                case 49:
                    AbstractC0734.m2997(iArr[i], (List) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756, m3081(i));
                    break;
                case 50:
                    if (AbstractC0768.f3622.m3211(iM3077 & 1048575, obj) != null) {
                        Object objM3080 = m3080(i);
                        this.f3582.getClass();
                        ᵎﹳ.ᐧʻ.ᵎˏ(objM3080);
                        throw null;
                    }
                    break;
                case 51:
                    if (m3073(i2, i, obj)) {
                        c0756.m3145(i2, ((Double) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m3073(i2, i, obj)) {
                        c0756.m3149(i2, ((Float) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj)).floatValue());
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m3073(i2, i, obj)) {
                        c0756.m3139(i2, m3069(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m3073(i2, i, obj)) {
                        c0756.m3151(i2, m3069(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m3073(i2, i, obj)) {
                        c0756.m3153(i2, m3062(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m3073(i2, i, obj)) {
                        c0756.m3148(i2, m3069(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m3073(i2, i, obj)) {
                        c0756.m3138(i2, m3062(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m3073(i2, i, obj)) {
                        c0756.m3147(i2, ((Boolean) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m3073(i2, i, obj)) {
                        m3060(i2, AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), c0756);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m3073(i2, i, obj)) {
                        c0756.m3142(i2, AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), m3081(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m3073(i2, i, obj)) {
                        c0756.m3137(i2, (AbstractC0748) AbstractC0768.f3622.m3211(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m3073(i2, i, obj)) {
                        c0756.m3146(i2, m3062(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m3073(i2, i, obj)) {
                        c0756.m3152(i2, m3062(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m3073(i2, i, obj)) {
                        c0756.m3140(i2, m3062(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m3073(i2, i, obj)) {
                        c0756.m3141(i2, m3069(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m3073(i2, i, obj)) {
                        c0756.m3150(i2, m3062(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m3073(i2, i, obj)) {
                        c0756.m3143(i2, m3069(iM3077 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m3073(i2, i, obj)) {
                        c0756.m3144(i2, AbstractC0768.f3622.m3211(iM3077 & 1048575, obj), m3081(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((C0755) this.f3575).getClass();
        ((AbstractC0785) obj).unknownFields.m3056(c0756);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void m3098(Object obj, int i, Object obj2) {
        long jM3077 = m3077(i) & 1048575;
        Object objM3211 = AbstractC0768.f3622.m3211(jM3077, obj);
        C0787 c0787 = this.f3582;
        if (objM3211 != null) {
            c0787.getClass();
            if (C0787.m3252(objM3211)) {
                C0765 c0765M3175 = C0765.f3615.m3175();
                C0787.m3255(c0765M3175, objM3211);
                AbstractC0768.m3185(jM3077, obj, c0765M3175);
                objM3211 = c0765M3175;
            }
        } else {
            c0787.getClass();
            objM3211 = C0765.f3615.m3175();
            AbstractC0768.m3185(jM3077, obj, objM3211);
        }
        c0787.getClass();
        ᵎﹳ.ᐧʻ.ᵎˏ(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x05da A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:3:0x0011, B:5:0x001a, B:7:0x001e, B:20:0x0046, B:22:0x004b, B:23:0x004f, B:31:0x0068, B:32:0x006c, B:36:0x007a, B:38:0x0083, B:45:0x009b, B:47:0x00b2, B:48:0x00c9, B:49:0x00e0, B:50:0x00f7, B:51:0x010e, B:52:0x0128, B:53:0x0140, B:54:0x0150, B:55:0x0166, B:56:0x016e, B:57:0x0186, B:58:0x019e, B:59:0x01b6, B:60:0x01ce, B:61:0x01e6, B:62:0x01fe, B:63:0x0216, B:64:0x022e, B:66:0x0237, B:131:0x05d5, B:133:0x05da, B:134:0x05df, B:112:0x0455, B:113:0x046a, B:114:0x0480, B:115:0x0496, B:116:0x04ac, B:117:0x04c2, B:118:0x04db, B:119:0x04f1, B:120:0x0503, B:121:0x051b, B:122:0x0525, B:123:0x053b, B:124:0x0551, B:125:0x0567, B:126:0x057d, B:127:0x0593, B:128:0x05a9, B:129:0x05bf), top: B:147:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0011 A[SYNTHETIC] */
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3099(com.google.crypto.tink.shaded.protobuf.AbstractC0777 r18, java.lang.Object r19, com.google.crypto.tink.shaded.protobuf.C0746 r20, com.google.crypto.tink.shaded.protobuf.C0747 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C0744.m3099(com.google.crypto.tink.shaded.protobuf.ⁱʿ, java.lang.Object, com.google.crypto.tink.shaded.protobuf.ˏʾ, com.google.crypto.tink.shaded.protobuf.ˏᴵ):void");
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final void m3100(Object obj, int i, Object obj2, int i2) {
        f3570.putObject(obj, m3077(i2) & 1048575, obj2);
        m3071(i, i2, obj);
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final int m3101(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, C0654 c0654) throws InvalidProtocolBufferException {
        int iM10396;
        Unsafe unsafe = f3570;
        AbstractC0724 abstractC0724 = (AbstractC0724) ((InterfaceC0780) unsafe.getObject(obj, j2));
        boolean zM2932 = abstractC0724.m2932();
        InterfaceC0780 interfaceC0780 = abstractC0724;
        if (!zM2932) {
            int size = abstractC0724.size();
            InterfaceC0780 interfaceC0780Mo2949 = abstractC0724.mo2949(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, interfaceC0780Mo2949);
            interfaceC0780 = interfaceC0780Mo2949;
        }
        switch (i6) {
            case 18:
            case 35:
                if (i4 == 2) {
                    return AbstractC4535.m10332(bArr, i, interfaceC0780, c0654);
                }
                if (i4 == 1) {
                    return AbstractC4535.m10354(i3, bArr, i, i2, interfaceC0780, c0654);
                }
                break;
            case 19:
            case 36:
                if (i4 == 2) {
                    return AbstractC4535.m10393(bArr, i, interfaceC0780, c0654);
                }
                if (i4 == 5) {
                    return AbstractC4535.m10379(i3, bArr, i, i2, interfaceC0780, c0654);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i4 == 2) {
                    return AbstractC4535.m10373(bArr, i, interfaceC0780, c0654);
                }
                if (i4 == 0) {
                    return AbstractC4535.m10361(i3, bArr, i, i2, interfaceC0780, c0654);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i4 == 2) {
                    return AbstractC4535.m10336(bArr, i, interfaceC0780, c0654);
                }
                if (i4 == 0) {
                    return AbstractC4535.m10396(i3, bArr, i, i2, interfaceC0780, c0654);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i4 == 2) {
                    return AbstractC4535.m10394(bArr, i, interfaceC0780, c0654);
                }
                if (i4 == 1) {
                    return AbstractC4535.m10355(i3, bArr, i, i2, interfaceC0780, c0654);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i4 == 2) {
                    return AbstractC4535.m10345(bArr, i, interfaceC0780, c0654);
                }
                if (i4 == 5) {
                    return AbstractC4535.m10346(i3, bArr, i, i2, interfaceC0780, c0654);
                }
                break;
            case 25:
            case 42:
                if (i4 == 2) {
                    return AbstractC4535.m10388(bArr, i, interfaceC0780, c0654);
                }
                if (i4 == 0) {
                    return AbstractC4535.m10370(i3, bArr, i, i2, interfaceC0780, c0654);
                }
                break;
            case 26:
                if (i4 == 2) {
                    return (j & 536870912) == 0 ? AbstractC4535.m10334(i3, bArr, i, i2, interfaceC0780, c0654) : AbstractC4535.m10383(i3, bArr, i, i2, interfaceC0780, c0654);
                }
                break;
            case 27:
                if (i4 == 2) {
                    return AbstractC4535.m10378(m3081(i5), i3, bArr, i, i2, interfaceC0780, c0654);
                }
                break;
            case 28:
                if (i4 == 2) {
                    return AbstractC4535.m10392(i3, bArr, i, i2, interfaceC0780, c0654);
                }
                break;
            case 30:
            case 44:
                if (i4 == 2) {
                    iM10396 = AbstractC4535.m10336(bArr, i, interfaceC0780, c0654);
                } else if (i4 == 0) {
                    iM10396 = AbstractC4535.m10396(i3, bArr, i, i2, interfaceC0780, c0654);
                }
                m3088(i5);
                Class cls = AbstractC0734.f3543;
                return iM10396;
            case 33:
            case 47:
                if (i4 == 2) {
                    return AbstractC4535.m10362(bArr, i, interfaceC0780, c0654);
                }
                if (i4 == 0) {
                    return AbstractC4535.m10333(i3, bArr, i, i2, interfaceC0780, c0654);
                }
                break;
            case 34:
            case 48:
                if (i4 == 2) {
                    return AbstractC4535.m10389(bArr, i, interfaceC0780, c0654);
                }
                if (i4 == 0) {
                    return AbstractC4535.m10349(i3, bArr, i, i2, interfaceC0780, c0654);
                }
                break;
            case 49:
                if (i4 == 3) {
                    return AbstractC4535.m10350(m3081(i5), i3, bArr, i, i2, interfaceC0780, c0654);
                }
                break;
        }
        return i;
    }
}
