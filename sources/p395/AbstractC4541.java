package p395;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p305.C3532;
import p431.AbstractC5023;
import ˎˊ.ˏʾ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ⁱـ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4541 extends AbstractC5023 implements InterfaceFutureC4542 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final C3532 f17436;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final boolean f17437;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final ˏʾ f17438;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final Object f17439;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public volatile C4545 f17440;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public volatile C4532 f17441;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public volatile Object f17442;

    static {
        boolean z;
        ˏʾ c4539;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f17437 = z;
        f17436 = new C3532();
        Throwable th = null;
        try {
            c4539 = new C4531();
            e = null;
        } catch (Error | Exception e) {
            e = e;
            try {
                c4539 = new C4529(AtomicReferenceFieldUpdater.newUpdater(C4532.class, Thread.class, "ـﹶ"), AtomicReferenceFieldUpdater.newUpdater(C4532.class, C4532.class, "ʽᐧ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4541.class, C4532.class, "ˎˑ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4541.class, C4545.class, "ˆʿ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4541.class, Object.class, "ᐧⁱ"));
            } catch (Error | Exception e2) {
                th = e2;
                c4539 = new C4539();
            }
        }
        f17438 = c4539;
        if (th != null) {
            C3532 c3532 = f17436;
            Logger loggerM8420 = c3532.m8420();
            Level level = Level.SEVERE;
            loggerM8420.log(level, "UnsafeAtomicHelper is broken!", e);
            c3532.m8420().log(level, "SafeAtomicHelper is broken!", th);
        }
        f17439 = new Object();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m10408(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f17436.m8420().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static Object m10409(Object obj) throws ExecutionException {
        if (obj instanceof C4538) {
            RuntimeException runtimeException = ((C4538) obj).f17435;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof C4537) {
            throw new ExecutionException(((C4537) obj).f17432);
        }
        if (obj == f17439) {
            return null;
        }
        return obj;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static Object m10410(AbstractC4541 abstractC4541) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC4541.get();
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
    public static void m10411(AbstractC4541 abstractC4541) {
        abstractC4541.getClass();
        for (C4532 c4532 = f17438.ˎٴ(abstractC4541); c4532 != null; c4532 = c4532.f17420) {
            Thread thread = c4532.f17421;
            if (thread != null) {
                c4532.f17421 = null;
                LockSupport.unpark(thread);
            }
        }
        C4545 c4545 = f17438.ᵎـ(abstractC4541);
        C4545 c45452 = null;
        while (c4545 != null) {
            C4545 c45453 = c4545.f17447;
            c4545.f17447 = c45452;
            c45452 = c4545;
            c4545 = c45453;
        }
        while (c45452 != null) {
            C4545 c45454 = c45452.f17447;
            Runnable runnable = c45452.f17448;
            Objects.requireNonNull(runnable);
            Executor executor = c45452.f17446;
            Objects.requireNonNull(executor);
            m10408(runnable, executor);
            c45452 = c45454;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C4538 c4538;
        Object obj = this.f17442;
        if (obj != null) {
            return false;
        }
        if (f17437) {
            c4538 = new C4538(z, new CancellationException("Future.cancel() was called."));
        } else {
            c4538 = z ? C4538.f17433 : C4538.f17434;
            Objects.requireNonNull(c4538);
        }
        if (!f17438.ˉי(this, obj, c4538)) {
            return false;
        }
        m10411(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f17442;
        if (obj2 != null) {
            return m10409(obj2);
        }
        C4532 c4532 = this.f17441;
        C4532 c45322 = C4532.f17419;
        if (c4532 != c45322) {
            C4532 c45323 = new C4532();
            do {
                ˏʾ r3 = f17438;
                r3.ᵢʿ(c45323, c4532);
                if (r3.ˏʾ(this, c4532, c45323)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m10416(c45323);
                            throw new InterruptedException();
                        }
                        obj = this.f17442;
                    } while (obj == null);
                    return m10409(obj);
                }
                c4532 = this.f17441;
            } while (c4532 != c45322);
        }
        Object obj3 = this.f17442;
        Objects.requireNonNull(obj3);
        return m10409(obj3);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f17442;
        if (obj != null) {
            return m10409(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C4532 c4532 = this.f17441;
            C4532 c45322 = C4532.f17419;
            if (c4532 != c45322) {
                C4532 c45323 = new C4532();
                do {
                    ˏʾ r11 = f17438;
                    r11.ᵢʿ(c45323, c4532);
                    if (r11.ˏʾ(this, c4532, c45323)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m10416(c45323);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f17442;
                            if (obj2 != null) {
                                return m10409(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m10416(c45323);
                    } else {
                        c4532 = this.f17441;
                    }
                } while (c4532 != c45322);
            }
            Object obj3 = this.f17442;
            Objects.requireNonNull(obj3);
            return m10409(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f17442;
            if (obj4 != null) {
                return m10409(obj4);
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
    public boolean isCancelled() {
        return this.f17442 instanceof C4538;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f17442 != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L4f
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto La2
        L4f:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L59
            r6.m10412(r0)
            goto La2
        L59:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.String r3 = r6.m10413()     // Catch: java.lang.StackOverflowError -> L70 java.lang.Exception -> L72
            if (r3 == 0) goto L6e
            boolean r4 = r3.isEmpty()     // Catch: java.lang.StackOverflowError -> L70 java.lang.Exception -> L72
            if (r4 == 0) goto L85
        L6e:
            r3 = 0
            goto L85
        L70:
            r3 = move-exception
            goto L73
        L72:
            r3 = move-exception
        L73:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Exception thrown from implementation: "
            r4.<init>(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L85:
            if (r3 == 0) goto L92
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        L92:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto La2
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.m10412(r0)
        La2:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p395.AbstractC4541.toString():java.lang.String");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10412(StringBuilder sb) {
        try {
            Object objM10410 = m10410(this);
            sb.append("SUCCESS, result=[");
            m10414(sb, objM10410);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String m10413() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m10414(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // p395.InterfaceFutureC4542
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void mo10415(Runnable runnable, Executor executor) {
        C4545 c4545;
        C4545 c45452;
        if (!isDone() && (c4545 = this.f17440) != (c45452 = C4545.f17445)) {
            C4545 c45453 = new C4545(runnable, executor);
            do {
                c45453.f17447 = c4545;
                if (f17438.ﹶˆ(this, c4545, c45453)) {
                    return;
                } else {
                    c4545 = this.f17440;
                }
            } while (c4545 != c45452);
        }
        m10408(runnable, executor);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m10416(C4532 c4532) {
        c4532.f17421 = null;
        while (true) {
            C4532 c45322 = this.f17441;
            if (c45322 == C4532.f17419) {
                return;
            }
            C4532 c45323 = null;
            while (c45322 != null) {
                C4532 c45324 = c45322.f17420;
                if (c45322.f17421 != null) {
                    c45323 = c45322;
                } else if (c45323 != null) {
                    c45323.f17420 = c45324;
                    if (c45323.f17421 == null) {
                        break;
                    }
                } else if (!f17438.ˏʾ(this, c45322, c45324)) {
                    break;
                }
                c45322 = c45324;
            }
            return;
        }
    }
}
