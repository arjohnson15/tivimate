package androidx.leanback.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import p378.AbstractC4345;

/* loaded from: classes.dex */
public class HorizontalGridView extends AbstractC0164 {

    /* renamed from: ʻـ, reason: contains not printable characters */
    public final Paint f841;

    /* renamed from: ˆˏ, reason: contains not printable characters */
    public int f842;

    /* renamed from: ˊˉ, reason: contains not printable characters */
    public LinearGradient f843;

    /* renamed from: ˋʽ, reason: contains not printable characters */
    public Bitmap f844;

    /* renamed from: ˑˉ, reason: contains not printable characters */
    public boolean f845;

    /* renamed from: יᵔ, reason: contains not printable characters */
    public int f846;

    /* renamed from: ـᵢ, reason: contains not printable characters */
    public boolean f847;

    /* renamed from: ᴵˊ, reason: contains not printable characters */
    public LinearGradient f848;

    /* renamed from: ⁱᵎ, reason: contains not printable characters */
    public Bitmap f849;

    /* renamed from: ⁱﹳ, reason: contains not printable characters */
    public final Rect f850;

    /* renamed from: ⁱﾞ, reason: contains not printable characters */
    public int f851;

    /* renamed from: ﾞﹳ, reason: contains not printable characters */
    public int f852;

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f841 = new Paint();
        this.f850 = new Rect();
        this.f1119.m853(0);
        m957(context, attributeSet);
        int[] iArr = AbstractC0171.f1132;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC4345.m9881(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        setRowHeight(typedArrayObtainStyledAttributes);
        setNumRows(typedArrayObtainStyledAttributes.getInt(0, 1));
        typedArrayObtainStyledAttributes.recycle();
        m865();
        Paint paint = new Paint();
        this.f841 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.f849;
        if (bitmap == null || bitmap.getWidth() != this.f846 || this.f849.getHeight() != getHeight()) {
            this.f849 = Bitmap.createBitmap(this.f846, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f849;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.f844;
        if (bitmap == null || bitmap.getWidth() != this.f842 || this.f844.getHeight() != getHeight()) {
            this.f844 = Bitmap.createBitmap(this.f842, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f844;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2 = true;
        if (this.f847) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                this.f1119.getClass();
                C0187 c0187 = (C0187) childAt.getLayoutParams();
                c0187.getClass();
                if (childAt.getLeft() + c0187.f1160 < getPaddingLeft() - this.f852) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (this.f845) {
            for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                View childAt2 = getChildAt(childCount2);
                this.f1119.getClass();
                C0187 c01872 = (C0187) childAt2.getLayoutParams();
                c01872.getClass();
                if (childAt2.getRight() - c01872.f1166 > (getWidth() - getPaddingRight()) + this.f851) {
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        if (!z) {
            this.f844 = null;
        }
        if (!z2) {
            this.f849 = null;
        }
        if (!z && !z2) {
            super.draw(canvas);
            return;
        }
        int paddingLeft = this.f847 ? (getPaddingLeft() - this.f852) - this.f842 : 0;
        int width = this.f845 ? (getWidth() - getPaddingRight()) + this.f851 + this.f846 : getWidth();
        int iSave = canvas.save();
        canvas.clipRect((this.f847 ? this.f842 : 0) + paddingLeft, 0, width - (this.f845 ? this.f846 : 0), getHeight());
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        Canvas canvas2 = new Canvas();
        Rect rect = this.f850;
        rect.top = 0;
        rect.bottom = getHeight();
        if (z && this.f842 > 0) {
            Bitmap tempBitmapLow = getTempBitmapLow();
            tempBitmapLow.eraseColor(0);
            canvas2.setBitmap(tempBitmapLow);
            int iSave2 = canvas2.save();
            canvas2.clipRect(0, 0, this.f842, getHeight());
            float f = -paddingLeft;
            canvas2.translate(f, 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(iSave2);
            this.f841.setShader(this.f848);
            canvas2.drawRect(0.0f, 0.0f, this.f842, getHeight(), this.f841);
            rect.left = 0;
            rect.right = this.f842;
            canvas.translate(paddingLeft, 0.0f);
            canvas.drawBitmap(tempBitmapLow, rect, rect, (Paint) null);
            canvas.translate(f, 0.0f);
        }
        if (!z2 || this.f846 <= 0) {
            return;
        }
        Bitmap tempBitmapHigh = getTempBitmapHigh();
        tempBitmapHigh.eraseColor(0);
        canvas2.setBitmap(tempBitmapHigh);
        int iSave3 = canvas2.save();
        canvas2.clipRect(0, 0, this.f846, getHeight());
        canvas2.translate(-(width - this.f846), 0.0f);
        super.draw(canvas2);
        canvas2.restoreToCount(iSave3);
        this.f841.setShader(this.f843);
        canvas2.drawRect(0.0f, 0.0f, this.f846, getHeight(), this.f841);
        rect.left = 0;
        rect.right = this.f846;
        canvas.translate(width - r3, 0.0f);
        canvas.drawBitmap(tempBitmapHigh, rect, rect, (Paint) null);
        canvas.translate(-(width - this.f846), 0.0f);
    }

    @SuppressLint({"GetterSetterNames"})
    public final boolean getFadingLeftEdge() {
        return this.f847;
    }

    public final int getFadingLeftEdgeLength() {
        return this.f842;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.f852;
    }

    @SuppressLint({"GetterSetterNames"})
    public final boolean getFadingRightEdge() {
        return this.f845;
    }

    public final int getFadingRightEdgeLength() {
        return this.f846;
    }

    public final int getFadingRightEdgeOffset() {
        return this.f851;
    }

    public final void setFadingLeftEdge(boolean z) {
        if (this.f847 != z) {
            this.f847 = z;
            if (!z) {
                this.f844 = null;
            }
            invalidate();
            m865();
        }
    }

    public final void setFadingLeftEdgeLength(int i) {
        if (this.f842 != i) {
            this.f842 = i;
            if (i != 0) {
                this.f848 = new LinearGradient(0.0f, 0.0f, this.f842, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            } else {
                this.f848 = null;
            }
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i) {
        if (this.f852 != i) {
            this.f852 = i;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z) {
        if (this.f845 != z) {
            this.f845 = z;
            if (!z) {
                this.f849 = null;
            }
            invalidate();
            m865();
        }
    }

    public final void setFadingRightEdgeLength(int i) {
        if (this.f846 != i) {
            this.f846 = i;
            if (i != 0) {
                this.f843 = new LinearGradient(0.0f, 0.0f, this.f846, 0.0f, -16777216, 0, Shader.TileMode.CLAMP);
            } else {
                this.f843 = null;
            }
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i) {
        if (this.f851 != i) {
            this.f851 = i;
            invalidate();
        }
    }

    public void setNumRows(int i) {
        GridLayoutManager gridLayoutManager = this.f1119;
        if (i < 0) {
            gridLayoutManager.getClass();
            throw new IllegalArgumentException();
        }
        gridLayoutManager.f795 = i;
        requestLayout();
    }

    public void setRowHeight(int i) {
        this.f1119.m852(i);
        requestLayout();
    }

    public void setRowHeight(TypedArray typedArray) {
        if (typedArray.peekValue(1) != null) {
            setRowHeight(typedArray.getLayoutDimension(1, 0));
        }
    }

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public final void m865() {
        if (this.f847 || this.f845) {
            setLayerType(2, null);
            setWillNotDraw(false);
        } else {
            setLayerType(0, null);
            setWillNotDraw(true);
        }
    }
}
