package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: com.google.android.material.timepicker.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0711 implements View.OnTouchListener {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ GestureDetector f3507;

    public ViewOnTouchListenerC0711(GestureDetector gestureDetector) {
        this.f3507 = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f3507.onTouchEvent(motionEvent);
        }
        return false;
    }
}
