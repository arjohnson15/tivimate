package p255;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p044.AbstractC1298;
import p171.C2467;
import p171.InterfaceC2465;
import p219.C2838;
import p220.C2846;
import p220.C2854;
import p220.InterfaceC2843;
import p228.C3057;
import p361.C4087;
import p361.C4097;
import p361.C4098;
import p361.C4105;
import p421.AbstractC4862;
import ˆˑ.ﹳﹳ;

/* renamed from: יـ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3189 extends C4105 implements Drawable.Callback, InterfaceC2843 {

    /* renamed from: ʻ, reason: contains not printable characters */
    public SpannableStringBuilder f12327;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public float f12328;

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public int f12329;

    /* renamed from: ʻˏ, reason: contains not printable characters */
    public boolean f12330;

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public ColorStateList f12331;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final Context f12332;

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public C2838 f12333;

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public int f12334;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public ColorStateList f12335;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public boolean f12336;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public Drawable f12337;

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public int f12338;

    /* renamed from: ˆʼ, reason: contains not printable characters */
    public int f12339;

    /* renamed from: ˆˋ, reason: contains not printable characters */
    public PorterDuffColorFilter f12340;

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public int f12341;

    /* renamed from: ˆﹶ, reason: contains not printable characters */
    public ColorFilter f12342;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public RippleDrawable f12343;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public ColorStateList f12344;

    /* renamed from: ˉ, reason: contains not printable characters */
    public ColorStateList f12345;

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public final PointF f12346;

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public final Paint f12347;

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public boolean f12348;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public boolean f12349;

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public final Paint.FontMetrics f12350;

    /* renamed from: ˎי, reason: contains not printable characters */
    public int f12351;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public CharSequence f12352;

    /* renamed from: ˏ, reason: contains not printable characters */
    public float f12353;

    /* renamed from: ˏʻ, reason: contains not printable characters */
    public int f12354;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public boolean f12355;

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public int f12356;

    /* renamed from: יʾ, reason: contains not printable characters */
    public boolean f12357;

    /* renamed from: יˆ, reason: contains not printable characters */
    public final RectF f12358;

    /* renamed from: יˊ, reason: contains not printable characters */
    public float f12359;

    /* renamed from: יי, reason: contains not printable characters */
    public boolean f12360;

    /* renamed from: יᴵ, reason: contains not printable characters */
    public final C2846 f12361;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public ColorStateList f12362;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public float f12363;

    /* renamed from: ٴᵔ, reason: contains not printable characters */
    public int[] f12364;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public float f12365;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public boolean f12366;

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public Drawable f12367;

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public float f12368;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public float f12369;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public ColorStateList f12370;

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public C2838 f12371;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public float f12372;

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public float f12373;

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public float f12374;

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public float f12375;

    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public final Path f12376;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public ColorStateList f12377;

    /* renamed from: ᵢⁱ, reason: contains not printable characters */
    public PorterDuff.Mode f12378;

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public float f12379;

    /* renamed from: ⁱˏ, reason: contains not printable characters */
    public WeakReference f12380;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public Drawable f12381;

    /* renamed from: ﹳ, reason: contains not printable characters */
    public int f12382;

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public float f12383;

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public ColorStateList f12384;

    /* renamed from: ﾞי, reason: contains not printable characters */
    public TextUtils.TruncateAt f12385;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public ColorStateList f12386;

    /* renamed from: ᵢᴵ, reason: contains not printable characters */
    public static final int[] f12326 = {R.attr.state_enabled};

    /* renamed from: ˋᴵ, reason: contains not printable characters */
    public static final ShapeDrawable f12325 = new ShapeDrawable(new OvalShape());

    public C3189(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040101, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140521);
        this.f12365 = -1.0f;
        this.f12347 = new Paint(1);
        this.f12350 = new Paint.FontMetrics();
        this.f12358 = new RectF();
        this.f12346 = new PointF();
        this.f12376 = new Path();
        this.f12382 = 255;
        this.f12378 = PorterDuff.Mode.SRC_IN;
        this.f12380 = new WeakReference(null);
        m9405(context);
        this.f12332 = context;
        C2846 c2846 = new C2846(this);
        this.f12361 = c2846;
        this.f12352 = "";
        c2846.f11068.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f12326;
        setState(iArr);
        if (!Arrays.equals(this.f12364, iArr)) {
            this.f12364 = iArr;
            if (m7877()) {
                m7864(getState(), iArr);
            }
        }
        this.f12357 = true;
        int[] iArr2 = AbstractC1298.f5320;
        f12325.setTint(-1);
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static void m7856(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static boolean m7857(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static boolean m7858(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // p361.C4105, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f12382) == 0) {
            return;
        }
        if (i < 255) {
            float f = bounds.left;
            float f2 = bounds.top;
            float f3 = bounds.right;
            float f4 = bounds.bottom;
            iSaveLayerAlpha = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
        } else {
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f12330;
        Paint paint = this.f12347;
        RectF rectF = this.f12358;
        if (!z) {
            paint.setColor(this.f12339);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas.drawRoundRect(rectF, m7887(), m7887(), paint);
        }
        if (!this.f12330) {
            paint.setColor(this.f12334);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f12342;
            if (colorFilter == null) {
                colorFilter = this.f12340;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas.drawRoundRect(rectF, m7887(), m7887(), paint);
        }
        if (this.f12330) {
            super.draw(canvas);
        }
        if (this.f12372 > 0.0f && !this.f12330) {
            paint.setColor(this.f12351);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f12330) {
                ColorFilter colorFilter2 = this.f12342;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f12340;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f5 = bounds.left;
            float f6 = this.f12372 / 2.0f;
            rectF.set(f5 + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
            float f7 = this.f12365 - (this.f12372 / 2.0f);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
        paint.setColor(this.f12329);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f12330) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f12376;
            C4098 c4098 = this.f15848;
            this.f15865.m9385(c4098.f15817, this.f15869, c4098.f15809, rectF2, this.f15845, path);
            m9404(canvas, paint, path, this.f15848.f15817, this.f15869, m9415());
        } else {
            canvas.drawRoundRect(rectF, m7887(), m7887(), paint);
        }
        if (m7868()) {
            m7884(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas.translate(f8, f9);
            this.f12381.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f12381.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (m7865()) {
            m7884(bounds, rectF);
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f12367.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f12367.draw(canvas);
            canvas.translate(-f10, -f11);
        }
        if (this.f12357 && this.f12352 != null) {
            PointF pointF = this.f12346;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f12352;
            C2846 c2846 = this.f12361;
            if (charSequence != null) {
                float fM7861 = m7861() + this.f12383 + this.f12375;
                if (ﹳﹳ.ᴵʿ(this) == 0) {
                    pointF.x = bounds.left + fM7861;
                } else {
                    pointF.x = bounds.right - fM7861;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c2846.f11068;
                Paint.FontMetrics fontMetrics = this.f12350;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f12352 != null) {
                float fM78612 = m7861() + this.f12383 + this.f12375;
                float fM7867 = m7867() + this.f12359 + this.f12368;
                if (ﹳﹳ.ᴵʿ(this) == 0) {
                    rectF.left = bounds.left + fM78612;
                    rectF.right = bounds.right - fM7867;
                } else {
                    rectF.left = bounds.left + fM7867;
                    rectF.right = bounds.right - fM78612;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C3057 c3057 = c2846.f11069;
            TextPaint textPaint2 = c2846.f11068;
            if (c3057 != null) {
                textPaint2.drawableState = getState();
                c2846.f11069.m7549(this.f12332, textPaint2, c2846.f11065);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(c2846.m7134(this.f12352.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas.save();
                canvas.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f12352;
            if (z2 && this.f12385 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f12385);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            if (z2) {
                canvas.restoreToCount(i2);
            }
        }
        if (m7877()) {
            rectF.setEmpty();
            if (m7877()) {
                float f12 = this.f12359 + this.f12374;
                if (ﹳﹳ.ᴵʿ(this) == 0) {
                    float f13 = bounds.right - f12;
                    rectF.right = f13;
                    rectF.left = f13 - this.f12353;
                } else {
                    float f14 = bounds.left + f12;
                    rectF.left = f14;
                    rectF.right = f14 + this.f12353;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f15 = this.f12353;
                float f16 = fExactCenterY - (f15 / 2.0f);
                rectF.top = f16;
                rectF.bottom = f16 + f15;
            }
            float f17 = rectF.left;
            float f18 = rectF.top;
            canvas.translate(f17, f18);
            this.f12337.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = AbstractC1298.f5320;
            this.f12343.setBounds(this.f12337.getBounds());
            this.f12343.jumpToCurrentState();
            this.f12343.draw(canvas);
            canvas.translate(-f17, -f18);
        }
        if (this.f12382 < 255) {
            canvas.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p361.C4105, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f12382;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f12342;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f12363;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m7867() + this.f12361.m7134(this.f12352.toString()) + m7861() + this.f12383 + this.f12375 + this.f12368 + this.f12359), this.f12354);
    }

    @Override // p361.C4105, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p361.C4105, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f12330) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f12363, this.f12365);
        } else {
            outline.setRoundRect(bounds, this.f12365);
        }
        outline.setAlpha(this.f12382 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p361.C4105, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C3057 c3057;
        ColorStateList colorStateList;
        return m7858(this.f12344) || m7858(this.f12335) || m7858(this.f12362) || !((c3057 = this.f12361.f11069) == null || (colorStateList = c3057.f11775) == null || !colorStateList.isStateful()) || ((this.f12348 && this.f12367 != null && this.f12336) || m7857(this.f12381) || m7857(this.f12367) || m7858(this.f12331));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m7868()) {
            zOnLayoutDirectionChanged |= ﹳﹳ.ˈٴ(this.f12381, i);
        }
        if (m7865()) {
            zOnLayoutDirectionChanged |= ﹳﹳ.ˈٴ(this.f12367, i);
        }
        if (m7877()) {
            zOnLayoutDirectionChanged |= ﹳﹳ.ˈٴ(this.f12337, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m7868()) {
            zOnLevelChange |= this.f12381.setLevel(i);
        }
        if (m7865()) {
            zOnLevelChange |= this.f12367.setLevel(i);
        }
        if (m7877()) {
            zOnLevelChange |= this.f12337.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p361.C4105, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f12330) {
            super.onStateChange(iArr);
        }
        return m7864(iArr, this.f12364);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p361.C4105, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f12382 != i) {
            this.f12382 = i;
            invalidateSelf();
        }
    }

    @Override // p361.C4105, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f12342 != colorFilter) {
            this.f12342 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p361.C4105, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f12331 != colorStateList) {
            this.f12331 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p361.C4105, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f12378 != mode) {
            this.f12378 = mode;
            ColorStateList colorStateList = this.f12331;
            this.f12340 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m7868()) {
            visible |= this.f12381.setVisible(z, z2);
        }
        if (m7865()) {
            visible |= this.f12367.setVisible(z, z2);
        }
        if (m7877()) {
            visible |= this.f12337.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m7859(float f) {
        if (this.f12379 != f) {
            float fM7861 = m7861();
            this.f12379 = f;
            float fM78612 = m7861();
            invalidateSelf();
            if (fM7861 != fM78612) {
                m7885();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final void m7860(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f12337;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof InterfaceC2465;
            drawable2 = drawable3;
            if (z) {
                drawable2 = ((C2467) ((InterfaceC2465) drawable3)).f9810;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM7867 = m7867();
            this.f12337 = drawable != null ? ﹳﹳ.ᵢʿ(drawable).mutate() : null;
            int[] iArr = AbstractC1298.f5320;
            this.f12343 = new RippleDrawable(AbstractC1298.m4597(this.f12370), this.f12337, f12325);
            float fM78672 = m7867();
            m7856(drawable2);
            if (m7877()) {
                m7878(this.f12337);
            }
            invalidateSelf();
            if (fM7867 != fM78672) {
                m7885();
            }
        }
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final float m7861() {
        if (!m7868() && !m7865()) {
            return 0.0f;
        }
        float f = this.f12373;
        Drawable drawable = this.f12360 ? this.f12367 : this.f12381;
        float intrinsicWidth = this.f12328;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f12379;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m7862(Drawable drawable) {
        if (this.f12367 != drawable) {
            float fM7861 = m7861();
            this.f12367 = drawable;
            float fM78612 = m7861();
            m7856(this.f12367);
            m7878(this.f12367);
            invalidateSelf();
            if (fM7861 != fM78612) {
                m7885();
            }
        }
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m7863(float f) {
        if (this.f12365 != f) {
            this.f12365 = f;
            C4087 c4087M9381 = this.f15848.f15817.m9381();
            c4087M9381.f15758 = new C4097(f);
            c4087M9381.f15765 = new C4097(f);
            c4087M9381.f15766 = new C4097(f);
            c4087M9381.f15762 = new C4097(f);
            setShapeAppearanceModel(c4087M9381.m9375());
        }
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final boolean m7864(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean state = true;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f12344;
        int iM9412 = m9412(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f12339) : 0);
        if (this.f12339 != iM9412) {
            this.f12339 = iM9412;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f12335;
        int iM94122 = m9412(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f12334) : 0);
        if (this.f12334 != iM94122) {
            this.f12334 = iM94122;
            zOnStateChange = true;
        }
        int iM10939 = AbstractC4862.m10939(iM94122, iM9412);
        if ((this.f12338 != iM10939) | (this.f15848.f15822 == null)) {
            this.f12338 = iM10939;
            m9407(ColorStateList.valueOf(iM10939));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f12362;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f12351) : 0;
        if (this.f12351 != colorForState) {
            this.f12351 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f12345 == null || !AbstractC1298.m4596(iArr)) ? 0 : this.f12345.getColorForState(iArr, this.f12329);
        if (this.f12329 != colorForState2) {
            this.f12329 = colorForState2;
        }
        C3057 c3057 = this.f12361.f11069;
        int colorForState3 = (c3057 == null || (colorStateList = c3057.f11775) == null) ? 0 : colorStateList.getColorForState(iArr, this.f12356);
        if (this.f12356 != colorForState3) {
            this.f12356 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state2[i] == 16842912) {
                    z = this.f12336;
                } else {
                    i++;
                }
            }
        }
        if (this.f12360 == z || this.f12367 == null) {
            z2 = false;
        } else {
            float fM7861 = m7861();
            this.f12360 = z;
            if (fM7861 != m7861()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                zOnStateChange = true;
                z2 = false;
            }
        }
        ColorStateList colorStateList5 = this.f12331;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f12341) : 0;
        if (this.f12341 != colorForState4) {
            this.f12341 = colorForState4;
            ColorStateList colorStateList6 = this.f12331;
            PorterDuff.Mode mode = this.f12378;
            this.f12340 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m7857(this.f12381)) {
            state |= this.f12381.setState(iArr);
        }
        if (m7857(this.f12367)) {
            state |= this.f12367.setState(iArr);
        }
        if (m7857(this.f12337)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f12337.setState(iArr3);
        }
        int[] iArr4 = AbstractC1298.f5320;
        if (m7857(this.f12343)) {
            state |= this.f12343.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m7885();
        }
        return state;
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final boolean m7865() {
        return this.f12348 && this.f12367 != null && this.f12360;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m7866(ColorStateList colorStateList) {
        this.f12366 = true;
        if (this.f12386 != colorStateList) {
            this.f12386 = colorStateList;
            if (m7868()) {
                this.f12381.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final float m7867() {
        if (m7877()) {
            return this.f12369 + this.f12353 + this.f12374;
        }
        return 0.0f;
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final boolean m7868() {
        return this.f12355 && this.f12381 != null;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m7869(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f12384 != colorStateList) {
            this.f12384 = colorStateList;
            if (this.f12348 && (drawable = this.f12367) != null && this.f12336) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final void m7870(ColorStateList colorStateList) {
        if (this.f12377 != colorStateList) {
            this.f12377 = colorStateList;
            if (m7877()) {
                this.f12337.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final void m7871(float f) {
        if (this.f12353 != f) {
            this.f12353 = f;
            invalidateSelf();
            if (m7877()) {
                m7885();
            }
        }
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final void m7872(float f) {
        if (this.f12374 != f) {
            this.f12374 = f;
            invalidateSelf();
            if (m7877()) {
                m7885();
            }
        }
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m7873(boolean z) {
        if (this.f12355 != z) {
            boolean zM7868 = m7868();
            this.f12355 = z;
            boolean zM78682 = m7868();
            if (zM7868 != zM78682) {
                if (zM78682) {
                    m7878(this.f12381);
                } else {
                    m7856(this.f12381);
                }
                invalidateSelf();
                m7885();
            }
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m7874(boolean z) {
        if (this.f12348 != z) {
            boolean zM7865 = m7865();
            this.f12348 = z;
            boolean zM78652 = m7865();
            if (zM7865 != zM78652) {
                if (zM78652) {
                    m7878(this.f12367);
                } else {
                    m7856(this.f12367);
                }
                invalidateSelf();
                m7885();
            }
        }
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void m7875(boolean z) {
        if (this.f12336 != z) {
            this.f12336 = z;
            float fM7861 = m7861();
            if (!z && this.f12360) {
                this.f12360 = false;
            }
            float fM78612 = m7861();
            invalidateSelf();
            if (fM7861 != fM78612) {
                m7885();
            }
        }
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final void m7876(ColorStateList colorStateList) {
        if (this.f12362 != colorStateList) {
            this.f12362 = colorStateList;
            if (this.f12330) {
                C4098 c4098 = this.f15848;
                if (c4098.f15808 != colorStateList) {
                    c4098.f15808 = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final boolean m7877() {
        return this.f12349 && this.f12337 != null;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m7878(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        ﹳﹳ.ˈٴ(drawable, ﹳﹳ.ᴵʿ(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f12337) {
            if (drawable.isStateful()) {
                drawable.setState(this.f12364);
            }
            drawable.setTintList(this.f12377);
            return;
        }
        Drawable drawable2 = this.f12381;
        if (drawable == drawable2 && this.f12366) {
            drawable2.setTintList(this.f12386);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m7879(ColorStateList colorStateList) {
        if (this.f12370 != colorStateList) {
            this.f12370 = colorStateList;
            this.f12345 = null;
            onStateChange(getState());
        }
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final void m7880(float f) {
        if (this.f12373 != f) {
            float fM7861 = m7861();
            this.f12373 = f;
            float fM78612 = m7861();
            invalidateSelf();
            if (fM7861 != fM78612) {
                m7885();
            }
        }
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void m7881(boolean z) {
        if (this.f12349 != z) {
            boolean zM7877 = m7877();
            this.f12349 = z;
            boolean zM78772 = m7877();
            if (zM7877 != zM78772) {
                if (zM78772) {
                    m7878(this.f12337);
                } else {
                    m7856(this.f12337);
                }
                invalidateSelf();
                m7885();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m7882(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f12381;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof InterfaceC2465;
            drawable2 = drawable3;
            if (z) {
                drawable2 = ((C2467) ((InterfaceC2465) drawable3)).f9810;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM7861 = m7861();
            this.f12381 = drawable != null ? ﹳﹳ.ᵢʿ(drawable).mutate() : null;
            float fM78612 = m7861();
            m7856(drawable2);
            if (m7868()) {
                m7878(this.f12381);
            }
            invalidateSelf();
            if (fM7861 != fM78612) {
                m7885();
            }
        }
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final void m7883(float f) {
        if (this.f12369 != f) {
            this.f12369 = f;
            invalidateSelf();
            if (m7877()) {
                m7885();
            }
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m7884(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m7868() || m7865()) {
            float f = this.f12383 + this.f12373;
            Drawable drawable = this.f12360 ? this.f12367 : this.f12381;
            float intrinsicWidth = this.f12328;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (ﹳﹳ.ᴵʿ(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f12360 ? this.f12367 : this.f12381;
            float fCeil = this.f12328;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f12332.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m7885() {
        InterfaceC3187 interfaceC3187 = (InterfaceC3187) this.f12380.get();
        if (interfaceC3187 != null) {
            Chip chip = (Chip) interfaceC3187;
            chip.m2846(chip.f3240);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m7886(float f) {
        if (this.f12328 != f) {
            float fM7861 = m7861();
            this.f12328 = f;
            float fM78612 = m7861();
            invalidateSelf();
            if (fM7861 != fM78612) {
                m7885();
            }
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final float m7887() {
        if (!this.f12330) {
            return this.f12365;
        }
        float[] fArr = this.f15869;
        return fArr != null ? fArr[3] : this.f15848.f15817.f15772.mo9371(m9415());
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final void m7888(C3057 c3057) {
        C2846 c2846 = this.f12361;
        if (c2846.f11069 != c3057) {
            c2846.f11069 = c3057;
            if (c3057 != null) {
                TextPaint textPaint = c2846.f11068;
                Context context = this.f12332;
                C2854 c2854 = c2846.f11065;
                c3057.m7545(context, textPaint, c2854);
                InterfaceC2843 interfaceC2843 = (InterfaceC2843) c2846.f11066.get();
                if (interfaceC2843 != null) {
                    textPaint.drawableState = interfaceC2843.getState();
                }
                c3057.m7549(context, textPaint, c2854);
                c2846.f11070 = true;
            }
            InterfaceC2843 interfaceC28432 = (InterfaceC2843) c2846.f11066.get();
            if (interfaceC28432 != null) {
                C3189 c3189 = (C3189) interfaceC28432;
                c3189.m7885();
                c3189.invalidateSelf();
                c3189.onStateChange(interfaceC28432.getState());
            }
        }
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final void m7889(float f) {
        if (this.f12372 != f) {
            this.f12372 = f;
            this.f12347.setStrokeWidth(f);
            if (this.f12330) {
                this.f15848.f15812 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }
}
