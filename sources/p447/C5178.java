package p447;

/* renamed from: ﾞˊ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5178 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C5175 f19915;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f19916;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final /* synthetic */ C5174 f19919;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f19920;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f19922;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f19925;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C5175 f19926;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C5175 f19927;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public int f19929;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C5175 f19930;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f19931;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C5171 f19914 = null;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f19923 = 0;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f19917 = 0;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f19918 = 0;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f19928 = 0;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f19921 = 0;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f19924 = 0;

    public C5178(C5174 c5174, int i, C5175 c5175, C5175 c51752, C5175 c51753, C5175 c51754, int i2) {
        this.f19919 = c5174;
        this.f19922 = 0;
        this.f19931 = 0;
        this.f19916 = 0;
        this.f19920 = 0;
        this.f19929 = 0;
        this.f19925 = i;
        this.f19930 = c5175;
        this.f19915 = c51752;
        this.f19926 = c51753;
        this.f19927 = c51754;
        this.f19922 = c5174.f19860;
        this.f19931 = c5174.f19857;
        this.f19916 = c5174.f19843;
        this.f19920 = c5174.f19849;
        this.f19929 = i2;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11542(int i, boolean z, boolean z2) {
        C5174 c5174;
        int i2;
        int i3;
        int i4;
        C5171 c5171;
        int i5;
        int i6;
        float f;
        float f2;
        int i7;
        float f3;
        int i8;
        int i9 = this.f19921;
        int i10 = 0;
        while (true) {
            c5174 = this.f19919;
            if (i10 >= i9 || (i8 = this.f19928 + i10) >= c5174.f19876) {
                break;
            }
            C5171 c51712 = c5174.f19852[i8];
            if (c51712 != null) {
                c51712.m11487();
            }
            i10++;
        }
        if (i9 == 0 || this.f19914 == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f19928 + (z ? (i9 - 1) - i13 : i13);
            if (i14 >= c5174.f19876) {
                break;
            }
            C5171 c51713 = c5174.f19852[i14];
            if (c51713 != null && c51713.f19774 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f19925 != 0) {
            C5171 c51714 = this.f19914;
            c51714.f19812 = c5174.f19869;
            int i15 = this.f19922;
            if (i > 0) {
                i15 += c5174.f19862;
            }
            C5175 c5175 = c51714.f19788;
            C5175 c51752 = c51714.f19816;
            if (z) {
                c51752.m11529(this.f19926, i15);
                if (z2) {
                    c5175.m11529(this.f19930, this.f19916);
                }
                if (i > 0) {
                    this.f19926.f19886.f19788.m11529(c51752, 0);
                }
            } else {
                c5175.m11529(this.f19930, i15);
                if (z2) {
                    c51752.m11529(this.f19926, this.f19916);
                }
                if (i > 0) {
                    this.f19930.f19886.f19816.m11529(c5175, 0);
                }
            }
            C5171 c51715 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f19928 + i16;
                if (i17 >= c5174.f19876) {
                    return;
                }
                C5171 c51716 = c5174.f19852[i17];
                if (c51716 != null) {
                    C5175 c51753 = c51716.f19807;
                    if (i16 == 0) {
                        c51716.m11498(c51753, this.f19915, this.f19931);
                        int i18 = c5174.f19877;
                        float f4 = c5174.f19871;
                        if (this.f19928 == 0) {
                            i4 = c5174.f19875;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f4 = c5174.f19845;
                            }
                            c51716.f19808 = i4;
                            c51716.f19773 = f4;
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z2 || (i4 = c5174.f19867) == i3) {
                            i4 = i2;
                        } else {
                            f4 = c5174.f19858;
                        }
                        c51716.f19808 = i4;
                        c51716.f19773 = f4;
                    }
                    if (i16 == i9 - 1) {
                        c51716.m11498(c51716.f19838, this.f19927, this.f19920);
                    }
                    if (c51715 != null) {
                        int i19 = c5174.f19854;
                        C5175 c51754 = c51715.f19838;
                        c51753.m11529(c51754, i19);
                        if (i16 == i11) {
                            int i20 = this.f19931;
                            if (c51753.m11527()) {
                                c51753.f19881 = i20;
                            }
                        }
                        c51754.m11529(c51753, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f19920;
                            if (c51754.m11527()) {
                                c51754.f19881 = i21;
                            }
                        }
                    }
                    if (c51716 != c51714) {
                        C5175 c51755 = c51716.f19816;
                        C5175 c51756 = c51716.f19788;
                        if (z) {
                            int i22 = c5174.f19873;
                            if (i22 == 0) {
                                c51755.m11529(c51752, 0);
                            } else if (i22 == 1) {
                                c51756.m11529(c5175, 0);
                            } else if (i22 == 2) {
                                c51756.m11529(c5175, 0);
                                c51755.m11529(c51752, 0);
                            }
                            c51715 = c51716;
                        } else {
                            int i23 = c5174.f19873;
                            if (i23 == 0) {
                                c51756.m11529(c5175, 0);
                            } else if (i23 == 1) {
                                c51755.m11529(c51752, 0);
                            } else if (i23 == 2) {
                                if (z3) {
                                    c51756.m11529(this.f19930, this.f19922);
                                    c51755.m11529(this.f19926, this.f19916);
                                } else {
                                    c51756.m11529(c5175, 0);
                                    c51755.m11529(c51752, 0);
                                }
                            }
                            c51715 = c51716;
                        }
                    } else {
                        c51715 = c51716;
                    }
                }
            }
            return;
        }
        C5171 c51717 = this.f19914;
        c51717.f19808 = c5174.f19877;
        int i24 = this.f19931;
        if (i > 0) {
            i24 += c5174.f19854;
        }
        C5175 c51757 = this.f19915;
        C5175 c51758 = c51717.f19807;
        c51758.m11529(c51757, i24);
        C5175 c51759 = c51717.f19838;
        if (z2) {
            c51759.m11529(this.f19927, this.f19920);
        }
        if (i > 0) {
            this.f19915.f19886.f19838.m11529(c51758, 0);
        }
        if (c5174.f19865 != 3 || c51717.f19814) {
            c5171 = c51717;
        } else {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f19928 + (z ? (i9 - 1) - i25 : i25);
                if (i26 >= c5174.f19876) {
                    break;
                }
                c5171 = c5174.f19852[i26];
                if (c5171.f19814) {
                    break;
                }
            }
            c5171 = c51717;
        }
        C5171 c51718 = null;
        int i27 = 0;
        while (i27 < i9) {
            int i28 = z ? (i9 - 1) - i27 : i27;
            int i29 = this.f19928 + i28;
            if (i29 >= c5174.f19876) {
                return;
            }
            C5171 c51719 = c5174.f19852[i29];
            if (c51719 == null) {
                i5 = i9;
            } else {
                C5175 c517510 = c51719.f19788;
                if (i27 == 0) {
                    c51719.m11498(c517510, this.f19930, this.f19922);
                }
                if (i28 == 0) {
                    int i30 = c5174.f19869;
                    if (z) {
                        i6 = i30;
                        f = 1.0f - c5174.f19868;
                    } else {
                        i6 = i30;
                        f = c5174.f19868;
                    }
                    if (this.f19928 == 0) {
                        int i31 = c5174.f19870;
                        f2 = f;
                        if (i31 != -1) {
                            f3 = z ? 1.0f - c5174.f19863 : c5174.f19863;
                            i7 = i31;
                        }
                        c51719.f19812 = i7;
                        c51719.f19806 = f3;
                    } else {
                        f2 = f;
                    }
                    if (!z2 || (i7 = c5174.f19872) == -1) {
                        i7 = i6;
                        f3 = f2;
                    } else {
                        f3 = z ? 1.0f - c5174.f19855 : c5174.f19855;
                    }
                    c51719.f19812 = i7;
                    c51719.f19806 = f3;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c51719.m11498(c51719.f19816, this.f19926, this.f19916);
                } else {
                    i5 = i9;
                }
                if (c51718 != null) {
                    int i32 = c5174.f19862;
                    C5175 c517511 = c51718.f19816;
                    c517510.m11529(c517511, i32);
                    if (i27 == i11) {
                        int i33 = this.f19922;
                        if (c517510.m11527()) {
                            c517510.f19881 = i33;
                        }
                    }
                    c517511.m11529(c517510, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f19916;
                        if (c517511.m11527()) {
                            c517511.f19881 = i34;
                        }
                    }
                }
                if (c51719 != c51717) {
                    int i35 = c5174.f19865;
                    if (i35 == 3 && c5171.f19814 && c51719 != c5171 && c51719.f19814) {
                        c51719.f19776.m11529(c5171.f19776, 0);
                    } else {
                        C5175 c517512 = c51719.f19807;
                        if (i35 != 0) {
                            C5175 c517513 = c51719.f19838;
                            if (i35 == 1) {
                                c517513.m11529(c51759, 0);
                            } else if (z3) {
                                c517512.m11529(this.f19915, this.f19931);
                                c517513.m11529(this.f19927, this.f19920);
                            } else {
                                c517512.m11529(c51758, 0);
                                c517513.m11529(c51759, 0);
                            }
                        } else {
                            c517512.m11529(c51758, 0);
                        }
                    }
                }
                c51718 = c51719;
            }
            i27++;
            i9 = i5;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m11543(int i) {
        C5174 c5174;
        int i2;
        int i3 = this.f19924;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f19921;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c5174 = this.f19919;
            if (i6 >= i4 || (i2 = this.f19928 + i6) >= c5174.f19876) {
                break;
            }
            C5171 c5171 = c5174.f19852[i2];
            if (this.f19925 == 0) {
                if (c5171 != null) {
                    int[] iArr = c5171.f19839;
                    if (iArr[0] == 3 && c5171.f19794 == 0) {
                        c5174.m11521(1, i5, iArr[1], c5171.m11490(), c5171);
                    }
                }
            } else if (c5171 != null) {
                int[] iArr2 = c5171.f19839;
                if (iArr2[1] == 3 && c5171.f19820 == 0) {
                    c5174.m11521(iArr2[0], c5171.m11505(), 1, i5, c5171);
                }
            }
            i6++;
        }
        this.f19917 = 0;
        this.f19918 = 0;
        this.f19914 = null;
        this.f19923 = 0;
        int i7 = this.f19921;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f19928 + i8;
            if (i9 >= c5174.f19876) {
                return;
            }
            C5171 c51712 = c5174.f19852[i9];
            if (this.f19925 == 0) {
                int iM11505 = c51712.m11505();
                int i10 = c5174.f19862;
                if (c51712.f19774 == 8) {
                    i10 = 0;
                }
                this.f19917 = iM11505 + i10 + this.f19917;
                int iM11520 = c5174.m11520(c51712, this.f19929);
                if (this.f19914 == null || this.f19923 < iM11520) {
                    this.f19914 = c51712;
                    this.f19923 = iM11520;
                    this.f19918 = iM11520;
                }
            } else {
                int iM11519 = c5174.m11519(c51712, this.f19929);
                int iM115202 = c5174.m11520(c51712, this.f19929);
                int i11 = c5174.f19854;
                if (c51712.f19774 == 8) {
                    i11 = 0;
                }
                this.f19918 = iM115202 + i11 + this.f19918;
                if (this.f19914 == null || this.f19923 < iM11519) {
                    this.f19914 = c51712;
                    this.f19923 = iM11519;
                    this.f19917 = iM11519;
                }
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m11544() {
        return this.f19925 == 1 ? this.f19918 - this.f19919.f19854 : this.f19918;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11545(C5171 c5171) {
        int i = this.f19925;
        C5174 c5174 = this.f19919;
        if (i == 0) {
            int iM11519 = c5174.m11519(c5171, this.f19929);
            if (c5171.f19839[0] == 3) {
                this.f19924++;
                iM11519 = 0;
            }
            this.f19917 = iM11519 + (c5171.f19774 != 8 ? c5174.f19862 : 0) + this.f19917;
            int iM11520 = c5174.m11520(c5171, this.f19929);
            if (this.f19914 == null || this.f19923 < iM11520) {
                this.f19914 = c5171;
                this.f19923 = iM11520;
                this.f19918 = iM11520;
            }
        } else {
            int iM115192 = c5174.m11519(c5171, this.f19929);
            int iM115202 = c5174.m11520(c5171, this.f19929);
            if (c5171.f19839[1] == 3) {
                this.f19924++;
                iM115202 = 0;
            }
            this.f19918 = iM115202 + (c5171.f19774 != 8 ? c5174.f19854 : 0) + this.f19918;
            if (this.f19914 == null || this.f19923 < iM115192) {
                this.f19914 = c5171;
                this.f19923 = iM115192;
                this.f19917 = iM115192;
            }
        }
        this.f19921++;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m11546(int i, C5175 c5175, C5175 c51752, C5175 c51753, C5175 c51754, int i2, int i3, int i4, int i5, int i6) {
        this.f19925 = i;
        this.f19930 = c5175;
        this.f19915 = c51752;
        this.f19926 = c51753;
        this.f19927 = c51754;
        this.f19922 = i2;
        this.f19931 = i3;
        this.f19916 = i4;
        this.f19920 = i5;
        this.f19929 = i6;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m11547() {
        return this.f19925 == 0 ? this.f19917 - this.f19919.f19862 : this.f19917;
    }
}
