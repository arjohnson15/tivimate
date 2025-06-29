package ar.tvplayer.core.data.api.xtreamcodes;

import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ʼˈ.ـﹶ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class CatchupData {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Integer f2053;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final transient C3406 f2054 = new C3406(new ـﹶ(8, this));

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f2055;

    public CatchupData(@InterfaceC5065(name = "stream_id") int i, @InterfaceC5065(name = "tv_archive_duration") Integer num) {
        this.f2055 = i;
        this.f2053 = num;
    }

    public final CatchupData copy(@InterfaceC5065(name = "stream_id") int i, @InterfaceC5065(name = "tv_archive_duration") Integer num) {
        return new CatchupData(i, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchupData)) {
            return false;
        }
        CatchupData catchupData = (CatchupData) obj;
        return this.f2055 == catchupData.f2055 && AbstractC1549.m5138(this.f2053, catchupData.f2053);
    }

    public final int hashCode() {
        int i = this.f2055 * 31;
        Integer num = this.f2053;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CatchupData(streamId=" + this.f2055 + ", tvArchiveDuration=" + this.f2053 + ')';
    }
}
