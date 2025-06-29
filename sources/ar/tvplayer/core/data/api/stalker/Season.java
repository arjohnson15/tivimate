package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;
import ٴⁱ.ʿʼ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class Season {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Integer f1919;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f1920;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Integer f1921;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f1922;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final transient C3406 f1923 = new C3406(new ʿʼ(this, 0));

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final transient C3406 f1924 = new C3406(new ʿʼ(this, 1));

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final List f1925;

    public Season(@InterfaceC5065(name = "id") String str, @InterfaceC5065(name = "season_number") Integer num, @InterfaceC5065(name = "season_series") Integer num2, @InterfaceC5065(name = "series") List<Integer> list, @InterfaceC5065(name = "cmd") String str2) {
        this.f1922 = str;
        this.f1919 = num;
        this.f1921 = num2;
        this.f1925 = list;
        this.f1920 = str2;
    }

    public final Season copy(@InterfaceC5065(name = "id") String str, @InterfaceC5065(name = "season_number") Integer num, @InterfaceC5065(name = "season_series") Integer num2, @InterfaceC5065(name = "series") List<Integer> list, @InterfaceC5065(name = "cmd") String str2) {
        return new Season(str, num, num2, list, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Season)) {
            return false;
        }
        Season season = (Season) obj;
        return AbstractC1549.m5138(this.f1922, season.f1922) && AbstractC1549.m5138(this.f1919, season.f1919) && AbstractC1549.m5138(this.f1921, season.f1921) && AbstractC1549.m5138(this.f1925, season.f1925) && AbstractC1549.m5138(this.f1920, season.f1920);
    }

    public final int hashCode() {
        int iHashCode = this.f1922.hashCode() * 31;
        Integer num = this.f1919;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f1921;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.f1925;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f1920;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Season(id=");
        sb.append(this.f1922);
        sb.append(", seasonNumber=");
        sb.append(this.f1919);
        sb.append(", episodeCountRaw=");
        sb.append(this.f1921);
        sb.append(", episodeNumbers=");
        sb.append(this.f1925);
        sb.append(", cmd=");
        return ˉᵎ.ˑי(sb, this.f1920, ')');
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m1394() {
        return ((Number) this.f1923.getValue()).intValue();
    }
}
