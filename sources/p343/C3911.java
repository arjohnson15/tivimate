package p343;

import java.util.Iterator;

/* renamed from: ᵎـ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3911 extends AbstractC3912 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C3913 f15212;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ int f15213;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C3913 f15214;

    public C3911(C3913 c3913, C3913 c39132, int i) {
        this.f15213 = i;
        this.f15214 = c39132;
        this.f15212 = c3913;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15212 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C3913 c3913 = this.f15212;
        C3913 c39132 = this.f15214;
        this.f15212 = (c3913 == c39132 || c39132 == null) ? null : m9100(c3913);
        return c3913;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3913 m9100(C3913 c3913) {
        switch (this.f15213) {
            case 0:
                return c3913.f15216;
            default:
                return c3913.f15217;
        }
    }

    @Override // p343.AbstractC3912
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo9101(C3913 c3913) {
        C3913 c39132;
        C3913 c3913M9100 = null;
        if (this.f15214 == c3913 && c3913 == this.f15212) {
            this.f15212 = null;
            this.f15214 = null;
        }
        C3913 c39133 = this.f15214;
        if (c39133 == c3913) {
            switch (this.f15213) {
                case 0:
                    c39132 = c39133.f15217;
                    break;
                default:
                    c39132 = c39133.f15216;
                    break;
            }
            this.f15214 = c39132;
        }
        C3913 c39134 = this.f15212;
        if (c39134 == c3913) {
            C3913 c39135 = this.f15214;
            if (c39134 != c39135 && c39135 != null) {
                c3913M9100 = m9100(c39134);
            }
            this.f15212 = c3913M9100;
        }
    }
}
