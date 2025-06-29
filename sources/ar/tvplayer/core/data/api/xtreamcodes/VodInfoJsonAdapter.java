package ar.tvplayer.core.data.api.xtreamcodes;

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
import ʾʾ.ˑʽ;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class VodInfoJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2175;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2176;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2177 = C3759.m8745("info", "movie_data");

    public VodInfoJsonAdapter(C5054 c5054) {
        this.f2175 = c5054.m11213(AbstractC5047.m11170(List.class, VodInfoData.class), Collections.singleton(new ˑʽ(3)), "info");
        this.f2176 = c5054.m11213(MovieData.class, C1038.f4437, "movieData");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(29, "GeneratedJsonAdapter(VodInfo)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        List list = null;
        MovieData movieData = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2177);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                list = (List) this.f2175.mo1390(abstractC5050);
                if (list == null) {
                    throw AbstractC2458.m6574("info", "info", abstractC5050);
                }
            } else if (iMo11194 == 1 && (movieData = (MovieData) this.f2176.mo1390(abstractC5050)) == null) {
                throw AbstractC2458.m6574("movieData", "movie_data", abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (list == null) {
            throw AbstractC2458.m6573("info", "info", abstractC5050);
        }
        if (movieData != null) {
            return new VodInfo(list, movieData);
        }
        throw AbstractC2458.m6573("movieData", "movie_data", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        VodInfo vodInfo = (VodInfo) obj;
        if (vodInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("info");
        this.f2175.mo1391(abstractC5048, vodInfo.f2157);
        abstractC5048.mo11174("movie_data");
        this.f2176.mo1391(abstractC5048, vodInfo.f2156);
        abstractC5048.mo11178();
    }
}
