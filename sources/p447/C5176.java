package p447;

import p080.AbstractC1702;
import p080.C1698;
import p080.C1700;
import p080.C1703;
import ˆʽ.ᵎˏ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﾞˊ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5176 extends AbstractC5172 {

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public boolean f19888;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public int f19889;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public int f19890;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public boolean f19891;

    @Override // p447.C5171
    public final String toString() {
        String string = ᵎˏ.ˎٴ(new StringBuilder("[Barrier] "), this.f19811, " {");
        for (int i = 0; i < this.f19841; i++) {
            C5171 c5171 = this.f19840[i];
            if (i > 0) {
                string = ᐧʻ.ˉⁱ(string, ", ");
            }
            StringBuilder sbM5407 = AbstractC1702.m5407(string);
            sbM5407.append(c5171.f19811);
            string = sbM5407.toString();
        }
        return ᐧʻ.ˉⁱ(string, "}");
    }

    @Override // p447.C5171
    /* renamed from: ʽᐧ */
    public final void mo11475(C1700 c1700, boolean z) {
        boolean z2;
        int i;
        int i2;
        C5175[] c5175Arr = this.f19795;
        C5175 c5175 = this.f19788;
        c5175Arr[0] = c5175;
        C5175 c51752 = this.f19807;
        int i3 = 2;
        c5175Arr[2] = c51752;
        C5175 c51753 = this.f19816;
        c5175Arr[1] = c51753;
        C5175 c51754 = this.f19838;
        c5175Arr[3] = c51754;
        for (C5175 c51755 : c5175Arr) {
            c51755.f19887 = c1700.m5386(c51755);
        }
        int i4 = this.f19890;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C5175 c51756 = c5175Arr[i4];
        if (!this.f19891) {
            m11535();
        }
        if (this.f19891) {
            this.f19891 = false;
            int i5 = this.f19890;
            if (i5 == 0 || i5 == 1) {
                c1700.m5397(c5175.f19887, this.f19818);
                c1700.m5397(c51753.f19887, this.f19818);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c1700.m5397(c51752.f19887, this.f19778);
                    c1700.m5397(c51754.f19887, this.f19778);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f19841; i6++) {
            C5171 c5171 = this.f19840[i6];
            if ((this.f19888 || c5171.mo11492()) && ((((i2 = this.f19890) == 0 || i2 == 1) && c5171.f19839[0] == 3 && c5171.f19788.f19884 != null && c5171.f19816.f19884 != null) || ((i2 == 2 || i2 == 3) && c5171.f19839[1] == 3 && c5171.f19807.f19884 != null && c5171.f19838.f19884 != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = c5175.m11531() || c51753.m11531();
        boolean z4 = c51752.m11531() || c51754.m11531();
        int i7 = (z2 || !(((i = this.f19890) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f19841) {
            C5171 c51712 = this.f19840[i8];
            if (this.f19888 || c51712.mo11492()) {
                C1703 c1703M5386 = c1700.m5386(c51712.f19795[this.f19890]);
                int i9 = this.f19890;
                C5175 c51757 = c51712.f19795[i9];
                c51757.f19887 = c1703M5386;
                C5175 c51758 = c51757.f19884;
                int i10 = (c51758 == null || c51758.f19886 != this) ? 0 : c51757.f19885;
                if (i9 == 0 || i9 == i3) {
                    C1703 c1703 = c51756.f19887;
                    int i11 = this.f19889 - i10;
                    C1698 c1698M5383 = c1700.m5383();
                    C1703 c1703M5384 = c1700.m5384();
                    c1703M5384.f6660 = 0;
                    c1698M5383.m5371(c1703, c1703M5386, c1703M5384, i11);
                    c1700.m5389(c1698M5383);
                } else {
                    C1703 c17032 = c51756.f19887;
                    int i12 = this.f19889 + i10;
                    C1698 c1698M53832 = c1700.m5383();
                    C1703 c1703M53842 = c1700.m5384();
                    c1703M53842.f6660 = 0;
                    c1698M53832.m5368(c17032, c1703M5386, c1703M53842, i12);
                    c1700.m5389(c1698M53832);
                }
                c1700.m5381(c51756.f19887, c1703M5386, this.f19889 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f19890;
        if (i13 == 0) {
            c1700.m5381(c51753.f19887, c5175.f19887, 0, 8);
            c1700.m5381(c5175.f19887, this.f19824.f19816.f19887, 0, 4);
            c1700.m5381(c5175.f19887, this.f19824.f19788.f19887, 0, 0);
            return;
        }
        if (i13 == 1) {
            c1700.m5381(c5175.f19887, c51753.f19887, 0, 8);
            c1700.m5381(c5175.f19887, this.f19824.f19788.f19887, 0, 4);
            c1700.m5381(c5175.f19887, this.f19824.f19816.f19887, 0, 0);
        } else if (i13 == 2) {
            c1700.m5381(c51754.f19887, c51752.f19887, 0, 8);
            c1700.m5381(c51752.f19887, this.f19824.f19838.f19887, 0, 4);
            c1700.m5381(c51752.f19887, this.f19824.f19807.f19887, 0, 0);
        } else if (i13 == 3) {
            c1700.m5381(c51752.f19887, c51754.f19887, 0, 8);
            c1700.m5381(c51752.f19887, this.f19824.f19807.f19887, 0, 4);
            c1700.m5381(c51752.f19887, this.f19824.f19838.f19887, 0, 0);
        }
    }

    @Override // p447.C5171
    /* renamed from: ˈٴ */
    public final boolean mo11481() {
        return this.f19891;
    }

    @Override // p447.C5171
    /* renamed from: ˑʽ */
    public final boolean mo11492() {
        return true;
    }

    @Override // p447.C5171
    /* renamed from: ᐧⁱ */
    public final boolean mo11501() {
        return this.f19891;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final int m11534() {
        int i = this.f19890;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final boolean m11535() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f19841;
            if (i4 >= i) {
                break;
            }
            C5171 c5171 = this.f19840[i4];
            if ((this.f19888 || c5171.mo11492()) && ((((i2 = this.f19890) == 0 || i2 == 1) && !c5171.mo11481()) || (((i3 = this.f19890) == 2 || i3 == 3) && !c5171.mo11501()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f19841; i5++) {
            C5171 c51712 = this.f19840[i5];
            if (this.f19888 || c51712.mo11492()) {
                if (!z2) {
                    int i6 = this.f19890;
                    if (i6 == 0) {
                        iMax = c51712.mo11510(2).m11532();
                    } else if (i6 == 1) {
                        iMax = c51712.mo11510(4).m11532();
                    } else if (i6 == 2) {
                        iMax = c51712.mo11510(3).m11532();
                    } else if (i6 == 3) {
                        iMax = c51712.mo11510(5).m11532();
                    }
                    z2 = true;
                }
                int i7 = this.f19890;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c51712.mo11510(2).m11532());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c51712.mo11510(4).m11532());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c51712.mo11510(3).m11532());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c51712.mo11510(5).m11532());
                }
            }
        }
        int i8 = iMax + this.f19889;
        int i9 = this.f19890;
        if (i9 == 0 || i9 == 1) {
            m11496(i8, i8);
        } else {
            m11502(i8, i8);
        }
        this.f19891 = true;
        return true;
    }
}
