package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p220.AbstractC2844;

/* renamed from: com.google.android.material.timepicker.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0715 extends AbstractC2844 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ ChipTextInputComboView f3513;

    public C0715(ChipTextInputComboView chipTextInputComboView) {
        this.f3513 = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f3513;
        if (zIsEmpty) {
            chipTextInputComboView.f3473.setText(ChipTextInputComboView.m2912(chipTextInputComboView, "00"));
            return;
        }
        String strM2912 = ChipTextInputComboView.m2912(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f3473;
        if (TextUtils.isEmpty(strM2912)) {
            strM2912 = ChipTextInputComboView.m2912(chipTextInputComboView, "00");
        }
        chip.setText(strM2912);
    }
}
