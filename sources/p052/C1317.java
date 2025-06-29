package p052;

import j$.util.Objects;
import java.util.List;

/* renamed from: ʾʼ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1317 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public String f5363;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public List f5364;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String f5365;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1317)) {
            return false;
        }
        C1317 c1317 = (C1317) obj;
        return Objects.equals(this.f5365, c1317.f5365) && Objects.equals(this.f5363, c1317.f5363) && Objects.equals(this.f5364, c1317.f5364);
    }

    public final int hashCode() {
        return Objects.hash(this.f5365, this.f5363, this.f5364);
    }
}
