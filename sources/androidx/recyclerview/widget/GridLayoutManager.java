package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p061.AbstractC1402;
import p061.C1363;
import p061.C1394;
import p061.C1397;
import p061.C1398;
import p061.C1423;
import p061.C1426;
import p061.C1429;
import p061.C1440;
import p204.C2784;
import p331.C3759;
import p378.AbstractC4345;
import p447.AbstractC5179;
import ˊﹶ.ˋˉ;
import ـˈ.ˉᵎ;
import ᵎﹳ.ᐧʻ;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f1615;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final SparseIntArray f1616;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final SparseIntArray f1617;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f1618;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C3759 f1619;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int[] f1620;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public View[] f1621;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final Rect f1622;

    public GridLayoutManager(int i) {
        super(1);
        this.f1618 = false;
        this.f1615 = -1;
        this.f1616 = new SparseIntArray();
        this.f1617 = new SparseIntArray();
        this.f1619 = new C3759((byte) 0, 4);
        this.f1622 = new Rect();
        m1227(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1618 = false;
        this.f1615 = -1;
        this.f1616 = new SparseIntArray();
        this.f1617 = new SparseIntArray();
        this.f1619 = new C3759((byte) 0, 4);
        this.f1622 = new Rect();
        m1227(AbstractC1402.m4814(context, attributeSet, i, i2).f5713);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʻﹳ */
    public final void mo793(C1429 c1429, C1426 c1426, C2784 c2784) {
        super.mo793(c1429, c1426, c2784);
        c2784.m7063(GridView.class.getName());
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʽˆ */
    public final void mo795(C1429 c1429, C1426 c1426, View view, C2784 c2784) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1397)) {
            m4825(view, c2784);
            return;
        }
        C1397 c1397 = (C1397) layoutParams;
        int iM1214 = m1214(c1397.f5702.m4783(), c1429, c1426);
        if (this.f1629 == 0) {
            c2784.m7056(ˋˉ.ˎˑ(false, c1397.f5698, c1397.f5699, iM1214, 1));
        } else {
            c2784.m7056(ˋˉ.ˎˑ(false, iM1214, 1, c1397.f5698, c1397.f5699));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: ʿˉ, reason: contains not printable characters */
    public final void mo1212(C1426 c1426, C1394 c1394, C1423 c1423) {
        int i;
        int i2 = this.f1615;
        for (int i3 = 0; i3 < this.f1615 && (i = c1394.f5689) >= 0 && i < c1426.m4948() && i2 > 0; i3++) {
            c1423.m4925(c1394.f5689, Math.max(0, c1394.f5688));
            this.f1619.getClass();
            i2--;
            c1394.f5689 += c1394.f5680;
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʿˏ */
    public final C1398 mo800(Context context, AttributeSet attributeSet) {
        C1397 c1397 = new C1397(context, attributeSet);
        c1397.f5698 = -1;
        c1397.f5699 = 0;
        return c1397;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p061.AbstractC1402
    /* renamed from: ˆʼ, reason: contains not printable characters */
    public final boolean mo1213() {
        return this.f1635 == null && !this.f1618;
    }

    /* renamed from: ˉʽ, reason: contains not printable characters */
    public final int m1214(int i, C1429 c1429, C1426 c1426) {
        boolean z = c1426.f5832;
        C3759 c3759 = this.f1619;
        if (!z) {
            int i2 = this.f1615;
            c3759.getClass();
            return C3759.m8746(i, i2);
        }
        int iM4957 = c1429.m4957(i);
        if (iM4957 != -1) {
            int i3 = this.f1615;
            c3759.getClass();
            return C3759.m8746(iM4957, i3);
        }
        String str = "Cannot find span size for pre layout position. " + i;
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p061.AbstractC1402
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int mo1215(C1426 c1426) {
        return m1235(c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˋˊ */
    public final C1398 mo814(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C1397 c1397 = new C1397((ViewGroup.MarginLayoutParams) layoutParams);
            c1397.f5698 = -1;
            c1397.f5699 = 0;
            return c1397;
        }
        C1397 c13972 = new C1397(layoutParams);
        c13972.f5698 = -1;
        c13972.f5699 = 0;
        return c13972;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: ˋᴵ, reason: contains not printable characters */
    public final void mo1216(C1429 c1429, C1426 c1426, C1394 c1394, C1363 c1363) {
        int i;
        int i2;
        int i3;
        int iMo4721;
        int iM4835;
        int iM4824;
        int iMo47212;
        int iM4816;
        int iM48162;
        boolean z;
        int i4;
        View viewM4805;
        int iMo4715 = this.f1628.mo4715();
        boolean z2 = iMo4715 != 1073741824;
        int i5 = m4846() > 0 ? this.f1620[this.f1615] : 0;
        if (z2) {
            m1231();
        }
        boolean z3 = c1394.f5680 == 1;
        int iM1224 = this.f1615;
        if (!z3) {
            iM1224 = m1224(c1394.f5689, c1429, c1426) + m1221(c1394.f5689, c1429, c1426);
        }
        int i6 = 0;
        while (i6 < this.f1615 && (i4 = c1394.f5689) >= 0 && i4 < c1426.m4948() && iM1224 > 0) {
            int i7 = c1394.f5689;
            int iM1221 = m1221(i7, c1429, c1426);
            if (iM1221 > this.f1615) {
                throw new IllegalArgumentException(AbstractC5179.m11550(ᐧʻ.ᵎـ("Item at position ", i7, " requires ", iM1221, " spans but GridLayoutManager has only "), this.f1615, " spans."));
            }
            iM1224 -= iM1221;
            if (iM1224 < 0 || (viewM4805 = c1394.m4805(c1429)) == null) {
                break;
            }
            this.f1621[i6] = viewM4805;
            i6++;
        }
        if (i6 == 0) {
            c1363.f5527 = true;
            return;
        }
        if (z3) {
            i2 = i6;
            i = 0;
            i3 = 1;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.f1621[i];
            C1397 c1397 = (C1397) view.getLayoutParams();
            int iM12212 = m1221(AbstractC1402.m4815(view), c1429, c1426);
            c1397.f5699 = iM12212;
            c1397.f5698 = i8;
            i8 += iM12212;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f1621[i10];
            if (c1394.f5683 != null) {
                z = false;
                if (z3) {
                    m4822(view2, -1, true);
                } else {
                    m4822(view2, 0, true);
                }
            } else if (z3) {
                z = false;
                m4822(view2, -1, false);
            } else {
                z = false;
                m4822(view2, 0, false);
            }
            m4843(view2, this.f1622);
            m1226(view2, iMo4715, z);
            int iMo4713 = this.f1628.mo4713(view2);
            if (iMo4713 > i9) {
                i9 = iMo4713;
            }
            float fMo4721 = (this.f1628.mo4721(view2) * 1.0f) / ((C1397) view2.getLayoutParams()).f5699;
            if (fMo4721 > f) {
                f = fMo4721;
            }
        }
        if (z2) {
            m1230(Math.max(Math.round(f * this.f1615), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f1621[i11];
                m1226(view3, 1073741824, true);
                int iMo47132 = this.f1628.mo4713(view3);
                if (iMo47132 > i9) {
                    i9 = iMo47132;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f1621[i12];
            if (this.f1628.mo4713(view4) != i9) {
                C1397 c13972 = (C1397) view4.getLayoutParams();
                Rect rect = c13972.f5700;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c13972).topMargin + ((ViewGroup.MarginLayoutParams) c13972).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c13972).leftMargin + ((ViewGroup.MarginLayoutParams) c13972).rightMargin;
                int iM1232 = m1232(c13972.f5698, c13972.f5699);
                if (this.f1629 == 1) {
                    iM48162 = AbstractC1402.m4816(false, iM1232, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c13972).width);
                    iM4816 = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iM4816 = AbstractC1402.m4816(false, iM1232, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c13972).height);
                    iM48162 = iMakeMeasureSpec;
                }
                if (m4826(view4, iM48162, iM4816, (C1398) view4.getLayoutParams())) {
                    view4.measure(iM48162, iM4816);
                }
            }
        }
        c1363.f5529 = i9;
        if (this.f1629 != 1) {
            if (c1394.f5687 == -1) {
                int i15 = c1394.f5679;
                iM4835 = i15 - i9;
                iMo4721 = i15;
            } else {
                int i16 = c1394.f5679;
                iMo4721 = i16 + i9;
                iM4835 = i16;
            }
            iM4824 = 0;
            iMo47212 = 0;
        } else if (c1394.f5687 == -1) {
            iMo47212 = c1394.f5679;
            iM4824 = iMo47212 - i9;
            iM4835 = 0;
            iMo4721 = 0;
        } else {
            int i17 = c1394.f5679;
            iM4824 = i17;
            iMo4721 = 0;
            iMo47212 = i17 + i9;
            iM4835 = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.f1621[i18];
            C1397 c13973 = (C1397) view5.getLayoutParams();
            if (this.f1629 != 1) {
                iM4824 = m4824() + this.f1620[c13973.f5698];
                iMo47212 = this.f1628.mo4721(view5) + iM4824;
            } else if (m1263()) {
                int iM48352 = m4835() + this.f1620[this.f1615 - c13973.f5698];
                iMo4721 = iM48352;
                iM4835 = iM48352 - this.f1628.mo4721(view5);
            } else {
                iM4835 = m4835() + this.f1620[c13973.f5698];
                iMo4721 = this.f1628.mo4721(view5) + iM4835;
            }
            AbstractC1402.m4819(view5, iM4835, iM4824, iMo4721, iMo47212);
            if (c13973.f5702.m4772() || c13973.f5702.m4780()) {
                c1363.f5528 = true;
            }
            c1363.f5530 = view5.hasFocusable() | c1363.f5530;
        }
        Arrays.fill(this.f1621, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p061.AbstractC1402
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int mo1217(C1426 c1426) {
        return m1251(c1426);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:
    
        if (r13 == (r2 > r15)) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0106  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p061.AbstractC1402
    /* renamed from: ˎˉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1218(android.view.View r23, int r24, p061.C1429 r25, p061.C1426 r26) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1218(android.view.View, int, ʾـ.ⁱⁱ, ʾـ.ᵢᵢ):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p061.AbstractC1402
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final int mo1219(C1426 c1426) {
        return m1235(c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˑʾ, reason: contains not printable characters */
    public final void mo1220(RecyclerView recyclerView, int i, int i2) {
        C3759 c3759 = this.f1619;
        c3759.m8757();
        ((SparseIntArray) c3759.f14523).clear();
    }

    /* renamed from: ˑˏ, reason: contains not printable characters */
    public final int m1221(int i, C1429 c1429, C1426 c1426) {
        boolean z = c1426.f5832;
        C3759 c3759 = this.f1619;
        if (!z) {
            c3759.getClass();
            return 1;
        }
        int i2 = this.f1616.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c1429.m4957(i) != -1) {
            c3759.getClass();
            return 1;
        }
        String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i;
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p061.AbstractC1402
    /* renamed from: ˑי, reason: contains not printable characters */
    public final int mo1222(C1426 c1426) {
        return m1251(c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: יˊ, reason: contains not printable characters */
    public final void mo1223(Rect rect, int i, int i2) {
        int iM4813;
        int iM48132;
        if (this.f1620 == null) {
            super.mo1223(rect, i, i2);
        }
        int iM4848 = m4848() + m4835();
        int iM4833 = m4833() + m4824();
        if (this.f1629 == 1) {
            int iHeight = rect.height() + iM4833;
            RecyclerView recyclerView = this.f5717;
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            iM48132 = AbstractC1402.m4813(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f1620;
            iM4813 = AbstractC1402.m4813(i, iArr[iArr.length - 1] + iM4848, this.f5717.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM4848;
            RecyclerView recyclerView2 = this.f5717;
            WeakHashMap weakHashMap2 = AbstractC4345.f16838;
            iM4813 = AbstractC1402.m4813(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f1620;
            iM48132 = AbstractC1402.m4813(i2, iArr2[iArr2.length - 1] + iM4833, this.f5717.getMinimumHeight());
        }
        this.f5717.setMeasuredDimension(iM4813, iM48132);
    }

    /* renamed from: יᵎ, reason: contains not printable characters */
    public final int m1224(int i, C1429 c1429, C1426 c1426) {
        boolean z = c1426.f5832;
        C3759 c3759 = this.f1619;
        if (!z) {
            int i2 = this.f1615;
            c3759.getClass();
            return i % i2;
        }
        int i3 = this.f1617.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM4957 = c1429.m4957(i);
        if (iM4957 != -1) {
            int i4 = this.f1615;
            c3759.getClass();
            return iM4957 % i4;
        }
        String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i;
        return 0;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ـᵎ */
    public final void mo826() {
        C3759 c3759 = this.f1619;
        c3759.m8757();
        ((SparseIntArray) c3759.f14523).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: ـᵢ, reason: contains not printable characters */
    public final void mo1225(C1429 c1429, C1426 c1426, C1440 c1440, int i) {
        m1231();
        if (c1426.m4948() > 0 && !c1426.f5832) {
            boolean z = i == 1;
            int iM1224 = m1224(c1440.f5905, c1429, c1426);
            if (z) {
                while (iM1224 > 0) {
                    int i2 = c1440.f5905;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c1440.f5905 = i3;
                    iM1224 = m1224(i3, c1429, c1426);
                }
            } else {
                int iM4948 = c1426.m4948() - 1;
                int i4 = c1440.f5905;
                while (i4 < iM4948) {
                    int i5 = i4 + 1;
                    int iM12242 = m1224(i5, c1429, c1426);
                    if (iM12242 <= iM1224) {
                        break;
                    }
                    i4 = i5;
                    iM1224 = iM12242;
                }
                c1440.f5905 = i4;
            }
        }
        m1229();
    }

    @Override // p061.AbstractC1402
    /* renamed from: ٴﹶ */
    public final void mo831(int i, int i2) {
        C3759 c3759 = this.f1619;
        c3759.m8757();
        ((SparseIntArray) c3759.f14523).clear();
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᐧʻ */
    public final boolean mo832(C1398 c1398) {
        return c1398 instanceof C1397;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵎʾ */
    public final void mo837(int i, int i2) {
        C3759 c3759 = this.f1619;
        c3759.m8757();
        ((SparseIntArray) c3759.f14523).clear();
    }

    /* renamed from: ᵎˑ, reason: contains not printable characters */
    public final void m1226(View view, int i, boolean z) {
        int iM4816;
        int iM48162;
        C1397 c1397 = (C1397) view.getLayoutParams();
        Rect rect = c1397.f5700;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1397).topMargin + ((ViewGroup.MarginLayoutParams) c1397).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1397).leftMargin + ((ViewGroup.MarginLayoutParams) c1397).rightMargin;
        int iM1232 = m1232(c1397.f5698, c1397.f5699);
        if (this.f1629 == 1) {
            iM48162 = AbstractC1402.m4816(false, iM1232, i, i3, ((ViewGroup.MarginLayoutParams) c1397).width);
            iM4816 = AbstractC1402.m4816(true, this.f1628.mo4723(), this.f5721, i2, ((ViewGroup.MarginLayoutParams) c1397).height);
        } else {
            int iM48163 = AbstractC1402.m4816(false, iM1232, i, i2, ((ViewGroup.MarginLayoutParams) c1397).height);
            int iM48164 = AbstractC1402.m4816(true, this.f1628.mo4723(), this.f5720, i3, ((ViewGroup.MarginLayoutParams) c1397).width);
            iM4816 = iM48163;
            iM48162 = iM48164;
        }
        C1398 c1398 = (C1398) view.getLayoutParams();
        if (z ? m4826(view, iM48162, iM4816, c1398) : m4830(view, iM48162, iM4816, c1398)) {
            view.measure(iM48162, iM4816);
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵎᵢ */
    public final void mo839(int i, int i2) {
        C3759 c3759 = this.f1619;
        c3759.m8757();
        ((SparseIntArray) c3759.f14523).clear();
    }

    /* renamed from: ᵔˊ, reason: contains not printable characters */
    public final void m1227(int i) {
        if (i == this.f1615) {
            return;
        }
        this.f1618 = true;
        if (i < 1) {
            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Span count should be at least 1. Provided ", i));
        }
        this.f1615 = i;
        this.f1619.m8757();
        m4838();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p061.AbstractC1402
    /* renamed from: ᵔˋ */
    public final int mo841(int i, C1429 c1429, C1426 c1426) {
        m1231();
        m1229();
        return super.mo841(i, c1429, c1426);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p061.AbstractC1402
    /* renamed from: ᵢˆ */
    public final int mo843(int i, C1429 c1429, C1426 c1426) {
        m1231();
        m1229();
        return super.mo843(i, c1429, c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢٴ */
    public final int mo845(C1429 c1429, C1426 c1426) {
        if (this.f1629 == 0) {
            return this.f1615;
        }
        if (c1426.m4948() < 1) {
            return 0;
        }
        return m1214(c1426.m4948() - 1, c1429, c1426) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: ⁱˏ, reason: contains not printable characters */
    public final View mo1228(C1429 c1429, C1426 c1426, boolean z, boolean z2) {
        int i;
        int iM4846;
        int iM48462 = m4846();
        int i2 = 1;
        if (z2) {
            iM4846 = m4846() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM48462;
            iM4846 = 0;
        }
        int iM4948 = c1426.m4948();
        m1241();
        int iMo4716 = this.f1628.mo4716();
        int iMo4726 = this.f1628.mo4726();
        View view = null;
        View view2 = null;
        while (iM4846 != i) {
            View viewM4847 = m4847(iM4846);
            int iM4815 = AbstractC1402.m4815(viewM4847);
            if (iM4815 >= 0 && iM4815 < iM4948 && m1224(iM4815, c1429, c1426) == 0) {
                if (((C1398) viewM4847.getLayoutParams()).f5702.m4772()) {
                    if (view2 == null) {
                        view2 = viewM4847;
                    }
                } else {
                    if (this.f1628.mo4722(viewM4847) < iMo4726 && this.f1628.mo4725(viewM4847) >= iMo4716) {
                        return viewM4847;
                    }
                    if (view == null) {
                        view = viewM4847;
                    }
                }
            }
            iM4846 += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p061.AbstractC1402
    /* renamed from: ⁱⁱ */
    public final void mo851(C1429 c1429, C1426 c1426) {
        boolean z = c1426.f5832;
        SparseIntArray sparseIntArray = this.f1617;
        SparseIntArray sparseIntArray2 = this.f1616;
        if (z) {
            int iM4846 = m4846();
            for (int i = 0; i < iM4846; i++) {
                C1397 c1397 = (C1397) m4847(i).getLayoutParams();
                int iM4783 = c1397.f5702.m4783();
                sparseIntArray2.put(iM4783, c1397.f5699);
                sparseIntArray.put(iM4783, c1397.f5698);
            }
        }
        super.mo851(c1429, c1426);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    /* renamed from: ⁱﹳ, reason: contains not printable characters */
    public final void m1229() {
        View[] viewArr = this.f1621;
        if (viewArr == null || viewArr.length != this.f1615) {
            this.f1621 = new View[this.f1615];
        }
    }

    /* renamed from: ⁱﾞ, reason: contains not printable characters */
    public final void m1230(int i) {
        int i2;
        int[] iArr = this.f1620;
        int i3 = this.f1615;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f1620 = iArr;
    }

    /* renamed from: ﹳˋ, reason: contains not printable characters */
    public final void m1231() {
        int iM4833;
        int iM4824;
        if (this.f1629 == 1) {
            iM4833 = this.f5729 - m4848();
            iM4824 = m4835();
        } else {
            iM4833 = this.f5723 - m4833();
            iM4824 = m4824();
        }
        m1230(iM4833 - iM4824);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p061.AbstractC1402
    /* renamed from: ﹳˎ */
    public final C1398 mo856() {
        return this.f1629 == 0 ? new C1397(-2, -1) : new C1397(-1, -2);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﹳˑ */
    public final int mo857(C1429 c1429, C1426 c1426) {
        if (this.f1629 == 1) {
            return this.f1615;
        }
        if (c1426.m4948() < 1) {
            return 0;
        }
        return m1214(c1426.m4948() - 1, c1429, c1426) + 1;
    }

    /* renamed from: ﾞʾ, reason: contains not printable characters */
    public final int m1232(int i, int i2) {
        if (this.f1629 != 1 || !m1263()) {
            int[] iArr = this.f1620;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1620;
        int i3 = this.f1615;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: ﾞﹳ, reason: contains not printable characters */
    public final void mo1233(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo1233(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p061.AbstractC1402
    /* renamed from: ﾞﾞ */
    public final void mo863(C1426 c1426) {
        super.mo863(c1426);
        this.f1618 = false;
    }
}
