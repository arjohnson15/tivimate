package p140;

import p065.InterfaceC1506;
import p185.AbstractC2562;
import p262.InterfaceC3255;
import p338.InterfaceC3856;
import p427.C4917;

/* renamed from: ˉˏ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2180 implements InterfaceC2184, InterfaceC1506 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f8566;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f8567;

    public /* synthetic */ C2180(int i, Object obj) {
        this.f8567 = i;
        this.f8566 = obj;
    }

    @Override // p140.InterfaceC2184
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC3255 mo6107() {
        switch (this.f8567) {
            case 0:
                return ((C2185) this.f8566).f8582;
            default:
                return ((C4917) this.f8566).f18592;
        }
    }

    @Override // p065.InterfaceC1506
    /* renamed from: ـﹶ */
    public final Object mo5080(String str, InterfaceC3856 interfaceC3856, AbstractC2562 abstractC2562) {
        switch (this.f8567) {
            case 0:
                return ((C2185) this.f8566).mo5080(str, interfaceC3856, abstractC2562);
            default:
                return ((C4917) this.f8566).mo5080(str, interfaceC3856, abstractC2562);
        }
    }
}
