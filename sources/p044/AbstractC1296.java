package p044;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.bumptech.glide.ﹳﹳ;
import org.lsposed.hiddenapibypass.library.R;
import ⁱـ.ˑי;

/* renamed from: ʽٴ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1296 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Drawable m4594(Context context, int i) {
        ColorStateList colorStateList;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i, i, i, i);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        TypedValue typedValue = ˑי.ᵎˏ(context, R.attr._2_res_0x7f040133);
        if (typedValue != null) {
            int i2 = typedValue.resourceId;
            colorStateList = i2 != 0 ? ﹳﹳ.ˑי(context, i2) : ColorStateList.valueOf(typedValue.data);
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            colorStateListValueOf = colorStateList;
        }
        return new RippleDrawable(colorStateListValueOf, null, insetDrawable);
    }
}
