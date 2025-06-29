package p390;

/* renamed from: ⁱˈ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4516 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f17376;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f17377;

    public C4516(String str, int i) {
        this.f17377 = str;
        this.f17376 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4516.class != obj.getClass()) {
            return false;
        }
        C4516 c4516 = (C4516) obj;
        if (this.f17376 != c4516.f17376) {
            return false;
        }
        return this.f17377.equals(c4516.f17377);
    }

    public final int hashCode() {
        return (this.f17377.hashCode() * 31) + this.f17376;
    }
}
