package ar.tvplayer.core.data.api.xtreamcodes;

import ar.tvplayer.core.util.annotation.TrimmedString;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class SeriesCategory {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2102;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f2103;

    public SeriesCategory(@InterfaceC5065(name = "category_id") int i, @TrimmedString @InterfaceC5065(name = "category_name") String str) {
        this.f2103 = i;
        this.f2102 = str;
    }

    public final SeriesCategory copy(@InterfaceC5065(name = "category_id") int i, @TrimmedString @InterfaceC5065(name = "category_name") String str) {
        return new SeriesCategory(i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesCategory)) {
            return false;
        }
        SeriesCategory seriesCategory = (SeriesCategory) obj;
        return this.f2103 == seriesCategory.f2103 && AbstractC1549.m5138(this.f2102, seriesCategory.f2102);
    }

    public final int hashCode() {
        int i = this.f2103 * 31;
        String str = this.f2102;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeriesCategory(id=");
        sb.append(this.f2103);
        sb.append(", name=");
        return ˉᵎ.ˑי(sb, this.f2102, ')');
    }
}
