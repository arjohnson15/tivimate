package p166;

import p383.AbstractC4470;

/* renamed from: ˊﹶ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2438 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f9726;

    static {
        new C2438(new C2430());
        AbstractC4470.m10164(0);
        AbstractC4470.m10164(1);
        AbstractC4470.m10164(2);
        AbstractC4470.m10164(3);
        AbstractC4470.m10164(4);
        AbstractC4470.m10164(5);
        AbstractC4470.m10164(6);
    }

    public C2438(C2430 c2430) {
        c2430.getClass();
        int i = AbstractC4470.f17202;
        this.f9726 = c2430.f9656;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2438)) {
            return false;
        }
        C2438 c2438 = (C2438) obj;
        c2438.getClass();
        return this.f9726 == c2438.f9726;
    }

    public final int hashCode() {
        long j = this.f9726;
        return ((((int) 0) * 31) + ((int) (j ^ (j >>> 32)))) * 29791;
    }
}
