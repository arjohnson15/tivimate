package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import p378.AbstractC4345;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean f3253;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC0696.m2869(null);
        if (C0692.m2866(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b00b9);
            setNextFocusRightId(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b00d1);
        }
        this.f3253 = C0692.m2866(getContext(), org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040436);
        AbstractC4345.m9884(this, new C0699(2));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C0690) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C0690) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C0690) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0690 c0690 = (C0690) super.getAdapter();
        c0690.getClass();
        int iMax = Math.max(c0690.m2862(), getFirstVisiblePosition());
        int iMin = Math.min(c0690.m2861(), getLastVisiblePosition());
        c0690.getItem(iMax);
        c0690.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((C0690) super.getAdapter()).m2861());
        } else if (i == 130) {
            setSelection(((C0690) super.getAdapter()).m2862());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((C0690) super.getAdapter()).m2862() && selectedItemPosition <= ((C0690) super.getAdapter()).m2861())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((C0690) super.getAdapter()).m2862());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f3253) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C0690)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C0690.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((C0690) super.getAdapter()).m2862()) {
            super.setSelection(((C0690) super.getAdapter()).m2862());
        } else {
            super.setSelection(i);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0690 m2853() {
        return (C0690) super.getAdapter();
    }
}
