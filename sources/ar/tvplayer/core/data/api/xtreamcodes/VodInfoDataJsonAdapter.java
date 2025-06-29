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
import ʾʾ.ʽᐧ;
import ʾʾ.ˑʽ;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class VodInfoDataJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2171;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2172;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2173 = C3759.m8745("releasedate", "duration_secs", "youtube_trailer", "director", "cast", "plot", "description", "genre", "backdrop_path", "backdrop");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f2174;

    public VodInfoDataJsonAdapter(C5054 c5054) {
        this.f2171 = c5054.m11213(String.class, C1038.f4437, "releaseDate");
        this.f2172 = c5054.m11213(Integer.class, Collections.singleton(new ʽᐧ(1)), "durationSec");
        this.f2174 = c5054.m11213(AbstractC5047.m11170(List.class, String.class), Collections.singleton(new ˑʽ(2)), "backdropPaths");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(33, "GeneratedJsonAdapter(VodInfoData)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List list = null;
        String str8 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2173);
            AbstractC5044 abstractC5044 = this.f2171;
            switch (iMo11194) {
                case -1:
                    abstractC5050.mo11197();
                    abstractC5050.mo11184();
                    break;
                case 0:
                    str = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case 1:
                    num = (Integer) this.f2172.mo1390(abstractC5050);
                    break;
                case 2:
                    str2 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case 3:
                    str3 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case 4:
                    str4 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case 5:
                    str5 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    str6 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    str7 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
                case 8:
                    list = (List) this.f2174.mo1390(abstractC5050);
                    break;
                case 9:
                    str8 = (String) abstractC5044.mo1390(abstractC5050);
                    break;
            }
        }
        abstractC5050.mo11198();
        return new VodInfoData(str, num, str2, str3, str4, str5, str6, str7, list, str8);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        VodInfoData vodInfoData = (VodInfoData) obj;
        if (vodInfoData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("releasedate");
        AbstractC5044 abstractC5044 = this.f2171;
        abstractC5044.mo1391(abstractC5048, vodInfoData.f2166);
        abstractC5048.mo11174("duration_secs");
        this.f2172.mo1391(abstractC5048, vodInfoData.f2158);
        abstractC5048.mo11174("youtube_trailer");
        abstractC5044.mo1391(abstractC5048, vodInfoData.f2165);
        abstractC5048.mo11174("director");
        abstractC5044.mo1391(abstractC5048, vodInfoData.f2169);
        abstractC5048.mo11174("cast");
        abstractC5044.mo1391(abstractC5048, vodInfoData.f2159);
        abstractC5048.mo11174("plot");
        abstractC5044.mo1391(abstractC5048, vodInfoData.f2167);
        abstractC5048.mo11174("description");
        abstractC5044.mo1391(abstractC5048, vodInfoData.f2168);
        abstractC5048.mo11174("genre");
        abstractC5044.mo1391(abstractC5048, vodInfoData.f2164);
        abstractC5048.mo11174("backdrop_path");
        this.f2174.mo1391(abstractC5048, vodInfoData.f2170);
        abstractC5048.mo11174("backdrop");
        abstractC5044.mo1391(abstractC5048, vodInfoData.f2160);
        abstractC5048.mo11178();
    }
}
