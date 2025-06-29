package p433;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p296.C3488;

/* renamed from: ﹶᐧ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5028 extends AbstractFutureC5030 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3488 f19089;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final AtomicBoolean f19090 = new AtomicBoolean(false);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final ReentrantReadWriteLock f19091 = new ReentrantReadWriteLock();

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C5031 f19092;

    public C5028(C5031 c5031, C3488 c3488) {
        this.f19092 = c5031;
        this.f19089 = c3488;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        AtomicBoolean atomicBoolean = this.f19090;
        this.f19091.writeLock().lock();
        try {
            if (!isDone() && !atomicBoolean.getAndSet(true)) {
                this.f19089.m8378();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f19092.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f19092.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f19091;
        reentrantReadWriteLock.readLock().lock();
        try {
            return this.f19090.get();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isDone() {
        /*
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.f19091
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.f19090     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            ﹶᐧ.ﹳﹳ r1 = r2.f19092     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            goto L1e
        L1a:
            r1 = 0
            goto L1f
        L1c:
            r1 = move-exception
            goto L27
        L1e:
            r1 = 1
        L1f:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            return r1
        L27:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p433.C5028.isDone():boolean");
    }
}
