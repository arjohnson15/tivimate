package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.leanback.widget.RunnableC0183;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p061.AbstractC1361;
import p061.AbstractC1373;
import p061.AbstractC1402;
import p061.AbstractC1420;
import p061.C1398;
import p061.C1401;
import p061.C1408;
import p061.C1414;
import p061.C1423;
import p061.C1424;
import p061.C1425;
import p061.C1426;
import p061.C1427;
import p061.C1429;
import p061.C1434;
import p061.InterfaceC1369;
import p378.AbstractC4345;
import p456.C5349;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC1402 implements InterfaceC1369 {

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public int f1723;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f1724;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C1427 f1725;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean f1727;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final C1408 f1728;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f1729;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final AbstractC1420 f1730;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final int f1731;

    /* renamed from: יʻ, reason: contains not printable characters */
    public final BitSet f1732;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int[] f1733;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f1734;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C5349 f1735;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final RunnableC0183 f1736;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final AbstractC1420 f1737;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final C1424[] f1738;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final Rect f1739;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final int f1740;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C1414 f1742;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public boolean f1744;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public boolean f1743 = false;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public int f1741 = -1;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public int f1726 = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1731 = -1;
        this.f1744 = false;
        C5349 c5349 = new C5349(4);
        this.f1735 = c5349;
        this.f1724 = 2;
        this.f1739 = new Rect();
        this.f1742 = new C1414(this);
        this.f1727 = true;
        this.f1736 = new RunnableC0183(6, this);
        C1401 c1401M4814 = AbstractC1402.m4814(context, attributeSet, i, i2);
        int i3 = c1401M4814.f5715;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1250(null);
        if (i3 != this.f1740) {
            this.f1740 = i3;
            AbstractC1420 abstractC1420 = this.f1730;
            this.f1730 = this.f1737;
            this.f1737 = abstractC1420;
            m4838();
        }
        int i4 = c1401M4814.f5713;
        mo1250(null);
        if (i4 != this.f1731) {
            c5349.m12099();
            m4838();
            this.f1731 = i4;
            this.f1732 = new BitSet(this.f1731);
            this.f1738 = new C1424[this.f1731];
            for (int i5 = 0; i5 < this.f1731; i5++) {
                this.f1738[i5] = new C1424(this, i5);
            }
            m4838();
        }
        boolean z = c1401M4814.f5714;
        mo1250(null);
        C1427 c1427 = this.f1725;
        if (c1427 != null && c1427.f5838 != z) {
            c1427.f5838 = z;
        }
        this.f1744 = z;
        m4838();
        C1408 c1408 = new C1408();
        c1408.f5749 = true;
        c1408.f5750 = 0;
        c1408.f5751 = 0;
        this.f1728 = c1408;
        this.f1730 = AbstractC1420.m4913(this, this.f1740);
        this.f1737 = AbstractC1420.m4913(this, 1 - this.f1740);
    }

    /* renamed from: ˊˉ, reason: contains not printable characters */
    public static int m1333(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʻʿ */
    public final boolean mo1234() {
        return this.f1724 != 0;
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public final int m1334(C1426 c1426) {
        if (m4846() == 0) {
            return 0;
        }
        AbstractC1420 abstractC1420 = this.f1730;
        boolean z = !this.f1727;
        return AbstractC1361.m4732(c1426, abstractC1420, m1363(z), m1341(z), this, this.f1727, this.f1743);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x040c  */
    /* renamed from: ʻˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1335(p061.C1429 r17, p061.C1426 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1335(ʾـ.ⁱⁱ, ʾـ.ᵢᵢ, boolean):void");
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    public final void m1336(int i, C1429 c1429) {
        while (m4846() > 0) {
            View viewM4847 = m4847(0);
            if (this.f1730.mo4725(viewM4847) > i || this.f1730.mo4720(viewM4847) > i) {
                return;
            }
            C1434 c1434 = (C1434) viewM4847.getLayoutParams();
            c1434.getClass();
            if (((ArrayList) c1434.f5872.f5801).size() == 1) {
                return;
            }
            C1424 c1424 = c1434.f5872;
            ArrayList arrayList = (ArrayList) c1424.f5801;
            View view = (View) arrayList.remove(0);
            C1434 c14342 = (C1434) view.getLayoutParams();
            c14342.f5872 = null;
            if (arrayList.size() == 0) {
                c1424.f5799 = Integer.MIN_VALUE;
            }
            if (c14342.f5702.m4772() || c14342.f5702.m4780()) {
                c1424.f5803 -= ((StaggeredGridLayoutManager) c1424.f5802).f1730.mo4713(view);
            }
            c1424.f5797 = Integer.MIN_VALUE;
            m4823(viewM4847, c1429);
        }
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public final int m1337() {
        if (m4846() == 0) {
            return 0;
        }
        return AbstractC1402.m4815(m4847(0));
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public final int m1338(int i) {
        if (m4846() == 0) {
            return this.f1743 ? 1 : -1;
        }
        return (i < m1337()) != this.f1743 ? -1 : 1;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʾˈ */
    public final Parcelable mo796() {
        int iM4932;
        int iMo4716;
        int[] iArr;
        C1427 c1427 = this.f1725;
        if (c1427 != null) {
            C1427 c14272 = new C1427();
            c14272.f5839 = c1427.f5839;
            c14272.f5842 = c1427.f5842;
            c14272.f5836 = c1427.f5836;
            c14272.f5841 = c1427.f5841;
            c14272.f5837 = c1427.f5837;
            c14272.f5844 = c1427.f5844;
            c14272.f5838 = c1427.f5838;
            c14272.f5840 = c1427.f5840;
            c14272.f5843 = c1427.f5843;
            c14272.f5845 = c1427.f5845;
            return c14272;
        }
        C1427 c14273 = new C1427();
        c14273.f5838 = this.f1744;
        c14273.f5840 = this.f1729;
        c14273.f5843 = this.f1734;
        C5349 c5349 = this.f1735;
        if (c5349 == null || (iArr = (int[]) c5349.f20756) == null) {
            c14273.f5837 = 0;
        } else {
            c14273.f5844 = iArr;
            c14273.f5837 = iArr.length;
            c14273.f5845 = (ArrayList) c5349.f20757;
        }
        if (m4846() > 0) {
            c14273.f5842 = this.f1729 ? m1360() : m1337();
            View viewM1341 = this.f1743 ? m1341(true) : m1363(true);
            c14273.f5836 = viewM1341 != null ? AbstractC1402.m4815(viewM1341) : -1;
            int i = this.f1731;
            c14273.f5839 = i;
            c14273.f5841 = new int[i];
            for (int i2 = 0; i2 < this.f1731; i2++) {
                if (this.f1729) {
                    iM4932 = this.f1738[i2].m4937(Integer.MIN_VALUE);
                    if (iM4932 != Integer.MIN_VALUE) {
                        iMo4716 = this.f1730.mo4726();
                        iM4932 -= iMo4716;
                    }
                } else {
                    iM4932 = this.f1738[i2].m4932(Integer.MIN_VALUE);
                    if (iM4932 != Integer.MIN_VALUE) {
                        iMo4716 = this.f1730.mo4716();
                        iM4932 -= iMo4716;
                    }
                }
                c14273.f5841[i2] = iM4932;
            }
        } else {
            c14273.f5842 = -1;
            c14273.f5836 = -1;
            c14273.f5839 = 0;
        }
        return c14273;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʿʼ */
    public final boolean mo797() {
        return this.f1740 == 0;
    }

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public final boolean m1339() {
        int iM1337;
        if (m4846() != 0 && this.f1724 != 0 && this.f5728) {
            if (this.f1743) {
                iM1337 = m1360();
                m1337();
            } else {
                iM1337 = m1337();
                m1360();
            }
            C5349 c5349 = this.f1735;
            if (iM1337 == 0 && m1364() != null) {
                c5349.m12099();
                this.f5727 = true;
                m4838();
                return true;
            }
        }
        return false;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʿˏ */
    public final C1398 mo800(Context context, AttributeSet attributeSet) {
        return new C1434(context, attributeSet);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˆʼ */
    public final boolean mo1213() {
        return this.f1725 == null;
    }

    /* renamed from: ˆˋ, reason: contains not printable characters */
    public final void m1340(C1429 c1429, C1426 c1426, boolean z) {
        int iMo4716;
        int iM1345 = m1345(Integer.MAX_VALUE);
        if (iM1345 != Integer.MAX_VALUE && (iMo4716 = iM1345 - this.f1730.mo4716()) > 0) {
            int iM1358 = iMo4716 - m1358(iMo4716, c1429, c1426);
            if (!z || iM1358 <= 0) {
                return;
            }
            this.f1730.mo4717(-iM1358);
        }
    }

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public final View m1341(boolean z) {
        int iMo4716 = this.f1730.mo4716();
        int iMo4726 = this.f1730.mo4726();
        View view = null;
        for (int iM4846 = m4846() - 1; iM4846 >= 0; iM4846--) {
            View viewM4847 = m4847(iM4846);
            int iMo4722 = this.f1730.mo4722(viewM4847);
            int iMo4725 = this.f1730.mo4725(viewM4847);
            if (iMo4725 > iMo4716 && iMo4722 < iMo4726) {
                if (iMo4725 <= iMo4726 || !z) {
                    return viewM4847;
                }
                if (view == null) {
                    view = viewM4847;
                }
            }
        }
        return view;
    }

    /* renamed from: ˆˏ, reason: contains not printable characters */
    public final void m1342(int i) {
        C1408 c1408 = this.f1728;
        c1408.f5746 = i;
        c1408.f5752 = this.f1743 != (i == -1) ? -1 : 1;
    }

    /* renamed from: ˆﹶ, reason: contains not printable characters */
    public final void m1343(C1429 c1429, C1426 c1426, boolean z) {
        int iMo4726;
        int iM1357 = m1357(Integer.MIN_VALUE);
        if (iM1357 != Integer.MIN_VALUE && (iMo4726 = this.f1730.mo4726() - iM1357) > 0) {
            int i = iMo4726 - (-m1358(-iMo4726, c1429, c1426));
            if (!z || i <= 0) {
                return;
            }
            this.f1730.mo4717(i);
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public final void mo1344(int i) {
        if (i == 0) {
            m1339();
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final int m1345(int i) {
        int iM4932 = this.f1738[0].m4932(i);
        for (int i2 = 1; i2 < this.f1731; i2++) {
            int iM49322 = this.f1738[i2].m4932(i);
            if (iM49322 < iM4932) {
                iM4932 = iM49322;
            }
        }
        return iM4932;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˉⁱ */
    public final int mo1215(C1426 c1426) {
        return m1334(c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final void mo1346(int i) {
        super.mo1346(i);
        for (int i2 = 0; i2 < this.f1731; i2++) {
            C1424 c1424 = this.f1738[i2];
            int i3 = c1424.f5797;
            if (i3 != Integer.MIN_VALUE) {
                c1424.f5797 = i3 + i;
            }
            int i4 = c1424.f5799;
            if (i4 != Integer.MIN_VALUE) {
                c1424.f5799 = i4 + i;
            }
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˊﹶ */
    public final void mo812(Parcelable parcelable) {
        if (parcelable instanceof C1427) {
            C1427 c1427 = (C1427) parcelable;
            this.f1725 = c1427;
            if (this.f1741 != -1) {
                c1427.f5841 = null;
                c1427.f5839 = 0;
                c1427.f5842 = -1;
                c1427.f5836 = -1;
                c1427.f5841 = null;
                c1427.f5839 = 0;
                c1427.f5837 = 0;
                c1427.f5844 = null;
                c1427.f5845 = null;
            }
            m4838();
        }
    }

    /* renamed from: ˋʽ, reason: contains not printable characters */
    public final void m1347() {
        if (this.f1740 == 1 || !m1354()) {
            this.f1743 = this.f1744;
        } else {
            this.f1743 = !this.f1744;
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˋˊ */
    public final C1398 mo814(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1434((ViewGroup.MarginLayoutParams) layoutParams) : new C1434(layoutParams);
    }

    /* renamed from: ˋᴵ, reason: contains not printable characters */
    public final void m1348(int i, C1426 c1426) {
        int iM1337;
        int i2;
        if (i > 0) {
            iM1337 = m1360();
            i2 = 1;
        } else {
            iM1337 = m1337();
            i2 = -1;
        }
        C1408 c1408 = this.f1728;
        c1408.f5749 = true;
        m1365(iM1337, c1426);
        m1342(i2);
        c1408.f5748 = iM1337 + c1408.f5752;
        c1408.f5745 = Math.abs(i);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˋⁱ */
    public final int mo1217(C1426 c1426) {
        return m1352(c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final void mo1349(int i) {
        super.mo1349(i);
        for (int i2 = 0; i2 < this.f1731; i2++) {
            C1424 c1424 = this.f1738[i2];
            int i3 = c1424.f5797;
            if (i3 != Integer.MIN_VALUE) {
                c1424.f5797 = i3 + i;
            }
            int i4 = c1424.f5799;
            if (i4 != Integer.MIN_VALUE) {
                c1424.f5799 = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e  */
    @Override // p061.AbstractC1402
    /* renamed from: ˎˉ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1218(android.view.View r9, int r10, p061.C1429 r11, p061.C1426 r12) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1218(android.view.View, int, ʾـ.ⁱⁱ, ʾـ.ᵢᵢ):android.view.View");
    }

    /* renamed from: ˎי, reason: contains not printable characters */
    public final int m1350(C1426 c1426) {
        if (m4846() == 0) {
            return 0;
        }
        AbstractC1420 abstractC1420 = this.f1730;
        boolean z = !this.f1727;
        return AbstractC1361.m4731(c1426, abstractC1420, m1363(z), m1341(z), this, this.f1727);
    }

    /* renamed from: ˏʻ, reason: contains not printable characters */
    public final void m1351(View view, int i, int i2) {
        Rect rect = this.f1739;
        m4843(view, rect);
        C1434 c1434 = (C1434) view.getLayoutParams();
        int iM1333 = m1333(i, ((ViewGroup.MarginLayoutParams) c1434).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1434).rightMargin + rect.right);
        int iM13332 = m1333(i2, ((ViewGroup.MarginLayoutParams) c1434).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1434).bottomMargin + rect.bottom);
        if (m4830(view, iM1333, iM13332, c1434)) {
            view.measure(iM1333, iM13332);
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˏʾ */
    public final int mo1249(C1426 c1426) {
        return m1350(c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˏᴵ */
    public final int mo1219(C1426 c1426) {
        return m1334(c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˑʽ */
    public final void mo1250(String str) {
        if (this.f1725 == null) {
            super.mo1250(str);
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˑʾ */
    public final void mo1220(RecyclerView recyclerView, int i, int i2) {
        m1361(i, i2, 4);
    }

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public final int m1352(C1426 c1426) {
        if (m4846() == 0) {
            return 0;
        }
        AbstractC1420 abstractC1420 = this.f1730;
        boolean z = !this.f1727;
        return AbstractC1361.m4730(c1426, abstractC1420, m1363(z), m1341(z), this, this.f1727);
    }

    /* renamed from: ˑˉ, reason: contains not printable characters */
    public final void m1353(int i, C1429 c1429) {
        for (int iM4846 = m4846() - 1; iM4846 >= 0; iM4846--) {
            View viewM4847 = m4847(iM4846);
            if (this.f1730.mo4722(viewM4847) < i || this.f1730.mo4724(viewM4847) < i) {
                return;
            }
            C1434 c1434 = (C1434) viewM4847.getLayoutParams();
            c1434.getClass();
            if (((ArrayList) c1434.f5872.f5801).size() == 1) {
                return;
            }
            C1424 c1424 = c1434.f5872;
            ArrayList arrayList = (ArrayList) c1424.f5801;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C1434 c14342 = (C1434) view.getLayoutParams();
            c14342.f5872 = null;
            if (c14342.f5702.m4772() || c14342.f5702.m4780()) {
                c1424.f5803 -= ((StaggeredGridLayoutManager) c1424.f5802).f1730.mo4713(view);
            }
            if (size == 1) {
                c1424.f5797 = Integer.MIN_VALUE;
            }
            c1424.f5799 = Integer.MIN_VALUE;
            m4823(viewM4847, c1429);
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˑי */
    public final int mo1222(C1426 c1426) {
        return m1352(c1426);
    }

    /* renamed from: יʾ, reason: contains not printable characters */
    public final boolean m1354() {
        return m4829() == 1;
    }

    @Override // p061.AbstractC1402
    /* renamed from: יˊ */
    public final void mo1223(Rect rect, int i, int i2) {
        int iM4813;
        int iM48132;
        int i3 = this.f1731;
        int iM4848 = m4848() + m4835();
        int iM4833 = m4833() + m4824();
        if (this.f1740 == 1) {
            int iHeight = rect.height() + iM4833;
            RecyclerView recyclerView = this.f5717;
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            iM48132 = AbstractC1402.m4813(i2, iHeight, recyclerView.getMinimumHeight());
            iM4813 = AbstractC1402.m4813(i, (this.f1723 * i3) + iM4848, this.f5717.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM4848;
            RecyclerView recyclerView2 = this.f5717;
            WeakHashMap weakHashMap2 = AbstractC4345.f16838;
            iM4813 = AbstractC1402.m4813(i, iWidth, recyclerView2.getMinimumWidth());
            iM48132 = AbstractC1402.m4813(i2, (this.f1723 * i3) + iM4833, this.f5717.getMinimumHeight());
        }
        this.f5717.setMeasuredDimension(iM4813, iM48132);
    }

    @Override // p061.AbstractC1402
    /* renamed from: יˋ */
    public final void mo1255(AccessibilityEvent accessibilityEvent) {
        super.mo1255(accessibilityEvent);
        if (m4846() > 0) {
            View viewM1363 = m1363(false);
            View viewM1341 = m1341(false);
            if (viewM1363 == null || viewM1341 == null) {
                return;
            }
            int iM4815 = AbstractC1402.m4815(viewM1363);
            int iM48152 = AbstractC1402.m4815(viewM1341);
            if (iM4815 < iM48152) {
                accessibilityEvent.setFromIndex(iM4815);
                accessibilityEvent.setToIndex(iM48152);
            } else {
                accessibilityEvent.setFromIndex(iM48152);
                accessibilityEvent.setToIndex(iM4815);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* renamed from: יי, reason: contains not printable characters */
    public final int m1355(C1429 c1429, C1408 c1408, C1426 c1426) {
        C1424 c1424;
        ?? r6;
        int i;
        int iM4932;
        int iMo4713;
        int iMo4716;
        int iMo47132;
        int i2;
        int i3;
        int i4;
        int i5 = 1;
        this.f1732.set(0, this.f1731, true);
        C1408 c14082 = this.f1728;
        int i6 = c14082.f5753 ? c1408.f5746 == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c1408.f5746 == 1 ? c1408.f5751 + c1408.f5745 : c1408.f5750 - c1408.f5745;
        int i7 = c1408.f5746;
        for (int i8 = 0; i8 < this.f1731; i8++) {
            if (!((ArrayList) this.f1738[i8].f5801).isEmpty()) {
                m1362(this.f1738[i8], i7, i6);
            }
        }
        int iMo4726 = this.f1743 ? this.f1730.mo4726() : this.f1730.mo4716();
        boolean z = false;
        while (true) {
            int i9 = c1408.f5748;
            if (!(i9 >= 0 && i9 < c1426.m4948()) || (!c14082.f5753 && this.f1732.isEmpty())) {
                break;
            }
            View viewM4969 = c1429.m4969(c1408.f5748);
            c1408.f5748 += c1408.f5752;
            C1434 c1434 = (C1434) viewM4969.getLayoutParams();
            int iM4783 = c1434.f5702.m4783();
            C5349 c5349 = this.f1735;
            int[] iArr = (int[]) c5349.f20756;
            int i10 = (iArr == null || iM4783 >= iArr.length) ? -1 : iArr[iM4783];
            if (i10 == -1) {
                if (m1359(c1408.f5746)) {
                    i3 = this.f1731 - i5;
                    i2 = -1;
                    i4 = -1;
                } else {
                    i2 = this.f1731;
                    i3 = 0;
                    i4 = 1;
                }
                C1424 c14242 = null;
                if (c1408.f5746 == i5) {
                    int iMo47162 = this.f1730.mo4716();
                    int i11 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        C1424 c14243 = this.f1738[i3];
                        int iM4937 = c14243.m4937(iMo47162);
                        if (iM4937 < i11) {
                            i11 = iM4937;
                            c14242 = c14243;
                        }
                        i3 += i4;
                    }
                } else {
                    int iMo47262 = this.f1730.mo4726();
                    int i12 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        C1424 c14244 = this.f1738[i3];
                        int iM49322 = c14244.m4932(iMo47262);
                        if (iM49322 > i12) {
                            c14242 = c14244;
                            i12 = iM49322;
                        }
                        i3 += i4;
                    }
                }
                c1424 = c14242;
                c5349.m12095(iM4783);
                ((int[]) c5349.f20756)[iM4783] = c1424.f5798;
            } else {
                c1424 = this.f1738[i10];
            }
            c1434.f5872 = c1424;
            if (c1408.f5746 == 1) {
                r6 = 0;
                m4822(viewM4969, -1, false);
            } else {
                r6 = 0;
                m4822(viewM4969, 0, false);
            }
            if (this.f1740 == 1) {
                i = 1;
                m1351(viewM4969, AbstractC1402.m4816(r6, this.f1723, this.f5720, r6, ((ViewGroup.MarginLayoutParams) c1434).width), AbstractC1402.m4816(true, this.f5723, this.f5721, m4833() + m4824(), ((ViewGroup.MarginLayoutParams) c1434).height));
            } else {
                i = 1;
                m1351(viewM4969, AbstractC1402.m4816(true, this.f5729, this.f5720, m4848() + m4835(), ((ViewGroup.MarginLayoutParams) c1434).width), AbstractC1402.m4816(false, this.f1723, this.f5721, 0, ((ViewGroup.MarginLayoutParams) c1434).height));
            }
            if (c1408.f5746 == i) {
                iMo4713 = c1424.m4937(iMo4726);
                iM4932 = this.f1730.mo4713(viewM4969) + iMo4713;
            } else {
                iM4932 = c1424.m4932(iMo4726);
                iMo4713 = iM4932 - this.f1730.mo4713(viewM4969);
            }
            if (c1408.f5746 == 1) {
                C1424 c14245 = c1434.f5872;
                c14245.getClass();
                C1434 c14342 = (C1434) viewM4969.getLayoutParams();
                c14342.f5872 = c14245;
                ArrayList arrayList = (ArrayList) c14245.f5801;
                arrayList.add(viewM4969);
                c14245.f5799 = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c14245.f5797 = Integer.MIN_VALUE;
                }
                if (c14342.f5702.m4772() || c14342.f5702.m4780()) {
                    c14245.f5803 = ((StaggeredGridLayoutManager) c14245.f5802).f1730.mo4713(viewM4969) + c14245.f5803;
                }
            } else {
                C1424 c14246 = c1434.f5872;
                c14246.getClass();
                C1434 c14343 = (C1434) viewM4969.getLayoutParams();
                c14343.f5872 = c14246;
                ArrayList arrayList2 = (ArrayList) c14246.f5801;
                arrayList2.add(0, viewM4969);
                c14246.f5797 = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c14246.f5799 = Integer.MIN_VALUE;
                }
                if (c14343.f5702.m4772() || c14343.f5702.m4780()) {
                    c14246.f5803 = ((StaggeredGridLayoutManager) c14246.f5802).f1730.mo4713(viewM4969) + c14246.f5803;
                }
            }
            if (m1354() && this.f1740 == 1) {
                iMo47132 = this.f1737.mo4726() - (((this.f1731 - 1) - c1424.f5798) * this.f1723);
                iMo4716 = iMo47132 - this.f1737.mo4713(viewM4969);
            } else {
                iMo4716 = this.f1737.mo4716() + (c1424.f5798 * this.f1723);
                iMo47132 = this.f1737.mo4713(viewM4969) + iMo4716;
            }
            if (this.f1740 == 1) {
                AbstractC1402.m4819(viewM4969, iMo4716, iMo4713, iMo47132, iM4932);
            } else {
                AbstractC1402.m4819(viewM4969, iMo4713, iMo4716, iM4932, iMo47132);
            }
            m1362(c1424, c14082.f5746, i6);
            m1356(c1429, c14082);
            if (c14082.f5747 && viewM4969.hasFocusable()) {
                this.f1732.set(c1424.f5798, false);
            }
            i5 = 1;
            z = true;
        }
        if (!z) {
            m1356(c1429, c14082);
        }
        int iMo47163 = c14082.f5746 == -1 ? this.f1730.mo4716() - m1345(this.f1730.mo4716()) : m1357(this.f1730.mo4726()) - this.f1730.mo4726();
        if (iMo47163 > 0) {
            return Math.min(c1408.f5745, iMo47163);
        }
        return 0;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ـᵎ */
    public final void mo826() {
        this.f1735.m12099();
        m4838();
    }

    /* renamed from: ـᵢ, reason: contains not printable characters */
    public final void m1356(C1429 c1429, C1408 c1408) {
        if (!c1408.f5749 || c1408.f5753) {
            return;
        }
        if (c1408.f5745 == 0) {
            if (c1408.f5746 == -1) {
                m1353(c1408.f5751, c1429);
                return;
            } else {
                m1336(c1408.f5750, c1429);
                return;
            }
        }
        int i = 1;
        if (c1408.f5746 == -1) {
            int i2 = c1408.f5750;
            int iM4932 = this.f1738[0].m4932(i2);
            while (i < this.f1731) {
                int iM49322 = this.f1738[i].m4932(i2);
                if (iM49322 > iM4932) {
                    iM4932 = iM49322;
                }
                i++;
            }
            int i3 = i2 - iM4932;
            m1353(i3 < 0 ? c1408.f5751 : c1408.f5751 - Math.min(i3, c1408.f5745), c1429);
            return;
        }
        int i4 = c1408.f5751;
        int iM4937 = this.f1738[0].m4937(i4);
        while (i < this.f1731) {
            int iM49372 = this.f1738[i].m4937(i4);
            if (iM49372 < iM4937) {
                iM4937 = iM49372;
            }
            i++;
        }
        int i5 = iM4937 - c1408.f5751;
        m1336(i5 < 0 ? c1408.f5750 : Math.min(i5, c1408.f5745) + c1408.f5750, c1429);
    }

    @Override // p061.InterfaceC1369
    /* renamed from: ـﹶ */
    public final PointF mo1258(int i) {
        int iM1338 = m1338(i);
        PointF pointF = new PointF();
        if (iM1338 == 0) {
            return null;
        }
        if (this.f1740 == 0) {
            pointF.x = iM1338;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iM1338;
        }
        return pointF;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ٴˎ */
    public final boolean mo828() {
        return this.f1740 == 1;
    }

    /* renamed from: ٴᵔ, reason: contains not printable characters */
    public final int m1357(int i) {
        int iM4937 = this.f1738[0].m4937(i);
        for (int i2 = 1; i2 < this.f1731; i2++) {
            int iM49372 = this.f1738[i2].m4937(i);
            if (iM49372 > iM4937) {
                iM4937 = iM49372;
            }
        }
        return iM4937;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ٴﹶ */
    public final void mo831(int i, int i2) {
        m1361(i, i2, 1);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᐧʻ */
    public final boolean mo832(C1398 c1398) {
        return c1398 instanceof C1434;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᴵʿ */
    public final int mo1260(C1426 c1426) {
        return m1350(c1426);
    }

    /* renamed from: ᴵˊ, reason: contains not printable characters */
    public final int m1358(int i, C1429 c1429, C1426 c1426) {
        if (m4846() == 0 || i == 0) {
            return 0;
        }
        m1348(i, c1426);
        C1408 c1408 = this.f1728;
        int iM1355 = m1355(c1429, c1408, c1426);
        if (c1408.f5745 >= iM1355) {
            i = i < 0 ? -iM1355 : iM1355;
        }
        this.f1730.mo4717(-i);
        this.f1729 = this.f1743;
        c1408.f5745 = 0;
        m1356(c1429, c1408);
        return i;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵎʽ */
    public final void mo836(AbstractC1373 abstractC1373) {
        this.f1735.m12099();
        for (int i = 0; i < this.f1731; i++) {
            this.f1738[i].m4930();
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵎʾ */
    public final void mo837(int i, int i2) {
        m1361(i, i2, 2);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵎᵢ */
    public final void mo839(int i, int i2) {
        m1361(i, i2, 8);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵔˋ */
    public final int mo841(int i, C1429 c1429, C1426 c1426) {
        return m1358(i, c1429, c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢˆ */
    public final int mo843(int i, C1429 c1429, C1426 c1426) {
        return m1358(i, c1429, c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢˎ */
    public final void mo844(RecyclerView recyclerView, int i) {
        C1425 c1425 = new C1425(recyclerView.getContext());
        c1425.f5814 = i;
        mo823(c1425);
    }

    /* renamed from: ᵢᴵ, reason: contains not printable characters */
    public final boolean m1359(int i) {
        if (this.f1740 == 0) {
            return (i == -1) != this.f1743;
        }
        return ((i == -1) == this.f1743) == m1354();
    }

    /* renamed from: ᵢⁱ, reason: contains not printable characters */
    public final int m1360() {
        int iM4846 = m4846();
        if (iM4846 == 0) {
            return 0;
        }
        return AbstractC1402.m4815(m4847(iM4846 - 1));
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢﹶ */
    public final void mo848(int i) {
        C1427 c1427 = this.f1725;
        if (c1427 != null && c1427.f5842 != i) {
            c1427.f5841 = null;
            c1427.f5839 = 0;
            c1427.f5842 = -1;
            c1427.f5836 = -1;
        }
        this.f1741 = i;
        this.f1726 = Integer.MIN_VALUE;
        m4838();
    }

    @Override // p061.AbstractC1402
    /* renamed from: ⁱʿ */
    public final void mo1265(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5717;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1736);
        }
        for (int i = 0; i < this.f1731; i++) {
            this.f1738[i].m4930();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
    /* renamed from: ⁱˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1361(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1361(int, int, int):void");
    }

    /* renamed from: ⁱᵎ, reason: contains not printable characters */
    public final void m1362(C1424 c1424, int i, int i2) {
        int i3 = c1424.f5803;
        int i4 = c1424.f5798;
        if (i != -1) {
            int i5 = c1424.f5799;
            if (i5 == Integer.MIN_VALUE) {
                c1424.m4939();
                i5 = c1424.f5799;
            }
            if (i5 - i3 >= i2) {
                this.f1732.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c1424.f5797;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) c1424.f5801).get(0);
            C1434 c1434 = (C1434) view.getLayoutParams();
            c1424.f5797 = ((StaggeredGridLayoutManager) c1424.f5802).f1730.mo4722(view);
            c1434.getClass();
            i6 = c1424.f5797;
        }
        if (i6 + i3 <= i2) {
            this.f1732.set(i4, false);
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ⁱⁱ */
    public final void mo851(C1429 c1429, C1426 c1426) {
        m1335(c1429, c1426, true);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public final View m1363(boolean z) {
        int iMo4716 = this.f1730.mo4716();
        int iMo4726 = this.f1730.mo4726();
        int iM4846 = m4846();
        View view = null;
        for (int i = 0; i < iM4846; i++) {
            View viewM4847 = m4847(i);
            int iMo4722 = this.f1730.mo4722(viewM4847);
            if (this.f1730.mo4725(viewM4847) > iMo4716 && iMo4722 < iMo4726) {
                if (iMo4722 >= iMo4716 || !z) {
                    return viewM4847;
                }
                if (view == null) {
                    view = viewM4847;
                }
            }
        }
        return view;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﹳˎ */
    public final C1398 mo856() {
        return this.f1740 == 0 ? new C1434(-2, -1) : new C1434(-1, -2);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﹶˆ */
    public final void mo858(int i, int i2, C1426 c1426, C1423 c1423) {
        C1408 c1408;
        int iM4937;
        int iM4932;
        if (this.f1740 != 0) {
            i = i2;
        }
        if (m4846() == 0 || i == 0) {
            return;
        }
        m1348(i, c1426);
        int[] iArr = this.f1733;
        if (iArr == null || iArr.length < this.f1731) {
            this.f1733 = new int[this.f1731];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f1731;
            c1408 = this.f1728;
            if (i3 >= i5) {
                break;
            }
            if (c1408.f5752 == -1) {
                iM4937 = c1408.f5750;
                iM4932 = this.f1738[i3].m4932(iM4937);
            } else {
                iM4937 = this.f1738[i3].m4937(c1408.f5751);
                iM4932 = c1408.f5751;
            }
            int i6 = iM4937 - iM4932;
            if (i6 >= 0) {
                this.f1733[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f1733, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c1408.f5748;
            if (i8 < 0 || i8 >= c1426.m4948()) {
                return;
            }
            c1423.m4925(c1408.f5748, this.f1733[i7]);
            c1408.f5748 += c1408.f5752;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002c A[SYNTHETIC] */
    /* renamed from: ﾞי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m1364() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1364():android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* renamed from: ﾞﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1365(int r5, p061.C1426 r6) {
        /*
            r4 = this;
            ʾـ.ᴵʼ r0 = r4.f1728
            r1 = 0
            r0.f5745 = r1
            r0.f5748 = r5
            boolean r2 = r4.m4840()
            r3 = 1
            if (r2 == 0) goto L2d
            int r6 = r6.f5830
            r2 = -1
            if (r6 == r2) goto L2d
            boolean r2 = r4.f1743
            if (r6 >= r5) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = 0
        L1a:
            if (r2 != r5) goto L24
            ʾـ.ᵔٴ r5 = r4.f1730
            int r5 = r5.mo4723()
        L22:
            r6 = 0
            goto L2f
        L24:
            ʾـ.ᵔٴ r5 = r4.f1730
            int r5 = r5.mo4723()
            r6 = r5
            r5 = 0
            goto L2f
        L2d:
            r5 = 0
            goto L22
        L2f:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f5717
            if (r2 == 0) goto L4a
            boolean r2 = r2.f1673
            if (r2 == 0) goto L4a
            ʾـ.ᵔٴ r2 = r4.f1730
            int r2 = r2.mo4716()
            int r2 = r2 - r6
            r0.f5750 = r2
            ʾـ.ᵔٴ r6 = r4.f1730
            int r6 = r6.mo4726()
            int r6 = r6 + r5
            r0.f5751 = r6
            goto L56
        L4a:
            ʾـ.ᵔٴ r2 = r4.f1730
            int r2 = r2.mo4719()
            int r2 = r2 + r5
            r0.f5751 = r2
            int r5 = -r6
            r0.f5750 = r5
        L56:
            r0.f5747 = r1
            r0.f5749 = r3
            ʾـ.ᵔٴ r5 = r4.f1730
            int r5 = r5.mo4718()
            if (r5 != 0) goto L6b
            ʾـ.ᵔٴ r5 = r4.f1730
            int r5 = r5.mo4719()
            if (r5 != 0) goto L6b
            r1 = 1
        L6b:
            r0.f5753 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1365(int, ʾـ.ᵢᵢ):void");
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﾞﾞ */
    public final void mo863(C1426 c1426) {
        this.f1741 = -1;
        this.f1726 = Integer.MIN_VALUE;
        this.f1725 = null;
        this.f1742.m4908();
    }
}
