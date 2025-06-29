package p072;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p148.AbstractC2269;
import p148.C2274;
import ⁱـ.ˑי;

/* renamed from: ʿʽ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1585 extends C2274 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6343 = AtomicIntegerFieldUpdater.newUpdater(C1585.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p148.C2274, p072.C1634
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void mo5176(Object obj) {
        mo5177(obj);
    }

    @Override // p148.C2274, p072.C1634
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void mo5177(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f6343;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC2269.m6278(AbstractC1642.m5289(obj), ˑי.ˏᴵ(this.f9019));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
