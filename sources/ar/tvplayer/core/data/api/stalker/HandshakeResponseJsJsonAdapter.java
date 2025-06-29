package ar.tvplayer.core.data.api.stalker;

import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class HandshakeResponseJsJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1902;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1903;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1904 = C3759.m8745("token", "hash", "random");

    public HandshakeResponseJsJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f1902 = c5054.m11213(String.class, c1038, "token");
        this.f1903 = c5054.m11213(String.class, c1038, "hash");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(41, "GeneratedJsonAdapter(HandshakeResponseJs)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1904);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 != 0) {
                AbstractC5044 abstractC5044 = this.f1903;
                if (iMo11194 == 1) {
                    str2 = (String) abstractC5044.mo1390(abstractC5050);
                } else if (iMo11194 == 2) {
                    str3 = (String) abstractC5044.mo1390(abstractC5050);
                }
            } else {
                str = (String) this.f1902.mo1390(abstractC5050);
                if (str == null) {
                    throw AbstractC2458.m6574("token", "token", abstractC5050);
                }
            }
        }
        abstractC5050.mo11198();
        if (str != null) {
            return new HandshakeResponseJs(str, str2, str3);
        }
        throw AbstractC2458.m6573("token", "token", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        HandshakeResponseJs handshakeResponseJs = (HandshakeResponseJs) obj;
        if (handshakeResponseJs == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("token");
        this.f1902.mo1391(abstractC5048, handshakeResponseJs.f1901);
        abstractC5048.mo11174("hash");
        AbstractC5044 abstractC5044 = this.f1903;
        abstractC5044.mo1391(abstractC5048, handshakeResponseJs.f1899);
        abstractC5048.mo11174("random");
        abstractC5044.mo1391(abstractC5048, handshakeResponseJs.f1900);
        abstractC5048.mo11178();
    }
}
