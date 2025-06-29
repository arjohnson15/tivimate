package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p061.C1426;

/* renamed from: com.google.android.material.datepicker.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0693 extends LinearLayoutManager {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C0687 f3317;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ int f3318;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0693(C0687 c0687, int i, int i2) {
        super(i);
        this.f3317 = c0687;
        this.f3318 = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: ʼﹶ */
    public final void mo1239(C1426 c1426, int[] iArr) {
        int i = this.f3318;
        C0687 c0687 = this.f3317;
        if (i == 0) {
            iArr[0] = c0687.f3274.getWidth();
            iArr[1] = c0687.f3274.getWidth();
        } else {
            iArr[0] = c0687.f3274.getHeight();
            iArr[1] = c0687.f3274.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p061.AbstractC1402
    /* renamed from: ᵢˎ */
    public final void mo844(RecyclerView recyclerView, int i) {
        C0708 c0708 = new C0708(recyclerView.getContext());
        c0708.f5814 = i;
        mo823(c0708);
    }
}
