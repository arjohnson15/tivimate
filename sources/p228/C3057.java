package p228;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.media.session.AbstractC0001;
import android.text.TextPaint;
import android.util.TypedValue;
import android.util.Xml;
import p095.AbstractC1761;
import p239.AbstractC3098;
import p371.AbstractC4208;
import ﹶⁱ.ـﹶ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ˑʿ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3057 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f11770;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f11771;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final float f11772;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public float f11773;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int f11774;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public ColorStateList f11775;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final float f11777;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f11778;

    /* renamed from: ˑי, reason: contains not printable characters */
    public Typeface f11779;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ColorStateList f11780;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final float f11781;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final float f11782;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f11784;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean f11785;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public boolean f11783 = false;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public boolean f11776 = false;

    public C3057(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC3098.f11968);
        this.f11773 = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f11775 = ـﹶ.ﾞˊ(context, typedArrayObtainStyledAttributes, 3);
        ـﹶ.ﾞˊ(context, typedArrayObtainStyledAttributes, 4);
        ـﹶ.ﾞˊ(context, typedArrayObtainStyledAttributes, 5);
        this.f11784 = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f11771 = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f11774 = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f11770 = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f11780 = ـﹶ.ﾞˊ(context, typedArrayObtainStyledAttributes, 6);
        this.f11781 = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f11782 = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f11777 = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        int i3 = Build.VERSION.SDK_INT;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC3098.f11975);
        this.f11785 = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f11772 = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        if (i3 >= 26) {
            this.f11778 = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7544(Context context, ᵢʿ r10) {
        if (!m7546(context)) {
            m7547();
        }
        int i = this.f11774;
        if (i == 0) {
            this.f11783 = true;
        }
        if (this.f11783) {
            r10.ﾞˊ(this.f11779, true);
            return;
        }
        try {
            C3054 c3054 = new C3054(this, r10);
            ThreadLocal threadLocal = AbstractC4208.f16226;
            if (context.isRestricted()) {
                c3054.m9654(-4);
            } else {
                AbstractC4208.m9655(context, i, new TypedValue(), 0, c3054, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f11783 = true;
            r10.ˋˊ(1);
        } catch (Exception e) {
            String str = "Error loading font " + this.f11770;
            this.f11783 = true;
            r10.ˋˊ(-3);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m7545(Context context, TextPaint textPaint, ᵢʿ r4) {
        Typeface typeface;
        if (m7546(context) && this.f11783 && (typeface = this.f11779) != null) {
            m7548(context, textPaint, typeface);
            return;
        }
        m7547();
        m7548(context, textPaint, this.f11779);
        m7544(context, new C3055(this, context, textPaint, r4));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m7546(Context context) {
        String string;
        Typeface typefaceCreate;
        if (this.f11783) {
            return true;
        }
        int i = this.f11774;
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = AbstractC4208.f16226;
        Typeface typefaceCreate2 = null;
        Typeface typefaceM9655 = context.isRestricted() ? null : AbstractC4208.m9655(context, i, new TypedValue(), 0, null, false, true);
        if (typefaceM9655 != null) {
            this.f11779 = typefaceM9655;
            this.f11783 = true;
            return true;
        }
        if (!this.f11776) {
            this.f11776 = true;
            Resources resources = context.getResources();
            int i2 = this.f11774;
            if (i2 == 0 || !resources.getResourceTypeName(i2).equals("font")) {
                string = null;
                if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                    typefaceCreate2 = Typeface.create(typefaceCreate, this.f11784);
                }
            } else {
                try {
                    XmlResourceParser xml = resources.getXml(i2);
                    while (xml.getEventType() != 1) {
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), AbstractC1761.f6816);
                            string = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                    }
                } catch (Throwable unused) {
                }
                string = null;
                if (string != null) {
                    typefaceCreate2 = Typeface.create(typefaceCreate, this.f11784);
                }
            }
        }
        if (typefaceCreate2 == null) {
            return false;
        }
        this.f11779 = typefaceCreate2;
        this.f11783 = true;
        return true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7547() {
        String str;
        Typeface typeface = this.f11779;
        int i = this.f11784;
        if (typeface == null && (str = this.f11770) != null) {
            this.f11779 = Typeface.create(str, i);
        }
        if (this.f11779 == null) {
            int i2 = this.f11771;
            if (i2 == 1) {
                this.f11779 = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f11779 = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f11779 = Typeface.DEFAULT;
            } else {
                this.f11779 = Typeface.MONOSPACE;
            }
            this.f11779 = Typeface.create(this.f11779, i);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m7548(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM27 = AbstractC0001.m27(context.getResources().getConfiguration(), typeface);
        if (typefaceM27 != null) {
            typeface = typefaceM27;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f11784;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f11773);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f11778);
        }
        if (this.f11785) {
            textPaint.setLetterSpacing(this.f11772);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m7549(Context context, TextPaint textPaint, ᵢʿ r5) {
        m7545(context, textPaint, r5);
        ColorStateList colorStateList = this.f11775;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f11780;
        textPaint.setShadowLayer(this.f11777, this.f11781, this.f11782, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }
}
