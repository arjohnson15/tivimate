package p137;

import android.graphics.Bitmap;
import p329.AbstractC3742;

/* renamed from: ˉˈ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2101 implements InterfaceC2103 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f8299;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Bitmap.Config f8300;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2100 f8301;

    public C2101(C2100 c2100) {
        this.f8301 = c2100;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2101)) {
            return false;
        }
        C2101 c2101 = (C2101) obj;
        return this.f8299 == c2101.f8299 && AbstractC3742.m8708(this.f8300, c2101.f8300);
    }

    public final int hashCode() {
        int i = this.f8299 * 31;
        Bitmap.Config config = this.f8300;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C2102.m5954(this.f8299, this.f8300);
    }

    @Override // p137.InterfaceC2103
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo5953() {
        this.f8301.ˎᵢ(this);
    }
}
