package p288;

import java.io.Serializable;
import p070.AbstractC1549;

/* renamed from: ٴˑ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3403 implements Serializable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Throwable f13256;

    public C3403(Throwable th) {
        this.f13256 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3403) {
            if (AbstractC1549.m5138(this.f13256, ((C3403) obj).f13256)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13256.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f13256 + ')';
    }
}
