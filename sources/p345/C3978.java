package p345;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import ˆʽ.ᵎˏ;

/* renamed from: ᵎᴵ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3978 extends AbstractC3925 implements Serializable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Comparator[] f15355;

    public C3978(C3949 c3949, C3949 c39492) {
        this.f15355 = new Comparator[]{c3949, c39492};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f15355;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3978) {
            return Arrays.equals(this.f15355, ((C3978) obj).f15355);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15355);
    }

    public final String toString() {
        return ᵎˏ.ˎٴ(new StringBuilder("Ordering.compound("), Arrays.toString(this.f15355), ")");
    }
}
