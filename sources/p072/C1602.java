package p072;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import p034.C1228;
import p148.AbstractC2263;
import p148.AbstractC2269;
import p148.C2257;
import p155.EnumC2332;
import p185.InterfaceC2566;
import p288.AbstractC3404;
import p288.C3397;
import p330.InterfaceC3746;
import p330.InterfaceC3747;
import p338.InterfaceC3856;
import p338.InterfaceC3870;

/* renamed from: ʿʽ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1602 extends AbstractC1598 implements InterfaceC1589, InterfaceC2566, InterfaceC1576 {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final InterfaceC3747 f6371;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final InterfaceC3746 f6372;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6369 = AtomicIntegerFieldUpdater.newUpdater(C1602.class, "_decisionAndIndex$volatile");

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6370 = AtomicReferenceFieldUpdater.newUpdater(C1602.class, Object.class, "_state$volatile");

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6368 = AtomicReferenceFieldUpdater.newUpdater(C1602.class, Object.class, "_parentHandle$volatile");

    public C1602(int i, InterfaceC3746 interfaceC3746) {
        super(i);
        this.f6372 = interfaceC3746;
        this.f6371 = interfaceC3746.mo3963();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1580.f6333;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static Object m5201(InterfaceC1579 interfaceC1579, Object obj, int i, InterfaceC3870 interfaceC3870) {
        if ((obj instanceof C1626) || !AbstractC1642.m5291(i)) {
            return obj;
        }
        if (interfaceC3870 != null || (interfaceC1579 instanceof InterfaceC1640)) {
            return new C1599(obj, interfaceC1579 instanceof InterfaceC1640 ? (InterfaceC1640) interfaceC1579 : null, interfaceC3870, (CancellationException) null, 16);
        }
        return obj;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static void m5202(InterfaceC1579 interfaceC1579, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC1579 + ", already has " + obj).toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo5212());
        sb.append('(');
        sb.append(AbstractC1642.m5287(this.f6372));
        sb.append("){");
        Object obj = f6370.get(this);
        sb.append(obj instanceof InterfaceC1579 ? "Active" : obj instanceof C1591 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC1642.m5290(this));
        return sb.toString();
    }

    @Override // p072.AbstractC1598
    /* renamed from: ʽᐧ */
    public final void mo5190(CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6370;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC1579) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C1626) {
                return;
            }
            if (!(obj instanceof C1599)) {
                C1599 c1599 = new C1599(obj, (InterfaceC1640) null, (InterfaceC3870) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1599)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C1599 c15992 = (C1599) obj;
            if (c15992.f6360 != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C1599 c1599M5196 = C1599.m5196(c15992, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1599M5196)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC1640 interfaceC1640 = c15992.f6359;
            if (interfaceC1640 != null) {
                m5206(interfaceC1640, cancellationException);
            }
            InterfaceC3870 interfaceC3870 = c15992.f6361;
            if (interfaceC3870 != null) {
                m5213(interfaceC3870, cancellationException, c15992.f6362);
                return;
            }
            return;
        }
    }

    @Override // p072.AbstractC1598
    /* renamed from: ʿʼ */
    public final Object mo5191(Object obj) {
        return obj instanceof C1599 ? ((C1599) obj).f6362 : obj;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final Object m5203() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zM5218 = m5218();
        do {
            atomicIntegerFieldUpdater = f6369;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM5218) {
                    m5204();
                }
                Object obj = f6370.get(this);
                if (obj instanceof C1626) {
                    throw ((C1626) obj).f6402;
                }
                if (AbstractC1642.m5291(this.f6358)) {
                    InterfaceC1643 interfaceC1643 = (InterfaceC1643) this.f6371.mo3966(C1584.f6341);
                    if (interfaceC1643 != null && !interfaceC1643.mo5168()) {
                        CancellationException cancellationExceptionMo5169 = interfaceC1643.mo5169();
                        mo5190(cancellationExceptionMo5169);
                        throw cancellationExceptionMo5169;
                    }
                }
                return mo5191(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC1639) f6368.get(this)) == null) {
            m5220();
        }
        if (zM5218) {
            m5204();
        }
        return EnumC2332.f9250;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m5204() {
        InterfaceC3746 interfaceC3746 = this.f6372;
        Throwable th = null;
        C2257 c2257 = interfaceC3746 instanceof C2257 ? (C2257) interfaceC3746 : null;
        if (c2257 != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2257.f8977;
                Object obj = atomicReferenceFieldUpdater.get(c2257);
                C1228 c1228 = AbstractC2269.f9002;
                if (obj == c1228) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c2257, c1228, this)) {
                        if (atomicReferenceFieldUpdater.get(c2257) != c1228) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c2257, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c2257) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            m5215();
            m5209(th);
        }
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ˉי */
    public final void mo3974(Object obj) {
        Throwable thM8265 = AbstractC3404.m8265(obj);
        if (thM8265 != null) {
            obj = new C1626(thM8265, false);
        }
        m5207(obj, this.f6358, null);
    }

    @Override // p072.InterfaceC1589
    /* renamed from: ˉⁱ */
    public final C1228 mo5180(Object obj, InterfaceC3870 interfaceC3870) {
        return m5216(obj, interfaceC3870);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m5205() {
        InterfaceC1639 interfaceC1639M5220 = m5220();
        if (interfaceC1639M5220 == null || (f6370.get(this) instanceof InterfaceC1579)) {
            return;
        }
        interfaceC1639M5220.mo5179();
        f6368.set(this, C1588.f6346);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m5206(InterfaceC1640 interfaceC1640, Throwable th) {
        try {
            interfaceC1640.mo5221(th);
        } catch (Throwable th2) {
            AbstractC1642.m5288(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), this.f6371);
        }
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m5207(Object obj, int i, InterfaceC3870 interfaceC3870) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6370;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC1579) {
                Object objM5201 = m5201((InterfaceC1579) obj2, obj, i, interfaceC3870);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM5201)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!m5218()) {
                    m5215();
                }
                m5214(i);
                return;
            }
            if (obj2 instanceof C1591) {
                C1591 c1591 = (C1591) obj2;
                c1591.getClass();
                if (C1591.f6351.compareAndSet(c1591, 0, 1)) {
                    if (interfaceC3870 != null) {
                        m5213(interfaceC3870, c1591.f6402, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // p072.InterfaceC1589
    /* renamed from: ˎٴ */
    public final void mo5181(Object obj) {
        m5214(this.f6358);
    }

    @Override // p072.AbstractC1598
    /* renamed from: ˏʾ */
    public final Object mo5192() {
        return f6370.get(this);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m5208(AbstractC2263 abstractC2263, Throwable th) {
        InterfaceC3747 interfaceC3747 = this.f6371;
        int i = f6369.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC2263.mo5609(i, interfaceC3747);
        } catch (Throwable th2) {
            AbstractC1642.m5288(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), interfaceC3747);
        }
    }

    @Override // p072.AbstractC1598
    /* renamed from: ˑʽ */
    public final InterfaceC3746 mo5194() {
        return this.f6372;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean m5209(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6370;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC1579)) {
                return false;
            }
            C1591 c1591 = new C1591(this, th, (obj instanceof InterfaceC1640) || (obj instanceof AbstractC2263));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1591)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC1579 interfaceC1579 = (InterfaceC1579) obj;
            if (interfaceC1579 instanceof InterfaceC1640) {
                m5206((InterfaceC1640) obj, th);
            } else if (interfaceC1579 instanceof AbstractC2263) {
                m5208((AbstractC2263) obj, th);
            }
            if (!m5218()) {
                m5215();
            }
            m5214(this.f6358);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ad, code lost:
    
        m5202(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b0, code lost:
    
        throw null;
     */
    /* renamed from: יʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5210(p072.InterfaceC1579 r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p072.C1602.f6370
            java.lang.Object r7 = r0.get(r9)
            boolean r1 = r7 instanceof p072.C1580
            if (r1 == 0) goto L18
        La:
            boolean r1 = r0.compareAndSet(r9, r7, r10)
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto La
            goto L0
        L18:
            boolean r1 = r7 instanceof p072.InterfaceC1640
            r2 = 0
            if (r1 != 0) goto Lad
            boolean r1 = r7 instanceof p148.AbstractC2263
            if (r1 != 0) goto Lad
            boolean r1 = r7 instanceof p072.C1626
            if (r1 == 0) goto L57
            r0 = r7
            ʿʽ.ᵎˏ r0 = (p072.C1626) r0
            r0.getClass()
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = p072.C1626.f6401
            r4 = 0
            boolean r1 = r3.compareAndSet(r0, r4, r1)
            if (r1 == 0) goto L53
            boolean r1 = r7 instanceof p072.C1591
            if (r1 == 0) goto L52
            boolean r1 = r7 instanceof p072.C1626
            if (r1 == 0) goto L3e
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L43
            java.lang.Throwable r2 = r0.f6402
        L43:
            boolean r0 = r10 instanceof p072.InterfaceC1640
            if (r0 == 0) goto L4d
            ʿʽ.ﹶˆ r10 = (p072.InterfaceC1640) r10
            r9.m5206(r10, r2)
            goto L52
        L4d:
            ˊʻ.ˎٴ r10 = (p148.AbstractC2263) r10
            r9.m5208(r10, r2)
        L52:
            return
        L53:
            m5202(r10, r7)
            throw r2
        L57:
            boolean r1 = r7 instanceof p072.C1599
            if (r1 == 0) goto L8b
            r1 = r7
            ʿʽ.ˎٴ r1 = (p072.C1599) r1
            ʿʽ.ﹶˆ r3 = r1.f6359
            if (r3 != 0) goto L87
            boolean r3 = r10 instanceof p148.AbstractC2263
            if (r3 == 0) goto L67
            return
        L67:
            r3 = r10
            ʿʽ.ﹶˆ r3 = (p072.InterfaceC1640) r3
            java.lang.Throwable r4 = r1.f6360
            if (r4 == 0) goto L72
            r9.m5206(r3, r4)
            return
        L72:
            r4 = 29
            ʿʽ.ˎٴ r1 = p072.C1599.m5196(r1, r3, r2, r4)
        L78:
            boolean r2 = r0.compareAndSet(r9, r7, r1)
            if (r2 == 0) goto L7f
            return
        L7f:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r7) goto L78
            goto L0
        L87:
            m5202(r10, r7)
            throw r2
        L8b:
            boolean r1 = r10 instanceof p148.AbstractC2263
            if (r1 == 0) goto L90
            return
        L90:
            r3 = r10
            ʿʽ.ﹶˆ r3 = (p072.InterfaceC1640) r3
            ʿʽ.ˎٴ r8 = new ʿʽ.ˎٴ
            r4 = 0
            r5 = 0
            r6 = 28
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L9e:
            boolean r1 = r0.compareAndSet(r9, r7, r8)
            if (r1 == 0) goto La5
            return
        La5:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto L9e
            goto L0
        Lad:
            m5202(r10, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p072.C1602.m5210(ʿʽ.ʽˆ):void");
    }

    @Override // p072.InterfaceC1576
    /* renamed from: ـﹶ */
    public final void mo5165(AbstractC2263 abstractC2263, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f6369;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m5210(abstractC2263);
    }

    @Override // p185.InterfaceC2566
    /* renamed from: ٴˎ */
    public final InterfaceC2566 mo3962() {
        InterfaceC3746 interfaceC3746 = this.f6372;
        if (interfaceC3746 instanceof InterfaceC2566) {
            return (InterfaceC2566) interfaceC3746;
        }
        return null;
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ᐧʻ */
    public final InterfaceC3747 mo3963() {
        return this.f6371;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m5211(AbstractC1636 abstractC1636) {
        C3397 c3397 = C3397.f13249;
        InterfaceC3746 interfaceC3746 = this.f6372;
        C2257 c2257 = interfaceC3746 instanceof C2257 ? (C2257) interfaceC3746 : null;
        m5207(c3397, (c2257 != null ? c2257.f8979 : null) == abstractC1636 ? 4 : this.f6358, null);
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public String mo5212() {
        return "CancellableContinuation";
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m5213(InterfaceC3870 interfaceC3870, Throwable th, Object obj) {
        InterfaceC3747 interfaceC3747 = this.f6371;
        try {
            interfaceC3870.mo3975(th, obj, interfaceC3747);
        } catch (Throwable th2) {
            AbstractC1642.m5288(new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2), interfaceC3747);
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m5214(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f6369;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                InterfaceC3746 interfaceC3746 = this.f6372;
                boolean z = i == 4;
                if (z || !(interfaceC3746 instanceof C2257) || AbstractC1642.m5291(i) != AbstractC1642.m5291(this.f6358)) {
                    AbstractC1642.m5300(this, interfaceC3746, z);
                    return;
                }
                C2257 c2257 = (C2257) interfaceC3746;
                AbstractC1636 abstractC1636 = c2257.f8979;
                InterfaceC3747 interfaceC3747Mo3963 = c2257.f8978.mo3963();
                if (abstractC1636.mo5276(interfaceC3747Mo3963)) {
                    abstractC1636.mo5198(interfaceC3747Mo3963, this);
                    return;
                }
                AbstractC1608 abstractC1608M5245 = AbstractC1628.m5245();
                if (abstractC1608M5245.m5225()) {
                    abstractC1608M5245.m5228(this);
                    return;
                }
                abstractC1608M5245.m5224(true);
                try {
                    AbstractC1642.m5300(this, interfaceC3746, true);
                    do {
                    } while (abstractC1608M5245.m5230());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m5215() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6368;
        InterfaceC1639 interfaceC1639 = (InterfaceC1639) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1639 == null) {
            return;
        }
        interfaceC1639.mo5179();
        atomicReferenceFieldUpdater.set(this, C1588.f6346);
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C1228 m5216(Object obj, InterfaceC3870 interfaceC3870) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6370;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z = obj2 instanceof InterfaceC1579;
            C1228 c1228 = AbstractC1642.f6420;
            if (!z) {
                boolean z2 = obj2 instanceof C1599;
                return null;
            }
            Object objM5201 = m5201((InterfaceC1579) obj2, obj, this.f6358, interfaceC3870);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM5201)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!m5218()) {
                m5215();
            }
            return c1228;
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public Throwable mo5217(C1634 c1634) {
        return c1634.mo5169();
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final boolean m5218() {
        if (this.f6358 == 2) {
            C2257 c2257 = (C2257) this.f6372;
            c2257.getClass();
            if (C2257.f8977.get(c2257) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p072.AbstractC1598
    /* renamed from: ﹳﹳ */
    public final Throwable mo5195(Object obj) {
        Throwable thMo5195 = super.mo5195(obj);
        if (thMo5195 != null) {
            return thMo5195;
        }
        return null;
    }

    @Override // p072.InterfaceC1589
    /* renamed from: ﹶˆ */
    public final void mo5182(Object obj, InterfaceC3870 interfaceC3870) {
        m5207(obj, this.f6358, interfaceC3870);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void m5219(InterfaceC3856 interfaceC3856) {
        m5210(new C1604(1, interfaceC3856));
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final InterfaceC1639 m5220() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1643 interfaceC1643 = (InterfaceC1643) this.f6371.mo3966(C1584.f6341);
        if (interfaceC1643 == null) {
            return null;
        }
        InterfaceC1639 interfaceC1639M5299 = AbstractC1642.m5299(interfaceC1643, true, new C1595(0, this));
        do {
            atomicReferenceFieldUpdater = f6368;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC1639M5299)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC1639M5299;
    }
}
