package ar.tvplayer.core.data.api.stalker;

import ar.tvplayer.core.util.annotation.ForceToFloat;
import ar.tvplayer.core.util.annotation.ForceToList;
import ar.tvplayer.core.util.annotation.ForceToLong;
import ar.tvplayer.core.util.annotation.ForceToString;
import ar.tvplayer.core.util.annotation.TrimmedString;
import java.util.List;
import p070.AbstractC1549;
import p252.AbstractC3139;
import p288.C3406;
import p317.AbstractC3629;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import יˏ.ˎᵢ;
import ٴⁱ.ᵎـ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class VodItem {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Long f1999;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Long f2000;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final Integer f2001;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final String f2003;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final Float f2004;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final String f2006;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final String f2007;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final Float f2008;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final String f2009;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final List f2010;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Long f2011;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final String f2012;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f2014;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Long f2015;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String f2016;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final String f2017;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final String f2018;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final String f2019;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final String f2020;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Long f2022;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final String f2023;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final C3406 f1998 = new C3406(new ˎᵢ(28));

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C3406 f1997 = new C3406(new ˎᵢ(29));

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final transient C3406 f2005 = new C3406(new ᵎـ(this, 0));

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final transient C3406 f2025 = new C3406(new ᵎـ(this, 1));

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final transient C3406 f2024 = new C3406(new ᵎـ(this, 2));

    /* renamed from: יʻ, reason: contains not printable characters */
    public final transient C3406 f2013 = new C3406(new ᵎـ(this, 3));

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final transient C3406 f2021 = new C3406(new ᵎـ(this, 4));

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final transient C3406 f2002 = new C3406(new ᵎـ(this, 5));

    public VodItem(@InterfaceC5065(name = "id") String str, @ForceToLong @InterfaceC5065(name = "category_id") Long l, @ForceToLong @InterfaceC5065(name = "cat_genre_id_1") Long l2, @ForceToLong @InterfaceC5065(name = "cat_genre_id_2") Long l3, @ForceToLong @InterfaceC5065(name = "cat_genre_id_3") Long l4, @ForceToLong @InterfaceC5065(name = "cat_genre_id_4") Long l5, @TrimmedString @InterfaceC5065(name = "name") String str2, @ForceToList @InterfaceC5065(name = "series") List<Integer> list, @InterfaceC5065(name = "is_series") String str3, @ForceToString @InterfaceC5065(name = "screenshot_uri") String str4, @ForceToFloat @InterfaceC5065(name = "rating_imdb") Float f, @ForceToFloat @InterfaceC5065(name = "rating_kinopoisk") Float f2, @InterfaceC5065(name = "added") String str5, @InterfaceC5065(name = "year") String str6, @InterfaceC5065(name = "time") String str7, @InterfaceC5065(name = "genres_str") String str8, @InterfaceC5065(name = "actors") String str9, @InterfaceC5065(name = "director") String str10, @InterfaceC5065(name = "description") String str11, @InterfaceC5065(name = "cmd") String str12, @InterfaceC5065(name = "has_files") Integer num) {
        this.f2014 = str;
        this.f1999 = l;
        this.f2011 = l2;
        this.f2022 = l3;
        this.f2000 = l4;
        this.f2015 = l5;
        this.f2016 = str2;
        this.f2010 = list;
        this.f2023 = str3;
        this.f2003 = str4;
        this.f2008 = f;
        this.f2004 = f2;
        this.f2006 = str5;
        this.f2017 = str6;
        this.f2009 = str7;
        this.f2012 = str8;
        this.f2019 = str9;
        this.f2007 = str10;
        this.f2018 = str11;
        this.f2020 = str12;
        this.f2001 = num;
    }

    public final VodItem copy(@InterfaceC5065(name = "id") String str, @ForceToLong @InterfaceC5065(name = "category_id") Long l, @ForceToLong @InterfaceC5065(name = "cat_genre_id_1") Long l2, @ForceToLong @InterfaceC5065(name = "cat_genre_id_2") Long l3, @ForceToLong @InterfaceC5065(name = "cat_genre_id_3") Long l4, @ForceToLong @InterfaceC5065(name = "cat_genre_id_4") Long l5, @TrimmedString @InterfaceC5065(name = "name") String str2, @ForceToList @InterfaceC5065(name = "series") List<Integer> list, @InterfaceC5065(name = "is_series") String str3, @ForceToString @InterfaceC5065(name = "screenshot_uri") String str4, @ForceToFloat @InterfaceC5065(name = "rating_imdb") Float f, @ForceToFloat @InterfaceC5065(name = "rating_kinopoisk") Float f2, @InterfaceC5065(name = "added") String str5, @InterfaceC5065(name = "year") String str6, @InterfaceC5065(name = "time") String str7, @InterfaceC5065(name = "genres_str") String str8, @InterfaceC5065(name = "actors") String str9, @InterfaceC5065(name = "director") String str10, @InterfaceC5065(name = "description") String str11, @InterfaceC5065(name = "cmd") String str12, @InterfaceC5065(name = "has_files") Integer num) {
        return new VodItem(str, l, l2, l3, l4, l5, str2, list, str3, str4, f, f2, str5, str6, str7, str8, str9, str10, str11, str12, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VodItem)) {
            return false;
        }
        VodItem vodItem = (VodItem) obj;
        return AbstractC1549.m5138(this.f2014, vodItem.f2014) && AbstractC1549.m5138(this.f1999, vodItem.f1999) && AbstractC1549.m5138(this.f2011, vodItem.f2011) && AbstractC1549.m5138(this.f2022, vodItem.f2022) && AbstractC1549.m5138(this.f2000, vodItem.f2000) && AbstractC1549.m5138(this.f2015, vodItem.f2015) && AbstractC1549.m5138(this.f2016, vodItem.f2016) && AbstractC1549.m5138(this.f2010, vodItem.f2010) && AbstractC1549.m5138(this.f2023, vodItem.f2023) && AbstractC1549.m5138(this.f2003, vodItem.f2003) && AbstractC1549.m5138(this.f2008, vodItem.f2008) && AbstractC1549.m5138(this.f2004, vodItem.f2004) && AbstractC1549.m5138(this.f2006, vodItem.f2006) && AbstractC1549.m5138(this.f2017, vodItem.f2017) && AbstractC1549.m5138(this.f2009, vodItem.f2009) && AbstractC1549.m5138(this.f2012, vodItem.f2012) && AbstractC1549.m5138(this.f2019, vodItem.f2019) && AbstractC1549.m5138(this.f2007, vodItem.f2007) && AbstractC1549.m5138(this.f2018, vodItem.f2018) && AbstractC1549.m5138(this.f2020, vodItem.f2020) && AbstractC1549.m5138(this.f2001, vodItem.f2001);
    }

    public final int hashCode() {
        int iHashCode = this.f2014.hashCode() * 31;
        Long l = this.f1999;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f2011;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f2022;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f2000;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f2015;
        int iHashCode6 = (iHashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.f2016;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f2010;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f2023;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2003;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.f2008;
        int iHashCode11 = (iHashCode10 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f2004;
        int iHashCode12 = (iHashCode11 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str4 = this.f2006;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2017;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f2009;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f2012;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f2019;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f2007;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f2018;
        int iHashCode19 = (iHashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f2020;
        int iHashCode20 = (iHashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.f2001;
        return iHashCode20 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "VodItem(id=" + this.f2014 + ", categoryId=" + this.f1999 + ", genreId1=" + this.f2011 + ", genreId2=" + this.f2022 + ", genreId3=" + this.f2000 + ", genreId4=" + this.f2015 + ", name=" + this.f2016 + ", episodes=" + this.f2010 + ", isSeriesStr=" + this.f2023 + ", screenshotUri=" + this.f2003 + ", ratingImdb=" + this.f2008 + ", ratingKinopoisk=" + this.f2004 + ", added=" + this.f2006 + ", releaseDate=" + this.f2017 + ", time=" + this.f2009 + ", genre=" + this.f2012 + ", actors=" + this.f2019 + ", director=" + this.f2007 + ", description=" + this.f2018 + ", cmd=" + this.f2020 + ", hasFiles=" + this.f2001 + ')';
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Long m1405() {
        return (Long) this.f2005.getValue();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m1406() {
        return ((Boolean) this.f2025.getValue()).booleanValue();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String m1407(String str) {
        String str2 = this.f2003;
        if (str2 != null) {
            return (AbstractC3139.m7726(str2) || AbstractC3629.m8560(str2, "data:image", false)) ? str2 : str.concat(str2);
        }
        return null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List m1408() {
        return this.f2010;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String m1409() {
        return (String) this.f2024.getValue();
    }
}
