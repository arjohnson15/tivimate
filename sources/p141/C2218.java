package p141;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.lifecycle.RunnableC0246;
import j$.util.Objects;
import java.io.Closeable;
import java.io.OutputStream;

/* renamed from: ˉˑ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2218 implements Closeable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final HandlerThread f8782;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Handler f8783;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C2203 f8784;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final OutputStream f8785;

    public C2218(C2203 c2203, OutputStream outputStream) {
        this.f8784 = c2203;
        this.f8785 = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f8782 = handlerThread;
        handlerThread.start();
        this.f8783 = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        Handler handler = this.f8783;
        HandlerThread handlerThread = this.f8782;
        Objects.requireNonNull(handlerThread);
        handler.post(new RunnableC0246(3, handlerThread));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
