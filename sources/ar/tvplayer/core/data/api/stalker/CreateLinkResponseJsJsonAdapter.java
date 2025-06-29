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
public final class CreateLinkResponseJsJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1815;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1816;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1817 = C3759.m8745("cmd", "error");

    public CreateLinkResponseJsJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f1815 = c5054.m11213(String.class, c1038, "url");
        this.f1816 = c5054.m11213(String.class, c1038, "error");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(42, "GeneratedJsonAdapter(CreateLinkResponseJs)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        String str2 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1817);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                str = (String) this.f1815.mo1390(abstractC5050);
                if (str == null) {
                    throw AbstractC2458.m6574("url", "cmd", abstractC5050);
                }
            } else if (iMo11194 == 1) {
                str2 = (String) this.f1816.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (str != null) {
            return new CreateLinkResponseJs(str, str2);
        }
        throw AbstractC2458.m6573("url", "cmd", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        CreateLinkResponseJs createLinkResponseJs = (CreateLinkResponseJs) obj;
        if (createLinkResponseJs == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("cmd");
        this.f1815.mo1391(abstractC5048, createLinkResponseJs.f1814);
        abstractC5048.mo11174("error");
        this.f1816.mo1391(abstractC5048, createLinkResponseJs.f1813);
        abstractC5048.mo11178();
    }
}
