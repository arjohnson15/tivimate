package p254;

import java.util.Arrays;

/* renamed from: יי.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3156 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] f12204;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f12205;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f12206;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f12207;

    public C3156(int i, int i2, int i3, byte[] bArr) {
        this.f12206 = i;
        this.f12204 = bArr;
        this.f12205 = i2;
        this.f12207 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3156.class != obj.getClass()) {
            return false;
        }
        C3156 c3156 = (C3156) obj;
        return this.f12206 == c3156.f12206 && this.f12205 == c3156.f12205 && this.f12207 == c3156.f12207 && Arrays.equals(this.f12204, c3156.f12204);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f12204) + (this.f12206 * 31)) * 31) + this.f12205) * 31) + this.f12207;
    }
}
