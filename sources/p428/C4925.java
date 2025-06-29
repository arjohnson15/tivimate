package p428;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.measurement.C0559;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p007.C0937;
import p065.C1500;
import p084.C1713;
import p210.C2804;
import p251.C3130;
import p251.C3136;
import p251.RunnableC3129;
import p331.C3767;
import p351.C4005;
import ʾי.ˑʽ;
import ˉˆ.ﹳﹳ;
import ᴵﹳ.ﹶˆ;

/* renamed from: ﹶˊ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4925 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0937 f18611;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C0559 f18612;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C4005 f18613;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final ExecutorService f18614;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final ﹶˆ f18615;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C4005 f18616;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final C1713 f18617;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C4942 f18618;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3767 f18619;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final ˑʽ f18620;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f18621;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C0559 f18622;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C4927 f18623;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final C4921 f18624;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f18625;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final ﹳﹳ f18626;

    public C4925(C2804 c2804, C4942 c4942, C1713 c1713, C0937 c0937, C4005 c4005, C4005 c40052, ﹳﹳ r7, ExecutorService executorService, C4921 c4921, ˑʽ r10) {
        this.f18611 = c0937;
        c2804.m7085();
        this.f18621 = c2804.f10936;
        this.f18618 = c4942;
        this.f18617 = c1713;
        this.f18613 = c4005;
        this.f18616 = c40052;
        this.f18614 = executorService;
        this.f18626 = r7;
        this.f18615 = new ﹶˆ(executorService, 14);
        this.f18624 = c4921;
        this.f18620 = r10;
        this.f18625 = System.currentTimeMillis();
        this.f18619 = new C3767(19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [ﹶˊ.ˑי] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3130 m11038(final C4925 c4925, C1500 c1500) {
        C3130 c3130;
        CallableC4937 callableC4937;
        ﹶˆ r0 = c4925.f18615;
        ﹶˆ r1 = c4925.f18615;
        if (!Boolean.TRUE.equals(((ThreadLocal) r0.ᐧˋ).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        c4925.f18612.m2500();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        try {
            try {
                c4925.f18613.mo3800(new Object() { // from class: ﹶˊ.ˑי
                });
                c4925.f18623.m11044();
                if (c1500.m5065().f18189.f12701) {
                    if (!c4925.f18623.m11046(c1500)) {
                    }
                    c3130 = c4925.f18623.m11045(((C3136) ((AtomicReference) c1500.f6101).get()).f12093);
                    callableC4937 = new CallableC4937(c4925, 0);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    }
                    RuntimeException runtimeException = new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                    c3130 = new C3130();
                    c3130.m7692(runtimeException);
                    callableC4937 = new CallableC4937(c4925, 0);
                }
            } catch (Exception e) {
                c3130 = new C3130();
                c3130.m7692(e);
                callableC4937 = new CallableC4937(c4925, 0);
            }
            r1.ᵢٴ(callableC4937);
            return c3130;
        } catch (Throwable th) {
            r1.ᵢٴ(new CallableC4937(c4925, 0));
            throw th;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m11039(C1500 c1500) throws ExecutionException, InterruptedException, TimeoutException {
        Future<?> futureSubmit = this.f18614.submit(new RunnableC3129(this, 23, c1500));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        } catch (TimeoutException e3) {
        }
    }
}
