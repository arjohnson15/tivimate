package ar.tvplayer.core.data.api.xtreamcodes;

import ar.tvplayer.core.util.annotation.ForceToIntNotNull;
import ar.tvplayer.core.util.annotation.TrimmedString;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ʼʽ.ـﹶ;
import ˆʽ.ᵎˏ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class LiveStream {

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C3406 f2079 = new C3406(new ـﹶ(4));

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2080;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f2081;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f2082;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f2083;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f2084;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f2085;

    public LiveStream(@InterfaceC5065(name = "stream_id") int i, @TrimmedString @InterfaceC5065(name = "name") String str, @InterfaceC5065(name = "stream_icon") String str2, @ForceToIntNotNull @InterfaceC5065(name = "category_id") int i2, @InterfaceC5065(name = "epg_channel_id") String str3, @ForceToIntNotNull @InterfaceC5065(name = "tv_archive_duration") int i3) {
        this.f2083 = i;
        this.f2080 = str;
        this.f2082 = str2;
        this.f2085 = i2;
        this.f2081 = str3;
        this.f2084 = i3;
    }

    public /* synthetic */ LiveStream(int i, String str, String str2, int i2, String str3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i4 & 8) != 0 ? 0 : i2, str3, (i4 & 32) != 0 ? 0 : i3);
    }

    public final LiveStream copy(@InterfaceC5065(name = "stream_id") int i, @TrimmedString @InterfaceC5065(name = "name") String str, @InterfaceC5065(name = "stream_icon") String str2, @ForceToIntNotNull @InterfaceC5065(name = "category_id") int i2, @InterfaceC5065(name = "epg_channel_id") String str3, @ForceToIntNotNull @InterfaceC5065(name = "tv_archive_duration") int i3) {
        return new LiveStream(i, str, str2, i2, str3, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveStream)) {
            return false;
        }
        LiveStream liveStream = (LiveStream) obj;
        return this.f2083 == liveStream.f2083 && AbstractC1549.m5138(this.f2080, liveStream.f2080) && AbstractC1549.m5138(this.f2082, liveStream.f2082) && this.f2085 == liveStream.f2085 && AbstractC1549.m5138(this.f2081, liveStream.f2081) && this.f2084 == liveStream.f2084;
    }

    public final int hashCode() {
        int i = this.f2083 * 31;
        String str = this.f2080;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2082;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f2085) * 31;
        String str3 = this.f2081;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f2084;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveStream(id=");
        sb.append(this.f2083);
        sb.append(", name=");
        sb.append(this.f2080);
        sb.append(", icon=");
        sb.append(this.f2082);
        sb.append(", categoryId=");
        sb.append(this.f2085);
        sb.append(", epgChannelId=");
        sb.append(this.f2081);
        sb.append(", archiveDurationDays=");
        return ᵎˏ.ᵎـ(sb, this.f2084, ')');
    }
}
