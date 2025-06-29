package ar.tvplayer.core.data.api.stalker;

import ar.tvplayer.core.util.annotation.TrimmedString;
import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;
import ٴⁱ.ˑי;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class VodCategory {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f1980;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f1982;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f1983;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final transient C3406 f1984 = new C3406(new ˑי(this, 0));

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final transient C3406 f1981 = new C3406(new ˑי(this, 1));

    public VodCategory(@InterfaceC5065(name = "id") String str, @TrimmedString @InterfaceC5065(name = "title") String str2, @InterfaceC5065(name = "alias") String str3) {
        this.f1983 = str;
        this.f1980 = str2;
        this.f1982 = str3;
    }

    public final VodCategory copy(@InterfaceC5065(name = "id") String str, @TrimmedString @InterfaceC5065(name = "title") String str2, @InterfaceC5065(name = "alias") String str3) {
        return new VodCategory(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VodCategory)) {
            return false;
        }
        VodCategory vodCategory = (VodCategory) obj;
        return AbstractC1549.m5138(this.f1983, vodCategory.f1983) && AbstractC1549.m5138(this.f1980, vodCategory.f1980) && AbstractC1549.m5138(this.f1982, vodCategory.f1982);
    }

    public final int hashCode() {
        int iHashCode = this.f1983.hashCode() * 31;
        String str = this.f1980;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1982;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VodCategory(id=");
        sb.append(this.f1983);
        sb.append(", title=");
        sb.append(this.f1980);
        sb.append(", alias=");
        return ˉᵎ.ˑי(sb, this.f1982, ')');
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m1403() {
        return ((Boolean) this.f1981.getValue()).booleanValue();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m1404() {
        return ((Boolean) this.f1984.getValue()).booleanValue();
    }
}
