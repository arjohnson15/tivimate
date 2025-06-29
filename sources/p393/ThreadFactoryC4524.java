package p393;

import java.util.concurrent.ThreadFactory;

/* renamed from: ⁱˑ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ThreadFactoryC4524 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
