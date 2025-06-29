package com.google.android.gms.internal.measurement;

import android.app.Activity;
import p113.BinderC1816;
import p417.AbstractC4753;

/* renamed from: com.google.android.gms.internal.measurement.ᵎʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0501 extends AbstractRunnableC0408 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f2834 = 1;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ C0367 f2835;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ Object f2836;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ String f2837;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ String f2838;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0501(C0367 c0367, Activity activity, String str, String str2) {
        super(c0367, true);
        this.f2836 = activity;
        this.f2837 = str;
        this.f2838 = str2;
        this.f2835 = c0367;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0501(C0367 c0367, String str, String str2, BinderC0519 binderC0519) {
        super(c0367, true);
        this.f2837 = str;
        this.f2838 = str2;
        this.f2836 = binderC0519;
        this.f2835 = c0367;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0408
    /* renamed from: ʽᐧ */
    public void mo2143() {
        switch (this.f2834) {
            case 0:
                ((BinderC0519) this.f2836).mo2130(null);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0408
    /* renamed from: ـﹶ */
    public final void mo1628() {
        switch (this.f2834) {
            case 0:
                InterfaceC0516 interfaceC0516 = this.f2835.f2617;
                AbstractC4753.m10683(interfaceC0516);
                interfaceC0516.getConditionalUserProperties(this.f2837, this.f2838, (BinderC0519) this.f2836);
                break;
            default:
                InterfaceC0516 interfaceC05162 = this.f2835.f2617;
                AbstractC4753.m10683(interfaceC05162);
                interfaceC05162.setCurrentScreen(new BinderC1816((Activity) this.f2836), this.f2837, this.f2838, this.f2699);
                break;
        }
    }
}
