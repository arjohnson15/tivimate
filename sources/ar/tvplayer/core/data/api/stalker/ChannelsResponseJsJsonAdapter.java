package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5047;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class ChannelsResponseJsJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1808;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1809 = C3759.m8745("data");

    public ChannelsResponseJsJsonAdapter(C5054 c5054) {
        this.f1808 = c5054.m11213(AbstractC5047.m11170(List.class, Channel.class), C1038.f4437, "channels");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(40, "GeneratedJsonAdapter(ChannelsResponseJs)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        List list = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1809);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0 && (list = (List) this.f1808.mo1390(abstractC5050)) == null) {
                throw AbstractC2458.m6574("channels", "data", abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (list != null) {
            return new ChannelsResponseJs(list);
        }
        throw AbstractC2458.m6573("channels", "data", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        ChannelsResponseJs channelsResponseJs = (ChannelsResponseJs) obj;
        if (channelsResponseJs == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("data");
        this.f1808.mo1391(abstractC5048, channelsResponseJs.f1807);
        abstractC5048.mo11178();
    }
}
