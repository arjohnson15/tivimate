package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import org.lsposed.hiddenapibypass.library.R;

/* loaded from: classes.dex */
public final class SeekBar extends View {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f950;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final RectF f951;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Paint f952;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f953;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final RectF f954;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public int f955;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f956;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f957;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Paint f958;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final RectF f959;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public int f960;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final Paint f961;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Paint f962;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f963;

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f959 = new RectF();
        this.f951 = new RectF();
        this.f954 = new RectF();
        Paint paint = new Paint(1);
        this.f958 = paint;
        Paint paint2 = new Paint(1);
        this.f952 = paint2;
        Paint paint3 = new Paint(1);
        this.f961 = paint3;
        Paint paint4 = new Paint(1);
        this.f962 = paint4;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(-3355444);
        paint2.setColor(-65536);
        paint4.setColor(-1);
        this.f956 = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070198);
        this.f955 = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070196);
        this.f950 = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070197);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.f960;
    }

    public int getProgress() {
        return this.f953;
    }

    public int getSecondProgress() {
        return this.f957;
    }

    public int getSecondaryProgressColor() {
        return this.f958.getColor();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = isFocused() ? this.f950 : this.f956 / 2;
        canvas.drawRoundRect(this.f954, f, f, this.f961);
        RectF rectF = this.f951;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f, f, this.f958);
        }
        canvas.drawRoundRect(this.f959, f, f, this.f952);
        canvas.drawCircle(this.f963, getHeight() / 2, f, this.f962);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        m880();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m880();
    }

    public void setAccessibilitySeekListener(AbstractC0196 abstractC0196) {
    }

    public void setActiveBarHeight(int i) {
        this.f955 = i;
        m880();
    }

    public void setActiveRadius(int i) {
        this.f950 = i;
        m880();
    }

    public void setBarHeight(int i) {
        this.f956 = i;
        m880();
    }

    public void setMax(int i) {
        this.f960 = i;
        m880();
    }

    public void setProgress(int i) {
        int i2 = this.f960;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.f953 = i;
        m880();
    }

    public void setProgressColor(int i) {
        this.f952.setColor(i);
    }

    public void setSecondaryProgress(int i) {
        int i2 = this.f960;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.f957 = i;
        m880();
    }

    public void setSecondaryProgressColor(int i) {
        this.f958.setColor(i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m880() {
        int i = isFocused() ? this.f955 : this.f956;
        int width = getWidth();
        int height = getHeight();
        int i2 = (height - i) / 2;
        RectF rectF = this.f954;
        int i3 = this.f956;
        float f = i2;
        float f2 = height - i2;
        rectF.set(i3 / 2, f, width - (i3 / 2), f2);
        int i4 = isFocused() ? this.f950 : this.f956 / 2;
        float f3 = width - (i4 * 2);
        float f4 = (this.f953 / this.f960) * f3;
        RectF rectF2 = this.f959;
        int i5 = this.f956;
        rectF2.set(i5 / 2, f, (i5 / 2) + f4, f2);
        this.f951.set(rectF2.right, f, (this.f956 / 2) + ((this.f957 / this.f960) * f3), f2);
        this.f963 = i4 + ((int) f4);
        invalidate();
    }
}
