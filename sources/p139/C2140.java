package p139;

import java.util.ArrayList;
import p200.C2741;

/* renamed from: ˉˋ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2140 extends AbstractC2159 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC2155 f8397;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C2741 f8398;

    public C2140(ViewTreeObserverOnPreDrawListenerC2155 viewTreeObserverOnPreDrawListenerC2155, C2741 c2741) {
        this.f8397 = viewTreeObserverOnPreDrawListenerC2155;
        this.f8398 = c2741;
    }

    @Override // p139.AbstractC2159, p139.InterfaceC2121
    /* renamed from: ـﹶ */
    public final void mo5991(AbstractC2160 abstractC2160) {
        ((ArrayList) this.f8398.get(this.f8397.f8442)).remove(abstractC2160);
        abstractC2160.mo6019(this);
    }
}
