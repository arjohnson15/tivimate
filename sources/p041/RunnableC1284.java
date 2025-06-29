package p041;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p127.C2034;
import p430.InterfaceC4992;
import ˈי.ʾˈ;
import ᴵﹳ.ﹶˆ;

/* renamed from: ʽˉ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC1284 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public volatile AtomicInteger f5281 = new AtomicInteger(0);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C1274 f5282;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4992 f5283;

    public RunnableC1284(C1274 c1274, InterfaceC4992 interfaceC4992) {
        this.f5282 = c1274;
        this.f5283 = interfaceC4992;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ﹶˆ r0;
        String strConcat = "OkHttp ".concat(this.f5282.f5221.f19052.m11092());
        C1274 c1274 = this.f5282;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            c1274.f5229.m9582();
            boolean z = false;
            try {
                try {
                    try {
                        this.f5283.mo5428(c1274.m4539());
                        r0 = c1274.f5230.f18931;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            C2034 c2034 = C2034.f7700;
                            C2034 c20342 = C2034.f7700;
                            String str = "Callback failure for " + C1274.m4537(c1274);
                            c20342.getClass();
                            C2034.m5684(4, str, e);
                        } else {
                            this.f5283.mo5427(e);
                        }
                        r0 = c1274.f5230.f18931;
                        r0.ˎٴ(this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        c1274.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            ʾˈ.ـﹶ(iOException, th);
                            this.f5283.mo5427(iOException);
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                r0.ˎٴ(this);
            } catch (Throwable th3) {
                c1274.f5230.f18931.ˎٴ(this);
                throw th3;
            }
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
