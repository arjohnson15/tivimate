package ar.tvplayer.core.data.api.xtreamcodes;

import ar.tvplayer.core.util.annotation.ForceToFloatNotNull;
import ar.tvplayer.core.util.annotation.ForceToIntNotNull;
import ar.tvplayer.core.util.annotation.ForceToLongNotNull;
import ar.tvplayer.core.util.annotation.TrimmedString;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import p447.AbstractC5179;
import ʼʽ.ـﹶ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class Series {

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C3406 f2095 = new C3406(new ـﹶ(5));

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2096;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float f2097;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f2098;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f2099;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f2100;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f2101;

    public Series(@InterfaceC5065(name = "series_id") int i, @TrimmedString @InterfaceC5065(name = "name") String str, @InterfaceC5065(name = "cover") String str2, @ForceToIntNotNull @InterfaceC5065(name = "category_id") int i2, @ForceToFloatNotNull @InterfaceC5065(name = "rating") float f, @ForceToLongNotNull @InterfaceC5065(name = "last_modified") long j) {
        this.f2099 = i;
        this.f2096 = str;
        this.f2098 = str2;
        this.f2101 = i2;
        this.f2097 = f;
        this.f2100 = j;
    }

    public /* synthetic */ Series(int i, String str, String str2, int i2, float f, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? 0.0f : f, (i3 & 32) != 0 ? 0L : j);
    }

    public final Series copy(@InterfaceC5065(name = "series_id") int i, @TrimmedString @InterfaceC5065(name = "name") String str, @InterfaceC5065(name = "cover") String str2, @ForceToIntNotNull @InterfaceC5065(name = "category_id") int i2, @ForceToFloatNotNull @InterfaceC5065(name = "rating") float f, @ForceToLongNotNull @InterfaceC5065(name = "last_modified") long j) {
        return new Series(i, str, str2, i2, f, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Series)) {
            return false;
        }
        Series series = (Series) obj;
        return this.f2099 == series.f2099 && AbstractC1549.m5138(this.f2096, series.f2096) && AbstractC1549.m5138(this.f2098, series.f2098) && this.f2101 == series.f2101 && Float.compare(this.f2097, series.f2097) == 0 && this.f2100 == series.f2100;
    }

    public final int hashCode() {
        int i = this.f2099 * 31;
        String str = this.f2096;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2098;
        int iFloatToIntBits = (Float.floatToIntBits(this.f2097) + ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f2101) * 31)) * 31;
        long j = this.f2100;
        return iFloatToIntBits + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Series(id=");
        sb.append(this.f2099);
        sb.append(", name=");
        sb.append(this.f2096);
        sb.append(", cover=");
        sb.append(this.f2098);
        sb.append(", categoryId=");
        sb.append(this.f2101);
        sb.append(", rating=");
        sb.append(this.f2097);
        sb.append(", lastModifiedTime=");
        return AbstractC5179.m11554(sb, this.f2100, ')');
    }
}
