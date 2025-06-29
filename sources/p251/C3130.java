package p251;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p417.AbstractC4753;
import ʻˋ.ˋˊ;

/* renamed from: יˎ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3130 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f12082;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f12083;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Exception f12085;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public volatile boolean f12086;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f12084 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ˋˊ f12081 = new ˋˊ(5);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Exception m7684() {
        Exception exc;
        synchronized (this.f12084) {
            exc = this.f12085;
        }
        return exc;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m7685() {
        boolean z;
        synchronized (this.f12084) {
            try {
                z = false;
                if (this.f12083 && !this.f12086 && this.f12085 == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m7686() {
        if (this.f12083) {
            int i = DuplicateTaskCompletionException.f3112;
            if (!m7693()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excM7684 = m7684();
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m7687() {
        synchronized (this.f12084) {
            try {
                if (this.f12083) {
                    this.f12081.ˏᴵ(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m7688(Object obj) {
        synchronized (this.f12084) {
            m7686();
            this.f12083 = true;
            this.f12082 = obj;
        }
        this.f12081.ˏᴵ(this);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object m7689() {
        Object obj;
        synchronized (this.f12084) {
            try {
                AbstractC4753.m10681("Task is not yet complete", this.f12083);
                if (this.f12086) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f12085;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f12082;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3130 m7690(Executor executor, InterfaceC3134 interfaceC3134) {
        C3130 c3130 = new C3130();
        this.f12081.ᴵʿ(new C3131(executor, interfaceC3134, c3130, 0));
        m7687();
        return c3130;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C3130 m7691(ExecutorService executorService, InterfaceC3135 interfaceC3135) {
        C3130 c3130 = new C3130();
        this.f12081.ᴵʿ(new C3131(executorService, interfaceC3135, c3130, 6));
        m7687();
        return c3130;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m7692(Exception exc) {
        AbstractC4753.m10689(exc, "Exception must not be null");
        synchronized (this.f12084) {
            m7686();
            this.f12083 = true;
            this.f12085 = exc;
        }
        this.f12081.ˏᴵ(this);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m7693() {
        boolean z;
        synchronized (this.f12084) {
            z = this.f12083;
        }
        return z;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m7694() {
        synchronized (this.f12084) {
            try {
                if (this.f12083) {
                    return;
                }
                this.f12083 = true;
                this.f12086 = true;
                this.f12081.ˏᴵ(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
