package p251;

import java.util.concurrent.ExecutionException;

/* renamed from: יˎ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3138 implements InterfaceC3128, InterfaceC3137, InterfaceC3127 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f12094;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f12095;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f12096;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3130 f12097;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f12098;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f12099 = new Object();

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f12100;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public Exception f12101;

    public C3138(int i, C3130 c3130) {
        this.f12094 = i;
        this.f12097 = c3130;
    }

    @Override // p251.InterfaceC3137
    /* renamed from: ʿˏ */
    public final void mo7698(Exception exc) {
        synchronized (this.f12099) {
            this.f12095++;
            this.f12101 = exc;
            m7704();
        }
    }

    @Override // p251.InterfaceC3128
    /* renamed from: ˏᴵ */
    public final void mo7675(Object obj) {
        synchronized (this.f12099) {
            this.f12098++;
            m7704();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7704() {
        int i = this.f12098 + this.f12095 + this.f12100;
        int i2 = this.f12094;
        if (i == i2) {
            Exception exc = this.f12101;
            C3130 c3130 = this.f12097;
            if (exc == null) {
                if (this.f12096) {
                    c3130.m7694();
                    return;
                } else {
                    c3130.m7688(null);
                    return;
                }
            }
            c3130.m7692(new ExecutionException(this.f12095 + " out of " + i2 + " underlying tasks failed", this.f12101));
        }
    }

    @Override // p251.InterfaceC3127
    /* renamed from: ᴵʿ */
    public final void mo7674() {
        synchronized (this.f12099) {
            this.f12100++;
            this.f12096 = true;
            m7704();
        }
    }
}
