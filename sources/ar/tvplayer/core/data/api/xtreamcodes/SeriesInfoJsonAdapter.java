package ar.tvplayer.core.data.api.xtreamcodes;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5047;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ʾʾ.ˏʾ;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class SeriesInfoJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2124;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2125;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2126 = C3759.m8745("info", "episodes");

    public SeriesInfoJsonAdapter(C5054 c5054) {
        this.f2124 = c5054.m11213(SeriesInfoData.class, C1038.f4437, "info");
        this.f2125 = c5054.m11213(AbstractC5047.m11170(Map.class, String.class, AbstractC5047.m11170(List.class, Episode.class)), Collections.singleton(new ˏʾ()), "episodesMap");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(32, "GeneratedJsonAdapter(SeriesInfo)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        SeriesInfoData seriesInfoData = null;
        Map map = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2126);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                seriesInfoData = (SeriesInfoData) this.f2124.mo1390(abstractC5050);
                if (seriesInfoData == null) {
                    throw AbstractC2458.m6574("info", "info", abstractC5050);
                }
            } else if (iMo11194 == 1) {
                map = (Map) this.f2125.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (seriesInfoData != null) {
            return new SeriesInfo(seriesInfoData, map);
        }
        throw AbstractC2458.m6573("info", "info", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        SeriesInfo seriesInfo = (SeriesInfo) obj;
        if (seriesInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("info");
        this.f2124.mo1391(abstractC5048, seriesInfo.f2109);
        abstractC5048.mo11174("episodes");
        this.f2125.mo1391(abstractC5048, seriesInfo.f2107);
        abstractC5048.mo11178();
    }
}
