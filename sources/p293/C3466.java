package p293;

import com.google.android.gms.internal.measurement.C0559;
import java.util.Arrays;
import p305.C3542;
import p417.AbstractC4753;

/* renamed from: ٴᵎ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3466 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3542 f13415;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3463 f13416;

    public /* synthetic */ C3466(C3463 c3463, C3542 c3542) {
        this.f13416 = c3463;
        this.f13415 = c3542;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3466)) {
            C3466 c3466 = (C3466) obj;
            if (AbstractC4753.m10682(this.f13416, c3466.f13416) && AbstractC4753.m10682(this.f13415, c3466.f13415)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13416, this.f13415});
    }

    public final String toString() {
        C0559 c0559 = new C0559(this);
        c0559.m2487(this.f13416, "key");
        c0559.m2487(this.f13415, "feature");
        return c0559.toString();
    }
}
