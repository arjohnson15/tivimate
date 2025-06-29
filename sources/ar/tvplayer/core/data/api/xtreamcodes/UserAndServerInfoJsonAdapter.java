package ar.tvplayer.core.data.api.xtreamcodes;

import p013.C1038;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class UserAndServerInfoJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2140;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2141;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2142 = C3759.m8745("user_info", "server_info");

    public UserAndServerInfoJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f2140 = c5054.m11213(UserInfo.class, c1038, "userInfo");
        this.f2141 = c5054.m11213(ServerInfo.class, c1038, "serverInfo");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(39, "GeneratedJsonAdapter(UserAndServerInfo)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        UserInfo userInfo = null;
        ServerInfo serverInfo = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2142);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                userInfo = (UserInfo) this.f2140.mo1390(abstractC5050);
            } else if (iMo11194 == 1) {
                serverInfo = (ServerInfo) this.f2141.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        return new UserAndServerInfo(userInfo, serverInfo);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        UserAndServerInfo userAndServerInfo = (UserAndServerInfo) obj;
        if (userAndServerInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("user_info");
        this.f2140.mo1391(abstractC5048, userAndServerInfo.f2139);
        abstractC5048.mo11174("server_info");
        this.f2141.mo1391(abstractC5048, userAndServerInfo.f2138);
        abstractC5048.mo11178();
    }
}
