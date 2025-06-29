package p218;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p013.C1040;

/* renamed from: ˏי.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2833 implements InterfaceC2836 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AtomicReference f10991;

    public C2833(C1040 c1040) {
        this.f10991 = new AtomicReference(c1040);
    }

    @Override // p218.InterfaceC2836
    public final Iterator iterator() {
        InterfaceC2836 interfaceC2836 = (InterfaceC2836) this.f10991.getAndSet(null);
        if (interfaceC2836 != null) {
            return interfaceC2836.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
