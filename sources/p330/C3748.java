package p330;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p155.EnumC2332;
import p185.InterfaceC2566;
import p288.C3403;

/* renamed from: ᴵⁱ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3748 implements InterfaceC3746, InterfaceC2566 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f14508 = AtomicReferenceFieldUpdater.newUpdater(C3748.class, Object.class, "result");
    private volatile Object result;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC3746 f14509;

    public C3748(InterfaceC3746 interfaceC3746) {
        EnumC2332 enumC2332 = EnumC2332.f9247;
        this.f14509 = interfaceC3746;
        this.result = enumC2332;
    }

    public final String toString() {
        return "SafeContinuation for " + this.f14509;
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ˉי */
    public final void mo3974(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC2332 enumC2332 = EnumC2332.f9247;
            if (obj2 == enumC2332) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14508;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC2332, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC2332) {
                        break;
                    }
                }
                return;
            }
            EnumC2332 enumC23322 = EnumC2332.f9250;
            if (obj2 != enumC23322) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14508;
            EnumC2332 enumC23323 = EnumC2332.f9248;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC23322, enumC23323)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC23322) {
                    break;
                }
            }
            this.f14509.mo3974(obj);
            return;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object m8719() throws Throwable {
        Object obj = this.result;
        EnumC2332 enumC2332 = EnumC2332.f9247;
        EnumC2332 enumC23322 = EnumC2332.f9250;
        if (obj == enumC2332) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14508;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC2332, enumC23322)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC2332) {
                    obj = this.result;
                }
            }
            return enumC23322;
        }
        if (obj == EnumC2332.f9248) {
            return enumC23322;
        }
        if (obj instanceof C3403) {
            throw ((C3403) obj).f13256;
        }
        return obj;
    }

    @Override // p185.InterfaceC2566
    /* renamed from: ٴˎ */
    public final InterfaceC2566 mo3962() {
        InterfaceC3746 interfaceC3746 = this.f14509;
        if (interfaceC3746 instanceof InterfaceC2566) {
            return (InterfaceC2566) interfaceC3746;
        }
        return null;
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ᐧʻ */
    public final InterfaceC3747 mo3963() {
        return this.f14509.mo3963();
    }
}
