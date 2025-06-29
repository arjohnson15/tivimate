package p018;

import com.google.android.gms.internal.measurement.C0559;
import p078.AbstractC1685;
import p078.EnumC1683;
import p078.EnumC1689;
import p283.C3380;
import ـˈ.ˉᵎ;

/* renamed from: ʻⁱ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1097 extends AbstractC1685 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f4675;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final byte[] f4676;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C0559 f4677;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f4678;

    public C1097(EnumC1689 enumC1689, long j, long j2, C0559 c0559, int i, byte[] bArr) {
        super(33, enumC1689, EnumC1683.f6552, j, j2);
        this.f4677 = c0559;
        this.f4678 = 1;
        this.f4675 = i;
        this.f4676 = bArr;
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵢˆ */
    public final void mo4126(C3380 c3380) {
        long j;
        c3380.m8847(this.f6557);
        int i = this.f4678;
        if (i == 1) {
            j = 1;
        } else if (i == 2) {
            j = 2;
        } else if (i == 3) {
            j = 3;
        } else {
            if (i != 4) {
                throw null;
            }
            j = 4;
        }
        c3380.mo6214((byte) j);
        c3380.mo6214(this.f4675 == 0 ? (byte) 0 : (byte) ˉᵎ.ٴˎ(r0));
        byte[] bArr = this.f4676;
        c3380.m8844(bArr.length);
        c3380.m8847(96);
        c3380.m8240();
        c3380.m8844(0L);
        this.f4677.m2497(c3380);
        c3380.mo6213(bArr.length, bArr);
    }
}
