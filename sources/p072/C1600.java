package p072;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p253.C3150;
import p253.ExecutorC3146;
import p330.InterfaceC3747;
import p395.RunnableC4533;

/* renamed from: ʿʽ.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1600 extends AbstractC1633 implements InterfaceC1621 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Executor f6364;

    public C1600(Executor executor) {
        this.f6364 = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f6364;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1600) && ((C1600) obj).f6364 == this.f6364;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f6364);
    }

    @Override // p072.AbstractC1636
    public final String toString() {
        return this.f6364.toString();
    }

    @Override // p072.InterfaceC1621
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo5197(long j, C1602 c1602) {
        Executor executor = this.f6364;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new RunnableC4533(this, 9, c1602), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                AbstractC1642.m5282(c1602.f6371, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            c1602.m5210(new C1604(0, scheduledFutureSchedule));
        } else {
            RunnableC1641.f6413.mo5197(j, c1602);
        }
    }

    @Override // p072.AbstractC1636
    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final void mo5198(InterfaceC3747 interfaceC3747, Runnable runnable) {
        try {
            this.f6364.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            AbstractC1642.m5282(interfaceC3747, cancellationException);
            C3150 c3150 = AbstractC1586.f6345;
            ExecutorC3146.f12150.mo5198(interfaceC3747, runnable);
        }
    }

    @Override // p072.AbstractC1633
    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final Executor mo5199() {
        return this.f6364;
    }

    @Override // p072.InterfaceC1621
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final InterfaceC1639 mo5200(long j, RunnableC1625 runnableC1625, InterfaceC3747 interfaceC3747) {
        Executor executor = this.f6364;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnableC1625, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                AbstractC1642.m5282(interfaceC3747, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new C1632(scheduledFutureSchedule) : RunnableC1641.f6413.mo5200(j, runnableC1625, interfaceC3747);
    }
}
