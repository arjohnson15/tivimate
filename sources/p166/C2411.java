package p166;

import p383.AbstractC4470;

/* renamed from: ˊﹶ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2411 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f9572;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f9573;

    static {
        AbstractC4470.m10164(0);
        AbstractC4470.m10164(1);
    }

    public C2411(String str, String str2) {
        this.f9573 = AbstractC4470.m10161(str);
        this.f9572 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2411.class != obj.getClass()) {
            return false;
        }
        C2411 c2411 = (C2411) obj;
        return AbstractC4470.m10194(this.f9573, c2411.f9573) && AbstractC4470.m10194(this.f9572, c2411.f9572);
    }

    public final int hashCode() {
        int iHashCode = this.f9572.hashCode() * 31;
        String str = this.f9573;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
