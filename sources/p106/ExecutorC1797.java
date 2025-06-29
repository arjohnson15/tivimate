package p106;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC0413;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p123.RunnableC2003;
import p456.C5244;
import ᴵﹳ.ﹶˆ;

/* renamed from: ˆᵎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ExecutorC1797 implements Executor {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f6944;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f6945;

    public ExecutorC1797() {
        this.f6945 = 2;
        HandlerC0413 handlerC0413 = new HandlerC0413(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f6944 = handlerC0413;
    }

    public /* synthetic */ ExecutorC1797(int i, Object obj) {
        this.f6945 = i;
        this.f6944 = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6945) {
            case 0:
                ((Handler) ((ﹶˆ) this.f6944).ˎˑ).post(runnable);
                break;
            case 1:
                ((ExecutorService) this.f6944).execute(new RunnableC2003(runnable, 0));
                break;
            case 2:
                ((HandlerC0413) this.f6944).post(runnable);
                break;
            default:
                ((C5244) this.f6944).ʽᐧ().m11743(runnable);
                break;
        }
    }
}
