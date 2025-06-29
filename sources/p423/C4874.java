package p423;

import p070.AbstractC1549;

/* renamed from: ﹶʻ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4874 extends C4884 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Throwable f18392;

    public C4874(Throwable th) {
        this.f18392 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4874) {
            if (AbstractC1549.m5138(this.f18392, ((C4874) obj).f18392)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f18392;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p423.C4884
    public final String toString() {
        return "Closed(" + this.f18392 + ')';
    }
}
