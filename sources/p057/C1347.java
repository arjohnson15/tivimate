package p057;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p070.AbstractC1549;
import p407.InterfaceC4671;
import ⁱـ.ˑי;

/* renamed from: ʾˉ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1347 implements Map, Serializable, InterfaceC4671 {

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static final C1347 f5493;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public C1343 f5494;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object[] f5495;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f5496;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f5497;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int[] f5498;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f5499;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f5500;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int[] f5501;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Object[] f5502;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C1343 f5503;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f5504;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f5505;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public C1349 f5506;

    static {
        C1347 c1347 = new C1347(0);
        c1347.f5499 = true;
        f5493 = c1347;
    }

    public C1347() {
        this(8);
    }

    public C1347(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f5502 = objArr;
        this.f5495 = null;
        this.f5498 = iArr;
        this.f5501 = new int[iHighestOneBit];
        this.f5496 = 2;
        this.f5504 = 0;
        this.f5505 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    @Override // java.util.Map
    public final void clear() {
        m4695();
        int i = this.f5504 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f5498;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f5501[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ˑי.ˎٴ(this.f5502, 0, this.f5504);
        Object[] objArr = this.f5495;
        if (objArr != null) {
            ˑי.ˎٴ(objArr, 0, this.f5504);
        }
        this.f5500 = 0;
        this.f5504 = 0;
        this.f5497++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m4702(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.f5504;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.f5498[i2] >= 0 && AbstractC1549.m5138(this.f5495[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        return i >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1343 c1343 = this.f5494;
        if (c1343 != null) {
            return c1343;
        }
        C1343 c13432 = new C1343(this, 0);
        this.f5494 = c13432;
        return c13432;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f5500 != map.size() || !m4696(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM4702 = m4702(obj);
        if (iM4702 < 0) {
            return null;
        }
        return this.f5495[iM4702];
    }

    @Override // java.util.Map
    public final int hashCode() {
        C1348 c1348 = new C1348(this, 0);
        int i = 0;
        while (c1348.hasNext()) {
            int i2 = c1348.f5492;
            C1347 c1347 = (C1347) c1348.f5491;
            if (i2 >= c1347.f5504) {
                throw new NoSuchElementException();
            }
            c1348.f5492 = i2 + 1;
            c1348.f5489 = i2;
            Object obj = c1347.f5502[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = c1347.f5495[c1348.f5489];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c1348.m4693();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f5500 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1343 c1343 = this.f5503;
        if (c1343 != null) {
            return c1343;
        }
        C1343 c13432 = new C1343(this, 1);
        this.f5503 = c13432;
        return c13432;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m4695();
        int iM4700 = m4700(obj);
        Object[] objArr = this.f5495;
        if (objArr == null) {
            int length = this.f5502.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f5495 = objArr;
        }
        if (iM4700 >= 0) {
            objArr[iM4700] = obj2;
            return null;
        }
        int i = (-iM4700) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m4695();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m4701(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM4700 = m4700(entry.getKey());
            Object[] objArr = this.f5495;
            if (objArr == null) {
                int length = this.f5502.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f5495 = objArr;
            }
            if (iM4700 >= 0) {
                objArr[iM4700] = entry.getValue();
            } else {
                int i = (-iM4700) - 1;
                if (!AbstractC1549.m5138(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m4695();
        int iM4702 = m4702(obj);
        if (iM4702 < 0) {
            return null;
        }
        Object obj2 = this.f5495[iM4702];
        m4697(iM4702);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5500;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f5500 * 3) + 2);
        sb.append("{");
        C1348 c1348 = new C1348(this, 0);
        int i = 0;
        while (c1348.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c1348.f5492;
            C1347 c1347 = (C1347) c1348.f5491;
            if (i2 >= c1347.f5504) {
                throw new NoSuchElementException();
            }
            c1348.f5492 = i2 + 1;
            c1348.f5489 = i2;
            Object obj = c1347.f5502[i2];
            if (obj == c1347) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = c1347.f5495[c1348.f5489];
            if (obj2 == c1347) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c1348.m4693();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C1349 c1349 = this.f5506;
        if (c1349 != null) {
            return c1349;
        }
        C1349 c13492 = new C1349(this);
        this.f5506 = c13492;
        return c13492;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m4695() {
        if (this.f5499) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m4696(Collection collection) {
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM4702 = m4702(entry.getKey());
                    if (!(iM4702 < 0 ? false : AbstractC1549.m5138(this.f5495[iM4702], entry.getValue()))) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x001f->B:33:?, LOOP_END, SYNTHETIC] */
    /* renamed from: ˉי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4697(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f5502
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f5495
            if (r0 == 0) goto Lb
            r0[r12] = r1
        Lb:
            int[] r0 = r11.f5498
            r0 = r0[r12]
            int r1 = r11.f5496
            int r1 = r1 * 2
            int[] r2 = r11.f5501
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1b
            r1 = r2
        L1b:
            r2 = 0
            r3 = r1
            r4 = 0
            r1 = r0
        L1f:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L29
            int[] r0 = r11.f5501
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2a
        L29:
            r0 = r5
        L2a:
            int r4 = r4 + 1
            int r5 = r11.f5496
            r6 = -1
            if (r4 <= r5) goto L36
            int[] r0 = r11.f5501
            r0[r1] = r2
            goto L67
        L36:
            int[] r5 = r11.f5501
            r7 = r5[r0]
            if (r7 != 0) goto L3f
            r5[r1] = r2
            goto L67
        L3f:
            if (r7 >= 0) goto L46
            r5[r1] = r6
        L43:
            r1 = r0
            r4 = 0
            goto L60
        L46:
            java.lang.Object[] r5 = r11.f5502
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.m4698(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f5501
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L60
            r9[r1] = r7
            int[] r4 = r11.f5498
            r4[r8] = r1
            goto L43
        L60:
            int r3 = r3 + r6
            if (r3 >= 0) goto L1f
            int[] r0 = r11.f5501
            r0[r1] = r6
        L67:
            int[] r0 = r11.f5498
            r0[r12] = r6
            int r12 = r11.f5500
            int r12 = r12 + r6
            r11.f5500 = r12
            int r12 = r11.f5497
            int r12 = r12 + 1
            r11.f5497 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p057.C1347.m4697(int):void");
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int m4698(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f5505;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m4699(boolean z) {
        int i;
        Object[] objArr = this.f5495;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f5504;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f5498;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f5502;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f5501[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        ˑי.ˎٴ(this.f5502, i3, i);
        if (objArr != null) {
            ˑי.ˎٴ(objArr, i3, this.f5504);
        }
        this.f5504 = i3;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m4700(Object obj) {
        m4695();
        while (true) {
            int iM4698 = m4698(obj);
            int i = this.f5496 * 2;
            int length = this.f5501.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f5501;
                int i3 = iArr[iM4698];
                if (i3 <= 0) {
                    int i4 = this.f5504;
                    Object[] objArr = this.f5502;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f5504 = i5;
                        objArr[i4] = obj;
                        this.f5498[i4] = iM4698;
                        iArr[iM4698] = i5;
                        this.f5500++;
                        this.f5497++;
                        if (i2 > this.f5496) {
                            this.f5496 = i2;
                        }
                        return i4;
                    }
                    m4701(1);
                } else {
                    if (AbstractC1549.m5138(this.f5502[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        m4703(this.f5501.length * 2);
                        break;
                    }
                    iM4698 = iM4698 == 0 ? this.f5501.length - 1 : iM4698 - 1;
                }
            }
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m4701(int i) {
        Object[] objArr = this.f5502;
        int length = objArr.length;
        int i2 = this.f5504;
        int i3 = length - i2;
        int i4 = i2 - this.f5500;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m4699(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f5502 = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f5495;
            this.f5495 = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f5498 = Arrays.copyOf(this.f5498, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f5501.length) {
                m4703(iHighestOneBit);
            }
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int m4702(Object obj) {
        int iM4698 = m4698(obj);
        int i = this.f5496;
        while (true) {
            int i2 = this.f5501[iM4698];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (AbstractC1549.m5138(this.f5502[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM4698 = iM4698 == 0 ? this.f5501.length - 1 : iM4698 - 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f5498[r2] = r0;
        r2 = r6;
     */
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4703(int r6) {
        /*
            r5 = this;
            int r0 = r5.f5497
            int r0 = r0 + 1
            r5.f5497 = r0
            int r0 = r5.f5504
            int r1 = r5.f5500
            r2 = 0
            if (r0 <= r1) goto L10
            r5.m4699(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f5501 = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f5505 = r6
        L1c:
            int r6 = r5.f5504
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f5502
            r0 = r0[r2]
            int r0 = r5.m4698(r0)
            int r1 = r5.f5496
        L2c:
            int[] r3 = r5.f5501
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f5498
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p057.C1347.m4703(int):void");
    }
}
