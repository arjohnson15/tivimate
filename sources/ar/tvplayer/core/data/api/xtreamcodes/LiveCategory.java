package ar.tvplayer.core.data.api.xtreamcodes;

import ar.tvplayer.core.util.annotation.TrimmedString;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class LiveCategory {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2074;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f2075;

    public LiveCategory(@InterfaceC5065(name = "category_id") int i, @TrimmedString @InterfaceC5065(name = "category_name") String str) {
        this.f2075 = i;
        this.f2074 = str;
    }

    public final LiveCategory copy(@InterfaceC5065(name = "category_id") int i, @TrimmedString @InterfaceC5065(name = "category_name") String str) {
        return new LiveCategory(i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveCategory)) {
            return false;
        }
        LiveCategory liveCategory = (LiveCategory) obj;
        return this.f2075 == liveCategory.f2075 && AbstractC1549.m5138(this.f2074, liveCategory.f2074);
    }

    public final int hashCode() {
        int i = this.f2075 * 31;
        String str = this.f2074;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveCategory(id=");
        sb.append(this.f2075);
        sb.append(", name=");
        return ˉᵎ.ˑי(sb, this.f2074, ')');
    }
}
