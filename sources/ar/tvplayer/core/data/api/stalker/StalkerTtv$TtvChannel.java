package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ˆʽ.ᵎˏ;
import ـˈ.ᵔˊ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class StalkerTtv$TtvChannel {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f1959;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final transient C3406 f1960 = new C3406(new ᵔˊ(18, this));

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Integer f1961;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f1962;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Integer f1963;

    public StalkerTtv$TtvChannel(@InterfaceC5065(name = "id") String str, @InterfaceC5065(name = "name") String str2, @InterfaceC5065(name = "enable_tv_archive") Integer num, @InterfaceC5065(name = "tv_archive_duration") Integer num2) {
        this.f1962 = str;
        this.f1959 = str2;
        this.f1961 = num;
        this.f1963 = num2;
    }

    public final StalkerTtv$TtvChannel copy(@InterfaceC5065(name = "id") String str, @InterfaceC5065(name = "name") String str2, @InterfaceC5065(name = "enable_tv_archive") Integer num, @InterfaceC5065(name = "tv_archive_duration") Integer num2) {
        return new StalkerTtv$TtvChannel(str, str2, num, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StalkerTtv$TtvChannel)) {
            return false;
        }
        StalkerTtv$TtvChannel stalkerTtv$TtvChannel = (StalkerTtv$TtvChannel) obj;
        return AbstractC1549.m5138(this.f1962, stalkerTtv$TtvChannel.f1962) && AbstractC1549.m5138(this.f1959, stalkerTtv$TtvChannel.f1959) && AbstractC1549.m5138(this.f1961, stalkerTtv$TtvChannel.f1961) && AbstractC1549.m5138(this.f1963, stalkerTtv$TtvChannel.f1963);
    }

    public final int hashCode() {
        int i = ᵎˏ.ˏʾ(this.f1962.hashCode() * 31, 31, this.f1959);
        Integer num = this.f1961;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f1963;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "TtvChannel(id=" + this.f1962 + ", name=" + this.f1959 + ", enableArchive=" + this.f1961 + ", archiveDuration=" + this.f1963 + ')';
    }
}
