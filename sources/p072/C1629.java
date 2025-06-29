package p072;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ʽᵔ.ᴵʿ;

/* renamed from: ʿʽ.ᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1629 extends AbstractC1596 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6404 = AtomicIntegerFieldUpdater.newUpdater(C1629.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final ᴵʿ f6405;

    public C1629(ᴵʿ r1) {
        this.f6405 = r1;
    }

    @Override // p072.AbstractC1596
    /* renamed from: ˉי */
    public final boolean mo5174() {
        return true;
    }

    @Override // p072.AbstractC1596
    /* renamed from: ˏʾ */
    public final void mo5175(Throwable th) {
        if (f6404.compareAndSet(this, 0, 1)) {
            this.f6405.ʽᐧ(th);
        }
    }
}
