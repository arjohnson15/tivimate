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
public final class AuthResponseJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1788;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1789 = C3759.m8745("js");

    public AuthResponseJsonAdapter(C5054 c5054) {
        this.f1788 = c5054.m11213(Boolean.TYPE, C1038.f4437, "js");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(34, "GeneratedJsonAdapter(AuthResponse)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        Boolean bool = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1789);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0 && (bool = (Boolean) this.f1788.mo1390(abstractC5050)) == null) {
                throw AbstractC2458.m6574("js", "js", abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (bool != null) {
            return new AuthResponse(bool.booleanValue());
        }
        throw AbstractC2458.m6573("js", "js", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        AuthResponse authResponse = (AuthResponse) obj;
        if (authResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("js");
        this.f1788.mo1391(abstractC5048, Boolean.valueOf(authResponse.f1787));
        abstractC5048.mo11178();
    }
}
