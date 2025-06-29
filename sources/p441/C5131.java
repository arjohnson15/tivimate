package p441;

import p447.AbstractC5172;
import p447.C5171;
import p447.C5175;

/* renamed from: ﾞʽ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5131 extends AbstractC5132 {

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final int[] f19622 = new int[2];

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static void m11415(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public final String toString() {
        return "HorizontalRun " + this.f19623.f19811;
    }

    @Override // p441.AbstractC5132
    /* renamed from: ʿʼ */
    public final void mo11406() {
        C5136 c5136 = this.f19626;
        if (c5136.f19638) {
            this.f19623.f19818 = c5136.f19645;
        }
    }

    @Override // p441.AbstractC5132
    /* renamed from: ˏʾ */
    public final boolean mo11408() {
        return this.f19631 != 3 || this.f19623.f19794 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x026b  */
    @Override // p441.InterfaceC5139
    /* renamed from: ـﹶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo11409(p441.InterfaceC5139 r24) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p441.C5131.mo11409(ﾞʽ.ﹳﹳ):void");
    }

    @Override // p441.AbstractC5132
    /* renamed from: ٴˎ */
    public final void mo11410() {
        this.f19627 = null;
        this.f19626.m11436();
        this.f19632.m11436();
        this.f19624.m11436();
        this.f19630 = false;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m11416() {
        this.f19630 = false;
        C5136 c5136 = this.f19626;
        c5136.m11436();
        c5136.f19638 = false;
        C5136 c51362 = this.f19632;
        c51362.m11436();
        c51362.f19638 = false;
        this.f19624.f19638 = false;
    }

    @Override // p441.AbstractC5132
    /* renamed from: ﹳﹳ */
    public final void mo11411() {
        C5171 c5171;
        C5171 c51712;
        int i;
        C5171 c51713;
        C5171 c51714;
        int i2;
        C5171 c51715 = this.f19623;
        boolean z = c51715.f19809;
        C5137 c5137 = this.f19624;
        if (z) {
            c5137.mo11437(c51715.m11505());
        }
        boolean z2 = c5137.f19638;
        C5136 c5136 = this.f19632;
        C5136 c51362 = this.f19626;
        if (!z2) {
            C5171 c51716 = this.f19623;
            int i3 = c51716.f19839[0];
            this.f19631 = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c51714 = c51716.f19824) != null && ((i2 = c51714.f19839[0]) == 1 || i2 == 4)) {
                    int iM11505 = (c51714.m11505() - this.f19623.f19788.m11523()) - this.f19623.f19816.m11523();
                    AbstractC5132.m11417(c51362, c51714.f19832.f19626, this.f19623.f19788.m11523());
                    AbstractC5132.m11417(c5136, c51714.f19832.f19632, -this.f19623.f19816.m11523());
                    c5137.mo11437(iM11505);
                    return;
                }
                if (i3 == 1) {
                    c5137.mo11437(c51716.m11505());
                }
            }
        } else if (this.f19631 == 4 && (c51712 = (c5171 = this.f19623).f19824) != null && ((i = c51712.f19839[0]) == 1 || i == 4)) {
            AbstractC5132.m11417(c51362, c51712.f19832.f19626, c5171.f19788.m11523());
            AbstractC5132.m11417(c5136, c51712.f19832.f19632, -this.f19623.f19816.m11523());
            return;
        }
        if (c5137.f19638) {
            C5171 c51717 = this.f19623;
            if (c51717.f19809) {
                C5175[] c5175Arr = c51717.f19795;
                C5175 c5175 = c5175Arr[0];
                C5175 c51752 = c5175.f19884;
                if (c51752 != null && c5175Arr[1].f19884 != null) {
                    if (c51717.m11511()) {
                        c51362.f19644 = this.f19623.f19795[0].m11523();
                        c5136.f19644 = -this.f19623.f19795[1].m11523();
                        return;
                    }
                    C5136 c5136M11418 = AbstractC5132.m11418(this.f19623.f19795[0]);
                    if (c5136M11418 != null) {
                        AbstractC5132.m11417(c51362, c5136M11418, this.f19623.f19795[0].m11523());
                    }
                    C5136 c5136M114182 = AbstractC5132.m11418(this.f19623.f19795[1]);
                    if (c5136M114182 != null) {
                        AbstractC5132.m11417(c5136, c5136M114182, -this.f19623.f19795[1].m11523());
                    }
                    c51362.f19636 = true;
                    c5136.f19636 = true;
                    return;
                }
                if (c51752 != null) {
                    C5136 c5136M114183 = AbstractC5132.m11418(c5175);
                    if (c5136M114183 != null) {
                        AbstractC5132.m11417(c51362, c5136M114183, this.f19623.f19795[0].m11523());
                        AbstractC5132.m11417(c5136, c51362, c5137.f19645);
                        return;
                    }
                    return;
                }
                C5175 c51753 = c5175Arr[1];
                if (c51753.f19884 != null) {
                    C5136 c5136M114184 = AbstractC5132.m11418(c51753);
                    if (c5136M114184 != null) {
                        AbstractC5132.m11417(c5136, c5136M114184, -this.f19623.f19795[1].m11523());
                        AbstractC5132.m11417(c51362, c5136, -c5137.f19645);
                        return;
                    }
                    return;
                }
                if ((c51717 instanceof AbstractC5172) || c51717.f19824 == null || c51717.mo11510(7).f19884 != null) {
                    return;
                }
                C5171 c51718 = this.f19623;
                AbstractC5132.m11417(c51362, c51718.f19824.f19832.f19626, c51718.m11488());
                AbstractC5132.m11417(c5136, c51362, c5137.f19645);
                return;
            }
        }
        if (this.f19631 == 3) {
            C5171 c51719 = this.f19623;
            int i4 = c51719.f19794;
            if (i4 == 2) {
                C5171 c517110 = c51719.f19824;
                if (c517110 != null) {
                    C5137 c51372 = c517110.f19777.f19624;
                    c5137.f19639.add(c51372);
                    c51372.f19640.add(c5137);
                    c5137.f19636 = true;
                    c5137.f19640.add(c51362);
                    c5137.f19640.add(c5136);
                }
            } else if (i4 == 3) {
                if (c51719.f19820 == 3) {
                    c51362.f19643 = this;
                    c5136.f19643 = this;
                    C5130 c5130 = c51719.f19777;
                    c5130.f19626.f19643 = this;
                    c5130.f19632.f19643 = this;
                    c5137.f19643 = this;
                    if (c51719.m11495()) {
                        c5137.f19639.add(this.f19623.f19777.f19624);
                        this.f19623.f19777.f19624.f19640.add(c5137);
                        C5130 c51302 = this.f19623.f19777;
                        c51302.f19624.f19643 = this;
                        c5137.f19639.add(c51302.f19626);
                        c5137.f19639.add(this.f19623.f19777.f19632);
                        this.f19623.f19777.f19626.f19640.add(c5137);
                        this.f19623.f19777.f19632.f19640.add(c5137);
                    } else if (this.f19623.m11511()) {
                        this.f19623.f19777.f19624.f19639.add(c5137);
                        c5137.f19640.add(this.f19623.f19777.f19624);
                    } else {
                        this.f19623.f19777.f19624.f19639.add(c5137);
                    }
                } else {
                    C5137 c51373 = c51719.f19777.f19624;
                    c5137.f19639.add(c51373);
                    c51373.f19640.add(c5137);
                    this.f19623.f19777.f19626.f19640.add(c5137);
                    this.f19623.f19777.f19632.f19640.add(c5137);
                    c5137.f19636 = true;
                    c5137.f19640.add(c51362);
                    c5137.f19640.add(c5136);
                    c51362.f19639.add(c5137);
                    c5136.f19639.add(c5137);
                }
            }
        }
        C5171 c517111 = this.f19623;
        C5175[] c5175Arr2 = c517111.f19795;
        C5175 c51754 = c5175Arr2[0];
        C5175 c51755 = c51754.f19884;
        if (c51755 != null && c5175Arr2[1].f19884 != null) {
            if (c517111.m11511()) {
                c51362.f19644 = this.f19623.f19795[0].m11523();
                c5136.f19644 = -this.f19623.f19795[1].m11523();
                return;
            }
            C5136 c5136M114185 = AbstractC5132.m11418(this.f19623.f19795[0]);
            C5136 c5136M114186 = AbstractC5132.m11418(this.f19623.f19795[1]);
            if (c5136M114185 != null) {
                c5136M114185.m11435(this);
            }
            if (c5136M114186 != null) {
                c5136M114186.m11435(this);
            }
            this.f19625 = 4;
            return;
        }
        if (c51755 != null) {
            C5136 c5136M114187 = AbstractC5132.m11418(c51754);
            if (c5136M114187 != null) {
                AbstractC5132.m11417(c51362, c5136M114187, this.f19623.f19795[0].m11523());
                m11422(c5136, c51362, 1, c5137);
                return;
            }
            return;
        }
        C5175 c51756 = c5175Arr2[1];
        if (c51756.f19884 != null) {
            C5136 c5136M114188 = AbstractC5132.m11418(c51756);
            if (c5136M114188 != null) {
                AbstractC5132.m11417(c5136, c5136M114188, -this.f19623.f19795[1].m11523());
                m11422(c51362, c5136, -1, c5137);
                return;
            }
            return;
        }
        if ((c517111 instanceof AbstractC5172) || (c51713 = c517111.f19824) == null) {
            return;
        }
        AbstractC5132.m11417(c51362, c51713.f19832.f19626, c517111.m11488());
        m11422(c5136, c51362, 1, c5137);
    }
}
