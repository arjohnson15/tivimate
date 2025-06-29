package androidx.lifecycle;

/* renamed from: androidx.lifecycle.יˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC0237 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final EnumC0247 f1277;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f1278;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0236 f1279;

    public RunnableC0237(C0236 c0236, EnumC0247 enumC0247) {
        this.f1279 = c0236;
        this.f1277 = enumC0247;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1278) {
            return;
        }
        this.f1279.m1034(this.f1277);
        this.f1278 = true;
    }
}
