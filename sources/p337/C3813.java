package p337;

import java.util.Set;
import p345.AbstractC3985;
import p345.AbstractC3986;
import p345.C3963;
import p383.AbstractC4470;

/* renamed from: ᵎˆ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3813 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C3813 f14679;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f14680;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC3985 f14681;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f14682;

    static {
        C3813 c3813;
        if (AbstractC4470.f17202 >= 33) {
            C3963 c3963 = new C3963(4);
            for (int i = 1; i <= 10; i++) {
                c3963.m9172(Integer.valueOf(AbstractC4470.m10202(i)));
            }
            c3813 = new C3813(2, c3963.m9175());
        } else {
            c3813 = new C3813(2, 10);
        }
        f14679 = c3813;
    }

    public C3813(int i, int i2) {
        this.f14682 = i;
        this.f14680 = i2;
        this.f14681 = null;
    }

    public C3813(int i, Set set) {
        this.f14682 = i;
        AbstractC3985 abstractC3985M9217 = AbstractC3985.m9217(set);
        this.f14681 = abstractC3985M9217;
        AbstractC3986 it = abstractC3985M9217.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f14680 = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3813)) {
            return false;
        }
        C3813 c3813 = (C3813) obj;
        return this.f14682 == c3813.f14682 && this.f14680 == c3813.f14680 && AbstractC4470.m10194(this.f14681, c3813.f14681);
    }

    public final int hashCode() {
        int i = ((this.f14682 * 31) + this.f14680) * 31;
        AbstractC3985 abstractC3985 = this.f14681;
        return i + (abstractC3985 == null ? 0 : abstractC3985.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f14682 + ", maxChannelCount=" + this.f14680 + ", channelMasks=" + this.f14681 + "]";
    }
}
