package p329;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import p188.C2639;

/* renamed from: ᴵᵢ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3732 extends InputStream {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final ArrayDeque f14483;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public IOException f14484;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C2639 f14485;

    static {
        char[] cArr = AbstractC3742.f14503;
        f14483 = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f14485.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f14485.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f14485.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f14485.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f14485.read();
        } catch (IOException e) {
            this.f14484 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f14485.read(bArr);
        } catch (IOException e) {
            this.f14484 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f14485.read(bArr, i, i2);
        } catch (IOException e) {
            this.f14484 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f14485.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f14485.skip(j);
        } catch (IOException e) {
            this.f14484 = e;
            throw e;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8697() {
        this.f14484 = null;
        this.f14485 = null;
        ArrayDeque arrayDeque = f14483;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }
}
