package p164;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p366.C4143;
import p366.C4144;
import p366.InterfaceC4160;

/* renamed from: ˊᵔ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2372 extends OutputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f9388;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f9389;

    public C2372(FileOutputStream fileOutputStream) {
        this.f9389 = 0;
        this.f9388 = fileOutputStream;
    }

    public /* synthetic */ C2372(InterfaceC4160 interfaceC4160, int i) {
        this.f9389 = i;
        this.f9388 = interfaceC4160;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private final void m6463() {
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m6464() {
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m6465() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f9389) {
            case 0:
            case 1:
                break;
            default:
                ((C4144) this.f9388).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f9389) {
            case 0:
                ((FileOutputStream) this.f9388).flush();
                break;
            case 1:
                break;
            default:
                C4144 c4144 = (C4144) this.f9388;
                if (!c4144.f16044) {
                    c4144.flush();
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f9389) {
            case 1:
                return ((C4143) this.f9388) + ".outputStream()";
            case 2:
                return ((C4144) this.f9388) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        switch (this.f9389) {
            case 0:
                ((FileOutputStream) this.f9388).write(i);
                return;
            case 1:
                ((C4143) this.f9388).m9509(i);
                return;
            default:
                C4144 c4144 = (C4144) this.f9388;
                if (c4144.f16044) {
                    throw new IOException("closed");
                }
                c4144.f16043.m9509((byte) i);
                c4144.m9537();
                return;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.f9389) {
            case 0:
                ((FileOutputStream) this.f9388).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f9389) {
            case 0:
                ((FileOutputStream) this.f9388).write(bArr, i, i2);
                return;
            case 1:
                ((C4143) this.f9388).m9521(bArr, i, i2);
                return;
            default:
                C4144 c4144 = (C4144) this.f9388;
                if (c4144.f16044) {
                    throw new IOException("closed");
                }
                c4144.f16043.m9521(bArr, i, i2);
                c4144.m9537();
                return;
        }
    }
}
