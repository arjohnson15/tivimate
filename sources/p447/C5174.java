package p447;

import java.util.ArrayList;
import p080.C1700;
import p412.C4693;
import p441.C5126;

/* renamed from: ﾞˊ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5174 extends AbstractC5172 {

    /* renamed from: ʻ, reason: contains not printable characters */
    public int f19843;

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public C5171[] f19844;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public float f19845;

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public C4693 f19846;

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public int f19847;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public boolean f19848;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public int f19849;

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public int f19850;

    /* renamed from: ˆʼ, reason: contains not printable characters */
    public int f19851;

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public C5171[] f19852;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public int f19853;

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public int f19854;

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public float f19855;

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public int f19856;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public int f19857;

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public float f19858;

    /* renamed from: ˎי, reason: contains not printable characters */
    public ArrayList f19859;

    /* renamed from: ˏ, reason: contains not printable characters */
    public int f19860;

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public C5171[] f19861;

    /* renamed from: יˆ, reason: contains not printable characters */
    public int f19862;

    /* renamed from: יˊ, reason: contains not printable characters */
    public float f19863;

    /* renamed from: יי, reason: contains not printable characters */
    public int[] f19864;

    /* renamed from: יᴵ, reason: contains not printable characters */
    public int f19865;

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public int f19866;

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public int f19867;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public float f19868;

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public int f19869;

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public int f19870;

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public float f19871;

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public int f19872;

    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public int f19873;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public int f19874;

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public int f19875;

    /* renamed from: ﹳ, reason: contains not printable characters */
    public int f19876;

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public int f19877;

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public C5126 f19878;

    @Override // p447.AbstractC5172
    /* renamed from: ʻʿ */
    public final void mo11514() {
        for (int i = 0; i < this.f19841; i++) {
            C5171 c5171 = this.f19840[i];
            if (c5171 != null) {
                c5171.f19781 = true;
            }
        }
    }

    @Override // p447.C5171
    /* renamed from: ʽᐧ */
    public final void mo11475(C1700 c1700, boolean z) {
        C5171 c5171;
        float f;
        int i;
        super.mo11475(c1700, z);
        C5171 c51712 = this.f19824;
        boolean z2 = c51712 != null && ((C5177) c51712).f19910;
        int i2 = this.f19851;
        ArrayList arrayList = this.f19859;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((C5178) arrayList.get(i3)).m11542(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((C5178) arrayList.get(i4)).m11542(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.f19864 != null && this.f19861 != null && this.f19844 != null) {
                for (int i5 = 0; i5 < this.f19876; i5++) {
                    this.f19852[i5].m11487();
                }
                int[] iArr = this.f19864;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.f19868;
                C5171 c51713 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.f19868;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    C5171 c51714 = this.f19861[i];
                    if (c51714 != null && c51714.f19774 != 8) {
                        C5175 c5175 = c51714.f19788;
                        if (i8 == 0) {
                            c51714.m11498(c5175, this.f19788, this.f19860);
                            c51714.f19812 = this.f19869;
                            c51714.f19806 = f;
                        }
                        if (i8 == i6 - 1) {
                            c51714.m11498(c51714.f19816, this.f19816, this.f19843);
                        }
                        if (i8 > 0 && c51713 != null) {
                            int i9 = this.f19862;
                            C5175 c51752 = c51713.f19816;
                            c51714.m11498(c5175, c51752, i9);
                            c51713.m11498(c51752, c5175, 0);
                        }
                        c51713 = c51714;
                    }
                    i8++;
                    f2 = f;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C5171 c51715 = this.f19844[i10];
                    if (c51715 != null && c51715.f19774 != 8) {
                        C5175 c51753 = c51715.f19807;
                        if (i10 == 0) {
                            c51715.m11498(c51753, this.f19807, this.f19857);
                            c51715.f19808 = this.f19877;
                            c51715.f19773 = this.f19871;
                        }
                        if (i10 == i7 - 1) {
                            c51715.m11498(c51715.f19838, this.f19838, this.f19849);
                        }
                        if (i10 > 0 && c51713 != null) {
                            int i11 = this.f19854;
                            C5175 c51754 = c51713.f19838;
                            c51715.m11498(c51753, c51754, i11);
                            c51713.m11498(c51754, c51753, 0);
                        }
                        c51713 = c51715;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f19850 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C5171[] c5171Arr = this.f19852;
                        if (i14 < c5171Arr.length && (c5171 = c5171Arr[i14]) != null && c5171.f19774 != 8) {
                            C5171 c51716 = this.f19861[i12];
                            C5171 c51717 = this.f19844[i13];
                            if (c5171 != c51716) {
                                c5171.m11498(c5171.f19788, c51716.f19788, 0);
                                c5171.m11498(c5171.f19816, c51716.f19816, 0);
                            }
                            if (c5171 != c51717) {
                                c5171.m11498(c5171.f19807, c51717.f19807, 0);
                                c5171.m11498(c5171.f19838, c51717.f19838, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C5178) arrayList.get(0)).m11542(0, z2, true);
        }
        this.f19848 = false;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final int m11519(C5171 c5171, int i) {
        if (c5171 == null) {
            return 0;
        }
        int[] iArr = c5171.f19839;
        if (iArr[0] == 3) {
            int i2 = c5171.f19794;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c5171.f19836 * i);
                if (i3 != c5171.m11505()) {
                    c5171.f19813 = true;
                    m11521(1, i3, iArr[1], c5171.m11490(), c5171);
                }
                return i3;
            }
            if (i2 == 1) {
                return c5171.m11505();
            }
            if (i2 == 3) {
                return (int) ((c5171.m11490() * c5171.f19787) + 0.5f);
            }
        }
        return c5171.m11505();
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final int m11520(C5171 c5171, int i) {
        if (c5171 == null) {
            return 0;
        }
        int[] iArr = c5171.f19839;
        if (iArr[1] == 3) {
            int i2 = c5171.f19820;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c5171.f19831 * i);
                if (i3 != c5171.m11490()) {
                    c5171.f19813 = true;
                    m11521(iArr[0], c5171.m11505(), 1, i3, c5171);
                }
                return i3;
            }
            if (i2 == 1) {
                return c5171.m11490();
            }
            if (i2 == 3) {
                return (int) ((c5171.m11505() * c5171.f19787) + 0.5f);
            }
        }
        return c5171.m11490();
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final void m11521(int i, int i2, int i3, int i4, C5171 c5171) {
        C4693 c4693;
        C5171 c51712;
        while (true) {
            c4693 = this.f19846;
            if (c4693 != null || (c51712 = this.f19824) == null) {
                break;
            } else {
                this.f19846 = ((C5177) c51712).f19897;
            }
        }
        C5126 c5126 = this.f19878;
        c5126.f19605 = i;
        c5126.f19600 = i3;
        c5126.f19604 = i2;
        c5126.f19608 = i4;
        c4693.m10607(c5171, c5126);
        c5171.m11493(c5126.f19601);
        c5171.m11513(c5126.f19606);
        c5171.f19814 = c5126.f19603;
        c5171.m11484(c5126.f19607);
    }
}
