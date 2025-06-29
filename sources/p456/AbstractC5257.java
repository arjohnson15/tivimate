package p456;

import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5257 extends AbstractC5277 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f20365;

    public AbstractC5257(C5236 c5236) {
        super(c5236);
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20099++;
    }

    /* renamed from: ᴵˋ */
    public abstract boolean mo11715();

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public final void m11756() {
        if (this.f20365) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo11715()) {
            return;
        }
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20111.incrementAndGet();
        this.f20365 = true;
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final void m11757() {
        if (!this.f20365) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
