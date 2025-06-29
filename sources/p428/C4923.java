package p428;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import ˆʽ.ᵎˏ;

/* renamed from: ﹶˊ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4923 extends AbstractRunnableC4940 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ ExecutorService f18605;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ TimeUnit f18606;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ String f18607;

    public C4923(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f18607 = str;
        this.f18605 = executorService;
        this.f18606 = timeUnit;
    }

    @Override // p428.AbstractRunnableC4940
    /* renamed from: ـﹶ */
    public final void mo11035() {
        String str = this.f18607;
        ExecutorService executorService = this.f18605;
        try {
            "Executing shutdown hook for ".concat(str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            executorService.shutdown();
            if (executorService.awaitTermination(2L, this.f18606)) {
                return;
            }
            str.concat(" did not shut down in the allocated time. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            ᵎˏ.ˑי("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            executorService.shutdownNow();
        }
    }
}
