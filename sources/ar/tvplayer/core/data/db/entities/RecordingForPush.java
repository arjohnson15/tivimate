package ar.tvplayer.core.data.db.entities;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class RecordingForPush {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f2230;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Integer f2231;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final String f2232;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final String f2233;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final String f2234;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final String f2235;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Long f2236;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f2237;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f2238;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String f2239;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String f2240;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Long f2241;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Long f2242;

    public RecordingForPush(@InterfaceC5065(name = "s1") long j, @InterfaceC5065(name = "s2") long j2, @InterfaceC5065(name = "fp") String str, @InterfaceC5065(ignore = true) Long l, @InterfaceC5065(ignore = true) Integer num, @InterfaceC5065(name = "cu") String str2, @InterfaceC5065(name = "ocn") String str3, @InterfaceC5065(name = "ps1") Long l2, @InterfaceC5065(name = "ps2") Long l3, @InterfaceC5065(name = "pt") String str4, @InterfaceC5065(name = "pd") String str5, @InterfaceC5065(name = "crn") String str6, @InterfaceC5065(name = "rr") String str7) {
        this.f2238 = j;
        this.f2230 = j2;
        this.f2237 = str;
        this.f2241 = l;
        this.f2231 = num;
        this.f2239 = str2;
        this.f2240 = str3;
        this.f2236 = l2;
        this.f2242 = l3;
        this.f2232 = str4;
        this.f2235 = str5;
        this.f2233 = str6;
        this.f2234 = str7;
    }

    public /* synthetic */ RecordingForPush(long j, long j2, String str, Long l, Integer num, String str2, String str3, Long l2, Long l3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, str, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : num, str2, str3, l2, l3, str4, str5, str6, str7);
    }

    public final RecordingForPush copy(@InterfaceC5065(name = "s1") long j, @InterfaceC5065(name = "s2") long j2, @InterfaceC5065(name = "fp") String str, @InterfaceC5065(ignore = true) Long l, @InterfaceC5065(ignore = true) Integer num, @InterfaceC5065(name = "cu") String str2, @InterfaceC5065(name = "ocn") String str3, @InterfaceC5065(name = "ps1") Long l2, @InterfaceC5065(name = "ps2") Long l3, @InterfaceC5065(name = "pt") String str4, @InterfaceC5065(name = "pd") String str5, @InterfaceC5065(name = "crn") String str6, @InterfaceC5065(name = "rr") String str7) {
        return new RecordingForPush(j, j2, str, l, num, str2, str3, l2, l3, str4, str5, str6, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordingForPush)) {
            return false;
        }
        RecordingForPush recordingForPush = (RecordingForPush) obj;
        return this.f2238 == recordingForPush.f2238 && this.f2230 == recordingForPush.f2230 && AbstractC1549.m5138(this.f2237, recordingForPush.f2237) && AbstractC1549.m5138(this.f2241, recordingForPush.f2241) && AbstractC1549.m5138(this.f2231, recordingForPush.f2231) && AbstractC1549.m5138(this.f2239, recordingForPush.f2239) && AbstractC1549.m5138(this.f2240, recordingForPush.f2240) && AbstractC1549.m5138(this.f2236, recordingForPush.f2236) && AbstractC1549.m5138(this.f2242, recordingForPush.f2242) && AbstractC1549.m5138(this.f2232, recordingForPush.f2232) && AbstractC1549.m5138(this.f2235, recordingForPush.f2235) && AbstractC1549.m5138(this.f2233, recordingForPush.f2233) && AbstractC1549.m5138(this.f2234, recordingForPush.f2234);
    }

    public final int hashCode() {
        long j = this.f2238;
        long j2 = this.f2230;
        int i = ᵎˏ.ˏʾ(((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.f2237);
        Long l = this.f2241;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f2231;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f2239;
        int i2 = ᵎˏ.ˏʾ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f2240);
        Long l2 = this.f2236;
        int iHashCode3 = (i2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f2242;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.f2232;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2235;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2233;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2234;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingForPush(startSeconds=");
        sb.append(this.f2238);
        sb.append(", stopSeconds=");
        sb.append(this.f2230);
        sb.append(", filePath=");
        sb.append(this.f2237);
        sb.append(", playlistId=");
        sb.append(this.f2241);
        sb.append(", channelXcId=");
        sb.append(this.f2231);
        sb.append(", channelUrl=");
        sb.append(this.f2239);
        sb.append(", originalChannelName=");
        sb.append(this.f2240);
        sb.append(", programStartSeconds=");
        sb.append(this.f2236);
        sb.append(", programStopSeconds=");
        sb.append(this.f2242);
        sb.append(", programTitle=");
        sb.append(this.f2232);
        sb.append(", programDesc=");
        sb.append(this.f2235);
        sb.append(", customRecordingName=");
        sb.append(this.f2233);
        sb.append(", repeatRulesJson=");
        return ˉᵎ.ˑי(sb, this.f2234, ')');
    }
}
