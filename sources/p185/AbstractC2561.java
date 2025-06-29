package p185;

import p330.C3749;
import p330.InterfaceC3746;
import p330.InterfaceC3747;

/* renamed from: ˎʻ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2561 extends AbstractC2563 {
    public AbstractC2561(InterfaceC3746 interfaceC3746) {
        super(interfaceC3746);
        if (interfaceC3746 != null && interfaceC3746.mo3963() != C3749.f14510) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ᐧʻ */
    public final InterfaceC3747 mo3963() {
        return C3749.f14510;
    }
}
