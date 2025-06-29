package com.google.android.gms.internal.measurement;

import android.app.Activity;
import p113.BinderC1816;
import p417.AbstractC4753;

/* renamed from: com.google.android.gms.internal.measurement.ʻʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0297 extends AbstractRunnableC0408 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f2418;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ Activity f2419;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C0443 f2420;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0297(C0443 c0443, Activity activity, int i) {
        super(c0443.f2750, true);
        this.f2418 = i;
        switch (i) {
            case 1:
                this.f2419 = activity;
                this.f2420 = c0443;
                super(c0443.f2750, true);
                break;
            case 2:
                this.f2419 = activity;
                this.f2420 = c0443;
                super(c0443.f2750, true);
                break;
            case 3:
                this.f2419 = activity;
                this.f2420 = c0443;
                super(c0443.f2750, true);
                break;
            case 4:
                this.f2419 = activity;
                this.f2420 = c0443;
                super(c0443.f2750, true);
                break;
            default:
                this.f2419 = activity;
                this.f2420 = c0443;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0408
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo1628() {
        switch (this.f2418) {
            case 0:
                InterfaceC0516 interfaceC0516 = this.f2420.f2750.f2617;
                AbstractC4753.m10683(interfaceC0516);
                interfaceC0516.onActivityStarted(new BinderC1816(this.f2419), this.f2696);
                break;
            case 1:
                InterfaceC0516 interfaceC05162 = this.f2420.f2750.f2617;
                AbstractC4753.m10683(interfaceC05162);
                interfaceC05162.onActivityPaused(new BinderC1816(this.f2419), this.f2696);
                break;
            case 2:
                InterfaceC0516 interfaceC05163 = this.f2420.f2750.f2617;
                AbstractC4753.m10683(interfaceC05163);
                interfaceC05163.onActivityResumed(new BinderC1816(this.f2419), this.f2696);
                break;
            case 3:
                InterfaceC0516 interfaceC05164 = this.f2420.f2750.f2617;
                AbstractC4753.m10683(interfaceC05164);
                interfaceC05164.onActivityStopped(new BinderC1816(this.f2419), this.f2696);
                break;
            default:
                InterfaceC0516 interfaceC05165 = this.f2420.f2750.f2617;
                AbstractC4753.m10683(interfaceC05165);
                interfaceC05165.onActivityDestroyed(new BinderC1816(this.f2419), this.f2696);
                break;
        }
    }
}
