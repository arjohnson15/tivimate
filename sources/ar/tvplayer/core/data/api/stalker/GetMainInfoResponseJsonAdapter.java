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
public final class GetMainInfoResponseJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1886;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1887 = C3759.m8745("js");

    public GetMainInfoResponseJsonAdapter(C5054 c5054) {
        this.f1886 = c5054.m11213(GetMainInfoResponseJs.class, C1038.f4437, "js");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(41, "GeneratedJsonAdapter(GetMainInfoResponse)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        GetMainInfoResponseJs getMainInfoResponseJs = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1887);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0 && (getMainInfoResponseJs = (GetMainInfoResponseJs) this.f1886.mo1390(abstractC5050)) == null) {
                throw AbstractC2458.m6574("js", "js", abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (getMainInfoResponseJs != null) {
            return new GetMainInfoResponse(getMainInfoResponseJs);
        }
        throw AbstractC2458.m6573("js", "js", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        GetMainInfoResponse getMainInfoResponse = (GetMainInfoResponse) obj;
        if (getMainInfoResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("js");
        this.f1886.mo1391(abstractC5048, getMainInfoResponse.f1880);
        abstractC5048.mo11178();
    }
}
