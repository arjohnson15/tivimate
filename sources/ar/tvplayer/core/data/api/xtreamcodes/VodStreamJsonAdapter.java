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
public final class VodStreamJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2185;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC5044 f2186;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public volatile Constructor f2187;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2188;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2189 = C3759.m8745("stream_id", "name", "stream_icon", "category_id", "rating", "added");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final AbstractC5044 f2190;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final AbstractC5044 f2191;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f2192;

    public VodStreamJsonAdapter(C5054 c5054) {
        Class cls = Integer.TYPE;
        C1038 c1038 = C1038.f4437;
        this.f2185 = c5054.m11213(cls, c1038, "id");
        this.f2188 = c5054.m11213(String.class, Collections.singleton(new ﹳﹳ(6)), "name");
        this.f2192 = c5054.m11213(String.class, c1038, "icon");
        this.f2186 = c5054.m11213(cls, Collections.singleton(new ˏᵢ(2)), "categoryId");
        this.f2190 = c5054.m11213(Float.TYPE, Collections.singleton(new ˉⁱ(1)), "rating");
        this.f2191 = c5054.m11213(Long.TYPE, Collections.singleton(new ˋⁱ(1)), "addedTime");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(31, "GeneratedJsonAdapter(VodStream)");
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
            switch (abstractC5050.mo11194(this.f2189)) {
                case -1:
                    abstractC5050.mo11197();
                    abstractC5050.mo11184();
                    break;
                case 0:
                    num2 = (Integer) this.f2185.mo1390(abstractC5050);
                    if (num2 == null) {
                        throw AbstractC2458.m6574("id", "stream_id", abstractC5050);
                    }
                    break;
                case 1:
                    str = (String) this.f2188.mo1390(abstractC5050);
                    break;
                case 2:
                    str2 = (String) this.f2192.mo1390(abstractC5050);
                    break;
                case 3:
                    num = (Integer) this.f2186.mo1390(abstractC5050);
                    if (num == null) {
                        throw AbstractC2458.m6574("categoryId", "category_id", abstractC5050);
                    }
                    i &= -9;
                    break;
                case 4:
                    fValueOf = (Float) this.f2190.mo1390(abstractC5050);
                    if (fValueOf == null) {
                        throw AbstractC2458.m6574("rating", "rating", abstractC5050);
                    }
                    i &= -17;
                    break;
                case 5:
                    l = (Long) this.f2191.mo1390(abstractC5050);
                    if (l == null) {
                        throw AbstractC2458.m6574("addedTime", "added", abstractC5050);
                    }
                    i &= -33;
                    break;
            }
        }
        abstractC5050.mo11198();
        if (i == -57) {
            if (num2 != null) {
                return new VodStream(num2.intValue(), str, str2, num.intValue(), fValueOf.floatValue(), l.longValue());
            }
            throw AbstractC2458.m6573("id", "stream_id", abstractC5050);
        }
        Constructor declaredConstructor = this.f2187;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = VodStream.class.getDeclaredConstructor(cls, String.class, String.class, cls, Float.TYPE, Long.TYPE, cls, AbstractC2458.f9786);
            this.f2187 = declaredConstructor;
        }
        if (num2 != null) {
            return (VodStream) declaredConstructor.newInstance(num2, str, str2, num, fValueOf, l, Integer.valueOf(i), null);
        }
        throw AbstractC2458.m6573("id", "stream_id", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        VodStream vodStream = (VodStream) obj;
        if (vodStream == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("stream_id");
        this.f2185.mo1391(abstractC5048, Integer.valueOf(vodStream.f2182));
        abstractC5048.mo11174("name");
        this.f2188.mo1391(abstractC5048, vodStream.f2179);
        abstractC5048.mo11174("stream_icon");
        this.f2192.mo1391(abstractC5048, vodStream.f2181);
        abstractC5048.mo11174("category_id");
        this.f2186.mo1391(abstractC5048, Integer.valueOf(vodStream.f2184));
        abstractC5048.mo11174("rating");
        this.f2190.mo1391(abstractC5048, Float.valueOf(vodStream.f2180));
        abstractC5048.mo11174("added");
        this.f2191.mo1391(abstractC5048, Long.valueOf(vodStream.f2183));
        abstractC5048.mo11178();
    }
}
