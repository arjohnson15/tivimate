package p254;

import ˆʽ.ᵎˏ;

/* renamed from: יי.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3180 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3174 f12288;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3174 f12289;

    public C3180(C3174 c3174, C3174 c31742) {
        this.f12289 = c3174;
        this.f12288 = c31742;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3180.class != obj.getClass()) {
            return false;
        }
        C3180 c3180 = (C3180) obj;
        return this.f12289.equals(c3180.f12289) && this.f12288.equals(c3180.f12288);
    }

    public final int hashCode() {
        return this.f12288.hashCode() + (this.f12289.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C3174 c3174 = this.f12289;
        sb.append(c3174);
        C3174 c31742 = this.f12288;
        if (c3174.equals(c31742)) {
            str = "";
        } else {
            str = ", " + c31742;
        }
        return ᵎˏ.ˎٴ(sb, str, "]");
    }
}
