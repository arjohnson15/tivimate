package p428;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p065.C1500;
import p084.C1713;
import ᵢ.ʿʼ;

/* renamed from: ﹶˊ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4938 implements Thread.UncaughtExceptionHandler {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1500 f18681;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AtomicBoolean f18682 = new AtomicBoolean(false);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Thread.UncaughtExceptionHandler f18683;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ʿʼ f18684;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1713 f18685;

    public C4938(ʿʼ r1, C1500 c1500, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1713 c1713) {
        this.f18684 = r1;
        this.f18681 = c1500;
        this.f18683 = uncaughtExceptionHandler;
        this.f18685 = c1713;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f18683;
        AtomicBoolean atomicBoolean = this.f18682;
        atomicBoolean.set(true);
        try {
            if (m11063(thread, th)) {
                this.f18684.ˋⁱ(this.f18681, thread, th);
            } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
        } catch (Exception e) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
            atomicBoolean.set(false);
            throw th2;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
        atomicBoolean.set(false);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m11063(Thread thread, Throwable th) {
        if (thread != null && th != null) {
            if (!this.f18685.m5429()) {
                return true;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            return false;
        }
        return false;
    }
}
