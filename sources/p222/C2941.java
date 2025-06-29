package p222;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p300.AbstractC3505;
import p331.C3762;
import p364.AbstractC4134;
import p364.AbstractC4136;
import ـˈ.ˉᵎ;

/* renamed from: ˏᴵ.ᵎʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2941 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C2860 f11365;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C2860 f11366;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public Typeface f11368;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean f11369;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C2860 f11371;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C2860 f11372;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final TextView f11373;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C2860 f11374;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C2860 f11375;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C2860 f11376;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C2929 f11377;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f11367 = 0;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f11370 = -1;

    public C2941(TextView textView) {
        this.f11373 = textView;
        this.f11377 = new C2929(textView);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m7299(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AbstractC4134.m9487(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AbstractC4134.m9487(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            AbstractC4136.m9488(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            AbstractC4136.m9488(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC4136.m9488(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        AbstractC4136.m9488(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C2860 m7300(Context context, C2964 c2964, int i) {
        ColorStateList colorStateListM7224;
        synchronized (c2964) {
            colorStateListM7224 = c2964.f11437.m7224(context, i);
        }
        if (colorStateListM7224 == null) {
            return null;
        }
        C2860 c2860 = new C2860();
        c2860.f11118 = true;
        c2860.f11119 = colorStateListM7224;
        return c2860;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7301() {
        C2860 c2860 = this.f11365;
        TextView textView = this.f11373;
        if (c2860 != null || this.f11372 != null || this.f11376 != null || this.f11366 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m7307(compoundDrawables[0], this.f11365);
            m7307(compoundDrawables[1], this.f11372);
            m7307(compoundDrawables[2], this.f11376);
            m7307(compoundDrawables[3], this.f11366);
        }
        if (this.f11374 == null && this.f11375 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m7307(compoundDrawablesRelative[0], this.f11374);
        m7307(compoundDrawablesRelative[2], this.f11375);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final PorterDuff.Mode m7302() {
        C2860 c2860 = this.f11371;
        if (c2860 != null) {
            return (PorterDuff.Mode) c2860.f11121;
        }
        return null;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m7303(int[] iArr, int i) {
        C2929 c2929 = this.f11377;
        if (c2929.m7285()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c2929.f11343.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c2929.f11348 = C2929.m7282(iArrCopyOf);
                if (!c2929.m7292()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c2929.f11349 = false;
            }
            if (c2929.m7287()) {
                c2929.m7289();
            }
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m7304(ColorStateList colorStateList) {
        if (this.f11371 == null) {
            this.f11371 = new C2860();
        }
        C2860 c2860 = this.f11371;
        c2860.f11119 = colorStateList;
        c2860.f11118 = colorStateList != null;
        this.f11365 = c2860;
        this.f11372 = c2860;
        this.f11376 = c2860;
        this.f11366 = c2860;
        this.f11374 = c2860;
        this.f11375 = c2860;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m7305(PorterDuff.Mode mode) {
        if (this.f11371 == null) {
            this.f11371 = new C2860();
        }
        C2860 c2860 = this.f11371;
        c2860.f11121 = mode;
        c2860.f11120 = mode != null;
        this.f11365 = c2860;
        this.f11372 = c2860;
        this.f11376 = c2860;
        this.f11366 = c2860;
        this.f11374 = c2860;
        this.f11375 = c2860;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m7306(int i) {
        C2929 c2929 = this.f11377;
        if (c2929.m7285()) {
            if (i == 0) {
                c2929.f11347 = 0;
                c2929.f11350 = -1.0f;
                c2929.f11342 = -1.0f;
                c2929.f11346 = -1.0f;
                c2929.f11348 = new int[0];
                c2929.f11341 = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = c2929.f11343.getResources().getDisplayMetrics();
            c2929.m7286(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c2929.m7287()) {
                c2929.m7289();
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7307(Drawable drawable, C2860 c2860) {
        if (drawable == null || c2860 == null) {
            return;
        }
        C2964.m7337(drawable, c2860, this.f11373.getDrawableState());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120  */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7308(android.util.AttributeSet r29, int r30) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p222.C2941.m7308(android.util.AttributeSet, int):void");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m7309(Context context, int i) {
        String string;
        ColorStateList colorStateListM8782;
        ColorStateList colorStateListM87822;
        ColorStateList colorStateListM87823;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC3505.f13599);
        C3762 c3762 = new C3762(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f11373;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (typedArrayObtainStyledAttributes.hasValue(3) && (colorStateListM87823 = c3762.m8782(3)) != null) {
                textView.setTextColor(colorStateListM87823);
            }
            if (typedArrayObtainStyledAttributes.hasValue(5) && (colorStateListM87822 = c3762.m8782(5)) != null) {
                textView.setLinkTextColor(colorStateListM87822);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4) && (colorStateListM8782 = c3762.m8782(4)) != null) {
                textView.setHintTextColor(colorStateListM8782);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m7310(context, c3762);
        if (i2 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC2892.m7233(textView, string);
        }
        c3762.m8783();
        Typeface typeface = this.f11368;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f11367);
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m7310(Context context, C3762 c3762) {
        String string;
        int i = this.f11367;
        TypedArray typedArray = (TypedArray) c3762.f14531;
        this.f11367 = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f11370 = i3;
            if (i3 != -1) {
                this.f11367 &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f11369 = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f11368 = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f11368 = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f11368 = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f11368 = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f11370;
        int i7 = this.f11367;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM8786 = c3762.m8786(i5, this.f11367, new C2859(this, i6, i7, new WeakReference(this.f11373)));
                if (typefaceM8786 != null) {
                    if (i2 < 28 || this.f11370 == -1) {
                        this.f11368 = typefaceM8786;
                    } else {
                        this.f11368 = AbstractC2899.m7241(Typeface.create(typefaceM8786, 0), this.f11370, (this.f11367 & 2) != 0);
                    }
                }
                this.f11369 = this.f11368 == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f11368 != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f11370 == -1) {
            this.f11368 = Typeface.create(string, this.f11367);
        } else {
            this.f11368 = AbstractC2899.m7241(Typeface.create(string, 0), this.f11370, (this.f11367 & 2) != 0);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ColorStateList m7311() {
        C2860 c2860 = this.f11371;
        if (c2860 != null) {
            return (ColorStateList) c2860.f11119;
        }
        return null;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m7312(int i, int i2, int i3, int i4) {
        C2929 c2929 = this.f11377;
        if (c2929.m7285()) {
            DisplayMetrics displayMetrics = c2929.f11343.getResources().getDisplayMetrics();
            c2929.m7286(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c2929.m7287()) {
                c2929.m7289();
            }
        }
    }
}
