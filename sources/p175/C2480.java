package p175;

import java.util.ArrayList;
import java.util.Locale;
import p141.C2193;
import p141.C2217;
import p166.C2417;
import p254.AbstractC3152;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p353.AbstractC4010;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import ˈי.ʾˈ;
import ـˈ.ˉᵎ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˋˏ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2480 implements InterfaceC2486 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public InterfaceC3178 f9863;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2193 f9866;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f9867;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f9868;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f9869;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long f9865 = -1;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f9864 = -1;

    public C2480(C2193 c2193) {
        this.f9866 = c2193;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ʽᐧ */
    public final void mo6599(long j) {
        this.f9865 = j;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ˑʽ */
    public final void mo6600(InterfaceC3177 interfaceC3177, int i) {
        InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(i, 1);
        this.f9863 = interfaceC3178Mo4851;
        interfaceC3178Mo4851.mo7840(this.f9866.f8622);
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ـﹶ */
    public final void mo6601(long j, long j2) {
        this.f9865 = j;
        this.f9869 = j2;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ﹳﹳ */
    public final void mo6602(C4457 c4457, long j, int i, boolean z) {
        AbstractC4464.m10146(this.f9863);
        if (!this.f9867) {
            int i2 = c4457.f17169;
            AbstractC4464.m10124("ID Header has insufficient data", c4457.f17170 > 18);
            AbstractC4464.m10124("ID Header missing", c4457.m10105(8, AbstractC4010.f15450).equals("OpusHead"));
            AbstractC4464.m10124("version number must always be 1", c4457.m10086() == 1);
            c4457.m10108(i2);
            ArrayList arrayListM7813 = AbstractC3152.m7813(c4457.f17171);
            C2417 c2417M6541 = this.f9866.f8622.m6541();
            c2417M6541.f9609 = arrayListM7813;
            ᐧʻ.ˋˊ(c2417M6541, this.f9863);
            this.f9867 = true;
        } else if (this.f9868) {
            int iM6189 = C2217.m6189(this.f9864);
            if (i != iM6189) {
                int i3 = AbstractC4470.f17202;
                Locale locale = Locale.US;
                AbstractC4464.m10144("RtpOpusReader", ˉᵎ.ˋⁱ("Received RTP packet with unexpected sequence number. Expected: ", iM6189, "; received: ", i, "."));
            }
            int iM10096 = c4457.m10096();
            this.f9863.mo7841(iM10096, c4457);
            this.f9863.mo7842(ʾˈ.ᵎـ(this.f9869, j, this.f9865, 48000), 1, iM10096, 0, null);
        } else {
            AbstractC4464.m10124("Comment Header has insufficient data", c4457.f17170 >= 8);
            AbstractC4464.m10124("Comment Header should follow ID Header", c4457.m10105(8, AbstractC4010.f15450).equals("OpusTags"));
            this.f9868 = true;
        }
        this.f9864 = i;
    }
}
