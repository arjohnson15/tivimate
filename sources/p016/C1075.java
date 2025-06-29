package p016;

import j$.util.Objects;
import p447.AbstractC5179;

/* renamed from: ʻᐧ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1075 extends AbstractC1079 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f4638;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1071 f4639;

    public C1075(int i, C1071 c1071) {
        this.f4638 = i;
        this.f4639 = c1071;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1075)) {
            return false;
        }
        C1075 c1075 = (C1075) obj;
        return c1075.f4638 == this.f4638 && c1075.f4639 == this.f4639;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4638), this.f4639);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.f4639);
        sb.append(", ");
        return AbstractC5179.m11550(sb, this.f4638, "-byte key)");
    }
}
