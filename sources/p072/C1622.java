package p072;

/* renamed from: ʿʽ.ᴵʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1622 extends AbstractRunnableC1644 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final RunnableC1625 f6398;

    public C1622(long j, RunnableC1625 runnableC1625) {
        super(j);
        this.f6398 = runnableC1625;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6398.run();
    }

    @Override // p072.AbstractRunnableC1644
    public final String toString() {
        return super.toString() + this.f6398;
    }
}
