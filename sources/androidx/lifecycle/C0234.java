package androidx.lifecycle;

import android.os.Handler;

/* renamed from: androidx.lifecycle.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0234 implements InterfaceC0262 {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final C0234 f1259 = new C0234();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f1260;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Handler f1261;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f1265;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f1263 = true;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f1264 = true;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C0236 f1266 = new C0236(this);

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final RunnableC0246 f1267 = new RunnableC0246(0, this);

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final ʾי.ˑʽ f1262 = new ʾי.ˑʽ(3, this);

    @Override // androidx.lifecycle.InterfaceC0262
    public final AbstractC0233 getLifecycle() {
        return this.f1266;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m1033() {
        int i = this.f1260 + 1;
        this.f1260 = i;
        if (i == 1) {
            if (!this.f1263) {
                this.f1261.removeCallbacks(this.f1267);
            } else {
                this.f1266.m1034(EnumC0247.ON_RESUME);
                this.f1263 = false;
            }
        }
    }
}
