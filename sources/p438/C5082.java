package p438;

import p374.C4290;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ﹶﾞ.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5082 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f19309;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f19310;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean f19311;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f19312;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4290 f19313;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f19314;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f19315;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f19316;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean f19317;

    public C5082(C4290 c4290, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        AbstractC4464.m10142(!z4 || z2);
        AbstractC4464.m10142(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        AbstractC4464.m10142(z5);
        this.f19313 = c4290;
        this.f19309 = j;
        this.f19312 = j2;
        this.f19316 = j3;
        this.f19310 = j4;
        this.f19314 = z;
        this.f19315 = z2;
        this.f19311 = z3;
        this.f19317 = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5082.class != obj.getClass()) {
            return false;
        }
        C5082 c5082 = (C5082) obj;
        return this.f19309 == c5082.f19309 && this.f19312 == c5082.f19312 && this.f19316 == c5082.f19316 && this.f19310 == c5082.f19310 && this.f19314 == c5082.f19314 && this.f19315 == c5082.f19315 && this.f19311 == c5082.f19311 && this.f19317 == c5082.f19317 && AbstractC4470.m10194(this.f19313, c5082.f19313);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f19313.hashCode() + 527) * 31) + ((int) this.f19309)) * 31) + ((int) this.f19312)) * 31) + ((int) this.f19316)) * 31) + ((int) this.f19310)) * 31) + (this.f19314 ? 1 : 0)) * 31) + (this.f19315 ? 1 : 0)) * 31) + (this.f19311 ? 1 : 0)) * 31) + (this.f19317 ? 1 : 0);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5082 m11287(long j) {
        if (j == this.f19309) {
            return this;
        }
        return new C5082(this.f19313, j, this.f19312, this.f19316, this.f19310, this.f19314, this.f19315, this.f19311, this.f19317);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5082 m11288(long j) {
        if (j == this.f19312) {
            return this;
        }
        return new C5082(this.f19313, this.f19309, j, this.f19316, this.f19310, this.f19314, this.f19315, this.f19311, this.f19317);
    }
}
