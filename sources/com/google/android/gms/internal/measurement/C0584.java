package com.google.android.gms.internal.measurement;

import p417.AbstractC4753;

/* renamed from: com.google.android.gms.internal.measurement.ﾞﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0584 extends AbstractRunnableC0408 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ String f2946;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ BinderC0519 f2947;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ C0367 f2948;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ String f2949;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2950;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0584(C0367 c0367, String str, String str2, boolean z, BinderC0519 binderC0519) {
        super(c0367, true);
        this.f2946 = str;
        this.f2949 = str2;
        this.f2950 = z;
        this.f2947 = binderC0519;
        this.f2948 = c0367;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0408
    /* renamed from: ʽᐧ */
    public final void mo2143() {
        this.f2947.mo2130(null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0408
    /* renamed from: ـﹶ */
    public final void mo1628() {
        InterfaceC0516 interfaceC0516 = this.f2948.f2617;
        AbstractC4753.m10683(interfaceC0516);
        interfaceC0516.getUserProperties(this.f2946, this.f2949, this.f2950, this.f2947);
    }
}
