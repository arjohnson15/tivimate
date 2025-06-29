package com.google.android.gms.internal.measurement;

import p417.AbstractC4753;

/* renamed from: com.google.android.gms.internal.measurement.ⁱⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0542 extends AbstractRunnableC0408 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f2881;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ BinderC0519 f2882;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C0367 f2883;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0542(C0367 c0367, BinderC0519 binderC0519, int i) {
        super(c0367, true);
        this.f2881 = i;
        this.f2882 = binderC0519;
        this.f2883 = c0367;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0408
    /* renamed from: ʽᐧ */
    public final void mo2143() {
        switch (this.f2881) {
            case 0:
                this.f2882.mo2130(null);
                break;
            case 1:
                this.f2882.mo2130(null);
                break;
            case 2:
                this.f2882.mo2130(null);
                break;
            case 3:
                this.f2882.mo2130(null);
                break;
            default:
                this.f2882.mo2130(null);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0408
    /* renamed from: ـﹶ */
    public final void mo1628() {
        switch (this.f2881) {
            case 0:
                InterfaceC0516 interfaceC0516 = this.f2883.f2617;
                AbstractC4753.m10683(interfaceC0516);
                interfaceC0516.getGmpAppId(this.f2882);
                break;
            case 1:
                InterfaceC0516 interfaceC05162 = this.f2883.f2617;
                AbstractC4753.m10683(interfaceC05162);
                interfaceC05162.generateEventId(this.f2882);
                break;
            case 2:
                InterfaceC0516 interfaceC05163 = this.f2883.f2617;
                AbstractC4753.m10683(interfaceC05163);
                interfaceC05163.getCachedAppInstanceId(this.f2882);
                break;
            case 3:
                InterfaceC0516 interfaceC05164 = this.f2883.f2617;
                AbstractC4753.m10683(interfaceC05164);
                interfaceC05164.getCurrentScreenClass(this.f2882);
                break;
            default:
                InterfaceC0516 interfaceC05165 = this.f2883.f2617;
                AbstractC4753.m10683(interfaceC05165);
                interfaceC05165.getCurrentScreenName(this.f2882);
                break;
        }
    }
}
