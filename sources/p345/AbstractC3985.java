package p345;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import ـˈ.ˉᵎ;

/* renamed from: ᵎᴵ.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3985 extends AbstractC3927 implements Set {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final /* synthetic */ int f15365 = 0;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public transient AbstractC3980 f15366;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static AbstractC3985 m9215(int i, Object... objArr) {
        if (i == 0) {
            return C3921.f15237;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C3948(obj);
        }
        int iM9216 = m9216(i);
        Object[] objArr2 = new Object[iM9216];
        int i2 = iM9216 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(ˉᵎ.ˉⁱ("at index ", i5));
            }
            int iHashCode = obj2.hashCode();
            int iM9193 = AbstractC3968.m9193(iHashCode);
            while (true) {
                int i6 = iM9193 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM9193++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C3948(obj4);
        }
        if (m9216(i4) < iM9216 / 2) {
            return m9215(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C3921(i3, i2, i4, objArr, objArr2);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static int m9216(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static AbstractC3985 m9217(Collection collection) {
        if ((collection instanceof AbstractC3985) && !(collection instanceof SortedSet)) {
            AbstractC3985 abstractC3985 = (AbstractC3985) collection;
            if (!abstractC3985.mo9116()) {
                return abstractC3985;
            }
        }
        Object[] array = collection.toArray();
        return m9215(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC3985) && (this instanceof C3921)) {
            AbstractC3985 abstractC3985 = (AbstractC3985) obj;
            abstractC3985.getClass();
            if ((abstractC3985 instanceof C3921) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC3968.m9195(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC3968.m9182(this);
    }

    /* renamed from: ﹳˎ */
    public AbstractC3980 mo9121() {
        Object[] array = toArray(AbstractC3927.f15261);
        C3928 c3928 = AbstractC3980.f15360;
        return AbstractC3980.m9206(array.length, array);
    }

    @Override // p345.AbstractC3927
    /* renamed from: ﹳﹳ */
    public AbstractC3980 mo9136() {
        AbstractC3980 abstractC3980 = this.f15366;
        if (abstractC3980 != null) {
            return abstractC3980;
        }
        AbstractC3980 abstractC3980Mo9121 = mo9121();
        this.f15366 = abstractC3980Mo9121;
        return abstractC3980Mo9121;
    }
}
