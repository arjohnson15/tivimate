package p456;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC0404;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: ﾞⁱ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5304 implements InterfaceC5268 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ AppMeasurementDynamiteService f20580;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC0404 f20581;

    public C5304(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC0404 interfaceC0404) {
        this.f20580 = appMeasurementDynamiteService;
        this.f20581 = interfaceC0404;
    }

    @Override // p456.InterfaceC5268
    /* renamed from: ـﹶ */
    public final void mo11398(long j, Bundle bundle, String str, String str2) {
        try {
            this.f20581.mo1813(j, bundle, str, str2);
        } catch (RemoteException e) {
            C5236 c5236 = this.f20580.f3111;
            if (c5236 != null) {
                C5301 c5301 = c5236.f20110;
                C5236.m11647(c5301);
                c5301.f20568.m4531(e, "Event listener threw exception");
            }
        }
    }
}
