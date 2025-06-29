package p421;

import android.graphics.Path;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.play_billing.ˎˑ;

/* renamed from: ﹳﹶ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4857 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float[] f18357;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public char f18358;

    public C4857(char c, float[] fArr) {
        this.f18358 = c;
        this.f18357 = fArr;
    }

    public C4857(C4857 c4857) {
        this.f18358 = c4857.f18358;
        float[] fArr = c4857.f18357;
        this.f18357 = ˎˑ.ٴˎ(fArr, fArr.length);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m10918(C4857[] c4857Arr, Path path) {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        C4857 c4857;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        C4857[] c4857Arr2 = c4857Arr;
        float[] fArr = new float[6];
        int length = c4857Arr2.length;
        char c2 = 'm';
        int i5 = 0;
        while (i5 < length) {
            C4857 c48572 = c4857Arr2[i5];
            char c3 = c48572.f18358;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case ModuleDescriptor.MODULE_VERSION /* 122 */:
                    path.close();
                    path.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                default:
                    i = 2;
                    break;
            }
            float f19 = f17;
            float f20 = f18;
            float f21 = f13;
            float f22 = f14;
            int i6 = 0;
            while (true) {
                float[] fArr2 = c48572.f18357;
                if (i6 < fArr2.length) {
                    if (c3 != 'A') {
                        if (c3 != 'C') {
                            if (c3 == 'H') {
                                i2 = i6;
                                c = c3;
                                i3 = i5;
                                i4 = length;
                                c4857 = c48572;
                                path.lineTo(fArr2[i2], f22);
                                f21 = fArr2[i2];
                            } else if (c3 == 'Q') {
                                i2 = i6;
                                c = c3;
                                i3 = i5;
                                i4 = length;
                                c4857 = c48572;
                                float f23 = fArr2[i2];
                                int i7 = i2 + 1;
                                float f24 = fArr2[i7];
                                int i8 = i2 + 2;
                                int i9 = i2 + 3;
                                path.quadTo(f23, f24, fArr2[i8], fArr2[i9]);
                                f = fArr2[i2];
                                f2 = fArr2[i7];
                                f21 = fArr2[i8];
                                f22 = fArr2[i9];
                            } else if (c3 == 'V') {
                                i2 = i6;
                                c = c3;
                                i3 = i5;
                                i4 = length;
                                c4857 = c48572;
                                path.lineTo(f21, fArr2[i2]);
                                f22 = fArr2[i2];
                            } else if (c3 != 'a') {
                                if (c3 != 'c') {
                                    if (c3 != 'h') {
                                        if (c3 == 'q') {
                                            i2 = i6;
                                            float f25 = f22;
                                            float f26 = f21;
                                            int i10 = i2 + 1;
                                            int i11 = i2 + 2;
                                            int i12 = i2 + 3;
                                            path.rQuadTo(fArr2[i2], fArr2[i10], fArr2[i11], fArr2[i12]);
                                            float f27 = f26 + fArr2[i2];
                                            float f28 = fArr2[i10] + f25;
                                            float f29 = f26 + fArr2[i11];
                                            f22 = f25 + fArr2[i12];
                                            f16 = f28;
                                            f15 = f27;
                                            c = c3;
                                            i3 = i5;
                                            i4 = length;
                                            f21 = f29;
                                        } else if (c3 == 'v') {
                                            i2 = i6;
                                            path.rLineTo(0.0f, fArr2[i2]);
                                            f22 += fArr2[i2];
                                        } else if (c3 == 'L') {
                                            i2 = i6;
                                            int i13 = i2 + 1;
                                            path.lineTo(fArr2[i2], fArr2[i13]);
                                            f21 = fArr2[i2];
                                            f22 = fArr2[i13];
                                        } else if (c3 == 'M') {
                                            i2 = i6;
                                            f21 = fArr2[i2];
                                            f22 = fArr2[i2 + 1];
                                            if (i2 > 0) {
                                                path.lineTo(f21, f22);
                                            } else {
                                                path.moveTo(f21, f22);
                                                f20 = f22;
                                                f19 = f21;
                                            }
                                        } else if (c3 == 'S') {
                                            i2 = i6;
                                            float f30 = f22;
                                            float f31 = f21;
                                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                f7 = (f30 * 2.0f) - f16;
                                                f8 = (f31 * 2.0f) - f15;
                                            } else {
                                                f8 = f31;
                                                f7 = f30;
                                            }
                                            int i14 = i2 + 1;
                                            int i15 = i2 + 2;
                                            int i16 = i2 + 3;
                                            path.cubicTo(f8, f7, fArr2[i2], fArr2[i14], fArr2[i15], fArr2[i16]);
                                            float f32 = fArr2[i2];
                                            float f33 = fArr2[i14];
                                            f21 = fArr2[i15];
                                            f22 = fArr2[i16];
                                            f16 = f33;
                                            f15 = f32;
                                        } else if (c3 == 'T') {
                                            i2 = i6;
                                            float f34 = f22;
                                            float f35 = f21;
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f3 = (f35 * 2.0f) - f15;
                                                f4 = (f34 * 2.0f) - f16;
                                            } else {
                                                f3 = f35;
                                                f4 = f34;
                                            }
                                            int i17 = i2 + 1;
                                            path.quadTo(f3, f4, fArr2[i2], fArr2[i17]);
                                            f5 = fArr2[i2];
                                            f6 = fArr2[i17];
                                        } else if (c3 == 'l') {
                                            i2 = i6;
                                            int i18 = i2 + 1;
                                            path.rLineTo(fArr2[i2], fArr2[i18]);
                                            f21 += fArr2[i2];
                                            f22 += fArr2[i18];
                                        } else if (c3 == 'm') {
                                            i2 = i6;
                                            float f36 = fArr2[i2];
                                            f21 += f36;
                                            float f37 = fArr2[i2 + 1];
                                            f22 += f37;
                                            if (i2 > 0) {
                                                path.rLineTo(f36, f37);
                                            } else {
                                                path.rMoveTo(f36, f37);
                                                f20 = f22;
                                                f19 = f21;
                                            }
                                        } else if (c3 == 's') {
                                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                float f38 = f21 - f15;
                                                f9 = f22 - f16;
                                                f10 = f38;
                                            } else {
                                                f9 = 0.0f;
                                                f10 = 0.0f;
                                            }
                                            int i19 = i6 + 1;
                                            int i20 = i6 + 2;
                                            int i21 = i6 + 3;
                                            i2 = i6;
                                            float f39 = f22;
                                            float f40 = f21;
                                            path.rCubicTo(f10, f9, fArr2[i6], fArr2[i19], fArr2[i20], fArr2[i21]);
                                            f3 = f40 + fArr2[i2];
                                            f4 = f39 + fArr2[i19];
                                            f5 = f40 + fArr2[i20];
                                            f6 = fArr2[i21] + f39;
                                        } else if (c3 != 't') {
                                            i2 = i6;
                                        } else {
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f11 = f21 - f15;
                                                f12 = f22 - f16;
                                            } else {
                                                f12 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            int i22 = i6 + 1;
                                            path.rQuadTo(f11, f12, fArr2[i6], fArr2[i22]);
                                            float f41 = f11 + f21;
                                            float f42 = f12 + f22;
                                            f21 += fArr2[i6];
                                            f22 += fArr2[i22];
                                            f16 = f42;
                                            i2 = i6;
                                            c = c3;
                                            i3 = i5;
                                            i4 = length;
                                            f15 = f41;
                                        }
                                        c4857 = c48572;
                                    } else {
                                        i2 = i6;
                                        path.rLineTo(fArr2[i2], 0.0f);
                                        f21 += fArr2[i2];
                                    }
                                    c = c3;
                                    i3 = i5;
                                    i4 = length;
                                    c4857 = c48572;
                                } else {
                                    i2 = i6;
                                    float f43 = f22;
                                    float f44 = f21;
                                    int i23 = i2 + 2;
                                    int i24 = i2 + 3;
                                    int i25 = i2 + 4;
                                    int i26 = i2 + 5;
                                    path.rCubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i23], fArr2[i24], fArr2[i25], fArr2[i26]);
                                    f3 = f44 + fArr2[i23];
                                    f4 = f43 + fArr2[i24];
                                    f5 = f44 + fArr2[i25];
                                    f6 = fArr2[i26] + f43;
                                }
                                f16 = f4;
                                f15 = f3;
                                c = c3;
                                i3 = i5;
                                i4 = length;
                                f21 = f5;
                                f22 = f6;
                                c4857 = c48572;
                            } else {
                                i2 = i6;
                                float f45 = f22;
                                float f46 = f21;
                                int i27 = i2 + 5;
                                int i28 = i2 + 6;
                                c = c3;
                                i4 = length;
                                c4857 = c48572;
                                i3 = i5;
                                m10919(path, f46, f45, fArr2[i27] + f46, fArr2[i28] + f45, fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                                f21 = f46 + fArr2[i27];
                                f22 = f45 + fArr2[i28];
                            }
                            i6 = i2 + i;
                            c48572 = c4857;
                            length = i4;
                            c2 = c;
                            c3 = c2;
                            i5 = i3;
                        } else {
                            i2 = i6;
                            c = c3;
                            i3 = i5;
                            i4 = length;
                            c4857 = c48572;
                            int i29 = i2 + 2;
                            int i30 = i2 + 3;
                            int i31 = i2 + 4;
                            int i32 = i2 + 5;
                            path.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i29], fArr2[i30], fArr2[i31], fArr2[i32]);
                            f21 = fArr2[i31];
                            f22 = fArr2[i32];
                            f = fArr2[i29];
                            f2 = fArr2[i30];
                        }
                        f15 = f;
                        f16 = f2;
                        i6 = i2 + i;
                        c48572 = c4857;
                        length = i4;
                        c2 = c;
                        c3 = c2;
                        i5 = i3;
                    } else {
                        i2 = i6;
                        c = c3;
                        i3 = i5;
                        i4 = length;
                        c4857 = c48572;
                        int i33 = i2 + 5;
                        int i34 = i2 + 6;
                        m10919(path, f21, f22, fArr2[i33], fArr2[i34], fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                        f21 = fArr2[i33];
                        f22 = fArr2[i34];
                    }
                    f16 = f22;
                    f15 = f21;
                    i6 = i2 + i;
                    c48572 = c4857;
                    length = i4;
                    c2 = c;
                    c3 = c2;
                    i5 = i3;
                }
            }
            fArr[0] = f21;
            fArr[1] = f22;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f19;
            fArr[5] = f20;
            c2 = c48572.f18358;
            i5++;
            c4857Arr2 = c4857Arr;
            length = length;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m10919(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = (d4 * dSin) + (d3 * dCos);
        double d6 = d3;
        double d7 = f5;
        double d8 = d5 / d7;
        double d9 = f6;
        double d10 = ((d4 * dCos) + ((-f) * dSin)) / d9;
        double d11 = d4;
        double d12 = f4;
        double d13 = ((d12 * dSin) + (f3 * dCos)) / d7;
        double d14 = ((d12 * dCos) + ((-f3) * dSin)) / d9;
        double d15 = d8 - d13;
        double d16 = d10 - d14;
        double d17 = (d8 + d13) / 2.0d;
        double d18 = (d10 + d14) / 2.0d;
        double d19 = (d16 * d16) + (d15 * d15);
        if (d19 == 0.0d) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            String str = "Points are too far apart " + d19;
            float fSqrt = (float) (Math.sqrt(d19) / 1.99999d);
            m10919(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
            return;
        }
        double dSqrt = Math.sqrt(d20);
        double d21 = d15 * dSqrt;
        double d22 = dSqrt * d16;
        if (z == z2) {
            d = d17 - d22;
            d2 = d18 + d21;
        } else {
            d = d17 + d22;
            d2 = d18 - d21;
        }
        double dAtan2 = Math.atan2(d10 - d2, d8 - d);
        double dAtan22 = Math.atan2(d14 - d2, d13 - d) - dAtan2;
        int i = 0;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d23 = d * d7;
        double d24 = d2 * d9;
        double d25 = (d23 * dCos) - (d24 * dSin);
        double d26 = (d24 * dCos) + (d23 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d27 = -d7;
        double d28 = d27 * dCos2;
        double d29 = d9 * dSin2;
        double d30 = (d28 * dSin3) - (d29 * dCos3);
        double d31 = d27 * dSin2;
        double d32 = d9 * dCos2;
        double d33 = (dCos3 * d32) + (dSin3 * d31);
        double d34 = dAtan22 / iCeil;
        double d35 = dAtan2;
        while (i < iCeil) {
            double d36 = d35 + d34;
            double dSin4 = Math.sin(d36);
            double dCos4 = Math.cos(d36);
            double d37 = d34;
            double d38 = (((d7 * dCos2) * dCos4) + d25) - (d29 * dSin4);
            double d39 = d25;
            double d40 = (d32 * dSin4) + (d7 * dSin2 * dCos4) + d26;
            double d41 = (d28 * dSin4) - (d29 * dCos4);
            double d42 = (dCos4 * d32) + (dSin4 * d31);
            double d43 = d36 - d35;
            double dTan = Math.tan(d43 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d43)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d30 * dSqrt2) + d6), (float) ((d33 * dSqrt2) + d11), (float) (d38 - (dSqrt2 * d41)), (float) (d40 - (dSqrt2 * d42)), (float) d38, (float) d40);
            i++;
            d32 = d32;
            d31 = d31;
            iCeil = iCeil;
            dCos2 = dCos2;
            d35 = d36;
            d7 = d7;
            d33 = d42;
            d30 = d41;
            d6 = d38;
            d11 = d40;
            d34 = d37;
            d25 = d39;
        }
    }
}
