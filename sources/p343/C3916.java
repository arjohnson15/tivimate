package p343;

import java.util.Iterator;

/* renamed from: ᵎـ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3916 extends AbstractC3912 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f15224 = true;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C3915 f15225;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C3913 f15226;

    public C3916(C3915 c3915) {
        this.f15225 = c3915;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15224) {
            return this.f15225.f15223 != null;
        }
        C3913 c3913 = this.f15226;
        return (c3913 == null || c3913.f15216 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15224) {
            this.f15224 = false;
            this.f15226 = this.f15225.f15223;
        } else {
            C3913 c3913 = this.f15226;
            this.f15226 = c3913 != null ? c3913.f15216 : null;
        }
        return this.f15226;
    }

    @Override // p343.AbstractC3912
    /* renamed from: ـﹶ */
    public final void mo9101(C3913 c3913) {
        C3913 c39132 = this.f15226;
        if (c3913 == c39132) {
            C3913 c39133 = c39132.f15217;
            this.f15226 = c39133;
            this.f15224 = c39133 == null;
        }
    }
}
