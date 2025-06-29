package p423;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p010.C1005;
import p034.C1228;
import p070.AbstractC1549;
import p072.AbstractC1642;
import p072.C1602;
import p072.InterfaceC1576;
import p072.InterfaceC1589;
import p118.C1848;
import p148.AbstractC2263;
import p148.AbstractC2269;
import p148.AbstractC2273;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p288.C3403;
import p330.InterfaceC3746;
import p338.InterfaceC3856;
import p447.AbstractC5179;
import ˈי.ʾˈ;
import ⁱـ.ˑי;

/* renamed from: ﹶʻ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4883 implements InterfaceC4876 {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC3856 f18417;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f18418;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f18410 = AtomicLongFieldUpdater.newUpdater(C4883.class, "sendersAndCloseStatus$volatile");

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f18412 = AtomicLongFieldUpdater.newUpdater(C4883.class, "receivers$volatile");

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f18408 = AtomicLongFieldUpdater.newUpdater(C4883.class, "bufferEnd$volatile");

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f18414 = AtomicLongFieldUpdater.newUpdater(C4883.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18415 = AtomicReferenceFieldUpdater.newUpdater(C4883.class, Object.class, "sendSegment$volatile");

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18409 = AtomicReferenceFieldUpdater.newUpdater(C4883.class, Object.class, "receiveSegment$volatile");

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18411 = AtomicReferenceFieldUpdater.newUpdater(C4883.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18413 = AtomicReferenceFieldUpdater.newUpdater(C4883.class, Object.class, "_closeCause$volatile");

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18416 = AtomicReferenceFieldUpdater.newUpdater(C4883.class, Object.class, "closeHandler$volatile");

    public C4883(int i, InterfaceC3856 interfaceC3856) {
        this.f18418 = i;
        this.f18417 = interfaceC3856;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC5179.m11548(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C4880 c4880 = AbstractC4889.f18432;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f18408.get(this);
        C4880 c48802 = new C4880(0L, null, this, 3);
        this.sendSegment$volatile = c48802;
        this.receiveSegment$volatile = c48802;
        this.bufferEndSegment$volatile = m10978() ? AbstractC4889.f18432 : c48802;
        this._closeCause$volatile = AbstractC4889.f18436;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C4880 m10969(C4883 c4883, long j, C4880 c4880) {
        Object objM6287;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        c4883.getClass();
        C4880 c48802 = AbstractC4889.f18432;
        C4878 c4878 = C4878.f18399;
        loop0: while (true) {
            objM6287 = AbstractC2269.m6287(c4880, j, c4878);
            if (!AbstractC2269.m6286(objM6287)) {
                AbstractC2263 abstractC2263M6277 = AbstractC2269.m6277(objM6287);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18415;
                    AbstractC2263 abstractC2263 = (AbstractC2263) atomicReferenceFieldUpdater.get(c4883);
                    if (abstractC2263.f8996 >= abstractC2263M6277.f8996) {
                        break loop0;
                    }
                    if (!abstractC2263M6277.m6270()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c4883, abstractC2263, abstractC2263M6277)) {
                        if (atomicReferenceFieldUpdater.get(c4883) != abstractC2263) {
                            if (abstractC2263M6277.m6271()) {
                                abstractC2263M6277.m6257();
                            }
                        }
                    }
                    if (abstractC2263.m6271()) {
                        abstractC2263.m6257();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM6286 = AbstractC2269.m6286(objM6287);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f18412;
        if (zM6286) {
            c4883.m10986();
            if (c4880.f8996 * AbstractC4889.f18421 >= atomicLongFieldUpdater2.get(c4883)) {
                return null;
            }
            c4880.m6256();
            return null;
        }
        C4880 c48803 = (C4880) AbstractC2269.m6277(objM6287);
        long j4 = c48803.f8996;
        if (j4 <= j) {
            return c48803;
        }
        long j5 = AbstractC4889.f18421 * j4;
        do {
            atomicLongFieldUpdater = f18410;
            j2 = atomicLongFieldUpdater.get(c4883);
            j3 = 1152921504606846975L & j2;
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(c4883, j2, j3 + (((int) (j2 >> 60)) << 60)));
        if (j4 * AbstractC4889.f18421 >= atomicLongFieldUpdater2.get(c4883)) {
            return null;
        }
        c48803.m6256();
        return null;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static boolean m10970(Object obj) {
        if (obj instanceof InterfaceC1589) {
            return AbstractC4889.m11003((InterfaceC1589) obj, C3397.f13249, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static void m10971(C4883 c4883) {
        c4883.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18414;
        if ((atomicLongFieldUpdater.addAndGet(c4883, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c4883) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final void m10972(C4883 c4883, Object obj, C1602 c1602) {
        InterfaceC3856 interfaceC3856 = c4883.f18417;
        if (interfaceC3856 != null) {
            AbstractC2269.m6284(interfaceC3856, obj, c1602.f6371);
        }
        c1602.mo3974(new C3403(c4883.m10995()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: ᐧˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m10973(p423.C4883 r13, p185.AbstractC2562 r14) {
        /*
            boolean r0 = r14 instanceof p423.C4869
            if (r0 == 0) goto L14
            r0 = r14
            ﹶʻ.ʿʼ r0 = (p423.C4869) r0
            int r1 = r0.f18387
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f18387 = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ﹶʻ.ʿʼ r0 = new ﹶʻ.ʿʼ
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f18386
            ˊˋ.ـﹶ r0 = p155.EnumC2332.f9250
            int r1 = r6.f18387
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            ˈⁱ.ˉⁱ.ˆʿ(r14)
            ﹶʻ.ˏᴵ r14 = (p423.C4877) r14
            java.lang.Object r13 = r14.f18398
            goto L99
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            ˈⁱ.ˉⁱ.ˆʿ(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = p423.C4883.f18409
            java.lang.Object r14 = r14.get(r13)
            ﹶʻ.ˑי r14 = (p423.C4880) r14
        L41:
            boolean r1 = r13.m10999()
            if (r1 == 0) goto L51
            java.lang.Throwable r13 = r13.m10983()
            ﹶʻ.ˋⁱ r14 = new ﹶʻ.ˋⁱ
            r14.<init>(r13)
            goto L9f
        L51:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p423.C4883.f18412
            long r4 = r1.getAndIncrement(r13)
            int r1 = p423.AbstractC4889.f18421
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f8996
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6d
            ﹶʻ.ˑי r1 = r13.m10992(r9, r14)
            if (r1 != 0) goto L6c
            goto L41
        L6c:
            r14 = r1
        L6d:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.m10987(r8, r9, r10, r12)
            ʼᵔ.ـﹶ r7 = p423.AbstractC4889.f18425
            if (r1 == r7) goto La0
            ʼᵔ.ـﹶ r7 = p423.AbstractC4889.f18428
            if (r1 != r7) goto L8a
            long r7 = r13.m10975()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L41
            r14.m6256()
            goto L41
        L8a:
            ʼᵔ.ـﹶ r7 = p423.AbstractC4889.f18435
            if (r1 != r7) goto L9b
            r6.f18387 = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.m10977(r2, r3, r4, r6)
            if (r13 != r0) goto L99
            return r0
        L99:
            r14 = r13
            goto L9f
        L9b:
            r14.m6256()
            r14 = r1
        L9f:
            return r14
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p423.C4883.m10973(ﹶʻ.ᐧʻ, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final int m10974(C4883 c4883, C4880 c4880, int i, Object obj, long j, Object obj2, boolean z) {
        c4883.getClass();
        c4880.m10968(i, obj);
        if (z) {
            return c4883.m10991(c4880, i, obj, j, obj2, z);
        }
        Object objM10964 = c4880.m10964(i);
        if (objM10964 == null) {
            if (c4883.m10985(j)) {
                if (c4880.m10966(null, i, AbstractC4889.f18438)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c4880.m10966(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (objM10964 instanceof InterfaceC1576) {
            c4880.m10968(i, null);
            if (c4883.m10997(objM10964, obj)) {
                c4880.m10967(i, AbstractC4889.f18439);
                return 0;
            }
            C1228 c1228 = AbstractC4889.f18427;
            if (c4880.f18404.getAndSet((i * 2) + 1, c1228) != c1228) {
                c4880.m10965(i, true);
            }
            return 5;
        }
        return c4883.m10991(c4880, i, obj, j, obj2, z);
    }

    @Override // p423.InterfaceC4873
    public final C4879 iterator() {
        return new C4879(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0198, code lost:
    
        r3 = (p423.C4880) r3.m6258();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p423.C4883.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01bb, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bf, code lost:
    
        r2.m5204();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d0, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01dc, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f3, code lost:
    
        m10972(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f7, code lost:
    
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fc, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0145, code lost:
    
        if (r20 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0147, code lost:
    
        r22.m6256();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014a, code lost:
    
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014c, code lost:
    
        m10972(r26, r27, r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ba  */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [ʿʽ.ˏʾ] */
    @Override // p423.InterfaceC4891
    /* renamed from: ʿʼ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo10956(java.lang.Object r27, p330.InterfaceC3746 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p423.C4883.mo10956(java.lang.Object, ᴵⁱ.ʿʼ):java.lang.Object");
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final long m10975() {
        return f18410.get(this) & 1152921504606846975L;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object m10976(Object obj, InterfaceC3746 interfaceC3746) {
        UndeliveredElementException undeliveredElementExceptionM6276;
        C1602 c1602 = new C1602(1, ˑי.ˏᴵ(interfaceC3746));
        c1602.m5205();
        InterfaceC3856 interfaceC3856 = this.f18417;
        if (interfaceC3856 == null || (undeliveredElementExceptionM6276 = AbstractC2269.m6276(interfaceC3856, obj, null)) == null) {
            c1602.mo3974(new C3403(m10995()));
        } else {
            ʾˈ.ـﹶ(undeliveredElementExceptionM6276, m10995());
            c1602.mo3974(new C3403(undeliveredElementExceptionM6276));
        }
        Object objM5203 = c1602.m5203();
        return objM5203 == EnumC2332.f9250 ? objM5203 : C3397.f13249;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ˆᵔ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m10977(p423.C4880 r11, int r12, long r13, p185.AbstractC2562 r15) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p423.C4883.m10977(ﹶʻ.ˑי, int, long, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final boolean m10978() {
        long j = f18408.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m10979(Throwable th, boolean z) {
        boolean z2;
        long j;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18410;
        if (z) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) != 0) {
                    break;
                }
                C4880 c4880 = AbstractC4889.f18432;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (1 << 60) + (j5 & 1152921504606846975L)));
        }
        C1228 c1228 = AbstractC4889.f18436;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18413;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c1228, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c1228) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, (3 << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    j3 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j, (j3 << 60) + j2));
        }
        m10986();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f18416;
                obj = atomicReferenceFieldUpdater2.get(this);
                C1228 c12282 = obj == null ? AbstractC4889.f18437 : AbstractC4889.f18426;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c12282)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                AbstractC1549.m5141(1, obj);
                ((InterfaceC3856) obj).mo4036(m10983());
            }
        }
        return z2;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m10980(long j) {
        UndeliveredElementException undeliveredElementExceptionM6276;
        C4880 c4880 = (C4880) f18409.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f18412;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f18418 + j2, f18408.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                long j3 = AbstractC4889.f18421;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c4880.f8996 != j4) {
                    C4880 c4880M10992 = m10992(j4, c4880);
                    if (c4880M10992 == null) {
                        continue;
                    } else {
                        c4880 = c4880M10992;
                    }
                }
                Object objM10987 = m10987(c4880, i, j2, null);
                if (objM10987 != AbstractC4889.f18428) {
                    c4880.m6256();
                    InterfaceC3856 interfaceC3856 = this.f18417;
                    if (interfaceC3856 != null && (undeliveredElementExceptionM6276 = AbstractC2269.m6276(interfaceC3856, objM10987, null)) != null) {
                        throw undeliveredElementExceptionM6276;
                    }
                } else if (j2 < m10975()) {
                    c4880.m6256();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0195, code lost:
    
        m10971(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0198, code lost:
    
        return;
     */
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10981() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p423.C4883.m10981():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [ʿʽ.ˏʾ] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, ﹶʻ.ᐧʻ] */
    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object m10982(AbstractC2567 abstractC2567) throws Throwable {
        C4880 c4880;
        ?? r13;
        Object objM10987;
        C1602 c1602;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18409;
        C4880 c48802 = (C4880) atomicReferenceFieldUpdater.get(this);
        while (!m10999()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f18412;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = AbstractC4889.f18421;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (c48802.f8996 != j2) {
                C4880 c4880M10992 = m10992(j2, c48802);
                if (c4880M10992 == null) {
                    continue;
                } else {
                    c4880 = c4880M10992;
                }
            } else {
                c4880 = c48802;
            }
            Object objM109872 = m10987(c4880, i, andIncrement, null);
            C1228 c1228 = AbstractC4889.f18425;
            if (objM109872 == c1228) {
                throw new IllegalStateException("unexpected");
            }
            C1228 c12282 = AbstractC4889.f18428;
            if (objM109872 != c12282) {
                if (objM109872 != AbstractC4889.f18435) {
                    c4880.m6256();
                    return objM109872;
                }
                C1602 c1602M5286 = AbstractC1642.m5286(ˑי.ˏᴵ(abstractC2567));
                try {
                    objM10987 = m10987(c4880, i, andIncrement, c1602M5286);
                } catch (Throwable th) {
                    th = th;
                    r13 = c1602M5286;
                }
                try {
                    if (objM10987 == c1228) {
                        c1602 = c1602M5286;
                        c1602.mo5165(c4880, i);
                    } else {
                        c1602 = c1602M5286;
                        C4888 c4888M10988 = null;
                        InterfaceC3856 interfaceC3856 = this.f18417;
                        if (objM10987 == c12282) {
                            if (andIncrement < m10975()) {
                                c4880.m6256();
                            }
                            C4880 c48803 = (C4880) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (m10999()) {
                                    c1602.mo3974(new C3403(m10993()));
                                    break;
                                }
                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                long j3 = AbstractC4889.f18421;
                                long j4 = andIncrement2 / j3;
                                int i2 = (int) (andIncrement2 % j3);
                                if (c48803.f8996 != j4) {
                                    C4880 c4880M109922 = m10992(j4, c48803);
                                    if (c4880M109922 != null) {
                                        c48803 = c4880M109922;
                                    }
                                }
                                InterfaceC3856 interfaceC38562 = interfaceC3856;
                                objM10987 = m10987(c48803, i2, andIncrement2, c1602);
                                if (objM10987 == AbstractC4889.f18425) {
                                    c1602.mo5165(c48803, i2);
                                    break;
                                }
                                if (objM10987 == AbstractC4889.f18428) {
                                    if (andIncrement2 < m10975()) {
                                        c48803.m6256();
                                    }
                                    interfaceC3856 = interfaceC38562;
                                } else {
                                    if (objM10987 == AbstractC4889.f18435) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    c48803.m6256();
                                    if (interfaceC38562 != null) {
                                        c4888M10988 = m10988();
                                    }
                                }
                            }
                        } else {
                            c4880.m6256();
                            if (interfaceC3856 != null) {
                                c4888M10988 = m10988();
                            }
                        }
                        c1602.mo5182(objM10987, c4888M10988);
                    }
                    return c1602.m5203();
                } catch (Throwable th2) {
                    th = th2;
                    r13 = c1228;
                    r13.m5204();
                    throw th;
                }
            }
            if (andIncrement < m10975()) {
                c4880.m6256();
            }
            c48802 = c4880;
        }
        Throwable thM10993 = m10993();
        int i3 = AbstractC2273.f9018;
        throw thM10993;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final Throwable m10983() {
        return (Throwable) f18413.get(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        r1 = (p423.C4880) ((p148.AbstractC2256) p148.AbstractC2256.f8975.get(r1));
     */
    /* renamed from: ˏʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p423.C4880 m10984(long r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p423.C4883.m10984(long):ﹶʻ.ˑי");
    }

    @Override // p423.InterfaceC4873
    /* renamed from: ˏᴵ */
    public final Object mo10957() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18412;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = f18410.get(this);
        if (m11000(true, j2)) {
            return new C4874(m10983());
        }
        long j3 = j2 & 1152921504606846975L;
        Object obj = C4877.f18397;
        if (j >= j3) {
            return obj;
        }
        Object obj2 = AbstractC4889.f18427;
        C4880 c4880 = (C4880) f18409.get(this);
        while (!m10999()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = AbstractC4889.f18421;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (c4880.f8996 != j5) {
                C4880 c4880M10992 = m10992(j5, c4880);
                if (c4880M10992 == null) {
                    continue;
                } else {
                    c4880 = c4880M10992;
                }
            }
            Object objM10987 = m10987(c4880, i, andIncrement, obj2);
            if (objM10987 == AbstractC4889.f18425) {
                InterfaceC1576 interfaceC1576 = obj2 instanceof InterfaceC1576 ? (InterfaceC1576) obj2 : null;
                if (interfaceC1576 != null) {
                    interfaceC1576.mo5165(c4880, i);
                }
                m11001(andIncrement);
                c4880.m6272();
            } else if (objM10987 == AbstractC4889.f18428) {
                if (andIncrement < m10975()) {
                    c4880.m6256();
                }
            } else {
                if (objM10987 == AbstractC4889.f18435) {
                    throw new IllegalStateException("unexpected");
                }
                c4880.m6256();
                obj = objM10987;
            }
            return obj;
        }
        return new C4874(m10983());
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m10985(long j) {
        return j < f18408.get(this) || j < f18412.get(this) + ((long) this.f18418);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return r1;
     */
    @Override // p423.InterfaceC4891
    /* renamed from: ˑי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo10958(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p423.C4883.mo10958(java.lang.Object):java.lang.Object");
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean m10986() {
        return m11000(false, f18410.get(this));
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final Object m10987(C4880 c4880, int i, long j, Object obj) {
        Object objM10964 = c4880.m10964(i);
        AtomicReferenceArray atomicReferenceArray = c4880.f18404;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18410;
        if (objM10964 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC4889.f18435;
                }
                if (c4880.m10966(objM10964, i, obj)) {
                    m10981();
                    return AbstractC4889.f18425;
                }
            }
        } else if (objM10964 == AbstractC4889.f18438 && c4880.m10966(objM10964, i, AbstractC4889.f18439)) {
            m10981();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c4880.m10968(i, null);
            return obj2;
        }
        while (true) {
            Object objM109642 = c4880.m10964(i);
            if (objM109642 == null || objM109642 == AbstractC4889.f18422) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c4880.m10966(objM109642, i, AbstractC4889.f18429)) {
                        m10981();
                        return AbstractC4889.f18428;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC4889.f18435;
                    }
                    if (c4880.m10966(objM109642, i, obj)) {
                        m10981();
                        return AbstractC4889.f18425;
                    }
                }
            } else {
                if (objM109642 != AbstractC4889.f18438) {
                    C1228 c1228 = AbstractC4889.f18423;
                    if (objM109642 != c1228 && objM109642 != AbstractC4889.f18429) {
                        if (objM109642 == AbstractC4889.f18424) {
                            m10981();
                            return AbstractC4889.f18428;
                        }
                        if (objM109642 != AbstractC4889.f18434 && c4880.m10966(objM109642, i, AbstractC4889.f18433)) {
                            boolean z = objM109642 instanceof C4890;
                            if (z) {
                                objM109642 = ((C4890) objM109642).f18440;
                            }
                            if (m10970(objM109642)) {
                                c4880.m10967(i, AbstractC4889.f18439);
                                m10981();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                c4880.m10968(i, null);
                                return obj3;
                            }
                            c4880.m10967(i, c1228);
                            c4880.m6272();
                            if (z) {
                                m10981();
                            }
                            return AbstractC4889.f18428;
                        }
                    }
                    return AbstractC4889.f18428;
                }
                if (c4880.m10966(objM109642, i, AbstractC4889.f18439)) {
                    m10981();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    c4880.m10968(i, null);
                    return obj4;
                }
            }
        }
    }

    @Override // p423.InterfaceC4873
    /* renamed from: ـﹶ */
    public final void mo10961(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m10979(cancellationException, true);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4888 m10988() {
        return new C4888(3, this, C4883.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C4888 m10989() {
        return new C4888(3, this, C4883.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10990(long r6, p423.C4880 r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.f8996
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
            ˊʻ.ʽᐧ r0 = r8.m6258()
            ﹶʻ.ˑי r0 = (p423.C4880) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.mo6259()
            if (r6 == 0) goto L22
            ˊʻ.ʽᐧ r6 = r8.m6258()
            ﹶʻ.ˑי r6 = (p423.C4880) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = p423.C4883.f18411
            java.lang.Object r7 = r6.get(r5)
            ˊʻ.ˎٴ r7 = (p148.AbstractC2263) r7
            long r0 = r7.f8996
            long r2 = r8.f8996
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r8.m6270()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r6.compareAndSet(r5, r7, r8)
            if (r0 == 0) goto L4a
            boolean r6 = r7.m6271()
            if (r6 == 0) goto L49
            r7.m6257()
        L49:
            return
        L4a:
            java.lang.Object r0 = r6.get(r5)
            if (r0 == r7) goto L3a
            boolean r6 = r8.m6271()
            if (r6 == 0) goto L22
            r8.m6257()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: p423.C4883.m10990(long, ﹶʻ.ˑי):void");
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final int m10991(C4880 c4880, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objM10964 = c4880.m10964(i);
            if (objM10964 == null) {
                if (!m10985(j) || z) {
                    if (z) {
                        if (c4880.m10966(null, i, AbstractC4889.f18423)) {
                            c4880.m6272();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c4880.m10966(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (c4880.m10966(null, i, AbstractC4889.f18438)) {
                    return 1;
                }
            } else {
                if (objM10964 != AbstractC4889.f18422) {
                    C1228 c1228 = AbstractC4889.f18427;
                    if (objM10964 == c1228) {
                        c4880.m10968(i, null);
                        return 5;
                    }
                    if (objM10964 == AbstractC4889.f18429) {
                        c4880.m10968(i, null);
                        return 5;
                    }
                    if (objM10964 == AbstractC4889.f18424) {
                        c4880.m10968(i, null);
                        m10986();
                        return 4;
                    }
                    c4880.m10968(i, null);
                    if (objM10964 instanceof C4890) {
                        objM10964 = ((C4890) objM10964).f18440;
                    }
                    if (m10997(objM10964, obj)) {
                        c4880.m10967(i, AbstractC4889.f18439);
                        return 0;
                    }
                    if (c4880.f18404.getAndSet((i * 2) + 1, c1228) == c1228) {
                        return 5;
                    }
                    c4880.m10965(i, true);
                    return 5;
                }
                if (c4880.m10966(objM10964, i, AbstractC4889.f18438)) {
                    return 1;
                }
            }
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C4880 m10992(long j, C4880 c4880) {
        Object objM6287;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        C4880 c48802 = AbstractC4889.f18432;
        C4878 c4878 = C4878.f18399;
        loop0: while (true) {
            objM6287 = AbstractC2269.m6287(c4880, j, c4878);
            if (!AbstractC2269.m6286(objM6287)) {
                AbstractC2263 abstractC2263M6277 = AbstractC2269.m6277(objM6287);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18409;
                    AbstractC2263 abstractC2263 = (AbstractC2263) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2263.f8996 >= abstractC2263M6277.f8996) {
                        break loop0;
                    }
                    if (!abstractC2263M6277.m6270()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC2263, abstractC2263M6277)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC2263) {
                            if (abstractC2263M6277.m6271()) {
                                abstractC2263M6277.m6257();
                            }
                        }
                    }
                    if (abstractC2263.m6271()) {
                        abstractC2263.m6257();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC2269.m6286(objM6287)) {
            m10986();
            if (c4880.f8996 * AbstractC4889.f18421 >= m10975()) {
                return null;
            }
            c4880.m6256();
            return null;
        }
        C4880 c48803 = (C4880) AbstractC2269.m6277(objM6287);
        boolean zM10978 = m10978();
        long j3 = c48803.f8996;
        if (!zM10978 && j <= f18408.get(this) / AbstractC4889.f18421) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f18411;
                AbstractC2263 abstractC22632 = (AbstractC2263) atomicReferenceFieldUpdater2.get(this);
                if (abstractC22632.f8996 >= j3 || !c48803.m6270()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC22632, c48803)) {
                    if (atomicReferenceFieldUpdater2.get(this) != abstractC22632) {
                        if (c48803.m6271()) {
                            c48803.m6257();
                        }
                    }
                }
                if (abstractC22632.m6271()) {
                    abstractC22632.m6257();
                }
            }
        }
        if (j3 <= j) {
            return c48803;
        }
        long j4 = AbstractC4889.f18421 * j3;
        do {
            atomicLongFieldUpdater = f18412;
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j4) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j4));
        if (j3 * AbstractC4889.f18421 >= m10975()) {
            return null;
        }
        c48803.m6256();
        return null;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final Throwable m10993() {
        Throwable thM10983 = m10983();
        return thM10983 == null ? new ClosedReceiveChannelException("Channel was closed") : thM10983;
    }

    @Override // p423.InterfaceC4873
    /* renamed from: ᵎـ */
    public final Object mo10959(C1005 c1005) {
        return m10973(this, c1005);
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m10994(InterfaceC1576 interfaceC1576, boolean z) {
        if (interfaceC1576 instanceof InterfaceC1589) {
            ((InterfaceC3746) interfaceC1576).mo3974(new C3403(z ? m10993() : m10995()));
            return;
        }
        if (interfaceC1576 instanceof C4870) {
            ((C4870) interfaceC1576).f18388.mo3974(new C4877(new C4874(m10983())));
            return;
        }
        if (!(interfaceC1576 instanceof C4879)) {
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC1576).toString());
        }
        C4879 c4879 = (C4879) interfaceC1576;
        C1602 c1602 = c4879.f18400;
        c4879.f18400 = null;
        c4879.f18402 = AbstractC4889.f18424;
        Throwable thM10983 = c4879.f18401.m10983();
        if (thM10983 == null) {
            c1602.mo3974(Boolean.FALSE);
        } else {
            c1602.mo3974(new C3403(thM10983));
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final Throwable m10995() {
        Throwable thM10983 = m10983();
        return thM10983 == null ? new ClosedSendChannelException("Channel was closed") : thM10983;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public boolean mo10996() {
        return false;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final boolean m10997(Object obj, Object obj2) {
        boolean z = obj instanceof C4870;
        InterfaceC3856 interfaceC3856 = this.f18417;
        if (z) {
            return AbstractC4889.m11003(((C4870) obj).f18388, new C4877(obj2), interfaceC3856 != null ? m10989() : null);
        }
        if (!(obj instanceof C4879)) {
            if (obj instanceof InterfaceC1589) {
                return AbstractC4889.m11003((InterfaceC1589) obj, obj2, interfaceC3856 != null ? m10988() : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        C4879 c4879 = (C4879) obj;
        C1602 c1602 = c4879.f18400;
        c4879.f18400 = null;
        c4879.f18402 = obj2;
        Boolean bool = Boolean.TRUE;
        InterfaceC3856 interfaceC38562 = c4879.f18401.f18417;
        return AbstractC4889.m11003(c1602, bool, interfaceC38562 != null ? new C1848(interfaceC38562, 2, obj2) : null);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m10998(Throwable th) {
        return m10979(th, false);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final boolean m10999() {
        return m11000(true, f18410.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c7, code lost:
    
        r0 = (p423.C4880) ((p148.AbstractC2256) p148.AbstractC2256.f8975.get(r0));
     */
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11000(boolean r19, long r20) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p423.C4883.m11000(boolean, long):boolean");
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final void m11001(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (m10978()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f18408;
        } while (atomicLongFieldUpdater.get(this) <= j);
        int i = AbstractC4889.f18430;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f18414;
            if (i2 >= i) {
                do {
                    j2 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(this);
                    long j5 = atomicLongFieldUpdater2.get(this);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j5, j6 + 4611686018427387904L);
                    }
                }
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, j3 & 4611686018427387903L));
                return;
            }
            long j7 = atomicLongFieldUpdater.get(this);
            if (j7 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j7 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i2++;
            }
        }
    }
}
