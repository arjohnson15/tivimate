package ar.tvplayer.core.data.api.stalker;

import java.util.Collections;
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
import ٴⁱ.ﹳﹳ;

/* loaded from: classes.dex */
public final class FullEpisodeJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1857;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1858;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1859 = C3759.m8745("id", "series_number", "series");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f1860;

    public FullEpisodeJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f1857 = c5054.m11213(String.class, c1038, "id");
        this.f1858 = c5054.m11213(Integer.class, Collections.singleton(new ﹳﹳ(1)), "number");
        this.f1860 = c5054.m11213(AbstractC5047.m11170(List.class, Integer.class), c1038, "episodeNumbers");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(33, "GeneratedJsonAdapter(FullEpisode)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        Integer num = null;
        List list = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1859);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                str = (String) this.f1857.mo1390(abstractC5050);
                if (str == null) {
                    throw AbstractC2458.m6574("id", "id", abstractC5050);
                }
            } else if (iMo11194 == 1) {
                num = (Integer) this.f1858.mo1390(abstractC5050);
            } else if (iMo11194 == 2) {
                list = (List) this.f1860.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (str != null) {
            return new FullEpisode(str, num, list);
        }
        throw AbstractC2458.m6573("id", "id", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        FullEpisode fullEpisode = (FullEpisode) obj;
        if (fullEpisode == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("id");
        this.f1857.mo1391(abstractC5048, fullEpisode.f1856);
        abstractC5048.mo11174("series_number");
        this.f1858.mo1391(abstractC5048, fullEpisode.f1854);
        abstractC5048.mo11174("series");
        this.f1860.mo1391(abstractC5048, fullEpisode.f1855);
        abstractC5048.mo11178();
    }
}
