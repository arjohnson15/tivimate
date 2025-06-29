package p261;

import p082.AbstractC1710;
import p082.C1707;
import p082.InterfaceC1706;
import p260.C3222;
import ﹳᴵ.ˉי;

/* renamed from: ـ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3252 implements InterfaceC3251, InterfaceC1706 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final C3222 f12702 = AbstractC1710.m5426(20, new ˉי(29));

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public InterfaceC3251 f12703;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f12704;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f12705;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1707 f12706 = new C1707();

    @Override // p261.InterfaceC3251
    public final Object get() {
        return this.f12703.get();
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ʽᐧ */
    public final int mo4601() {
        return this.f12703.mo4601();
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ʿʼ */
    public final synchronized void mo4602() {
        this.f12706.m5423();
        this.f12705 = true;
        if (!this.f12704) {
            this.f12703.mo4602();
            this.f12703 = null;
            f12702.m7946(this);
        }
    }

    @Override // p082.InterfaceC1706
    /* renamed from: ˑʽ */
    public final C1707 mo5422() {
        return this.f12706;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized void m8010() {
        this.f12706.m5423();
        if (!this.f12704) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f12704 = false;
        if (this.f12705) {
            mo4602();
        }
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ﹳﹳ */
    public final Class mo4603() {
        return this.f12703.mo4603();
    }
}
