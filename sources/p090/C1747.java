package p090;

/* renamed from: ʿﹶ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1747 extends RuntimeException {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Throwable f6766;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f6767;

    public C1747(int i, Throwable th) {
        super(th);
        this.f6767 = i;
        this.f6766 = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f6766;
    }
}
