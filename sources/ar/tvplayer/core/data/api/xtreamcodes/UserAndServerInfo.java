package ar.tvplayer.core.data.api.xtreamcodes;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class UserAndServerInfo {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ServerInfo f2138;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final UserInfo f2139;

    public UserAndServerInfo(@InterfaceC5065(name = "user_info") UserInfo userInfo, @InterfaceC5065(name = "server_info") ServerInfo serverInfo) {
        this.f2139 = userInfo;
        this.f2138 = serverInfo;
    }

    public final UserAndServerInfo copy(@InterfaceC5065(name = "user_info") UserInfo userInfo, @InterfaceC5065(name = "server_info") ServerInfo serverInfo) {
        return new UserAndServerInfo(userInfo, serverInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAndServerInfo)) {
            return false;
        }
        UserAndServerInfo userAndServerInfo = (UserAndServerInfo) obj;
        return AbstractC1549.m5138(this.f2139, userAndServerInfo.f2139) && AbstractC1549.m5138(this.f2138, userAndServerInfo.f2138);
    }

    public final int hashCode() {
        UserInfo userInfo = this.f2139;
        int iHashCode = (userInfo == null ? 0 : userInfo.hashCode()) * 31;
        ServerInfo serverInfo = this.f2138;
        return iHashCode + (serverInfo != null ? serverInfo.hashCode() : 0);
    }

    public final String toString() {
        return "UserAndServerInfo(userInfo=" + this.f2139 + ", serverInfo=" + this.f2138 + ')';
    }
}
