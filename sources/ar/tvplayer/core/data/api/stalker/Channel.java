package ar.tvplayer.core.data.api.stalker;

import ar.tvplayer.core.util.annotation.ForceToIntNotNull;
import ar.tvplayer.core.util.annotation.TrimmedString;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ˆʽ.ᵎˏ;
import יˏ.ˎᵢ;
import ـˈ.ᵔˊ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class Channel {

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final C3406 f1790 = new C3406(new ˎᵢ(25));

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f1791;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f1792;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f1793;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f1794;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f1795;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String f1796;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f1797;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f1798;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final transient C3406 f1799;

    public Channel(@InterfaceC5065(name = "id") long j, @TrimmedString @InterfaceC5065(name = "name") String str, @InterfaceC5065(name = "cmd") String str2, @InterfaceC5065(name = "tv_genre_id") String str3, @InterfaceC5065(name = "xmltv_id") String str4, @InterfaceC5065(name = "logo") String str5, @ForceToIntNotNull @InterfaceC5065(name = "enable_tv_archive") int i, @ForceToIntNotNull @InterfaceC5065(name = "tv_archive_duration") int i2) {
        this.f1795 = j;
        this.f1791 = str;
        this.f1794 = str2;
        this.f1798 = str3;
        this.f1792 = str4;
        this.f1796 = str5;
        this.f1797 = i;
        this.f1793 = i2;
        this.f1799 = new C3406(new ᵔˊ(14, this));
    }

    public /* synthetic */ Channel(long j, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, str5, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2);
    }

    public final Channel copy(@InterfaceC5065(name = "id") long j, @TrimmedString @InterfaceC5065(name = "name") String str, @InterfaceC5065(name = "cmd") String str2, @InterfaceC5065(name = "tv_genre_id") String str3, @InterfaceC5065(name = "xmltv_id") String str4, @InterfaceC5065(name = "logo") String str5, @ForceToIntNotNull @InterfaceC5065(name = "enable_tv_archive") int i, @ForceToIntNotNull @InterfaceC5065(name = "tv_archive_duration") int i2) {
        return new Channel(j, str, str2, str3, str4, str5, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) obj;
        return this.f1795 == channel.f1795 && AbstractC1549.m5138(this.f1791, channel.f1791) && AbstractC1549.m5138(this.f1794, channel.f1794) && AbstractC1549.m5138(this.f1798, channel.f1798) && AbstractC1549.m5138(this.f1792, channel.f1792) && AbstractC1549.m5138(this.f1796, channel.f1796) && this.f1797 == channel.f1797 && this.f1793 == channel.f1793;
    }

    public final int hashCode() {
        long j = this.f1795;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f1791;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1794;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1798;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1792;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f1796;
        return ((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f1797) * 31) + this.f1793;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Channel(id=");
        sb.append(this.f1795);
        sb.append(", name=");
        sb.append(this.f1791);
        sb.append(", cmd=");
        sb.append(this.f1794);
        sb.append(", genreId=");
        sb.append(this.f1798);
        sb.append(", xmltvId=");
        sb.append(this.f1792);
        sb.append(", logo=");
        sb.append(this.f1796);
        sb.append(", enableArchive=");
        sb.append(this.f1797);
        sb.append(", archiveDuration=");
        return ᵎˏ.ᵎـ(sb, this.f1793, ')');
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m1392() {
        return ((Number) this.f1799.getValue()).intValue();
    }
}
