package p337;

import com.google.android.gms.internal.measurement.C0559;
import p016.C1072;
import p033.C1209;
import p033.C1220;
import p334.C3789;
import p383.AbstractC4470;
import p438.C5118;
import p438.SurfaceHolderCallbackC5075;

/* renamed from: ᵎˆ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3819 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0559 f14698;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f14699;

    public /* synthetic */ RunnableC3819(C0559 c0559, int i, long j, long j2) {
        this.f14699 = 8;
        this.f14698 = c0559;
    }

    public /* synthetic */ RunnableC3819(C0559 c0559, long j) {
        this.f14699 = 7;
        this.f14698 = c0559;
    }

    public /* synthetic */ RunnableC3819(C0559 c0559, Object obj, int i) {
        this.f14699 = i;
        this.f14698 = c0559;
    }

    public /* synthetic */ RunnableC3819(C0559 c0559, String str, long j, long j2) {
        this.f14699 = 5;
        this.f14698 = c0559;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0559 c0559 = this.f14698;
        int i = this.f14699;
        c0559.getClass();
        switch (i) {
            case 0:
                int i2 = AbstractC4470.f17202;
                C5118 c5118 = ((SurfaceHolderCallbackC5075) ((InterfaceC3822) c0559.f2913)).f19247;
                c5118.getClass();
                C1220 c1220 = c5118.f19567;
                c1220.m4338(c1220.m4364(), 1007, new C1209(23));
                break;
            case 1:
                int i3 = AbstractC4470.f17202;
                C1220 c12202 = ((SurfaceHolderCallbackC5075) ((InterfaceC3822) c0559.f2913)).f19247.f19567;
                c12202.m4338(c12202.m4364(), 1031, new C1209(22));
                break;
            case 2:
                int i4 = AbstractC4470.f17202;
                C1220 c12203 = ((SurfaceHolderCallbackC5075) ((InterfaceC3822) c0559.f2913)).f19247.f19567;
                c12203.m4338(c12203.m4364(), 1032, new C1209(25));
                break;
            case 3:
                int i5 = AbstractC4470.f17202;
                C1220 c12204 = ((SurfaceHolderCallbackC5075) ((InterfaceC3822) c0559.f2913)).f19247.f19567;
                c12204.m4338(c12204.m4364(), 1029, new C1209(4));
                break;
            case 4:
                int i6 = AbstractC4470.f17202;
                C1220 c12205 = ((SurfaceHolderCallbackC5075) ((InterfaceC3822) c0559.f2913)).f19247.f19567;
                c12205.m4338(c12205.m4364(), 1014, new C1209(7));
                break;
            case 5:
                int i7 = AbstractC4470.f17202;
                C1220 c12206 = ((SurfaceHolderCallbackC5075) ((InterfaceC3822) c0559.f2913)).f19247.f19567;
                c12206.m4338(c12206.m4364(), 1008, new C1072(17));
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                int i8 = AbstractC4470.f17202;
                C1220 c12207 = ((SurfaceHolderCallbackC5075) ((InterfaceC3822) c0559.f2913)).f19247.f19567;
                c12207.m4338(c12207.m4364(), 1012, new C1209(28));
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                int i9 = AbstractC4470.f17202;
                C1220 c12208 = ((SurfaceHolderCallbackC5075) ((InterfaceC3822) c0559.f2913)).f19247.f19567;
                c12208.m4338(c12208.m4364(), 1010, new C1072(15));
                break;
            default:
                int i10 = AbstractC4470.f17202;
                C1220 c12209 = ((SurfaceHolderCallbackC5075) ((InterfaceC3822) c0559.f2913)).f19247.f19567;
                c12209.m4338(c12209.m4364(), 1011, new C1209(13));
                break;
        }
    }
}
