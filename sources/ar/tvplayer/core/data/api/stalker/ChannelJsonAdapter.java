package ar.tvplayer.core.data.api.stalker;

import java.lang.reflect.Constructor;
import java.util.Collections;
import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p334.C3789;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;
import ٴⁱ.ʽᐧ;
import ٴⁱ.ـﹶ;

/* loaded from: classes.dex */
public final class ChannelJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1800;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC5044 f1801;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1802;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1803 = C3759.m8745("id", "name", "cmd", "tv_genre_id", "xmltv_id", "logo", "enable_tv_archive", "tv_archive_duration");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public volatile Constructor f1804;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f1805;

    public ChannelJsonAdapter(C5054 c5054) {
        Class cls = Long.TYPE;
        C1038 c1038 = C1038.f4437;
        this.f1800 = c5054.m11213(cls, c1038, "id");
        this.f1802 = c5054.m11213(String.class, Collections.singleton(new ʽᐧ(0)), "name");
        this.f1805 = c5054.m11213(String.class, c1038, "cmd");
        this.f1801 = c5054.m11213(Integer.TYPE, Collections.singleton(new ـﹶ()), "enableArchive");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(29, "GeneratedJsonAdapter(Channel)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) throws NoSuchMethodException, SecurityException {
        Integer num = 0;
        abstractC5050.mo11185();
        Integer num2 = num;
        int i = -1;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (abstractC5050.mo11191()) {
            switch (abstractC5050.mo11194(this.f1803)) {
                case -1:
                    abstractC5050.mo11197();
                    abstractC5050.mo11184();
                    break;
                case 0:
                    l = (Long) this.f1800.mo1390(abstractC5050);
                    if (l == null) {
                        throw AbstractC2458.m6574("id", "id", abstractC5050);
                    }
                    break;
                case 1:
                    str = (String) this.f1802.mo1390(abstractC5050);
                    break;
                case 2:
                    str2 = (String) this.f1805.mo1390(abstractC5050);
                    break;
                case 3:
                    str3 = (String) this.f1805.mo1390(abstractC5050);
                    break;
                case 4:
                    str4 = (String) this.f1805.mo1390(abstractC5050);
                    break;
                case 5:
                    str5 = (String) this.f1805.mo1390(abstractC5050);
                    break;
                case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                    num = (Integer) this.f1801.mo1390(abstractC5050);
                    if (num == null) {
                        throw AbstractC2458.m6574("enableArchive", "enable_tv_archive", abstractC5050);
                    }
                    i &= -65;
                    break;
                case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                    num2 = (Integer) this.f1801.mo1390(abstractC5050);
                    if (num2 == null) {
                        throw AbstractC2458.m6574("archiveDuration", "tv_archive_duration", abstractC5050);
                    }
                    i &= -129;
                    break;
            }
        }
        abstractC5050.mo11198();
        if (i == -193) {
            if (l != null) {
                return new Channel(l.longValue(), str, str2, str3, str4, str5, num.intValue(), num2.intValue());
            }
            throw AbstractC2458.m6573("id", "id", abstractC5050);
        }
        Constructor declaredConstructor = this.f1804;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = Channel.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, String.class, String.class, String.class, cls, cls, cls, AbstractC2458.f9786);
            this.f1804 = declaredConstructor;
        }
        if (l != null) {
            return (Channel) declaredConstructor.newInstance(l, str, str2, str3, str4, str5, num, num2, Integer.valueOf(i), null);
        }
        throw AbstractC2458.m6573("id", "id", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        Channel channel = (Channel) obj;
        if (channel == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("id");
        this.f1800.mo1391(abstractC5048, Long.valueOf(channel.f1795));
        abstractC5048.mo11174("name");
        this.f1802.mo1391(abstractC5048, channel.f1791);
        abstractC5048.mo11174("cmd");
        AbstractC5044 abstractC5044 = this.f1805;
        abstractC5044.mo1391(abstractC5048, channel.f1794);
        abstractC5048.mo11174("tv_genre_id");
        abstractC5044.mo1391(abstractC5048, channel.f1798);
        abstractC5048.mo11174("xmltv_id");
        abstractC5044.mo1391(abstractC5048, channel.f1792);
        abstractC5048.mo11174("logo");
        abstractC5044.mo1391(abstractC5048, channel.f1796);
        abstractC5048.mo11174("enable_tv_archive");
        Integer numValueOf = Integer.valueOf(channel.f1797);
        AbstractC5044 abstractC50442 = this.f1801;
        abstractC50442.mo1391(abstractC5048, numValueOf);
        abstractC5048.mo11174("tv_archive_duration");
        abstractC50442.mo1391(abstractC5048, Integer.valueOf(channel.f1793));
        abstractC5048.mo11178();
    }
}
