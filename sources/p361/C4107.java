package p361;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: ᵔᵔ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4107 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public float f15873;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public float f15874;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public float f15875;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public float f15876;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ArrayList f15877 = new ArrayList();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ArrayList f15878 = new ArrayList();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public float f15879;

    public C4107() {
        m9423(0.0f, 270.0f, 0.0f);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9420(Matrix matrix, Path path) {
        ArrayList arrayList = this.f15877;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC4085) arrayList.get(i)).mo9373(matrix, path);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9421(float f, float f2) {
        C4102 c4102 = new C4102();
        c4102.f15833 = f;
        c4102.f15834 = f2;
        this.f15877.add(c4102);
        C4090 c4090 = new C4090(c4102, this.f15873, this.f15875);
        float fM9383 = c4090.m9383() + 270.0f;
        float fM93832 = c4090.m9383() + 270.0f;
        m9422(fM9383);
        this.f15878.add(c4090);
        this.f15879 = fM93832;
        this.f15873 = f;
        this.f15875 = f2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9422(float f) {
        float f2 = this.f15879;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f15873;
        float f5 = this.f15875;
        C4100 c4100 = new C4100(f4, f5, f4, f5);
        c4100.f15829 = this.f15879;
        c4100.f15830 = f3;
        this.f15878.add(new C4101(c4100));
        this.f15879 = f;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m9423(float f, float f2, float f3) {
        this.f15876 = f;
        this.f15873 = 0.0f;
        this.f15875 = f;
        this.f15879 = f2;
        this.f15874 = (f2 + f3) % 360.0f;
        this.f15877.clear();
        this.f15878.clear();
    }
}
