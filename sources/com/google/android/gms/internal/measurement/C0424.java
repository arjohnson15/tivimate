package com.google.android.gms.internal.measurement;

import p417.AbstractC4753;

/* renamed from: com.google.android.gms.internal.measurement.ˑʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0424 extends AbstractRunnableC0408 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f2721;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ String f2722;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C0367 f2723;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0424(C0367 c0367, String str, int i) {
        super(c0367, true);
        this.f2721 = i;
        this.f2722 = str;
        this.f2723 = c0367;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0408
    /* renamed from: ـﹶ */
    public final void mo1628() {
        switch (this.f2721) {
            case 0:
                InterfaceC0516 interfaceC0516 = this.f2723.f2617;
                AbstractC4753.m10683(interfaceC0516);
                interfaceC0516.beginAdUnitExposure(this.f2722, this.f2696);
                break;
            default:
                InterfaceC0516 interfaceC05162 = this.f2723.f2617;
                AbstractC4753.m10683(interfaceC05162);
                interfaceC05162.endAdUnitExposure(this.f2722, this.f2696);
                break;
        }
    }
}
