package p332;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import java.io.IOException;
import java.io.InputStream;
import p366.C4143;
import p366.C4149;
import ˎˊ.ˆʿ;

/* renamed from: ᴵﾞ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3778 extends InputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f14617;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f14618;

    public /* synthetic */ C3778(int i, Object obj) {
        this.f14618 = i;
        this.f14617 = obj;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m8850() {
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        switch (this.f14618) {
            case 0:
                return ((C3776) this.f14617).m8845();
            case 1:
                return (int) Math.min(((C4143) this.f14617).f16041, Integer.MAX_VALUE);
            default:
                C4149 c4149 = (C4149) this.f14617;
                if (c4149.f16050) {
                    throw new IOException("closed");
                }
                return (int) Math.min(c4149.f16049.f16041, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f14618) {
            case 1:
                break;
            case 2:
                ((C4149) this.f14617).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f14618) {
            case 0:
                try {
                    return ((C3776) this.f14617).m8849() & 255;
                } catch (Buffer$BufferException e) {
                    throw new IOException(e);
                }
            case 1:
                C4143 c4143 = (C4143) this.f14617;
                if (c4143.f16041 > 0) {
                    return c4143.readByte() & 255;
                }
                return -1;
            default:
                C4149 c4149 = (C4149) this.f14617;
                if (c4149.f16050) {
                    throw new IOException("closed");
                }
                C4143 c41432 = c4149.f16049;
                if (c41432.f16041 == 0 && c4149.f16051.mo4577(c41432, 8192L) == -1) {
                    return -1;
                }
                return c41432.readByte() & 255;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        switch (this.f14618) {
            case 0:
                try {
                    ((C3776) this.f14617).m8839(bArr.length, bArr);
                    return bArr.length;
                } catch (Buffer$BufferException e) {
                    throw new IOException(e);
                }
            default:
                return super.read(bArr);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f14618) {
            case 1:
                return ((C4143) this.f14617).m9518(bArr, i, i2);
            case 2:
                C4149 c4149 = (C4149) this.f14617;
                if (c4149.f16050) {
                    throw new IOException("closed");
                }
                ˆʿ.ʽᐧ(bArr.length, i, i2);
                C4143 c4143 = c4149.f16049;
                if (c4143.f16041 == 0 && c4149.f16051.mo4577(c4143, 8192L) == -1) {
                    return -1;
                }
                return c4143.m9518(bArr, i, i2);
            default:
                return super.read(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.f14618) {
            case 0:
                ((C3776) this.f14617).f14614 = (int) j;
                return j;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        switch (this.f14618) {
            case 1:
                return ((C4143) this.f14617) + ".inputStream()";
            case 2:
                return ((C4149) this.f14617) + ".inputStream()";
            default:
                return super.toString();
        }
    }
}
