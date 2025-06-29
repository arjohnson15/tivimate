package p293;

import com.google.android.gms.internal.measurement.C0559;
import java.util.Arrays;
import p417.AbstractC4753;
import p417.C4754;

/* renamed from: ٴᵎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3463 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0559 f13393;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f13394;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f13395;

    public C3463(C0559 c0559, String str) {
        this.f13393 = c0559;
        this.f13394 = str;
        this.f13395 = Arrays.hashCode(new Object[]{c0559, C4754.f18241, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3463)) {
            return false;
        }
        C3463 c3463 = (C3463) obj;
        if (AbstractC4753.m10682(this.f13393, c3463.f13393)) {
            C4754 c4754 = C4754.f18241;
            if (AbstractC4753.m10682(c4754, c4754) && AbstractC4753.m10682(this.f13394, c3463.f13394)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13395;
    }
}
