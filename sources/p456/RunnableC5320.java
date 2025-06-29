package p456;

import com.google.android.gms.internal.measurement.InterfaceC0511;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p029.RunnableC1181;
import p447.AbstractC5179;

/* renamed from: ﾞⁱ.ᵎʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5320 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0511 f20621;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ AppMeasurementDynamiteService f20622;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20623;

    public /* synthetic */ RunnableC5320(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC0511 interfaceC0511, int i) {
        this.f20623 = i;
        this.f20621 = interfaceC0511;
        this.f20622 = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20623) {
            case 0:
                C5272 c5272M11549 = AbstractC5179.m11549(this.f20622.f3111);
                c5272M11549.m11785(new RunnableC1181(c5272M11549, c5272M11549.m11777(false), this.f20621, 13));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f20622;
                C5316 c5316 = appMeasurementDynamiteService.f3111.f20095;
                C5236.m11644(c5316);
                C5236 c5236 = appMeasurementDynamiteService.f3111;
                c5316.m11960(this.f20621, c5236.f20122 != null && c5236.f20122.booleanValue());
                break;
        }
    }
}
