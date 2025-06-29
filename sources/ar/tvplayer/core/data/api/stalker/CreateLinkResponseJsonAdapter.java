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
public final class CreateLinkResponseJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1818;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1819 = C3759.m8745("js");

    public CreateLinkResponseJsonAdapter(C5054 c5054) {
        this.f1818 = c5054.m11213(CreateLinkResponseJs.class, C1038.f4437, "js");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(40, "GeneratedJsonAdapter(CreateLinkResponse)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        CreateLinkResponseJs createLinkResponseJs = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1819);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0 && (createLinkResponseJs = (CreateLinkResponseJs) this.f1818.mo1390(abstractC5050)) == null) {
                throw AbstractC2458.m6574("js", "js", abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (createLinkResponseJs != null) {
            return new CreateLinkResponse(createLinkResponseJs);
        }
        throw AbstractC2458.m6573("js", "js", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        CreateLinkResponse createLinkResponse = (CreateLinkResponse) obj;
        if (createLinkResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("js");
        this.f1818.mo1391(abstractC5048, createLinkResponse.f1812);
        abstractC5048.mo11178();
    }
}
