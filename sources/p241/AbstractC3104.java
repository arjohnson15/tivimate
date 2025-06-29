package p241;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* renamed from: ˑﹳ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3104 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int[] f11989 = m7617(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m7616(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            m7618(0, 4, 8, 12, iArr);
            m7618(1, 5, 9, 13, iArr);
            m7618(2, 6, 10, 14, iArr);
            m7618(3, 7, 11, 15, iArr);
            m7618(0, 5, 10, 15, iArr);
            m7618(1, 6, 11, 12, iArr);
            m7618(2, 7, 8, 13, iArr);
            m7618(3, 4, 9, 14, iArr);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int[] m7617(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m7618(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> (-16)) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> (-12)) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> (-8)) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> (-7)) | (i15 << 7);
    }
}
