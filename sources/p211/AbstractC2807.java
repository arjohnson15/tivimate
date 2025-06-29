package p211;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p182.C2529;

/* renamed from: ˏʽ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2807 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int[] f10948 = {R.attr.theme, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0405dd};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final int[] f10947 = {org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0403de};

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Context m7088(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10947, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C2529) && ((C2529) context).f10061 == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C2529 c2529 = new C2529(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f10948);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c2529.getTheme().applyStyle(resourceId2, true);
        }
        return c2529;
    }
}
