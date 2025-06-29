package p366;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: ᵔﾞ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public interface InterfaceC4160 extends InterfaceC4168, WritableByteChannel {
    @Override // p366.InterfaceC4168, java.io.Flushable
    void flush();

    InterfaceC4160 write(byte[] bArr);

    InterfaceC4160 write(byte[] bArr, int i, int i2);

    InterfaceC4160 writeByte(int i);

    InterfaceC4160 writeInt(int i);

    InterfaceC4160 writeShort(int i);

    /* renamed from: ˉᵎ */
    OutputStream mo9500();

    /* renamed from: ˊᵔ */
    InterfaceC4160 mo9501(long j);

    /* renamed from: ˎˉ */
    InterfaceC4160 mo9504(C4155 c4155);

    /* renamed from: ᵔ */
    InterfaceC4160 mo9525(String str);

    /* renamed from: ﹶˆ */
    C4143 mo9532();

    /* renamed from: ﾞˊ */
    InterfaceC4160 mo9534(int i, int i2, String str);
}
