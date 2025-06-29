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
public final class GenreJsonAdapter extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f1873;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f1874;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3759 f1875 = C3759.m8745("id", "title", "censored");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f1876;

    public GenreJsonAdapter(C5054 c5054) {
        C1038 c1038 = C1038.f4437;
        this.f1873 = c5054.m11213(String.class, c1038, "id");
        this.f1874 = c5054.m11213(String.class, Collections.singleton(new ʽᐧ(1)), "title");
        this.f1876 = c5054.m11213(Integer.class, c1038, "isCensored");
    }

    public final String toString() {
        return ˉᵎ.ˏʾ(27, "GeneratedJsonAdapter(Genre)");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        abstractC5050.mo11185();
        String str = null;
        String str2 = null;
        Integer num = null;
        while (abstractC5050.mo11191()) {
            int iMo11194 = abstractC5050.mo11194(this.f1875);
            if (iMo11194 == -1) {
                abstractC5050.mo11197();
                abstractC5050.mo11184();
            } else if (iMo11194 == 0) {
                str = (String) this.f1873.mo1390(abstractC5050);
                if (str == null) {
                    throw AbstractC2458.m6574("id", "id", abstractC5050);
                }
            } else if (iMo11194 == 1) {
                str2 = (String) this.f1874.mo1390(abstractC5050);
            } else if (iMo11194 == 2) {
                num = (Integer) this.f1876.mo1390(abstractC5050);
            }
        }
        abstractC5050.mo11198();
        if (str != null) {
            return new Genre(str, str2, num);
        }
        throw AbstractC2458.m6573("id", "id", abstractC5050);
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        Genre genre = (Genre) obj;
        if (genre == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC5048.mo11173();
        abstractC5048.mo11174("id");
        this.f1873.mo1391(abstractC5048, genre.f1871);
        abstractC5048.mo11174("title");
        this.f1874.mo1391(abstractC5048, genre.f1869);
        abstractC5048.mo11174("censored");
        this.f1876.mo1391(abstractC5048, genre.f1870);
        abstractC5048.mo11178();
    }
}
