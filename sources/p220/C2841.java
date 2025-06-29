package p220;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.media.session.AbstractC0001;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import p219.AbstractC2840;
import p228.C3056;
import p243.AbstractC3112;
import p273.C3343;

/* renamed from: ˏٴ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2841 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public float f11005;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public float f11007;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final TextPaint f11008;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final RectF f11009;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public float f11010;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public Typeface f11011;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f11012;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public float f11013;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public CharSequence f11014;

    /* renamed from: ˉי, reason: contains not printable characters */
    public ColorStateList f11015;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public float f11016;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public float f11017;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public float f11018;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public float f11019;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public Typeface f11020;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public float f11021;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public StaticLayout f11022;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public Typeface f11025;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public float f11026;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public ColorStateList f11027;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public float f11028;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Rect f11030;

    /* renamed from: ˑי, reason: contains not printable characters */
    public float f11031;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public LinearInterpolator f11032;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final TextPaint f11033;

    /* renamed from: יʻ, reason: contains not printable characters */
    public C3056 f11034;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f11036;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final TextInputLayout f11037;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public float f11040;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public CharSequence f11041;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public int[] f11042;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public float f11043;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public float f11044;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public Typeface f11045;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public float f11046;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public float f11047;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public ColorStateList f11048;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public float f11049;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public float f11050;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public LinearInterpolator f11051;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public CharSequence f11052;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public Typeface f11053;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Rect f11055;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public float f11056;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public Typeface f11058;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public Typeface f11059;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public float f11060;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f11061;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f11038 = 16;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f11039 = 16;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public float f11029 = 15.0f;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public float f11057 = 15.0f;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final TextUtils.TruncateAt f11054 = TextUtils.TruncateAt.END;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean f11024 = true;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final int f11023 = 1;

    /* renamed from: יˋ, reason: contains not printable characters */
    public final float f11035 = 1.0f;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final int f11006 = C2847.f11071;

    public C2841(TextInputLayout textInputLayout) {
        this.f11037 = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f11008 = textPaint;
        this.f11033 = new TextPaint(textPaint);
        this.f11055 = new Rect();
        this.f11030 = new Rect();
        this.f11009 = new RectF();
        m7123(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m7115(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static float m7116(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC2840.m7114(f, f2, f3);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7117() throws NoSuchMethodException, SecurityException {
        float f = this.f11007;
        float f2 = this.f11030.left;
        Rect rect = this.f11055;
        float fM7116 = m7116(f2, rect.left, f, this.f11032);
        RectF rectF = this.f11009;
        rectF.left = fM7116;
        rectF.top = m7116(this.f11017, this.f11021, f, this.f11032);
        rectF.right = m7116(r1.right, rect.right, f, this.f11032);
        rectF.bottom = m7116(r1.bottom, rect.bottom, f, this.f11032);
        this.f11031 = m7116(this.f11043, this.f11028, f, this.f11032);
        this.f11046 = m7116(this.f11017, this.f11021, f, this.f11032);
        m7126(f, false);
        TextInputLayout textInputLayout = this.f11037;
        textInputLayout.postInvalidateOnAnimation();
        C3343 c3343 = AbstractC2840.f11001;
        this.f11010 = 1.0f - m7116(0.0f, 1.0f, 1.0f - f, c3343);
        textInputLayout.postInvalidateOnAnimation();
        this.f11016 = m7116(1.0f, 0.0f, f, c3343);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f11027;
        ColorStateList colorStateList2 = this.f11015;
        TextPaint textPaint = this.f11008;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m7115(f, m7125(colorStateList2), m7125(this.f11027)));
        } else {
            textPaint.setColor(m7125(colorStateList));
        }
        float f3 = this.f11047;
        float f4 = this.f11060;
        if (f3 != f4) {
            textPaint.setLetterSpacing(m7116(f4, f3, f, c3343));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.f11050 = AbstractC2840.m7114(0.0f, this.f11026, f);
        this.f11056 = AbstractC2840.m7114(0.0f, this.f11049, f);
        this.f11019 = AbstractC2840.m7114(0.0f, this.f11005, f);
        int iM7115 = m7115(f, 0, m7125(this.f11048));
        this.f11036 = iM7115;
        textPaint.setShadowLayer(this.f11050, this.f11056, this.f11019, iM7115);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float m7118() {
        TextPaint textPaint = this.f11033;
        textPaint.setTextSize(this.f11057);
        textPaint.setTypeface(this.f11025);
        textPaint.setLetterSpacing(this.f11047);
        return -textPaint.ascent();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m7119(ColorStateList colorStateList) {
        if (this.f11027 == colorStateList && this.f11015 == colorStateList) {
            return;
        }
        this.f11027 = colorStateList;
        this.f11015 = colorStateList;
        m7127(false);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m7120(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f11007) {
            this.f11007 = f;
            m7117();
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m7121(Typeface typeface) {
        boolean z;
        boolean zM7122 = m7122(typeface);
        if (this.f11059 != typeface) {
            this.f11059 = typeface;
            Typeface typefaceM27 = AbstractC0001.m27(this.f11037.getContext().getResources().getConfiguration(), typeface);
            this.f11020 = typefaceM27;
            if (typefaceM27 == null) {
                typefaceM27 = this.f11059;
            }
            this.f11011 = typefaceM27;
            z = true;
        } else {
            z = false;
        }
        if (zM7122 || z) {
            m7127(false);
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m7122(Typeface typeface) {
        C3056 c3056 = this.f11034;
        if (c3056 != null) {
            c3056.f11767 = true;
        }
        if (this.f11053 == typeface) {
            return false;
        }
        this.f11053 = typeface;
        Typeface typefaceM27 = AbstractC0001.m27(this.f11037.getContext().getResources().getConfiguration(), typeface);
        this.f11045 = typefaceM27;
        if (typefaceM27 == null) {
            typefaceM27 = this.f11053;
        }
        this.f11025 = typefaceM27;
        return true;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m7123(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f11053;
            if (typeface != null) {
                this.f11045 = AbstractC0001.m27(configuration, typeface);
            }
            Typeface typeface2 = this.f11059;
            if (typeface2 != null) {
                this.f11020 = AbstractC0001.m27(configuration, typeface2);
            }
            Typeface typeface3 = this.f11045;
            if (typeface3 == null) {
                typeface3 = this.f11053;
            }
            this.f11025 = typeface3;
            Typeface typeface4 = this.f11020;
            if (typeface4 == null) {
                typeface4 = this.f11059;
            }
            this.f11011 = typeface4;
            m7127(true);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m7124(CharSequence charSequence) {
        boolean z = this.f11037.getLayoutDirection() == 1;
        if (this.f11024) {
            return (z ? AbstractC3112.f12005 : AbstractC3112.f12003).m6529(charSequence, charSequence.length());
        }
        return z;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int m7125(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f11042;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m7126(float f, boolean z) throws NoSuchMethodException, SecurityException {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        StaticLayout staticLayoutM7135;
        Layout.Alignment alignment;
        if (this.f11014 == null) {
            return;
        }
        float fWidth = this.f11055.width();
        float fWidth2 = this.f11030.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f11057;
            f3 = this.f11047;
            this.f11040 = 1.0f;
            typeface = this.f11025;
        } else {
            float f4 = this.f11029;
            float f5 = this.f11060;
            Typeface typeface2 = this.f11011;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f11040 = 1.0f;
            } else {
                this.f11040 = m7116(this.f11029, this.f11057, f, this.f11051) / this.f11029;
            }
            float f6 = this.f11057 / this.f11029;
            fWidth = (z || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f11008;
        if (fWidth > 0.0f) {
            boolean z3 = this.f11013 != f2;
            boolean z4 = this.f11018 != f3;
            boolean z5 = this.f11058 != typeface;
            StaticLayout staticLayout = this.f11022;
            z2 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f11061;
            this.f11013 = f2;
            this.f11018 = f3;
            this.f11058 = typeface;
            this.f11061 = false;
            textPaint.setLinearText(this.f11040 != 1.0f);
        } else {
            z2 = false;
        }
        if (this.f11041 == null || z2) {
            textPaint.setTextSize(this.f11013);
            textPaint.setTypeface(this.f11058);
            textPaint.setLetterSpacing(this.f11018);
            boolean zM7124 = m7124(this.f11014);
            this.f11012 = zM7124;
            int i = this.f11023;
            if (i <= 1 || zM7124) {
                i = 1;
            }
            try {
                if (i == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f11038, zM7124 ? 1 : 0) & 7;
                    alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f11012 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f11012 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
                }
                C2847 c2847 = new C2847(this.f11014, textPaint, (int) fWidth);
                c2847.f11078 = this.f11054;
                c2847.f11077 = zM7124;
                c2847.f11076 = alignment;
                c2847.f11085 = false;
                c2847.f11082 = i;
                c2847.f11083 = this.f11035;
                c2847.f11079 = this.f11006;
                staticLayoutM7135 = c2847.m7135();
            } catch (C2851 e) {
                e.getCause().getMessage();
                staticLayoutM7135 = null;
            }
            staticLayoutM7135.getClass();
            this.f11022 = staticLayoutM7135;
            this.f11041 = staticLayoutM7135.getText();
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m7127(boolean z) {
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f11037;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m7126(1.0f, z);
        CharSequence charSequence = this.f11041;
        TextPaint textPaint = this.f11008;
        if (charSequence != null && (staticLayout = this.f11022) != null) {
            this.f11052 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f11054);
        }
        CharSequence charSequence2 = this.f11052;
        float fMeasureText = 0.0f;
        if (charSequence2 != null) {
            this.f11044 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f11044 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f11039, this.f11012 ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f11055;
        if (i == 48) {
            this.f11021 = rect.top;
        } else if (i != 80) {
            this.f11021 = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f11021 = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f11028 = rect.centerX() - (this.f11044 / 2.0f);
        } else if (i2 != 5) {
            this.f11028 = rect.left;
        } else {
            this.f11028 = rect.right - this.f11044;
        }
        m7126(0.0f, z);
        float height = this.f11022 != null ? r14.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f11022;
        if (staticLayout2 == null || this.f11023 <= 1) {
            CharSequence charSequence3 = this.f11041;
            if (charSequence3 != null) {
                fMeasureText = textPaint.measureText(charSequence3, 0, charSequence3.length());
            }
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f11022;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f11038, this.f11012 ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f11030;
        if (i3 == 48) {
            this.f11017 = rect2.top;
        } else if (i3 != 80) {
            this.f11017 = rect2.centerY() - (height / 2.0f);
        } else {
            this.f11017 = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f11043 = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f11043 = rect2.left;
        } else {
            this.f11043 = rect2.right - fMeasureText;
        }
        m7126(this.f11007, false);
        textInputLayout.postInvalidateOnAnimation();
        m7117();
    }
}
