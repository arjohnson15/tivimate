package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import org.lsposed.hiddenapibypass.library.R;
import p239.AbstractC3098;

/* renamed from: com.google.android.material.datepicker.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0694 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ﹳᴵ.ˉי f3319;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ﹳᴵ.ˉי f3320;

    public C0694(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ⁱـ.ˑי.ʿˏ(R.attr._2_res_0x7f0403c8, context, C0687.class.getCanonicalName()).data, AbstractC3098.f11959);
        ﹳᴵ.ˉי.ˈٴ(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ﹳᴵ.ˉי.ˈٴ(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        ﹳᴵ.ˉי.ˈٴ(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        ﹳᴵ.ˉי.ˈٴ(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateList = ﹶⁱ.ـﹶ.ﾞˊ(context, typedArrayObtainStyledAttributes, 7);
        this.f3320 = ﹳᴵ.ˉי.ˈٴ(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        ﹳᴵ.ˉי.ˈٴ(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f3319 = ﹳᴵ.ˉי.ˈٴ(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateList.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
