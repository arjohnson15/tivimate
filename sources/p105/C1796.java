package p105;

import java.io.Serializable;
import ﹶⁱ.ـﹶ;

/* renamed from: ˆᐧ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1796 implements Serializable {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final /* synthetic */ int f6941 = 0;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f6942;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int[] f6943;

    static {
        new C1796(new int[0]);
    }

    public C1796(int[] iArr) {
        int length = iArr.length;
        this.f6943 = iArr;
        this.f6942 = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1796)) {
            return false;
        }
        C1796 c1796 = (C1796) obj;
        int i = c1796.f6942;
        int i2 = this.f6942;
        if (i2 != i) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ـﹶ.ᐧʻ(i3, i2);
            int i4 = this.f6943[i3];
            ـﹶ.ᐧʻ(i3, c1796.f6942);
            if (i4 != c1796.f6943[i3]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6942; i2++) {
            i = (i * 31) + this.f6943[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.f6942;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f6943;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
