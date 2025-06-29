package p410;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p395.InterfaceFutureC4542;
import ᵎﹳ.ᐧʻ;
import ﹶⁱ.ـﹶ;

/* renamed from: ﹳˎ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4686 implements InterfaceFutureC4542 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final ـﹶ f17834;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final Object f17835;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public volatile C4683 f17836;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public volatile C4685 f17837;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public volatile Object f17838;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final boolean f17833 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final Logger f17832 = Logger.getLogger(AbstractC4686.class.getName());

    static {
        ـﹶ c4677;
        try {
            c4677 = new C4688(AtomicReferenceFieldUpdater.newUpdater(C4685.class, Thread.class, "ـﹶ"), AtomicReferenceFieldUpdater.newUpdater(C4685.class, C4685.class, "ʽᐧ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4686.class, C4685.class, "ˎˑ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4686.class, C4683.class, "ˆʿ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4686.class, Object.class, "ᐧⁱ"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c4677 = new C4677();
        }
        f17834 = c4677;
        if (th != null) {
            f17832.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f17835 = new Object();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m10586(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f17832.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static Object m10587(Object obj) throws ExecutionException {
        if (obj instanceof C4684) {
            CancellationException cancellationException = ((C4684) obj).f17827;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C4676) {
            throw new ExecutionException(((C4676) obj).f17811);
        }
        if (obj == f17835) {
            return null;
        }
        return obj;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static Object m10588(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m10589(AbstractC4686 abstractC4686) {
        C4685 c4685;
        C4683 c4683;
        C4683 c46832;
        C4683 c46833;
        do {
            c4685 = abstractC4686.f17837;
        } while (!f17834.ʿʼ(abstractC4686, c4685, C4685.f17829));
        while (true) {
            c4683 = null;
            if (c4685 == null) {
                break;
            }
            Thread thread = c4685.f17831;
            if (thread != null) {
                c4685.f17831 = null;
                LockSupport.unpark(thread);
            }
            c4685 = c4685.f17830;
        }
        abstractC4686.mo10064();
        do {
            c46832 = abstractC4686.f17836;
        } while (!f17834.ˑʽ(abstractC4686, c46832, C4683.f17821));
        while (true) {
            c46833 = c4683;
            c4683 = c46832;
            if (c4683 == null) {
                break;
            }
            c46832 = c4683.f17823;
            c4683.f17823 = c46833;
        }
        while (c46833 != null) {
            C4683 c46834 = c46833.f17823;
            m10586(c46833.f17824, c46833.f17822);
            c46833 = c46834;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f17838;
        if (obj != null) {
            return false;
        }
        if (!f17834.ﹳﹳ(this, obj, f17833 ? new C4684(z, new CancellationException("Future.cancel() was called.")) : z ? C4684.f17825 : C4684.f17826)) {
            return false;
        }
        m10589(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f17838;
        if (obj2 != null) {
            return m10587(obj2);
        }
        C4685 c4685 = this.f17837;
        C4685 c46852 = C4685.f17829;
        if (c4685 != c46852) {
            C4685 c46853 = new C4685();
            do {
                ـﹶ r3 = f17834;
                r3.ˆᵔ(c46853, c4685);
                if (r3.ʿʼ(this, c4685, c46853)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m10592(c46853);
                            throw new InterruptedException();
                        }
                        obj = this.f17838;
                    } while (obj == null);
                    return m10587(obj);
                }
                c4685 = this.f17837;
            } while (c4685 != c46852);
        }
        return m10587(this.f17838);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f17838;
        if (obj != null) {
            return m10587(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C4685 c4685 = this.f17837;
            C4685 c46852 = C4685.f17829;
            if (c4685 != c46852) {
                C4685 c46853 = new C4685();
                do {
                    ـﹶ r11 = f17834;
                    r11.ˆᵔ(c46853, c4685);
                    if (r11.ʿʼ(this, c4685, c46853)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m10592(c46853);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f17838;
                            if (obj2 != null) {
                                return m10587(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m10592(c46853);
                    } else {
                        c4685 = this.f17837;
                    }
                } while (c4685 != c46852);
            }
            return m10587(this.f17838);
        }
        while (nanos > 0) {
            Object obj3 = this.f17838;
            if (obj3 != null) {
                return m10587(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sb = ᐧʻ.ˑי(j, "Waited ", " ");
        sb.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sb.toString();
        if (nanos + 1000 < 0) {
            String str = ᐧʻ.ˉⁱ(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str2 = str + jConvert + " " + lowerCase;
                if (z) {
                    str2 = ᐧʻ.ˉⁱ(str2, ",");
                }
                str = ᐧʻ.ˉⁱ(str2, " ");
            }
            if (z) {
                str = str + nanos2 + " nanoseconds ";
            }
            string3 = ᐧʻ.ˉⁱ(str, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(ᐧʻ.ˉⁱ(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(ᐧʻ.ˋⁱ(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f17838 instanceof C4684;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f17838 != null;
    }

    public final String toString() {
        String strMo10582;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f17838 instanceof C4684) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m10590(sb);
        } else {
            try {
                strMo10582 = mo10582();
            } catch (RuntimeException e) {
                strMo10582 = "Exception thrown from implementation: " + e.getClass();
            }
            if (strMo10582 != null && !strMo10582.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strMo10582);
                sb.append("]");
            } else if (isDone()) {
                m10590(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10590(StringBuilder sb) {
        try {
            Object objM10588 = m10588(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM10588 == this ? "this future" : String.valueOf(objM10588));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean m10591(Object obj) {
        if (obj == null) {
            obj = f17835;
        }
        if (!f17834.ﹳﹳ(this, (Object) null, obj)) {
            return false;
        }
        m10589(this);
        return true;
    }

    /* renamed from: ˏʾ */
    public boolean mo10583(Throwable th) {
        th.getClass();
        if (!f17834.ﹳﹳ(this, (Object) null, new C4676(th))) {
            return false;
        }
        m10589(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˏᵢ */
    public String mo10582() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: ˑʽ */
    public void mo10064() {
    }

    @Override // p395.InterfaceFutureC4542
    /* renamed from: ـﹶ */
    public final void mo10415(Runnable runnable, Executor executor) {
        executor.getClass();
        C4683 c4683 = this.f17836;
        C4683 c46832 = C4683.f17821;
        if (c4683 != c46832) {
            C4683 c46833 = new C4683(runnable, executor);
            do {
                c46833.f17823 = c4683;
                if (f17834.ˑʽ(this, c4683, c46833)) {
                    return;
                } else {
                    c4683 = this.f17836;
                }
            } while (c4683 != c46832);
        }
        m10586(runnable, executor);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m10592(C4685 c4685) {
        c4685.f17831 = null;
        while (true) {
            C4685 c46852 = this.f17837;
            if (c46852 == C4685.f17829) {
                return;
            }
            C4685 c46853 = null;
            while (c46852 != null) {
                C4685 c46854 = c46852.f17830;
                if (c46852.f17831 != null) {
                    c46853 = c46852;
                } else if (c46853 != null) {
                    c46853.f17830 = c46854;
                    if (c46853.f17831 == null) {
                        break;
                    }
                } else if (!f17834.ʿʼ(this, c46852, c46854)) {
                    break;
                }
                c46852 = c46854;
            }
            return;
        }
    }
}
