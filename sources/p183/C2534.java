package p183;

/* renamed from: ˋﹳ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2534 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final EnumC2533 f10074;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f10075;

    public C2534(Object obj, EnumC2533 enumC2533) {
        this.f10075 = obj;
        this.f10074 = enumC2533;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2534)) {
            return false;
        }
        C2534 c2534 = (C2534) obj;
        c2534.getClass();
        return this.f10075.equals(c2534.f10075) && this.f10074.equals(c2534.f10074);
    }

    public final int hashCode() {
        return (this.f10074.hashCode() ^ (((1000003 * 1000003) ^ this.f10075.hashCode()) * 1000003)) * (-721379959);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f10075 + ", priority=" + this.f10074 + ", productData=null, eventContext=null}";
    }
}
