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
public final class VodItemsResponseJsJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2039;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2040;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2041 = C3759.m8745("total_items", "data");

    public VodItemsResponseJsJsonAdapter(C5054 c5054) {
        Class cls = Integer.TYPE;
        C1038 c1038 = C1038.f4437;
        this.f2039 = c5054.m11213(cls, c1038, "itemCount");
        this.f2040 = c5054.m11213(AbstractC5047.m11170(List.class, VodItem.class), c1038, "items");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(40, "GeneratedJsonAdapter(VodItemsResponseJs)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        Integer num = null;
        List list = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2041);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                num = (Integer) this.f2039.mo1390(abstractC5050);
                if (num == null) {
                    throw AbstractC2458.m6574("itemCount", "total_items", abstractC5050);
                }
            } else if (iMo11194 == 1 && (list = (List) this.f2040.mo1390(abstractC5050)) == null) {
                throw AbstractC2458.m6574("items", "data", abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (num == null) {
            throw AbstractC2458.m6573("itemCount", "total_items", abstractC5050);
        }
        int iIntValue = num.intValue();
        if (list != null) {
            return new VodItemsResponseJs(iIntValue, list);
        }
        throw AbstractC2458.m6573("items", "data", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        VodItemsResponseJs vodItemsResponseJs = (VodItemsResponseJs) obj;
        if (vodItemsResponseJs == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("total_items");
        this.f2039.mo1391(abstractC5048, Integer.valueOf(vodItemsResponseJs.f2038));
        abstractC5048.mo11174("data");
        this.f2040.mo1391(abstractC5048, vodItemsResponseJs.f2036);
        abstractC5048.mo11178();
    }
}
