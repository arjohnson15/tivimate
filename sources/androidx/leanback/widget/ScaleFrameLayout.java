package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ScaleFrameLayout extends FrameLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public float f901;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public float f902;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public float f903;

    public ScaleFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f903 = 1.0f;
        this.f901 = 1.0f;
        this.f902 = 1.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setScaleX(this.f902);
        view.setScaleY(this.f902);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        boolean zAddViewInLayout = super.addViewInLayout(view, i, layoutParams, z);
        if (zAddViewInLayout) {
            view.setScaleX(this.f902);
            view.setScaleY(this.f902);
        }
        return zAddViewInLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ScaleFrameLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f = this.f903;
        if (f == 1.0f && this.f901 == 1.0f) {
            super.onMeasure(i, i2);
            return;
        }
        if (f != 1.0f) {
            i = View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i) / f) + 0.5f), View.MeasureSpec.getMode(i));
        }
        float f2 = this.f901;
        if (f2 != 1.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i2) / f2) + 0.5f), View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
        setMeasuredDimension((int) ((getMeasuredWidth() * this.f903) + 0.5f), (int) ((getMeasuredHeight() * this.f901) + 0.5f));
    }

    public void setChildScale(float f) {
        if (this.f902 != f) {
            this.f902 = f;
            for (int i = 0; i < getChildCount(); i++) {
                getChildAt(i).setScaleX(f);
                getChildAt(i).setScaleY(f);
            }
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        throw new UnsupportedOperationException();
    }

    public void setLayoutScaleX(float f) {
        if (f != this.f903) {
            this.f903 = f;
            requestLayout();
        }
    }

    public void setLayoutScaleY(float f) {
        if (f != this.f901) {
            this.f901 = f;
            requestLayout();
        }
    }
}
