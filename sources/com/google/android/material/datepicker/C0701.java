package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.material.datepicker.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0701 implements AdapterView.OnItemClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0684 f3333;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendarGridView f3334;

    public C0701(C0684 c0684, MaterialCalendarGridView materialCalendarGridView) {
        this.f3333 = c0684;
        this.f3334 = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f3334;
        C0690 c0690M2853 = materialCalendarGridView.m2853();
        if (i < c0690M2853.m2862() || i > c0690M2853.m2861()) {
            return;
        }
        if (materialCalendarGridView.m2853().getItem(i).longValue() >= ((C0687) this.f3333.f3265.ˆʿ).f3275.f3256.f3345) {
            throw null;
        }
    }
}
