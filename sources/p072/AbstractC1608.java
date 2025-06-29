package p072;

import p013.C1056;
import p148.AbstractC2269;
import p148.C2272;

/* renamed from: ʿʽ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1608 extends AbstractC1636 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final /* synthetic */ int f6381 = 0;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f6382;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f6383;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C1056 f6384;

    public abstract void shutdown();

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public void mo5223(long j, AbstractRunnableC1644 abstractRunnableC1644) {
        RunnableC1641.f6413.m5235(j, abstractRunnableC1644);
    }

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public final void m5224(boolean z) {
        this.f6382 = (z ? 4294967296L : 1L) + this.f6382;
        if (z) {
            return;
        }
        this.f6383 = true;
    }

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public final boolean m5225() {
        return this.f6382 >= 4294967296L;
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void m5226(boolean z) {
        long j = this.f6382 - (z ? 4294967296L : 1L);
        this.f6382 = j;
        if (j <= 0 && this.f6383) {
            shutdown();
        }
    }

    @Override // p072.AbstractC1636
    /* renamed from: ٴﹶ */
    public final AbstractC1636 mo5222(int i, String str) {
        AbstractC2269.m6283(1);
        return str != null ? new C2272(this, str) : this;
    }

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public abstract Thread mo5227();

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final void m5228(AbstractC1598 abstractC1598) {
        C1056 c1056 = this.f6384;
        if (c1056 == null) {
            c1056 = new C1056();
            this.f6384 = c1056;
        }
        c1056.addLast(abstractC1598);
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public abstract long mo5229();

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public final boolean m5230() {
        C1056 c1056 = this.f6384;
        if (c1056 == null) {
            return false;
        }
        AbstractC1598 abstractC1598 = (AbstractC1598) (c1056.isEmpty() ? null : c1056.removeFirst());
        if (abstractC1598 == null) {
            return false;
        }
        abstractC1598.run();
        return true;
    }
}
