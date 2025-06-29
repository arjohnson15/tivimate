package p428;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ﹶˊ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4933 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String f18665;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final AtomicLong f18666 = new AtomicLong(0);

    public C4933(C4942 c4942) throws NoSuchAlgorithmException {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b = bArrArray[0];
        byte b2 = bArrArray[1];
        byte b3 = bArrArray[2];
        byte b4 = bArrArray[3];
        byte[] bArrM11057 = m11057(time % 1000);
        byte b5 = bArrM11057[0];
        byte b6 = bArrM11057[1];
        byte[] bArrM110572 = m11057(f18666.incrementAndGet());
        byte b7 = bArrM110572[0];
        byte b8 = bArrM110572[1];
        byte[] bArrM110573 = m11057(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {b, b2, b3, b4, b5, b6, b7, b8, bArrM110573[0], bArrM110573[1]};
        String strM11056 = AbstractC4928.m11056(c4942.m11067().f18653);
        String strM11053 = AbstractC4928.m11053(bArr);
        Locale locale = Locale.US;
        f18665 = String.format(locale, "%s%s%s%s", strM11053.substring(0, 12), strM11053.substring(12, 16), strM11053.subSequence(16, 20), strM11056.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static byte[] m11057(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return f18665;
    }
}
