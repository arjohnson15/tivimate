package p163;

import com.google.android.gms.internal.play_billing.ˎˑ;
import java.util.Iterator;
import p407.InterfaceC4671;

/* renamed from: ˊᵎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2358 implements Iterable, InterfaceC4671 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f9330;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f9331;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f9332;

    public C2358(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f9332 = i;
        this.f9330 = ˎˑ.ˑי(i, i2, i3);
        this.f9331 = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2358) {
            if (!isEmpty() || !((C2358) obj).isEmpty()) {
                C2358 c2358 = (C2358) obj;
                if (this.f9332 != c2358.f9332 || this.f9330 != c2358.f9330 || this.f9331 != c2358.f9331) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f9332 * 31) + this.f9330) * 31) + this.f9331;
    }

    public boolean isEmpty() {
        int i = this.f9331;
        int i2 = this.f9330;
        int i3 = this.f9332;
        if (i > 0) {
            if (i3 <= i2) {
                return false;
            }
        } else if (i3 >= i2) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2356(this.f9332, this.f9330, this.f9331);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f9330;
        int i2 = this.f9332;
        int i3 = this.f9331;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
