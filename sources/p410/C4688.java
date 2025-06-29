package p410;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ﹶⁱ.ـﹶ;

/* renamed from: ﹳˎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4688 extends ـﹶ {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f17842;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f17843;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f17844;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f17845;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f17846;

    public C4688(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f17846 = atomicReferenceFieldUpdater;
        this.f17842 = atomicReferenceFieldUpdater2;
        this.f17844 = atomicReferenceFieldUpdater3;
        this.f17845 = atomicReferenceFieldUpdater4;
        this.f17843 = atomicReferenceFieldUpdater5;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m10593(AbstractC4686 abstractC4686, C4685 c4685, C4685 c46852) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f17844;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4686, c4685, c46852)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4686) == c4685);
        return false;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m10594(C4685 c4685, C4685 c46852) {
        this.f17842.lazySet(c4685, c46852);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m10595(AbstractC4686 abstractC4686, C4683 c4683, C4683 c46832) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f17845;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4686, c4683, c46832)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4686) == c4683);
        return false;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m10596(C4685 c4685, Thread thread) {
        this.f17846.lazySet(c4685, thread);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m10597(AbstractC4686 abstractC4686, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f17843;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4686, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4686) == obj);
        return false;
    }
}
