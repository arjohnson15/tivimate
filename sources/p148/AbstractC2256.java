package p148;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ˊʻ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2256 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8976 = AtomicReferenceFieldUpdater.newUpdater(AbstractC2256.class, Object.class, "_next$volatile");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8975 = AtomicReferenceFieldUpdater.newUpdater(AbstractC2256.class, Object.class, "_prev$volatile");

    public AbstractC2256(AbstractC2263 abstractC2263) {
        this._prev$volatile = abstractC2263;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6256() {
        f8975.set(this, null);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m6257() {
        AbstractC2256 abstractC2256M6258;
        if (m6258() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8975;
            AbstractC2256 abstractC2256 = (AbstractC2256) atomicReferenceFieldUpdater.get(this);
            while (abstractC2256 != null && abstractC2256.mo6259()) {
                abstractC2256 = (AbstractC2256) atomicReferenceFieldUpdater.get(abstractC2256);
            }
            AbstractC2256 abstractC2256M62582 = m6258();
            while (abstractC2256M62582.mo6259() && (abstractC2256M6258 = abstractC2256M62582.m6258()) != null) {
                abstractC2256M62582 = abstractC2256M6258;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC2256M62582);
                AbstractC2256 abstractC22562 = ((AbstractC2256) obj) == null ? null : abstractC2256;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC2256M62582, obj, abstractC22562)) {
                    if (atomicReferenceFieldUpdater.get(abstractC2256M62582) != obj) {
                        break;
                    }
                }
            }
            if (abstractC2256 != null) {
                f8976.set(abstractC2256, abstractC2256M62582);
            }
            if (!abstractC2256M62582.mo6259() || abstractC2256M62582.m6258() == null) {
                if (abstractC2256 == null || !abstractC2256.mo6259()) {
                    return;
                }
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC2256 m6258() {
        Object obj = f8976.get(this);
        if (obj == AbstractC2269.f9003) {
            return null;
        }
        return (AbstractC2256) obj;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract boolean mo6259();
}
