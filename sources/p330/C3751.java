package p330;

import p070.AbstractC1547;
import p338.InterfaceC3864;

/* renamed from: ᴵⁱ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3751 extends AbstractC1547 implements InterfaceC3864 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C3751 f14511 = new C3751(2, 0);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C3751 f14512 = new C3751(2, 1);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f14513;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3751(int i, int i2) {
        super(i);
        this.f14513 = i2;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C3755 c3755;
        switch (this.f14513) {
            case 0:
                String str = (String) obj;
                InterfaceC3750 interfaceC3750 = (InterfaceC3750) obj2;
                if (str.length() == 0) {
                    return interfaceC3750.toString();
                }
                return str + ", " + interfaceC3750;
            default:
                InterfaceC3750 interfaceC37502 = (InterfaceC3750) obj2;
                InterfaceC3747 interfaceC3747Mo3965 = ((InterfaceC3747) obj).mo3965(interfaceC37502.getKey());
                C3749 c3749 = C3749.f14510;
                if (interfaceC3747Mo3965 == c3749) {
                    return interfaceC37502;
                }
                C3753 c3753 = C3753.f14515;
                InterfaceC3754 interfaceC3754 = (InterfaceC3754) interfaceC3747Mo3965.mo3966(c3753);
                if (interfaceC3754 == null) {
                    c3755 = new C3755(interfaceC3747Mo3965, interfaceC37502);
                } else {
                    InterfaceC3747 interfaceC3747Mo39652 = interfaceC3747Mo3965.mo3965(c3753);
                    if (interfaceC3747Mo39652 == c3749) {
                        return new C3755(interfaceC37502, interfaceC3754);
                    }
                    c3755 = new C3755(new C3755(interfaceC3747Mo39652, interfaceC37502), interfaceC3754);
                }
                return c3755;
        }
    }
}
