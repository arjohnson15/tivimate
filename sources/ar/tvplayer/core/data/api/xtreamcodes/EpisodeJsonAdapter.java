package ar.tvplayer.core.data.api.xtreamcodes;

import java.util.Collections;
import java.util.List;
import p013.C1038;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5047;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ʾʾ.ʽᐧ;
import ʾʾ.ˑʽ;
import ʾʾ.ﹳﹳ;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class EpisodeJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2069;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC5044 f2070;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2071;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2072 = C3759.m8745("id", "title", "season", "container_extension", "info");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f2073;

    public EpisodeJsonAdapter(C5054 c5054) {
        this.f2069 = c5054.m11213(Integer.class, Collections.singleton(new ʽᐧ(0)), "id");
        this.f2071 = c5054.m11213(String.class, Collections.singleton(new ﹳﹳ(0)), "title");
        this.f2073 = c5054.m11213(String.class, C1038.f4437, "season");
        this.f2070 = c5054.m11213(AbstractC5047.m11170(List.class, EpisodeInfo.class), Collections.singleton(new ˑʽ(0)), "info");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(29, "GeneratedJsonAdapter(Episode)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2072);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                num = (Integer) this.f2069.mo1390(abstractC5050);
            } else if (iMo11194 != 1) {
                AbstractC5044 abstractC5044 = this.f2073;
                if (iMo11194 == 2) {
                    str2 = (String) abstractC5044.mo1390(abstractC5050);
                } else if (iMo11194 == 3) {
                    str3 = (String) abstractC5044.mo1390(abstractC5050);
                } else if (iMo11194 == 4) {
                    list = (List) this.f2070.mo1390(abstractC5050);
                }
            } else {
                str = (String) this.f2071.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        return new Episode(num, str, str2, str3, list);
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
        this.f2069.mo1391(abstractC5048, episode.f2062);
        abstractC5048.mo11174("title");
        this.f2071.mo1391(abstractC5048, episode.f2059);
        abstractC5048.mo11174("season");
        AbstractC5044 abstractC5044 = this.f2073;
        abstractC5044.mo1391(abstractC5048, episode.f2061);
        abstractC5048.mo11174("container_extension");
        abstractC5044.mo1391(abstractC5048, episode.f2063);
        abstractC5048.mo11174("info");
        this.f2070.mo1391(abstractC5048, episode.f2060);
        abstractC5048.mo11178();
    }
}
