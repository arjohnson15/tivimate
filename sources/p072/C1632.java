package p072;

import java.util.concurrent.ScheduledFuture;

/* renamed from: ʿʽ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1632 implements InterfaceC1639 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ScheduledFuture f6408;

    public C1632(ScheduledFuture scheduledFuture) {
        this.f6408 = scheduledFuture;
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f6408 + ']';
    }

    @Override // p072.InterfaceC1639
    /* renamed from: ـﹶ */
    public final void mo5179() {
        this.f6408.cancel(false);
    }
}
