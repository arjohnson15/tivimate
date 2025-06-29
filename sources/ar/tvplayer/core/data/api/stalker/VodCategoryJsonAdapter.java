package ar.tvplayer.core.data.api.stalker;

import java.util.Collections;
import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ـˈ.ˉᵎ;
import ٴⁱ.ʽᐧ;

/* loaded from: classes.dex */
public final class VodCategoryJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1985;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1986;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1987 = C3759.m8745("id", "title", "alias");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f1988;

    public VodCategoryJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f1985 = c5054.m11213(String.class, c1038, "id");
        this.f1986 = c5054.m11213(String.class, Collections.singleton(new ʽᐧ(2)), "title");
        this.f1988 = c5054.m11213(String.class, c1038, "alias");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(33, "GeneratedJsonAdapter(VodCategory)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1987);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                str = (String) this.f1985.mo1390(abstractC5050);
                if (str == null) {
                    throw AbstractC2458.m6574("id", "id", abstractC5050);
                }
            } else if (iMo11194 == 1) {
                str2 = (String) this.f1986.mo1390(abstractC5050);
            } else if (iMo11194 == 2) {
                str3 = (String) this.f1988.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (str != null) {
            return new VodCategory(str, str2, str3);
        }
        throw AbstractC2458.m6573("id", "id", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        VodCategory vodCategory = (VodCategory) obj;
        if (vodCategory == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("id");
        this.f1985.mo1391(abstractC5048, vodCategory.f1983);
        abstractC5048.mo11174("title");
        this.f1986.mo1391(abstractC5048, vodCategory.f1980);
        abstractC5048.mo11174("alias");
        this.f1988.mo1391(abstractC5048, vodCategory.f1982);
        abstractC5048.mo11178();
    }
}
