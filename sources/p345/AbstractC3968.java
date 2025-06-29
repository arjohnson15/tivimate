package p345;

import android.support.v4.media.session.AbstractC0001;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import p353.C4023;
import p353.InterfaceC4016;
import p353.InterfaceC4019;
import ˏᵢ.ᵢٴ;
import ـˈ.ˉᵎ;
import ⁱـ.ˑי;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵎᴵ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3968 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m9176(int i) {
        if (i < 3) {
            m9177(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m9177(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static int m9178(Object obj) {
        return m9193(obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static C3969 m9179(Set set, InterfaceC4016 interfaceC4016) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C3969)) {
                set.getClass();
                return new C3969(set, interfaceC4016);
            }
            C3969 c3969 = (C3969) set;
            InterfaceC4016 interfaceC40162 = c3969.f15340;
            interfaceC40162.getClass();
            return new C3969(c3969.f15341, new C4023(Arrays.asList(interfaceC40162, interfaceC4016)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof C3969)) {
            set2.getClass();
            return new C3966(set2, interfaceC4016);
        }
        C3969 c39692 = (C3969) set2;
        InterfaceC4016 interfaceC40163 = c39692.f15340;
        interfaceC40163.getClass();
        return new C3966((SortedSet) c39692.f15341, new C4023(Arrays.asList(interfaceC40163, interfaceC4016)));
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static Object m9180(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static int m9181(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static int m9182(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static int m9183(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iM9178 = m9178(obj);
        int i4 = iM9178 & i;
        int iM9181 = m9181(i4, obj3);
        if (iM9181 == 0) {
            return -1;
        }
        int i5 = ~i;
        int i6 = iM9178 & i5;
        int i7 = -1;
        while (true) {
            i2 = iM9181 - 1;
            i3 = iArr[i2];
            if ((i3 & i5) == i6 && ˑי.ﹶˆ(obj, objArr[i2]) && (objArr2 == null || ˑי.ﹶˆ(obj2, objArr2[i2]))) {
                break;
            }
            int i8 = i3 & i;
            if (i8 == 0) {
                return -1;
            }
            i7 = i2;
            iM9181 = i8;
        }
        int i9 = i3 & i;
        if (i7 == -1) {
            m9197(i4, i9, obj3);
        } else {
            iArr[i7] = m9185(iArr[i7], i9, i);
        }
        return i2;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static Object m9184(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static int m9185(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static boolean m9186(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m9187(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(ˉᵎ.ˉⁱ("at index ", i2));
            }
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static ArrayList m9188(Object... objArr) {
        int length = objArr.length;
        m9177(length, "arraySize");
        ArrayList arrayList = new ArrayList(AbstractC0001.m20(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static Object m9189(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("must be power of 2 between 2^1 and 2^30: ", i));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static C3955 m9190(AbstractC3985 abstractC3985, AbstractC3985 abstractC39852) {
        ـﹶ.ˏᵢ(abstractC3985, "set1");
        ـﹶ.ˏᵢ(abstractC39852, "set2");
        return new C3955(abstractC3985, abstractC39852);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static void m9191(List list, InterfaceC4016 interfaceC4016, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (interfaceC4016.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static int m9192(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static int m9193(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m9194(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static boolean m9195(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static AbstractList m9196(List list, InterfaceC4019 interfaceC4019) {
        return list instanceof RandomAccess ? new C3942(list, interfaceC4019) : new C3972(list, interfaceC4019);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static void m9197(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ᵢٴ m9198() {
        m9177(2, "expectedValuesPerKey");
        return new ᵢٴ(14, this);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public abstract Map mo9199();
}
