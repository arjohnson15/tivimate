package p423;

import p070.C1554;
import p148.AbstractC2269;
import p288.C3397;
import p330.InterfaceC3747;
import p338.InterfaceC3856;
import p338.InterfaceC3870;

/* renamed from: ﹶʻ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C4888 extends C1554 implements InterfaceC3870 {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ int f18420;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4888(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.f18420 = i3;
    }

    @Override // p338.InterfaceC3870
    /* renamed from: ﹳﹳ */
    public final Object mo3975(Object obj, Object obj2, Object obj3) {
        switch (this.f18420) {
            case 0:
                AbstractC2269.m6284(((C4883) this.f6288).f18417, obj2, (InterfaceC3747) obj3);
                break;
            default:
                Object obj4 = ((C4877) obj2).f18398;
                InterfaceC3747 interfaceC3747 = (InterfaceC3747) obj3;
                InterfaceC3856 interfaceC3856 = ((C4883) this.f6288).f18417;
                if (obj4 instanceof C4884) {
                    obj4 = null;
                }
                AbstractC2269.m6284(interfaceC3856, obj4, interfaceC3747);
                break;
        }
        return C3397.f13249;
    }
}
