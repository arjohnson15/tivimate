package androidx.leanback.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.lsposed.hiddenapibypass.library.R;
import p348.AbstractC3996;
import p378.AbstractC4345;

/* loaded from: classes.dex */
public class PagingIndicator extends View {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final Paint f869;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int[] f870;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f871;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f872;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final float f873;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f874;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f875;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public int f876;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public int f877;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f878;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public C0195[] f879;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f880;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f881;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public int[] f882;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public Paint f883;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public Bitmap f884;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final Paint f885;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f886;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public int f887;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f888;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final Rect f889;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int[] f890;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static final DecelerateInterpolator f867 = new DecelerateInterpolator();

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public static final C0148 f868 = new C0148(Float.class, "alpha", 0);

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static final C0148 f865 = new C0148(Float.class, "diameter", 1);

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public static final C0148 f866 = new C0148(Float.class, "translation_x", 2);

    public PagingIndicator(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, 0);
        AnimatorSet animatorSet = new AnimatorSet();
        Resources resources = getResources();
        int[] iArr = AbstractC3996.f15426;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        AbstractC4345.m9881(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, getResources().getDimensionPixelOffset(R.dimen._2_res_0x7f07016d));
        this.f875 = dimensionPixelOffset;
        int i = dimensionPixelOffset * 2;
        this.f871 = i;
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, getResources().getDimensionPixelOffset(R.dimen._2_res_0x7f070169));
        this.f886 = dimensionPixelOffset2;
        int i2 = dimensionPixelOffset2 * 2;
        this.f872 = i2;
        this.f880 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, getResources().getDimensionPixelOffset(R.dimen._2_res_0x7f07016c));
        this.f888 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, getResources().getDimensionPixelOffset(R.dimen._2_res_0x7f070168));
        int color = typedArrayObtainStyledAttributes.getColor(3, getResources().getColor(R.color._2_res_0x7f0600e1));
        Paint paint = new Paint(1);
        this.f885 = paint;
        paint.setColor(color);
        this.f876 = typedArrayObtainStyledAttributes.getColor(0, getResources().getColor(R.color._2_res_0x7f0600df));
        if (this.f883 == null && typedArrayObtainStyledAttributes.hasValue(1)) {
            setArrowColor(typedArrayObtainStyledAttributes.getColor(1, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f881 = resources.getConfiguration().getLayoutDirection() == 0;
        int color2 = resources.getColor(R.color._2_res_0x7f0600e0);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen._2_res_0x7f07016b);
        this.f874 = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.f869 = paint2;
        float dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen._2_res_0x7f07016a);
        paint2.setShadowLayer(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color2);
        this.f884 = m871();
        this.f889 = new Rect(0, 0, this.f884.getWidth(), this.f884.getHeight());
        float f = i2;
        this.f873 = this.f884.getWidth() / f;
        AnimatorSet animatorSet2 = new AnimatorSet();
        C0148 c0148 = f868;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, c0148, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(167L);
        DecelerateInterpolator decelerateInterpolator = f867;
        objectAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        float f2 = i;
        C0148 c01482 = f865;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((Object) null, c01482, f2, f);
        objectAnimatorOfFloat2.setDuration(417L);
        objectAnimatorOfFloat2.setInterpolator(decelerateInterpolator);
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, m869());
        AnimatorSet animatorSet3 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat((Object) null, c0148, 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(167L);
        objectAnimatorOfFloat3.setInterpolator(decelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat((Object) null, c01482, f, f2);
        objectAnimatorOfFloat4.setDuration(417L);
        objectAnimatorOfFloat4.setInterpolator(decelerateInterpolator);
        animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, m869());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }

    private int getDesiredHeight() {
        return getPaddingBottom() + getPaddingTop() + this.f872 + this.f874;
    }

    private int getDesiredWidth() {
        return getPaddingRight() + getPaddingLeft() + getRequiredWidth();
    }

    private int getRequiredWidth() {
        return ((this.f877 - 3) * this.f880) + (this.f888 * 2) + (this.f875 * 2);
    }

    private void setSelectedPage(int i) {
        if (i == this.f887) {
            return;
        }
        this.f887 = i;
        m870();
    }

    public int[] getDotSelectedLeftX() {
        return this.f890;
    }

    public int[] getDotSelectedRightX() {
        return this.f870;
    }

    public int[] getDotSelectedX() {
        return this.f882;
    }

    public int getPageCount() {
        return this.f877;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f877; i++) {
            C0195 c0195 = this.f879[i];
            float f = c0195.f1193 + c0195.f1189;
            PagingIndicator pagingIndicator = c0195.f1187;
            canvas.drawCircle(f, pagingIndicator.f878, c0195.f1191, pagingIndicator.f885);
            if (c0195.f1190 > 0.0f) {
                Paint paint = pagingIndicator.f869;
                paint.setColor(c0195.f1185);
                canvas.drawCircle(f, pagingIndicator.f878, c0195.f1191, paint);
                Bitmap bitmap = pagingIndicator.f884;
                float f2 = c0195.f1192;
                float f3 = pagingIndicator.f878;
                canvas.drawBitmap(bitmap, pagingIndicator.f889, new Rect((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2)), pagingIndicator.f883);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i2));
        } else if (mode == 1073741824) {
            desiredHeight = View.MeasureSpec.getSize(i2);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i));
        } else if (mode2 == 1073741824) {
            desiredWidth = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 0;
        if (this.f881 != z) {
            this.f881 = z;
            this.f884 = m871();
            C0195[] c0195Arr = this.f879;
            if (c0195Arr != null) {
                for (C0195 c0195 : c0195Arr) {
                    c0195.f1194 = c0195.f1187.f881 ? 1.0f : -1.0f;
                }
            }
            m868();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        setMeasuredDimension(i, i2);
        m868();
    }

    public void setArrowBackgroundColor(int i) {
        this.f876 = i;
    }

    public void setArrowColor(int i) {
        if (this.f883 == null) {
            this.f883 = new Paint();
        }
        this.f883.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int i) {
        this.f885.setColor(i);
    }

    public void setPageCount(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The page count should be a positive integer");
        }
        this.f877 = i;
        this.f879 = new C0195[i];
        for (int i2 = 0; i2 < this.f877; i2++) {
            this.f879[i2] = new C0195(this);
        }
        m868();
        setSelectedPage(0);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m868() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i = (paddingLeft + width) / 2;
        int i2 = this.f877;
        int[] iArr = new int[i2];
        this.f882 = iArr;
        int[] iArr2 = new int[i2];
        this.f890 = iArr2;
        int[] iArr3 = new int[i2];
        this.f870 = iArr3;
        boolean z = this.f881;
        int i3 = this.f875;
        int i4 = this.f888;
        int i5 = this.f880;
        int i6 = 1;
        if (z) {
            int i7 = i - (requiredWidth / 2);
            iArr[0] = ((i7 + i3) - i5) + i4;
            iArr2[0] = i7 + i3;
            iArr3[0] = (i4 * 2) + ((i7 + i3) - (i5 * 2));
            while (i6 < this.f877) {
                int[] iArr4 = this.f882;
                int[] iArr5 = this.f890;
                int i8 = i6 - 1;
                iArr4[i6] = iArr5[i8] + i4;
                iArr5[i6] = iArr5[i8] + i5;
                this.f870[i6] = iArr4[i8] + i4;
                i6++;
            }
        } else {
            int i9 = (requiredWidth / 2) + i;
            iArr[0] = ((i9 - i3) + i5) - i4;
            iArr2[0] = i9 - i3;
            iArr3[0] = ((i5 * 2) + (i9 - i3)) - (i4 * 2);
            while (i6 < this.f877) {
                int[] iArr6 = this.f882;
                int[] iArr7 = this.f890;
                int i10 = i6 - 1;
                iArr6[i6] = iArr7[i10] - i4;
                iArr7[i6] = iArr7[i10] - i5;
                this.f870[i6] = iArr6[i10] - i4;
                i6++;
            }
        }
        this.f878 = paddingTop + this.f886;
        m870();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ObjectAnimator m869() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, f866, (-this.f888) + this.f880, 0.0f);
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setInterpolator(f867);
        return objectAnimatorOfFloat;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m870() {
        int i;
        int i2 = 0;
        while (true) {
            i = this.f887;
            if (i2 >= i) {
                break;
            }
            this.f879[i2].m984();
            C0195 c0195 = this.f879[i2];
            if (i2 != 0) {
                f = 1.0f;
            }
            c0195.f1188 = f;
            c0195.f1193 = this.f890[i2];
            i2++;
        }
        C0195 c01952 = this.f879[i];
        c01952.f1189 = 0.0f;
        c01952.f1193 = 0.0f;
        PagingIndicator pagingIndicator = c01952.f1187;
        c01952.f1186 = pagingIndicator.f872;
        float f = pagingIndicator.f886;
        c01952.f1191 = f;
        c01952.f1192 = f * pagingIndicator.f873;
        c01952.f1190 = 1.0f;
        c01952.m985();
        C0195[] c0195Arr = this.f879;
        int i3 = this.f887;
        C0195 c01953 = c0195Arr[i3];
        c01953.f1188 = i3 <= 0 ? 1.0f : -1.0f;
        c01953.f1193 = this.f882[i3];
        while (true) {
            i3++;
            if (i3 >= this.f877) {
                return;
            }
            this.f879[i3].m984();
            C0195 c01954 = this.f879[i3];
            c01954.f1188 = 1.0f;
            c01954.f1193 = this.f870[i3];
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Bitmap m871() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable._2_res_0x7f08018a);
        if (this.f881) {
            return bitmapDecodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, false);
    }
}
