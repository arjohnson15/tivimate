package p441;

import p080.AbstractC1702;
import p447.AbstractC5172;
import p447.C5171;
import p447.C5175;

/* renamed from: ﾞʽ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5130 extends AbstractC5132 {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public C5135 f19620;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public C5136 f19621;

    public final String toString() {
        return "VerticalRun " + this.f19623.f19811;
    }

    @Override // p441.AbstractC5132
    /* renamed from: ʿʼ */
    public final void mo11406() {
        C5136 c5136 = this.f19626;
        if (c5136.f19638) {
            this.f19623.f19778 = c5136.f19645;
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m11414() {
        this.f19630 = false;
        C5136 c5136 = this.f19626;
        c5136.m11436();
        c5136.f19638 = false;
        C5136 c51362 = this.f19632;
        c51362.m11436();
        c51362.f19638 = false;
        C5136 c51363 = this.f19621;
        c51363.m11436();
        c51363.f19638 = false;
        this.f19624.f19638 = false;
    }

    @Override // p441.AbstractC5132
    /* renamed from: ˏʾ */
    public final boolean mo11408() {
        return this.f19631 != 3 || this.f19623.f19820 == 0;
    }

    @Override // p441.InterfaceC5139
    /* renamed from: ـﹶ */
    public final void mo11409(InterfaceC5139 interfaceC5139) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC1702.m5411(this.f19625) == 3) {
            C5171 c5171 = this.f19623;
            m11421(c5171.f19807, c5171.f19838, 1);
            return;
        }
        C5137 c5137 = this.f19624;
        if (c5137.f19642 && !c5137.f19638 && this.f19631 == 3) {
            C5171 c51712 = this.f19623;
            int i2 = c51712.f19820;
            if (i2 == 2) {
                C5171 c51713 = c51712.f19824;
                if (c51713 != null) {
                    if (c51713.f19777.f19624.f19638) {
                        c5137.mo11437((int) ((r5.f19645 * c51712.f19831) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C5137 c51372 = c51712.f19832.f19624;
                if (c51372.f19638) {
                    int i3 = c51712.f19791;
                    if (i3 == -1) {
                        f = c51372.f19645;
                        f2 = c51712.f19787;
                    } else if (i3 == 0) {
                        f3 = c51372.f19645 * c51712.f19787;
                        i = (int) (f3 + 0.5f);
                        c5137.mo11437(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c5137.mo11437(i);
                    } else {
                        f = c51372.f19645;
                        f2 = c51712.f19787;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c5137.mo11437(i);
                }
            }
        }
        C5136 c5136 = this.f19626;
        if (c5136.f19642) {
            C5136 c51362 = this.f19632;
            if (c51362.f19642) {
                if (c5136.f19638 && c51362.f19638 && c5137.f19638) {
                    return;
                }
                if (!c5137.f19638 && this.f19631 == 3) {
                    C5171 c51714 = this.f19623;
                    if (c51714.f19794 == 0 && !c51714.m11495()) {
                        C5136 c51363 = (C5136) c5136.f19639.get(0);
                        C5136 c51364 = (C5136) c51362.f19639.get(0);
                        int i4 = c51363.f19645 + c5136.f19644;
                        int i5 = c51364.f19645 + c51362.f19644;
                        c5136.mo11437(i4);
                        c51362.mo11437(i5);
                        c5137.mo11437(i5 - i4);
                        return;
                    }
                }
                if (!c5137.f19638 && this.f19631 == 3 && this.f19628 == 1 && c5136.f19639.size() > 0 && c51362.f19639.size() > 0) {
                    C5136 c51365 = (C5136) c5136.f19639.get(0);
                    int i6 = (((C5136) c51362.f19639.get(0)).f19645 + c51362.f19644) - (c51365.f19645 + c5136.f19644);
                    int i7 = c5137.f19648;
                    if (i6 < i7) {
                        c5137.mo11437(i6);
                    } else {
                        c5137.mo11437(i7);
                    }
                }
                if (c5137.f19638 && c5136.f19639.size() > 0 && c51362.f19639.size() > 0) {
                    C5136 c51366 = (C5136) c5136.f19639.get(0);
                    C5136 c51367 = (C5136) c51362.f19639.get(0);
                    int i8 = c51366.f19645;
                    int i9 = c5136.f19644 + i8;
                    int i10 = c51367.f19645;
                    int i11 = c51362.f19644 + i10;
                    float f4 = this.f19623.f19773;
                    if (c51366 == c51367) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c5136.mo11437((int) ((((i10 - i8) - c5137.f19645) * f4) + i8 + 0.5f));
                    c51362.mo11437(c5136.f19645 + c5137.f19645);
                }
            }
        }
    }

    @Override // p441.AbstractC5132
    /* renamed from: ٴˎ */
    public final void mo11410() {
        this.f19627 = null;
        this.f19626.m11436();
        this.f19632.m11436();
        this.f19621.m11436();
        this.f19624.m11436();
        this.f19630 = false;
    }

    @Override // p441.AbstractC5132
    /* renamed from: ﹳﹳ */
    public final void mo11411() {
        C5171 c5171;
        C5171 c51712;
        C5171 c51713;
        C5171 c51714;
        C5171 c51715 = this.f19623;
        boolean z = c51715.f19809;
        C5137 c5137 = this.f19624;
        if (z) {
            c5137.mo11437(c51715.m11490());
        }
        boolean z2 = c5137.f19638;
        C5136 c5136 = this.f19632;
        C5136 c51362 = this.f19626;
        if (!z2) {
            C5171 c51716 = this.f19623;
            this.f19631 = c51716.f19839[1];
            if (c51716.f19814) {
                this.f19620 = new C5135(this);
            }
            int i = this.f19631;
            if (i != 3) {
                if (i == 4 && (c51714 = this.f19623.f19824) != null && c51714.f19839[1] == 1) {
                    int iM11490 = (c51714.m11490() - this.f19623.f19807.m11523()) - this.f19623.f19838.m11523();
                    AbstractC5132.m11417(c51362, c51714.f19777.f19626, this.f19623.f19807.m11523());
                    AbstractC5132.m11417(c5136, c51714.f19777.f19632, -this.f19623.f19838.m11523());
                    c5137.mo11437(iM11490);
                    return;
                }
                if (i == 1) {
                    c5137.mo11437(this.f19623.m11490());
                }
            }
        } else if (this.f19631 == 4 && (c51712 = (c5171 = this.f19623).f19824) != null && c51712.f19839[1] == 1) {
            AbstractC5132.m11417(c51362, c51712.f19777.f19626, c5171.f19807.m11523());
            AbstractC5132.m11417(c5136, c51712.f19777.f19632, -this.f19623.f19838.m11523());
            return;
        }
        boolean z3 = c5137.f19638;
        C5136 c51363 = this.f19621;
        if (z3) {
            C5171 c51717 = this.f19623;
            if (c51717.f19809) {
                C5175[] c5175Arr = c51717.f19795;
                C5175 c5175 = c5175Arr[2];
                C5175 c51752 = c5175.f19884;
                if (c51752 != null && c5175Arr[3].f19884 != null) {
                    if (c51717.m11495()) {
                        c51362.f19644 = this.f19623.f19795[2].m11523();
                        c5136.f19644 = -this.f19623.f19795[3].m11523();
                    } else {
                        C5136 c5136M11418 = AbstractC5132.m11418(this.f19623.f19795[2]);
                        if (c5136M11418 != null) {
                            AbstractC5132.m11417(c51362, c5136M11418, this.f19623.f19795[2].m11523());
                        }
                        C5136 c5136M114182 = AbstractC5132.m11418(this.f19623.f19795[3]);
                        if (c5136M114182 != null) {
                            AbstractC5132.m11417(c5136, c5136M114182, -this.f19623.f19795[3].m11523());
                        }
                        c51362.f19636 = true;
                        c5136.f19636 = true;
                    }
                    C5171 c51718 = this.f19623;
                    if (c51718.f19814) {
                        AbstractC5132.m11417(c51363, c51362, c51718.f19785);
                        return;
                    }
                    return;
                }
                if (c51752 != null) {
                    C5136 c5136M114183 = AbstractC5132.m11418(c5175);
                    if (c5136M114183 != null) {
                        AbstractC5132.m11417(c51362, c5136M114183, this.f19623.f19795[2].m11523());
                        AbstractC5132.m11417(c5136, c51362, c5137.f19645);
                        C5171 c51719 = this.f19623;
                        if (c51719.f19814) {
                            AbstractC5132.m11417(c51363, c51362, c51719.f19785);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C5175 c51753 = c5175Arr[3];
                if (c51753.f19884 != null) {
                    C5136 c5136M114184 = AbstractC5132.m11418(c51753);
                    if (c5136M114184 != null) {
                        AbstractC5132.m11417(c5136, c5136M114184, -this.f19623.f19795[3].m11523());
                        AbstractC5132.m11417(c51362, c5136, -c5137.f19645);
                    }
                    C5171 c517110 = this.f19623;
                    if (c517110.f19814) {
                        AbstractC5132.m11417(c51363, c51362, c517110.f19785);
                        return;
                    }
                    return;
                }
                C5175 c51754 = c5175Arr[4];
                if (c51754.f19884 != null) {
                    C5136 c5136M114185 = AbstractC5132.m11418(c51754);
                    if (c5136M114185 != null) {
                        AbstractC5132.m11417(c51363, c5136M114185, 0);
                        AbstractC5132.m11417(c51362, c51363, -this.f19623.f19785);
                        AbstractC5132.m11417(c5136, c51362, c5137.f19645);
                        return;
                    }
                    return;
                }
                if ((c51717 instanceof AbstractC5172) || c51717.f19824 == null || c51717.mo11510(7).f19884 != null) {
                    return;
                }
                C5171 c517111 = this.f19623;
                AbstractC5132.m11417(c51362, c517111.f19824.f19777.f19626, c517111.m11504());
                AbstractC5132.m11417(c5136, c51362, c5137.f19645);
                C5171 c517112 = this.f19623;
                if (c517112.f19814) {
                    AbstractC5132.m11417(c51363, c51362, c517112.f19785);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f19631 != 3) {
            c5137.m11435(this);
        } else {
            C5171 c517113 = this.f19623;
            int i2 = c517113.f19820;
            if (i2 == 2) {
                C5171 c517114 = c517113.f19824;
                if (c517114 != null) {
                    C5137 c51372 = c517114.f19777.f19624;
                    c5137.f19639.add(c51372);
                    c51372.f19640.add(c5137);
                    c5137.f19636 = true;
                    c5137.f19640.add(c51362);
                    c5137.f19640.add(c5136);
                }
            } else if (i2 == 3 && !c517113.m11495()) {
                C5171 c517115 = this.f19623;
                if (c517115.f19794 != 3) {
                    C5137 c51373 = c517115.f19832.f19624;
                    c5137.f19639.add(c51373);
                    c51373.f19640.add(c5137);
                    c5137.f19636 = true;
                    c5137.f19640.add(c51362);
                    c5137.f19640.add(c5136);
                }
            }
        }
        C5171 c517116 = this.f19623;
        C5175[] c5175Arr2 = c517116.f19795;
        C5175 c51755 = c5175Arr2[2];
        C5175 c51756 = c51755.f19884;
        if (c51756 != null && c5175Arr2[3].f19884 != null) {
            if (c517116.m11495()) {
                c51362.f19644 = this.f19623.f19795[2].m11523();
                c5136.f19644 = -this.f19623.f19795[3].m11523();
            } else {
                C5136 c5136M114186 = AbstractC5132.m11418(this.f19623.f19795[2]);
                C5136 c5136M114187 = AbstractC5132.m11418(this.f19623.f19795[3]);
                if (c5136M114186 != null) {
                    c5136M114186.m11435(this);
                }
                if (c5136M114187 != null) {
                    c5136M114187.m11435(this);
                }
                this.f19625 = 4;
            }
            if (this.f19623.f19814) {
                m11422(c51363, c51362, 1, this.f19620);
            }
        } else if (c51756 != null) {
            C5136 c5136M114188 = AbstractC5132.m11418(c51755);
            if (c5136M114188 != null) {
                AbstractC5132.m11417(c51362, c5136M114188, this.f19623.f19795[2].m11523());
                m11422(c5136, c51362, 1, c5137);
                if (this.f19623.f19814) {
                    m11422(c51363, c51362, 1, this.f19620);
                }
                if (this.f19631 == 3) {
                    C5171 c517117 = this.f19623;
                    if (c517117.f19787 > 0.0f) {
                        C5131 c5131 = c517117.f19832;
                        if (c5131.f19631 == 3) {
                            c5131.f19624.f19640.add(c5137);
                            c5137.f19639.add(this.f19623.f19832.f19624);
                            c5137.f19643 = this;
                        }
                    }
                }
            }
        } else {
            C5175 c51757 = c5175Arr2[3];
            if (c51757.f19884 != null) {
                C5136 c5136M114189 = AbstractC5132.m11418(c51757);
                if (c5136M114189 != null) {
                    AbstractC5132.m11417(c5136, c5136M114189, -this.f19623.f19795[3].m11523());
                    m11422(c51362, c5136, -1, c5137);
                    if (this.f19623.f19814) {
                        m11422(c51363, c51362, 1, this.f19620);
                    }
                }
            } else {
                C5175 c51758 = c5175Arr2[4];
                if (c51758.f19884 != null) {
                    C5136 c5136M1141810 = AbstractC5132.m11418(c51758);
                    if (c5136M1141810 != null) {
                        AbstractC5132.m11417(c51363, c5136M1141810, 0);
                        m11422(c51362, c51363, -1, this.f19620);
                        m11422(c5136, c51362, 1, c5137);
                    }
                } else if (!(c517116 instanceof AbstractC5172) && (c51713 = c517116.f19824) != null) {
                    AbstractC5132.m11417(c51362, c51713.f19777.f19626, c517116.m11504());
                    m11422(c5136, c51362, 1, c5137);
                    if (this.f19623.f19814) {
                        m11422(c51363, c51362, 1, this.f19620);
                    }
                    if (this.f19631 == 3) {
                        C5171 c517118 = this.f19623;
                        if (c517118.f19787 > 0.0f) {
                            C5131 c51312 = c517118.f19832;
                            if (c51312.f19631 == 3) {
                                c51312.f19624.f19640.add(c5137);
                                c5137.f19639.add(this.f19623.f19832.f19624);
                                c5137.f19643 = this;
                            }
                        }
                    }
                }
            }
        }
        if (c5137.f19639.size() == 0) {
            c5137.f19642 = true;
        }
    }
}
