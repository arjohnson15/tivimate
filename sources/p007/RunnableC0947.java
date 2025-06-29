package p007;

import p016.C1072;
import p033.C1209;
import p033.C1220;
import p331.C3761;
import p374.C4290;
import p383.AbstractC4470;
import p438.C5118;
import p438.SurfaceHolderCallbackC5075;

/* renamed from: ʻˉ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0947 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C3761 f4159;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4160;

    public /* synthetic */ RunnableC0947(C3761 c3761, int i, long j) {
        this.f4160 = 1;
        this.f4159 = c3761;
    }

    public /* synthetic */ RunnableC0947(C3761 c3761, long j, int i) {
        this.f4160 = 2;
        this.f4159 = c3761;
    }

    public /* synthetic */ RunnableC0947(C3761 c3761, Object obj, int i) {
        this.f4160 = i;
        this.f4159 = c3761;
    }

    public /* synthetic */ RunnableC0947(C3761 c3761, String str, long j, long j2) {
        this.f4160 = 0;
        this.f4159 = c3761;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3761 c3761 = this.f4159;
        int i = this.f4160;
        c3761.getClass();
        switch (i) {
            case 0:
                int i2 = AbstractC4470.f17202;
                C1220 c1220 = ((SurfaceHolderCallbackC5075) ((InterfaceC0962) c3761.f14528)).f19247.f19567;
                c1220.m4338(c1220.m4364(), 1016, new C1209(5));
                break;
            case 1:
                int i3 = AbstractC4470.f17202;
                C1220 c12202 = ((SurfaceHolderCallbackC5075) ((InterfaceC0962) c3761.f14528)).f19247.f19567;
                c12202.m4338(c12202.m4366((C4290) c12202.f5016.f16746), 1018, new C1072(21));
                break;
            case 2:
                int i4 = AbstractC4470.f17202;
                C1220 c12203 = ((SurfaceHolderCallbackC5075) ((InterfaceC0962) c3761.f14528)).f19247.f19567;
                c12203.m4338(c12203.m4366((C4290) c12203.f5016.f16746), 1021, new C1072(26));
                break;
            case 3:
                int i5 = AbstractC4470.f17202;
                C1220 c12204 = ((SurfaceHolderCallbackC5075) ((InterfaceC0962) c3761.f14528)).f19247.f19567;
                c12204.m4338(c12204.m4364(), 1030, new C1072(11));
                break;
            case 4:
                int i6 = AbstractC4470.f17202;
                C5118 c5118 = ((SurfaceHolderCallbackC5075) ((InterfaceC0962) c3761.f14528)).f19247;
                c5118.getClass();
                C1220 c12205 = c5118.f19567;
                c12205.m4338(c12205.m4364(), 1015, new C1209(2));
                break;
            default:
                int i7 = AbstractC4470.f17202;
                C1220 c12206 = ((SurfaceHolderCallbackC5075) ((InterfaceC0962) c3761.f14528)).f19247.f19567;
                c12206.m4338(c12206.m4364(), 1019, new C1072(20));
                break;
        }
    }
}
