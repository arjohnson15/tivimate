package p018;

import com.google.android.gms.internal.measurement.C0559;
import p078.AbstractC1685;
import p078.EnumC1683;
import p078.EnumC1689;
import p080.AbstractC1702;
import p180.AbstractC2500;
import p283.C3380;
import p334.C3789;
import ـˈ.ˉᵎ;

/* renamed from: ʻⁱ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1111 extends AbstractC1685 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f4711;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C0559 f4712;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f4713;

    public C1111(EnumC1689 enumC1689, long j, long j2, C0559 c0559, int i) {
        super(41, enumC1689, EnumC1683.f6545, j, j2);
        this.f4713 = 1;
        this.f4711 = i;
        this.f4712 = c0559;
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵢˆ */
    public final void mo4126(C3380 c3380) {
        long j;
        long j2;
        c3380.m8847(this.f6557);
        int i = this.f4713;
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
        int iM5411 = AbstractC1702.m5411(i);
        boolean z = false;
        C0559 c0559 = this.f4712;
        if (iM5411 == 0) {
            int i2 = this.f4711;
            c3380.mo6214((byte) ˉᵎ.ٴˎ(i2));
            c3380.m8844(65536L);
            if (i2 == 15) {
                c3380.m8847(0);
                c3380.m8240();
                throw null;
            }
            c3380.m8847(0);
            c3380.m8240();
            c3380.m8844(0L);
            c3380.m8844(0L);
            c3380.m8844(0L);
            c0559.m2497(c3380);
            return;
        }
        if (iM5411 != 1) {
            if (iM5411 != 2) {
                if (iM5411 != 3) {
                    throw new IllegalStateException("Unknown SMB2QueryInfoType: ".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "SMB2_0_INFO_QUOTA" : "SMB2_0_INFO_SECURITY" : "SMB2_0_INFO_FILESYSTEM" : "SMB2_0_INFO_FILE"));
                }
                c3380.mo6214((byte) 0);
                c3380.m8844(65536L);
                c3380.m8847(0);
                c3380.m8240();
                throw null;
            }
            c3380.mo6214((byte) 0);
            c3380.m8844(65536L);
            c3380.m8847(0);
            c3380.m8240();
            c3380.m8844(0L);
            AbstractC2500.m6610(null);
            throw null;
        }
        switch (z) {
            case true:
                j2 = 1;
                break;
            case true:
                j2 = 2;
                break;
            case true:
                j2 = 3;
                break;
            case true:
                j2 = 4;
                break;
            case true:
                j2 = 5;
                break;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                j2 = 6;
                break;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                j2 = 7;
                break;
            case true:
                j2 = 8;
                break;
            case true:
                j2 = 9;
                break;
            case true:
                j2 = 10;
                break;
            case true:
                j2 = 11;
                break;
            default:
                throw null;
        }
        c3380.mo6214((byte) j2);
        c3380.m8844(65536L);
        c3380.m8847(0);
        c3380.m8240();
        c3380.m8844(0L);
        c3380.m8844(0L);
        c3380.m8844(0L);
        c0559.m2497(c3380);
    }
}
