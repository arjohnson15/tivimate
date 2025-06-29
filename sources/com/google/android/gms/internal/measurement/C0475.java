package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p417.AbstractC4753;

/* renamed from: com.google.android.gms.internal.measurement.ٴﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0475 extends AbstractRunnableC0408 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f2805;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f2806;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ C0367 f2807;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ String f2808;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ String f2809;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0475(C0367 c0367, String str, String str2, Bundle bundle, int i) {
        super(c0367, true);
        this.f2805 = i;
        this.f2808 = str;
        this.f2809 = str2;
        this.f2806 = bundle;
        this.f2807 = c0367;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0408
    /* renamed from: ـﹶ */
    public final void mo1628() {
        switch (this.f2805) {
            case 0:
                InterfaceC0516 interfaceC0516 = this.f2807.f2617;
                AbstractC4753.m10683(interfaceC0516);
                interfaceC0516.clearConditionalUserProperty(this.f2808, this.f2809, this.f2806);
                break;
            default:
                long j = this.f2699;
                InterfaceC0516 interfaceC05162 = this.f2807.f2617;
                AbstractC4753.m10683(interfaceC05162);
                interfaceC05162.logEvent(this.f2808, this.f2809, this.f2806, true, true, j);
                break;
        }
    }
}
