package p253;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p070.C1561;

/* renamed from: יˑ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3147 extends Thread {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12152 = AtomicIntegerFieldUpdater.newUpdater(C3147.class, "workerCtl$volatile");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C1561 f12153;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public long f12154;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ ExecutorC3140 f12155;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f12156;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long f12157;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3143 f12158;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f12159;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f12160;

    public C3147(ExecutorC3140 executorC3140, int i) {
        this.f12155 = executorC3140;
        setDaemon(true);
        setContextClassLoader(executorC3140.getClass().getClassLoader());
        this.f12158 = new C3143();
        this.f12153 = new C1561();
        this.f12156 = 4;
        this.nextParkedWorker = ExecutorC3140.f12128;
        int iNanoTime = (int) System.nanoTime();
        this.f12159 = iNanoTime == 0 ? 42 : iNanoTime;
        m7798(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p253.C3147.run():void");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m7793() {
        return this.indexInArray;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractRunnableC3145 m7794() {
        int iM7800 = m7800(2);
        ExecutorC3140 executorC3140 = this.f12155;
        if (iM7800 == 0) {
            AbstractRunnableC3145 abstractRunnableC3145 = (AbstractRunnableC3145) executorC3140.f12130.m6265();
            return abstractRunnableC3145 != null ? abstractRunnableC3145 : (AbstractRunnableC3145) executorC3140.f12134.m6265();
        }
        AbstractRunnableC3145 abstractRunnableC31452 = (AbstractRunnableC3145) executorC3140.f12134.m6265();
        return abstractRunnableC31452 != null ? abstractRunnableC31452 : (AbstractRunnableC3145) executorC3140.f12130.m6265();
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m7795(int i) {
        int i2 = this.f12156;
        boolean z = i2 == 1;
        if (z) {
            ExecutorC3140.f12126.addAndGet(this.f12155, 4398046511104L);
        }
        if (i2 != i) {
            this.f12156 = i;
        }
        return z;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object m7796() {
        return this.nextParkedWorker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = p253.C3143.f12145.get(r3);
        r0 = p253.C3143.f12144.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (p253.C3143.f12143.get(r3) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r5 = r3.m7791(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r5 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r2 = r5;
     */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p253.AbstractRunnableC3145 m7797(boolean r12) {
        /*
            r11 = this;
            int r0 = r11.f12156
            r1 = 1
            r2 = 0
            יˑ.ˉⁱ r3 = r11.f12158
            יˑ.ʽᐧ r4 = r11.f12155
            if (r0 != r1) goto Lc
            goto L84
        Lc:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p253.ExecutorC3140.f12126
        Le:
            יˑ.ʽᐧ r6 = r11.f12155
            long r7 = r0.get(r6)
            r9 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r9 = r9 & r7
            r5 = 42
            long r9 = r9 >> r5
            int r5 = (int) r9
            if (r5 != 0) goto L73
            r3.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = p253.C3143.f12142
            java.lang.Object r0 = r12.get(r3)
            יˑ.ˏᵢ r0 = (p253.AbstractRunnableC3145) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r5 = r0.f12148
            if (r5 != r1) goto L41
        L32:
            boolean r5 = r12.compareAndSet(r3, r0, r2)
            if (r5 == 0) goto L3a
            r2 = r0
            goto L61
        L3a:
            java.lang.Object r5 = r12.get(r3)
            if (r5 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = p253.C3143.f12145
            int r12 = r12.get(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p253.C3143.f12144
            int r0 = r0.get(r3)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = p253.C3143.f12143
            int r5 = r5.get(r3)
            if (r5 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            יˑ.ˏᵢ r5 = r3.m7791(r0, r1)
            if (r5 == 0) goto L4d
            r2 = r5
        L61:
            if (r2 != 0) goto L72
            יˑ.ʿʼ r12 = r4.f12134
            java.lang.Object r12 = r12.m6265()
            r2 = r12
            יˑ.ˏᵢ r2 = (p253.AbstractRunnableC3145) r2
            if (r2 != 0) goto L72
            יˑ.ˏᵢ r2 = r11.m7801(r1)
        L72:
            return r2
        L73:
            r9 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r9 = r7 - r9
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = p253.ExecutorC3140.f12126
            boolean r5 = r5.compareAndSet(r6, r7, r9)
            if (r5 == 0) goto Le
            r11.f12156 = r1
        L84:
            if (r12 == 0) goto Lb8
            int r12 = r4.f12133
            int r12 = r12 * 2
            int r12 = r11.m7800(r12)
            if (r12 != 0) goto L91
            goto L92
        L91:
            r1 = 0
        L92:
            if (r1 == 0) goto L9b
            יˑ.ˏᵢ r12 = r11.m7794()
            if (r12 == 0) goto L9b
            goto Lc4
        L9b:
            r3.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = p253.C3143.f12142
            java.lang.Object r12 = r12.getAndSet(r3, r2)
            יˑ.ˏᵢ r12 = (p253.AbstractRunnableC3145) r12
            if (r12 != 0) goto Lac
            יˑ.ˏᵢ r12 = r3.m7790()
        Lac:
            if (r12 == 0) goto Laf
            goto Lc4
        Laf:
            if (r1 != 0) goto Lbf
            יˑ.ˏᵢ r12 = r11.m7794()
            if (r12 == 0) goto Lbf
            goto Lc4
        Lb8:
            יˑ.ˏᵢ r12 = r11.m7794()
            if (r12 == 0) goto Lbf
            goto Lc4
        Lbf:
            r12 = 3
            יˑ.ˏᵢ r12 = r11.m7801(r12)
        Lc4:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p253.C3147.m7797(boolean):יˑ.ˏᵢ");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m7798(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12155.f12132);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m7799(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m7800(int i) {
        int i2 = this.f12159;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f12159 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final AbstractRunnableC3145 m7801(int i) {
        AbstractRunnableC3145 abstractRunnableC3145M7791;
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC3140.f12126;
        ExecutorC3140 executorC3140 = this.f12155;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC3140) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iM7800 = m7800(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iM7800++;
            if (iM7800 > i2) {
                iM7800 = 1;
            }
            C3147 c3147 = (C3147) executorC3140.f12135.m6273(iM7800);
            if (c3147 != null && c3147 != this) {
                C3143 c3143 = c3147.f12158;
                if (i == 3) {
                    abstractRunnableC3145M7791 = c3143.m7790();
                } else {
                    c3143.getClass();
                    int i4 = C3143.f12145.get(c3143);
                    int i5 = C3143.f12144.get(c3143);
                    boolean z = i == 1;
                    while (i4 != i5 && (!z || C3143.f12143.get(c3143) != 0)) {
                        int i6 = i4 + 1;
                        abstractRunnableC3145M7791 = c3143.m7791(i4, z);
                        if (abstractRunnableC3145M7791 != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    abstractRunnableC3145M7791 = null;
                }
                C1561 c1561 = this.f12153;
                if (abstractRunnableC3145M7791 != null) {
                    c1561.f6302 = abstractRunnableC3145M7791;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3143.f12142;
                        AbstractRunnableC3145 abstractRunnableC3145 = (AbstractRunnableC3145) atomicReferenceFieldUpdater.get(c3143);
                        j = -2;
                        if (abstractRunnableC3145 == null) {
                            break;
                        }
                        if (((abstractRunnableC3145.f12148 ? 1 : 2) & i) != 0) {
                            AbstractC3142.f12140.getClass();
                            long jNanoTime = System.nanoTime() - abstractRunnableC3145.f12149;
                            long j3 = AbstractC3142.f12136;
                            if (jNanoTime >= j3) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(c3143, abstractRunnableC3145, null)) {
                                    if (atomicReferenceFieldUpdater.get(c3143) != abstractRunnableC3145) {
                                        break;
                                    }
                                }
                                c1561.f6302 = abstractRunnableC3145;
                                j = -1;
                                break;
                            }
                            j = j3 - jNanoTime;
                            break;
                        }
                        break;
                    }
                    j2 = j;
                }
                if (j2 == -1) {
                    AbstractRunnableC3145 abstractRunnableC31452 = (AbstractRunnableC3145) c1561.f6302;
                    c1561.f6302 = null;
                    return abstractRunnableC31452;
                }
                if (j2 > 0) {
                    jMin = Math.min(jMin, j2);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f12154 = jMin;
        return null;
    }
}
