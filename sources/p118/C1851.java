package p118;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p034.C1228;
import p148.AbstractC2263;
import p148.AbstractC2269;
import p288.C3397;
import p338.InterfaceC3870;
import ʾʿ.ᵎـ;

/* renamed from: ˈˈ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1851 {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ᵎـ f7100;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7095 = AtomicReferenceFieldUpdater.newUpdater(C1851.class, Object.class, "head$volatile");

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f7097 = AtomicLongFieldUpdater.newUpdater(C1851.class, "deqIdx$volatile");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7099 = AtomicReferenceFieldUpdater.newUpdater(C1851.class, Object.class, "tail$volatile");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f7096 = AtomicLongFieldUpdater.newUpdater(C1851.class, "enqIdx$volatile");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7098 = AtomicIntegerFieldUpdater.newUpdater(C1851.class, "_availablePermits$volatile");

    public C1851(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        C1850 c1850 = new C1850(0L, null, 2);
        this.head$volatile = c1850;
        this.tail$volatile = c1850;
        this._availablePermits$volatile = 1 - i;
        this.f7100 = new ᵎـ(13, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5611() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p118.C1851.m5611():void");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m5612(C1852 c1852) {
        Object objM6287;
        C1854 c1854;
        long j;
        while (true) {
            int andDecrement = f7098.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = C3397.f13249;
                InterfaceC3870 interfaceC3870 = this.f7100;
                if (andDecrement > 0) {
                    c1852.mo5182(obj, interfaceC3870);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7099;
                C1850 c1850 = (C1850) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f7096.getAndIncrement(this);
                C1854 c18542 = C1854.f7103;
                long j2 = andIncrement / AbstractC1857.f7110;
                while (true) {
                    objM6287 = AbstractC2269.m6287(c1850, j2, c18542);
                    if (!AbstractC2269.m6286(objM6287)) {
                        AbstractC2263 abstractC2263M6277 = AbstractC2269.m6277(objM6287);
                        while (true) {
                            AbstractC2263 abstractC2263 = (AbstractC2263) atomicReferenceFieldUpdater.get(this);
                            c1854 = c18542;
                            j = j2;
                            if (abstractC2263.f8996 >= abstractC2263M6277.f8996) {
                                break;
                            }
                            if (!abstractC2263M6277.m6270()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC2263, abstractC2263M6277)) {
                                if (atomicReferenceFieldUpdater.get(this) != abstractC2263) {
                                    if (abstractC2263M6277.m6271()) {
                                        abstractC2263M6277.m6257();
                                    }
                                    c18542 = c1854;
                                    j2 = j;
                                }
                            }
                            if (abstractC2263.m6271()) {
                                abstractC2263.m6257();
                            }
                        }
                    } else {
                        break;
                    }
                    c18542 = c1854;
                    j2 = j;
                }
                C1850 c18502 = (C1850) AbstractC2269.m6277(objM6287);
                int i = (int) (andIncrement % AbstractC1857.f7110);
                AtomicReferenceArray atomicReferenceArray = c18502.f7094;
                while (!atomicReferenceArray.compareAndSet(i, null, c1852)) {
                    if (atomicReferenceArray.get(i) != null) {
                        C1228 c1228 = AbstractC1857.f7106;
                        C1228 c12282 = AbstractC1857.f7108;
                        while (!atomicReferenceArray.compareAndSet(i, c1228, c12282)) {
                            if (atomicReferenceArray.get(i) != c1228) {
                                break;
                            }
                        }
                        c1852.mo5182(obj, interfaceC3870);
                        return;
                    }
                }
                c1852.mo5165(c18502, i);
                return;
            }
        }
    }
}
