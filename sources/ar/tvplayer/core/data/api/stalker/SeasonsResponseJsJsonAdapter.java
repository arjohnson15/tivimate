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
public final class SeasonsResponseJsJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1934;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1935;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1936 = C3759.m8745("total_items", "data");

    public SeasonsResponseJsJsonAdapter(C5054 c5054) {
        Class cls = Integer.TYPE;
        C1038 c1038 = C1038.f4437;
        this.f1934 = c5054.m11213(cls, c1038, "itemCount");
        this.f1935 = c5054.m11213(AbstractC5047.m11170(List.class, Season.class), c1038, "seasons");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(39, "GeneratedJsonAdapter(SeasonsResponseJs)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        Integer num = null;
        List list = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1936);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                num = (Integer) this.f1934.mo1390(abstractC5050);
                if (num == null) {
                    throw AbstractC2458.m6574("itemCount", "total_items", abstractC5050);
                }
            } else if (iMo11194 == 1 && (list = (List) this.f1935.mo1390(abstractC5050)) == null) {
                throw AbstractC2458.m6574("seasons", "data", abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (num == null) {
            throw AbstractC2458.m6573("itemCount", "total_items", abstractC5050);
        }
        int iIntValue = num.intValue();
        if (list != null) {
            return new SeasonsResponseJs(iIntValue, list);
        }
        throw AbstractC2458.m6573("seasons", "data", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        SeasonsResponseJs seasonsResponseJs = (SeasonsResponseJs) obj;
        if (seasonsResponseJs == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("total_items");
        this.f1934.mo1391(abstractC5048, Integer.valueOf(seasonsResponseJs.f1933));
        abstractC5048.mo11174("data");
        this.f1935.mo1391(abstractC5048, seasonsResponseJs.f1932);
        abstractC5048.mo11178();
    }
}
