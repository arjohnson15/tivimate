package p005;

import com.bumptech.glide.ˑʽ;
import java.util.Arrays;

/* renamed from: ʻˆ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0934 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] f4123;

    public C0934(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.f4123 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C0934 m3799(byte[] bArr) {
        if (bArr != null) {
            return new C0934(bArr.length, bArr);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0934) {
            return Arrays.equals(((C0934) obj).f4123, this.f4123);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4123);
    }

    public final String toString() {
        return "Bytes(" + ˑʽ.ˉⁱ(this.f4123) + ")";
    }
}
