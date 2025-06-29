package ar.tvplayer.core.data.api.xtreamcodes;

import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class XtreamCodes_ParamsJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2202;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2203 = C3759.m8745("h", "u", "p", "o");

    public XtreamCodes_ParamsJsonAdapter(C5054 c5054) {
        this.f2202 = c5054.m11213(String.class, C1038.f4437, "host");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(40, "GeneratedJsonAdapter(XtreamCodes.Params)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2203);
            if (iMo11194 != -1) {
                AbstractC5044 abstractC5044 = this.f2202;
                if (iMo11194 == 0) {
                    str = (String) abstractC5044.mo1390(abstractC5050);
                    if (str == null) {
                        throw AbstractC2458.m6574("host", "h", abstractC5050);
                    }
                } else if (iMo11194 == 1) {
                    str2 = (String) abstractC5044.mo1390(abstractC5050);
                    if (str2 == null) {
                        throw AbstractC2458.m6574("username", "u", abstractC5050);
                    }
                } else if (iMo11194 == 2) {
                    str3 = (String) abstractC5044.mo1390(abstractC5050);
                    if (str3 == null) {
                        throw AbstractC2458.m6574("password", "p", abstractC5050);
                    }
                } else if (iMo11194 == 3 && (str4 = (String) abstractC5044.mo1390(abstractC5050)) == null) {
                    throw AbstractC2458.m6574("output", "o", abstractC5050);
                }
            } else {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            }
        }
        abstractC5050.mo11198();
        if (str == null) {
            throw AbstractC2458.m6573("host", "h", abstractC5050);
        }
        if (str2 == null) {
            throw AbstractC2458.m6573("username", "u", abstractC5050);
        }
        if (str3 == null) {
            throw AbstractC2458.m6573("password", "p", abstractC5050);
        }
        if (str4 != null) {
            return new XtreamCodes$Params(0L, str, str2, str3, str4, 1, null);
        }
        throw AbstractC2458.m6573("output", "o", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        XtreamCodes$Params xtreamCodes$Params = (XtreamCodes$Params) obj;
        if (xtreamCodes$Params == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("h");
        AbstractC5044 abstractC5044 = this.f2202;
        abstractC5044.mo1391(abstractC5048, xtreamCodes$Params.f2193);
        abstractC5048.mo11174("u");
        abstractC5044.mo1391(abstractC5048, xtreamCodes$Params.f2196);
        abstractC5048.mo11174("p");
        abstractC5044.mo1391(abstractC5048, xtreamCodes$Params.f2200);
        abstractC5048.mo11174("o");
        abstractC5044.mo1391(abstractC5048, xtreamCodes$Params.f2194);
        abstractC5048.mo11178();
    }
}
