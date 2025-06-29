package p175;

import java.util.Locale;
import p141.C2193;
import p141.C2217;
import p166.C2417;
import p166.C2431;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import ˈי.ʾˈ;
import ـˈ.ˉᵎ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˋˏ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2479 implements InterfaceC2486 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public InterfaceC3178 f9853;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f9855;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f9856;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2193 f9858;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f9862;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long f9857 = -9223372036854775807L;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f9861 = -1;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f9854 = -1;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f9859 = -9223372036854775807L;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f9860 = 0;

    public C2479(C2193 c2193) {
        this.f9858 = c2193;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ʽᐧ */
    public final void mo6599(long j) {
        AbstractC4464.m10132(this.f9857 == -9223372036854775807L);
        this.f9857 = j;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ˑʽ */
    public final void mo6600(InterfaceC3177 interfaceC3177, int i) {
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(i, 2);
        this.f9853 = interfaceC3178Mo4851;
        interfaceC3178Mo4851.mo7840(this.f9858.f8622);
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ـﹶ */
    public final void mo6601(long j, long j2) {
        this.f9857 = j;
        this.f9854 = -1;
        this.f9860 = j2;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ﹳﹳ */
    public final void mo6602(C4457 c4457, long j, int i, boolean z) {
        AbstractC4464.m10146(this.f9853);
        int iM10086 = c4457.m10086();
        if ((iM10086 & 16) == 16 && (iM10086 & 7) == 0) {
            if (this.f9856 && this.f9854 > 0) {
                InterfaceC3178 interfaceC3178 = this.f9853;
                interfaceC3178.getClass();
                interfaceC3178.mo7842(this.f9859, this.f9862 ? 1 : 0, this.f9854, 0, null);
                this.f9854 = -1;
                this.f9859 = -9223372036854775807L;
                this.f9856 = false;
            }
            this.f9856 = true;
        } else {
            if (!this.f9856) {
                AbstractC4464.m10144("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return;
            }
            int iM6189 = C2217.m6189(this.f9861);
            if (i < iM6189) {
                int i2 = AbstractC4470.f17202;
                Locale locale = Locale.US;
                AbstractC4464.m10144("RtpVP8Reader", ˉᵎ.ˋⁱ("Received RTP packet with unexpected sequence number. Expected: ", iM6189, "; received: ", i, ". Dropping packet."));
                return;
            }
        }
        if ((iM10086 & 128) != 0) {
            int iM100862 = c4457.m10086();
            if ((iM100862 & 128) != 0 && (c4457.m10086() & 128) != 0) {
                c4457.m10085(1);
            }
            if ((iM100862 & 64) != 0) {
                c4457.m10085(1);
            }
            if ((iM100862 & 32) != 0 || (16 & iM100862) != 0) {
                c4457.m10085(1);
            }
        }
        if (this.f9854 == -1 && this.f9856) {
            this.f9862 = (c4457.m10078() & 1) == 0;
        }
        if (!this.f9855) {
            int i3 = c4457.f17169;
            c4457.m10108(i3 + 6);
            int iM10091 = c4457.m10091() & 16383;
            int iM100912 = c4457.m10091() & 16383;
            c4457.m10108(i3);
            C2431 c2431 = this.f9858.f8622;
            if (iM10091 != c2431.f9684 || iM100912 != c2431.f9687) {
                InterfaceC3178 interfaceC31782 = this.f9853;
                C2417 c2417M6541 = c2431.m6541();
                c2417M6541.f9607 = iM10091;
                c2417M6541.f9620 = iM100912;
                ᐧʻ.ˋˊ(c2417M6541, interfaceC31782);
            }
            this.f9855 = true;
        }
        int iM10096 = c4457.m10096();
        this.f9853.mo7841(iM10096, c4457);
        int i4 = this.f9854;
        if (i4 == -1) {
            this.f9854 = iM10096;
        } else {
            this.f9854 = i4 + iM10096;
        }
        this.f9859 = ʾˈ.ᵎـ(this.f9860, j, this.f9857, 90000);
        if (z) {
            InterfaceC3178 interfaceC31783 = this.f9853;
            interfaceC31783.getClass();
            interfaceC31783.mo7842(this.f9859, this.f9862 ? 1 : 0, this.f9854, 0, null);
            this.f9854 = -1;
            this.f9859 = -9223372036854775807L;
            this.f9856 = false;
        }
        this.f9861 = i;
    }
}
