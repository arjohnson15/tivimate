package androidx.leanback.widget;

import p061.C1423;

/* renamed from: androidx.leanback.widget.ﾞﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0205 extends AbstractC0154 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ˉⁱ f1215 = new ˉⁱ(0);

    public C0205() {
        m940(1);
    }

    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ʽᐧ */
    public final boolean mo912(int i, boolean z) {
        int iMin;
        int i2;
        if (this.f1078.ᵎˏ() == 0) {
            return false;
        }
        if (!z && m937(i)) {
            return false;
        }
        int i3 = this.f1084;
        if (i3 >= 0) {
            iMin = i3 + 1;
        } else {
            int i4 = this.f1086;
            iMin = i4 != -1 ? Math.min(i4, this.f1078.ᵎˏ() - 1) : 0;
        }
        boolean z2 = false;
        while (iMin < this.f1078.ᵎˏ()) {
            ʾי.ˑʽ r3 = this.f1078;
            Object[] objArr = this.f1082;
            int i5 = r3.ᵎـ(iMin, true, objArr, false);
            if (this.f1083 < 0 || this.f1084 < 0) {
                i2 = this.f1081 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                this.f1083 = iMin;
                this.f1084 = iMin;
            } else {
                if (this.f1081) {
                    int i6 = iMin - 1;
                    i2 = (this.f1078.ˋˊ(i6) - this.f1078.יʻ(i6)) - this.f1085;
                } else {
                    int i7 = iMin - 1;
                    i2 = this.f1085 + this.f1078.יʻ(i7) + this.f1078.ˋˊ(i7);
                }
                this.f1084 = iMin;
            }
            this.f1078.ˏᵢ(objArr[0], iMin, i5, 0, i2);
            if (z || m937(i)) {
                return true;
            }
            iMin++;
            z2 = true;
        }
        return z2;
    }

    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ʿʼ */
    public final void mo936(int i, int i2, C1423 c1423) {
        int iM997;
        int i3;
        if (!this.f1081 ? i2 < 0 : i2 > 0) {
            if (this.f1084 == this.f1078.ᵎˏ() - 1) {
                return;
            }
            int i4 = this.f1084;
            if (i4 >= 0) {
                iM997 = i4 + 1;
            } else {
                int i5 = this.f1086;
                iM997 = i5 != -1 ? Math.min(i5, this.f1078.ᵎˏ() - 1) : 0;
            }
            int i6 = this.f1078.יʻ(this.f1084) + this.f1085;
            int i7 = this.f1078.ˋˊ(this.f1084);
            if (this.f1081) {
                i6 = -i6;
            }
            i3 = i6 + i7;
        } else {
            if (this.f1083 == 0) {
                return;
            }
            iM997 = m997();
            i3 = this.f1078.ˋˊ(this.f1083) + (this.f1081 ? this.f1085 : -this.f1085);
        }
        c1423.m4925(iM997, Math.abs(i3 - i));
    }

    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ˉי */
    public final C1423[] mo914(int i, int i2) {
        C1423 c1423 = this.f1080[0];
        c1423.f5794 = c1423.f5793;
        c1423.m4928(i);
        this.f1080[0].m4928(i2);
        return this.f1080;
    }

    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ˋⁱ */
    public final boolean mo917(int i, boolean z) {
        int i2;
        if (this.f1078.ᵎˏ() == 0) {
            return false;
        }
        if (!z && m941(i)) {
            return false;
        }
        int i3 = ((GridLayoutManager) this.f1078.ˆʿ).f825;
        boolean z2 = false;
        for (int iM997 = m997(); iM997 >= i3; iM997--) {
            ʾי.ˑʽ r3 = this.f1078;
            Object[] objArr = this.f1082;
            int i4 = r3.ᵎـ(iM997, false, objArr, false);
            if (this.f1083 < 0 || this.f1084 < 0) {
                i2 = this.f1081 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                this.f1083 = iM997;
                this.f1084 = iM997;
            } else {
                i2 = this.f1081 ? this.f1078.ˋˊ(iM997 + 1) + this.f1085 + i4 : (this.f1078.ˋˊ(iM997 + 1) - this.f1085) - i4;
                this.f1083 = iM997;
            }
            this.f1078.ˏᵢ(objArr[0], iM997, i4, 0, i2);
            z2 = true;
            if (z || m941(i)) {
                break;
            }
        }
        return z2;
    }

    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ˏʾ */
    public final ˉⁱ mo919(int i) {
        return this.f1215;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final int m997() {
        int i = this.f1083;
        if (i >= 0) {
            return i - 1;
        }
        int i2 = this.f1086;
        return i2 != -1 ? Math.min(i2, this.f1078.ᵎˏ() - 1) : this.f1078.ᵎˏ() - 1;
    }

    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ˏᵢ */
    public final int mo921(int i, boolean z, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        return this.f1081 ? this.f1078.ˋˊ(i) - this.f1078.יʻ(i) : this.f1078.ˋˊ(i);
    }

    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ٴˎ */
    public final int mo924(int i, boolean z, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        if (this.f1081) {
            return this.f1078.ˋˊ(i);
        }
        return this.f1078.יʻ(i) + this.f1078.ˋˊ(i);
    }
}
