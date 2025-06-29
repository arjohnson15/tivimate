package p395;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ˎˊ.ˏʾ;

/* renamed from: ⁱـ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4529 extends ˏʾ {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f17408;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f17409;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f17410;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f17411;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f17412;

    public C4529(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f17408 = atomicReferenceFieldUpdater;
        this.f17409 = atomicReferenceFieldUpdater2;
        this.f17412 = atomicReferenceFieldUpdater3;
        this.f17410 = atomicReferenceFieldUpdater4;
        this.f17411 = atomicReferenceFieldUpdater5;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m10305(AbstractC4541 abstractC4541, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f17411;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4541, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4541) == obj);
        return false;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final C4532 m10306(AbstractC4541 abstractC4541) {
        return (C4532) this.f17412.getAndSet(abstractC4541, C4532.f17419);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m10307(AbstractC4541 abstractC4541, C4532 c4532, C4532 c45322) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f17412;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4541, c4532, c45322)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4541) == c4532);
        return false;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final C4545 m10308(AbstractC4541 abstractC4541) {
        return (C4545) this.f17410.getAndSet(abstractC4541, C4545.f17445);
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m10309(C4532 c4532, C4532 c45322) {
        this.f17409.lazySet(c4532, c45322);
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m10310(C4532 c4532, Thread thread) {
        this.f17408.lazySet(c4532, thread);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m10311(AbstractC4541 abstractC4541, C4545 c4545, C4545 c45452) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f17410;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4541, c4545, c45452)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4541) == c4545);
        return false;
    }
}
