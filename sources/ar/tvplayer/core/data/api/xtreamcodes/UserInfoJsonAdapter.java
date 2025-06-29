package ar.tvplayer.core.data.api.xtreamcodes;

import p013.C1038;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class UserInfoJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2147;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2148;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2149 = C3759.m8745("username", "password", "exp_date", "max_connections");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f2150;

    public UserInfoJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f2147 = c5054.m11213(String.class, c1038, "username");
        this.f2148 = c5054.m11213(Long.class, c1038, "expirationDate");
        this.f2150 = c5054.m11213(Integer.class, c1038, "maxConnections");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(30, "GeneratedJsonAdapter(UserInfo)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        String str2 = null;
        Long l = null;
        Integer num = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2149);
            if (iMo11194 != -1) {
                AbstractC5044 abstractC5044 = this.f2147;
                if (iMo11194 == 0) {
                    str = (String) abstractC5044.mo1390(abstractC5050);
                } else if (iMo11194 == 1) {
                    str2 = (String) abstractC5044.mo1390(abstractC5050);
                } else if (iMo11194 == 2) {
                    l = (Long) this.f2148.mo1390(abstractC5050);
                } else if (iMo11194 == 3) {
                    num = (Integer) this.f2150.mo1390(abstractC5050);
                }
            } else {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            }
        }
        abstractC5050.mo11198();
        return new UserInfo(str, str2, l, num);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        UserInfo userInfo = (UserInfo) obj;
        if (userInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("username");
        AbstractC5044 abstractC5044 = this.f2147;
        abstractC5044.mo1391(abstractC5048, userInfo.f2145);
        abstractC5048.mo11174("password");
        abstractC5044.mo1391(abstractC5048, userInfo.f2143);
        abstractC5048.mo11174("exp_date");
        this.f2148.mo1391(abstractC5048, userInfo.f2144);
        abstractC5048.mo11174("max_connections");
        this.f2150.mo1391(abstractC5048, userInfo.f2146);
        abstractC5048.mo11178();
    }
}
