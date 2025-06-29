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
public final class SeasonJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1926;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC5044 f1927;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1928;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1929 = C3759.m8745("id", "season_number", "season_series", "series", "cmd");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f1930;

    public SeasonJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f1926 = c5054.m11213(String.class, c1038, "id");
        this.f1928 = c5054.m11213(Integer.class, c1038, "seasonNumber");
        this.f1930 = c5054.m11213(AbstractC5047.m11170(List.class, Integer.class), c1038, "episodeNumbers");
        this.f1927 = c5054.m11213(String.class, c1038, "cmd");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(28, "GeneratedJsonAdapter(Season)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        String str2 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1929);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 != 0) {
                AbstractC5044 abstractC5044 = this.f1928;
                if (iMo11194 == 1) {
                    num = (Integer) abstractC5044.mo1390(abstractC5050);
                } else if (iMo11194 == 2) {
                    num2 = (Integer) abstractC5044.mo1390(abstractC5050);
                } else if (iMo11194 == 3) {
                    list = (List) this.f1930.mo1390(abstractC5050);
                } else if (iMo11194 == 4) {
                    str2 = (String) this.f1927.mo1390(abstractC5050);
                }
            } else {
                str = (String) this.f1926.mo1390(abstractC5050);
                if (str == null) {
                    throw AbstractC2458.m6574("id", "id", abstractC5050);
                }
            }
        }
        abstractC5050.mo11198();
        if (str != null) {
            return new Season(str, num, num2, list, str2);
        }
        throw AbstractC2458.m6573("id", "id", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        Season season = (Season) obj;
        if (season == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("id");
        this.f1926.mo1391(abstractC5048, season.f1922);
        abstractC5048.mo11174("season_number");
        AbstractC5044 abstractC5044 = this.f1928;
        abstractC5044.mo1391(abstractC5048, season.f1919);
        abstractC5048.mo11174("season_series");
        abstractC5044.mo1391(abstractC5048, season.f1921);
        abstractC5048.mo11174("series");
        this.f1930.mo1391(abstractC5048, season.f1925);
        abstractC5048.mo11174("cmd");
        this.f1927.mo1391(abstractC5048, season.f1920);
        abstractC5048.mo11178();
    }
}
