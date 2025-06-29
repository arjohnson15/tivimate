package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p113.BinderC1816;
import p417.AbstractC4753;

/* renamed from: com.google.android.gms.internal.measurement.ᵎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0508 extends AbstractRunnableC0408 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f2857;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C0367 f2858;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ Object f2859;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0508(C0367 c0367, Exception exc) {
        super(c0367, false);
        this.f2857 = 2;
        this.f2859 = exc;
        this.f2858 = c0367;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0508(C0367 c0367, Object obj, int i) {
        super(c0367, true);
        this.f2857 = i;
        this.f2859 = obj;
        this.f2858 = c0367;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0408
    /* renamed from: ـﹶ */
    public final void mo1628() {
        switch (this.f2857) {
            case 0:
                InterfaceC0516 interfaceC0516 = this.f2858.f2617;
                AbstractC4753.m10683(interfaceC0516);
                interfaceC0516.setConditionalUserProperty((Bundle) this.f2859, this.f2699);
                break;
            case 1:
                InterfaceC0516 interfaceC05162 = this.f2858.f2617;
                AbstractC4753.m10683(interfaceC05162);
                interfaceC05162.setMeasurementEnabled(((Boolean) this.f2859).booleanValue(), this.f2699);
                break;
            case 2:
                InterfaceC0516 interfaceC05163 = this.f2858.f2617;
                AbstractC4753.m10683(interfaceC05163);
                interfaceC05163.logHealthData(5, "Error with data collection. Data lost.", new BinderC1816((Exception) this.f2859), new BinderC1816(null), new BinderC1816(null));
                break;
            default:
                InterfaceC0516 interfaceC05164 = this.f2858.f2617;
                AbstractC4753.m10683(interfaceC05164);
                interfaceC05164.registerOnMeasurementEventListener((BinderC0306) this.f2859);
                break;
        }
    }
}
