package p118;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p148.AbstractC2263;
import p330.InterfaceC3747;

/* renamed from: ˈˈ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1850 extends AbstractC2263 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f7094;

    public C1850(long j, C1850 c1850, int i) {
        super(j, c1850, i);
        this.f7094 = new AtomicReferenceArray(AbstractC1857.f7110);
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f8996 + ", hashCode=" + hashCode() + ']';
    }

    @Override // p148.AbstractC2263
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void mo5609(int i, InterfaceC3747 interfaceC3747) {
        this.f7094.set(i, AbstractC1857.f7107);
        m6272();
    }

    @Override // p148.AbstractC2263
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int mo5610() {
        return AbstractC1857.f7110;
    }
}
