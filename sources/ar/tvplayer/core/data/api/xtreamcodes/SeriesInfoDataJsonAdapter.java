package ar.tvplayer.core.data.api.xtreamcodes;

import java.util.Collections;
import java.util.List;
import p013.C1038;
import p331.C3759;
import p334.C3789;
import p435.AbstractC5044;
import p435.AbstractC5047;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ʾʾ.ˑʽ;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class SeriesInfoDataJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2121;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2122;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2123 = C3759.m8745("releaseDate", "youtube_trailer", "director", "cast", "plot", "description", "genre", "backdrop_path", "backdrop");

    public SeriesInfoDataJsonAdapter(C5054 c5054) {
        this.f2121 = c5054.m11213(String.class, C1038.f4437, "releaseDate");
        this.f2122 = c5054.m11213(AbstractC5047.m11170(List.class, String.class), Collections.singleton(new ˑʽ(1)), "backdropPaths");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(36, "GeneratedJsonAdapter(SeriesInfoData)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List list = null;
        String str8 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2123);
            AbstractC5044 abstractC5044 = this.f2121;
            switch (iMo11194) {
                case -1:
                    abstractC5050.mo11197();
                    abstractC5050.mo11184();
                    break;
                case 0:
                    str = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case 1:
                    str2 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case 2:
                    str3 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case 3:
                    str4 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case 4:
                    str5 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case 5:
                    str6 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    str7 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    list = (List) this.f2122.mo1390(abstractC5050);
                    break;
                case 8:
                    str8 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
            }
        }
        abstractC5050.mo11198();
        return new SeriesInfoData(str, str2, str3, str4, str5, str6, str7, list, str8);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        SeriesInfoData seriesInfoData = (SeriesInfoData) obj;
        if (seriesInfoData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("releaseDate");
        AbstractC5044 abstractC5044 = this.f2121;
        abstractC5044.mo1391(abstractC5048, seriesInfoData.f2116);
        abstractC5048.mo11174("youtube_trailer");
        abstractC5044.mo1391(abstractC5048, seriesInfoData.f2110);
        abstractC5048.mo11174("director");
        abstractC5044.mo1391(abstractC5048, seriesInfoData.f2115);
        abstractC5048.mo11174("cast");
        abstractC5044.mo1391(abstractC5048, seriesInfoData.f2119);
        abstractC5048.mo11174("plot");
        abstractC5044.mo1391(abstractC5048, seriesInfoData.f2111);
        abstractC5048.mo11174("description");
        abstractC5044.mo1391(abstractC5048, seriesInfoData.f2117);
        abstractC5048.mo11174("genre");
        abstractC5044.mo1391(abstractC5048, seriesInfoData.f2118);
        abstractC5048.mo11174("backdrop_path");
        this.f2122.mo1391(abstractC5048, seriesInfoData.f2114);
        abstractC5048.mo11174("backdrop");
        abstractC5044.mo1391(abstractC5048, seriesInfoData.f2120);
        abstractC5048.mo11178();
    }
}
