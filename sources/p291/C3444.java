package p291;

import java.util.concurrent.atomic.AtomicReference;
import p071.AbstractC1570;

/* renamed from: ٴᐧ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3444 extends AbstractC1570 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReference f13343;

    public C3444(AtomicReference atomicReference) {
        this.f13343 = atomicReference;
    }

    @Override // p071.AbstractC1570
    /* renamed from: ـﹶ */
    public final void mo5158(Object obj) {
        AbstractC1570 abstractC1570 = (AbstractC1570) this.f13343.get();
        if (abstractC1570 == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC1570.mo5158(obj);
    }
}
