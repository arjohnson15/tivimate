package io.antmedia.rtmp_client;

import java.io.IOException;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public class RtmpClient {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long f3888;

    public static class RtmpIOException extends IOException {
        public RtmpIOException(int i) {
            super(ˉᵎ.ˉⁱ("RTMP error: ", i));
        }
    }

    static {
        System.loadLibrary("rtmp-jni");
    }

    private native long nativeAlloc();

    private native void nativeClose(long j);

    private native int nativeOpen(String str, boolean z, long j, int i, int i2);

    private native int nativeRead(byte[] bArr, int i, int i2, long j);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m3531(String str) throws RtmpIOException {
        long jNativeAlloc = nativeAlloc();
        this.f3888 = jNativeAlloc;
        if (jNativeAlloc == 0) {
            throw new RtmpIOException(-2);
        }
        int iNativeOpen = nativeOpen(str, false, jNativeAlloc, 10000, 10000);
        if (iNativeOpen == 0) {
            return;
        }
        this.f3888 = 0L;
        throw new RtmpIOException(iNativeOpen);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m3532(byte[] bArr, int i, int i2) throws RtmpIOException {
        int iNativeRead = nativeRead(bArr, i, i2, this.f3888);
        if (iNativeRead >= 0 || iNativeRead == -1) {
            return iNativeRead;
        }
        throw new RtmpIOException(iNativeRead);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m3533() {
        nativeClose(this.f3888);
        this.f3888 = 0L;
    }
}
