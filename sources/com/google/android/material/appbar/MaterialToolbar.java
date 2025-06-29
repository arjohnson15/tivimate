package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p211.AbstractC2807;
import p220.AbstractC2845;
import p239.AbstractC3098;
import p320.MenuC3643;
import p361.C4105;
import p378.AbstractC4339;
import p378.AbstractC4345;
import ʽᵔ.ʽⁱ;
import ˈⁱ.ﹳﹳ;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final ImageView.ScaleType[] f3119 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public boolean f3120;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public boolean f3121;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public Integer f3122;

    /* renamed from: ˏ, reason: contains not printable characters */
    public Boolean f3123;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public ImageView.ScaleType f3124;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC2807.m7088(context, attributeSet, R.attr._2_res_0x7f040612, R.style._2_res_0x7f140577), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM7129 = AbstractC2845.m7129(context2, attributeSet, AbstractC3098.f11974, R.attr._2_res_0x7f040612, R.style._2_res_0x7f140577, new int[0]);
        if (typedArrayM7129.hasValue(2)) {
            setNavigationIconTint(typedArrayM7129.getColor(2, -1));
        }
        this.f3120 = typedArrayM7129.getBoolean(4, false);
        this.f3121 = typedArrayM7129.getBoolean(3, false);
        int i = typedArrayM7129.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f3119;
            if (i < scaleTypeArr.length) {
                this.f3124 = scaleTypeArr[i];
            }
        }
        if (typedArrayM7129.hasValue(0)) {
            this.f3123 = Boolean.valueOf(typedArrayM7129.getBoolean(0, false));
        }
        typedArrayM7129.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : ﹳﹳ.ᵎˏ(background);
        if (colorStateListValueOf != null) {
            C4105 c4105 = new C4105();
            c4105.m9407(colorStateListValueOf);
            c4105.m9405(context2);
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            c4105.m9406(AbstractC4339.m9852(this));
            setBackground(c4105);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f3124;
    }

    public Integer getNavigationIconTint() {
        return this.f3122;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C4105) {
            ﹳﹳ.ᵢٴ(this, (C4105) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f3120 || this.f3121) {
            ArrayList arrayListM7133 = AbstractC2845.m7133(this, getTitle());
            boolean zIsEmpty = arrayListM7133.isEmpty();
            ʽⁱ r11 = AbstractC2845.f11063;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListM7133, r11);
            ArrayList arrayListM71332 = AbstractC2845.m7133(this, getSubtitle());
            TextView textView2 = arrayListM71332.isEmpty() ? null : (TextView) Collections.max(arrayListM71332, r11);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f3120 && textView != null) {
                    m2806(textView, pair);
                }
                if (this.f3121 && textView2 != null) {
                    m2806(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f3123;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f3124;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C4105) {
            ((C4105) background).m9406(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f3123;
        if (bool == null || bool.booleanValue() != z) {
            this.f3123 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f3124 != scaleType) {
            this.f3124 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f3122 != null) {
            drawable = ˆˑ.ﹳﹳ.ᵢʿ(drawable.mutate());
            drawable.setTint(this.f3122.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f3122 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f3121 != z) {
            this.f3121 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f3120 != z) {
            this.f3120 = z;
            requestLayout();
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m2806(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: ˋⁱ */
    public final void mo151(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof MenuC3643;
        if (z) {
            ((MenuC3643) menu).m8599();
        }
        super.mo151(i);
        if (z) {
            ((MenuC3643) menu).m8588();
        }
    }
}
