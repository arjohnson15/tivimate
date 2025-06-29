package p324;

import java.util.List;
import java.util.Map;
import p166.C2405;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p345.C3930;

/* renamed from: ᴵˋ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3716 extends AbstractC3705 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f14398;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final long f14399;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final int f14400;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int f14401;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final C3708 f14402;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final long f14403;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final AbstractC3980 f14404;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final long f14405;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean f14406;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final long f14407;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean f14408;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f14409;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f14410;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final long f14411;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final AbstractC3980 f14412;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final C2405 f14413;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final C3930 f14414;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f14415;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean f14416;

    public C3716(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, C2405 c2405, List list2, List list3, C3708 c3708, Map map) {
        super(str, list, z3);
        this.f14415 = i;
        this.f14407 = j2;
        this.f14410 = z;
        this.f14416 = z2;
        this.f14400 = i2;
        this.f14405 = j3;
        this.f14401 = i3;
        this.f14403 = j4;
        this.f14411 = j5;
        this.f14406 = z4;
        this.f14408 = z5;
        this.f14413 = c2405;
        this.f14404 = AbstractC3980.m9209(list2);
        this.f14412 = AbstractC3980.m9209(list3);
        this.f14414 = C3930.m9140(map);
        if (!list3.isEmpty()) {
            C3715 c3715 = (C3715) AbstractC3968.m9180(list3);
            this.f14399 = c3715.f14332 + c3715.f14334;
        } else if (list2.isEmpty()) {
            this.f14399 = 0L;
        } else {
            C3712 c3712 = (C3712) AbstractC3968.m9180(list2);
            this.f14399 = c3712.f14332 + c3712.f14334;
        }
        this.f14398 = j != -9223372036854775807L ? j >= 0 ? Math.min(this.f14399, j) : Math.max(0L, this.f14399 + j) : -9223372036854775807L;
        this.f14409 = j >= 0;
        this.f14402 = c3708;
    }

    @Override // p022.InterfaceC1133
    /* renamed from: ـﹶ */
    public final Object mo4158(List list) {
        return this;
    }
}
