package ar.tvplayer.core.data.api.stalker;

import ar.tvplayer.core.util.annotation.TrimmedString;
import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ᵔˊ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class Genre {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f1869;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Integer f1870;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f1871;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final transient C3406 f1872 = new C3406(new ᵔˊ(15, this));

    public Genre(@InterfaceC5065(name = "id") String str, @TrimmedString @InterfaceC5065(name = "title") String str2, @InterfaceC5065(name = "censored") Integer num) {
        this.f1871 = str;
        this.f1869 = str2;
        this.f1870 = num;
    }

    public final Genre copy(@InterfaceC5065(name = "id") String str, @TrimmedString @InterfaceC5065(name = "title") String str2, @InterfaceC5065(name = "censored") Integer num) {
        return new Genre(str, str2, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Genre)) {
            return false;
        }
        Genre genre = (Genre) obj;
        return AbstractC1549.m5138(this.f1871, genre.f1871) && AbstractC1549.m5138(this.f1869, genre.f1869) && AbstractC1549.m5138(this.f1870, genre.f1870);
    }

    public final int hashCode() {
        int iHashCode = this.f1871.hashCode() * 31;
        String str = this.f1869;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f1870;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Genre(id=" + this.f1871 + ", title=" + this.f1869 + ", isCensored=" + this.f1870 + ')';
    }
}
