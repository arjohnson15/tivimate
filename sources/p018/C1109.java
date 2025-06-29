package p018;

import com.google.android.gms.internal.measurement.C0559;
import com.hierynomus.smbj.common.SMBRuntimeException;
import java.io.IOException;
import p078.AbstractC1684;
import p078.EnumC1683;
import p078.EnumC1689;
import p221.AbstractC2855;
import p283.C3380;

/* renamed from: ʻⁱ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1109 extends AbstractC1684 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C0559 f4705;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final AbstractC2855 f4706;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final boolean f4707;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final long f4708;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final long f4709;

    public C1109(EnumC1689 enumC1689, long j, long j2, long j3, C0559 c0559, AbstractC2855 abstractC2855, int i) {
        super(57, enumC1689, EnumC1683.f6554, j, j2, Math.max(abstractC2855.mo7171(), i));
        this.f4708 = j3;
        this.f4705 = c0559;
        this.f4706 = abstractC2855;
        this.f4707 = true;
        this.f4709 = i;
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵢˆ */
    public final void mo4126(C3380 c3380) {
        c3380.m8847(this.f6557);
        c3380.m8240();
        c3380.m8844(this.f4708);
        this.f4705.m2497(c3380);
        AbstractC2855 abstractC2855 = this.f4706;
        int iMo7171 = abstractC2855.mo7171();
        if (iMo7171 > 0) {
            c3380.m8844(120);
            c3380.m8844(iMo7171);
        } else {
            c3380.m8844(0L);
            c3380.m8844(0L);
        }
        c3380.m8844(0L);
        c3380.m8844(0L);
        c3380.m8844(0L);
        c3380.m8844(this.f4709);
        c3380.m8844(this.f4707 ? 1L : 0L);
        c3380.m8238();
        while (abstractC2855.mo7171() > 0) {
            byte[] bArr = new byte[65536];
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
