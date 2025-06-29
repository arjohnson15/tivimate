package ar.tvplayer.core.data.api.stalker;

import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class StalkerTtv_TtvChannelJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1966;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1967;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1968 = C3759.m8745("id", "name", "enable_tv_archive", "tv_archive_duration");

    public StalkerTtv_TtvChannelJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f1966 = c5054.m11213(String.class, c1038, "id");
        this.f1967 = c5054.m11213(Integer.class, c1038, "enableArchive");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(43, "GeneratedJsonAdapter(StalkerTtv.TtvChannel)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1968);
            if (iMo11194 != -1) {
                AbstractC5044 abstractC5044 = this.f1966;
                if (iMo11194 == 0) {
                    str = (String) abstractC5044.mo1390(abstractC5050);
                    if (str == null) {
                        throw AbstractC2458.m6574("id", "id", abstractC5050);
                    }
                } else if (iMo11194 != 1) {
                    AbstractC5044 abstractC50442 = this.f1967;
                    if (iMo11194 == 2) {
                        num = (Integer) abstractC50442.mo1390(abstractC5050);
                    } else if (iMo11194 == 3) {
                        num2 = (Integer) abstractC50442.mo1390(abstractC5050);
                    }
                } else {
                    str2 = (String) abstractC5044.mo1390(abstractC5050);
                    if (str2 == null) {
                        throw AbstractC2458.m6574("name", "name", abstractC5050);
                    }
                }
            } else {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            }
        }
        abstractC5050.mo11198();
        if (str == null) {
            throw AbstractC2458.m6573("id", "id", abstractC5050);
        }
        if (str2 != null) {
            return new StalkerTtv$TtvChannel(str, str2, num, num2);
        }
        throw AbstractC2458.m6573("name", "name", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        StalkerTtv$TtvChannel stalkerTtv$TtvChannel = (StalkerTtv$TtvChannel) obj;
        if (stalkerTtv$TtvChannel == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("id");
        AbstractC5044 abstractC5044 = this.f1966;
        abstractC5044.mo1391(abstractC5048, stalkerTtv$TtvChannel.f1962);
        abstractC5048.mo11174("name");
        abstractC5044.mo1391(abstractC5048, stalkerTtv$TtvChannel.f1959);
        abstractC5048.mo11174("enable_tv_archive");
        AbstractC5044 abstractC50442 = this.f1967;
        abstractC50442.mo1391(abstractC5048, stalkerTtv$TtvChannel.f1961);
        abstractC5048.mo11174("tv_archive_duration");
        abstractC50442.mo1391(abstractC5048, stalkerTtv$TtvChannel.f1963);
        abstractC5048.mo11178();
    }
}
