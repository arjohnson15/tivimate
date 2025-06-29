package p166;

import p033.C1212;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ˊﹶ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2403 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f9498;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f9499;

    static {
        C1212 c1212 = new C1212();
        AbstractC4464.m10142(c1212.f4960 <= c1212.f4959);
        new C2403(c1212);
        AbstractC4470.m10164(0);
        AbstractC4470.m10164(1);
        AbstractC4470.m10164(2);
        AbstractC4470.m10164(3);
    }

    public C2403(C1212 c1212) {
        c1212.getClass();
        this.f9499 = c1212.f4960;
        this.f9498 = c1212.f4959;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2403)) {
            return false;
        }
        C2403 c2403 = (C2403) obj;
        c2403.getClass();
        return this.f9499 == c2403.f9499 && this.f9498 == c2403.f9498 && AbstractC4470.m10194(null, null);
    }

    public final int hashCode() {
        return (((16337 + this.f9499) * 31) + this.f9498) * 31;
    }
}
