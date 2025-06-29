package p371;

import android.graphics.Color;

/* renamed from: ᵢʿ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4213 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float f16239;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float f16240;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final float f16241;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float f16242;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final float f16243;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float f16244;

    public C4213(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f16242 = f;
        this.f16239 = f2;
        this.f16241 = f3;
        this.f16244 = f4;
        this.f16240 = f5;
        this.f16243 = f6;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C4213 m9661(float f, float f2, float f3) {
        C4209 c4209 = C4209.f16227;
        float f4 = c4209.f16236;
        Math.sqrt(f / 100.0d);
        float f5 = c4209.f16233 + 4.0f;
        float f6 = c4209.f16237 * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * c4209.f16236) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new C4213(f3, f2, f, f7, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C4213 m9662(int i) {
        C4209 c4209 = C4209.f16227;
        float fM9651 = AbstractC4205.m9651(Color.red(i));
        float fM96512 = AbstractC4205.m9651(Color.green(i));
        float fM96513 = AbstractC4205.m9651(Color.blue(i));
        float[][] fArr = AbstractC4205.f16220;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM96513) + (fArr2[1] * fM96512) + (fArr2[0] * fM9651);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM96513) + (fArr3[1] * fM96512) + (fArr3[0] * fM9651);
        float[] fArr4 = fArr[2];
        float f3 = (fM96513 * fArr4[2]) + (fM96512 * fArr4[1]) + (fM9651 * fArr4[0]);
        float[][] fArr5 = AbstractC4205.f16217;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = c4209.f16235;
        float f7 = fArr9[0] * f4;
        float f8 = fArr9[1] * f5;
        float f9 = fArr9[2] * f6;
        float fAbs = Math.abs(f7);
        float f10 = c4209.f16231;
        float fPow = (float) Math.pow((fAbs * f10) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f8) * f10) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f9) * f10) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f7) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f8) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f9) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f11 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d)) / 11.0f;
        float f12 = ((float) ((fSignum + fSignum2) - (d * 2.0d))) / 9.0f;
        float f13 = fSignum2 * 20.0f;
        float f14 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f13)) / 20.0f;
        float f15 = (((fSignum * 40.0f) + f13) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f16 = fAtan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float f18 = f15 * c4209.f16228;
        float f19 = c4209.f16233;
        float f20 = c4209.f16236;
        float fPow4 = ((float) Math.pow(f18 / f19, c4209.f16230 * f20)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f21 = f19 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c4209.f16234), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f16) < 20.14d ? 360.0f + f16 : f16) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c4209.f16229) * c4209.f16232) * ((float) Math.sqrt((f12 * f12) + (f11 * f11)))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float f22 = c4209.f16237 * fPow5;
        Math.sqrt((r3 * f20) / f21);
        float f23 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f22 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f17;
        return new C4213(f16, fPow5, fPow4, f23, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m9663(p371.C4209 r17) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p371.C4213.m9663(ᵢʿ.ˋⁱ):int");
    }
}
