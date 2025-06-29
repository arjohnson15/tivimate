package p337;

import java.nio.ByteBuffer;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵎˆ.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3851 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f14872;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f14873;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ByteBuffer f14874;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final byte[] f14871 = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final byte[] f14870 = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m9069(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = i2;
        ـﹶ.ٴˎ(j2, "out of range: %s", (j2 >> 8) == 0);
        byteBuffer.put((byte) j2);
    }
}
