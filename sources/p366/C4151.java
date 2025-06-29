package p366;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import ˆʽ.ᵎˏ;

/* renamed from: ᵔﾞ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4151 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C4145 f16057 = new C4145();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long f16058;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long f16059;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f16060;

    /* renamed from: ʽᐧ */
    public C4151 mo9543() {
        this.f16059 = 0L;
        return this;
    }

    /* renamed from: ʿʼ */
    public boolean mo9544() {
        return this.f16060;
    }

    /* renamed from: ˑʽ */
    public long mo9545() {
        if (this.f16060) {
            return this.f16058;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: ـﹶ */
    public C4151 mo9546() {
        this.f16060 = false;
        return this;
    }

    /* renamed from: ٴˎ */
    public void mo9538() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f16060 && this.f16058 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: ᐧʻ */
    public C4151 mo9539(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(ᵎˏ.ˏᴵ("timeout < 0: ", j).toString());
        }
        this.f16059 = timeUnit.toNanos(j);
        return this;
    }

    /* renamed from: ﹳﹳ */
    public C4151 mo9540(long j) {
        this.f16060 = true;
        this.f16058 = j;
        return this;
    }
}
