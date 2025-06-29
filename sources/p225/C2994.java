package p225;

import p226.AbstractActivityC3030;
import p420.InterfaceC4854;

/* renamed from: ˏᵢ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2994 implements InterfaceC4854 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC3013 f11515;

    public C2994(AbstractActivityC3013 abstractActivityC3013) {
        this.f11515 = abstractActivityC3013;
    }

    @Override // p420.InterfaceC4854
    /* renamed from: ـﹶ */
    public final void mo610(AbstractActivityC3030 abstractActivityC3030) {
        AbstractActivityC3013 abstractActivityC3013 = this.f11515;
        AbstractC3014 delegate = abstractActivityC3013.getDelegate();
        delegate.mo7450();
        abstractActivityC3013.getSavedStateRegistry().m8243("androidx:appcompat");
        delegate.mo7449();
    }
}
