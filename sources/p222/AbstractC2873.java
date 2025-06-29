package p222;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bumptech.glide.ﹳﹳ;
import p300.AbstractC3505;
import p421.AbstractC4862;

/* renamed from: ˏᴵ.ʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2873 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ThreadLocal f11135 = new ThreadLocal();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final int[] f11132 = {-16842910};

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final int[] f11134 = {R.attr.state_focused};

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final int[] f11138 = {R.attr.state_pressed};

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final int[] f11133 = {R.attr.state_checked};

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final int[] f11136 = new int[0];

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final int[] f11137 = new int[1];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m7185(Context context, int i) {
        ColorStateList colorStateListM7188 = m7188(context, i);
        if (colorStateListM7188 != null && colorStateListM7188.isStateful()) {
            return colorStateListM7188.getColorForState(f11132, colorStateListM7188.getDefaultColor());
        }
        ThreadLocal threadLocal = f11135;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return AbstractC4862.m10942(m7186(context, i), Math.round(Color.alpha(r4) * f));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m7186(Context context, int i) {
        int[] iArr = f11137;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m7187(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC3505.f13577);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                String str = "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).";
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static ColorStateList m7188(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f11137;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = ﹳﹳ.ˑי(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
