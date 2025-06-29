package p423;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.JobCancellationException;
import p010.C1005;
import p034.C1228;
import p065.C1504;
import p072.AbstractC1614;
import p330.InterfaceC3746;
import p330.InterfaceC3747;

/* renamed from: ﹶʻ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4872 extends AbstractC1614 implements InterfaceC4876 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C4883 f18391;

    public AbstractC4872(InterfaceC3747 interfaceC3747, C4883 c4883, boolean z, boolean z2) {
        super(interfaceC3747, z, z2);
        this.f18391 = c4883;
    }

    @Override // p423.InterfaceC4873
    public final C4879 iterator() {
        C4883 c4883 = this.f18391;
        c4883.getClass();
        return new C4879(c4883);
    }

    @Override // p423.InterfaceC4891
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object mo10956(Object obj, InterfaceC3746 interfaceC3746) {
        return this.f18391.mo10956(obj, interfaceC3746);
    }

    @Override // p423.InterfaceC4873
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final Object mo10957() {
        return this.f18391.mo10957();
    }

    @Override // p423.InterfaceC4891
    /* renamed from: ˑי, reason: contains not printable characters */
    public Object mo10958(Object obj) {
        return this.f18391.mo10958(obj);
    }

    @Override // p072.C1634, p072.InterfaceC1643
    /* renamed from: ـﹶ */
    public final void mo5172(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo5242(), null, this);
        }
        mo5271(cancellationException);
    }

    @Override // p423.InterfaceC4873
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final Object mo10959(C1005 c1005) {
        C4883 c4883 = this.f18391;
        c4883.getClass();
        return C4883.m10973(c4883, c1005);
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final void m10960(C1504 c1504) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C4883 c4883 = this.f18391;
        c4883.getClass();
        do {
            atomicReferenceFieldUpdater = C4883.f18416;
            if (atomicReferenceFieldUpdater.compareAndSet(c4883, null, c1504)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(c4883) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c4883);
            C1228 c1228 = AbstractC4889.f18437;
            if (obj != c1228) {
                if (obj == AbstractC4889.f18426) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            C1228 c12282 = AbstractC4889.f18426;
            while (!atomicReferenceFieldUpdater.compareAndSet(c4883, c1228, c12282)) {
                if (atomicReferenceFieldUpdater.get(c4883) != c1228) {
                    break;
                }
            }
            c1504.mo4036(c4883.m10983());
            return;
        }
    }

    @Override // p072.C1634
    /* renamed from: ﾞˊ */
    public final void mo5271(CancellationException cancellationException) {
        this.f18391.m10979(cancellationException, true);
        m5254(cancellationException);
    }
}
