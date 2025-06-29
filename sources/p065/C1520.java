package p065;

import p057.C1342;
import p070.AbstractC1547;
import p262.InterfaceC3254;
import p338.InterfaceC3856;
import p395.AbstractC4535;

/* renamed from: ʾᵔ.ᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1520 extends AbstractC1547 implements InterfaceC3856 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C1520 f6182 = new C1520(1, 0);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C1520 f6183 = new C1520(1, 1);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f6184;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1520(int i, int i2) {
        super(i);
        this.f6184 = i2;
    }

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) {
        switch (this.f6184) {
            case 0:
                return Boolean.valueOf(((InterfaceC3254) obj).mo6098());
            default:
                InterfaceC3254 interfaceC3254 = (InterfaceC3254) obj;
                C1342 c1342 = new C1342();
                while (interfaceC3254.mo6098()) {
                    c1342.add(Integer.valueOf((int) interfaceC3254.mo6095(0)));
                }
                return AbstractC4535.m10326(c1342);
        }
    }
}
