package p361;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p086.C1730;

/* renamed from: ᵔᵔ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4090 extends AbstractC4088 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float f15783;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4102 f15784;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float f15785;

    public C4090(C4102 c4102, float f, float f2) {
        this.f15784 = c4102;
        this.f15785 = f;
        this.f15783 = f2;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float m9383() {
        C4102 c4102 = this.f15784;
        return (float) Math.toDegrees(Math.atan((c4102.f15834 - this.f15783) / (c4102.f15833 - this.f15785)));
    }

    @Override // p361.AbstractC4088
    /* renamed from: ـﹶ */
    public final void mo9376(Matrix matrix, C1730 c1730, int i, Canvas canvas) {
        C4102 c4102 = this.f15784;
        float f = c4102.f15834;
        float f2 = this.f15783;
        float f3 = c4102.f15833;
        float f4 = this.f15785;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f15770;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m9383());
        c1730.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = C1730.f6730;
        iArr[0] = c1730.f6736;
        iArr[1] = c1730.f6732;
        iArr[2] = c1730.f6738;
        Paint paint = c1730.f6734;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C1730.f6727, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }
}
