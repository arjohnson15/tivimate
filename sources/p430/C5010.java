package p430;

import com.bumptech.glide.ˑʽ;
import java.util.ArrayList;
import java.util.Set;
import p013.AbstractC1041;
import p070.AbstractC1549;

/* renamed from: ﹶˏ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5010 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C5010 f19011 = new C5010(AbstractC1041.m4029(new ArrayList()), null);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ˑʽ f19012;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Set f19013;

    public C5010(Set set, ˑʽ r2) {
        this.f19013 = set;
        this.f19012 = r2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5010) {
            C5010 c5010 = (C5010) obj;
            if (AbstractC1549.m5138(c5010.f19013, this.f19013) && AbstractC1549.m5138(c5010.f19012, this.f19012)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f19013.hashCode() + 1517) * 41;
        ˑʽ r1 = this.f19012;
        return iHashCode + (r1 != null ? r1.hashCode() : 0);
    }
}
