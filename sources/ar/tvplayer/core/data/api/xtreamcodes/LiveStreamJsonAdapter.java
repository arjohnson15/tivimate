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
import ʾʾ.ˏᵢ;
import ʾʾ.ﹳﹳ;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class LiveStreamJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2086;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC5044 f2087;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2088;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2089 = C3759.m8745("stream_id", "name", "stream_icon", "category_id", "epg_channel_id", "tv_archive_duration");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public volatile Constructor f2090;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f2091;

    public LiveStreamJsonAdapter(C5054 c5054) {
        Class cls = Integer.TYPE;
        C1038 c1038 = C1038.f4437;
        this.f2086 = c5054.m11213(cls, c1038, "id");
        this.f2088 = c5054.m11213(String.class, Collections.singleton(new ﹳﹳ(2)), "name");
        this.f2091 = c5054.m11213(String.class, c1038, "icon");
        this.f2087 = c5054.m11213(cls, Collections.singleton(new ˏᵢ(0)), "categoryId");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(32, "GeneratedJsonAdapter(LiveStream)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) throws NoSuchMethodException, SecurityException {
        Integer num = 0;
        abstractC5050.mo11185();
        Integer num2 = num;
        int i = -1;
        Integer num3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (abstractC5050.mo11191()) {
            switch (abstractC5050.mo11194(this.f2089)) {
                case -1:
                    abstractC5050.mo11197();
                    abstractC5050.mo11184();
                    break;
                case 0:
                    num3 = (Integer) this.f2086.mo1390(abstractC5050);
                    if (num3 == null) {
                        throw AbstractC2458.m6574("id", "stream_id", abstractC5050);
                    }
                    break;
                case 1:
                    str = (String) this.f2088.mo1390(abstractC5050);
                    break;
                case 2:
                    str2 = (String) this.f2091.mo1390(abstractC5050);
                    break;
                case 3:
                    num = (Integer) this.f2087.mo1390(abstractC5050);
                    if (num == null) {
                        throw AbstractC2458.m6574("categoryId", "category_id", abstractC5050);
                    }
                    i &= -9;
                    break;
                case 4:
                    str3 = (String) this.f2091.mo1390(abstractC5050);
                    break;
                case 5:
                    num2 = (Integer) this.f2087.mo1390(abstractC5050);
                    if (num2 == null) {
                        throw AbstractC2458.m6574("archiveDurationDays", "tv_archive_duration", abstractC5050);
                    }
                    i &= -33;
                    break;
            }
        }
        abstractC5050.mo11198();
        if (i == -41) {
            if (num3 != null) {
                return new LiveStream(num3.intValue(), str, str2, num.intValue(), str3, num2.intValue());
            }
            throw AbstractC2458.m6573("id", "stream_id", abstractC5050);
        }
        Constructor declaredConstructor = this.f2090;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = LiveStream.class.getDeclaredConstructor(cls, String.class, String.class, cls, String.class, cls, cls, AbstractC2458.f9786);
            this.f2090 = declaredConstructor;
        }
        if (num3 != null) {
            return (LiveStream) declaredConstructor.newInstance(num3, str, str2, num, str3, num2, Integer.valueOf(i), null);
        }
        throw AbstractC2458.m6573("id", "stream_id", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        LiveStream liveStream = (LiveStream) obj;
        if (liveStream == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("stream_id");
        this.f2086.mo1391(abstractC5048, Integer.valueOf(liveStream.f2083));
        abstractC5048.mo11174("name");
        this.f2088.mo1391(abstractC5048, liveStream.f2080);
        abstractC5048.mo11174("stream_icon");
        AbstractC5044 abstractC5044 = this.f2091;
        abstractC5044.mo1391(abstractC5048, liveStream.f2082);
        abstractC5048.mo11174("category_id");
        Integer numValueOf = Integer.valueOf(liveStream.f2085);
        AbstractC5044 abstractC50442 = this.f2087;
        abstractC50442.mo1391(abstractC5048, numValueOf);
        abstractC5048.mo11174("epg_channel_id");
        abstractC5044.mo1391(abstractC5048, liveStream.f2081);
        abstractC5048.mo11174("tv_archive_duration");
        abstractC50442.mo1391(abstractC5048, Integer.valueOf(liveStream.f2084));
        abstractC5048.mo11178();
    }
}
