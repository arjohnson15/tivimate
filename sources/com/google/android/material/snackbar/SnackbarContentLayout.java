package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.ˎˑ;
import org.lsposed.hiddenapibypass.library.R;
import p219.AbstractC2840;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Button f3389;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f3390;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public TextView f3391;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ˎˑ.ﹳˎ(context, R.attr._2_res_0x7f040414, AbstractC2840.f11001);
    }

    public Button getActionView() {
        return this.f3389;
    }

    public TextView getMessageView() {
        return this.f3391;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3391 = (TextView) findViewById(R.id._2_res_0x7f0b0352);
        this.f3389 = (Button) findViewById(R.id._2_res_0x7f0b0351);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070095);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070094);
        Layout layout = this.f3391.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.f3390 <= 0 || this.f3389.getMeasuredWidth() <= this.f3390) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m2882(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m2882(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f3390 = i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m2882(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f3391.getPaddingTop() == i2 && this.f3391.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f3391;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }
}
