package p337;

import p261.C3250;

/* renamed from: ᵎˆ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3825 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C3825 f14706 = new C3250().m8009();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f14707;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f14708;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean f14709;

    public C3825(C3250 c3250) {
        this.f14709 = c3250.f12701;
        this.f14707 = c3250.f12699;
        this.f14708 = c3250.f12700;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3825.class != obj.getClass()) {
            return false;
        }
        C3825 c3825 = (C3825) obj;
        return this.f14709 == c3825.f14709 && this.f14707 == c3825.f14707 && this.f14708 == c3825.f14708;
    }

    public final int hashCode() {
        return ((this.f14709 ? 1 : 0) << 2) + ((this.f14707 ? 1 : 0) << 1) + (this.f14708 ? 1 : 0);
    }
}
