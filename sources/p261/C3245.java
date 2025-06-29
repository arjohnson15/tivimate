package p261;

import p329.AbstractC3740;

/* renamed from: ـ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3245 implements InterfaceC3251 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean f12649;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C3234 f12650;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC3251 f12651;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C3233 f12652;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean f12653;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f12654;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f12655;

    public C3245(InterfaceC3251 interfaceC3251, boolean z, boolean z2, C3234 c3234, C3233 c3233) {
        AbstractC3740.m8706(interfaceC3251, "Argument must not be null");
        this.f12651 = interfaceC3251;
        this.f12653 = z;
        this.f12649 = z2;
        this.f12650 = c3234;
        AbstractC3740.m8706(c3233, "Argument must not be null");
        this.f12652 = c3233;
    }

    @Override // p261.InterfaceC3251
    public final Object get() {
        return this.f12651.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f12653 + ", listener=" + this.f12652 + ", key=" + this.f12650 + ", acquired=" + this.f12654 + ", isRecycled=" + this.f12655 + ", resource=" + this.f12651 + '}';
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ʽᐧ */
    public final int mo4601() {
        return this.f12651.mo4601();
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ʿʼ */
    public final synchronized void mo4602() {
        if (this.f12654 > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f12655) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f12655 = true;
        if (this.f12649) {
            this.f12651.mo4602();
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7996() {
        boolean z;
        synchronized (this) {
            int i = this.f12654;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f12654 = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f12652.m7987(this.f12650, this);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized void m7997() {
        if (this.f12655) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f12654++;
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ﹳﹳ */
    public final Class mo4603() {
        return this.f12651.mo4603();
    }
}
