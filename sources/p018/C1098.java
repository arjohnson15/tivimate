package p018;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import java.util.UUID;
import p078.AbstractC1685;
import p078.EnumC1689;
import p215.C2819;
import p283.C3380;
import p332.C3779;
import ʼˉ.ٴˎ;
import ـˈ.ˉᵎ;

/* renamed from: ʻⁱ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1098 extends AbstractC1685 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f4679;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public UUID f4680;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public C2819 f4681;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public long f4682;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public int f4683;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f4684;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public EnumC1689 f4685;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f4686;

    @Override // p078.AbstractC1685
    /* renamed from: ᵔˋ */
    public final void mo4125(C3380 c3380) throws Buffer$BufferException {
        c3380.m8843(2);
        C3779 c3779 = c3380.f14613;
        this.f4684 = c3779.m8852(c3380);
        int iM8852 = c3779.m8852(c3380);
        int iM88522 = 0;
        for (EnumC1689 enumC1689 : EnumC1689.values()) {
            if (enumC1689.f6583 == iM8852) {
                this.f4685 = enumC1689;
                EnumC1689 enumC16892 = EnumC1689.f6577;
                if (enumC1689 == enumC16892) {
                    c3779.m8852(c3380);
                } else {
                    c3380.m8843(2);
                }
                this.f4680 = new UUID((((c3779.m8854(c3380) << 16) | c3779.m8852(c3380)) << 16) | c3779.m8852(c3380), C3779.f14621.m8855(c3380));
                this.f4682 = c3779.m8854(c3380);
                this.f4683 = c3380.m8848();
                this.f4686 = c3380.m8848();
                this.f4679 = c3380.m8848();
                this.f4681 = ٴˎ.ﾞʽ(c3380);
                ٴˎ.ﾞʽ(c3380);
                int iM88523 = c3779.m8852(c3380);
                int iM88524 = c3779.m8852(c3380);
                if (this.f4685 == enumC16892) {
                    iM88522 = c3779.m8852(c3380);
                } else {
                    c3380.m8843(2);
                }
                if (iM88524 > 0) {
                    c3380.f14614 = iM88523;
                    c3380.m8842(iM88524);
                }
                if (this.f4685 != enumC16892) {
                    return;
                }
                c3380.f14614 = iM88522;
                throw new UnsupportedOperationException("Cannot read NegotiateContextList yet");
            }
        }
        throw new IllegalStateException(ˉᵎ.ˉⁱ("Unknown SMB2 Dialect: ", iM8852));
    }
}
