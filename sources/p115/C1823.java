package p115;

import com.bumptech.glide.ˑʽ;
import java.util.Arrays;

/* renamed from: ˈʽ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1823 implements Comparable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final byte[] f7040;

    public C1823(byte[] bArr) {
        this.f7040 = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1823 c1823 = (C1823) obj;
        byte[] bArr = this.f7040;
        int length = bArr.length;
        byte[] bArr2 = c1823.f7040;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = c1823.f7040[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1823) {
            return Arrays.equals(this.f7040, ((C1823) obj).f7040);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7040);
    }

    public final String toString() {
        return ˑʽ.ˉⁱ(this.f7040);
    }
}
