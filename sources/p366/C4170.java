package p366;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ᵔﾞ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4170 implements InterfaceC4163 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f16093;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f16094;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4154 f16095;

    public C4170(C4154 c4154, long j) {
        this.f16095 = c4154;
        this.f16093 = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16094) {
            return;
        }
        this.f16094 = true;
        C4154 c4154 = this.f16095;
        ReentrantLock reentrantLock = c4154.f16064;
        reentrantLock.lock();
        try {
            int i = c4154.f16063 - 1;
            c4154.f16063 = i;
            if (i == 0) {
                if (c4154.f16066) {
                    synchronized (c4154) {
                        c4154.f16065.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ʿˊ */
    public final long mo4577(C4143 c4143, long j) {
        long j2;
        long j3;
        int i;
        if (this.f16094) {
            throw new IllegalStateException("closed");
        }
        C4154 c4154 = this.f16095;
        long j4 = this.f16093;
        c4154.getClass();
        long j5 = 8192 + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                break;
            }
            C4172 c4172M9514 = c4143.m9514(1);
            byte[] bArr = c4172M9514.f16102;
            int i2 = c4172M9514.f16101;
            int iMin = (int) Math.min(j5 - j6, 8192 - i2);
            synchronized (c4154) {
                c4154.f16065.seek(j6);
                i = 0;
                while (true) {
                    if (i >= iMin) {
                        break;
                    }
                    int i3 = c4154.f16065.read(bArr, i2, iMin - i);
                    if (i3 != -1) {
                        i += i3;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (c4172M9514.f16099 == c4172M9514.f16101) {
                    c4143.f16042 = c4172M9514.m9588();
                    AbstractC4171.m9585(c4172M9514);
                }
                if (j4 == j6) {
                    j3 = -1;
                    j2 = -1;
                }
            } else {
                c4172M9514.f16101 += i;
                long j7 = i;
                j6 += j7;
                c4143.f16041 += j7;
            }
        }
        j2 = j6 - j4;
        j3 = -1;
        if (j2 != j3) {
            this.f16093 += j2;
        }
        return j2;
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ˉי */
    public final C4151 mo8177() {
        return C4151.f16057;
    }
}
