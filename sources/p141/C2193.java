package p141;

import p166.C2431;
import p345.AbstractC3968;
import p345.C3930;

/* renamed from: ˉˑ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2193 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f8620;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f8621;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2431 f8622;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f8623;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3930 f8624;

    public C2193(C2431 c2431, int i, int i2, C3930 c3930, String str) {
        this.f8623 = i;
        this.f8620 = i2;
        this.f8622 = c2431;
        this.f8624 = C3930.m9140(c3930);
        this.f8621 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2193.class != obj.getClass()) {
            return false;
        }
        C2193 c2193 = (C2193) obj;
        if (this.f8623 == c2193.f8623 && this.f8620 == c2193.f8620 && this.f8622.equals(c2193.f8622)) {
            C3930 c3930 = this.f8624;
            c3930.getClass();
            if (AbstractC3968.m9186(c3930, c2193.f8624) && this.f8621.equals(c2193.f8621)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8621.hashCode() + ((this.f8624.hashCode() + ((this.f8622.hashCode() + ((((217 + this.f8623) * 31) + this.f8620) * 31)) * 31)) * 31);
    }
}
