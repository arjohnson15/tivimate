package ar.tvplayer.core.data.api.stalker;

import ar.tvplayer.core.util.annotation.TrimmedString;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class VodGenre {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f1989;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f1990;

    public VodGenre(@InterfaceC5065(name = "id") String str, @TrimmedString @InterfaceC5065(name = "title") String str2) {
        this.f1990 = str;
        this.f1989 = str2;
    }

    public final VodGenre copy(@InterfaceC5065(name = "id") String str, @TrimmedString @InterfaceC5065(name = "title") String str2) {
        return new VodGenre(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VodGenre)) {
            return false;
        }
        VodGenre vodGenre = (VodGenre) obj;
        return AbstractC1549.m5138(this.f1990, vodGenre.f1990) && AbstractC1549.m5138(this.f1989, vodGenre.f1989);
    }

    public final int hashCode() {
        int iHashCode = this.f1990.hashCode() * 31;
        String str = this.f1989;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VodGenre(id=");
        sb.append(this.f1990);
        sb.append(", title=");
        return ˉᵎ.ˑי(sb, this.f1989, ')');
    }
}
