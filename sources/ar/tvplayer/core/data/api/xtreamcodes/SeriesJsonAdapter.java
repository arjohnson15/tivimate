package ar.tvplayer.core.data.api.xtreamcodes;

import java.lang.reflect.Constructor;
import java.util.Collections;
import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ʾʾ.ˉⁱ;
import ʾʾ.ˋⁱ;
import ʾʾ.ˏᵢ;
import ʾʾ.ﹳﹳ;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class SeriesJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2127;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC5044 f2128;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public volatile Constructor f2129;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2130;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2131 = C3759.m8745("series_id", "name", "cover", "category_id", "rating", "last_modified");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final AbstractC5044 f2132;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final AbstractC5044 f2133;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f2134;

    public SeriesJsonAdapter(C5054 c5054) {
        Class cls = Integer.TYPE;
        C1038 c1038 = C1038.f4437;
        this.f2127 = c5054.m11213(cls, c1038, "id");
        this.f2130 = c5054.m11213(String.class, Collections.singleton(new ﹳﹳ(4)), "name");
        this.f2134 = c5054.m11213(String.class, c1038, "cover");
        this.f2128 = c5054.m11213(cls, Collections.singleton(new ˏᵢ(1)), "categoryId");
        this.f2132 = c5054.m11213(Float.TYPE, Collections.singleton(new ˉⁱ(0)), "rating");
        this.f2133 = c5054.m11213(Long.TYPE, Collections.singleton(new ˋⁱ(0)), "lastModifiedTime");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(28, "GeneratedJsonAdapter(Series)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) throws NoSuchMethodException, SecurityException {
        Integer num = 0;
        Float fValueOf = Float.valueOf(0.0f);
        Long l = 0L;
        abstractC5050.mo11185();
        int i = -1;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        while (abstractC5050.mo11191()) {
            switch (abstractC5050.mo11194(this.f2131)) {
                case -1:
                    abstractC5050.mo11197();
                    abstractC5050.mo11184();
                    break;
                case 0:
                    num2 = (Integer) this.f2127.mo1390(abstractC5050);
                    if (num2 == null) {
                        throw AbstractC2458.m6574("id", "series_id", abstractC5050);
                    }
                    break;
                case 1:
                    str = (String) this.f2130.mo1390(abstractC5050);
                    break;
                case 2:
                    str2 = (String) this.f2134.mo1390(abstractC5050);
                    break;
                case 3:
                    num = (Integer) this.f2128.mo1390(abstractC5050);
                    if (num == null) {
                        throw AbstractC2458.m6574("categoryId", "category_id", abstractC5050);
                    }
                    i &= -9;
                    break;
                case 4:
                    fValueOf = (Float) this.f2132.mo1390(abstractC5050);
                    if (fValueOf == null) {
                        throw AbstractC2458.m6574("rating", "rating", abstractC5050);
                    }
                    i &= -17;
                    break;
                case 5:
                    l = (Long) this.f2133.mo1390(abstractC5050);
                    if (l == null) {
                        throw AbstractC2458.m6574("lastModifiedTime", "last_modified", abstractC5050);
                    }
                    i &= -33;
                    break;
            }
        }
        abstractC5050.mo11198();
        if (i == -57) {
            if (num2 != null) {
                return new Series(num2.intValue(), str, str2, num.intValue(), fValueOf.floatValue(), l.longValue());
            }
            throw AbstractC2458.m6573("id", "series_id", abstractC5050);
        }
        Constructor declaredConstructor = this.f2129;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = Series.class.getDeclaredConstructor(cls, String.class, String.class, cls, Float.TYPE, Long.TYPE, cls, AbstractC2458.f9786);
            this.f2129 = declaredConstructor;
        }
        if (num2 != null) {
            return (Series) declaredConstructor.newInstance(num2, str, str2, num, fValueOf, l, Integer.valueOf(i), null);
        }
        throw AbstractC2458.m6573("id", "series_id", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        Series series = (Series) obj;
        if (series == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("series_id");
        this.f2127.mo1391(abstractC5048, Integer.valueOf(series.f2099));
        abstractC5048.mo11174("name");
        this.f2130.mo1391(abstractC5048, series.f2096);
        abstractC5048.mo11174("cover");
        this.f2134.mo1391(abstractC5048, series.f2098);
        abstractC5048.mo11174("category_id");
        this.f2128.mo1391(abstractC5048, Integer.valueOf(series.f2101));
        abstractC5048.mo11174("rating");
        this.f2132.mo1391(abstractC5048, Float.valueOf(series.f2097));
        abstractC5048.mo11174("last_modified");
        this.f2133.mo1391(abstractC5048, Long.valueOf(series.f2100));
        abstractC5048.mo11178();
    }
}
