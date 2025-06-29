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
public final class StalkerTtv_TtvJsJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1969;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1970 = C3759.m8745("data");

    public StalkerTtv_TtvJsJsonAdapter(C5054 c5054) {
        this.f1969 = c5054.m11213(AbstractC5047.m11170(List.class, StalkerTtv$TtvChannel.class), C1038.f4437, "data");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(38, "GeneratedJsonAdapter(StalkerTtv.TtvJs)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        List list = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1970);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0 && (list = (List) this.f1969.mo1390(abstractC5050)) == null) {
                throw AbstractC2458.m6574("data_", "data", abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (list != null) {
            return new StalkerTtv$TtvJs(list);
        }
        throw AbstractC2458.m6573("data_", "data", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        StalkerTtv$TtvJs stalkerTtv$TtvJs = (StalkerTtv$TtvJs) obj;
        if (stalkerTtv$TtvJs == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("data");
        this.f1969.mo1391(abstractC5048, stalkerTtv$TtvJs.f1964);
        abstractC5048.mo11178();
    }
}
