package p118;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p034.C1228;
import p072.AbstractC1642;
import p072.C1602;
import p155.EnumC2332;
import p185.AbstractC2562;
import p288.C3397;
import ⁱـ.ˑי;

/* renamed from: ˈˈ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1856 extends C1851 implements InterfaceC1853 {

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7105 = AtomicReferenceFieldUpdater.newUpdater(C1856.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public C1856(boolean z) {
        super(z ? 1 : 0);
        this.owner$volatile = z ? null : AbstractC1849.f7093;
    }

    public final String toString() {
        return "Mutex@" + AbstractC1642.m5290(this) + "[isLocked=" + mo5614() + ",owner=" + f7105.get(this) + ']';
    }

    @Override // p118.InterfaceC1853
    /* renamed from: ʽᐧ */
    public final Object mo5613(AbstractC2562 abstractC2562) {
        int i;
        char c;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1851.f7098;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i2 <= 0) {
                    c = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    f7105.set(this, null);
                    c = 0;
                    break;
                }
            }
        }
        C3397 c3397 = C3397.f13249;
        if (c == 0) {
            return c3397;
        }
        if (c != 1) {
            if (c != 2) {
                throw new IllegalStateException("unexpected");
            }
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
        C1602 c1602M5286 = AbstractC1642.m5286(ˑי.ˏᴵ(abstractC2562));
        try {
            m5612(new C1852(this, c1602M5286));
            Object objM5203 = c1602M5286.m5203();
            EnumC2332 enumC2332 = EnumC2332.f9250;
            if (objM5203 != enumC2332) {
                objM5203 = c3397;
            }
            return objM5203 == enumC2332 ? objM5203 : c3397;
        } catch (Throwable th) {
            c1602M5286.m5204();
            throw th;
        }
    }

    @Override // p118.InterfaceC1853
    /* renamed from: ˑʽ */
    public final boolean mo5614() {
        return Math.max(C1851.f7098.get(this), 0) == 0;
    }

    @Override // p118.InterfaceC1853
    /* renamed from: ـﹶ */
    public final void mo5615(Object obj) {
        while (mo5614()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7105;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C1228 c1228 = AbstractC1849.f7093;
            if (obj2 != c1228) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c1228)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    m5611();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
}
