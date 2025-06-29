package p183;

import ˆʽ.ᵎˏ;

/* renamed from: ˋﹳ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2531 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f10069;

    public C2531(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f10069 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2531)) {
            return false;
        }
        return this.f10069.equals(((C2531) obj).f10069);
    }

    public final int hashCode() {
        return this.f10069.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ᵎˏ.ˎٴ(new StringBuilder("Encoding{name=\""), this.f10069, "\"}");
    }
}
