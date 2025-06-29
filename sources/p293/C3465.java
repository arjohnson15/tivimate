package p293;

import com.google.android.gms.internal.measurement.HandlerC0413;

/* renamed from: ٴᵎ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3465 implements InterfaceC3472 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C3464 f13414;

    public C3465(C3464 c3464) {
        this.f13414 = c3464;
    }

    @Override // p293.InterfaceC3472
    /* renamed from: ـﹶ */
    public final void mo7087(boolean z) {
        HandlerC0413 handlerC0413 = this.f13414.f13406;
        handlerC0413.sendMessage(handlerC0413.obtainMessage(1, Boolean.valueOf(z)));
    }
}
