package p253;

import android.support.v4.media.session.AbstractC0002;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import p034.C1228;
import p070.AbstractC1549;
import p072.AbstractC1642;
import p080.AbstractC1702;
import p148.C2268;
import p447.AbstractC5179;
import ˆʽ.ᵎˏ;

/* renamed from: יˑ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ExecutorC3140 implements Executor, Closeable {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f12125 = AtomicLongFieldUpdater.newUpdater(ExecutorC3140.class, "parkedWorkersStack$volatile");

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f12126 = AtomicLongFieldUpdater.newUpdater(ExecutorC3140.class, "controlState$volatile");

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12127 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC3140.class, "_isTerminated$volatile");

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final C1228 f12128 = new C1228("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f12129;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C3141 f12130;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f12131;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final String f12132;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f12133;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3141 f12134;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C2268 f12135;

    public ExecutorC3140(int i, int i2, long j, String str) {
        this.f12133 = i;
        this.f12129 = i2;
        this.f12131 = j;
        this.f12132 = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC5179.m11548(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC0002.m55(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(AbstractC5179.m11548(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f12130 = new C3141();
        this.f12134 = new C3141();
        this.f12135 = new C2268((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static /* synthetic */ void m7784(ExecutorC3140 executorC3140, Runnable runnable, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        executorC3140.m7785(runnable, false, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p253.ExecutorC3140.f12127
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Lae
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p253.C3147
            r3 = 0
            if (r1 == 0) goto L18
            יˑ.ـﹶ r0 = (p253.C3147) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            יˑ.ʽᐧ r1 = r0.f12155
            boolean r1 = p070.AbstractC1549.m5138(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            ˊʻ.ˑי r1 = r8.f12135
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p253.ExecutorC3140.f12126     // Catch: java.lang.Throwable -> Lc0
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc0
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r1)
            if (r2 > r5) goto L76
            r1 = 1
        L37:
            ˊʻ.ˑי r4 = r8.f12135
            java.lang.Object r4 = r4.m6273(r1)
            יˑ.ـﹶ r4 = (p253.C3147) r4
            if (r4 == r0) goto L71
        L41:
            java.lang.Thread$State r6 = r4.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L52
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r6 = 10000(0x2710, double:4.9407E-320)
            r4.join(r6)
            goto L41
        L52:
            יˑ.ˉⁱ r4 = r4.f12158
            יˑ.ʿʼ r6 = r8.f12134
            r4.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p253.C3143.f12142
            java.lang.Object r7 = r7.getAndSet(r4, r3)
            יˑ.ˏᵢ r7 = (p253.AbstractRunnableC3145) r7
            if (r7 == 0) goto L66
            r6.m6264(r7)
        L66:
            יˑ.ˏᵢ r7 = r4.m7790()
            if (r7 != 0) goto L6d
            goto L71
        L6d:
            r6.m6264(r7)
            goto L66
        L71:
            if (r1 == r5) goto L76
            int r1 = r1 + 1
            goto L37
        L76:
            יˑ.ʿʼ r1 = r8.f12134
            r1.m6262()
            יˑ.ʿʼ r1 = r8.f12130
            r1.m6262()
        L80:
            if (r0 == 0) goto L88
            יˑ.ˏᵢ r1 = r0.m7797(r2)
            if (r1 != 0) goto Laf
        L88:
            יˑ.ʿʼ r1 = r8.f12130
            java.lang.Object r1 = r1.m6265()
            יˑ.ˏᵢ r1 = (p253.AbstractRunnableC3145) r1
            if (r1 != 0) goto Laf
            יˑ.ʿʼ r1 = r8.f12134
            java.lang.Object r1 = r1.m6265()
            יˑ.ˏᵢ r1 = (p253.AbstractRunnableC3145) r1
            if (r1 != 0) goto Laf
            if (r0 == 0) goto La2
            r1 = 5
            r0.m7795(r1)
        La2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p253.ExecutorC3140.f12125
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p253.ExecutorC3140.f12126
            r0.set(r8, r1)
        Lae:
            return
        Laf:
            r1.run()     // Catch: java.lang.Throwable -> Lb3
            goto L80
        Lb3:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L80
        Lc0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p253.ExecutorC3140.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m7784(this, runnable, false, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C2268 c2268 = this.f12135;
        int iM6275 = c2268.m6275();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM6275; i6++) {
            C3147 c3147 = (C3147) c2268.m6273(i6);
            if (c3147 != null) {
                C3143 c3143 = c3147.f12158;
                c3143.getClass();
                int i7 = C3143.f12142.get(c3143) != null ? (C3143.f12144.get(c3143) - C3143.f12145.get(c3143)) + 1 : C3143.f12144.get(c3143) - C3143.f12145.get(c3143);
                int iM5411 = AbstractC1702.m5411(c3147.f12156);
                if (iM5411 == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iM5411 == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iM5411 == 2) {
                    i3++;
                } else if (iM5411 == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iM5411 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5++;
                }
            }
        }
        long j = f12126.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f12132);
        sb4.append('@');
        sb4.append(AbstractC1642.m5290(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f12133;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f12129);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f12130.m6263());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f12134.m6263());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7785(Runnable runnable, boolean z, boolean z2) {
        AbstractRunnableC3145 c3151;
        int i;
        AbstractC3142.f12140.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC3145) {
            c3151 = (AbstractRunnableC3145) runnable;
            c3151.f12149 = jNanoTime;
            c3151.f12148 = z;
        } else {
            c3151 = new C3151(runnable, jNanoTime, z);
        }
        boolean z3 = c3151.f12148;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12126;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C3147 c3147 = threadCurrentThread instanceof C3147 ? (C3147) threadCurrentThread : null;
        if (c3147 == null || !AbstractC1549.m5138(c3147.f12155, this)) {
            c3147 = null;
        }
        if (c3147 != null && (i = c3147.f12156) != 5 && (c3151.f12148 || i != 2)) {
            c3147.f12160 = true;
            C3143 c3143 = c3147.f12158;
            if (z2) {
                c3151 = c3143.m7792(c3151);
            } else {
                c3143.getClass();
                AbstractRunnableC3145 abstractRunnableC3145 = (AbstractRunnableC3145) C3143.f12142.getAndSet(c3143, c3151);
                c3151 = abstractRunnableC3145 == null ? null : c3143.m7792(abstractRunnableC3145);
            }
        }
        if (c3151 != null) {
            if (!(c3151.f12148 ? this.f12134.m6264(c3151) : this.f12130.m6264(c3151))) {
                throw new RejectedExecutionException(ᵎˏ.ˎٴ(new StringBuilder(), this.f12132, " was terminated"));
            }
        }
        boolean z4 = z2 && c3147 != null;
        if (z3) {
            if (z4 || m7787() || m7786(jAddAndGet)) {
                return;
            }
            m7787();
            return;
        }
        if (z4 || m7787() || m7786(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m7787();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m7786(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f12133;
        if (i < i2) {
            int iM7788 = m7788();
            if (iM7788 == 1 && i2 > 1) {
                m7788();
            }
            if (iM7788 > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m7787() {
        C1228 c1228;
        int iM7793;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12125;
            long j = atomicLongFieldUpdater.get(this);
            C3147 c3147 = (C3147) this.f12135.m6273((int) (2097151 & j));
            if (c3147 == null) {
                c3147 = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM7796 = c3147.m7796();
                while (true) {
                    c1228 = f12128;
                    if (objM7796 == c1228) {
                        iM7793 = -1;
                        break;
                    }
                    if (objM7796 == null) {
                        iM7793 = 0;
                        break;
                    }
                    C3147 c31472 = (C3147) objM7796;
                    iM7793 = c31472.m7793();
                    if (iM7793 != 0) {
                        break;
                    }
                    objM7796 = c31472.m7796();
                }
                if (iM7793 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j2 | iM7793)) {
                    c3147.m7799(c1228);
                }
            }
            if (c3147 == null) {
                return false;
            }
            if (C3147.f12152.compareAndSet(c3147, -1, 0)) {
                LockSupport.unpark(c3147);
                return true;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m7788() {
        synchronized (this.f12135) {
            try {
                if (f12127.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f12126;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f12133) {
                    return 0;
                }
                if (i >= this.f12129) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f12135.m6273(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C3147 c3147 = new C3147(this, i3);
                this.f12135.m6274(i3, c3147);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c3147.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m7789(C3147 c3147, int i, int i2) {
        while (true) {
            long j = f12125.get(this);
            int iM7793 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (iM7793 == i) {
                if (i2 == 0) {
                    Object objM7796 = c3147.m7796();
                    while (true) {
                        if (objM7796 == f12128) {
                            iM7793 = -1;
                            break;
                        }
                        if (objM7796 == null) {
                            iM7793 = 0;
                            break;
                        }
                        C3147 c31472 = (C3147) objM7796;
                        iM7793 = c31472.m7793();
                        if (iM7793 != 0) {
                            break;
                        } else {
                            objM7796 = c31472.m7796();
                        }
                    }
                } else {
                    iM7793 = i2;
                }
            }
            if (iM7793 >= 0) {
                if (f12125.compareAndSet(this, j, j2 | iM7793)) {
                    return;
                }
            }
        }
    }
}
