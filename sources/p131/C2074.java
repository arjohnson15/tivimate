package p131;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.internal.play_billing.ˎˑ;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p200.C2741;
import p371.AbstractC4205;
import p371.AbstractC4212;
import ˆˑ.ﹳﹳ;

/* renamed from: ˉʻ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2074 extends AbstractC2067 {

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final PorterDuff.Mode f7877 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C2066 f7878;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f7879;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final Matrix f7880;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public PorterDuffColorFilter f7881;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final Rect f7882;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ColorFilter f7883;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f7884;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final float[] f7885;

    public C2074() {
        this.f7884 = true;
        this.f7885 = new float[9];
        this.f7880 = new Matrix();
        this.f7882 = new Rect();
        C2066 c2066 = new C2066();
        c2066.f7838 = null;
        c2066.f7842 = f7877;
        c2066.f7832 = new C2073();
        this.f7878 = c2066;
    }

    public C2074(C2066 c2066) {
        this.f7884 = true;
        this.f7885 = new float[9];
        this.f7880 = new Matrix();
        this.f7882 = new Rect();
        this.f7878 = c2066;
        this.f7881 = m5735(c2066.f7838, c2066.f7842);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f7844;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f7882;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f7883;
        if (colorFilter == null) {
            colorFilter = this.f7881;
        }
        Matrix matrix = this.f7880;
        canvas.getMatrix(matrix);
        float[] fArr = this.f7885;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && ﹳﹳ.ᴵʿ(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C2066 c2066 = this.f7878;
        Bitmap bitmap = c2066.f7840;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c2066.f7840.getHeight()) {
            c2066.f7840 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c2066.f7836 = true;
        }
        if (this.f7884) {
            C2066 c20662 = this.f7878;
            if (c20662.f7836 || c20662.f7841 != c20662.f7838 || c20662.f7837 != c20662.f7842 || c20662.f7834 != c20662.f7833 || c20662.f7843 != c20662.f7832.getRootAlpha()) {
                C2066 c20663 = this.f7878;
                c20663.f7840.eraseColor(0);
                Canvas canvas2 = new Canvas(c20663.f7840);
                C2073 c2073 = c20663.f7832;
                c2073.m5734(c2073.f7873, C2073.f7861, canvas2, iMin, iMin2);
                C2066 c20664 = this.f7878;
                c20664.f7841 = c20664.f7838;
                c20664.f7837 = c20664.f7842;
                c20664.f7843 = c20664.f7832.getRootAlpha();
                c20664.f7834 = c20664.f7833;
                c20664.f7836 = false;
            }
        } else {
            C2066 c20665 = this.f7878;
            c20665.f7840.eraseColor(0);
            Canvas canvas3 = new Canvas(c20665.f7840);
            C2073 c20732 = c20665.f7832;
            c20732.m5734(c20732.f7873, C2073.f7861, canvas3, iMin, iMin2);
        }
        C2066 c20666 = this.f7878;
        if (c20666.f7832.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c20666.f7835 == null) {
                Paint paint2 = new Paint();
                c20666.f7835 = paint2;
                paint2.setFilterBitmap(true);
            }
            c20666.f7835.setAlpha(c20666.f7832.getRootAlpha());
            c20666.f7835.setColorFilter(colorFilter);
            paint = c20666.f7835;
        }
        canvas.drawBitmap(c20666.f7840, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.getAlpha() : this.f7878.f7832.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f7878.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.getColorFilter() : this.f7883;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f7844 != null && Build.VERSION.SDK_INT >= 24) {
            return new C2069(this.f7844.getConstantState());
        }
        this.f7878.f7839 = getChangingConfigurations();
        return this.f7878;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f7878.f7832.f7876;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f7878.f7832.f7869;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C2073 c2073;
        int i;
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C2066 c2066 = this.f7878;
        c2066.f7832 = new C2073();
        TypedArray typedArrayM9648 = AbstractC4205.m9648(resources, theme, attributeSet, AbstractC2070.f7854);
        C2066 c20662 = this.f7878;
        C2073 c20732 = c20662.f7832;
        int i2 = !AbstractC4205.m9643(xmlPullParser, "tintMode") ? -1 : typedArrayM9648.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = 3;
        if (i2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i2 != 5) {
            if (i2 != 9) {
                switch (i2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c20662.f7842 = mode;
        ColorStateList colorStateListM9660 = null;
        if (AbstractC4205.m9643(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayM9648.getValue(1, typedValue);
            int i4 = typedValue.type;
            if (i4 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i4 < 28 || i4 > 31) {
                Resources resources2 = typedArrayM9648.getResources();
                int resourceId = typedArrayM9648.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC4212.f16238;
                try {
                    colorStateListM9660 = AbstractC4212.m9660(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                }
            } else {
                colorStateListM9660 = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList = colorStateListM9660;
        if (colorStateList != null) {
            c20662.f7838 = colorStateList;
        }
        boolean z = c20662.f7833;
        if (AbstractC4205.m9643(xmlPullParser, "autoMirrored")) {
            z = typedArrayM9648.getBoolean(5, z);
        }
        c20662.f7833 = z;
        float f = c20732.f7864;
        if (AbstractC4205.m9643(xmlPullParser, "viewportWidth")) {
            f = typedArrayM9648.getFloat(7, f);
        }
        c20732.f7864 = f;
        float f2 = c20732.f7867;
        if (AbstractC4205.m9643(xmlPullParser, "viewportHeight")) {
            f2 = typedArrayM9648.getFloat(8, f2);
        }
        c20732.f7867 = f2;
        if (c20732.f7864 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM9648.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM9648.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c20732.f7869 = typedArrayM9648.getDimension(3, c20732.f7869);
        float dimension = typedArrayM9648.getDimension(2, c20732.f7876);
        c20732.f7876 = dimension;
        if (c20732.f7869 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM9648.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayM9648.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = c20732.getAlpha();
        if (AbstractC4205.m9643(xmlPullParser, "alpha")) {
            alpha = typedArrayM9648.getFloat(4, alpha);
        }
        c20732.setAlpha(alpha);
        String string = typedArrayM9648.getString(0);
        if (string != null) {
            c20732.f7866 = string;
            c20732.f7868.put(string, c20732);
        }
        typedArrayM9648.recycle();
        c2066.f7839 = getChangingConfigurations();
        c2066.f7836 = true;
        C2066 c20663 = this.f7878;
        C2073 c20733 = c20663.f7832;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c20733.f7873);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        for (int i5 = 1; eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i3); i5 = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C2065 c2065 = (C2065) arrayDeque.peek();
                boolean zEquals = "path".equals(name);
                C2741 c2741 = c20733.f7868;
                c2073 = c20733;
                if (zEquals) {
                    C2062 c2062 = new C2062();
                    c2062.f7807 = 0.0f;
                    c2062.f7814 = 1.0f;
                    c2062.f7812 = 1.0f;
                    c2062.f7817 = 0.0f;
                    c2062.f7808 = 1.0f;
                    c2062.f7811 = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    c2062.f7809 = cap;
                    Paint.Join join = Paint.Join.MITER;
                    c2062.f7810 = join;
                    i = depth;
                    c2062.f7815 = 4.0f;
                    TypedArray typedArrayM96482 = AbstractC4205.m9648(resources, theme, attributeSet, AbstractC2070.f7853);
                    if (AbstractC4205.m9643(xmlPullParser, "pathData")) {
                        String string2 = typedArrayM96482.getString(0);
                        if (string2 != null) {
                            c2062.f7818 = string2;
                        }
                        String string3 = typedArrayM96482.getString(2);
                        if (string3 != null) {
                            c2062.f7820 = ˎˑ.ﹶˆ(string3);
                        }
                        c2062.f7813 = AbstractC4205.m9649(typedArrayM96482, xmlPullParser, theme, "fillColor", 1);
                        float f3 = c2062.f7812;
                        if (AbstractC4205.m9643(xmlPullParser, "fillAlpha")) {
                            f3 = typedArrayM96482.getFloat(12, f3);
                        }
                        c2062.f7812 = f3;
                        int i6 = !AbstractC4205.m9643(xmlPullParser, "strokeLineCap") ? -1 : typedArrayM96482.getInt(8, -1);
                        c2062.f7809 = i6 != 0 ? i6 != 1 ? i6 != 2 ? c2062.f7809 : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i7 = !AbstractC4205.m9643(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayM96482.getInt(9, -1);
                        Paint.Join join2 = c2062.f7810;
                        if (i7 != 0) {
                            join = i7 != 1 ? i7 != 2 ? join2 : Paint.Join.BEVEL : Paint.Join.ROUND;
                        }
                        c2062.f7810 = join;
                        float f4 = c2062.f7815;
                        if (AbstractC4205.m9643(xmlPullParser, "strokeMiterLimit")) {
                            f4 = typedArrayM96482.getFloat(10, f4);
                        }
                        c2062.f7815 = f4;
                        c2062.f7816 = AbstractC4205.m9649(typedArrayM96482, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = c2062.f7814;
                        if (AbstractC4205.m9643(xmlPullParser, "strokeAlpha")) {
                            f5 = typedArrayM96482.getFloat(11, f5);
                        }
                        c2062.f7814 = f5;
                        float f6 = c2062.f7807;
                        if (AbstractC4205.m9643(xmlPullParser, "strokeWidth")) {
                            f6 = typedArrayM96482.getFloat(4, f6);
                        }
                        c2062.f7807 = f6;
                        float f7 = c2062.f7808;
                        if (AbstractC4205.m9643(xmlPullParser, "trimPathEnd")) {
                            f7 = typedArrayM96482.getFloat(6, f7);
                        }
                        c2062.f7808 = f7;
                        float f8 = c2062.f7811;
                        if (AbstractC4205.m9643(xmlPullParser, "trimPathOffset")) {
                            f8 = typedArrayM96482.getFloat(7, f8);
                        }
                        c2062.f7811 = f8;
                        float f9 = c2062.f7817;
                        if (AbstractC4205.m9643(xmlPullParser, "trimPathStart")) {
                            f9 = typedArrayM96482.getFloat(5, f9);
                        }
                        c2062.f7817 = f9;
                        int i8 = c2062.f7819;
                        if (AbstractC4205.m9643(xmlPullParser, "fillType")) {
                            i8 = typedArrayM96482.getInt(13, i8);
                        }
                        c2062.f7819 = i8;
                    }
                    typedArrayM96482.recycle();
                    c2065.f7821.add(c2062);
                    if (c2062.getPathName() != null) {
                        c2741.put(c2062.getPathName(), c2062);
                    }
                    c20663.f7839 = c20663.f7839;
                    z2 = false;
                } else {
                    i = depth;
                    if ("clip-path".equals(name)) {
                        C2076 c2076 = new C2076();
                        if (AbstractC4205.m9643(xmlPullParser, "pathData")) {
                            TypedArray typedArrayM96483 = AbstractC4205.m9648(resources, theme, attributeSet, AbstractC2070.f7857);
                            String string4 = typedArrayM96483.getString(0);
                            if (string4 != null) {
                                c2076.f7818 = string4;
                            }
                            String string5 = typedArrayM96483.getString(1);
                            if (string5 != null) {
                                c2076.f7820 = ˎˑ.ﹶˆ(string5);
                            }
                            c2076.f7819 = !AbstractC4205.m9643(xmlPullParser, "fillType") ? 0 : typedArrayM96483.getInt(2, 0);
                            typedArrayM96483.recycle();
                        }
                        c2065.f7821.add(c2076);
                        if (c2076.getPathName() != null) {
                            c2741.put(c2076.getPathName(), c2076);
                        }
                        c20663.f7839 = c20663.f7839;
                    } else if ("group".equals(name)) {
                        C2065 c20652 = new C2065();
                        TypedArray typedArrayM96484 = AbstractC4205.m9648(resources, theme, attributeSet, AbstractC2070.f7848);
                        float f10 = c20652.f7826;
                        if (AbstractC4205.m9643(xmlPullParser, "rotation")) {
                            f10 = typedArrayM96484.getFloat(5, f10);
                        }
                        c20652.f7826 = f10;
                        c20652.f7830 = typedArrayM96484.getFloat(1, c20652.f7830);
                        c20652.f7822 = typedArrayM96484.getFloat(2, c20652.f7822);
                        float f11 = c20652.f7828;
                        if (AbstractC4205.m9643(xmlPullParser, "scaleX")) {
                            f11 = typedArrayM96484.getFloat(3, f11);
                        }
                        c20652.f7828 = f11;
                        float f12 = c20652.f7829;
                        if (AbstractC4205.m9643(xmlPullParser, "scaleY")) {
                            f12 = typedArrayM96484.getFloat(4, f12);
                        }
                        c20652.f7829 = f12;
                        float f13 = c20652.f7825;
                        if (AbstractC4205.m9643(xmlPullParser, "translateX")) {
                            f13 = typedArrayM96484.getFloat(6, f13);
                        }
                        c20652.f7825 = f13;
                        float f14 = c20652.f7831;
                        if (AbstractC4205.m9643(xmlPullParser, "translateY")) {
                            f14 = typedArrayM96484.getFloat(7, f14);
                        }
                        c20652.f7831 = f14;
                        String string6 = typedArrayM96484.getString(0);
                        if (string6 != null) {
                            c20652.f7824 = string6;
                        }
                        c20652.m5728();
                        typedArrayM96484.recycle();
                        c2065.f7821.add(c20652);
                        arrayDeque.push(c20652);
                        if (c20652.getGroupName() != null) {
                            c2741.put(c20652.getGroupName(), c20652);
                        }
                        c20663.f7839 = c20663.f7839;
                    }
                }
                i3 = 3;
            } else {
                c2073 = c20733;
                i = depth;
                i3 = 3;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            c20733 = c2073;
            depth = i;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.f7881 = m5735(c2066.f7838, c2066.f7842);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.isAutoMirrored() : this.f7878.f7833;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f7844;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C2066 c2066 = this.f7878;
            if (c2066 != null) {
                C2073 c2073 = c2066.f7832;
                if (c2073.f7874 == null) {
                    c2073.f7874 = Boolean.valueOf(c2073.f7873.mo5727());
                }
                if (c2073.f7874.booleanValue() || ((colorStateList = this.f7878.f7838) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f7879 && super.mutate() == this) {
            C2066 c2066 = this.f7878;
            C2066 c20662 = new C2066();
            c20662.f7838 = null;
            c20662.f7842 = f7877;
            if (c2066 != null) {
                c20662.f7839 = c2066.f7839;
                C2073 c2073 = new C2073(c2066.f7832);
                c20662.f7832 = c2073;
                if (c2066.f7832.f7863 != null) {
                    c2073.f7863 = new Paint(c2066.f7832.f7863);
                }
                if (c2066.f7832.f7875 != null) {
                    c20662.f7832.f7875 = new Paint(c2066.f7832.f7875);
                }
                c20662.f7838 = c2066.f7838;
                c20662.f7842 = c2066.f7842;
                c20662.f7833 = c2066.f7833;
            }
            this.f7878 = c20662;
            this.f7879 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f7844;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C2066 c2066 = this.f7878;
        ColorStateList colorStateList = c2066.f7838;
        if (colorStateList == null || (mode = c2066.f7842) == null) {
            z = false;
        } else {
            this.f7881 = m5735(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C2073 c2073 = c2066.f7832;
        if (c2073.f7874 == null) {
            c2073.f7874 = Boolean.valueOf(c2073.f7873.mo5727());
        }
        if (c2073.f7874.booleanValue()) {
            boolean zMo5726 = c2066.f7832.f7873.mo5726(iArr);
            c2066.f7836 |= zMo5726;
            if (zMo5726) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f7878.f7832.getRootAlpha() != i) {
            this.f7878.f7832.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f7878.f7833 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7883 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            ﹳﹳ.ᐧⁱ(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C2066 c2066 = this.f7878;
        if (c2066.f7838 != colorStateList) {
            c2066.f7838 = colorStateList;
            this.f7881 = m5735(colorStateList, c2066.f7842);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C2066 c2066 = this.f7878;
        if (c2066.f7842 != mode) {
            c2066.f7842 = mode;
            this.f7881 = m5735(c2066.f7838, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f7844;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f7844;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final PorterDuffColorFilter m5735(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
