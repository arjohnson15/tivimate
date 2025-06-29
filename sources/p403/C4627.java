package p403;

import java.util.Arrays;
import p166.AbstractC2435;
import p166.C2417;
import p166.C2431;
import p345.AbstractC3962;
import p345.AbstractC3968;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p353.AbstractC4010;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import ˆʽ.ᵎˏ;

/* renamed from: ﹳ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4627 implements InterfaceC4626 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f17726;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3932 f17727;

    public C4627(int i, C3932 c3932) {
        this.f17726 = i;
        this.f17727 = c3932;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C4627 m10513(int i, C4457 c4457) {
        String str;
        InterfaceC4626 c4625;
        int i2 = 4;
        AbstractC3968.m9177(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = c4457.f17170;
        int i4 = 0;
        int i5 = -2;
        int i6 = 0;
        while (c4457.m10096() > 8) {
            int iM10083 = c4457.m10083();
            int iM100832 = c4457.f17169 + c4457.m10083();
            c4457.m10104(iM100832);
            if (iM10083 != 1414744396) {
                C4628 c4628 = null;
                switch (iM10083) {
                    case 1718776947:
                        if (i5 == 2) {
                            c4457.m10085(i2);
                            int iM100833 = c4457.m10083();
                            int iM100834 = c4457.m10083();
                            c4457.m10085(i2);
                            int iM100835 = c4457.m10083();
                            switch (iM100835) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                ᵎˏ.ʿˏ(iM100835, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                            } else {
                                C2417 c2417 = new C2417();
                                c2417.f9607 = iM100833;
                                c2417.f9620 = iM100834;
                                c2417.m6523(str);
                                c4628 = new C4628(new C2431(c2417));
                            }
                        } else if (i5 == 1) {
                            int iM10091 = c4457.m10091();
                            String str2 = iM10091 != 1 ? iM10091 != 85 ? iM10091 != 255 ? iM10091 != 8192 ? iM10091 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 == null) {
                                ᵎˏ.ʿˏ(iM10091, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                            } else {
                                int iM100912 = c4457.m10091();
                                int iM100836 = c4457.m10083();
                                c4457.m10085(6);
                                int iM10198 = AbstractC4470.m10198(c4457.m10091());
                                int iM100913 = c4457.m10096() > 0 ? c4457.m10091() : 0;
                                byte[] bArr = new byte[iM100913];
                                c4457.m10097(bArr, i4, iM100913);
                                C2417 c24172 = new C2417();
                                c24172.f9602 = AbstractC2435.m6559(str2);
                                c24172.f9624 = iM100912;
                                c24172.f9600 = iM100836;
                                if ("audio/raw".equals(str2) && iM10198 != 0) {
                                    c24172.f9618 = iM10198;
                                }
                                if ("audio/mp4a-latm".equals(str2) && iM100913 > 0) {
                                    c24172.f9609 = AbstractC3980.m9207(bArr);
                                }
                                c4628 = new C4628(new C2431(c24172));
                            }
                        } else {
                            AbstractC4464.m10144("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + AbstractC4470.m10176(i5));
                        }
                        c4625 = c4628;
                        break;
                    case 1751742049:
                        int iM100837 = c4457.m10083();
                        c4457.m10085(8);
                        int iM100838 = c4457.m10083();
                        int iM100839 = c4457.m10083();
                        c4457.m10085(i2);
                        c4457.m10083();
                        c4457.m10085(12);
                        c4625 = new C4625(iM100837, iM100838, iM100839);
                        break;
                    case 1752331379:
                        int iM1008310 = c4457.m10083();
                        c4457.m10085(12);
                        c4457.m10083();
                        int iM1008311 = c4457.m10083();
                        int iM1008312 = c4457.m10083();
                        c4457.m10085(i2);
                        int iM1008313 = c4457.m10083();
                        int iM1008314 = c4457.m10083();
                        c4457.m10085(8);
                        c4625 = new C4629(iM1008310, iM1008311, iM1008312, iM1008313, iM1008314);
                        break;
                    case 1852994675:
                        c4625 = new C4624(c4457.m10105(c4457.m10096(), AbstractC4010.f15450));
                        break;
                    default:
                        c4625 = c4628;
                        break;
                }
            } else {
                c4625 = m10513(c4457.m10083(), c4457);
            }
            if (c4625 != null) {
                if (c4625.mo10512() == 1752331379) {
                    int i7 = ((C4629) c4625).f17732;
                    if (i7 == 1935960438) {
                        i5 = 2;
                    } else if (i7 == 1935963489) {
                        i5 = 1;
                    } else if (i7 != 1937012852) {
                        AbstractC4464.m10144("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i7));
                        i5 = -1;
                    } else {
                        i5 = 3;
                    }
                }
                int i8 = i6 + 1;
                if (objArrCopyOf.length < i8) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC3962.m9169(objArrCopyOf.length, i8));
                }
                objArrCopyOf[i6] = c4625;
                i6 = i8;
            }
            c4457.m10108(iM100832);
            c4457.m10104(i3);
            i2 = 4;
            i4 = 0;
        }
        return new C4627(i, AbstractC3980.m9206(i6, objArrCopyOf));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC4626 m10514(Class cls) {
        C3928 c3928ListIterator = this.f17727.listIterator(0);
        while (c3928ListIterator.hasNext()) {
            InterfaceC4626 interfaceC4626 = (InterfaceC4626) c3928ListIterator.next();
            if (interfaceC4626.getClass() == cls) {
                return interfaceC4626;
            }
        }
        return null;
    }

    @Override // p403.InterfaceC4626
    /* renamed from: ـﹶ */
    public final int mo10512() {
        return this.f17726;
    }
}
