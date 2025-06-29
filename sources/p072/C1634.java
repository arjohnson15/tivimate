package p072;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p034.C1228;
import p070.AbstractC1549;
import p148.C2271;
import p148.C2277;
import p185.AbstractC2562;
import p185.AbstractC2567;
import p330.InterfaceC3747;
import p330.InterfaceC3750;
import p330.InterfaceC3756;
import p338.InterfaceC3856;
import p338.InterfaceC3864;
import p395.AbstractC4535;
import ʽᵔ.ᴵʿ;
import ˈי.ʾˈ;
import ᴵﹳ.ٴˎ;
import ⁱـ.ˑי;

/* renamed from: ʿʽ.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1634 implements InterfaceC1643, InterfaceC1616 {
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6410 = AtomicReferenceFieldUpdater.newUpdater(C1634.class, Object.class, "_state$volatile");

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6409 = AtomicReferenceFieldUpdater.newUpdater(C1634.class, Object.class, "_parentHandle$volatile");

    public C1634(boolean z) {
        this._state$volatile = z ? AbstractC1642.f6417 : AbstractC1642.f6424;
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static String m5246(Object obj) {
        if (!(obj instanceof C1590)) {
            return obj instanceof InterfaceC1577 ? ((InterfaceC1577) obj).mo5166() ? "Active" : "New" : obj instanceof C1626 ? "Cancelled" : "Completed";
        }
        C1590 c1590 = (C1590) obj;
        return c1590.m5183() ? "Cancelling" : C1590.f6347.get(c1590) != 0 ? "Completing" : "Active";
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static C1603 m5247(C2277 c2277) {
        while (c2277.mo5236()) {
            C2277 c2277M6293 = c2277.m6293();
            if (c2277M6293 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2277.f9022;
                Object obj = atomicReferenceFieldUpdater.get(c2277);
                while (true) {
                    c2277 = (C2277) obj;
                    if (!c2277.mo5236()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c2277);
                }
            } else {
                c2277 = c2277M6293;
            }
        }
        while (true) {
            c2277 = c2277.m6292();
            if (!c2277.mo5236()) {
                if (c2277 instanceof C1603) {
                    return (C1603) c2277;
                }
                if (c2277 instanceof C1611) {
                    return null;
                }
            }
        }
    }

    @Override // p330.InterfaceC3750
    public final InterfaceC3756 getKey() {
        return C1584.f6341;
    }

    @Override // p072.InterfaceC1643
    public final boolean isCancelled() {
        Object obj = f6410.get(this);
        return (obj instanceof C1626) || ((obj instanceof C1590) && ((C1590) obj).m5183());
    }

    @Override // p072.InterfaceC1643
    public final boolean start() {
        int iM5260;
        do {
            iM5260 = m5260(f6410.get(this));
            if (iM5260 == 0) {
                return false;
            }
        } while (iM5260 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo5244() + '{' + m5246(f6410.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC1642.m5290(this));
        return sb.toString();
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ʻʿ */
    public final InterfaceC3747 mo3965(InterfaceC3756 interfaceC3756) {
        return AbstractC4535.m10363(this, interfaceC3756);
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final boolean m5248(C1590 c1590, C1603 c1603, Object obj) {
        while (AbstractC1642.m5299(c1603.f6373, false, new C1583(this, c1590, c1603, obj)) == C1588.f6346) {
            c1603 = m5247(c1603);
            if (c1603 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p072.InterfaceC1643
    /* renamed from: ʽᐧ */
    public boolean mo5168() {
        Object obj = f6410.get(this);
        return (obj instanceof InterfaceC1577) && ((InterfaceC1577) obj).mo5166();
    }

    /* renamed from: ʾʼ */
    public boolean mo5243(Throwable th) {
        return false;
    }

    /* renamed from: ʿˊ */
    public void mo5237(Object obj) {
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final Object m5249(AbstractC2562 abstractC2562) throws Throwable {
        Object obj;
        do {
            obj = f6410.get(this);
            if (!(obj instanceof InterfaceC1577)) {
                if (obj instanceof C1626) {
                    throw ((C1626) obj).f6402;
                }
                return AbstractC1642.m5307(obj);
            }
        } while (m5260(obj) < 0);
        C1624 c1624 = new C1624(ˑי.ˏᴵ(abstractC2562), this);
        c1624.m5205();
        c1624.m5210(new C1604(2, AbstractC1642.m5299(this, true, new C1595(3, c1624))));
        return c1624.m5203();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Throwable] */
    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Throwable m5250(Object obj) {
        CancellationException cancellationExceptionM5184;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(mo5242(), null, this) : th;
        }
        C1634 c1634 = (C1634) ((InterfaceC1616) obj);
        c1634.getClass();
        Object obj2 = f6410.get(c1634);
        if (obj2 instanceof C1590) {
            cancellationExceptionM5184 = ((C1590) obj2).m5184();
        } else if (obj2 instanceof C1626) {
            cancellationExceptionM5184 = ((C1626) obj2).f6402;
        } else {
            if (obj2 instanceof InterfaceC1577) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionM5184 = null;
        }
        CancellationException jobCancellationException = cancellationExceptionM5184 instanceof CancellationException ? cancellationExceptionM5184 : null;
        if (jobCancellationException == null) {
            jobCancellationException = new JobCancellationException("Parent job is ".concat(m5246(obj2)), cancellationExceptionM5184, c1634);
        }
        return jobCancellationException;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Object m5251(C1590 c1590, Object obj) {
        boolean zM5183;
        Throwable thM5253;
        C1626 c1626 = obj instanceof C1626 ? (C1626) obj : null;
        Throwable th = c1626 != null ? c1626.f6402 : null;
        synchronized (c1590) {
            zM5183 = c1590.m5183();
            ArrayList<Throwable> arrayListM5186 = c1590.m5186(th);
            thM5253 = m5253(c1590, arrayListM5186);
            if (thM5253 != null && arrayListM5186.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM5186.size()));
                for (Throwable th2 : arrayListM5186) {
                    if (th2 != thM5253 && th2 != thM5253 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        ʾˈ.ـﹶ(thM5253, th2);
                    }
                }
            }
        }
        if (thM5253 != null && thM5253 != th) {
            obj = new C1626(thM5253, false);
        }
        if (thM5253 != null && (m5259(thM5253) || mo5243(thM5253))) {
            C1626 c16262 = (C1626) obj;
            c16262.getClass();
            C1626.f6401.compareAndSet(c16262, 0, 1);
        }
        if (!zM5183) {
            mo5262(thM5253);
        }
        mo5237(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6410;
        Object c1630 = obj instanceof InterfaceC1577 ? new C1630((InterfaceC1577) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c1590, c1630) && atomicReferenceFieldUpdater.get(this) == c1590) {
        }
        m5261(c1590, obj);
        return obj;
    }

    /* renamed from: ˈٴ */
    public boolean mo3958(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m5254(th) && mo5187();
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final Object m5252(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC1577)) {
            return AbstractC1642.f6423;
        }
        if (((obj instanceof C1593) || (obj instanceof AbstractC1596)) && !(obj instanceof C1603) && !(obj2 instanceof C1626)) {
            InterfaceC1577 interfaceC1577 = (InterfaceC1577) obj;
            Object c1630 = obj2 instanceof InterfaceC1577 ? new C1630((InterfaceC1577) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f6410;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1577, c1630)) {
                    mo5262(null);
                    mo5237(obj2);
                    m5261(interfaceC1577, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC1577);
            return AbstractC1642.f6421;
        }
        InterfaceC1577 interfaceC15772 = (InterfaceC1577) obj;
        C1611 c1611M5272 = m5272(interfaceC15772);
        if (c1611M5272 == null) {
            return AbstractC1642.f6421;
        }
        C1590 c1590 = interfaceC15772 instanceof C1590 ? (C1590) interfaceC15772 : null;
        if (c1590 == null) {
            c1590 = new C1590(c1611M5272, null);
        }
        synchronized (c1590) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1590.f6347;
                if (atomicIntegerFieldUpdater.get(c1590) != 0) {
                    return AbstractC1642.f6423;
                }
                atomicIntegerFieldUpdater.set(c1590, 1);
                if (c1590 != interfaceC15772) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6410;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC15772, c1590)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC15772) {
                            return AbstractC1642.f6421;
                        }
                    }
                }
                boolean zM5183 = c1590.m5183();
                C1626 c1626 = obj2 instanceof C1626 ? (C1626) obj2 : null;
                if (c1626 != null) {
                    c1590.m5185(c1626.f6402);
                }
                Throwable thM5184 = zM5183 ? null : c1590.m5184();
                if (thM5184 != null) {
                    m5255(c1611M5272, thM5184);
                }
                C1603 c1603M5247 = m5247(c1611M5272);
                if (c1603M5247 != null && m5248(c1590, c1603M5247, obj2)) {
                    return AbstractC1642.f6416;
                }
                c1611M5272.m6291(new C2271(2), 2);
                C1603 c1603M52472 = m5247(c1611M5272);
                return (c1603M52472 == null || !m5248(c1590, c1603M52472, obj2)) ? m5251(c1590, obj2) : AbstractC1642.f6416;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˉᵎ */
    public void mo5189() {
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final Throwable m5253(C1590 c1590, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c1590.m5183()) {
                return new JobCancellationException(mo5242(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final boolean m5254(Object obj) {
        C1228 c1228;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objM5252 = AbstractC1642.f6423;
        if (mo5188()) {
            do {
                Object obj2 = f6410.get(this);
                if (obj2 instanceof InterfaceC1577) {
                    if (obj2 instanceof C1590) {
                        C1590 c1590 = (C1590) obj2;
                        c1590.getClass();
                        if (C1590.f6347.get(c1590) != 0) {
                        }
                    }
                    objM5252 = m5252(obj2, new C1626(m5250(obj), false));
                }
                objM5252 = AbstractC1642.f6423;
                break;
            } while (objM5252 == AbstractC1642.f6421);
            if (objM5252 == AbstractC1642.f6416) {
                return true;
            }
        }
        if (objM5252 == AbstractC1642.f6423) {
            Throwable thM5250 = null;
            loop1: while (true) {
                Object obj3 = f6410.get(this);
                if (!(obj3 instanceof C1590)) {
                    if (!(obj3 instanceof InterfaceC1577)) {
                        c1228 = AbstractC1642.f6422;
                        break;
                    }
                    if (thM5250 == null) {
                        thM5250 = m5250(obj);
                    }
                    InterfaceC1577 interfaceC1577 = (InterfaceC1577) obj3;
                    if (interfaceC1577.mo5166()) {
                        C1611 c1611M5272 = m5272(interfaceC1577);
                        if (c1611M5272 == null) {
                            continue;
                        } else {
                            C1590 c15902 = new C1590(c1611M5272, thM5250);
                            do {
                                atomicReferenceFieldUpdater = f6410;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1577, c15902)) {
                                    m5255(c1611M5272, thM5250);
                                    c1228 = AbstractC1642.f6423;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == interfaceC1577);
                        }
                    } else {
                        Object objM52522 = m5252(obj3, new C1626(thM5250, false));
                        if (objM52522 == AbstractC1642.f6423) {
                            throw new IllegalStateException(("Cannot happen in " + obj3).toString());
                        }
                        if (objM52522 != AbstractC1642.f6421) {
                            objM5252 = objM52522;
                            break;
                        }
                    }
                } else {
                    synchronized (obj3) {
                        try {
                            C1590 c15903 = (C1590) obj3;
                            c15903.getClass();
                            if (C1590.f6349.get(c15903) == AbstractC1642.f6418) {
                                c1228 = AbstractC1642.f6422;
                            } else {
                                boolean zM5183 = ((C1590) obj3).m5183();
                                if (obj != null || !zM5183) {
                                    if (thM5250 == null) {
                                        thM5250 = m5250(obj);
                                    }
                                    ((C1590) obj3).m5185(thM5250);
                                }
                                Throwable thM5184 = zM5183 ? null : ((C1590) obj3).m5184();
                                if (thM5184 != null) {
                                    m5255(((C1590) obj3).f6350, thM5184);
                                }
                                c1228 = AbstractC1642.f6423;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            objM5252 = c1228;
        }
        if (objM5252 != AbstractC1642.f6423 && objM5252 != AbstractC1642.f6416) {
            if (objM5252 == AbstractC1642.f6422) {
                return false;
            }
            mo5176(objM5252);
        }
        return true;
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final void m5255(C1611 c1611, Throwable th) {
        mo5262(th);
        c1611.m6291(new C2271(4), 4);
        CompletionHandlerException completionHandlerException = null;
        for (C2277 c2277M6292 = (C2277) C2277.f9024.get(c1611); !AbstractC1549.m5138(c2277M6292, c1611); c2277M6292 = c2277M6292.m6292()) {
            if ((c2277M6292 instanceof AbstractC1596) && ((AbstractC1596) c2277M6292).mo5174()) {
                try {
                    ((AbstractC1596) c2277M6292).mo5175(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ʾˈ.ـﹶ(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c2277M6292 + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo5238(completionHandlerException);
        }
        m5259(th);
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final void m5256(AbstractC1596 abstractC1596) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1611 c1611 = new C1611();
        abstractC1596.getClass();
        C2277.f9022.set(c1611, abstractC1596);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2277.f9024;
        atomicReferenceFieldUpdater2.set(c1611, abstractC1596);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC1596) == abstractC1596) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC1596, abstractC1596, c1611)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC1596) != abstractC1596) {
                        break;
                    }
                }
                c1611.m6294(abstractC1596);
                break loop0;
            }
            break;
        }
        C2277 c2277M6292 = abstractC1596.m6292();
        do {
            atomicReferenceFieldUpdater = f6410;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC1596, c2277M6292)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC1596);
    }

    @Override // p072.InterfaceC1643
    /* renamed from: ˎˑ */
    public final CancellationException mo5169() {
        CancellationException cancellationException;
        Object obj = f6410.get(this);
        if (!(obj instanceof C1590)) {
            if (obj instanceof InterfaceC1577) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C1626)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C1626) obj).f6402;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new JobCancellationException(mo5242(), th, this) : cancellationException;
        }
        Throwable thM5184 = ((C1590) obj).m5184();
        if (thM5184 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM5184 instanceof CancellationException ? (CancellationException) thM5184 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo5242();
        }
        return new JobCancellationException(strConcat, thM5184, this);
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final boolean m5257() {
        return !(f6410.get(this) instanceof InterfaceC1577);
    }

    @Override // p072.InterfaceC1643
    /* renamed from: ˏʾ */
    public final InterfaceC1639 mo5170(InterfaceC3856 interfaceC3856) {
        return m5267(true, new C1595(2, interfaceC3856));
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ˏᵢ */
    public final InterfaceC3750 mo3966(InterfaceC3756 interfaceC3756) {
        if (AbstractC1549.m5138(C1584.f6341, interfaceC3756)) {
            return this;
        }
        return null;
    }

    @Override // p072.InterfaceC1643
    /* renamed from: ˑʽ */
    public final InterfaceC1639 mo5171(boolean z, boolean z2, ᴵʿ r4) {
        return m5267(z2, z ? new C1629(r4) : new C1595(2, r4));
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final void m5258(InterfaceC1643 interfaceC1643) {
        C1588 c1588 = C1588.f6346;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6409;
        if (interfaceC1643 == null) {
            atomicReferenceFieldUpdater.set(this, c1588);
            return;
        }
        interfaceC1643.start();
        InterfaceC1623 interfaceC1623Mo5173 = interfaceC1643.mo5173(this);
        atomicReferenceFieldUpdater.set(this, interfaceC1623Mo5173);
        if (m5257()) {
            interfaceC1623Mo5173.mo5179();
            atomicReferenceFieldUpdater.set(this, c1588);
        }
    }

    /* renamed from: ˑﾞ */
    public void mo5238(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean m5259(Throwable th) {
        if (mo5265()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC1623 interfaceC1623 = (InterfaceC1623) f6409.get(this);
        return (interfaceC1623 == null || interfaceC1623 == C1588.f6346) ? z : interfaceC1623.mo5178(th) || z;
    }

    /* renamed from: יˋ, reason: contains not printable characters */
    public final int m5260(Object obj) {
        boolean z = obj instanceof C1593;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6410;
        if (z) {
            if (((C1593) obj).f6353) {
                return 0;
            }
            C1593 c1593 = AbstractC1642.f6417;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1593)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo5189();
            return 1;
        }
        if (!(obj instanceof C1631)) {
            return 0;
        }
        C1611 c1611 = ((C1631) obj).f6407;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1611)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        mo5189();
        return 1;
    }

    /* renamed from: ـˆ */
    public boolean mo5187() {
        return true;
    }

    @Override // p072.InterfaceC1643
    /* renamed from: ـﹶ */
    public void mo5172(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo5242(), null, this);
        }
        mo5271(cancellationException);
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ᐧˋ */
    public final InterfaceC3747 mo3967(InterfaceC3747 interfaceC3747) {
        return ٴˎ.ˋⁱ(this, interfaceC3747);
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void m5261(InterfaceC1577 interfaceC1577, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6409;
        InterfaceC1623 interfaceC1623 = (InterfaceC1623) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1623 != null) {
            interfaceC1623.mo5179();
            atomicReferenceFieldUpdater.set(this, C1588.f6346);
        }
        CompletionHandlerException completionHandlerException = null;
        C1626 c1626 = obj instanceof C1626 ? (C1626) obj : null;
        Throwable th = c1626 != null ? c1626.f6402 : null;
        if (interfaceC1577 instanceof AbstractC1596) {
            try {
                ((AbstractC1596) interfaceC1577).mo5175(th);
                return;
            } catch (Throwable th2) {
                mo5238(new CompletionHandlerException("Exception in completion handler " + interfaceC1577 + " for " + this, th2));
                return;
            }
        }
        C1611 c1611Mo5167 = interfaceC1577.mo5167();
        if (c1611Mo5167 != null) {
            c1611Mo5167.m6291(new C2271(1), 1);
            for (C2277 c2277M6292 = (C2277) C2277.f9024.get(c1611Mo5167); !AbstractC1549.m5138(c2277M6292, c1611Mo5167); c2277M6292 = c2277M6292.m6292()) {
                if (c2277M6292 instanceof AbstractC1596) {
                    try {
                        ((AbstractC1596) c2277M6292).mo5175(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            ʾˈ.ـﹶ(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c2277M6292 + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                mo5238(completionHandlerException);
            }
        }
    }

    /* renamed from: ᴵʼ */
    public boolean mo5188() {
        return this instanceof C1627;
    }

    @Override // p072.InterfaceC1643
    /* renamed from: ᴵʿ */
    public final InterfaceC1623 mo5173(C1634 c1634) {
        C1603 c1603 = new C1603(c1634);
        c1603.f6356 = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6410;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C1593) {
                C1593 c1593 = (C1593) obj;
                if (c1593.f6353) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1603)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m5268(c1593);
            } else {
                boolean z = obj instanceof InterfaceC1577;
                C1588 c1588 = C1588.f6346;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C1626 c1626 = obj2 instanceof C1626 ? (C1626) obj2 : null;
                    c1603.mo5175(c1626 != null ? c1626.f6402 : null);
                    return c1588;
                }
                C1611 c1611Mo5167 = ((InterfaceC1577) obj).mo5167();
                if (c1611Mo5167 == null) {
                    m5256((AbstractC1596) obj);
                } else if (!c1611Mo5167.m6291(c1603, 7)) {
                    boolean zM6291 = c1611Mo5167.m6291(c1603, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C1590) {
                        thM5184 = ((C1590) obj3).m5184();
                    } else {
                        C1626 c16262 = obj3 instanceof C1626 ? (C1626) obj3 : null;
                        if (c16262 != null) {
                            thM5184 = c16262.f6402;
                        }
                    }
                    c1603.mo5175(thM5184);
                    if (zM6291) {
                        break loop0;
                    }
                    return c1588;
                }
            }
        }
        return c1603;
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public void mo5262(Throwable th) {
    }

    /* renamed from: ᵎˏ */
    public void mo5176(Object obj) {
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final Object m5263(Object obj) {
        Object objM5252;
        do {
            objM5252 = m5252(f6410.get(this), obj);
            if (objM5252 == AbstractC1642.f6423) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C1626 c1626 = obj instanceof C1626 ? (C1626) obj : null;
                throw new IllegalStateException(str, c1626 != null ? c1626.f6402 : null);
            }
        } while (objM5252 == AbstractC1642.f6421);
        return objM5252;
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final boolean m5264(Object obj) {
        Object objM5252;
        do {
            objM5252 = m5252(f6410.get(this), obj);
            if (objM5252 == AbstractC1642.f6423) {
                return false;
            }
            if (objM5252 == AbstractC1642.f6416) {
                return true;
            }
        } while (objM5252 == AbstractC1642.f6421);
        mo5176(objM5252);
        return true;
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public boolean mo5265() {
        return this instanceof C1615;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Object m5266(AbstractC2567 abstractC2567) {
        return m5249(abstractC2567);
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final InterfaceC1639 m5267(boolean z, AbstractC1596 abstractC1596) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1588 c1588;
        boolean z2;
        boolean zM6291;
        abstractC1596.f6356 = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f6410;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof C1593;
            c1588 = C1588.f6346;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC1577)) {
                    z2 = false;
                    break;
                }
                InterfaceC1577 interfaceC1577 = (InterfaceC1577) obj;
                C1611 c1611Mo5167 = interfaceC1577.mo5167();
                if (c1611Mo5167 == null) {
                    m5256((AbstractC1596) obj);
                } else {
                    if (abstractC1596.mo5174()) {
                        C1590 c1590 = interfaceC1577 instanceof C1590 ? (C1590) interfaceC1577 : null;
                        Throwable thM5184 = c1590 != null ? c1590.m5184() : null;
                        if (thM5184 != null) {
                            if (z) {
                                abstractC1596.mo5175(thM5184);
                            }
                            return c1588;
                        }
                        zM6291 = c1611Mo5167.m6291(abstractC1596, 5);
                    } else {
                        zM6291 = c1611Mo5167.m6291(abstractC1596, 1);
                    }
                    if (zM6291) {
                        break;
                    }
                }
            } else {
                C1593 c1593 = (C1593) obj;
                if (c1593.f6353) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC1596)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m5268(c1593);
            }
        }
        if (z2) {
            return abstractC1596;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C1626 c1626 = obj2 instanceof C1626 ? (C1626) obj2 : null;
            abstractC1596.mo5175(c1626 != null ? c1626.f6402 : null);
        }
        return c1588;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ʿʽ.ᵔﹳ] */
    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final void m5268(C1593 c1593) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1611 c1611 = new C1611();
        if (!c1593.f6353) {
            c1611 = new C1631(c1611);
        }
        do {
            atomicReferenceFieldUpdater = f6410;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c1593, c1611)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c1593);
    }

    /* renamed from: ﹳˎ */
    public void mo5177(Object obj) {
        mo5176(obj);
    }

    /* renamed from: ﹳˑ */
    public String mo5242() {
        return "Job was cancelled";
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object m5269() {
        return m5270();
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Object m5270() throws Throwable {
        Object obj = f6410.get(this);
        if (obj instanceof InterfaceC1577) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C1626) {
            throw ((C1626) obj).f6402;
        }
        return AbstractC1642.m5307(obj);
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ﾞʽ */
    public final Object mo3968(Object obj, InterfaceC3864 interfaceC3864) {
        return interfaceC3864.mo1054(obj, this);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public void mo5271(CancellationException cancellationException) {
        m5254(cancellationException);
    }

    /* renamed from: ﾞˎ */
    public String mo5244() {
        return getClass().getSimpleName();
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C1611 m5272(InterfaceC1577 interfaceC1577) {
        C1611 c1611Mo5167 = interfaceC1577.mo5167();
        if (c1611Mo5167 != null) {
            return c1611Mo5167;
        }
        if (interfaceC1577 instanceof C1593) {
            return new C1611();
        }
        if (interfaceC1577 instanceof AbstractC1596) {
            m5256((AbstractC1596) interfaceC1577);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1577).toString());
    }
}
