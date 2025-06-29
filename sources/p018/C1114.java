package p018;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import java.util.EnumSet;
import p078.AbstractC1685;
import p078.EnumC1689;
import p180.AbstractC2500;
import p283.C3380;
import p332.C3779;

/* renamed from: ʻⁱ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1114 extends AbstractC1685 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public long f4721;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public byte[] f4722;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public EnumSet f4723;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public EnumC1689 f4724;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public byte f4725;

    @Override // p078.AbstractC1685
    /* renamed from: ᵔˋ */
    public final void mo4125(C3380 c3380) throws Buffer$BufferException {
        byte[] bArr;
        c3380.m8841();
        C3779 c3779 = c3380.f14613;
        this.f4723 = AbstractC2500.m6614(c3779.m8852(c3380), EnumC1112.class);
        int iM8852 = c3779.m8852(c3380);
        int iM88522 = c3779.m8852(c3380);
        if (iM88522 > 0) {
            c3380.f14614 = iM8852;
            bArr = new byte[iM88522];
            c3380.m8839(iM88522, bArr);
        } else {
            bArr = new byte[0];
        }
        this.f4722 = bArr;
    }

    @Override // p078.AbstractC1685
    /* renamed from: ᵢˆ */
    public final void mo4126(C3380 c3380) {
        c3380.m8847(this.f6557);
        this.f4724.getClass();
        c3380.mo6214((byte) 0);
        c3380.mo6214(this.f4725);
        c3380.m8844(this.f4721 & 1);
        c3380.m8238();
        c3380.m8847(88);
        byte[] bArr = this.f4722;
        c3380.m8847(bArr != null ? bArr.length : 0);
        c3380.f14613.m8853(c3380, 0L);
        byte[] bArr2 = this.f4722;
        if (bArr2 != null) {
            c3380.mo6213(bArr2.length, bArr2);
        }
    }
}
