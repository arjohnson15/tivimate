package p080;

import java.util.Arrays;
import p331.C3762;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʿˏ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1701 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1698 f6643;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3762 f6647;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f6648 = 0;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f6651 = 8;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int[] f6644 = new int[8];

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int[] f6649 = new int[8];

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public float[] f6650 = new float[8];

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f6646 = -1;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f6652 = -1;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f6645 = false;

    public C1701(C1698 c1698, C3762 c3762) {
        this.f6643 = c1698;
        this.f6647 = c3762;
    }

    public final String toString() {
        int i = this.f6646;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f6648; i2++) {
            StringBuilder sbM5407 = AbstractC1702.m5407(ᐧʻ.ˉⁱ(string, " -> "));
            sbM5407.append(this.f6650[i]);
            sbM5407.append(" : ");
            StringBuilder sbM54072 = AbstractC1702.m5407(sbM5407.toString());
            sbM54072.append(((C1703[]) this.f6647.f14532)[this.f6644[i]]);
            string = sbM54072.toString();
            i = this.f6649[i];
        }
        return string;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5399() {
        int i = this.f6646;
        for (int i2 = 0; i != -1 && i2 < this.f6648; i2++) {
            C1703 c1703 = ((C1703[]) this.f6647.f14532)[this.f6644[i]];
            if (c1703 != null) {
                c1703.m5412(this.f6643);
            }
            i = this.f6649[i];
        }
        this.f6646 = -1;
        this.f6652 = -1;
        this.f6645 = false;
        this.f6648 = 0;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1703 m5400(int i) {
        int i2 = this.f6646;
        for (int i3 = 0; i2 != -1 && i3 < this.f6648; i3++) {
            if (i3 == i) {
                return ((C1703[]) this.f6647.f14532)[this.f6644[i2]];
            }
            i2 = this.f6649[i2];
        }
        return null;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final float m5401(C1703 c1703, boolean z) {
        int i = this.f6646;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f6648) {
            if (this.f6644[i] == c1703.f6655) {
                if (i == this.f6646) {
                    this.f6646 = this.f6649[i];
                } else {
                    int[] iArr = this.f6649;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c1703.m5412(this.f6643);
                }
                c1703.f6665--;
                this.f6648--;
                this.f6644[i] = -1;
                if (this.f6645) {
                    this.f6652 = i;
                }
                return this.f6650[i];
            }
            i2++;
            i3 = i;
            i = this.f6649[i];
        }
        return 0.0f;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final float m5402(C1703 c1703) {
        int i = this.f6646;
        for (int i2 = 0; i != -1 && i2 < this.f6648; i2++) {
            if (this.f6644[i] == c1703.f6655) {
                return this.f6650[i];
            }
            i = this.f6649[i];
        }
        return 0.0f;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5403(C1703 c1703, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f6646;
            C1698 c1698 = this.f6643;
            if (i == -1) {
                this.f6646 = 0;
                this.f6650[0] = f;
                this.f6644[0] = c1703.f6655;
                this.f6649[0] = -1;
                c1703.f6665++;
                c1703.m5415(c1698);
                this.f6648++;
                if (this.f6645) {
                    return;
                }
                int i2 = this.f6652 + 1;
                this.f6652 = i2;
                int[] iArr = this.f6644;
                if (i2 >= iArr.length) {
                    this.f6645 = true;
                    this.f6652 = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f6648; i4++) {
                int i5 = this.f6644[i];
                int i6 = c1703.f6655;
                if (i5 == i6) {
                    float[] fArr = this.f6650;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f6646) {
                            this.f6646 = this.f6649[i];
                        } else {
                            int[] iArr2 = this.f6649;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c1703.m5412(c1698);
                        }
                        if (this.f6645) {
                            this.f6652 = i;
                        }
                        c1703.f6665--;
                        this.f6648--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f6649[i];
            }
            int length = this.f6652;
            int i7 = length + 1;
            if (this.f6645) {
                int[] iArr3 = this.f6644;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f6644;
            if (length >= iArr4.length && this.f6648 < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f6644;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f6644;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f6651 * 2;
                this.f6651 = i9;
                this.f6645 = false;
                this.f6652 = length - 1;
                this.f6650 = Arrays.copyOf(this.f6650, i9);
                this.f6644 = Arrays.copyOf(this.f6644, this.f6651);
                this.f6649 = Arrays.copyOf(this.f6649, this.f6651);
            }
            this.f6644[length] = c1703.f6655;
            this.f6650[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f6649;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f6649[length] = this.f6646;
                this.f6646 = length;
            }
            c1703.f6665++;
            c1703.m5415(c1698);
            this.f6648++;
            if (!this.f6645) {
                this.f6652++;
            }
            int i10 = this.f6652;
            int[] iArr8 = this.f6644;
            if (i10 >= iArr8.length) {
                this.f6645 = true;
                this.f6652 = iArr8.length - 1;
            }
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final float m5404(int i) {
        int i2 = this.f6646;
        for (int i3 = 0; i2 != -1 && i3 < this.f6648; i3++) {
            if (i3 == i) {
                return this.f6650[i2];
            }
            i2 = this.f6649[i2];
        }
        return 0.0f;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m5405(C1703 c1703, float f) {
        if (f == 0.0f) {
            m5401(c1703, true);
            return;
        }
        int i = this.f6646;
        C1698 c1698 = this.f6643;
        if (i == -1) {
            this.f6646 = 0;
            this.f6650[0] = f;
            this.f6644[0] = c1703.f6655;
            this.f6649[0] = -1;
            c1703.f6665++;
            c1703.m5415(c1698);
            this.f6648++;
            if (this.f6645) {
                return;
            }
            int i2 = this.f6652 + 1;
            this.f6652 = i2;
            int[] iArr = this.f6644;
            if (i2 >= iArr.length) {
                this.f6645 = true;
                this.f6652 = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f6648; i4++) {
            int i5 = this.f6644[i];
            int i6 = c1703.f6655;
            if (i5 == i6) {
                this.f6650[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f6649[i];
        }
        int length = this.f6652;
        int i7 = length + 1;
        if (this.f6645) {
            int[] iArr2 = this.f6644;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f6644;
        if (length >= iArr3.length && this.f6648 < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f6644;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f6644;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f6651 * 2;
            this.f6651 = i9;
            this.f6645 = false;
            this.f6652 = length - 1;
            this.f6650 = Arrays.copyOf(this.f6650, i9);
            this.f6644 = Arrays.copyOf(this.f6644, this.f6651);
            this.f6649 = Arrays.copyOf(this.f6649, this.f6651);
        }
        this.f6644[length] = c1703.f6655;
        this.f6650[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f6649;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f6649[length] = this.f6646;
            this.f6646 = length;
        }
        c1703.f6665++;
        c1703.m5415(c1698);
        int i10 = this.f6648 + 1;
        this.f6648 = i10;
        if (!this.f6645) {
            this.f6652++;
        }
        int[] iArr7 = this.f6644;
        if (i10 >= iArr7.length) {
            this.f6645 = true;
        }
        if (this.f6652 >= iArr7.length) {
            this.f6645 = true;
            this.f6652 = iArr7.length - 1;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m5406() {
        return this.f6648;
    }
}
