package p123;

import java.util.Arrays;
import p183.C2531;

/* renamed from: ˈـ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1997 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] f7595;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2531 f7596;

    public C1997(C2531 c2531, byte[] bArr) {
        if (c2531 == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f7596 = c2531;
        this.f7595 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1997)) {
            return false;
        }
        C1997 c1997 = (C1997) obj;
        if (this.f7596.equals(c1997.f7596)) {
            return Arrays.equals(this.f7595, c1997.f7595);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7596.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7595);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f7596 + ", bytes=[...]}";
    }
}
