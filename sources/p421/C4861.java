package p421;

import android.graphics.Insets;
import ˆʽ.ᵎˏ;

/* renamed from: ﹳﹶ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4861 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C4861 f18363 = new C4861(0, 0, 0, 0);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f18364;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f18365;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f18366;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f18367;

    public C4861(int i, int i2, int i3, int i4) {
        this.f18366 = i;
        this.f18364 = i2;
        this.f18365 = i3;
        this.f18367 = i4;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C4861 m10935(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f18363 : new C4861(i, i2, i3, i4);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C4861 m10936(Insets insets) {
        return m10935(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C4861 m10937(C4861 c4861, C4861 c48612) {
        return m10935(Math.max(c4861.f18366, c48612.f18366), Math.max(c4861.f18364, c48612.f18364), Math.max(c4861.f18365, c48612.f18365), Math.max(c4861.f18367, c48612.f18367));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4861.class != obj.getClass()) {
            return false;
        }
        C4861 c4861 = (C4861) obj;
        return this.f18367 == c4861.f18367 && this.f18366 == c4861.f18366 && this.f18365 == c4861.f18365 && this.f18364 == c4861.f18364;
    }

    public final int hashCode() {
        return (((((this.f18366 * 31) + this.f18364) * 31) + this.f18365) * 31) + this.f18367;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f18366);
        sb.append(", top=");
        sb.append(this.f18364);
        sb.append(", right=");
        sb.append(this.f18365);
        sb.append(", bottom=");
        return ᵎˏ.ᵎـ(sb, this.f18367, '}');
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Insets m10938() {
        return AbstractC4856.m10917(this.f18366, this.f18364, this.f18365, this.f18367);
    }
}
