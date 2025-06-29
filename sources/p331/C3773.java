package p331;

import java.util.HashMap;
import p288.C3397;
import p338.InterfaceC3856;

/* renamed from: ᴵﹳ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C3773 implements InterfaceC3856 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C3772 f14607;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f14608;

    public /* synthetic */ C3773(C3772 c3772, int i) {
        this.f14608 = i;
        this.f14607 = c3772;
    }

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) {
        HashMap map = (HashMap) obj;
        switch (this.f14608) {
            case 0:
                this.f14607.m8820(map);
                break;
            default:
                this.f14607.m8830(map);
                break;
        }
        return C3397.f13249;
    }
}
