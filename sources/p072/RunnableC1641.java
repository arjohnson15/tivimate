package p072;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p330.InterfaceC3747;

/* renamed from: ʿʽ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC1641 extends AbstractC1609 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final RunnableC1641 f6413;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final long f6414;

    static {
        Long l;
        RunnableC1641 runnableC1641 = new RunnableC1641();
        f6413 = runnableC1641;
        runnableC1641.m5224(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f6414 = timeUnit.toNanos(l.longValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM5232;
        AbstractC1628.f6403.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM5232) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jMo5229 = mo5229();
                    if (jMo5229 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f6414 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m5280();
                            if (m5232()) {
                                return;
                            }
                            mo5227();
                            return;
                        }
                        if (jMo5229 > j2) {
                            jMo5229 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jMo5229 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m5280();
                            if (m5232()) {
                                return;
                            }
                            mo5227();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo5229);
                    }
                }
            }
        } finally {
            _thread = null;
            m5280();
            if (!m5232()) {
                mo5227();
            }
        }
    }

    @Override // p072.AbstractC1609, p072.AbstractC1608
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p072.AbstractC1636
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // p072.AbstractC1608
    /* renamed from: ʻʻ */
    public final void mo5223(long j, AbstractRunnableC1644 abstractRunnableC1644) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final synchronized void m5280() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC1609.f6386.set(this, null);
            AbstractC1609.f6387.set(this, null);
            notifyAll();
        }
    }

    @Override // p072.AbstractC1609
    /* renamed from: ᐧʼ */
    public final void mo5234(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo5234(runnable);
    }

    @Override // p072.AbstractC1608
    /* renamed from: ᵎʾ */
    public final Thread mo5227() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(RunnableC1641.class.getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // p072.AbstractC1609, p072.InterfaceC1621
    /* renamed from: ᵎـ */
    public final InterfaceC1639 mo5200(long j, RunnableC1625 runnableC1625, InterfaceC3747 interfaceC3747) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return C1588.f6346;
        }
        long jNanoTime = System.nanoTime();
        C1622 c1622 = new C1622(j2 + jNanoTime, runnableC1625);
        m5235(jNanoTime, c1622);
        return c1622;
    }
}
