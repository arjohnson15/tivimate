package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.lsposed.hiddenapibypass.library.R;
import p239.AbstractC3098;
import p361.C4086;
import p361.C4087;
import p361.C4105;

/* renamed from: com.google.android.material.timepicker.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0713 extends ConstraintLayout {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public int f3509;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final C4105 f3510;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final RunnableC0717 f3511;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.ᐧʻ] */
    public AbstractC0713(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._2_res_0x7f0403d0);
        LayoutInflater.from(context).inflate(R.layout._2_res_0x7f0e00e7, this);
        C4105 c4105 = new C4105();
        this.f3510 = c4105;
        C4086 c4086 = new C4086(0.5f);
        C4087 c4087M9381 = c4105.f15848.f15817.m9381();
        c4087M9381.f15758 = c4086;
        c4087M9381.f15765 = c4086;
        c4087M9381.f15766 = c4086;
        c4087M9381.f15762 = c4086;
        c4105.setShapeAppearanceModel(c4087M9381.m9375());
        this.f3510.m9407(ColorStateList.valueOf(-1));
        setBackground(this.f3510);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3098.f11976, R.attr._2_res_0x7f0403d0, 0);
        this.f3509 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3511 = new Runnable() { // from class: com.google.android.material.timepicker.ᐧʻ
            @Override // java.lang.Runnable
            public final void run() {
                this.f3514.mo2913();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0717 runnableC0717 = this.f3511;
            handler.removeCallbacks(runnableC0717);
            handler.post(runnableC0717);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo2913();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0717 runnableC0717 = this.f3511;
            handler.removeCallbacks(runnableC0717);
            handler.post(runnableC0717);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f3510.m9407(ColorStateList.valueOf(i));
    }

    /* renamed from: ˋⁱ */
    public abstract void mo2913();
}
