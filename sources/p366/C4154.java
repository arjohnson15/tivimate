package p366;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ᵔﾞ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4154 implements Closeable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f16063;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ReentrantLock f16064 = new ReentrantLock();

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final RandomAccessFile f16065;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f16066;

    public C4154(RandomAccessFile randomAccessFile) {
        this.f16065 = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f16064;
        reentrantLock.lock();
        try {
            if (this.f16066) {
                return;
            }
            this.f16066 = true;
            if (this.f16063 != 0) {
                return;
            }
            synchronized (this) {
                this.f16065.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4170 m9555(long j) {
        ReentrantLock reentrantLock = this.f16064;
        reentrantLock.lock();
        try {
            if (this.f16066) {
                throw new IllegalStateException("closed");
            }
            this.f16063++;
            reentrantLock.unlock();
            return new C4170(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long m9556() {
        long length;
        ReentrantLock reentrantLock = this.f16064;
        reentrantLock.lock();
        try {
            if (this.f16066) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f16065.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
