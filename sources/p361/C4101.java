package p361;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p086.C1730;

/* renamed from: ᵔᵔ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4101 extends AbstractC4088 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4100 f15832;

    public C4101(C4100 c4100) {
        this.f15832 = c4100;
    }

    @Override // p361.AbstractC4088
    /* renamed from: ـﹶ */
    public final void mo9376(Matrix matrix, C1730 c1730, int i, Canvas canvas) {
        C4100 c4100 = this.f15832;
        float f = c4100.f15829;
        float f2 = c4100.f15830;
        RectF rectF = new RectF(c4100.f15826, c4100.f15828, c4100.f15831, c4100.f15827);
        c1730.getClass();
        boolean z = f2 < 0.0f;
        Path path = c1730.f6737;
        int[] iArr = C1730.f6729;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c1730.f6736;
            iArr[2] = c1730.f6732;
            iArr[3] = c1730.f6738;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c1730.f6738;
            iArr[2] = c1730.f6732;
            iArr[3] = c1730.f6736;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = C1730.f6728;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = c1730.f6731;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c1730.f6733);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
