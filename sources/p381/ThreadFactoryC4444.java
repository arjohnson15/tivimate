package p381;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import ʻˉ.ᐧˋ;

/* renamed from: ᵢᵎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ThreadFactoryC4444 implements ThreadFactory {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final ThreadFactory f17124 = Executors.defaultThreadFactory();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f17125;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f17126;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AtomicLong f17127 = new AtomicLong();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final StrictMode.ThreadPolicy f17128;

    public ThreadFactoryC4444(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f17125 = str;
        this.f17126 = i;
        this.f17128 = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f17124.newThread(new ᐧˋ(this, 25, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f17125 + " Thread #" + this.f17127.getAndIncrement());
        return threadNewThread;
    }
}
