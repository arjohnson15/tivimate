package p122;

import java.util.List;

/* renamed from: ˈי.ﾞˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1990 extends AbstractC1957 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f7586;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final List f7587;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7588;

    public C1990(int i, String str, List list) {
        this.f7588 = str;
        this.f7586 = i;
        this.f7587 = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1957)) {
            return false;
        }
        AbstractC1957 abstractC1957 = (AbstractC1957) obj;
        if (this.f7588.equals(((C1990) abstractC1957).f7588)) {
            C1990 c1990 = (C1990) abstractC1957;
            if (this.f7586 == c1990.f7586 && this.f7587.equals(c1990.f7587)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7588.hashCode() ^ 1000003) * 1000003) ^ this.f7586) * 1000003) ^ this.f7587.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f7588 + ", importance=" + this.f7586 + ", frames=" + this.f7587 + "}";
    }
}
