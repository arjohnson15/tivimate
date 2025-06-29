package p080;

import java.util.Arrays;
import p331.C3767;
import ʽᵔ.ʽⁱ;

/* renamed from: ʿˏ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1699 extends C1698 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f6622;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C1703[] f6623;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C1703[] f6624;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C3767 f6625;

    @Override // p080.C1698
    public final String toString() {
        String str = " goal -> (" + this.f6617 + ") : ";
        for (int i = 0; i < this.f6622; i++) {
            C1703 c1703 = this.f6623[i];
            C3767 c3767 = this.f6625;
            c3767.f14557 = c1703;
            str = str + c3767 + " ";
        }
        return str;
    }

    @Override // p080.C1698
    /* renamed from: ʿʼ */
    public final boolean mo5369() {
        return this.f6622 == 0;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m5377(C1703 c1703) {
        int i;
        int i2 = this.f6622 + 1;
        C1703[] c1703Arr = this.f6623;
        if (i2 > c1703Arr.length) {
            C1703[] c1703Arr2 = (C1703[]) Arrays.copyOf(c1703Arr, c1703Arr.length * 2);
            this.f6623 = c1703Arr2;
            this.f6624 = (C1703[]) Arrays.copyOf(c1703Arr2, c1703Arr2.length * 2);
        }
        C1703[] c1703Arr3 = this.f6623;
        int i3 = this.f6622;
        c1703Arr3[i3] = c1703;
        int i4 = i3 + 1;
        this.f6622 = i4;
        if (i4 > 1 && c1703Arr3[i3].f6655 > c1703.f6655) {
            int i5 = 0;
            while (true) {
                i = this.f6622;
                if (i5 >= i) {
                    break;
                }
                this.f6624[i5] = this.f6623[i5];
                i5++;
            }
            Arrays.sort(this.f6624, 0, i, new ʽⁱ(5));
            for (int i6 = 0; i6 < this.f6622; i6++) {
                this.f6623[i6] = this.f6624[i6];
            }
        }
        c1703.f6661 = true;
        c1703.m5415(this);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m5378(C1703 c1703) {
        int i = 0;
        while (i < this.f6622) {
            if (this.f6623[i] == c1703) {
                while (true) {
                    int i2 = this.f6622;
                    if (i >= i2 - 1) {
                        this.f6622 = i2 - 1;
                        c1703.f6661 = false;
                        return;
                    } else {
                        C1703[] c1703Arr = this.f6623;
                        int i3 = i + 1;
                        c1703Arr[i] = c1703Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p080.C1698
    /* renamed from: ﹳﹳ */
    public final C1703 mo5375(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f6622; i2++) {
            C1703[] c1703Arr = this.f6623;
            C1703 c1703 = c1703Arr[i2];
            if (!zArr[c1703.f6655]) {
                C3767 c3767 = this.f6625;
                c3767.f14557 = c1703;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((C1703) c3767.f14557).f6657[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C1703 c17032 = c1703Arr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = c17032.f6657[i3];
                            float f3 = ((C1703) c3767.f14557).f6657[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f6623[i];
    }

    @Override // p080.C1698
    /* renamed from: ﹶˆ */
    public final void mo5376(C1700 c1700, C1698 c1698, boolean z) {
        C1703 c1703 = c1698.f6620;
        if (c1703 == null) {
            return;
        }
        C1701 c1701 = c1698.f6621;
        int iM5406 = c1701.m5406();
        for (int i = 0; i < iM5406; i++) {
            C1703 c1703M5400 = c1701.m5400(i);
            float fM5404 = c1701.m5404(i);
            C3767 c3767 = this.f6625;
            c3767.f14557 = c1703M5400;
            boolean z2 = c1703M5400.f6661;
            float[] fArr = c1703.f6657;
            if (z2) {
                boolean z3 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C1703) c3767.f14557).f6657;
                    float f = (fArr[i2] * fM5404) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C1703) c3767.f14557).f6657[i2] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    ((C1699) c3767.f14558).m5378((C1703) c3767.f14557);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM5404;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C1703) c3767.f14557).f6657[i3] = f3;
                    } else {
                        ((C1703) c3767.f14557).f6657[i3] = 0.0f;
                    }
                }
                m5377(c1703M5400);
            }
            this.f6617 = (c1698.f6617 * fM5404) + this.f6617;
        }
        m5378(c1703);
    }
}
