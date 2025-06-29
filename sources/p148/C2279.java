package p148;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p072.AbstractRunnableC1644;
import p072.C1581;

/* renamed from: ˊʻ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2279 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9029 = AtomicIntegerFieldUpdater.newUpdater(C2279.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public AbstractRunnableC1644[] f9030;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6295(AbstractRunnableC1644 abstractRunnableC1644) {
        synchronized (this) {
            if (abstractRunnableC1644.m5308() != null) {
                m6296(abstractRunnableC1644.f6425);
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractRunnableC1644 m6296(int i) {
        Object[] objArr = this.f9030;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9029;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            m6298(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i <= 0 || objArr[i].compareTo(objArr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    Object[] objArr2 = this.f9030;
                    int i5 = i3 + 2;
                    if (i5 >= atomicIntegerFieldUpdater.get(this) || objArr2[i5].compareTo(objArr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (objArr2[i].compareTo(objArr2[i5]) <= 0) {
                        break;
                    }
                    m6298(i, i5);
                    i = i5;
                }
            } else {
                m6298(i, i2);
                while (i2 > 0) {
                    Object[] objArr3 = this.f9030;
                    int i6 = (i2 - 1) / 2;
                    if (objArr3[i6].compareTo(objArr3[i2]) <= 0) {
                        break;
                    }
                    m6298(i2, i6);
                    i2 = i6;
                }
            }
        }
        AbstractRunnableC1644 abstractRunnableC1644 = objArr[atomicIntegerFieldUpdater.get(this)];
        abstractRunnableC1644.m5309(null);
        abstractRunnableC1644.f6425 = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC1644;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6297(AbstractRunnableC1644 abstractRunnableC1644) {
        abstractRunnableC1644.m5309((C1581) this);
        AbstractRunnableC1644[] abstractRunnableC1644Arr = this.f9030;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9029;
        if (abstractRunnableC1644Arr == null) {
            abstractRunnableC1644Arr = new AbstractRunnableC1644[4];
            this.f9030 = abstractRunnableC1644Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC1644Arr.length) {
            abstractRunnableC1644Arr = (AbstractRunnableC1644[]) Arrays.copyOf(abstractRunnableC1644Arr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f9030 = abstractRunnableC1644Arr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC1644Arr[i] = abstractRunnableC1644;
        abstractRunnableC1644.f6425 = i;
        while (i > 0) {
            Object[] objArr = this.f9030;
            int i2 = (i - 1) / 2;
            if (objArr[i2].compareTo(objArr[i]) <= 0) {
                return;
            }
            m6298(i, i2);
            i = i2;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m6298(int i, int i2) {
        AbstractRunnableC1644[] abstractRunnableC1644Arr = this.f9030;
        AbstractRunnableC1644 abstractRunnableC1644 = abstractRunnableC1644Arr[i2];
        AbstractRunnableC1644 abstractRunnableC16442 = abstractRunnableC1644Arr[i];
        abstractRunnableC1644Arr[i] = abstractRunnableC1644;
        abstractRunnableC1644Arr[i2] = abstractRunnableC16442;
        abstractRunnableC1644.f6425 = i;
        abstractRunnableC16442.f6425 = i2;
    }
}
