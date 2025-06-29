package p181;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p428.C4920;

/* renamed from: ˋᵔ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ThreadFactoryC2513 implements ThreadFactory {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f9994;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Number f9995;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f9996;

    public ThreadFactoryC2513() {
        this.f9996 = 0;
        this.f9994 = Executors.defaultThreadFactory();
        this.f9995 = new AtomicInteger(1);
    }

    public ThreadFactoryC2513(String str, AtomicLong atomicLong) {
        this.f9996 = 1;
        this.f9994 = str;
        this.f9995 = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f9996) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.f9995;
                Thread threadNewThread = ((ThreadFactory) this.f9994).newThread(runnable);
                threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return threadNewThread;
            default:
                Thread threadNewThread2 = Executors.defaultThreadFactory().newThread(new C4920(runnable));
                threadNewThread2.setName(((String) this.f9994) + ((AtomicLong) this.f9995).getAndIncrement());
                return threadNewThread2;
        }
    }
}
