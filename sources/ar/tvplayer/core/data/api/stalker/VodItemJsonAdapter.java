package ar.tvplayer.core.data.api.stalker;

import java.util.Collections;
import java.util.List;
import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p334.C3789;
import p435.AbstractC5044;
import p435.AbstractC5047;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;
import ٴⁱ.ʽᐧ;
import ٴⁱ.ʿˏ;
import ٴⁱ.ˎٴ;
import ٴⁱ.ᵎˏ;
import ٴⁱ.ﹳˎ;

/* loaded from: classes.dex */
public final class VodItemJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2026;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC5044 f2027;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final AbstractC5044 f2028;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2029;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2030 = C3759.m8745("id", "category_id", "cat_genre_id_1", "cat_genre_id_2", "cat_genre_id_3", "cat_genre_id_4", "name", "series", "is_series", "screenshot_uri", "rating_imdb", "rating_kinopoisk", "added", "year", "time", "genres_str", "actors", "director", "description", "cmd", "has_files");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final AbstractC5044 f2031;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final AbstractC5044 f2032;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f2033;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final AbstractC5044 f2034;

    public VodItemJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f2026 = c5054.m11213(String.class, c1038, "id");
        this.f2029 = c5054.m11213(Long.class, Collections.singleton(new ﹳˎ()), "categoryId");
        this.f2033 = c5054.m11213(String.class, Collections.singleton(new ʽᐧ(4)), "name");
        this.f2027 = c5054.m11213(AbstractC5047.m11170(List.class, Integer.class), Collections.singleton(new ᵎˏ()), "episodes");
        this.f2031 = c5054.m11213(String.class, c1038, "isSeriesStr");
        this.f2032 = c5054.m11213(String.class, Collections.singleton(new ʿˏ()), "screenshotUri");
        this.f2028 = c5054.m11213(Float.class, Collections.singleton(new ˎٴ()), "ratingImdb");
        this.f2034 = c5054.m11213(Integer.class, c1038, "hasFiles");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(29, "GeneratedJsonAdapter(VodItem)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        Float f = null;
        Float f2 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        Integer num = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2030);
            Float f3 = f2;
            AbstractC5044 abstractC5044 = this.f2028;
            Float f4 = f;
            AbstractC5044 abstractC50442 = this.f2029;
            String str13 = str4;
            AbstractC5044 abstractC50443 = this.f2031;
            switch (iMo11194) {
                case -1:
                    abstractC5050.mo11197();
                    abstractC5050.mo11184();
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 0:
                    str = (String) this.f2026.mo1390(abstractC5050);
                    if (str == null) {
                        throw AbstractC2458.m6574("id", "id", abstractC5050);
                    }
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 1:
                    l = (Long) abstractC50442.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 2:
                    l2 = (Long) abstractC50442.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 3:
                    l3 = (Long) abstractC50442.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 4:
                    l4 = (Long) abstractC50442.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 5:
                    l5 = (Long) abstractC50442.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = (String) this.f2033.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    list = (List) this.f2027.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 8:
                    str3 = (String) abstractC50443.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 9:
                    str4 = (String) this.f2032.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                case 10:
                    f = (Float) abstractC5044.mo1390(abstractC5050);
                    f2 = f3;
                    str4 = str13;
                case 11:
                    f2 = (Float) abstractC5044.mo1390(abstractC5050);
                    f = f4;
                    str4 = str13;
                case 12:
                    str5 = (String) abstractC50443.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 13:
                    str6 = (String) abstractC50443.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 14:
                    str7 = (String) abstractC50443.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 15:
                    str8 = (String) abstractC50443.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 16:
                    str9 = (String) abstractC50443.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 17:
                    str10 = (String) abstractC50443.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 18:
                    str11 = (String) abstractC50443.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 19:
                    str12 = (String) abstractC50443.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                case 20:
                    num = (Integer) this.f2034.mo1390(abstractC5050);
                    f2 = f3;
                    f = f4;
                    str4 = str13;
                default:
                    f2 = f3;
                    f = f4;
                    str4 = str13;
            }
        }
        String str14 = str4;
        Float f5 = f;
        Float f6 = f2;
        abstractC5050.mo11198();
        if (str != null) {
            return new VodItem(str, l, l2, l3, l4, l5, str2, list, str3, str14, f5, f6, str5, str6, str7, str8, str9, str10, str11, str12, num);
        }
        throw AbstractC2458.m6573("id", "id", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        VodItem vodItem = (VodItem) obj;
        if (vodItem == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("id");
        this.f2026.mo1391(abstractC5048, vodItem.f2014);
        abstractC5048.mo11174("category_id");
        AbstractC5044 abstractC5044 = this.f2029;
        abstractC5044.mo1391(abstractC5048, vodItem.f1999);
        abstractC5048.mo11174("cat_genre_id_1");
        abstractC5044.mo1391(abstractC5048, vodItem.f2011);
        abstractC5048.mo11174("cat_genre_id_2");
        abstractC5044.mo1391(abstractC5048, vodItem.f2022);
        abstractC5048.mo11174("cat_genre_id_3");
        abstractC5044.mo1391(abstractC5048, vodItem.f2000);
        abstractC5048.mo11174("cat_genre_id_4");
        abstractC5044.mo1391(abstractC5048, vodItem.f2015);
        abstractC5048.mo11174("name");
        this.f2033.mo1391(abstractC5048, vodItem.f2016);
        abstractC5048.mo11174("series");
        this.f2027.mo1391(abstractC5048, vodItem.f2010);
        abstractC5048.mo11174("is_series");
        AbstractC5044 abstractC50442 = this.f2031;
        abstractC50442.mo1391(abstractC5048, vodItem.f2023);
        abstractC5048.mo11174("screenshot_uri");
        this.f2032.mo1391(abstractC5048, vodItem.f2003);
        abstractC5048.mo11174("rating_imdb");
        AbstractC5044 abstractC50443 = this.f2028;
        abstractC50443.mo1391(abstractC5048, vodItem.f2008);
        abstractC5048.mo11174("rating_kinopoisk");
        abstractC50443.mo1391(abstractC5048, vodItem.f2004);
        abstractC5048.mo11174("added");
        abstractC50442.mo1391(abstractC5048, vodItem.f2006);
        abstractC5048.mo11174("year");
        abstractC50442.mo1391(abstractC5048, vodItem.f2017);
        abstractC5048.mo11174("time");
        abstractC50442.mo1391(abstractC5048, vodItem.f2009);
        abstractC5048.mo11174("genres_str");
        abstractC50442.mo1391(abstractC5048, vodItem.f2012);
        abstractC5048.mo11174("actors");
        abstractC50442.mo1391(abstractC5048, vodItem.f2019);
        abstractC5048.mo11174("director");
        abstractC50442.mo1391(abstractC5048, vodItem.f2007);
        abstractC5048.mo11174("description");
        abstractC50442.mo1391(abstractC5048, vodItem.f2018);
        abstractC5048.mo11174("cmd");
        abstractC50442.mo1391(abstractC5048, vodItem.f2020);
        abstractC5048.mo11174("has_files");
        this.f2034.mo1391(abstractC5048, vodItem.f2001);
        abstractC5048.mo11178();
    }
}
