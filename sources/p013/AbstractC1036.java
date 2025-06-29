package p013;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p034.C1228;
import ˏʼ.ʽᐧ;

/* renamed from: ʻי.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1036 extends ʽᐧ {
    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static Object m3990(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static void m3991(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static void m3992(byte[] bArr) {
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static List m3993(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C1043(objArr, false)) : Collections.singletonList(objArr[0]) : C1053.f4449;
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static void m3994(Object[] objArr, C1228 c1228) {
        Arrays.fill(objArr, 0, objArr.length, c1228);
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static void m3995(int i, int i2, byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, i2 - i);
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static void m3996(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static boolean m3997(Object[] objArr, Object obj) {
        return m3999(objArr, obj) >= 0;
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static boolean m3998(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!m3998((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static int m3999(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static Object m4000(int i, Object[] objArr) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static ArrayList m4001(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static void m4002(long[] jArr) {
        Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public static void m4003(byte[] bArr) {
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = bArr.length - 1;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            byte b = bArr[i];
            bArr[i] = bArr[length2];
            bArr[length2] = b;
            length2--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static void m4004(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }
}
