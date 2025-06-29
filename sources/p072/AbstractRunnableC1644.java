package p072;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p034.C1228;
import p148.C2279;
import p447.AbstractC5179;

/* renamed from: ʿʽ.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1644 implements Runnable, Comparable, InterfaceC1639 {
    private volatile Object _heap;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f6425 = -1;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public long f6426;

    public AbstractRunnableC1644(long j) {
        this.f6426 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f6426 - ((AbstractRunnableC1644) obj).f6426;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return AbstractC5179.m11554(new StringBuilder("Delayed[nanos="), this.f6426, ']');
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2279 m5308() {
        Object obj = this._heap;
        if (obj instanceof C2279) {
            return (C2279) obj;
        }
        return null;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m5309(C1581 c1581) {
        if (this._heap == AbstractC1642.f6415) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c1581;
    }

    @Override // p072.InterfaceC1639
    /* renamed from: ـﹶ */
    public final void mo5179() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C1228 c1228 = AbstractC1642.f6415;
                if (obj == c1228) {
                    return;
                }
                C1581 c1581 = obj instanceof C1581 ? (C1581) obj : null;
                if (c1581 != null) {
                    c1581.m6295(this);
                }
                this._heap = c1228;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m5310(long j, C1581 c1581, AbstractC1609 abstractC1609) {
        synchronized (this) {
            if (this._heap == AbstractC1642.f6415) {
                return 2;
            }
            synchronized (c1581) {
                try {
                    AbstractRunnableC1644[] abstractRunnableC1644Arr = c1581.f9030;
                    AbstractRunnableC1644 abstractRunnableC1644 = abstractRunnableC1644Arr != null ? abstractRunnableC1644Arr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC1609.f6386;
                    abstractC1609.getClass();
                    if (AbstractC1609.f6385.get(abstractC1609) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC1644 == null) {
                        c1581.f6334 = j;
                    } else {
                        long j2 = abstractRunnableC1644.f6426;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c1581.f6334 > 0) {
                            c1581.f6334 = j;
                        }
                    }
                    long j3 = this.f6426;
                    long j4 = c1581.f6334;
                    if (j3 - j4 < 0) {
                        this.f6426 = j4;
                    }
                    c1581.m6297(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
