package p061;

/* renamed from: ʾـ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1399 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5704;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object f5705;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f5706;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f5707;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1399)) {
            return false;
        }
        C1399 c1399 = (C1399) obj;
        int i = this.f5706;
        if (i != c1399.f5706) {
            return false;
        }
        if (i == 8 && Math.abs(this.f5707 - this.f5704) == 1 && this.f5707 == c1399.f5704 && this.f5704 == c1399.f5707) {
            return true;
        }
        if (this.f5707 != c1399.f5707 || this.f5704 != c1399.f5704) {
            return false;
        }
        Object obj2 = this.f5705;
        if (obj2 != null) {
            if (!obj2.equals(c1399.f5705)) {
                return false;
            }
        } else if (c1399.f5705 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f5706 * 31) + this.f5704) * 31) + this.f5707;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f5706;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f5704);
        sb.append("c:");
        sb.append(this.f5707);
        sb.append(",p:");
        sb.append(this.f5705);
        sb.append("]");
        return sb.toString();
    }
}
