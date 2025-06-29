package p410;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p395.InterfaceFutureC4542;

/* renamed from: ﹳˎ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4681 implements InterfaceFutureC4542 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4678 f17815 = new C4678(this);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final WeakReference f17816;

    public C4681(C4682 c4682) {
        this.f17816 = new WeakReference(c4682);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C4682 c4682 = (C4682) this.f17816.get();
        boolean zCancel = this.f17815.cancel(z);
        if (zCancel && c4682 != null) {
            c4682.f17819 = null;
            c4682.f17817 = null;
            c4682.f17818.m10591(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f17815.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f17815.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f17815.f17838 instanceof C4684;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f17815.isDone();
    }

    public final String toString() {
        return this.f17815.toString();
    }

    @Override // p395.InterfaceFutureC4542
    /* renamed from: ـﹶ */
    public final void mo10415(Runnable runnable, Executor executor) {
        this.f17815.mo10415(runnable, executor);
    }
}
