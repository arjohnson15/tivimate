package p175;

import androidx.media3.common.ParserException;
import java.util.Locale;
import java.util.TreeMap;
import p141.C2193;
import p141.C2217;
import p208.AbstractC2793;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import ˈי.ʾˈ;
import ـˈ.ˉᵎ;

/* renamed from: ˋˏ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2477 implements InterfaceC2486 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f9838;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f9839;

    /* renamed from: ˉי, reason: contains not printable characters */
    public long f9840;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f9841;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f9842;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f9843;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f9844;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f9845;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Object f9846;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f9847;

    public C2477(String str, String str2, long j, int i, int i2, int i3, int[] iArr, TreeMap treeMap) {
        this.f9843 = 2;
        this.f9838 = str;
        this.f9842 = str2;
        this.f9845 = j;
        this.f9840 = 0L;
        this.f9844 = i;
        this.f9841 = i2;
        this.f9847 = i3;
        this.f9846 = iArr;
        this.f9839 = treeMap;
    }

    public C2477(C2193 c2193, int i) {
        this.f9843 = i;
        switch (i) {
            case 1:
                this.f9838 = new C4457();
                this.f9842 = new C4457(AbstractC2793.f10876);
                this.f9846 = c2193;
                this.f9845 = -9223372036854775807L;
                this.f9841 = -1;
                break;
            default:
                this.f9842 = new C4457(AbstractC2793.f10876);
                this.f9846 = c2193;
                this.f9838 = new C4457();
                this.f9845 = -9223372036854775807L;
                this.f9841 = -1;
                break;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    private final void m6603(long j) {
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    private final void m6604(long j) {
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ʽᐧ */
    public void mo6599(long j) {
        int i = this.f9843;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ˑʽ */
    public void mo6600(InterfaceC3177 interfaceC3177, int i) {
        switch (this.f9843) {
            case 0:
                InterfaceC3178 interfaceC3178Mo4851 = interfaceC3177.mo4851(i, 2);
                this.f9839 = interfaceC3178Mo4851;
                int i2 = AbstractC4470.f17202;
                interfaceC3178Mo4851.mo7840(((C2193) this.f9846).f8622);
                break;
            default:
                InterfaceC3178 interfaceC3178Mo48512 = interfaceC3177.mo4851(i, 2);
                this.f9839 = interfaceC3178Mo48512;
                interfaceC3178Mo48512.mo7840(((C2193) this.f9846).f8622);
                break;
        }
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ـﹶ */
    public void mo6601(long j, long j2) {
        switch (this.f9843) {
            case 0:
                this.f9845 = j;
                this.f9847 = 0;
                this.f9840 = j2;
                break;
            default:
                this.f9845 = j;
                this.f9847 = 0;
                this.f9840 = j2;
                break;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int m6605() {
        C4457 c4457 = (C4457) this.f9842;
        c4457.m10108(0);
        int iM10096 = c4457.m10096();
        InterfaceC3178 interfaceC3178 = (InterfaceC3178) this.f9839;
        interfaceC3178.getClass();
        interfaceC3178.mo7841(iM10096, c4457);
        return iM10096;
    }

    @Override // p175.InterfaceC2486
    /* renamed from: ﹳﹳ */
    public void mo6602(C4457 c4457, long j, int i, boolean z) throws ParserException {
        Object obj = this.f9838;
        int i2 = 1;
        switch (this.f9843) {
            case 0:
                try {
                    int i3 = c4457.f17171[0] & 31;
                    AbstractC4464.m10146((InterfaceC3178) this.f9839);
                    if (i3 > 0 && i3 < 24) {
                        int iM10096 = c4457.m10096();
                        this.f9847 = m6605() + this.f9847;
                        ((InterfaceC3178) this.f9839).mo7841(iM10096, c4457);
                        this.f9847 += iM10096;
                        this.f9844 = (c4457.f17171[0] & 31) == 5 ? 1 : 0;
                    } else if (i3 == 24) {
                        c4457.m10086();
                        while (c4457.m10096() > 4) {
                            int iM10100 = c4457.m10100();
                            this.f9847 = m6605() + this.f9847;
                            ((InterfaceC3178) this.f9839).mo7841(iM10100, c4457);
                            this.f9847 += iM10100;
                        }
                        this.f9844 = 0;
                    } else {
                        if (i3 != 28) {
                            throw ParserException.m1095(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i3)), null);
                        }
                        byte[] bArr = c4457.f17171;
                        byte b = bArr[0];
                        byte b2 = bArr[1];
                        int i4 = (b & 224) | (b2 & 31);
                        boolean z2 = (b2 & 128) > 0;
                        boolean z3 = (b2 & 64) > 0;
                        C4457 c44572 = (C4457) obj;
                        if (z2) {
                            this.f9847 = m6605() + this.f9847;
                            byte[] bArr2 = c4457.f17171;
                            bArr2[1] = (byte) i4;
                            c44572.getClass();
                            c44572.m10081(bArr2.length, bArr2);
                            c44572.m10108(1);
                        } else {
                            int iM6189 = C2217.m6189(this.f9841);
                            if (i != iM6189) {
                                int i5 = AbstractC4470.f17202;
                                Locale locale = Locale.US;
                                AbstractC4464.m10144("RtpH264Reader", ˉᵎ.ˋⁱ("Received RTP packet with unexpected sequence number. Expected: ", iM6189, "; received: ", i, ". Dropping packet."));
                            } else {
                                byte[] bArr3 = c4457.f17171;
                                c44572.getClass();
                                c44572.m10081(bArr3.length, bArr3);
                                c44572.m10108(2);
                            }
                        }
                        int iM100962 = c44572.m10096();
                        ((InterfaceC3178) this.f9839).mo7841(iM100962, c44572);
                        this.f9847 += iM100962;
                        if (z3) {
                            this.f9844 = (i4 & 31) == 5 ? 1 : 0;
                        }
                    }
                    if (z) {
                        if (this.f9845 == -9223372036854775807L) {
                            this.f9845 = j;
                        }
                        ((InterfaceC3178) this.f9839).mo7842(ʾˈ.ᵎـ(this.f9840, j, this.f9845, 90000), this.f9844, this.f9847, 0, null);
                        this.f9847 = 0;
                    }
                    this.f9841 = i;
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw ParserException.m1095(null, e);
                }
            default:
                byte[] bArr4 = c4457.f17171;
                if (bArr4.length == 0) {
                    throw ParserException.m1095("Empty RTP data packet.", null);
                }
                int i6 = (bArr4[0] >> 1) & 63;
                AbstractC4464.m10146((InterfaceC3178) this.f9839);
                C4457 c44573 = (C4457) this.f9842;
                if (i6 >= 0 && i6 < 48) {
                    int iM100963 = c4457.m10096();
                    int i7 = this.f9847;
                    c44573.m10108(0);
                    int iM100964 = c44573.m10096();
                    InterfaceC3178 interfaceC3178 = (InterfaceC3178) this.f9839;
                    interfaceC3178.getClass();
                    interfaceC3178.mo7841(iM100964, c44573);
                    this.f9847 = iM100964 + i7;
                    ((InterfaceC3178) this.f9839).mo7841(iM100963, c4457);
                    this.f9847 += iM100963;
                    int i8 = (c4457.f17171[0] >> 1) & 63;
                    if (i8 != 19 && i8 != 20) {
                        i2 = 0;
                    }
                    this.f9844 = i2;
                } else {
                    if (i6 == 48) {
                        throw new UnsupportedOperationException("need to implement processAggregationPacket");
                    }
                    if (i6 != 49) {
                        throw ParserException.m1095(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i6)), null);
                    }
                    byte[] bArr5 = c4457.f17171;
                    if (bArr5.length < 3) {
                        throw ParserException.m1095("Malformed FU header.", null);
                    }
                    int i9 = bArr5[1] & 7;
                    byte b3 = bArr5[2];
                    int i10 = b3 & 63;
                    boolean z4 = (b3 & 128) > 0;
                    boolean z5 = (b3 & 64) > 0;
                    C4457 c44574 = (C4457) obj;
                    if (z4) {
                        int i11 = this.f9847;
                        c44573.m10108(0);
                        int iM100965 = c44573.m10096();
                        InterfaceC3178 interfaceC31782 = (InterfaceC3178) this.f9839;
                        interfaceC31782.getClass();
                        interfaceC31782.mo7841(iM100965, c44573);
                        this.f9847 = iM100965 + i11;
                        byte[] bArr6 = c4457.f17171;
                        bArr6[1] = (byte) ((i10 << 1) & 127);
                        bArr6[2] = (byte) i9;
                        c44574.getClass();
                        c44574.m10081(bArr6.length, bArr6);
                        c44574.m10108(1);
                    } else {
                        int i12 = (this.f9841 + 1) % 65535;
                        if (i != i12) {
                            int i13 = AbstractC4470.f17202;
                            Locale locale2 = Locale.US;
                            AbstractC4464.m10144("RtpH265Reader", ˉᵎ.ˋⁱ("Received RTP packet with unexpected sequence number. Expected: ", i12, "; received: ", i, ". Dropping packet."));
                        } else {
                            c44574.getClass();
                            c44574.m10081(bArr5.length, bArr5);
                            c44574.m10108(3);
                        }
                    }
                    int iM100966 = c44574.m10096();
                    ((InterfaceC3178) this.f9839).mo7841(iM100966, c44574);
                    this.f9847 += iM100966;
                    if (z5) {
                        this.f9844 = (i10 == 19 || i10 == 20) ? 1 : 0;
                    }
                }
                if (z) {
                    if (this.f9845 == -9223372036854775807L) {
                        this.f9845 = j;
                    }
                    ((InterfaceC3178) this.f9839).mo7842(ʾˈ.ᵎـ(this.f9840, j, this.f9845, 90000), this.f9844, this.f9847, 0, null);
                    this.f9847 = 0;
                }
                this.f9841 = i;
                return;
        }
    }
}
