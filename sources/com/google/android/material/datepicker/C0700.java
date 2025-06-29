package com.google.android.material.datepicker;

import android.view.View;
import p378.C4369;
import p378.InterfaceC4359;

/* renamed from: com.google.android.material.datepicker.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0700 implements InterfaceC4359 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f3330;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f3331;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final View f3332;

    public C0700(View view) {
        this.f3332 = view;
    }

    public C0700(View view, int i, int i2) {
        this.f3330 = i;
        this.f3332 = view;
        this.f3331 = i2;
    }

    @Override // p378.InterfaceC4359
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C4369 mo2871(View view, C4369 c4369) {
        int i = c4369.f16871.mo9839(7).f18364;
        View view2 = this.f3332;
        int i2 = this.f3330;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f3331 + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return c4369;
    }
}
