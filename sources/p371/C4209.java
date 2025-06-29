package p371;

/* renamed from: ᵢʿ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4209 {

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final C4209 f16227;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float f16228;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float f16229;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final float f16230;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final float f16231;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final float f16232;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float f16233;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final float f16234;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final float[] f16235;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float f16236;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final float f16237;

    static {
        float[] fArr = AbstractC4205.f16216;
        float fM9647 = (float) ((AbstractC4205.m9647() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC4205.f16217;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM9647) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp};
        float f10 = 1.0f / ((5.0f * fM9647) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float fCbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(fM9647 * 5.0d))) + (f11 * fM9647);
        float fM96472 = AbstractC4205.m9647() / fArr[1];
        double d2 = fM96472;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * fCbrt) * f8) / 100.0d, 0.42d)};
        float f13 = fArr7[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr7[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[2];
        float[] fArr8 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        f16227 = new C4209(fM96472, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f9, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public C4209(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f16234 = f;
        this.f16233 = f2;
        this.f16228 = f3;
        this.f16232 = f4;
        this.f16236 = f5;
        this.f16229 = f6;
        this.f16235 = fArr;
        this.f16231 = f7;
        this.f16237 = f8;
        this.f16230 = f9;
    }
}
