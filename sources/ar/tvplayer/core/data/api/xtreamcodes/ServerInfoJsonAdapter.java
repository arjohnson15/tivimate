package ar.tvplayer.core.data.api.xtreamcodes;

import p013.C1038;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class ServerInfoJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2136;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2137 = C3759.m8745("timezone");

    public ServerInfoJsonAdapter(C5054 c5054) {
        this.f2136 = c5054.m11213(String.class, C1038.f4437, "timezone");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(32, "GeneratedJsonAdapter(ServerInfo)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2137);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                str = (String) this.f2136.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        return new ServerInfo(str);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        ServerInfo serverInfo = (ServerInfo) obj;
        if (serverInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("timezone");
        this.f2136.mo1391(abstractC5048, serverInfo.f2135);
        abstractC5048.mo11178();
    }
}
