package p023;

import android.support.v4.media.session.AbstractC0002;

/* renamed from: ʼʾ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1150 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f4795;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f4796;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean f4797;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f4798;

    public C1150(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4797 = z;
        this.f4795 = z2;
        this.f4796 = z3;
        this.f4798 = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1150)) {
            return false;
        }
        C1150 c1150 = (C1150) obj;
        return this.f4797 == c1150.f4797 && this.f4795 == c1150.f4795 && this.f4796 == c1150.f4796 && this.f4798 == c1150.f4798;
    }

    public final int hashCode() {
        return ((((((this.f4797 ? 1231 : 1237) * 31) + (this.f4795 ? 1231 : 1237)) * 31) + (this.f4796 ? 1231 : 1237)) * 31) + (this.f4798 ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.f4797);
        sb.append(", isValidated=");
        sb.append(this.f4795);
        sb.append(", isMetered=");
        sb.append(this.f4796);
        sb.append(", isNotRoaming=");
        return AbstractC0002.m38(sb, this.f4798, ')');
    }
}
