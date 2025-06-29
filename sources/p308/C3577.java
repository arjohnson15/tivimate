package p308;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import org.lsposed.hiddenapibypass.library.R;
import p222.C2900;
import p239.AbstractC3098;
import ⁱـ.ˑי;

/* renamed from: ᐧˎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3577 extends C2900 {
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m8471(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            int i2 = iArr[i];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i2, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // p222.C2900, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (ˑי.ﹳˎ(context, R.attr._2_res_0x7f0405b4, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, AbstractC3098.f11975);
            int iM8471 = m8471(getContext(), typedArrayObtainStyledAttributes, 2, 4);
            typedArrayObtainStyledAttributes.recycle();
            if (iM8471 >= 0) {
                setLineHeight(iM8471);
            }
        }
    }
}
