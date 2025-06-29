package ar.tvplayer.core.data.api.xtreamcodes;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class UserInfo {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2143;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Long f2144;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f2145;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Integer f2146;

    public UserInfo(@InterfaceC5065(name = "username") String str, @InterfaceC5065(name = "password") String str2, @InterfaceC5065(name = "exp_date") Long l, @InterfaceC5065(name = "max_connections") Integer num) {
        this.f2145 = str;
        this.f2143 = str2;
        this.f2144 = l;
        this.f2146 = num;
    }

    public final UserInfo copy(@InterfaceC5065(name = "username") String str, @InterfaceC5065(name = "password") String str2, @InterfaceC5065(name = "exp_date") Long l, @InterfaceC5065(name = "max_connections") Integer num) {
        return new UserInfo(str, str2, l, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return AbstractC1549.m5138(this.f2145, userInfo.f2145) && AbstractC1549.m5138(this.f2143, userInfo.f2143) && AbstractC1549.m5138(this.f2144, userInfo.f2144) && AbstractC1549.m5138(this.f2146, userInfo.f2146);
    }

    public final int hashCode() {
        String str = this.f2145;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2143;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f2144;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f2146;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "UserInfo(username=" + this.f2145 + ", password=" + this.f2143 + ", expirationDate=" + this.f2144 + ", maxConnections=" + this.f2146 + ')';
    }
}
