package p007;

import p031.C1196;
import p033.C1218;
import p033.C1220;
import p331.C3761;
import p383.AbstractC4470;
import p397.C4607;
import p438.C5118;
import p438.SurfaceHolderCallbackC5075;

/* renamed from: ʻˉ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0941 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f4141;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ long f4142;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C3761 f4143;

    public /* synthetic */ RunnableC0941(C3761 c3761, Object obj, long j) {
        this.f4143 = c3761;
        this.f4141 = obj;
        this.f4142 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3761 c3761 = this.f4143;
        c3761.getClass();
        int i = AbstractC4470.f17202;
        C5118 c5118 = ((SurfaceHolderCallbackC5075) ((InterfaceC0962) c3761.f14528)).f19247;
        C1220 c1220 = c5118.f19567;
        C1218 c1218M4364 = c1220.m4364();
        long j = this.f4142;
        Object obj = this.f4141;
        c1220.m4338(c1218M4364, 26, new C1196(c1218M4364, obj, j));
        if (c5118.f19535 == obj) {
            c5118.f19524.ᐧʻ(26, new C4607(11));
        }
    }
}
