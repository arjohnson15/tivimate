package p456;

/* renamed from: ﾞⁱ.יʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5295 extends AbstractC5339 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f20545;

    public AbstractC5295(C5273 c5273) {
        super(c5273);
        this.f20703.f20415++;
    }

    /* renamed from: ᴵˋ */
    public abstract boolean mo11760();

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public final void m11908() {
        if (this.f20545) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo11760();
        this.f20703.f20440++;
        this.f20545 = true;
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final void m11909() {
        if (!this.f20545) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
