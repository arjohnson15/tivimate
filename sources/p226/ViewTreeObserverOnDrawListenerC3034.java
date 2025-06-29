package p226;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.RunnableC0246;

/* renamed from: ˑʽ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC3034 implements InterfaceExecutorC3029, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Runnable f11721;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC3030 f11723;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f11724 = SystemClock.uptimeMillis() + 10000;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f11722 = false;

    public ViewTreeObserverOnDrawListenerC3034(AbstractActivityC3030 abstractActivityC3030) {
        this.f11723 = abstractActivityC3030;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11721 = runnable;
        View decorView = this.f11723.getWindow().getDecorView();
        if (!this.f11722) {
            decorView.postOnAnimation(new RunnableC0246(8, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f11721;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f11724) {
                this.f11722 = false;
                this.f11723.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f11721 = null;
        C3042 c3042 = this.f11723.mFullyDrawnReporter;
        synchronized (c3042.f11739) {
            z = c3042.f11737;
        }
        if (z) {
            this.f11722 = false;
            this.f11723.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11723.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // p226.InterfaceExecutorC3029
    /* renamed from: ˋⁱ */
    public final void mo7521(View view) {
        if (this.f11722) {
            return;
        }
        this.f11722 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }
}
