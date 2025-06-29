package p139;

import android.view.animation.AnimationUtils;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.util.ArrayList;
import java.util.Arrays;
import p389.C4509;
import p389.C4512;
import p389.C4513;
import ʻˉ.ᐧˋ;

/* renamed from: ˉˋ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2154 extends AbstractC2159 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f8434;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C4509 f8435;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* synthetic */ C2122 f8436;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f8437;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ᐧʻ f8439;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public ᐧˋ f8440;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long f8438 = -1;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f8441 = 0;

    public C2154(C2122 c2122) {
        this.f8436 = c2122;
        ᐧʻ r0 = new ᐧʻ((byte) 0, 6);
        long[] jArr = new long[20];
        r0.ˎˑ = jArr;
        r0.ᐧˋ = new float[20];
        r0.ˆʿ = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f8439 = r0;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m6070() {
        if (this.f8434) {
            m6071();
            this.f8435.m10272(this.f8436.f8459 + 1);
        } else {
            this.f8441 = 1;
            this.f8440 = null;
        }
    }

    @Override // p139.AbstractC2159, p139.InterfaceC2121
    /* renamed from: ˑʽ */
    public final void mo5990(AbstractC2160 abstractC2160) {
        this.f8437 = true;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m6071() {
        float fSqrt;
        int i;
        if (this.f8435 != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f = this.f8438;
        ᐧʻ r4 = this.f8439;
        int i2 = (r4.ˆʿ + 1) % 20;
        r4.ˆʿ = i2;
        ((long[]) r4.ˎˑ)[i2] = jCurrentAnimationTimeMillis;
        ((float[]) r4.ᐧˋ)[i2] = f;
        C4513 c4513 = new C4513();
        float f2 = 0.0f;
        c4513.f17372 = 0.0f;
        this.f8435 = new C4509(c4513);
        C4512 c4512 = new C4512();
        c4512.m10277(1.0f);
        c4512.m10275(200.0f);
        C4509 c4509 = this.f8435;
        c4509.f17344 = c4512;
        c4509.f17340 = this.f8438;
        c4509.f17348 = true;
        if (c4509.f17350) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = c4509.f17343;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        C4509 c45092 = this.f8435;
        int i3 = r4.ˆʿ;
        long[] jArr = (long[]) r4.ˎˑ;
        long j = Long.MIN_VALUE;
        if (i3 != 0 || jArr[i3] != Long.MIN_VALUE) {
            long j2 = jArr[i3];
            int i4 = 0;
            long j3 = j2;
            while (true) {
                long j4 = jArr[i3];
                if (j4 == j) {
                    break;
                }
                float f3 = j2 - j4;
                float fAbs = Math.abs(j4 - j3);
                if (f3 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i3 == 0) {
                    i3 = 20;
                }
                i3--;
                i4++;
                if (i4 >= 20) {
                    break;
                }
                j3 = j4;
                j = Long.MIN_VALUE;
            }
            if (i4 >= 2) {
                float[] fArr = (float[]) r4.ᐧˋ;
                if (i4 == 2) {
                    int i5 = r4.ˆʿ;
                    int i6 = i5 == 0 ? 19 : i5 - 1;
                    float f4 = jArr[i5] - jArr[i6];
                    if (f4 != 0.0f) {
                        fSqrt = (fArr[i5] - fArr[i6]) / f4;
                    }
                } else {
                    int i7 = r4.ˆʿ;
                    int i8 = ((i7 - i4) + 21) % 20;
                    int i9 = (i7 + 21) % 20;
                    long j5 = jArr[i8];
                    float f5 = fArr[i8];
                    int i10 = i8 + 1;
                    int i11 = i10 % 20;
                    float f6 = 0.0f;
                    while (i11 != i9) {
                        long j6 = jArr[i11];
                        float[] fArr2 = fArr;
                        float f7 = j6 - j5;
                        if (f7 == f2) {
                            i = i10;
                        } else {
                            float f8 = fArr2[i11];
                            int i12 = i10;
                            float f9 = (f8 - f5) / f7;
                            float fAbs2 = (Math.abs(f9) * (f9 - ((float) (Math.sqrt(2.0f * Math.abs(f6)) * Math.signum(f6))))) + f6;
                            i = i12;
                            if (i11 == i) {
                                fAbs2 *= 0.5f;
                            }
                            f6 = fAbs2;
                            f5 = f8;
                            j5 = j6;
                        }
                        i11 = (i11 + 1) % 20;
                        i10 = i;
                        fArr = fArr2;
                        f2 = 0.0f;
                    }
                    fSqrt = (float) (Math.sqrt(Math.abs(f6) * 2.0f) * Math.signum(f6));
                }
                f2 = fSqrt * 1000.0f;
            }
        }
        c45092.f17349 = f2;
        C4509 c45093 = this.f8435;
        c45093.f17351 = this.f8436.f8459 + 1;
        c45093.f17347 = -1.0f;
        c45093.f17342 = 4.0f;
        C2149 c2149 = new C2149(this);
        ArrayList arrayList2 = c45093.f17345;
        if (arrayList2.contains(c2149)) {
            return;
        }
        arrayList2.add(c2149);
    }
}
