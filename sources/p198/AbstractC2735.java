package p198;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import ـˈ.ˉᵎ;

/* renamed from: ˎי.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2735 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static boolean f10706;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static long f10708;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Object f10707 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Object f10705 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m6950(byte b, byte b2, int i, long j) throws IOException {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new IOException(ˉᵎ.ˉⁱ("SNTP: Untrusted mode: ", b2));
        }
        if (i == 0 || i > 15) {
            throw new IOException(ˉᵎ.ˉⁱ("SNTP: Untrusted stratum: ", i));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static long m6951(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static long m6952() throws Throwable {
        DatagramSocket datagramSocket;
        long j;
        synchronized (f10705) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j = jCurrentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j2 = jCurrentTimeMillis / 1000;
                Long.signum(j2);
                long j3 = jCurrentTimeMillis - (j2 * 1000);
                long j4 = j2 + 2208988800L;
                j = jCurrentTimeMillis;
                bArr[40] = (byte) (j4 >> 24);
                bArr[41] = (byte) (j4 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j4 >> 8);
                    bArr[43] = (byte) j4;
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j5 >> 24);
                    bArr[45] = (byte) (j5 >> 16);
                    bArr[46] = (byte) (j5 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j6 = (jElapsedRealtime2 - jElapsedRealtime) + j;
            byte b = bArr[0];
            int i = bArr[1] & 255;
            long jM6953 = m6953(24, bArr);
            long jM69532 = m6953(32, bArr);
            long jM69533 = m6953(40, bArr);
            m6950((byte) ((b >> 6) & 3), (byte) (b & 7), i, jM69533);
            long j7 = (j6 + (((jM69533 - j6) + (jM69532 - jM6953)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j7;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static long m6953(int i, byte[] bArr) {
        long jM6951 = m6951(i, bArr);
        long jM69512 = m6951(i + 4, bArr);
        if (jM6951 == 0 && jM69512 == 0) {
            return 0L;
        }
        return ((jM69512 * 1000) / 4294967296L) + ((jM6951 - 2208988800L) * 1000);
    }
}
