package p076;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p383.AbstractC4464;

/* renamed from: ʿˉ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class HandlerC1655 extends Handler implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC1656 f6453;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public IOException f6454;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f6455;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f6456;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public volatile boolean f6457;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public InterfaceC1658 f6458;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f6459;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final /* synthetic */ C1659 f6460;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f6461;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public Thread f6462;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1655(C1659 c1659, Looper looper, InterfaceC1656 interfaceC1656, InterfaceC1658 interfaceC1658, int i, long j) {
        super(looper);
        this.f6460 = c1659;
        this.f6453 = interfaceC1656;
        this.f6458 = interfaceC1658;
        this.f6459 = i;
        this.f6456 = j;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f6457) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            this.f6454 = null;
            C1659 c1659 = this.f6460;
            ExecutorService executorService = c1659.f6474;
            HandlerC1655 handlerC1655 = c1659.f6472;
            handlerC1655.getClass();
            executorService.execute(handlerC1655);
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f6460.f6472 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f6456;
        InterfaceC1658 interfaceC1658 = this.f6458;
        interfaceC1658.getClass();
        if (this.f6455) {
            interfaceC1658.mo5328(this.f6453, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                interfaceC1658.mo5329(this.f6453, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                AbstractC4464.m10147("LoadTask", "Unexpected exception handling load completed", e);
                this.f6460.f6473 = new Loader$UnexpectedLoaderException(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f6454 = iOException;
        int i3 = this.f6461 + 1;
        this.f6461 = i3;
        C1654 c1654Mo5327 = interfaceC1658.mo5327(this.f6453, jElapsedRealtime, j, iOException, i3);
        int i4 = c1654Mo5327.f6452;
        if (i4 == 3) {
            this.f6460.f6473 = this.f6454;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.f6461 = 1;
            }
            long jMin = c1654Mo5327.f6451;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f6461 - 1) * 1000, 5000);
            }
            C1659 c16592 = this.f6460;
            AbstractC4464.m10132(c16592.f6472 == null);
            c16592.f6472 = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                this.f6454 = null;
                c16592.f6474.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f6455;
                this.f6462 = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f6453.getClass().getSimpleName()));
                try {
                    this.f6453.mo5326();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f6462 = null;
                Thread.interrupted();
            }
            if (this.f6457) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f6457) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.f6457) {
                return;
            }
            AbstractC4464.m10147("LoadTask", "OutOfMemory error loading stream", e2);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.f6457) {
                AbstractC4464.m10147("LoadTask", "Unexpected error loading stream", e3);
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.f6457) {
                return;
            }
            AbstractC4464.m10147("LoadTask", "Unexpected exception loading stream", e4);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e4)).sendToTarget();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5324(boolean z) {
        this.f6457 = z;
        this.f6454 = null;
        if (hasMessages(1)) {
            this.f6455 = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f6455 = true;
                    this.f6453.mo5325();
                    Thread thread = this.f6462;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.f6460.f6472 = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC1658 interfaceC1658 = this.f6458;
            interfaceC1658.getClass();
            interfaceC1658.mo5328(this.f6453, jElapsedRealtime, jElapsedRealtime - this.f6456, true);
            this.f6458 = null;
        }
    }
}
