package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import org.lsposed.hiddenapibypass.library.R;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static final /* synthetic */ int f3503 = 0;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final Chip f3504;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC0710 viewOnClickListenerC0710 = new ViewOnClickListenerC0710(this);
        LayoutInflater.from(context).inflate(R.layout._2_res_0x7f0e00eb, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id._2_res_0x7f0b026d);
        materialButtonToggleGroup.f3223.add(new C0719(this));
        Chip chip = (Chip) findViewById(R.id._2_res_0x7f0b0272);
        Chip chip2 = (Chip) findViewById(R.id._2_res_0x7f0b026f);
        this.f3504 = chip2;
        ViewOnTouchListenerC0711 viewOnTouchListenerC0711 = new ViewOnTouchListenerC0711(new GestureDetector(getContext(), new C0712(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0711);
        chip2.setOnTouchListener(viewOnTouchListenerC0711);
        chip.setTag(R.id._2_res_0x7f0b033d, 12);
        chip2.setTag(R.id._2_res_0x7f0b033d, 10);
        chip.setOnClickListener(viewOnClickListenerC0710);
        chip2.setOnClickListener(viewOnClickListenerC0710);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f3504.sendAccessibilityEvent(8);
        }
    }
}
