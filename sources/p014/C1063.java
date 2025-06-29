package p014;

import java.io.EOFException;
import java.io.InterruptedIOException;
import p254.C3159;

/* renamed from: ʻـ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1063 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final long[] f4524 = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f4525;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f4526;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] f4527 = new byte[8];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m4069(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            if ((f4524[i2] & i) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static long m4070(int i, boolean z, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f4524[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long m4071(C3159 c3159, boolean z, boolean z2, int i) throws EOFException, InterruptedIOException {
        int i2 = this.f4525;
        byte[] bArr = this.f4527;
        if (i2 == 0) {
            if (!c3159.mo4876(bArr, 0, 1, z)) {
                return -1L;
            }
            int iM4069 = m4069(bArr[0] & 255);
            this.f4526 = iM4069;
            if (iM4069 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f4525 = 1;
        }
        int i3 = this.f4526;
        if (i3 > i) {
            this.f4525 = 0;
            return -2L;
        }
        if (i3 != 1) {
            c3159.mo4876(bArr, 1, i3 - 1, false);
        }
        this.f4525 = 0;
        return m4070(this.f4526, z2, bArr);
    }
}
