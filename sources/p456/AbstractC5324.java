package p456;

import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ᵎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5324 extends ﹳﹳ {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f20648;

    public AbstractC5324(C5236 c5236) {
        super(c5236);
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20099++;
    }

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public final void m11997() {
        if (!this.f20648) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: ᵔˋ */
    public abstract boolean mo11746();

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public final void m11998() {
        if (this.f20648) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo11746()) {
            return;
        }
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20111.incrementAndGet();
        this.f20648 = true;
    }
}
