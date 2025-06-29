package p166;

import android.net.Uri;
import com.google.android.gms.internal.play_billing.ˎˑ;
import java.util.List;
import p345.AbstractC3980;
import p345.C3961;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;
import ᵔᵔ.ٴˎ;

/* renamed from: ˊﹶ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2443 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f9731;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f9732;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final List f9733;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Uri f9734;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC3980 f9735;

    static {
        ᵎˏ.ﹳˎ(0, 1, 2, 3, 4);
        AbstractC4470.m10164(5);
        AbstractC4470.m10164(6);
        AbstractC4470.m10164(7);
    }

    public C2443(Uri uri, String str, ˎˑ r3, List list, AbstractC3980 abstractC3980, long j) {
        this.f9734 = uri;
        this.f9731 = AbstractC2435.m6559(str);
        this.f9733 = list;
        this.f9735 = abstractC3980;
        C3961 c3961M9205 = AbstractC3980.m9205();
        for (int i = 0; i < abstractC3980.size(); i++) {
            ((C2439) abstractC3980.get(i)).getClass();
            new ٴˎ(22);
            c3961M9205.m9174(new C2439());
        }
        c3961M9205.m9167();
        this.f9732 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2443)) {
            return false;
        }
        C2443 c2443 = (C2443) obj;
        return this.f9734.equals(c2443.f9734) && AbstractC4470.m10194(this.f9731, c2443.f9731) && AbstractC4470.m10194(null, null) && AbstractC4470.m10194(null, null) && this.f9733.equals(c2443.f9733) && AbstractC4470.m10194(null, null) && this.f9735.equals(c2443.f9735) && AbstractC4470.m10194(null, null) && Long.valueOf(this.f9732).equals(Long.valueOf(c2443.f9732));
    }

    public final int hashCode() {
        int iHashCode = this.f9734.hashCode() * 31;
        return (int) (((this.f9735.hashCode() + ((this.f9733.hashCode() + ((iHashCode + (this.f9731 == null ? 0 : r1.hashCode())) * 29791)) * 961)) * 31 * 31) + this.f9732);
    }
}
