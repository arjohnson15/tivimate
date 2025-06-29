package p361;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: ᵔᵔ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4102 extends AbstractC4085 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public float f15833;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public float f15834;

    @Override // p361.AbstractC4085
    /* renamed from: ـﹶ */
    public final void mo9373(Matrix matrix, Path path) {
        Matrix matrix2 = this.f15755;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f15833, this.f15834);
        path.transform(matrix);
    }
}
