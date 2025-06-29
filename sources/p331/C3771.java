package p331;

import p070.AbstractC1549;
import p080.AbstractC1702;
import p447.AbstractC5179;

/* renamed from: ᴵﹳ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3771 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f14591;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String f14592;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3771)) {
            return false;
        }
        C3771 c3771 = (C3771) obj;
        return AbstractC1549.m5138(this.f14592, c3771.f14592) && this.f14591 == c3771.f14591;
    }

    public final int hashCode() {
        return AbstractC1702.m5411(this.f14591) + (this.f14592.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f14592 + ", state=" + AbstractC5179.m11553(this.f14591) + ')';
    }
}
