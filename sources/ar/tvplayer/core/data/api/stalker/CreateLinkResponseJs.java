package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class CreateLinkResponseJs {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f1813;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f1814;

    public CreateLinkResponseJs(@InterfaceC5065(name = "cmd") String str, @InterfaceC5065(name = "error") String str2) {
        this.f1814 = str;
        this.f1813 = str2;
    }

    public final CreateLinkResponseJs copy(@InterfaceC5065(name = "cmd") String str, @InterfaceC5065(name = "error") String str2) {
        return new CreateLinkResponseJs(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateLinkResponseJs)) {
            return false;
        }
        CreateLinkResponseJs createLinkResponseJs = (CreateLinkResponseJs) obj;
        return AbstractC1549.m5138(this.f1814, createLinkResponseJs.f1814) && AbstractC1549.m5138(this.f1813, createLinkResponseJs.f1813);
    }

    public final int hashCode() {
        int iHashCode = this.f1814.hashCode() * 31;
        String str = this.f1813;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateLinkResponseJs(url=");
        sb.append(this.f1814);
        sb.append(", error=");
        return ˉᵎ.ˑי(sb, this.f1813, ')');
    }
}
