package p031;

import com.bumptech.glide.ﹳﹳ;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;

/* renamed from: ʼـ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1188 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f4914;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f4915;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1200 f4916;

    public C1188(int i, int i2, Class cls) {
        this(C1200.m4252(cls), i, i2);
    }

    public C1188(C1200 c1200, int i, int i2) {
        ﹳﹳ.ᐧʻ(c1200, "Null dependency anInterface.");
        this.f4916 = c1200;
        this.f4914 = i;
        this.f4915 = i2;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C1188 m4241(C1200 c1200) {
        return new C1188(c1200, 1, 0);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1188 m4242(Class cls) {
        return new C1188(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1188)) {
            return false;
        }
        C1188 c1188 = (C1188) obj;
        return this.f4916.equals(c1188.f4916) && this.f4914 == c1188.f4914 && this.f4915 == c1188.f4915;
    }

    public final int hashCode() {
        return ((((this.f4916.hashCode() ^ 1000003) * 1000003) ^ this.f4914) * 1000003) ^ this.f4915;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f4916);
        sb.append(", type=");
        int i = this.f4914;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.f4915;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(ˉᵎ.ˉⁱ("Unsupported injection: ", i2));
            }
            str = "deferred";
        }
        return ᵎˏ.ˎٴ(sb, str, "}");
    }
}
