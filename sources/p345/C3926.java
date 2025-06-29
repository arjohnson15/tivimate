package p345;

import android.support.v4.media.session.AbstractC0001;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import ⁱـ.ˑי;

/* renamed from: ᵎᴵ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3926 extends AbstractMap implements Serializable {

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final Object f15251 = new Object();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public transient int[] f15252;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public transient int f15253;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public transient C3967 f15254;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public transient Object[] f15255;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public transient C3964 f15256;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public transient Object[] f15257;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public transient Object f15258;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public transient int f15259;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public transient C3967 f15260;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C3926 m9124(int i) {
        C3926 c3926 = new C3926();
        if (i < 0) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        c3926.f15253 = AbstractC0001.m6(i, 1);
        return c3926;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3926 m9125() {
        C3926 c3926 = new C3926();
        c3926.f15253 = AbstractC0001.m6(3, 1);
        return c3926;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m9131()) {
            return;
        }
        this.f15253 += 32;
        Map mapM9132 = m9132();
        if (mapM9132 != null) {
            this.f15253 = AbstractC0001.m6(size(), 3);
            mapM9132.clear();
            this.f15258 = null;
            this.f15259 = 0;
            return;
        }
        Arrays.fill(m9130(), 0, this.f15259, (Object) null);
        Arrays.fill(m9128(), 0, this.f15259, (Object) null);
        Object obj = this.f15258;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m9127(), 0, this.f15259, 0);
        this.f15259 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM9132 = m9132();
        return mapM9132 != null ? mapM9132.containsKey(obj) : m9133(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM9132 = m9132();
        if (mapM9132 != null) {
            return mapM9132.containsValue(obj);
        }
        for (int i = 0; i < this.f15259; i++) {
            if (ˑי.ﹶˆ(obj, m9128()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C3967 c3967 = this.f15254;
        if (c3967 != null) {
            return c3967;
        }
        C3967 c39672 = new C3967(this, 0);
        this.f15254 = c39672;
        return c39672;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM9132 = m9132();
        if (mapM9132 != null) {
            return mapM9132.get(obj);
        }
        int iM9133 = m9133(obj);
        if (iM9133 == -1) {
            return null;
        }
        return m9128()[iM9133];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C3967 c3967 = this.f15260;
        if (c3967 != null) {
            return c3967;
        }
        C3967 c39672 = new C3967(this, 1);
        this.f15260 = c39672;
        return c39672;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f3 -> B:33:0x00db). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object put(java.lang.Object r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p345.C3926.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM9132 = m9132();
        if (mapM9132 != null) {
            return mapM9132.remove(obj);
        }
        Object objM9135 = m9135(obj);
        if (objM9135 == f15251) {
            return null;
        }
        return objM9135;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM9132 = m9132();
        return mapM9132 != null ? mapM9132.size() : this.f15259;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C3964 c3964 = this.f15256;
        if (c3964 != null) {
            return c3964;
        }
        C3964 c39642 = new C3964(1, this);
        this.f15256 = c39642;
        return c39642;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m9126() {
        return (1 << (this.f15253 & 31)) - 1;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int[] m9127() {
        int[] iArr = this.f15252;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final Object[] m9128() {
        Object[] objArr = this.f15257;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int m9129(int i, int i2, int i3, int i4) {
        Object objM9189 = AbstractC3968.m9189(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            AbstractC3968.m9197(i3 & i5, i4 + 1, objM9189);
        }
        Object obj = this.f15258;
        Objects.requireNonNull(obj);
        int[] iArrM9127 = m9127();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM9181 = AbstractC3968.m9181(i6, obj);
            while (iM9181 != 0) {
                int i7 = iM9181 - 1;
                int i8 = iArrM9127[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM91812 = AbstractC3968.m9181(i10, objM9189);
                AbstractC3968.m9197(i10, iM9181, objM9189);
                iArrM9127[i7] = AbstractC3968.m9185(i9, iM91812, i5);
                iM9181 = i8 & i;
            }
        }
        this.f15258 = objM9189;
        this.f15253 = AbstractC3968.m9185(this.f15253, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final Object[] m9130() {
        Object[] objArr = this.f15255;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m9131() {
        return this.f15258 == null;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Map m9132() {
        Object obj = this.f15258;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int m9133(Object obj) {
        if (m9131()) {
            return -1;
        }
        int iM9178 = AbstractC3968.m9178(obj);
        int iM9126 = m9126();
        Object obj2 = this.f15258;
        Objects.requireNonNull(obj2);
        int iM9181 = AbstractC3968.m9181(iM9178 & iM9126, obj2);
        if (iM9181 == 0) {
            return -1;
        }
        int i = ~iM9126;
        int i2 = iM9178 & i;
        do {
            int i3 = iM9181 - 1;
            int i4 = m9127()[i3];
            if ((i4 & i) == i2 && ˑי.ﹶˆ(obj, m9130()[i3])) {
                return i3;
            }
            iM9181 = i4 & iM9126;
        } while (iM9181 != 0);
        return -1;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m9134(int i, int i2) {
        Object obj = this.f15258;
        Objects.requireNonNull(obj);
        int[] iArrM9127 = m9127();
        Object[] objArrM9130 = m9130();
        Object[] objArrM9128 = m9128();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrM9130[i] = null;
            objArrM9128[i] = null;
            iArrM9127[i] = 0;
            return;
        }
        Object obj2 = objArrM9130[i3];
        objArrM9130[i] = obj2;
        objArrM9128[i] = objArrM9128[i3];
        objArrM9130[i3] = null;
        objArrM9128[i3] = null;
        iArrM9127[i] = iArrM9127[i3];
        iArrM9127[i3] = 0;
        int iM9178 = AbstractC3968.m9178(obj2) & i2;
        int iM9181 = AbstractC3968.m9181(iM9178, obj);
        if (iM9181 == size) {
            AbstractC3968.m9197(iM9178, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iM9181 - 1;
            int i5 = iArrM9127[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrM9127[i4] = AbstractC3968.m9185(i5, i + 1, i2);
                return;
            }
            iM9181 = i6;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Object m9135(Object obj) {
        boolean zM9131 = m9131();
        Object obj2 = f15251;
        if (zM9131) {
            return obj2;
        }
        int iM9126 = m9126();
        Object obj3 = this.f15258;
        Objects.requireNonNull(obj3);
        int iM9183 = AbstractC3968.m9183(obj, null, iM9126, obj3, m9127(), m9130(), null);
        if (iM9183 == -1) {
            return obj2;
        }
        Object obj4 = m9128()[iM9183];
        m9134(iM9183, iM9126);
        this.f15259--;
        this.f15253 += 32;
        return obj4;
    }
}
