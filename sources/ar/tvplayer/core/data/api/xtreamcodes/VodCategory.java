package ar.tvplayer.core.data.api.xtreamcodes;

import ar.tvplayer.core.util.annotation.TrimmedString;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class VodCategory {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2151;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f2152;

    public VodCategory(@InterfaceC5065(name = "category_id") int i, @TrimmedString @InterfaceC5065(name = "category_name") String str) {
        this.f2152 = i;
        this.f2151 = str;
    }

    public final VodCategory copy(@InterfaceC5065(name = "category_id") int i, @TrimmedString @InterfaceC5065(name = "category_name") String str) {
        return new VodCategory(i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VodCategory)) {
            return false;
        }
        VodCategory vodCategory = (VodCategory) obj;
        return this.f2152 == vodCategory.f2152 && AbstractC1549.m5138(this.f2151, vodCategory.f2151);
    }

    public final int hashCode() {
        int i = this.f2152 * 31;
        String str = this.f2151;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VodCategory(id=");
        sb.append(this.f2152);
        sb.append(", name=");
        return ˉᵎ.ˑי(sb, this.f2151, ')');
    }
}
