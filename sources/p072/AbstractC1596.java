package p072;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p148.C2265;
import p148.C2277;

/* renamed from: ʿʽ.ˋﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1596 extends C2277 implements InterfaceC1639, InterfaceC1577 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C1634 f6356;

    @Override // p148.C2277
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC1642.m5290(this));
        sb.append("[job@");
        C1634 c1634 = this.f6356;
        if (c1634 == null) {
            c1634 = null;
        }
        sb.append(AbstractC1642.m5290(c1634));
        sb.append(']');
        return sb.toString();
    }

    @Override // p072.InterfaceC1577
    /* renamed from: ʽᐧ */
    public final boolean mo5166() {
        return true;
    }

    /* renamed from: ˉי */
    public abstract boolean mo5174();

    /* renamed from: ˏʾ */
    public abstract void mo5175(Throwable th);

    @Override // p072.InterfaceC1639
    /* renamed from: ـﹶ */
    public final void mo5179() {
        C1634 c1634 = this.f6356;
        if (c1634 == null) {
            c1634 = null;
        }
        c1634.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1634.f6410;
            Object obj = atomicReferenceFieldUpdater.get(c1634);
            if (obj instanceof AbstractC1596) {
                if (obj != this) {
                    return;
                }
                C1593 c1593 = AbstractC1642.f6417;
                while (!atomicReferenceFieldUpdater.compareAndSet(c1634, obj, c1593)) {
                    if (atomicReferenceFieldUpdater.get(c1634) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC1577) || ((InterfaceC1577) obj).mo5167() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2277.f9024;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C2265) {
                    C2277 c2277 = ((C2265) obj2).f8998;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                C2277 c22772 = (C2277) obj2;
                c22772.getClass();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C2277.f9023;
                C2265 c2265 = (C2265) atomicReferenceFieldUpdater3.get(c22772);
                if (c2265 == null) {
                    c2265 = new C2265(c22772);
                    atomicReferenceFieldUpdater3.set(c22772, c2265);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c2265)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                c22772.m6293();
                return;
            }
        }
    }

    @Override // p072.InterfaceC1577
    /* renamed from: ﹳﹳ */
    public final C1611 mo5167() {
        return null;
    }
}
