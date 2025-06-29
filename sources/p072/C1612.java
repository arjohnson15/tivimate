package p072;

/* renamed from: ʿʽ.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1612 extends AbstractRunnableC1644 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C1602 f6389;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1609 f6390;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612(AbstractC1609 abstractC1609, long j, C1602 c1602) {
        super(j);
        this.f6390 = abstractC1609;
        this.f6389 = c1602;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6389.m5211(this.f6390);
    }

    @Override // p072.AbstractRunnableC1644
    public final String toString() {
        return super.toString() + this.f6389;
    }
}
