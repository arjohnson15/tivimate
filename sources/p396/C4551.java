package p396;

import p070.AbstractC1547;
import p288.C3397;
import p338.InterfaceC3856;

/* renamed from: ⁱᴵ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4551 extends AbstractC1547 implements InterfaceC3856 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f17454;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4591 f17455;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4551(InterfaceC4591 interfaceC4591, int i) {
        super(1);
        this.f17454 = i;
        this.f17455 = interfaceC4591;
    }

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) {
        switch (this.f17454) {
            case 0:
                this.f17455.cancel();
                break;
            case 1:
                this.f17455.cancel();
                break;
            default:
                this.f17455.cancel();
                break;
        }
        return C3397.f13249;
    }
}
