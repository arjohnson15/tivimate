package p031;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p381.ScheduledExecutorServiceC4446;
import p381.ThreadFactoryC4444;
import p450.InterfaceC5190;

/* renamed from: ʼـ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1198 implements InterfaceC5190 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4937;

    public /* synthetic */ C1198(int i) {
        this.f4937 = i;
    }

    @Override // p450.InterfaceC5190
    public final Object get() {
        switch (this.f4937) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                C1199 c1199 = ExecutorsRegistrar.f3653;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    builderDetectNetwork.detectResourceMismatches();
                    if (i >= 26) {
                        builderDetectNetwork.detectUnbufferedIo();
                    }
                }
                return new ScheduledExecutorServiceC4446(Executors.newFixedThreadPool(4, new ThreadFactoryC4444("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f3654.get());
            case 3:
                C1199 c11992 = ExecutorsRegistrar.f3653;
                return new ScheduledExecutorServiceC4446(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC4444("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f3654.get());
            case 4:
                C1199 c11993 = ExecutorsRegistrar.f3653;
                return new ScheduledExecutorServiceC4446(Executors.newCachedThreadPool(new ThreadFactoryC4444("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f3654.get());
            default:
                C1199 c11994 = ExecutorsRegistrar.f3653;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC4444("Firebase Scheduler", 0, null));
        }
    }
}
