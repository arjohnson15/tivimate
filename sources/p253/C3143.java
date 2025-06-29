package p253;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: יˑ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3143 {
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AtomicReferenceArray f12146 = new AtomicReferenceArray(128);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12142 = AtomicReferenceFieldUpdater.newUpdater(C3143.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12144 = AtomicIntegerFieldUpdater.newUpdater(C3143.class, "producerIndex$volatile");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12145 = AtomicIntegerFieldUpdater.newUpdater(C3143.class, "consumerIndex$volatile");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12143 = AtomicIntegerFieldUpdater.newUpdater(C3143.class, "blockingTasksInBuffer$volatile");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractRunnableC3145 m7790() {
        AbstractRunnableC3145 abstractRunnableC3145;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12145;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f12144.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC3145 = (AbstractRunnableC3145) this.f12146.getAndSet(i2, null)) != null) {
                if (abstractRunnableC3145.f12148) {
                    f12143.decrementAndGet(this);
                }
                return abstractRunnableC3145;
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractRunnableC3145 m7791(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f12146;
        AbstractRunnableC3145 abstractRunnableC3145 = (AbstractRunnableC3145) atomicReferenceArray.get(i2);
        if (abstractRunnableC3145 != null && abstractRunnableC3145.f12148 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC3145, null)) {
                if (atomicReferenceArray.get(i2) != abstractRunnableC3145) {
                }
            }
            if (z) {
                f12143.decrementAndGet(this);
            }
            return abstractRunnableC3145;
        }
        return null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractRunnableC3145 m7792(AbstractRunnableC3145 abstractRunnableC3145) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12144;
        if (atomicIntegerFieldUpdater.get(this) - f12145.get(this) == 127) {
            return abstractRunnableC3145;
        }
        if (abstractRunnableC3145.f12148) {
            f12143.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f12146;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, abstractRunnableC3145);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }
}
