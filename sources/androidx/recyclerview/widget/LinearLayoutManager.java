package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import p061.AbstractC1361;
import p061.AbstractC1402;
import p061.AbstractC1420;
import p061.C1363;
import p061.C1393;
import p061.C1394;
import p061.C1398;
import p061.C1401;
import p061.C1423;
import p061.C1425;
import p061.C1426;
import p061.C1429;
import p061.C1440;
import p061.InterfaceC1369;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC1402 implements InterfaceC1369 {

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public boolean f1623;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f1624;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final C1440 f1625;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public boolean f1626;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int[] f1627;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public AbstractC1420 f1628;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f1629;

    /* renamed from: יʻ, reason: contains not printable characters */
    public int f1630;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1363 f1631;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public boolean f1632;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public C1394 f1633;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final boolean f1634;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public C1393 f1635;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public int f1636;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean f1637;

    public LinearLayoutManager(int i) {
        this.f1629 = 1;
        this.f1634 = false;
        this.f1623 = false;
        this.f1626 = false;
        this.f1637 = true;
        this.f1636 = -1;
        this.f1630 = Integer.MIN_VALUE;
        this.f1635 = null;
        this.f1625 = new C1440();
        this.f1631 = new C1363();
        this.f1624 = 2;
        this.f1627 = new int[2];
        m1242(i);
        mo1250(null);
        if (this.f1634) {
            this.f1634 = false;
            m4838();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1629 = 1;
        this.f1634 = false;
        this.f1623 = false;
        this.f1626 = false;
        this.f1637 = true;
        this.f1636 = -1;
        this.f1630 = Integer.MIN_VALUE;
        this.f1635 = null;
        this.f1625 = new C1440();
        this.f1631 = new C1363();
        this.f1624 = 2;
        this.f1627 = new int[2];
        C1401 c1401M4814 = AbstractC1402.m4814(context, attributeSet, i, i2);
        m1242(c1401M4814.f5715);
        boolean z = c1401M4814.f5714;
        mo1250(null);
        if (z != this.f1634) {
            this.f1634 = z;
            m4838();
        }
        mo1233(c1401M4814.f5716);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final boolean mo1234() {
        return true;
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public final int m1235(C1426 c1426) {
        if (m4846() == 0) {
            return 0;
        }
        m1241();
        AbstractC1420 abstractC1420 = this.f1628;
        boolean z = !this.f1637;
        return AbstractC1361.m4732(c1426, abstractC1420, m1240(z), m1243(z), this, this.f1637, this.f1623);
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    public final View m1236() {
        return m4847(this.f1623 ? m4846() - 1 : 0);
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    public final void m1237(C1429 c1429, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m4828(i, c1429);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                m4828(i3, c1429);
            }
        }
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public final int m1238() {
        View viewM1244 = m1244(0, false, m4846());
        if (viewM1244 == null) {
            return -1;
        }
        return AbstractC1402.m4815(viewM1244);
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public void mo1239(C1426 c1426, int[] iArr) {
        int i;
        int iMo4723 = c1426.f5830 != -1 ? this.f1628.mo4723() : 0;
        if (this.f1633.f5687 == -1) {
            i = 0;
        } else {
            i = iMo4723;
            iMo4723 = 0;
        }
        iArr[0] = iMo4723;
        iArr[1] = i;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʾˈ */
    public final Parcelable mo796() {
        C1393 c1393 = this.f1635;
        if (c1393 != null) {
            C1393 c13932 = new C1393();
            c13932.f5678 = c1393.f5678;
            c13932.f5676 = c1393.f5676;
            c13932.f5677 = c1393.f5677;
            return c13932;
        }
        C1393 c13933 = new C1393();
        if (m4846() > 0) {
            m1241();
            boolean z = this.f1632 ^ this.f1623;
            c13933.f5677 = z;
            if (z) {
                View viewM1248 = m1248();
                c13933.f5676 = this.f1628.mo4726() - this.f1628.mo4725(viewM1248);
                c13933.f5678 = AbstractC1402.m4815(viewM1248);
            } else {
                View viewM1236 = m1236();
                c13933.f5678 = AbstractC1402.m4815(viewM1236);
                c13933.f5676 = this.f1628.mo4722(viewM1236) - this.f1628.mo4716();
            }
        } else {
            c13933.f5678 = -1;
        }
        return c13933;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʿʼ */
    public final boolean mo797() {
        return this.f1629 == 0;
    }

    /* renamed from: ʿˉ */
    public void mo1212(C1426 c1426, C1394 c1394, C1423 c1423) {
        int i = c1394.f5689;
        if (i < 0 || i >= c1426.m4948()) {
            return;
        }
        c1423.m4925(i, Math.max(0, c1394.f5688));
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˆʼ */
    public boolean mo1213() {
        return this.f1635 == null && this.f1632 == this.f1626;
    }

    /* renamed from: ˆˋ, reason: contains not printable characters */
    public final View m1240(boolean z) {
        return this.f1623 ? m1244(m4846() - 1, z, -1) : m1244(0, z, m4846());
    }

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public final void m1241() {
        if (this.f1633 == null) {
            C1394 c1394 = new C1394();
            c1394.f5686 = true;
            c1394.f5684 = 0;
            c1394.f5690 = 0;
            c1394.f5683 = null;
            this.f1633 = c1394;
        }
    }

    /* renamed from: ˆˏ, reason: contains not printable characters */
    public final void m1242(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("invalid orientation:", i));
        }
        mo1250(null);
        if (i != this.f1629 || this.f1628 == null) {
            AbstractC1420 abstractC1420M4913 = AbstractC1420.m4913(this, i);
            this.f1628 = abstractC1420M4913;
            this.f1625.f5909 = abstractC1420M4913;
            this.f1629 = i;
            m4838();
        }
    }

    /* renamed from: ˆﹶ, reason: contains not printable characters */
    public final View m1243(boolean z) {
        return this.f1623 ? m1244(0, z, m4846()) : m1244(m4846() - 1, z, -1);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final View m1244(int i, boolean z, int i2) {
        m1241();
        int i3 = z ? 24579 : 320;
        return this.f1629 == 0 ? this.f5725.m2493(i, i2, i3, 320) : this.f5730.m2493(i, i2, i3, 320);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˉי */
    public final void mo810(int i, C1423 c1423) {
        boolean z;
        int i2;
        C1393 c1393 = this.f1635;
        if (c1393 == null || (i2 = c1393.f5678) < 0) {
            m1246();
            z = this.f1623;
            i2 = this.f1636;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c1393.f5677;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f1624 && i2 >= 0 && i2 < i; i4++) {
            c1423.m4925(i2, 0);
            i2 += i3;
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˉⁱ */
    public int mo1215(C1426 c1426) {
        return m1235(c1426);
    }

    /* renamed from: ˊˉ, reason: contains not printable characters */
    public final void m1245(int i, int i2) {
        this.f1633.f5685 = this.f1628.mo4726() - i2;
        C1394 c1394 = this.f1633;
        c1394.f5680 = this.f1623 ? -1 : 1;
        c1394.f5689 = i;
        c1394.f5687 = 1;
        c1394.f5679 = i2;
        c1394.f5688 = Integer.MIN_VALUE;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˊﹶ */
    public final void mo812(Parcelable parcelable) {
        if (parcelable instanceof C1393) {
            C1393 c1393 = (C1393) parcelable;
            this.f1635 = c1393;
            if (this.f1636 != -1) {
                c1393.f5678 = -1;
            }
            m4838();
        }
    }

    /* renamed from: ˋʽ, reason: contains not printable characters */
    public final void m1246() {
        if (this.f1629 == 1 || !m1263()) {
            this.f1623 = this.f1634;
        } else {
            this.f1623 = !this.f1634;
        }
    }

    /* renamed from: ˋᴵ */
    public void mo1216(C1429 c1429, C1426 c1426, C1394 c1394, C1363 c1363) {
        int iM4835;
        int i;
        int i2;
        int iMo4721;
        View viewM4805 = c1394.m4805(c1429);
        if (viewM4805 == null) {
            c1363.f5527 = true;
            return;
        }
        C1398 c1398 = (C1398) viewM4805.getLayoutParams();
        if (c1394.f5683 == null) {
            if (this.f1623 == (c1394.f5687 == -1)) {
                m4822(viewM4805, -1, false);
            } else {
                m4822(viewM4805, 0, false);
            }
        } else {
            if (this.f1623 == (c1394.f5687 == -1)) {
                m4822(viewM4805, -1, true);
            } else {
                m4822(viewM4805, 0, true);
            }
        }
        C1398 c13982 = (C1398) viewM4805.getLayoutParams();
        Rect rectM1305 = this.f5717.m1305(viewM4805);
        int i3 = rectM1305.left + rectM1305.right;
        int i4 = rectM1305.top + rectM1305.bottom;
        int iM4816 = AbstractC1402.m4816(mo797(), this.f5729, this.f5720, m4848() + m4835() + ((ViewGroup.MarginLayoutParams) c13982).leftMargin + ((ViewGroup.MarginLayoutParams) c13982).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c13982).width);
        int iM48162 = AbstractC1402.m4816(mo828(), this.f5723, this.f5721, m4833() + m4824() + ((ViewGroup.MarginLayoutParams) c13982).topMargin + ((ViewGroup.MarginLayoutParams) c13982).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c13982).height);
        if (m4830(viewM4805, iM4816, iM48162, c13982)) {
            viewM4805.measure(iM4816, iM48162);
        }
        c1363.f5529 = this.f1628.mo4713(viewM4805);
        if (this.f1629 == 1) {
            if (m1263()) {
                iMo4721 = this.f5729 - m4848();
                iM4835 = iMo4721 - this.f1628.mo4721(viewM4805);
            } else {
                iM4835 = m4835();
                iMo4721 = this.f1628.mo4721(viewM4805) + iM4835;
            }
            if (c1394.f5687 == -1) {
                i = c1394.f5679;
                i2 = i - c1363.f5529;
            } else {
                i2 = c1394.f5679;
                i = c1363.f5529 + i2;
            }
        } else {
            int iM4824 = m4824();
            int iMo47212 = this.f1628.mo4721(viewM4805) + iM4824;
            if (c1394.f5687 == -1) {
                int i5 = c1394.f5679;
                int i6 = i5 - c1363.f5529;
                iMo4721 = i5;
                i = iMo47212;
                iM4835 = i6;
                i2 = iM4824;
            } else {
                int i7 = c1394.f5679;
                int i8 = c1363.f5529 + i7;
                iM4835 = i7;
                i = iMo47212;
                i2 = iM4824;
                iMo4721 = i8;
            }
        }
        AbstractC1402.m4819(viewM4805, iM4835, i2, iMo4721, i);
        if (c1398.f5702.m4772() || c1398.f5702.m4780()) {
            c1363.f5528 = true;
        }
        c1363.f5530 = viewM4805.hasFocusable();
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˋⁱ */
    public int mo1217(C1426 c1426) {
        return m1251(c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˎˉ */
    public View mo1218(View view, int i, C1429 c1429, C1426 c1426) {
        int iM1256;
        m1246();
        if (m4846() == 0 || (iM1256 = m1256(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m1241();
        m1266(iM1256, (int) (this.f1628.mo4723() * 0.33333334f), false, c1426);
        C1394 c1394 = this.f1633;
        c1394.f5688 = Integer.MIN_VALUE;
        c1394.f5686 = false;
        m1267(c1429, c1394, c1426, true);
        View viewM1259 = iM1256 == -1 ? this.f1623 ? m1259(m4846() - 1, -1) : m1259(0, m4846()) : this.f1623 ? m1259(0, m4846()) : m1259(m4846() - 1, -1);
        View viewM1236 = iM1256 == -1 ? m1236() : m1248();
        if (!viewM1236.hasFocusable()) {
            return viewM1259;
        }
        if (viewM1259 == null) {
            return null;
        }
        return viewM1236;
    }

    /* renamed from: ˎי, reason: contains not printable characters */
    public final int m1247(C1426 c1426) {
        if (m4846() == 0) {
            return 0;
        }
        m1241();
        AbstractC1420 abstractC1420 = this.f1628;
        boolean z = !this.f1637;
        return AbstractC1361.m4731(c1426, abstractC1420, m1240(z), m1243(z), this, this.f1637);
    }

    /* renamed from: ˏʻ, reason: contains not printable characters */
    public final View m1248() {
        return m4847(this.f1623 ? 0 : m4846() - 1);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int mo1249(C1426 c1426) {
        return m1247(c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˏᴵ */
    public int mo1219(C1426 c1426) {
        return m1235(c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo1250(String str) {
        if (this.f1635 == null) {
            super.mo1250(str);
        }
    }

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public final int m1251(C1426 c1426) {
        if (m4846() == 0) {
            return 0;
        }
        m1241();
        AbstractC1420 abstractC1420 = this.f1628;
        boolean z = !this.f1637;
        return AbstractC1361.m4730(c1426, abstractC1420, m1240(z), m1243(z), this, this.f1637);
    }

    /* renamed from: ˑˉ, reason: contains not printable characters */
    public final void m1252(C1429 c1429, C1394 c1394) {
        if (!c1394.f5686 || c1394.f5682) {
            return;
        }
        int i = c1394.f5688;
        int i2 = c1394.f5690;
        if (c1394.f5687 == -1) {
            int iM4846 = m4846();
            if (i < 0) {
                return;
            }
            int iMo4719 = (this.f1628.mo4719() - i) + i2;
            if (this.f1623) {
                for (int i3 = 0; i3 < iM4846; i3++) {
                    View viewM4847 = m4847(i3);
                    if (this.f1628.mo4722(viewM4847) < iMo4719 || this.f1628.mo4724(viewM4847) < iMo4719) {
                        m1237(c1429, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM4846 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM48472 = m4847(i5);
                if (this.f1628.mo4722(viewM48472) < iMo4719 || this.f1628.mo4724(viewM48472) < iMo4719) {
                    m1237(c1429, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM48462 = m4846();
        if (!this.f1623) {
            for (int i7 = 0; i7 < iM48462; i7++) {
                View viewM48473 = m4847(i7);
                if (this.f1628.mo4725(viewM48473) > i6 || this.f1628.mo4720(viewM48473) > i6) {
                    m1237(c1429, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM48462 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM48474 = m4847(i9);
            if (this.f1628.mo4725(viewM48474) > i6 || this.f1628.mo4720(viewM48474) > i6) {
                m1237(c1429, i8, i9);
                return;
            }
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˑי */
    public int mo1222(C1426 c1426) {
        return m1251(c1426);
    }

    /* renamed from: יʾ, reason: contains not printable characters */
    public final int m1253(int i, C1429 c1429, C1426 c1426, boolean z) {
        int iMo4716;
        int iMo47162 = i - this.f1628.mo4716();
        if (iMo47162 <= 0) {
            return 0;
        }
        int i2 = -m1261(iMo47162, c1429, c1426);
        int i3 = i + i2;
        if (!z || (iMo4716 = i3 - this.f1628.mo4716()) <= 0) {
            return i2;
        }
        this.f1628.mo4717(-iMo4716);
        return i2 - iMo4716;
    }

    @Override // p061.AbstractC1402
    /* renamed from: יˆ, reason: contains not printable characters */
    public final boolean mo1254() {
        if (this.f5721 == 1073741824 || this.f5720 == 1073741824) {
            return false;
        }
        int iM4846 = m4846();
        for (int i = 0; i < iM4846; i++) {
            ViewGroup.LayoutParams layoutParams = m4847(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p061.AbstractC1402
    /* renamed from: יˋ, reason: contains not printable characters */
    public final void mo1255(AccessibilityEvent accessibilityEvent) {
        super.mo1255(accessibilityEvent);
        if (m4846() > 0) {
            accessibilityEvent.setFromIndex(m1238());
            accessibilityEvent.setToIndex(m1264());
        }
    }

    /* renamed from: יי, reason: contains not printable characters */
    public final int m1256(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1629 == 1) ? 1 : Integer.MIN_VALUE : this.f1629 == 0 ? 1 : Integer.MIN_VALUE : this.f1629 == 1 ? -1 : Integer.MIN_VALUE : this.f1629 == 0 ? -1 : Integer.MIN_VALUE : (this.f1629 != 1 && m1263()) ? -1 : 1 : (this.f1629 != 1 && m1263()) ? 1 : -1;
    }

    /* renamed from: יᵔ, reason: contains not printable characters */
    public final void m1257(int i, int i2) {
        this.f1633.f5685 = i2 - this.f1628.mo4716();
        C1394 c1394 = this.f1633;
        c1394.f5689 = i;
        c1394.f5680 = this.f1623 ? 1 : -1;
        c1394.f5687 = -1;
        c1394.f5679 = i2;
        c1394.f5688 = Integer.MIN_VALUE;
    }

    /* renamed from: ـᵢ */
    public void mo1225(C1429 c1429, C1426 c1426, C1440 c1440, int i) {
    }

    @Override // p061.InterfaceC1369
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final PointF mo1258(int i) {
        if (m4846() == 0) {
            return null;
        }
        int i2 = (i < AbstractC1402.m4815(m4847(0))) != this.f1623 ? -1 : 1;
        return this.f1629 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ٴˎ */
    public final boolean mo828() {
        return this.f1629 == 1;
    }

    /* renamed from: ٴᵔ, reason: contains not printable characters */
    public final View m1259(int i, int i2) {
        int i3;
        int i4;
        m1241();
        if (i2 <= i && i2 >= i) {
            return m4847(i);
        }
        if (this.f1628.mo4722(m4847(i)) < this.f1628.mo4716()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1629 == 0 ? this.f5725.m2493(i, i2, i3, i4) : this.f5730.m2493(i, i2, i3, i4);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final int mo1260(C1426 c1426) {
        return m1247(c1426);
    }

    /* renamed from: ᴵˊ, reason: contains not printable characters */
    public final int m1261(int i, C1429 c1429, C1426 c1426) {
        if (m4846() == 0 || i == 0) {
            return 0;
        }
        m1241();
        this.f1633.f5686 = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m1266(i2, iAbs, true, c1426);
        C1394 c1394 = this.f1633;
        int iM1267 = m1267(c1429, c1394, c1426, false) + c1394.f5688;
        if (iM1267 < 0) {
            return 0;
        }
        if (iAbs > iM1267) {
            i = i2 * iM1267;
        }
        this.f1628.mo4717(-i);
        this.f1633.f5681 = i;
        return i;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final View mo1262(int i) {
        int iM4846 = m4846();
        if (iM4846 == 0) {
            return null;
        }
        int iM4815 = i - AbstractC1402.m4815(m4847(0));
        if (iM4815 >= 0 && iM4815 < iM4846) {
            View viewM4847 = m4847(iM4815);
            if (AbstractC1402.m4815(viewM4847) == i) {
                return viewM4847;
            }
        }
        return super.mo1262(i);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵔˋ */
    public int mo841(int i, C1429 c1429, C1426 c1426) {
        if (this.f1629 == 1) {
            return 0;
        }
        return m1261(i, c1429, c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢˆ */
    public int mo843(int i, C1429 c1429, C1426 c1426) {
        if (this.f1629 == 0) {
            return 0;
        }
        return m1261(i, c1429, c1426);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢˎ */
    public void mo844(RecyclerView recyclerView, int i) {
        C1425 c1425 = new C1425(recyclerView.getContext());
        c1425.f5814 = i;
        mo823(c1425);
    }

    /* renamed from: ᵢᴵ, reason: contains not printable characters */
    public final boolean m1263() {
        return m4829() == 1;
    }

    /* renamed from: ᵢⁱ, reason: contains not printable characters */
    public final int m1264() {
        View viewM1244 = m1244(m4846() - 1, false, -1);
        if (viewM1244 == null) {
            return -1;
        }
        return AbstractC1402.m4815(viewM1244);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢﹶ */
    public final void mo848(int i) {
        this.f1636 = i;
        this.f1630 = Integer.MIN_VALUE;
        C1393 c1393 = this.f1635;
        if (c1393 != null) {
            c1393.f5678 = -1;
        }
        m4838();
    }

    @Override // p061.AbstractC1402
    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final void mo1265(RecyclerView recyclerView) {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* renamed from: ⁱˏ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View mo1228(p061.C1429 r17, p061.C1426 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.m1241()
            int r1 = r16.m4846()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r16.m4846()
            int r1 = r1 - r3
            r4 = -1
            r5 = -1
            goto L18
        L15:
            r4 = r1
            r1 = 0
            r5 = 1
        L18:
            int r6 = r18.m4948()
            ʾـ.ᵔٴ r7 = r0.f1628
            int r7 = r7.mo4716()
            ʾـ.ᵔٴ r8 = r0.f1628
            int r8 = r8.mo4726()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.m4847(r1)
            int r13 = p061.AbstractC1402.m4815(r12)
            ʾـ.ᵔٴ r14 = r0.f1628
            int r14 = r14.mo4722(r12)
            ʾـ.ᵔٴ r15 = r0.f1628
            int r15 = r15.mo4725(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            ʾـ.ـᵎ r13 = (p061.C1398) r13
            ʾـ.ˊˆ r13 = r13.f5702
            boolean r13 = r13.m4772()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = 1
            goto L5e
        L5d:
            r13 = 0
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = 1
            goto L65
        L64:
            r14 = 0
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            goto L84
        L7f:
            if (r10 == 0) goto L83
            r9 = r10
            goto L84
        L83:
            r9 = r11
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo1228(ʾـ.ⁱⁱ, ʾـ.ᵢᵢ, boolean, boolean):android.view.View");
    }

    /* renamed from: ⁱᵎ, reason: contains not printable characters */
    public final void m1266(int i, int i2, boolean z, C1426 c1426) {
        int iMo4716;
        this.f1633.f5682 = this.f1628.mo4718() == 0 && this.f1628.mo4719() == 0;
        this.f1633.f5687 = i;
        int[] iArr = this.f1627;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1239(c1426, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C1394 c1394 = this.f1633;
        int i3 = z2 ? iMax2 : iMax;
        c1394.f5684 = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c1394.f5690 = iMax;
        if (z2) {
            c1394.f5684 = this.f1628.mo4714() + i3;
            View viewM1248 = m1248();
            C1394 c13942 = this.f1633;
            c13942.f5680 = this.f1623 ? -1 : 1;
            int iM4815 = AbstractC1402.m4815(viewM1248);
            C1394 c13943 = this.f1633;
            c13942.f5689 = iM4815 + c13943.f5680;
            c13943.f5679 = this.f1628.mo4725(viewM1248);
            iMo4716 = this.f1628.mo4725(viewM1248) - this.f1628.mo4726();
        } else {
            View viewM1236 = m1236();
            C1394 c13944 = this.f1633;
            c13944.f5684 = this.f1628.mo4716() + c13944.f5684;
            C1394 c13945 = this.f1633;
            c13945.f5680 = this.f1623 ? 1 : -1;
            int iM48152 = AbstractC1402.m4815(viewM1236);
            C1394 c13946 = this.f1633;
            c13945.f5689 = iM48152 + c13946.f5680;
            c13946.f5679 = this.f1628.mo4722(viewM1236);
            iMo4716 = (-this.f1628.mo4722(viewM1236)) + this.f1628.mo4716();
        }
        C1394 c13947 = this.f1633;
        c13947.f5685 = i2;
        if (z) {
            c13947.f5685 = i2 - iMo4716;
        }
        c13947.f5688 = iMo4716;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    @Override // p061.AbstractC1402
    /* renamed from: ⁱⁱ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo851(p061.C1429 r18, p061.C1426 r19) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo851(ʾـ.ⁱⁱ, ʾـ.ᵢᵢ):void");
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public final int m1267(C1429 c1429, C1394 c1394, C1426 c1426, boolean z) {
        int i;
        int i2 = c1394.f5685;
        int i3 = c1394.f5688;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c1394.f5688 = i3 + i2;
            }
            m1252(c1429, c1394);
        }
        int i4 = c1394.f5685 + c1394.f5684;
        while (true) {
            if ((!c1394.f5682 && i4 <= 0) || (i = c1394.f5689) < 0 || i >= c1426.m4948()) {
                break;
            }
            C1363 c1363 = this.f1631;
            c1363.f5529 = 0;
            c1363.f5527 = false;
            c1363.f5528 = false;
            c1363.f5530 = false;
            mo1216(c1429, c1426, c1394, c1363);
            if (!c1363.f5527) {
                int i5 = c1394.f5679;
                int i6 = c1363.f5529;
                c1394.f5679 = (c1394.f5687 * i6) + i5;
                if (!c1363.f5528 || c1394.f5683 != null || !c1426.f5832) {
                    c1394.f5685 -= i6;
                    i4 -= i6;
                }
                int i7 = c1394.f5688;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c1394.f5688 = i8;
                    int i9 = c1394.f5685;
                    if (i9 < 0) {
                        c1394.f5688 = i8 + i9;
                    }
                    m1252(c1429, c1394);
                }
                if (z && c1363.f5530) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c1394.f5685;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﹳˎ */
    public C1398 mo856() {
        return new C1398(-2, -2);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﹶˆ */
    public final void mo858(int i, int i2, C1426 c1426, C1423 c1423) {
        if (this.f1629 != 0) {
            i = i2;
        }
        if (m4846() == 0 || i == 0) {
            return;
        }
        m1241();
        m1266(i > 0 ? 1 : -1, Math.abs(i), true, c1426);
        mo1212(c1426, this.f1633, c1423);
    }

    /* renamed from: ﾞי, reason: contains not printable characters */
    public final int m1268(int i, C1429 c1429, C1426 c1426, boolean z) {
        int iMo4726;
        int iMo47262 = this.f1628.mo4726() - i;
        if (iMo47262 <= 0) {
            return 0;
        }
        int i2 = -m1261(-iMo47262, c1429, c1426);
        int i3 = i + i2;
        if (!z || (iMo4726 = this.f1628.mo4726() - i3) <= 0) {
            return i2;
        }
        this.f1628.mo4717(iMo4726);
        return iMo4726 + i2;
    }

    /* renamed from: ﾞﹳ */
    public void mo1233(boolean z) {
        mo1250(null);
        if (this.f1626 == z) {
            return;
        }
        this.f1626 = z;
        m4838();
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﾞﾞ */
    public void mo863(C1426 c1426) {
        this.f1635 = null;
        this.f1636 = -1;
        this.f1630 = Integer.MIN_VALUE;
        this.f1625.m4995();
    }
}
