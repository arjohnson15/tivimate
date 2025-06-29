package p404;

import android.view.Choreographer;

/* renamed from: ﹳʻ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4637 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m10545(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: ﹳʻ.ˑʽ
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
