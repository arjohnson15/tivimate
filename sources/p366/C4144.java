package p366;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import p164.C2372;

/* renamed from: ᵔﾞ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4144 implements InterfaceC4160 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4143 f16043 = new C4143();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f16044;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4168 f16045;

    public C4144(InterfaceC4168 interfaceC4168) {
        this.f16045 = interfaceC4168;
    }

    @Override // p366.InterfaceC4168, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC4168 interfaceC4168 = this.f16045;
        if (this.f16044) {
            return;
        }
        try {
            C4143 c4143 = this.f16043;
            long j = c4143.f16041;
            if (j > 0) {
                interfaceC4168.mo4566(c4143, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC4168.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f16044 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p366.InterfaceC4160, p366.InterfaceC4168, java.io.Flushable
    public final void flush() {
        if (this.f16044) {
            throw new IllegalStateException("closed");
        }
        C4143 c4143 = this.f16043;
        long j = c4143.f16041;
        InterfaceC4168 interfaceC4168 = this.f16045;
        if (j > 0) {
            interfaceC4168.mo4566(c4143, j);
        }
        interfaceC4168.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16044;
    }

    public final String toString() {
        return "buffer(" + this.f16045 + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f16044) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f16043.write(byteBuffer);
        m9537();
        return iWrite;
    }

    @Override // p366.InterfaceC4160
    public final InterfaceC4160 write(byte[] bArr) {
        if (this.f16044) {
            throw new IllegalStateException("closed");
        }
        this.f16043.m9521(bArr, 0, bArr.length);
        m9537();
        return this;
    }

    @Override // p366.InterfaceC4160
    public final InterfaceC4160 write(byte[] bArr, int i, int i2) {
        if (this.f16044) {
            throw new IllegalStateException("closed");
        }
        this.f16043.m9521(bArr, i, i2);
        m9537();
        return this;
    }

    @Override // p366.InterfaceC4160
    public final InterfaceC4160 writeByte(int i) {
        if (this.f16044) {
            throw new IllegalStateException("closed");
        }
        this.f16043.m9509(i);
        m9537();
        return this;
    }

    @Override // p366.InterfaceC4160
    public final InterfaceC4160 writeInt(int i) {
        if (this.f16044) {
            throw new IllegalStateException("closed");
        }
        this.f16043.m9492(i);
        m9537();
        return this;
    }

    @Override // p366.InterfaceC4160
    public final InterfaceC4160 writeShort(int i) {
        if (this.f16044) {
            throw new IllegalStateException("closed");
        }
        this.f16043.m9517(i);
        m9537();
        return this;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long m9536(InterfaceC4163 interfaceC4163) {
        long j = 0;
        while (true) {
            long jMo4577 = interfaceC4163.mo4577(this.f16043, 8192L);
            if (jMo4577 == -1) {
                return j;
            }
            j += jMo4577;
            m9537();
        }
    }

    @Override // p366.InterfaceC4168
    /* renamed from: ˉי */
    public final C4151 mo4565() {
        return this.f16045.mo4565();
    }

    @Override // p366.InterfaceC4160
    /* renamed from: ˉᵎ */
    public final OutputStream mo9500() {
        return new C2372(this, 2);
    }

    @Override // p366.InterfaceC4160
    /* renamed from: ˊᵔ */
    public final InterfaceC4160 mo9501(long j) {
        if (this.f16044) {
            throw new IllegalStateException("closed");
        }
        this.f16043.m9528(j);
        m9537();
        return this;
    }

    @Override // p366.InterfaceC4168
    /* renamed from: ˋˉ */
    public final void mo4566(C4143 c4143, long j) {
        if (this.f16044) {
            throw new IllegalStateException("closed");
        }
        this.f16043.mo4566(c4143, j);
        m9537();
    }

    @Override // p366.InterfaceC4160
    /* renamed from: ˎˉ */
    public final InterfaceC4160 mo9504(C4155 c4155) {
        if (this.f16044) {
            throw new IllegalStateException("closed");
        }
        this.f16043.m9524(c4155);
        m9537();
        return this;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC4160 m9537() {
        if (this.f16044) {
            throw new IllegalStateException("closed");
        }
        C4143 c4143 = this.f16043;
        long jM9530 = c4143.m9530();
        if (jM9530 > 0) {
            this.f16045.mo4566(c4143, jM9530);
        }
        return this;
    }

    @Override // p366.InterfaceC4160
    /* renamed from: ᵔ */
    public final InterfaceC4160 mo9525(String str) {
        if (this.f16044) {
            throw new IllegalStateException("closed");
        }
        this.f16043.m9496(str);
        m9537();
        return this;
    }

    @Override // p366.InterfaceC4160
    /* renamed from: ﹶˆ */
    public final C4143 mo9532() {
        return this.f16043;
    }

    @Override // p366.InterfaceC4160
    /* renamed from: ﾞˊ */
    public final InterfaceC4160 mo9534(int i, int i2, String str) {
        if (this.f16044) {
            throw new IllegalStateException("closed");
        }
        this.f16043.m9502(i, i2, str);
        m9537();
        return this;
    }
}
