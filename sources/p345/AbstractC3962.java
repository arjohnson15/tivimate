package p345;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ᵎᴵ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3962 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f15332;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f15333;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object[] f15334;

    public AbstractC3962(int i) {
        AbstractC3968.m9177(i, "initialCapacity");
        this.f15334 = new Object[i];
        this.f15332 = 0;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m9169(int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9170(Object... objArr) {
        int length = objArr.length;
        AbstractC3968.m9187(length, objArr);
        m9173(this.f15332 + length);
        System.arraycopy(objArr, 0, this.f15334, this.f15332, length);
        this.f15332 += length;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m9171(List list) {
        if (list instanceof Collection) {
            List list2 = list;
            m9173(list2.size() + this.f15332);
            if (list2 instanceof AbstractC3927) {
                this.f15332 = ((AbstractC3927) list2).mo9119(this.f15332, this.f15334);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo9168(it.next());
        }
    }

    /* renamed from: ˑʽ */
    public abstract AbstractC3962 mo9168(Object obj);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9172(Object obj) {
        obj.getClass();
        m9173(this.f15332 + 1);
        Object[] objArr = this.f15334;
        int i = this.f15332;
        this.f15332 = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m9173(int i) {
        Object[] objArr = this.f15334;
        if (objArr.length < i) {
            this.f15334 = Arrays.copyOf(objArr, m9169(objArr.length, i));
            this.f15333 = false;
        } else if (this.f15333) {
            this.f15334 = (Object[]) objArr.clone();
            this.f15333 = false;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m9174(Object obj) {
        m9172(obj);
    }
}
