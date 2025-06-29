package p341;

import p254.InterfaceC3178;
import p383.AbstractC4464;

/* renamed from: ᵎˑ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3884 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f14961;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f14962;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long f14963;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f14964;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3178 f14965;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f14966;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f14967;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f14968;

    public C3884(InterfaceC3178 interfaceC3178) {
        this.f14965 = interfaceC3178;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9083(long j, boolean z, int i) {
        AbstractC4464.m10132(this.f14963 != -9223372036854775807L);
        if (this.f14962 == 182 && z && this.f14961) {
            this.f14965.mo7842(this.f14963, this.f14968 ? 1 : 0, (int) (j - this.f14967), i, null);
        }
        if (this.f14962 != 179) {
            this.f14967 = j;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9084(byte[] bArr, int i, int i2) {
        if (this.f14964) {
            int i3 = this.f14966;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f14966 = (i2 - i) + i3;
            } else {
                this.f14968 = ((bArr[i4] & 192) >> 6) == 0;
                this.f14964 = false;
            }
        }
    }
}
