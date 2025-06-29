package p148;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p034.C1228;

/* renamed from: ˊʻ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2260 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8986 = AtomicReferenceFieldUpdater.newUpdater(C2260.class, Object.class, "_next$volatile");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f8987 = AtomicLongFieldUpdater.newUpdater(C2260.class, "_state$volatile");

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C1228 f8988 = new C1228("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f8989;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f8990;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f8991;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f8992;

    public C2260(int i, boolean z) {
        this.f8991 = i;
        this.f8989 = z;
        int i2 = i - 1;
        this.f8990 = i2;
        this.f8992 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m6266() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f8987;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2260 m6267() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        while (true) {
            atomicLongFieldUpdater = f8987;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8986;
            C2260 c2260 = (C2260) atomicReferenceFieldUpdater.get(this);
            if (c2260 != null) {
                return c2260;
            }
            C2260 c22602 = new C2260(this.f8991 * 2, this.f8989);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f8990;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c2264 = this.f8992.get(i4);
                if (c2264 == null) {
                    c2264 = new C2264(i);
                }
                c22602.f8992.set(c22602.f8990 & i, c2264);
                i++;
            }
            atomicLongFieldUpdater.set(c22602, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c22602) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return 1;
     */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m6268(java.lang.Runnable r15) {
        /*
            r14 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = p148.C2260.f8987
            long r2 = r6.get(r14)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r4 = 1
            r7 = 0
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L19
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r15 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r15 == 0) goto L18
            r4 = 2
        L18:
            return r4
        L19:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            int r1 = (int) r0
            r9 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r9 = r9 & r2
            r0 = 30
            long r9 = r9 >> r0
            int r10 = (int) r9
            int r5 = r10 + 2
            int r9 = r14.f8990
            r5 = r5 & r9
            r11 = r1 & r9
            if (r5 != r11) goto L32
            return r4
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r11 = r14.f8992
            boolean r5 = r14.f8989
            r12 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L51
            r5 = r10 & r9
            java.lang.Object r5 = r11.get(r5)
            if (r5 == 0) goto L51
            r0 = 1024(0x400, float:1.435E-42)
            int r2 = r14.f8991
            if (r2 < r0) goto L50
            int r10 = r10 - r1
            r0 = r10 & r12
            int r1 = r2 >> 1
            if (r0 <= r1) goto L0
        L50:
            return r4
        L51:
            int r1 = r10 + 1
            r1 = r1 & r12
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r12 = (long) r1
            long r0 = r12 << r0
            long r4 = r4 | r0
            r0 = r6
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            r0 = r10 & r9
            r11.set(r0, r15)
            r0 = r14
        L6c:
            long r1 = r6.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L95
            ˊʻ.ˉⁱ r0 = r0.m6267()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f8992
            int r2 = r0.f8990
            r2 = r2 & r10
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof p148.C2264
            if (r4 == 0) goto L92
            ˊʻ.ˏʾ r3 = (p148.C2264) r3
            int r3 = r3.f8997
            if (r3 != r10) goto L92
            r1.set(r2, r15)
            goto L93
        L92:
            r0 = 0
        L93:
            if (r0 != 0) goto L6c
        L95:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p148.C2260.m6268(java.lang.Runnable):int");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object m6269() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8987;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return f8988;
            }
            int i = (int) (j & 1073741823);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f8990;
            int i4 = i & i3;
            if ((i2 & i3) == i4) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f8992;
            Object obj = atomicReferenceArray.get(i4);
            boolean z = this.f8989;
            if (obj == null) {
                if (z) {
                    return null;
                }
            } else {
                if (obj instanceof C2264) {
                    return null;
                }
                long j2 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                if (z) {
                    C2260 c2260M6267 = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8987;
                        long j3 = atomicLongFieldUpdater2.get(c2260M6267);
                        int i5 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            c2260M6267 = c2260M6267.m6267();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(c2260M6267, j3, (j3 & (-1073741824)) | j2)) {
                                c2260M6267.f8992.set(c2260M6267.f8990 & i5, null);
                                c2260M6267 = null;
                            } else {
                                continue;
                            }
                        }
                        if (c2260M6267 == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
