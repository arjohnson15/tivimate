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
public final class VodStream {

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C3406 f2178 = new C3406(new ـﹶ(6));

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2179;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float f2180;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f2181;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f2182;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f2183;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f2184;

    public VodStream(@InterfaceC5065(name = "stream_id") int i, @TrimmedString @InterfaceC5065(name = "name") String str, @InterfaceC5065(name = "stream_icon") String str2, @ForceToIntNotNull @InterfaceC5065(name = "category_id") int i2, @ForceToFloatNotNull @InterfaceC5065(name = "rating") float f, @ForceToLongNotNull @InterfaceC5065(name = "added") long j) {
        this.f2182 = i;
        this.f2179 = str;
        this.f2181 = str2;
        this.f2184 = i2;
        this.f2180 = f;
        this.f2183 = j;
    }

    public /* synthetic */ VodStream(int i, String str, String str2, int i2, float f, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? 0.0f : f, (i3 & 32) != 0 ? 0L : j);
    }

    public final VodStream copy(@InterfaceC5065(name = "stream_id") int i, @TrimmedString @InterfaceC5065(name = "name") String str, @InterfaceC5065(name = "stream_icon") String str2, @ForceToIntNotNull @InterfaceC5065(name = "category_id") int i2, @ForceToFloatNotNull @InterfaceC5065(name = "rating") float f, @ForceToLongNotNull @InterfaceC5065(name = "added") long j) {
        return new VodStream(i, str, str2, i2, f, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VodStream)) {
            return false;
        }
        VodStream vodStream = (VodStream) obj;
        return this.f2182 == vodStream.f2182 && AbstractC1549.m5138(this.f2179, vodStream.f2179) && AbstractC1549.m5138(this.f2181, vodStream.f2181) && this.f2184 == vodStream.f2184 && Float.compare(this.f2180, vodStream.f2180) == 0 && this.f2183 == vodStream.f2183;
    }

    public final int hashCode() {
        int i = this.f2182 * 31;
        String str = this.f2179;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2181;
        int iFloatToIntBits = (Float.floatToIntBits(this.f2180) + ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f2184) * 31)) * 31;
        long j = this.f2183;
        return iFloatToIntBits + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VodStream(id=");
        sb.append(this.f2182);
        sb.append(", name=");
        sb.append(this.f2179);
        sb.append(", icon=");
        sb.append(this.f2181);
        sb.append(", categoryId=");
        sb.append(this.f2184);
        sb.append(", rating=");
        sb.append(this.f2180);
        sb.append(", addedTime=");
        return AbstractC5179.m11554(sb, this.f2183, ')');
    }
}
