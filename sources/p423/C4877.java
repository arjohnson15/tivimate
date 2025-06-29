package p423;

import p070.AbstractC1549;

/* renamed from: ﹶʻ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4877 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C4884 f18397 = new C4884();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f18398;

    public final boolean equals(Object obj) {
        if (obj instanceof C4877) {
            return AbstractC1549.m5138(this.f18398, ((C4877) obj).f18398);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f18398;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f18398;
        if (obj instanceof C4874) {
            return ((C4874) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
