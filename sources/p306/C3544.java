package p306;

import p123.C1995;
import p123.C2010;

/* renamed from: ᐧˈ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3544 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1995 f13698;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2010 f13699;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f13700;

    public C3544(long j, C1995 c1995, C2010 c2010) {
        this.f13700 = j;
        this.f13698 = c1995;
        this.f13699 = c2010;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3544)) {
            return false;
        }
        C3544 c3544 = (C3544) obj;
        return this.f13700 == c3544.f13700 && this.f13698.equals(c3544.f13698) && this.f13699.equals(c3544.f13699);
    }

    public final int hashCode() {
        long j = this.f13700;
        return this.f13699.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f13698.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f13700 + ", transportContext=" + this.f13698 + ", event=" + this.f13699 + "}";
    }
}
