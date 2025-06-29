package p361;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: ᵔᵔ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4100 extends AbstractC4085 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final RectF f15825 = new RectF();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float f15826;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float f15827;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final float f15828;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public float f15829;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public float f15830;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float f15831;

    public C4100(float f, float f2, float f3, float f4) {
        this.f15826 = f;
        this.f15828 = f2;
        this.f15831 = f3;
        this.f15827 = f4;
    }

    @Override // p361.AbstractC4085
    /* renamed from: ـﹶ */
    public final void mo9373(Matrix matrix, Path path) {
        Matrix matrix2 = this.f15755;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f15825;
        rectF.set(this.f15826, this.f15828, this.f15831, this.f15827);
        path.arcTo(rectF, this.f15829, this.f15830, false);
        path.transform(matrix);
    }
}
