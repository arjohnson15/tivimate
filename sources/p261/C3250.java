package p261;

import p337.C3825;

/* renamed from: ـ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3250 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f12699;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f12700;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f12701;

    public C3250(boolean z, boolean z2, boolean z3) {
        this.f12701 = z;
        this.f12699 = z2;
        this.f12700 = z3;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean m8008() {
        return (this.f12700 || this.f12699) && this.f12701;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C3825 m8009() {
        if (this.f12701 || !(this.f12699 || this.f12700)) {
            return new C3825(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
