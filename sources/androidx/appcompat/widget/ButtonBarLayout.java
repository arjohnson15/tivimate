package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p300.AbstractC3505;
import p378.AbstractC4345;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f149;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f150;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f151;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150 = -1;
        int[] iArr = AbstractC3505.f13582;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC4345.m9881(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f151 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f151);
        }
    }

    private void setStacked(boolean z) {
        if (this.f149 != z) {
            if (!z || this.f151) {
                this.f149 = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id._2_res_0x7f0b0357);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f151) {
            if (size > this.f150 && this.f149) {
                setStacked(false);
            }
            this.f150 = size;
        }
        if (this.f149 || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.f151 && !this.f149 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            i3 = -1;
            if (i4 >= childCount) {
                i4 = -1;
                break;
            } else if (getChildAt(i4).getVisibility() == 0) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            View childAt = getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f149) {
                int i5 = i4 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i5 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i5).getVisibility() == 0) {
                        i3 = i5;
                        break;
                    }
                    i5++;
                }
                paddingBottom = i3 >= 0 ? getChildAt(i3).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f151 != z) {
            this.f151 = z;
            if (!z && this.f149) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
