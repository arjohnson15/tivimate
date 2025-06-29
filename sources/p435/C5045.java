package p435;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import p200.C2753;
import ʽᵔ.ʽⁱ;

/* renamed from: ﹶᵔ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5045 extends AbstractMap implements Serializable {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final ʽⁱ f19137 = new ʽⁱ(20);

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public C5062 f19140;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public C5062 f19145;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f19142 = 0;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f19139 = 0;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Comparator f19143 = f19137;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C5040 f19141 = new C5040();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C5040[] f19138 = new C5040[16];

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f19144 = 12;

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f19138, (Object) null);
        this.f19142 = 0;
        this.f19139++;
        C5040 c5040 = this.f19141;
        C5040 c50402 = c5040.f19126;
        while (c50402 != c5040) {
            C5040 c50403 = c50402.f19126;
            c50402.f19122 = null;
            c50402.f19126 = null;
            c50402 = c50403;
        }
        c5040.f19122 = c5040;
        c5040.f19126 = c5040;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C5040 c5040M11163 = null;
        if (obj != null) {
            try {
                c5040M11163 = m11163(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c5040M11163 != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C5062 c5062 = this.f19145;
        if (c5062 != null) {
            return c5062;
        }
        C5062 c50622 = new C5062(this, 0);
        this.f19145 = c50622;
        return c50622;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C5040 c5040M11163;
        if (obj != null) {
            try {
                c5040M11163 = m11163(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            c5040M11163 = null;
        }
        if (c5040M11163 != null) {
            return c5040M11163.f19123;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C5062 c5062 = this.f19140;
        if (c5062 != null) {
            return c5062;
        }
        C5062 c50622 = new C5062(this, 1);
        this.f19140 = c50622;
        return c50622;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        C5040 c5040M11163 = m11163(obj, true);
        Object obj3 = c5040M11163.f19123;
        c5040M11163.f19123 = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C5040 c5040M11163;
        if (obj != null) {
            try {
                c5040M11163 = m11163(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            c5040M11163 = null;
        }
        if (c5040M11163 != null) {
            m11162(c5040M11163, true);
        }
        if (c5040M11163 != null) {
            return c5040M11163.f19123;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19142;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11160(C5040 c5040, boolean z) {
        while (c5040 != null) {
            C5040 c50402 = c5040.f19121;
            C5040 c50403 = c5040.f19124;
            int i = c50402 != null ? c50402.f19125 : 0;
            int i2 = c50403 != null ? c50403.f19125 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C5040 c50404 = c50403.f19121;
                C5040 c50405 = c50403.f19124;
                int i4 = (c50404 != null ? c50404.f19125 : 0) - (c50405 != null ? c50405.f19125 : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    m11165(c50403);
                }
                m11164(c5040);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C5040 c50406 = c50402.f19121;
                C5040 c50407 = c50402.f19124;
                int i5 = (c50406 != null ? c50406.f19125 : 0) - (c50407 != null ? c50407.f19125 : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    m11164(c50402);
                }
                m11165(c5040);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c5040.f19125 = i + 1;
                if (z) {
                    return;
                }
            } else {
                c5040.f19125 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c5040 = c5040.f19127;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m11161(C5040 c5040, C5040 c50402) {
        C5040 c50403 = c5040.f19127;
        c5040.f19127 = null;
        if (c50402 != null) {
            c50402.f19127 = c50403;
        }
        if (c50403 == null) {
            this.f19138[c5040.f19129 & (r0.length - 1)] = c50402;
        } else if (c50403.f19121 == c5040) {
            c50403.f19121 = c50402;
        } else {
            c50403.f19124 = c50402;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m11162(C5040 c5040, boolean z) {
        C5040 c50402;
        C5040 c50403;
        int i;
        if (z) {
            C5040 c50404 = c5040.f19122;
            c50404.f19126 = c5040.f19126;
            c5040.f19126.f19122 = c50404;
            c5040.f19122 = null;
            c5040.f19126 = null;
        }
        C5040 c50405 = c5040.f19121;
        C5040 c50406 = c5040.f19124;
        C5040 c50407 = c5040.f19127;
        int i2 = 0;
        if (c50405 == null || c50406 == null) {
            if (c50405 != null) {
                m11161(c5040, c50405);
                c5040.f19121 = null;
            } else if (c50406 != null) {
                m11161(c5040, c50406);
                c5040.f19124 = null;
            } else {
                m11161(c5040, null);
            }
            m11160(c50407, false);
            this.f19142--;
            this.f19139++;
            return;
        }
        if (c50405.f19125 > c50406.f19125) {
            C5040 c50408 = c50405.f19124;
            while (true) {
                C5040 c50409 = c50408;
                c50403 = c50405;
                c50405 = c50409;
                if (c50405 == null) {
                    break;
                } else {
                    c50408 = c50405.f19124;
                }
            }
        } else {
            C5040 c504010 = c50406.f19121;
            while (true) {
                c50402 = c50406;
                c50406 = c504010;
                if (c50406 == null) {
                    break;
                } else {
                    c504010 = c50406.f19121;
                }
            }
            c50403 = c50402;
        }
        m11162(c50403, false);
        C5040 c504011 = c5040.f19121;
        if (c504011 != null) {
            i = c504011.f19125;
            c50403.f19121 = c504011;
            c504011.f19127 = c50403;
            c5040.f19121 = null;
        } else {
            i = 0;
        }
        C5040 c504012 = c5040.f19124;
        if (c504012 != null) {
            i2 = c504012.f19125;
            c50403.f19124 = c504012;
            c504012.f19127 = c50403;
            c5040.f19124 = null;
        }
        c50403.f19125 = Math.max(i, i2) + 1;
        m11161(c5040, c50403);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5040 m11163(Object obj, boolean z) {
        C5040 c5040;
        int i;
        C5040 c50402;
        C5040 c50403;
        C5040 c50404;
        C5040 c50405;
        C5040 c50406;
        C5040 c50407;
        C5040[] c5040Arr = this.f19138;
        int iHashCode = obj.hashCode();
        int i2 = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i3 = ((i2 >>> 7) ^ i2) ^ (i2 >>> 4);
        int length = i3 & (c5040Arr.length - 1);
        C5040 c50408 = c5040Arr[length];
        Comparator comparator = f19137;
        C5040 c50409 = null;
        Comparator comparator2 = this.f19143;
        if (c50408 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c50408.f19128;
                int iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator2.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c50408;
                }
                C5040 c504010 = iCompareTo < 0 ? c50408.f19121 : c50408.f19124;
                if (c504010 == null) {
                    i = iCompareTo;
                    c5040 = c50408;
                    break;
                }
                c50408 = c504010;
            }
        } else {
            c5040 = c50408;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C5040 c504011 = this.f19141;
        if (c5040 != null) {
            C5040 c504012 = new C5040(c5040, obj, i3, c504011, c504011.f19122);
            if (i < 0) {
                c5040.f19121 = c504012;
            } else {
                c5040.f19124 = c504012;
            }
            m11160(c5040, true);
            c50402 = c504012;
        } else {
            if (comparator2 == comparator && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c50402 = new C5040(c5040, obj, i3, c504011, c504011.f19122);
            c5040Arr[length] = c50402;
        }
        int i4 = this.f19142;
        this.f19142 = i4 + 1;
        if (i4 > this.f19144) {
            C5040[] c5040Arr2 = this.f19138;
            int length2 = c5040Arr2.length;
            int i5 = length2 * 2;
            C5040[] c5040Arr3 = new C5040[i5];
            C2753 c2753 = new C2753(3);
            C2753 c27532 = new C2753(3);
            int i6 = 0;
            while (i6 < length2) {
                C5040 c504013 = c5040Arr2[i6];
                if (c504013 == null) {
                    c50404 = c50409;
                } else {
                    C5040 c504014 = c50409;
                    for (C5040 c504015 = c504013; c504015 != null; c504015 = c504015.f19121) {
                        c504015.f19127 = c504014;
                        c504014 = c504015;
                    }
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (c504014 != null) {
                            C5040 c504016 = c504014.f19127;
                            c504014.f19127 = c50409;
                            C5040 c504017 = c504014.f19124;
                            while (true) {
                                C5040 c504018 = c504016;
                                c504016 = c504017;
                                c50403 = c504018;
                                if (c504016 == null) {
                                    break;
                                }
                                c504016.f19127 = c50403;
                                c504017 = c504016.f19121;
                            }
                        } else {
                            C5040 c504019 = c504014;
                            c504014 = c50409;
                            c50403 = c504019;
                        }
                        if (c504014 == null) {
                            break;
                        }
                        if ((c504014.f19129 & length2) == 0) {
                            i7++;
                        } else {
                            i8++;
                        }
                        c504014 = c50403;
                        c50409 = null;
                    }
                    c2753.f10766 = ((Integer.highestOneBit(i7) * 2) - 1) - i7;
                    c2753.f10770 = 0;
                    c2753.f10768 = 0;
                    c50404 = null;
                    c2753.f10767 = null;
                    c27532.f10766 = ((Integer.highestOneBit(i8) * 2) - 1) - i8;
                    c27532.f10770 = 0;
                    c27532.f10768 = 0;
                    c27532.f10767 = null;
                    C5040 c504020 = null;
                    while (c504013 != null) {
                        c504013.f19127 = c504020;
                        c504020 = c504013;
                        c504013 = c504013.f19121;
                    }
                    while (true) {
                        if (c504020 != null) {
                            C5040 c504021 = c504020.f19127;
                            c504020.f19127 = null;
                            C5040 c504022 = c504020.f19124;
                            while (true) {
                                C5040 c504023 = c504022;
                                c50405 = c504021;
                                c504021 = c504023;
                                if (c504021 == null) {
                                    break;
                                }
                                c504021.f19127 = c50405;
                                c504022 = c504021.f19121;
                            }
                        } else {
                            c50405 = c504020;
                            c504020 = null;
                        }
                        if (c504020 == null) {
                            break;
                        }
                        if ((c504020.f19129 & length2) == 0) {
                            c2753.m7005(c504020);
                        } else {
                            c27532.m7005(c504020);
                        }
                        c504020 = c50405;
                    }
                    if (i7 > 0) {
                        c50406 = (C5040) c2753.f10767;
                        if (c50406.f19127 != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c50406 = null;
                    }
                    c5040Arr3[i6] = c50406;
                    int i9 = i6 + length2;
                    if (i8 > 0) {
                        c50407 = (C5040) c27532.f10767;
                        if (c50407.f19127 != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c50407 = null;
                    }
                    c5040Arr3[i9] = c50407;
                }
                i6++;
                c50409 = c50404;
            }
            this.f19138 = c5040Arr3;
            this.f19144 = (i5 / 4) + (i5 / 2);
        }
        this.f19139++;
        return c50402;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m11164(C5040 c5040) {
        C5040 c50402 = c5040.f19121;
        C5040 c50403 = c5040.f19124;
        C5040 c50404 = c50403.f19121;
        C5040 c50405 = c50403.f19124;
        c5040.f19124 = c50404;
        if (c50404 != null) {
            c50404.f19127 = c5040;
        }
        m11161(c5040, c50403);
        c50403.f19121 = c5040;
        c5040.f19127 = c50403;
        int iMax = Math.max(c50402 != null ? c50402.f19125 : 0, c50404 != null ? c50404.f19125 : 0) + 1;
        c5040.f19125 = iMax;
        c50403.f19125 = Math.max(iMax, c50405 != null ? c50405.f19125 : 0) + 1;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m11165(C5040 c5040) {
        C5040 c50402 = c5040.f19121;
        C5040 c50403 = c5040.f19124;
        C5040 c50404 = c50402.f19121;
        C5040 c50405 = c50402.f19124;
        c5040.f19121 = c50405;
        if (c50405 != null) {
            c50405.f19127 = c5040;
        }
        m11161(c5040, c50402);
        c50402.f19124 = c5040;
        c5040.f19127 = c50402;
        int iMax = Math.max(c50403 != null ? c50403.f19125 : 0, c50405 != null ? c50405.f19125 : 0) + 1;
        c5040.f19125 = iMax;
        c50402.f19125 = Math.max(iMax, c50404 != null ? c50404.f19125 : 0) + 1;
    }
}
