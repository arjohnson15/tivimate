package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.lsposed.hiddenapibypass.library.R;

/* loaded from: classes.dex */
public class ThumbsBar extends LinearLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f969;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f970;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f971;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f972;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f973;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f974;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f975;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f973 = -1;
        new SparseArray();
        this.f975 = false;
        this.f969 = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f07019d);
        this.f971 = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f07019b);
        this.f970 = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070193);
        this.f972 = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070192);
        this.f974 = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f07019c);
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int measuredWidth = (childAt.getMeasuredWidth() / 2) + (getWidth() / 2);
        childAt.layout(width, getPaddingTop(), measuredWidth, childAt.getMeasuredHeight() + getPaddingTop());
        int measuredHeight = (childAt.getMeasuredHeight() / 2) + getPaddingTop();
        for (int i5 = heroIndex - 1; i5 >= 0; i5--) {
            int i6 = width - this.f974;
            View childAt2 = getChildAt(i5);
            childAt2.layout(i6 - childAt2.getMeasuredWidth(), measuredHeight - (childAt2.getMeasuredHeight() / 2), i6, (childAt2.getMeasuredHeight() / 2) + measuredHeight);
            width = i6 - childAt2.getMeasuredWidth();
        }
        while (true) {
            heroIndex++;
            if (heroIndex >= this.f973) {
                return;
            }
            int i7 = measuredWidth + this.f974;
            View childAt3 = getChildAt(heroIndex);
            childAt3.layout(i7, measuredHeight - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i7, (childAt3.getMeasuredHeight() / 2) + measuredHeight);
            measuredWidth = i7 + childAt3.getMeasuredWidth();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.f975) {
            return;
        }
        int i3 = measuredWidth - this.f972;
        int i4 = ((i3 + r3) - 1) / (this.f969 + this.f974);
        if (i4 < 2) {
            i4 = 2;
        } else if ((i4 & 1) != 0) {
            i4++;
        }
        int i5 = i4 + 1;
        if (this.f973 != i5) {
            this.f973 = i5;
            m882();
        }
    }

    public void setNumberOfThumbs(int i) {
        this.f975 = true;
        this.f973 = i;
        m882();
    }

    public void setThumbSpace(int i) {
        this.f974 = i;
        requestLayout();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m882() {
        int i;
        int i2;
        while (getChildCount() > this.f973) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (true) {
            int childCount = getChildCount();
            int i3 = this.f973;
            i = this.f971;
            i2 = this.f969;
            if (childCount >= i3) {
                break;
            } else {
                addView(new ImageView(getContext()), new LinearLayout.LayoutParams(i2, i));
            }
        }
        int heroIndex = getHeroIndex();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i4) {
                layoutParams.width = this.f972;
                layoutParams.height = this.f970;
            } else {
                layoutParams.width = i2;
                layoutParams.height = i;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }
}
