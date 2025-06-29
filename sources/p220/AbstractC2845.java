package p220;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import org.lsposed.hiddenapibypass.library.R;
import p239.AbstractC3098;
import ʽᵔ.ʽⁱ;
import ˆʽ.ᵎˏ;

/* renamed from: ˏٴ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2845 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int[] f11064 = {R.attr._2_res_0x7f04015a};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final int[] f11062 = {R.attr._2_res_0x7f040161};

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final ʽⁱ f11063 = new ʽⁱ(11);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m7128(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3098.f11972, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static TypedArray m7129(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m7131(context, attributeSet, i, i2);
        m7128(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m7130(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(ᵎˏ.ˑי("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m7131(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3098.f11972, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr._2_res_0x7f040318, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m7130(context, f11062, "Theme.MaterialComponents");
            }
        }
        m7130(context, f11064, "Theme.AppCompat");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static PorterDuff.Mode m7132(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static ArrayList m7133(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
