package ar.tvplayer.core.data.api.xtreamcodes;

import java.util.Collections;
import p013.C1038;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ʾʾ.ـﹶ;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class EpisodeInfoJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2066;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2067;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2068 = C3759.m8745("releasedate", "movie_image");

    public EpisodeInfoJsonAdapter(C5054 c5054) {
        this.f2066 = c5054.m11213(String.class, Collections.singleton(new ـﹶ()), "releaseDate");
        this.f2067 = c5054.m11213(String.class, C1038.f4437, "image");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(33, "GeneratedJsonAdapter(EpisodeInfo)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        String str2 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2068);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                str = (String) this.f2066.mo1390(abstractC5050);
            } else if (iMo11194 == 1) {
                str2 = (String) this.f2067.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        return new EpisodeInfo(str, str2);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        EpisodeInfo episodeInfo = (EpisodeInfo) obj;
        if (episodeInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("releasedate");
        this.f2066.mo1391(abstractC5048, episodeInfo.f2065);
        abstractC5048.mo11174("movie_image");
        this.f2067.mo1391(abstractC5048, episodeInfo.f2064);
        abstractC5048.mo11178();
    }
}
