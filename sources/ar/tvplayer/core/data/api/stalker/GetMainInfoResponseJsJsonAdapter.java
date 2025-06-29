package ar.tvplayer.core.data.api.stalker;

import p013.C1038;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class GetMainInfoResponseJsJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1884;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1885 = C3759.m8745("end_date", "phone");

    public GetMainInfoResponseJsJsonAdapter(C5054 c5054) {
        this.f1884 = c5054.m11213(String.class, C1038.f4437, "endDate");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(43, "GeneratedJsonAdapter(GetMainInfoResponseJs)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        String str2 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1885);
            if (iMo11194 != -1) {
                AbstractC5044 abstractC5044 = this.f1884;
                if (iMo11194 == 0) {
                    str = (String) abstractC5044.mo1390(abstractC5050);
                } else if (iMo11194 == 1) {
                    str2 = (String) abstractC5044.mo1390(abstractC5050);
                }
            } else {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            }
        }
        abstractC5050.mo11198();
        return new GetMainInfoResponseJs(str, str2);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        GetMainInfoResponseJs getMainInfoResponseJs = (GetMainInfoResponseJs) obj;
        if (getMainInfoResponseJs == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("end_date");
        AbstractC5044 abstractC5044 = this.f1884;
        abstractC5044.mo1391(abstractC5048, getMainInfoResponseJs.f1883);
        abstractC5048.mo11174("phone");
        abstractC5044.mo1391(abstractC5048, getMainInfoResponseJs.f1881);
        abstractC5048.mo11178();
    }
}
