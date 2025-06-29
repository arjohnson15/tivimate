package p072;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;
import p010.C1021;
import p034.C1228;
import p070.AbstractC1549;
import p097.AbstractC1767;
import p097.C1769;
import p097.EnumC1768;
import p140.C2163;
import p140.C2182;
import p148.AbstractC2269;
import p148.C2257;
import p148.C2267;
import p148.C2274;
import p155.EnumC2332;
import p185.AbstractC2562;
import p185.AbstractC2563;
import p185.InterfaceC2566;
import p217.C2824;
import p253.C3150;
import p253.ExecutorC3146;
import p288.AbstractC3404;
import p288.C3397;
import p288.C3403;
import p330.C3749;
import p330.C3753;
import p330.InterfaceC3746;
import p330.InterfaceC3747;
import p330.InterfaceC3750;
import p338.InterfaceC3864;
import ʽᵔ.ᴵʿ;
import ˈי.ʾˈ;
import ˎˊ.ˆʿ;
import ˎˊ.ˏʾ;
import ˏʼ.ʽᐧ;
import ⁱـ.ˑי;
import ﾞﹶ.ᵢʿ;

/* renamed from: ʿʽ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1642 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1228 f6415;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1228 f6416;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C1228 f6418;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1228 f6419;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C1228 f6421;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C1228 f6422;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1228 f6423;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1228 f6420 = new C1228("RESUME_TOKEN", 1);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C1593 f6424 = new C1593(false);

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final C1593 f6417 = new C1593(true);

    static {
        int i = 1;
        f6415 = new C1228("REMOVED_TASK", i);
        f6419 = new C1228("CLOSED_EMPTY", i);
        int i2 = 1;
        f6423 = new C1228("COMPLETING_ALREADY", i2);
        f6416 = new C1228("COMPLETING_WAITING_CHILDREN", i2);
        f6421 = new C1228("COMPLETING_RETRY", i2);
        f6422 = new C1228("TOO_LATE_TO_CANCEL", i2);
        f6418 = new C1228("SEALED", i2);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C1592 m5281() {
        return new C1592(null);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final void m5282(InterfaceC3747 interfaceC3747, CancellationException cancellationException) {
        InterfaceC1643 interfaceC1643 = (InterfaceC1643) interfaceC3747.mo3966(C1584.f6341);
        if (interfaceC1643 != null) {
            interfaceC1643.mo5172(cancellationException);
        }
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static final Object m5283(RunnableC1625 runnableC1625, InterfaceC3864 interfaceC3864) throws Throwable {
        Object c1626;
        Object objM5263;
        m5299(runnableC1625, true, new C1595(1, m5285(runnableC1625.f9019.mo3963()).mo5200(runnableC1625.f6400, runnableC1625, runnableC1625.f6391)));
        try {
            if (interfaceC3864 instanceof AbstractC2563) {
                AbstractC1549.m5141(2, interfaceC3864);
                c1626 = interfaceC3864.mo1054(runnableC1625, runnableC1625);
            } else {
                c1626 = ˑי.ˈٴ(interfaceC3864, runnableC1625, runnableC1625);
            }
        } catch (Throwable th) {
            c1626 = new C1626(th, false);
        }
        EnumC2332 enumC2332 = EnumC2332.f9250;
        if (c1626 == enumC2332 || (objM5263 = runnableC1625.m5263(c1626)) == f6416) {
            return enumC2332;
        }
        if (objM5263 instanceof C1626) {
            Throwable th2 = ((C1626) objM5263).f6402;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).f3890 != runnableC1625) {
                throw th2;
            }
            if (c1626 instanceof C1626) {
                throw ((C1626) c1626).f6402;
            }
        } else {
            c1626 = m5307(objM5263);
        }
        return c1626;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ˈٴ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m5284(long r7, ᵢˈ.ˑﾞ r9, p185.AbstractC2562 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof p072.C1601
            if (r0 == 0) goto L13
            r0 = r10
            ʿʽ.ˎᵢ r0 = (p072.C1601) r0
            int r1 = r0.f6367
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6367 = r1
            goto L18
        L13:
            ʿʽ.ˎᵢ r0 = new ʿʽ.ˎᵢ
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f6365
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f6367
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ʿ.ᵎˏ r7 = r0.f6366
            ˈⁱ.ˉⁱ.ˆʿ(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L2a
            goto L55
        L2a:
            r8 = move-exception
            goto L58
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            ˈⁱ.ˉⁱ.ˆʿ(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            ʿ.ᵎˏ r10 = new ʿ.ᵎˏ
            r10.<init>()
            r0.f6366 = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L56
            r0.f6367 = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L56
            ʿʽ.ᵎʾ r2 = new ʿʽ.ᵎʾ     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L56
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L56
            r10.f6302 = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L56
            java.lang.Object r10 = m5283(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L56
            if (r10 != r1) goto L55
            return r1
        L55:
            return r10
        L56:
            r8 = move-exception
            r7 = r10
        L58:
            ʿʽ.ᵎʾ r9 = r8.f3890
            java.lang.Object r7 = r7.f6302
            if (r9 != r7) goto L5f
            return r3
        L5f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p072.AbstractC1642.m5284(long, ᵢˈ.ˑﾞ, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final InterfaceC1621 m5285(InterfaceC3747 interfaceC3747) {
        InterfaceC3750 interfaceC3750Mo3966 = interfaceC3747.mo3966(C3753.f14515);
        InterfaceC1621 interfaceC1621 = interfaceC3750Mo3966 instanceof InterfaceC1621 ? (InterfaceC1621) interfaceC3750Mo3966 : null;
        return interfaceC1621 == null ? AbstractC1610.f6388 : interfaceC1621;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final C1602 m5286(InterfaceC3746 interfaceC3746) {
        C1602 c1602;
        C1602 c16022;
        if (!(interfaceC3746 instanceof C2257)) {
            return new C1602(1, interfaceC3746);
        }
        C2257 c2257 = (C2257) interfaceC3746;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2257.f8977;
            Object obj = atomicReferenceFieldUpdater.get(c2257);
            C1228 c1228 = AbstractC2269.f9002;
            c1602 = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c2257, c1228);
                c16022 = null;
                break;
            }
            if (obj instanceof C1602) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c2257, obj, c1228)) {
                    if (atomicReferenceFieldUpdater.get(c2257) != obj) {
                        break;
                    }
                }
                c16022 = (C1602) obj;
                break loop0;
            }
            if (obj != c1228 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c16022 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1602.f6370;
            Object obj2 = atomicReferenceFieldUpdater2.get(c16022);
            if (!(obj2 instanceof C1599) || ((C1599) obj2).f6363 == null) {
                C1602.f6369.set(c16022, 536870911);
                atomicReferenceFieldUpdater2.set(c16022, C1580.f6333);
                c1602 = c16022;
            } else {
                c16022.m5215();
            }
            if (c1602 != null) {
                return c1602;
            }
        }
        return new C1602(2, interfaceC3746);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static final String m5287(InterfaceC3746 interfaceC3746) {
        Object c3403;
        if (interfaceC3746 instanceof C2257) {
            return ((C2257) interfaceC3746).toString();
        }
        try {
            c3403 = interfaceC3746 + '@' + m5290(interfaceC3746);
        } catch (Throwable th) {
            c3403 = new C3403(th);
        }
        if (AbstractC3404.m8265(c3403) != null) {
            c3403 = interfaceC3746.getClass().getName() + '@' + m5290(interfaceC3746);
        }
        return (String) c3403;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final void m5288(Throwable th, InterfaceC3747 interfaceC3747) {
        try {
            C2824 c2824 = (C2824) interfaceC3747.mo3966(C1584.f6342);
            if (c2824 != null) {
                c2824.m7100(th, interfaceC3747);
            } else {
                AbstractC2269.m6285(th, interfaceC3747);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                ʾˈ.ـﹶ(runtimeException, th);
                th = runtimeException;
            }
            AbstractC2269.m6285(th, interfaceC3747);
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static final Object m5289(Object obj) {
        return obj instanceof C1626 ? new C3403(((C1626) obj).f6402) : obj;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final String m5290(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static final boolean m5291(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final InterfaceC3747 m5292(InterfaceC3747 interfaceC3747, InterfaceC3747 interfaceC37472, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC3747.mo3968(bool, new C1021(3))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC37472.mo3968(bool, new C1021(3))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC3747.mo3967(interfaceC37472);
        }
        C3749 c3749 = C3749.f14510;
        InterfaceC3747 interfaceC37473 = (InterfaceC3747) interfaceC3747.mo3968(c3749, new C1021(4));
        Object objMo3968 = interfaceC37472;
        if (zBooleanValue2) {
            objMo3968 = interfaceC37472.mo3968(c3749, new C1021(5));
        }
        return interfaceC37473.mo3967((InterfaceC3747) objMo3968);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C1613 m5293() {
        return new C1613(null);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static C1617 m5294(InterfaceC1594 interfaceC1594, InterfaceC3747 interfaceC3747, int i, InterfaceC3864 interfaceC3864, int i2) {
        if ((i2 & 1) != 0) {
            interfaceC3747 = C3749.f14510;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        InterfaceC3747 interfaceC3747M5301 = m5301(interfaceC1594, interfaceC3747);
        C1617 c1597 = i == 2 ? new C1597(interfaceC3747M5301, interfaceC3864) : new C1617(interfaceC3747M5301, true, true);
        c1597.m5239(i, c1597, interfaceC3864);
        return c1597;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static final Object m5295(InterfaceC3747 interfaceC3747, InterfaceC3864 interfaceC3864, InterfaceC3746 interfaceC3746) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        InterfaceC3747 interfaceC3747Mo3963 = interfaceC3746.mo3963();
        InterfaceC3747 interfaceC3747Mo3967 = !((Boolean) interfaceC3747.mo3968(Boolean.FALSE, new C1021(3))).booleanValue() ? interfaceC3747Mo3963.mo3967(interfaceC3747) : m5292(interfaceC3747Mo3963, interfaceC3747, false);
        m5298(interfaceC3747Mo3967);
        if (interfaceC3747Mo3967 == interfaceC3747Mo3963) {
            C2274 c2274 = new C2274(interfaceC3746, interfaceC3747Mo3967);
            return ʽᐧ.ᐧˋ(c2274, c2274, interfaceC3864);
        }
        C3753 c3753 = C3753.f14515;
        if (AbstractC1549.m5138(interfaceC3747Mo3967.mo3966(c3753), interfaceC3747Mo3963.mo3966(c3753))) {
            C1635 c1635 = new C1635(interfaceC3746, interfaceC3747Mo3967);
            InterfaceC3747 interfaceC37472 = c1635.f6391;
            Object objM6280 = AbstractC2269.m6280(interfaceC37472, null);
            try {
                return ʽᐧ.ᐧˋ(c1635, c1635, interfaceC3864);
            } finally {
                AbstractC2269.m6288(interfaceC37472, objM6280);
            }
        }
        C1585 c1585 = new C1585(interfaceC3746, interfaceC3747Mo3967);
        try {
            AbstractC2269.m6278(C3397.f13249, ˑי.ˏᴵ(ˑי.ᐧʻ(c1585, c1585, interfaceC3864)));
            do {
                atomicIntegerFieldUpdater = C1585.f6343;
                int i = atomicIntegerFieldUpdater.get(c1585);
                if (i != 0) {
                    if (i != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objM5307 = m5307(C1634.f6410.get(c1585));
                    if (objM5307 instanceof C1626) {
                        throw ((C1626) objM5307).f6402;
                    }
                    return objM5307;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c1585, 0, 1));
            return EnumC2332.f9250;
        } catch (Throwable th) {
            ˆʿ.ˏᵢ(c1585, th);
            throw null;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C2267 m5296(InterfaceC3747 interfaceC3747) {
        if (interfaceC3747.mo3966(C1584.f6341) == null) {
            interfaceC3747 = interfaceC3747.mo3967(m5281());
        }
        return new C2267(interfaceC3747);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final Object m5297(long j, InterfaceC3746 interfaceC3746) {
        C3397 c3397 = C3397.f13249;
        if (j <= 0) {
            return c3397;
        }
        C1602 c1602 = new C1602(1, ˑי.ˏᴵ(interfaceC3746));
        c1602.m5205();
        if (j < Long.MAX_VALUE) {
            m5285(c1602.f6371).mo5197(j, c1602);
        }
        Object objM5203 = c1602.m5203();
        return objM5203 == EnumC2332.f9250 ? objM5203 : c3397;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final void m5298(InterfaceC3747 interfaceC3747) {
        InterfaceC1643 interfaceC1643 = (InterfaceC1643) interfaceC3747.mo3966(C1584.f6341);
        if (interfaceC1643 != null && !interfaceC1643.mo5168()) {
            throw interfaceC1643.mo5169();
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final InterfaceC1639 m5299(InterfaceC1643 interfaceC1643, boolean z, AbstractC1596 abstractC1596) {
        return interfaceC1643 instanceof C1634 ? ((C1634) interfaceC1643).m5267(z, abstractC1596) : interfaceC1643.mo5171(abstractC1596.mo5174(), z, new ᴵʿ(1, abstractC1596, AbstractC1596.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 6));
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static final void m5300(C1602 c1602, InterfaceC3746 interfaceC3746, boolean z) {
        Object obj = C1602.f6370.get(c1602);
        Throwable thMo5195 = c1602.mo5195(obj);
        Object c3403 = thMo5195 != null ? new C3403(thMo5195) : c1602.mo5191(obj);
        if (!z) {
            interfaceC3746.mo3974(c3403);
            return;
        }
        C2257 c2257 = (C2257) interfaceC3746;
        AbstractC2562 abstractC2562 = c2257.f8978;
        InterfaceC3747 interfaceC3747Mo3963 = abstractC2562.mo3963();
        Object objM6280 = AbstractC2269.m6280(interfaceC3747Mo3963, c2257.f8981);
        C1635 c1635M5306 = objM6280 != AbstractC2269.f9006 ? m5306(abstractC2562, interfaceC3747Mo3963, objM6280) : null;
        try {
            c2257.f8978.mo3974(c3403);
        } finally {
            if (c1635M5306 == null || c1635M5306.m5274()) {
                AbstractC2269.m6288(interfaceC3747Mo3963, objM6280);
            }
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static final InterfaceC3747 m5301(InterfaceC1594 interfaceC1594, InterfaceC3747 interfaceC3747) {
        InterfaceC3747 interfaceC3747M5292 = m5292(interfaceC1594.mo1029(), interfaceC3747, true);
        C3150 c3150 = AbstractC1586.f6345;
        return (interfaceC3747M5292 == c3150 || interfaceC3747M5292.mo3966(C3753.f14515) != null) ? interfaceC3747M5292 : interfaceC3747M5292.mo3967(c3150);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static Object m5302(InterfaceC3864 interfaceC3864) throws Throwable {
        C3749 c3749 = C3749.f14510;
        Thread threadCurrentThread = Thread.currentThread();
        C3753 c3753 = C3753.f14515;
        AbstractC1608 abstractC1608M5245 = AbstractC1628.m5245();
        InterfaceC3747 interfaceC3747M5292 = m5292(c3749, abstractC1608M5245, true);
        C3150 c3150 = AbstractC1586.f6345;
        if (interfaceC3747M5292 != c3150 && interfaceC3747M5292.mo3966(c3753) == null) {
            interfaceC3747M5292 = interfaceC3747M5292.mo3967(c3150);
        }
        C1615 c1615 = new C1615(interfaceC3747M5292, threadCurrentThread, abstractC1608M5245);
        c1615.m5239(1, c1615, interfaceC3864);
        AbstractC1608 abstractC1608 = c1615.f6392;
        if (abstractC1608 != null) {
            int i = AbstractC1608.f6381;
            abstractC1608.m5224(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jMo5229 = abstractC1608 != null ? abstractC1608.mo5229() : Long.MAX_VALUE;
                if (c1615.m5257()) {
                    if (abstractC1608 != null) {
                        int i2 = AbstractC1608.f6381;
                        abstractC1608.m5226(false);
                    }
                    Object objM5307 = m5307(C1634.f6410.get(c1615));
                    C1626 c1626 = objM5307 instanceof C1626 ? (C1626) objM5307 : null;
                    if (c1626 == null) {
                        return objM5307;
                    }
                    throw c1626.f6402;
                }
                LockSupport.parkNanos(c1615, jMo5229);
            } catch (Throwable th) {
                if (abstractC1608 != null) {
                    int i3 = AbstractC1608.f6381;
                    abstractC1608.m5226(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c1615.m5254(interruptedException);
        throw interruptedException;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static final Object m5303(long j, C2182 c2182, C2163 c2163) {
        long jM5484;
        long jM5483 = j;
        int i = C1769.f6845;
        boolean z = jM5483 > 0;
        if (z) {
            long j2 = ˏʾ.ˑⁱ(999999L, EnumC1768.NANOSECONDS);
            if (C1769.m5482(j)) {
                if (C1769.m5482(j2) && (j2 ^ jM5483) < 0) {
                    throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
                }
            } else if (C1769.m5482(j2)) {
                jM5483 = j2;
            } else {
                int i2 = ((int) jM5483) & 1;
                if (i2 == (((int) j2) & 1)) {
                    long j3 = (jM5483 >> 1) + (j2 >> 1);
                    if (i2 == 0) {
                        if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                            jM5483 = ˏʾ.ˋⁱ(j3 / 1000000);
                        } else {
                            jM5483 = j3 << 1;
                            int i3 = AbstractC1767.f6834;
                        }
                    } else if (-4611686018426L > j3 || j3 >= 4611686018427L) {
                        jM5483 = ˏʾ.ˋⁱ(ᵢʿ.ﹳﹳ(j3, -4611686018427387903L, 4611686018427387903L));
                    } else {
                        jM5483 = (j3 * 1000000) << 1;
                        int i4 = AbstractC1767.f6834;
                    }
                } else {
                    jM5483 = i2 == 1 ? C1769.m5483(jM5483 >> 1, j2 >> 1) : C1769.m5483(j2 >> 1, jM5483 >> 1);
                }
            }
            jM5484 = ((((int) jM5483) & 1) != 1 || C1769.m5482(jM5483)) ? C1769.m5484(jM5483, EnumC1768.MILLISECONDS) : jM5483 >> 1;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            jM5484 = 0;
        }
        if (jM5484 > 0) {
            return m5283(new RunnableC1625(jM5484, c2163), c2182);
        }
        throw new TimeoutCancellationException("Timed out immediately", null);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C1587 m5304(InterfaceC1594 interfaceC1594, ExecutorC3146 executorC3146, InterfaceC3864 interfaceC3864, int i) {
        InterfaceC3747 interfaceC3747 = executorC3146;
        if ((i & 1) != 0) {
            interfaceC3747 = C3749.f14510;
        }
        C1587 c1587 = new C1587(m5301(interfaceC1594, interfaceC3747), true, true);
        c1587.m5239(1, c1587, interfaceC3864);
        return c1587;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final AbstractC1636 m5305(Executor executor) {
        AbstractC1636 abstractC1636;
        ExecutorC1620 executorC1620 = executor instanceof ExecutorC1620 ? (ExecutorC1620) executor : null;
        return (executorC1620 == null || (abstractC1636 = executorC1620.f6397) == null) ? new C1600(executor) : abstractC1636;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static final C1635 m5306(InterfaceC3746 interfaceC3746, InterfaceC3747 interfaceC3747, Object obj) {
        C1635 c1635 = null;
        if (!(interfaceC3746 instanceof InterfaceC2566)) {
            return null;
        }
        if (interfaceC3747.mo3966(C1645.f6427) != null) {
            InterfaceC2566 interfaceC2566Mo3962 = (InterfaceC2566) interfaceC3746;
            while (true) {
                if ((interfaceC2566Mo3962 instanceof C1585) || (interfaceC2566Mo3962 = interfaceC2566Mo3962.mo3962()) == null) {
                    break;
                }
                if (interfaceC2566Mo3962 instanceof C1635) {
                    c1635 = (C1635) interfaceC2566Mo3962;
                    break;
                }
            }
            if (c1635 != null) {
                c1635.m5273(interfaceC3747, obj);
            }
        }
        return c1635;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static final Object m5307(Object obj) {
        InterfaceC1577 interfaceC1577;
        C1630 c1630 = obj instanceof C1630 ? (C1630) obj : null;
        return (c1630 == null || (interfaceC1577 = c1630.f6406) == null) ? obj : interfaceC1577;
    }
}
