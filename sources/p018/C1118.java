package p018;

import com.google.android.gms.internal.measurement.C0559;
import com.hierynomus.smbj.common.SMBRuntimeException;
import java.io.IOException;
import p078.AbstractC1684;
import p078.C1696;
import p078.EnumC1683;
import p078.EnumC1689;
import p221.AbstractC2855;
import p283.C3380;
import p283.InterfaceC3379;
import ʿﾞ.ﹳﹳ;

/* renamed from: ʻⁱ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1118 extends AbstractC1684 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final AbstractC2855 f4736;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C0559 f4737;

    public C1118(EnumC1689 enumC1689, C0559 c0559, long j, long j2, AbstractC2855 abstractC2855, int i) {
        super(49, enumC1689, EnumC1683.f6549, j, j2, Math.min(i, abstractC2855.mo7171()));
        this.f4737 = c0559;
        this.f4736 = abstractC2855;
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵢˆ */
    public final void mo4126(C3380 c3380) {
        c3380.m8847(this.f6557);
        c3380.m8847(112);
        c3380.m8844(Math.min(this.f6556, ((C1696) ((InterfaceC3379) ((ﹳﹳ) this).ᐧⁱ)).f6596 * 65536));
        AbstractC2855 abstractC2855 = this.f4736;
        c3380.f14613.m8853(c3380, abstractC2855.f11097);
        this.f4737.m2497(c3380);
        c3380.m8844(0L);
        int iMo7171 = abstractC2855.mo7171() - Math.min(this.f6556, ((C1696) ((InterfaceC3379) ((ﹳﹳ) this).ᐧⁱ)).f6596 * 65536);
        c3380.m8844(Math.max(0, iMo7171));
        c3380.m8847(0);
        c3380.m8847(0);
        c3380.m8844(0L);
        int i = ((C1696) ((InterfaceC3379) ((ﹳﹳ) this).ᐧⁱ)).f6596;
        byte[] bArr = new byte[65536];
        for (int i2 = 0; i2 < i; i2++) {
            try {
                int iMo7170 = abstractC2855.mo7170(bArr);
                c3380.mo6213(iMo7170, bArr);
                abstractC2855.f11097 += iMo7170;
            } catch (IOException e) {
                throw new SMBRuntimeException(e);
            }
        }
    }
}
