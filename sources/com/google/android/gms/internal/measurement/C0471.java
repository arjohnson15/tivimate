package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import p026.C1164;
import p113.BinderC1816;
import p417.AbstractC4753;
import p456.AbstractC5310;

/* renamed from: com.google.android.gms.internal.measurement.ٴᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0471 extends AbstractRunnableC0408 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f2789;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ Object f2790;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f2791;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ Object f2792;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0471(C0367 c0367, Object obj, Object obj2, int i) {
        super(c0367, true);
        this.f2789 = i;
        this.f2792 = obj;
        this.f2790 = obj2;
        this.f2791 = c0367;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0471(C0443 c0443, Activity activity, BinderC0519 binderC0519) {
        super(c0443.f2750, true);
        this.f2789 = 3;
        this.f2792 = activity;
        this.f2790 = binderC0519;
        this.f2791 = c0443;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0471(C0443 c0443, Bundle bundle, Activity activity) {
        super(c0443.f2750, true);
        this.f2789 = 2;
        this.f2790 = bundle;
        this.f2792 = activity;
        this.f2791 = c0443;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0408
    /* renamed from: ʽᐧ */
    public void mo2143() {
        switch (this.f2789) {
            case 1:
                ((BinderC0519) this.f2790).mo2130(null);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0408
    /* renamed from: ـﹶ */
    public final void mo1628() {
        InterfaceC0516 interfaceC0516AsInterface;
        Bundle bundle;
        switch (this.f2789) {
            case 0:
                try {
                    ((C0367) this.f2791).getClass();
                    AbstractC4753.m10683((Context) this.f2792);
                    C0367 c0367 = (C0367) this.f2791;
                    Context context = (Context) this.f2792;
                    c0367.getClass();
                    try {
                        interfaceC0516AsInterface = AbstractBinderC0299.asInterface(C1164.m4214(context, C1164.f4818, "com.google.android.gms.measurement.dynamite").m4219("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (DynamiteModule$LoadingException e) {
                        c0367.m2049(e, true, false);
                        interfaceC0516AsInterface = null;
                    }
                    c0367.f2617 = interfaceC0516AsInterface;
                    if (((C0367) this.f2791).f2617 != null) {
                        int iM4215 = C1164.m4215((Context) this.f2792, "com.google.android.gms.measurement.dynamite");
                        C0383 c0383 = new C0383(102001L, Math.max(iM4215, r2), C1164.m4218((Context) this.f2792, "com.google.android.gms.measurement.dynamite", false) < iM4215, null, null, null, (Bundle) this.f2790, AbstractC5310.m11921((Context) this.f2792));
                        InterfaceC0516 interfaceC0516 = ((C0367) this.f2791).f2617;
                        AbstractC4753.m10683(interfaceC0516);
                        interfaceC0516.initialize(new BinderC1816((Context) this.f2792), c0383, this.f2699);
                        break;
                    } else {
                        String str = ((C0367) this.f2791).f2619;
                        break;
                    }
                } catch (Exception e2) {
                    ((C0367) this.f2791).m2049(e2, true, false);
                    return;
                }
            case 1:
                InterfaceC0516 interfaceC05162 = ((C0367) this.f2791).f2617;
                AbstractC4753.m10683(interfaceC05162);
                interfaceC05162.getMaxUserProperties((String) this.f2792, (BinderC0519) this.f2790);
                break;
            case 2:
                if (((Bundle) this.f2790) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f2790).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f2790).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                InterfaceC0516 interfaceC05163 = ((C0443) this.f2791).f2750.f2617;
                AbstractC4753.m10683(interfaceC05163);
                interfaceC05163.onActivityCreated(new BinderC1816((Activity) this.f2792), bundle, this.f2696);
                break;
            default:
                InterfaceC0516 interfaceC05164 = ((C0443) this.f2791).f2750.f2617;
                AbstractC4753.m10683(interfaceC05164);
                interfaceC05164.onActivitySaveInstanceState(new BinderC1816((Activity) this.f2792), (BinderC0519) this.f2790, this.f2696);
                break;
        }
    }
}
