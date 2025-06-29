package p060;

import ˆʽ.ᵎˏ;

/* renamed from: ʾי.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1354 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f5511;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f5512;

    public C1354(String str, String str2) {
        this.f5512 = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f5511 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1354)) {
            return false;
        }
        C1354 c1354 = (C1354) obj;
        return this.f5512.equals(c1354.f5512) && this.f5511.equals(c1354.f5511);
    }

    public final int hashCode() {
        return ((this.f5512.hashCode() ^ 1000003) * 1000003) ^ this.f5511.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f5512);
        sb.append(", version=");
        return ᵎˏ.ˎٴ(sb, this.f5511, "}");
    }
}
