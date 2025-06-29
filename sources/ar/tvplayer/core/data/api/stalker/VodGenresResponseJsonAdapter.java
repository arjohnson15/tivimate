package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5047;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class VodGenresResponseJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1995;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1996 = C3759.m8745("js");

    public VodGenresResponseJsonAdapter(C5054 c5054) {
        this.f1995 = c5054.m11213(AbstractC5047.m11170(List.class, VodGenre.class), C1038.f4437, "genres");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(39, "GeneratedJsonAdapter(VodGenresResponse)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        List list = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1996);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0 && (list = (List) this.f1995.mo1390(abstractC5050)) == null) {
                throw AbstractC2458.m6574("genres", "js", abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (list != null) {
            return new VodGenresResponse(list);
        }
        throw AbstractC2458.m6573("genres", "js", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        VodGenresResponse vodGenresResponse = (VodGenresResponse) obj;
        if (vodGenresResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("js");
        this.f1995.mo1391(abstractC5048, vodGenresResponse.f1994);
        abstractC5048.mo11178();
    }
}
