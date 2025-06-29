package p200;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p013.AbstractC1036;
import p070.AbstractC1549;
import p340.AbstractC3876;

/* renamed from: ˎٴ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2755 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object[] f10777;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f10778;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int[] f10779;

    public C2755(int i) {
        this.f10779 = i == 0 ? AbstractC3876.f14876 : new int[i];
        this.f10777 = i == 0 ? AbstractC3876.f14875 : new Object[i << 1];
    }

    public void clear() {
        if (this.f10778 > 0) {
            this.f10779 = AbstractC3876.f14876;
            this.f10777 = AbstractC3876.f14875;
            this.f10778 = 0;
        }
        if (this.f10778 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m7014(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m7019(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C2755) {
                int i = this.f10778;
                if (i != ((C2755) obj).f10778) {
                    return false;
                }
                C2755 c2755 = (C2755) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM7021 = m7021(i2);
                    Object objM7016 = m7016(i2);
                    Object obj2 = c2755.get(objM7021);
                    if (objM7016 == null) {
                        if (obj2 != null || !c2755.containsKey(objM7021)) {
                            return false;
                        }
                    } else if (!objM7016.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f10778 != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f10778;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM70212 = m7021(i4);
                Object objM70162 = m7016(i4);
                Object obj3 = ((Map) obj).get(objM70212);
                if (objM70162 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM70212)) {
                        return false;
                    }
                } else if (!objM70162.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iM7014 = m7014(obj);
        if (iM7014 >= 0) {
            return this.f10777[(iM7014 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM7014 = m7014(obj);
        return iM7014 >= 0 ? this.f10777[(iM7014 << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f10779;
        Object[] objArr = this.f10777;
        int i = this.f10778;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f10778 <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f10778;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM7018 = obj != null ? m7018(iHashCode, obj) : m7020();
        if (iM7018 >= 0) {
            int i2 = (iM7018 << 1) + 1;
            Object[] objArr = this.f10777;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM7018;
        int[] iArr = this.f10779;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f10779 = Arrays.copyOf(iArr, i4);
            this.f10777 = Arrays.copyOf(this.f10777, i4 << 1);
            if (i != this.f10778) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f10779;
            int i5 = i3 + 1;
            AbstractC1036.m4004(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.f10777;
            AbstractC1036.m3991(i5 << 1, i3 << 1, this.f10778 << 1, objArr2, objArr2);
        }
        int i6 = this.f10778;
        if (i == i6) {
            int[] iArr3 = this.f10779;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f10777;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f10778 = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM7014 = m7014(obj);
        if (iM7014 >= 0) {
            return mo7022(iM7014);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM7014 = m7014(obj);
        if (iM7014 < 0 || !AbstractC1549.m5138(obj2, m7016(iM7014))) {
            return false;
        }
        mo7022(iM7014);
        return true;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM7014 = m7014(obj);
        if (iM7014 >= 0) {
            return mo7015(iM7014, obj2);
        }
        return null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM7014 = m7014(obj);
        if (iM7014 < 0 || !AbstractC1549.m5138(obj2, m7016(iM7014))) {
            return false;
        }
        mo7015(iM7014, obj3);
        return true;
    }

    public final int size() {
        return this.f10778;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10778 * 28);
        sb.append('{');
        int i = this.f10778;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM7021 = m7021(i2);
            if (objM7021 != sb) {
                sb.append(objM7021);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM7016 = m7016(i2);
            if (objM7016 != sb) {
                sb.append(objM7016);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7013(int i) {
        int i2 = this.f10778;
        int[] iArr = this.f10779;
        if (iArr.length < i) {
            this.f10779 = Arrays.copyOf(iArr, i);
            this.f10777 = Arrays.copyOf(this.f10777, i * 2);
        }
        if (this.f10778 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m7014(Object obj) {
        return obj == null ? m7020() : m7018(obj.hashCode(), obj);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public Object mo7015(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.f10778) {
            z = true;
        }
        if (!z) {
            AbstractC3876.m9071("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f10777;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final Object m7016(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f10778) {
            z = true;
        }
        if (z) {
            return this.f10777[(i << 1) + 1];
        }
        AbstractC3876.m9071("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void mo7017(C2741 c2741) {
        int i = c2741.f10778;
        m7013(this.f10778 + i);
        if (this.f10778 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c2741.m7021(i2), c2741.m7016(i2));
            }
        } else if (i > 0) {
            AbstractC1036.m4004(0, 0, i, c2741.f10779, this.f10779);
            AbstractC1036.m3991(0, 0, i << 1, c2741.f10777, this.f10777);
            this.f10778 = i;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m7018(int i, Object obj) {
        int i2 = this.f10778;
        if (i2 == 0) {
            return -1;
        }
        int iM9072 = AbstractC3876.m9072(i2, i, this.f10779);
        if (iM9072 < 0 || AbstractC1549.m5138(obj, this.f10777[iM9072 << 1])) {
            return iM9072;
        }
        int i3 = iM9072 + 1;
        while (i3 < i2 && this.f10779[i3] == i) {
            if (AbstractC1549.m5138(obj, this.f10777[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM9072 - 1; i4 >= 0 && this.f10779[i4] == i; i4--) {
            if (AbstractC1549.m5138(obj, this.f10777[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m7019(Object obj) {
        int i = this.f10778 * 2;
        Object[] objArr = this.f10777;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int m7020() {
        int i = this.f10778;
        if (i == 0) {
            return -1;
        }
        int iM9072 = AbstractC3876.m9072(i, 0, this.f10779);
        if (iM9072 < 0 || this.f10777[iM9072 << 1] == null) {
            return iM9072;
        }
        int i2 = iM9072 + 1;
        while (i2 < i && this.f10779[i2] == 0) {
            if (this.f10777[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM9072 - 1; i3 >= 0 && this.f10779[i3] == 0; i3--) {
            if (this.f10777[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object m7021(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f10778) {
            z = true;
        }
        if (z) {
            return this.f10777[i << 1];
        }
        AbstractC3876.m9071("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public Object mo7022(int i) {
        if (!(i >= 0 && i < this.f10778)) {
            AbstractC3876.m9071("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f10777;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f10778;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f10779;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    AbstractC1036.m4004(i, i5, i3, iArr, iArr);
                    Object[] objArr2 = this.f10777;
                    AbstractC1036.m3991(i2, i5 << 1, i3 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f10777;
                int i6 = i4 << 1;
                objArr3[i6] = null;
                objArr3[i6 + 1] = null;
            } else {
                int i7 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                this.f10779 = Arrays.copyOf(iArr, i7);
                this.f10777 = Arrays.copyOf(this.f10777, i7 << 1);
                if (i3 != this.f10778) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    AbstractC1036.m4004(0, 0, i, iArr, this.f10779);
                    AbstractC1036.m3991(0, 0, i2, objArr, this.f10777);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    AbstractC1036.m4004(i, i8, i3, iArr, this.f10779);
                    AbstractC1036.m3991(i2, i8 << 1, i3 << 1, objArr, this.f10777);
                }
            }
            if (i3 != this.f10778) {
                throw new ConcurrentModificationException();
            }
            this.f10778 = i4;
        }
        return obj;
    }
}
