package ar.tvplayer.core.data.api.xtreamcodes;

import java.util.Collections;
import p013.C1038;
import p169.AbstractC2458;
import p331.C3759;
import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;
import p435.C5054;
import ʾʾ.ﹳﹳ;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class LiveCategoryJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f2076;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f2077;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f2078 = C3759.m8745("category_id", "category_name");

    public LiveCategoryJsonAdapter(C5054 c5054) {
        this.f2076 = c5054.m11213(Integer.TYPE, C1038.f4437, "id");
        this.f2077 = c5054.m11213(String.class, Collections.singleton(new ﹳﹳ(1)), "name");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(34, "GeneratedJsonAdapter(LiveCategory)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        Integer num = null;
        String str = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f2078);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                num = (Integer) this.f2076.mo1390(abstractC5050);
                if (num == null) {
                    throw AbstractC2458.m6574("id", "category_id", abstractC5050);
                }
            } else if (iMo11194 == 1) {
                str = (String) this.f2077.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (num != null) {
            return new LiveCategory(num.intValue(), str);
        }
        throw AbstractC2458.m6573("id", "category_id", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        LiveCategory liveCategory = (LiveCategory) obj;
        if (liveCategory == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("category_id");
        this.f2076.mo1391(abstractC5048, Integer.valueOf(liveCategory.f2075));
        abstractC5048.mo11174("category_name");
        this.f2077.mo1391(abstractC5048, liveCategory.f2074);
        abstractC5048.mo11178();
    }
}
