package p072;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p013.C1056;
import p034.C1228;
import p148.C2260;
import p148.C2279;
import p330.InterfaceC3747;

/* renamed from: ʿʽ.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1609 extends AbstractC1608 implements InterfaceC1621 {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6386 = AtomicReferenceFieldUpdater.newUpdater(AbstractC1609.class, Object.class, "_queue$volatile");

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6387 = AtomicReferenceFieldUpdater.newUpdater(AbstractC1609.class, Object.class, "_delayed$volatile");

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6385 = AtomicIntegerFieldUpdater.newUpdater(AbstractC1609.class, "_isCompleted$volatile");

    @Override // p072.AbstractC1608
    public void shutdown() {
        AbstractRunnableC1644 abstractRunnableC1644M6296;
        AbstractC1628.f6403.set(null);
        f6385.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6386;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C1228 c1228 = AbstractC1642.f6419;
            if (obj != null) {
                if (!(obj instanceof C2260)) {
                    if (obj != c1228) {
                        C2260 c2260 = new C2260(8, true);
                        c2260.m6268((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2260)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C2260) obj).m6266();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1228)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (mo5229() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C1581 c1581 = (C1581) f6387.get(this);
            if (c1581 == null) {
                return;
            }
            synchronized (c1581) {
                abstractRunnableC1644M6296 = C2279.f9029.get(c1581) > 0 ? c1581.m6296(0) : null;
            }
            if (abstractRunnableC1644M6296 == null) {
                return;
            } else {
                mo5223(jNanoTime, abstractRunnableC1644M6296);
            }
        }
    }

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public final boolean m5231(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6386;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f6385.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof C2260)) {
                if (obj == AbstractC1642.f6419) {
                    return false;
                }
                C2260 c2260 = new C2260(8, true);
                c2260.m6268((Runnable) obj);
                c2260.m6268(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2260)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            C2260 c22602 = (C2260) obj;
            int iM6268 = c22602.m6268(runnable);
            if (iM6268 == 0) {
                return true;
            }
            if (iM6268 == 1) {
                C2260 c2260M6267 = c22602.m6267();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2260M6267) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iM6268 == 2) {
                return false;
            }
        }
    }

    @Override // p072.InterfaceC1621
    /* renamed from: ʿʼ */
    public final void mo5197(long j, C1602 c1602) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C1612 c1612 = new C1612(this, j2 + jNanoTime, c1602);
            m5235(jNanoTime, c1612);
            c1602.m5210(new C1604(2, c1612));
        }
    }

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public final boolean m5232() {
        C1056 c1056 = this.f6384;
        if (!(c1056 != null ? c1056.isEmpty() : true)) {
            return false;
        }
        C1581 c1581 = (C1581) f6387.get(this);
        if (c1581 != null && C2279.f9029.get(c1581) != 0) {
            return false;
        }
        Object obj = f6386.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C2260) {
            long j = C2260.f8987.get((C2260) obj);
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC1642.f6419) {
            return true;
        }
        return false;
    }

    @Override // p072.AbstractC1636
    /* renamed from: ˈﹳ */
    public final void mo5198(InterfaceC3747 interfaceC3747, Runnable runnable) {
        mo5234(runnable);
    }

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public final void m5233() {
        AbstractRunnableC1644 abstractRunnableC1644M6296;
        C1581 c1581 = (C1581) f6387.get(this);
        if (c1581 == null || C2279.f9029.get(c1581) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c1581) {
                try {
                    AbstractRunnableC1644[] abstractRunnableC1644Arr = c1581.f9030;
                    AbstractRunnableC1644 abstractRunnableC1644 = abstractRunnableC1644Arr != null ? abstractRunnableC1644Arr[0] : null;
                    if (abstractRunnableC1644 != null) {
                        abstractRunnableC1644M6296 = ((jNanoTime - abstractRunnableC1644.f6426) > 0L ? 1 : ((jNanoTime - abstractRunnableC1644.f6426) == 0L ? 0 : -1)) >= 0 ? m5231(abstractRunnableC1644) : false ? c1581.m6296(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC1644M6296 != null);
    }

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public void mo5234(Runnable runnable) {
        m5233();
        if (!m5231(runnable)) {
            RunnableC1641.f6413.mo5234(runnable);
            return;
        }
        Thread threadMo5227 = mo5227();
        if (Thread.currentThread() != threadMo5227) {
            LockSupport.unpark(threadMo5227);
        }
    }

    @Override // p072.InterfaceC1621
    /* renamed from: ᵎـ */
    public InterfaceC1639 mo5200(long j, RunnableC1625 runnableC1625, InterfaceC3747 interfaceC3747) {
        return AbstractC1610.f6388.mo5200(j, runnableC1625, interfaceC3747);
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public final void m5235(long j, AbstractRunnableC1644 abstractRunnableC1644) {
        int iM5310;
        Thread threadMo5227;
        boolean z = f6385.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6387;
        if (z) {
            iM5310 = 1;
        } else {
            C1581 c1581 = (C1581) atomicReferenceFieldUpdater.get(this);
            if (c1581 == null) {
                C1581 c15812 = new C1581();
                c15812.f6334 = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c15812) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                c1581 = (C1581) atomicReferenceFieldUpdater.get(this);
            }
            iM5310 = abstractRunnableC1644.m5310(j, c1581, this);
        }
        if (iM5310 != 0) {
            if (iM5310 == 1) {
                mo5223(j, abstractRunnableC1644);
                return;
            } else {
                if (iM5310 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C1581 c15813 = (C1581) atomicReferenceFieldUpdater.get(this);
        if (c15813 != null) {
            synchronized (c15813) {
                AbstractRunnableC1644[] abstractRunnableC1644Arr = c15813.f9030;
                abstractRunnableC1644 = abstractRunnableC1644Arr != null ? abstractRunnableC1644Arr[0] : null;
            }
        }
        if (abstractRunnableC1644 != abstractRunnableC1644 || Thread.currentThread() == (threadMo5227 = mo5227())) {
            return;
        }
        LockSupport.unpark(threadMo5227);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    @Override // p072.AbstractC1608
    /* renamed from: ⁱⁱ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo5229() {
        /*
            r10 = this;
            boolean r0 = r10.m5230()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            r10.m5233()
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p072.AbstractC1609.f6386
            java.lang.Object r3 = r0.get(r10)
            ʼᵔ.ـﹶ r4 = p072.AbstractC1642.f6419
            r5 = 0
            if (r3 != 0) goto L19
        L17:
            r7 = r5
            goto L49
        L19:
            boolean r6 = r3 instanceof p148.C2260
            if (r6 == 0) goto L3d
            r6 = r3
            ˊʻ.ˉⁱ r6 = (p148.C2260) r6
            java.lang.Object r7 = r6.m6269()
            ʼᵔ.ـﹶ r8 = p148.C2260.f8988
            if (r7 == r8) goto L2b
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L49
        L2b:
            ˊʻ.ˉⁱ r6 = r6.m6267()
        L2f:
            boolean r4 = r0.compareAndSet(r10, r3, r6)
            if (r4 == 0) goto L36
            goto Lc
        L36:
            java.lang.Object r4 = r0.get(r10)
            if (r4 == r3) goto L2f
            goto Lc
        L3d:
            if (r3 != r4) goto L40
            goto L17
        L40:
            boolean r6 = r0.compareAndSet(r10, r3, r5)
            if (r6 == 0) goto Lb7
            r7 = r3
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L49:
            if (r7 == 0) goto L4f
            r7.run()
            return r1
        L4f:
            ʻי.ﹶˆ r3 = r10.f6384
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 != 0) goto L5a
        L58:
            r8 = r6
            goto L62
        L5a:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L61
            goto L58
        L61:
            r8 = r1
        L62:
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L67
            goto Lb6
        L67:
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L8f
            boolean r3 = r0 instanceof p148.C2260
            if (r3 == 0) goto L8b
            ˊʻ.ˉⁱ r0 = (p148.C2260) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p148.C2260.f8987
            long r3 = r3.get(r0)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r3
            int r0 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r8
            r8 = 30
            long r3 = r3 >> r8
            int r4 = (int) r3
            if (r0 != r4) goto Lb6
            goto L8f
        L8b:
            if (r0 != r4) goto Lb6
        L8d:
            r1 = r6
            goto Lb6
        L8f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p072.AbstractC1609.f6387
            java.lang.Object r0 = r0.get(r10)
            ʿʽ.ʾʼ r0 = (p072.C1581) r0
            if (r0 == 0) goto L8d
            monitor-enter(r0)
            ʿʽ.ﾞᐧ[] r3 = r0.f9030     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto La1
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> Lb3
        La1:
            monitor-exit(r0)
            if (r5 != 0) goto La5
            goto L8d
        La5:
            long r3 = r5.f6426
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb1
            goto Lb6
        Lb1:
            r1 = r3
            goto Lb6
        Lb3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lb6:
            return r1
        Lb7:
            java.lang.Object r6 = r0.get(r10)
            if (r6 == r3) goto L40
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: p072.AbstractC1609.mo5229():long");
    }
}
