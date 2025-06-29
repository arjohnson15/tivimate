package p166;

import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4470;

/* renamed from: ˊﹶ.ʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2398 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C2398 f9465;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC3980 f9466;

    static {
        C3928 c3928 = AbstractC3980.f15360;
        f9465 = new C2398(C3932.f15274);
        AbstractC4470.m10164(0);
    }

    public C2398(AbstractC3980 abstractC3980) {
        this.f9466 = AbstractC3980.m9209(abstractC3980);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2398.class != obj.getClass()) {
            return false;
        }
        return this.f9466.equals(((C2398) obj).f9466);
    }

    public final int hashCode() {
        return this.f9466.hashCode();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m6486(int i) {
        int i2 = 0;
        while (true) {
            AbstractC3980 abstractC3980 = this.f9466;
            if (i2 >= abstractC3980.size()) {
                return false;
            }
            C2429 c2429 = (C2429) abstractC3980.get(i2);
            boolean[] zArr = c2429.f9652;
            int length = zArr.length;
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (zArr[i3]) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (z && c2429.m6537() == i) {
                return true;
            }
            i2++;
        }
    }
}
