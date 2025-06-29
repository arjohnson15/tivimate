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
import ٴⁱ.ﹳﹳ;

/* loaded from: classes.dex */
public final class EpisodeJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1834;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1835;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1836 = C3759.m8745("id", "series_number");

    public EpisodeJsonAdapter(C5054 c5054) {
        this.f1834 = c5054.m11213(String.class, C1038.f4437, "id");
        this.f1835 = c5054.m11213(Integer.class, Collections.singleton(new ﹳﹳ(0)), "number");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(29, "GeneratedJsonAdapter(Episode)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        Integer num = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1836);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                str = (String) this.f1834.mo1390(abstractC5050);
                if (str == null) {
                    throw AbstractC2458.m6574("id", "id", abstractC5050);
                }
            } else if (iMo11194 == 1) {
                num = (Integer) this.f1835.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (str != null) {
            return new Episode(str, num);
        }
        throw AbstractC2458.m6573("id", "id", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        Episode episode = (Episode) obj;
        if (episode == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("id");
        this.f1834.mo1391(abstractC5048, episode.f1833);
        abstractC5048.mo11174("series_number");
        this.f1835.mo1391(abstractC5048, episode.f1832);
        abstractC5048.mo11178();
    }
}
