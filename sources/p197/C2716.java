package p197;

/* renamed from: ˎˑ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2716 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ C2718 f10631;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long f10632 = -1;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f10630 = false;

    public C2716(C2718 c2718) {
        this.f10631 = c2718;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6882(boolean z) {
        C2718 c2718 = this.f10631;
        if (z && c2718.mo6891() == -1) {
            throw new UnsupportedOperationException("Error: Cannot reverse infinite animator set");
        }
        if (this.f10632 < 0 || z == this.f10630) {
            return;
        }
        this.f10632 = c2718.mo6891() - this.f10632;
        this.f10630 = z;
    }
}
