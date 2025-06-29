package p405;

import android.support.v4.media.session.AbstractC0001;
import java.io.EOFException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import p447.AbstractC5179;
import ـˈ.ˉᵎ;
import ﹶⁱ.ـﹶ;

/* renamed from: ﹳʽ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4639 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f17755 = 0;

    static {
        new C4642();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m10546(C4640 c4640, byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(AbstractC5179.m11548(i2, "len (", ") cannot be negative"));
        }
        ـﹶ.ˉי(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = c4640.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                break;
            } else {
                i3 += i4;
            }
        }
        if (i3 != i2) {
            throw new EOFException(ˉᵎ.ˋⁱ("reached end of stream after reading ", i3, " bytes; ", i2, " bytes expected"));
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static byte[] m10547(InputStream inputStream) {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return m10548(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = AbstractC0001.m20(iMin * (iMin < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return m10548(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static byte[] m10548(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }
}
