package p359;

import java.nio.charset.Charset;
import p154.C2328;
import p180.AbstractC2497;
import p180.AbstractC2500;
import p332.C3776;
import ʼˉ.ٴˎ;

/* renamed from: ᵔי.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4074 extends ٴˎ {

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static final byte[] f15706 = new byte[0];

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final boolean f15707;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final byte[] f15708;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final byte[] f15709;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public byte[] f15710;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final byte[] f15711;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final byte[] f15712;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final byte[] f15713;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final byte[] f15714;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final long f15715;

    public C4074(byte[] bArr, byte[] bArr2, String str, String str2, byte[] bArr3, long j, boolean z) {
        byte[] bArr4 = f15706;
        this.f15708 = bArr;
        this.f15713 = bArr2;
        int i = C2328.f9238;
        Charset charset = AbstractC2497.f9929;
        this.f15714 = str.getBytes(charset);
        this.f15709 = str2 != null ? str2.getBytes(charset) : bArr4;
        this.f15711 = bArr4;
        this.f15712 = bArr3 == null ? bArr4 : bArr3;
        this.f15715 = j;
        this.f15707 = z;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static int m9368(C3776 c3776, byte[] bArr, int i) {
        if (bArr == null) {
            bArr = f15706;
        }
        c3776.m8847(bArr.length);
        c3776.m8847(bArr.length);
        c3776.m8844(i);
        return i + bArr.length;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m9369(C3776 c3776) {
        c3776.m8846("NTLMSSP\u0000", AbstractC2497.f9930);
        c3776.m8844(3L);
        int i = this.f15707 ? 80 : 64;
        EnumC4075 enumC4075 = EnumC4075.f15718;
        long j = this.f15715;
        if (AbstractC2500.m6609(j, enumC4075)) {
            i += 8;
        }
        int iM9368 = m9368(c3776, this.f15711, m9368(c3776, this.f15714, m9368(c3776, this.f15709, m9368(c3776, this.f15713, m9368(c3776, this.f15708, i)))));
        if (AbstractC2500.m6609(j, EnumC4075.f15720)) {
            m9368(c3776, this.f15712, iM9368);
        } else {
            m9368(c3776, f15706, iM9368);
        }
        c3776.m8844(j);
        if (AbstractC2500.m6609(j, enumC4075)) {
            C3776 c37762 = new C3776();
            c37762.mo6214((byte) 6);
            c37762.mo6214((byte) 1);
            c37762.m8847(7600);
            c37762.mo6213(3, new byte[]{0, 0, 0});
            c37762.mo6214((byte) 15);
            byte[] bArrM8838 = c37762.m8838();
            c3776.mo6213(bArrM8838.length, bArrM8838);
        }
    }
}
