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
public final class EpgForChannelResponseJsJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1822;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1823 = C3759.m8745("data");

    public EpgForChannelResponseJsJsonAdapter(C5054 c5054) {
        this.f1822 = c5054.m11213(AbstractC5047.m11170(List.class, ProgramForChannel.class), C1038.f4437, "programs");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(45, "GeneratedJsonAdapter(EpgForChannelResponseJs)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        List list = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1823);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0 && (list = (List) this.f1822.mo1390(abstractC5050)) == null) {
                throw AbstractC2458.m6574("programs", "data", abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (list != null) {
            return new EpgForChannelResponseJs(list);
        }
        throw AbstractC2458.m6573("programs", "data", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        EpgForChannelResponseJs epgForChannelResponseJs = (EpgForChannelResponseJs) obj;
        if (epgForChannelResponseJs == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("data");
        this.f1822.mo1391(abstractC5048, epgForChannelResponseJs.f1821);
        abstractC5048.mo11178();
    }
}
