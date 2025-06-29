package p222;

import p320.InterfaceC3653;

/* renamed from: ˏᴵ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2952 extends AbstractViewOnTouchListenerC2857 {

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final /* synthetic */ C2916 f11398;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final /* synthetic */ C2904 f11399;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2952(C2904 c2904, C2904 c29042, C2916 c2916) {
        super(c29042);
        this.f11399 = c2904;
        this.f11398 = c2916;
    }

    @Override // p222.AbstractViewOnTouchListenerC2857
    /* renamed from: ʽᐧ */
    public final InterfaceC3653 mo7172() {
        return this.f11398;
    }

    @Override // p222.AbstractViewOnTouchListenerC2857
    /* renamed from: ˑʽ */
    public final boolean mo7173() {
        C2904 c2904 = this.f11399;
        if (c2904.getInternalPopup().mo7274()) {
            return true;
        }
        c2904.f11245.mo7260(c2904.getTextDirection(), c2904.getTextAlignment());
        return true;
    }
}
