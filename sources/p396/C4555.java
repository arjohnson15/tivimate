package p396;

import java.util.concurrent.CompletableFuture;

/* renamed from: ⁱᴵ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4555 extends CompletableFuture {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4590 f17463;

    public C4555(C4590 c4590) {
        this.f17463 = c4590;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.f17463.cancel();
        }
        return super.cancel(z);
    }
}
