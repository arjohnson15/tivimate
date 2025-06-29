package p119;

import java.util.ArrayList;

/* renamed from: ˈˉ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1861 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f7119;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7120;

    public C1861(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f7120 = str;
        this.f7119 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1861)) {
            return false;
        }
        C1861 c1861 = (C1861) obj;
        return this.f7120.equals(c1861.f7120) && this.f7119.equals(c1861.f7119);
    }

    public final int hashCode() {
        return ((this.f7120.hashCode() ^ 1000003) * 1000003) ^ this.f7119.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f7120 + ", usedDates=" + this.f7119 + "}";
    }
}
