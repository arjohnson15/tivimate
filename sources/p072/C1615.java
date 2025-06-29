package p072;

import java.util.concurrent.locks.LockSupport;
import p070.AbstractC1549;
import p330.InterfaceC3747;

/* renamed from: ʿʽ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1615 extends AbstractC1614 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final AbstractC1608 f6392;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Thread f6393;

    public C1615(InterfaceC3747 interfaceC3747, Thread thread, AbstractC1608 abstractC1608) {
        super(interfaceC3747, true, true);
        this.f6393 = thread;
        this.f6392 = abstractC1608;
    }

    @Override // p072.C1634
    /* renamed from: ᵎˏ */
    public final void mo5176(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f6393;
        if (AbstractC1549.m5138(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
