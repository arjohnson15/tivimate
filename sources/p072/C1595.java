package p072;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p034.C1228;
import p070.AbstractC1549;
import p148.AbstractC2269;
import p148.C2257;
import p288.C3403;
import p338.InterfaceC3856;

/* renamed from: ʿʽ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1595 extends AbstractC1596 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f6354;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final Object f6355;

    public /* synthetic */ C1595(int i, Object obj) {
        this.f6354 = i;
        this.f6355 = obj;
    }

    @Override // p072.AbstractC1596
    /* renamed from: ˉי */
    public final boolean mo5174() {
        switch (this.f6354) {
        }
        return false;
    }

    @Override // p072.AbstractC1596
    /* renamed from: ˏʾ */
    public final void mo5175(Throwable th) {
        switch (this.f6354) {
            case 0:
                C1634 c1634 = this.f6356;
                if (c1634 == null) {
                    c1634 = null;
                }
                C1602 c1602 = (C1602) this.f6355;
                Throwable thMo5217 = c1602.mo5217(c1634);
                if (c1602.m5218()) {
                    C2257 c2257 = (C2257) c1602.f6372;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2257.f8977;
                        Object obj = atomicReferenceFieldUpdater.get(c2257);
                        C1228 c1228 = AbstractC2269.f9002;
                        if (AbstractC1549.m5138(obj, c1228)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c2257, c1228, thMo5217)) {
                                if (atomicReferenceFieldUpdater.get(c2257) != c1228) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c2257, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(c2257) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c1602.m5209(thMo5217);
                if (!c1602.m5218()) {
                    c1602.m5215();
                    break;
                }
                break;
            case 1:
                ((InterfaceC1639) this.f6355).mo5179();
                break;
            case 2:
                ((InterfaceC3856) this.f6355).mo4036(th);
                break;
            default:
                C1634 c16342 = this.f6356;
                if (c16342 == null) {
                    c16342 = null;
                }
                c16342.getClass();
                Object obj2 = C1634.f6410.get(c16342);
                boolean z = obj2 instanceof C1626;
                C1624 c1624 = (C1624) this.f6355;
                if (!z) {
                    c1624.mo3974(AbstractC1642.m5307(obj2));
                    break;
                } else {
                    c1624.mo3974(new C3403(((C1626) obj2).f6402));
                    break;
                }
        }
    }
}
