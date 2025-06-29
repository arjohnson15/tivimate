package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.AbstractC0002;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import p447.AbstractC5179;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0748 implements Iterable, Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C0762 f3592 = new C0762(AbstractC0731.f3530);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C0726 f3593;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f3594;

    static {
        f3593 = AbstractC0749.m3133() ? new C0726(1) : new C0726(0);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m3128(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC5179.m11548(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0002.m55(i2, i3, "End index: ", " >= "));
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static C0762 m3129(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange;
        m3128(i, i + i2, bArr.length);
        switch (f3593.f3526) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i2];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                break;
        }
        return new C0762(bArrCopyOfRange);
    }

    public final int hashCode() {
        int i = this.f3594;
        if (i == 0) {
            int size = size();
            C0762 c0762 = (C0762) this;
            int iMo3169 = c0762.mo3169();
            int i2 = size;
            for (int i3 = iMo3169; i3 < iMo3169 + size; i3++) {
                i2 = (i2 * 31) + c0762.f3602[i3];
            }
            i = i2 == 0 ? 1 : i2;
            this.f3594 = i;
        }
        return i;
    }

    public abstract int size();

    public final String toString() {
        C0762 c0759;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = ﹶⁱ.ـﹶ.ᵎˏ(this);
        } else {
            StringBuilder sb = new StringBuilder();
            C0762 c0762 = (C0762) this;
            int iM3128 = m3128(0, 47, c0762.size());
            if (iM3128 == 0) {
                c0759 = f3592;
            } else {
                c0759 = new C0759(c0762.f3602, c0762.mo3169(), iM3128);
            }
            sb.append(ﹶⁱ.ـﹶ.ᵎˏ(c0759));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return ˆʽ.ᵎˏ.ˎٴ(sb2, string, "\">");
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final byte[] m3130() {
        int size = size();
        if (size == 0) {
            return AbstractC0731.f3530;
        }
        byte[] bArr = new byte[size];
        mo3132(size, bArr);
        return bArr;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract byte mo3131(int i);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public abstract void mo3132(int i, byte[] bArr);
}
