package p272;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: ـᐧ.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3341 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float f13065;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float f13066;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public int f13067;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f13068;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public StaticLayout f13069;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public int f13070;

    /* renamed from: ˉי, reason: contains not printable characters */
    public Layout.Alignment f13071;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public float f13072;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f13073;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public int f13074;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f13075;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f13076;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public float f13077;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public Bitmap f13078;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public float f13079;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Paint f13080;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final float f13081;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f13082;

    /* renamed from: יʻ, reason: contains not printable characters */
    public float f13083;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public Rect f13084;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float f13085;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final TextPaint f13086;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Paint f13087;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public StaticLayout f13088;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f13089;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f13090;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public int f13091;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public float f13092;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f13093;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public int f13094;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public float f13095;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float f13096;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f13097;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public CharSequence f13098;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public float f13099;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public int f13100;

    public C3341(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f13066 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f13096 = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f13085 = fRound;
        this.f13065 = fRound;
        this.f13081 = fRound;
        TextPaint textPaint = new TextPaint();
        this.f13086 = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f13087 = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f13080 = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8173(Canvas canvas, boolean z) {
        if (!z) {
            this.f13084.getClass();
            this.f13078.getClass();
            canvas.drawBitmap(this.f13078, (Rect) null, this.f13084, this.f13080);
            return;
        }
        StaticLayout staticLayout = this.f13088;
        StaticLayout staticLayout2 = this.f13069;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f13093, this.f13097);
        if (Color.alpha(this.f13067) > 0) {
            Paint paint = this.f13087;
            paint.setColor(this.f13067);
            canvas.drawRect(-this.f13073, 0.0f, staticLayout.getWidth() + this.f13073, staticLayout.getHeight(), paint);
        }
        int i = this.f13100;
        TextPaint textPaint = this.f13086;
        if (i == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f13085);
            textPaint.setColor(this.f13074);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else {
            float f = this.f13065;
            if (i == 2) {
                float f2 = this.f13081;
                textPaint.setShadowLayer(f, f2, f2, this.f13074);
            } else if (i == 3 || i == 4) {
                boolean z2 = i == 3;
                int i2 = z2 ? -1 : this.f13074;
                int i3 = z2 ? this.f13074 : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.f13091);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i2);
                staticLayout2.draw(canvas);
                textPaint.setShadowLayer(f, f3, f3, i3);
            }
        }
        textPaint.setColor(this.f13091);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }
}
