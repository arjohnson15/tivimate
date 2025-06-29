package p236;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ˑי.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ThreadFactoryC3090 implements ThreadFactory {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AtomicInteger f11927 = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f11927.getAndIncrement());
        return thread;
    }
}
