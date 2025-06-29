package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import p092.C1754;
import p189.C2641;
import p211.AbstractC2807;
import p220.AbstractC2845;
import p222.C2900;
import p222.C2909;
import p222.C2914;
import p222.C2936;
import p222.C2945;
import p225.C3006;
import p239.AbstractC3098;
import p308.C3577;
import p357.C4056;
import ⁱـ.ˑי;
import ﹶⁱ.ـﹶ;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C3006 {
    @Override // p225.C3006
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2914 mo2907(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p225.C3006
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C2900 mo2908(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        C3577 c3577 = new C3577(AbstractC2807.m7088(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = c3577.getContext();
        if (ˑי.ﹳˎ(context2, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0405b4, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC3098.f11962;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int iM8471 = C3577.m8471(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM8471 == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC3098.f11975);
                    int iM84712 = C3577.m8471(c3577.getContext(), typedArrayObtainStyledAttributes3, 2, 4);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM84712 >= 0) {
                        c3577.setLineHeight(iM84712);
                    }
                }
            }
        }
        return c3577;
    }

    @Override // p225.C3006
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2945 mo2909(Context context, AttributeSet attributeSet) {
        return new C2641(context, attributeSet);
    }

    @Override // p225.C3006
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2909 mo2910(Context context, AttributeSet attributeSet) {
        return new C4056(context, attributeSet);
    }

    @Override // p225.C3006
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2936 mo2911(Context context, AttributeSet attributeSet) {
        C1754 c1754 = new C1754(AbstractC2807.m7088(context, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0404b5, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f14052c), attributeSet);
        Context context2 = c1754.getContext();
        TypedArray typedArrayM7129 = AbstractC2845.m7129(context2, attributeSet, AbstractC3098.f11964, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0404b5, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f14052c, new int[0]);
        if (typedArrayM7129.hasValue(0)) {
            c1754.setButtonTintList(ـﹶ.ﾞˊ(context2, typedArrayM7129, 0));
        }
        c1754.f6789 = typedArrayM7129.getBoolean(1, false);
        typedArrayM7129.recycle();
        return c1754;
    }
}
