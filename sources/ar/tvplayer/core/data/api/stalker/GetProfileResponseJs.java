package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;
import ـˈ.ᵔˊ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class GetProfileResponseJs {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f1889;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f1890;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Integer f1891;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final transient C3406 f1892 = new C3406(new ᵔˊ(17, this));

    public GetProfileResponseJs(@InterfaceC5065(name = "status") Integer num, @InterfaceC5065(name = "msg") String str, @InterfaceC5065(name = "block_msg") String str2) {
        this.f1891 = num;
        this.f1889 = str;
        this.f1890 = str2;
    }

    public final GetProfileResponseJs copy(@InterfaceC5065(name = "status") Integer num, @InterfaceC5065(name = "msg") String str, @InterfaceC5065(name = "block_msg") String str2) {
        return new GetProfileResponseJs(num, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetProfileResponseJs)) {
            return false;
        }
        GetProfileResponseJs getProfileResponseJs = (GetProfileResponseJs) obj;
        return AbstractC1549.m5138(this.f1891, getProfileResponseJs.f1891) && AbstractC1549.m5138(this.f1889, getProfileResponseJs.f1889) && AbstractC1549.m5138(this.f1890, getProfileResponseJs.f1890);
    }

    public final int hashCode() {
        Integer num = this.f1891;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f1889;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1890;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetProfileResponseJs(status=");
        sb.append(this.f1891);
        sb.append(", msg=");
        sb.append(this.f1889);
        sb.append(", blockMsg=");
        return ˉᵎ.ˑי(sb, this.f1890, ')');
    }
}
