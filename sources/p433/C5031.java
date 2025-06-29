package p433;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ـˊ.ʿʼ;

/* renamed from: ﹶᐧ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5031 extends AbstractFutureC5030 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C5029 f19101;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        try {
            C5029 c5029 = this.f19101;
            c5029.getClass();
            return c5029.m11145(0L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        try {
            C5029 c5029 = this.f19101;
            Object objM11145 = c5029.m11145(j, timeUnit);
            if (objM11145 != null) {
                return objM11145;
            }
            throw ((ʿʼ) c5029.f19100).ˏᵢ(new TimeoutException("Timeout expired"));
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isDone() {
        /*
            r3 = this;
            ﹶᐧ.ˑʽ r0 = r3.f19101
            java.lang.Object r1 = r0.f19094
            java.util.concurrent.locks.ReentrantLock r1 = (java.util.concurrent.locks.ReentrantLock) r1
            r1.lock()
            java.lang.Object r2 = r0.f19095     // Catch: java.lang.Throwable -> L17
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L19
            java.lang.Object r0 = r0.f19099     // Catch: java.lang.Throwable -> L17
            ʿˋ.ˋⁱ r0 = (p078.AbstractC1685) r0     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1e
        L19:
            r0 = 0
        L1a:
            r1.unlock()
            return r0
        L1e:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p433.C5031.isDone():boolean");
    }
}
