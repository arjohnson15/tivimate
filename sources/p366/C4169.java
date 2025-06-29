package p366;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import ـˊ.ʿʼ;

/* renamed from: ᵔﾞ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4169 extends C4151 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final long f16085;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static C4169 f16086;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final long f16087;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final ReentrantLock f16088;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final Condition f16089;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f16090;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C4169 f16091;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f16092;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f16088 = reentrantLock;
        f16089 = reentrantLock.newCondition();
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f16085 = millis;
        f16087 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: ˉי */
    public void mo4579() {
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m9582() {
        long j = this.f16059;
        boolean z = this.f16060;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = f16088;
            reentrantLock.lock();
            try {
                if (this.f16090 != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f16090 = 1;
                ʿʼ.ˑʽ(this, j, z);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m9583() {
        ReentrantLock reentrantLock = f16088;
        reentrantLock.lock();
        try {
            int i = this.f16090;
            this.f16090 = 0;
            if (i != 1) {
                return i == 2;
            }
            C4169 c4169 = f16086;
            while (c4169 != null) {
                C4169 c41692 = c4169.f16091;
                if (c41692 == this) {
                    c4169.f16091 = this.f16091;
                    this.f16091 = null;
                    return false;
                }
                c4169 = c41692;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }
}
