package p237;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import com.hierynomus.protocol.transport.TransportException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import p296.C3486;
import p332.C3776;
import p332.C3779;
import p365.AbstractRunnableC4141;
import ˊﹶ.ˋˉ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˑـ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3094 extends AbstractRunnableC4141 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final ˋˉ f11943;

    public C3094(String str, InputStream inputStream, ˋˉ r5, C3486 c3486) {
        this.f16035 = new AtomicBoolean(false);
        this.f16037 = inputStream;
        this.f16034 = c3486;
        Thread thread = new Thread(this, ᐧʻ.ﾞˊ("Packet Reader for ", str));
        this.f16036 = thread;
        thread.setDaemon(true);
        this.f11943 = r5;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7608(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int i2 = this.f16037.read(bArr, i, length);
            if (i2 == -1) {
                throw new TransportException(new EOFException("EOF while reading packet"));
            }
            length -= i2;
            i += i2;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m7609() throws Buffer$BufferException, IOException {
        byte[] bArr = new byte[4];
        m7608(bArr);
        C3776 c3776 = new C3776(bArr, true, C3779.f14621);
        c3776.m8849();
        byte[] bArr2 = new byte[3];
        c3776.m8839(3, bArr2);
        return ((bArr2[0] << 16) & 16711680) | ((bArr2[1] << 8) & 65280) | (bArr2[2] & 255);
    }
}
