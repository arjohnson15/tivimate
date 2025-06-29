package ar.tvplayer.core.data.api.stalker;

import java.util.Collections;
import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;
import ٴⁱ.ʽᐧ;

/* loaded from: classes.dex */
public final class VodGenreJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1991;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1992;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1993 = C3759.m8745("id", "title");

    public VodGenreJsonAdapter(C5054 c5054) {
        this.f1991 = c5054.m11213(String.class, C1038.f4437, "id");
        this.f1992 = c5054.m11213(String.class, Collections.singleton(new ʽᐧ(3)), "title");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(30, "GeneratedJsonAdapter(VodGenre)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        String str2 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1993);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                str = (String) this.f1991.mo1390(abstractC5050);
                if (str == null) {
                    throw AbstractC2458.m6574("id", "id", abstractC5050);
                }
            } else if (iMo11194 == 1) {
                str2 = (String) this.f1992.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (str != null) {
            return new VodGenre(str, str2);
        }
        throw AbstractC2458.m6573("id", "id", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        VodGenre vodGenre = (VodGenre) obj;
        if (vodGenre == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("id");
        this.f1991.mo1391(abstractC5048, vodGenre.f1990);
        abstractC5048.mo11174("title");
        this.f1992.mo1391(abstractC5048, vodGenre.f1989);
        abstractC5048.mo11178();
    }
}
