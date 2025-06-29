package p153;

import android.text.SpannableStringBuilder;
import androidx.leanback.widget.ﾞᐧ;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p383.AbstractC4464;
import p383.C4457;
import ˆʽ.ᵎˏ;

/* renamed from: ˊˉ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2325 extends AbstractC2320 {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C2319[] f9225;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C2319 f9226;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int f9227;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public List f9228;

    /* renamed from: ˑי, reason: contains not printable characters */
    public C2324 f9230;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public List f9231;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public int f9232;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C4457 f9229 = new C4457();

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C2324 f9233 = new C2324(3);

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f9224 = -1;

    public C2325(int i, List list) {
        this.f9227 = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.f9225 = new C2319[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f9225[i2] = new C2319();
        }
        this.f9226 = this.f9225[0];
    }

    @Override // p153.AbstractC2320, p312.InterfaceC3585
    public final void flush() {
        super.flush();
        this.f9231 = null;
        this.f9228 = null;
        this.f9232 = 0;
        this.f9226 = this.f9225[0];
        m6412();
        this.f9230 = null;
    }

    @Override // p153.AbstractC2320
    /* renamed from: ˉי */
    public final boolean mo6379() {
        return this.f9231 != this.f9228;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m6411() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p153.C2325.m6411():java.util.List");
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m6412() {
        for (int i = 0; i < 8; i++) {
            this.f9225[i].m6377();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m6413() {
        int i;
        C2324 c2324 = this.f9230;
        if (c2324 == null) {
            return;
        }
        int i2 = 2;
        if (c2324.f9220 != (c2324.f9223 * 2) - 1) {
            AbstractC4464.m10148("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f9230.f9223 * 2) - 1) + ", but current index is " + this.f9230.f9220 + " (sequence number " + this.f9230.f9221 + ");");
        }
        C2324 c23242 = this.f9230;
        byte[] bArr = c23242.f9219;
        int i3 = c23242.f9220;
        C2324 c23243 = this.f9233;
        c23243.m6398(i3, bArr);
        boolean z = false;
        while (true) {
            if (c23243.m6389() > 0) {
                int i4 = 3;
                int iM6410 = c23243.m6410(3);
                int iM64102 = c23243.m6410(5);
                if (iM6410 == 7) {
                    c23243.m6408(i2);
                    iM6410 = c23243.m6410(6);
                    if (iM6410 < 7) {
                        ᵎˏ.ʿˏ(iM6410, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (iM64102 == 0) {
                    if (iM6410 != 0) {
                        AbstractC4464.m10144("Cea708Decoder", "serviceNumber is non-zero (" + iM6410 + ") when blockSize is 0");
                    }
                } else if (iM6410 != this.f9227) {
                    c23243.m6391(iM64102);
                } else {
                    int iM6404 = (iM64102 * 8) + c23243.m6404();
                    while (c23243.m6404() < iM6404) {
                        int iM64103 = c23243.m6410(8);
                        if (iM64103 == 16) {
                            i = iM6404;
                            int iM64104 = c23243.m6410(8);
                            if (iM64104 <= 31) {
                                if (iM64104 > 7) {
                                    if (iM64104 <= 15) {
                                        c23243.m6408(8);
                                    } else if (iM64104 <= 23) {
                                        c23243.m6408(16);
                                    } else if (iM64104 <= 31) {
                                        c23243.m6408(24);
                                    }
                                }
                            } else if (iM64104 <= 127) {
                                if (iM64104 == 32) {
                                    this.f9226.m6375(' ');
                                } else if (iM64104 == 33) {
                                    this.f9226.m6375((char) 160);
                                } else if (iM64104 == 37) {
                                    this.f9226.m6375((char) 8230);
                                } else if (iM64104 == 42) {
                                    this.f9226.m6375((char) 352);
                                } else if (iM64104 == 44) {
                                    this.f9226.m6375((char) 338);
                                } else if (iM64104 == 63) {
                                    this.f9226.m6375((char) 376);
                                } else if (iM64104 == 57) {
                                    this.f9226.m6375((char) 8482);
                                } else if (iM64104 == 58) {
                                    this.f9226.m6375((char) 353);
                                } else if (iM64104 == 60) {
                                    this.f9226.m6375((char) 339);
                                } else if (iM64104 != 61) {
                                    switch (iM64104) {
                                        case 48:
                                            this.f9226.m6375((char) 9608);
                                            break;
                                        case 49:
                                            this.f9226.m6375((char) 8216);
                                            break;
                                        case 50:
                                            this.f9226.m6375((char) 8217);
                                            break;
                                        case 51:
                                            this.f9226.m6375((char) 8220);
                                            break;
                                        case 52:
                                            this.f9226.m6375((char) 8221);
                                            break;
                                        case 53:
                                            this.f9226.m6375((char) 8226);
                                            break;
                                        default:
                                            switch (iM64104) {
                                                case 118:
                                                    this.f9226.m6375((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f9226.m6375((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f9226.m6375((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f9226.m6375((char) 8542);
                                                    break;
                                                case ModuleDescriptor.MODULE_VERSION /* 122 */:
                                                    this.f9226.m6375((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f9226.m6375((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f9226.m6375((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f9226.m6375((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f9226.m6375((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f9226.m6375((char) 9484);
                                                    break;
                                                default:
                                                    ᵎˏ.ʿˏ(iM64104, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                    }
                                } else {
                                    this.f9226.m6375((char) 8480);
                                }
                                z = true;
                            } else if (iM64104 <= 159) {
                                if (iM64104 <= 135) {
                                    c23243.m6408(32);
                                } else if (iM64104 <= 143) {
                                    c23243.m6408(40);
                                } else if (iM64104 <= 159) {
                                    c23243.m6408(2);
                                    c23243.m6408(c23243.m6410(6) * 8);
                                }
                            } else if (iM64104 <= 255) {
                                if (iM64104 == 160) {
                                    this.f9226.m6375((char) 13252);
                                } else {
                                    ᵎˏ.ʿˏ(iM64104, "Invalid G3 character: ", "Cea708Decoder");
                                    this.f9226.m6375('_');
                                }
                                z = true;
                            } else {
                                ᵎˏ.ʿˏ(iM64104, "Invalid extended command: ", "Cea708Decoder");
                            }
                        } else if (iM64103 <= 31) {
                            if (iM64103 != 0) {
                                if (iM64103 == i4) {
                                    this.f9231 = m6411();
                                } else if (iM64103 != 8) {
                                    switch (iM64103) {
                                        case 12:
                                            m6412();
                                            break;
                                        case 13:
                                            this.f9226.m6375('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iM64103 < 17 || iM64103 > 23) {
                                                if (iM64103 < 24 || iM64103 > 31) {
                                                    ᵎˏ.ʿˏ(iM64103, "Invalid C0 command: ", "Cea708Decoder");
                                                    break;
                                                } else {
                                                    AbstractC4464.m10144("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iM64103);
                                                    c23243.m6408(16);
                                                    break;
                                                }
                                            } else {
                                                AbstractC4464.m10144("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iM64103);
                                                c23243.m6408(8);
                                                break;
                                            }
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.f9226.f9161;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                            i = iM6404;
                        } else if (iM64103 <= 127) {
                            if (iM64103 == 127) {
                                this.f9226.m6375((char) 9835);
                            } else {
                                this.f9226.m6375((char) (iM64103 & 255));
                            }
                            i = iM6404;
                            z = true;
                        } else {
                            if (iM64103 <= 159) {
                                C2319[] c2319Arr = this.f9225;
                                switch (iM64103) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        i = iM6404;
                                        int i5 = iM64103 - 128;
                                        if (this.f9232 != i5) {
                                            this.f9232 = i5;
                                            this.f9226 = c2319Arr[i5];
                                            break;
                                        }
                                        break;
                                    case 136:
                                        i = iM6404;
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (c23243.m6399()) {
                                                C2319 c2319 = c2319Arr[8 - i6];
                                                c2319.f9173.clear();
                                                c2319.f9161.clear();
                                                c2319.f9169 = -1;
                                                c2319.f9172 = -1;
                                                c2319.f9178 = -1;
                                                c2319.f9177 = -1;
                                                c2319.f9163 = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        i = iM6404;
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (c23243.m6399()) {
                                                c2319Arr[8 - i7].f9180 = true;
                                            }
                                        }
                                        break;
                                    case 138:
                                        i = iM6404;
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (c23243.m6399()) {
                                                c2319Arr[8 - i8].f9180 = false;
                                            }
                                        }
                                        break;
                                    case 139:
                                        i = iM6404;
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (c23243.m6399()) {
                                                c2319Arr[8 - i9].f9180 = !r1.f9180;
                                            }
                                        }
                                        break;
                                    case 140:
                                        i = iM6404;
                                        for (int i10 = 1; i10 <= 8; i10++) {
                                            if (c23243.m6399()) {
                                                c2319Arr[8 - i10].m6377();
                                            }
                                        }
                                        break;
                                    case 141:
                                        i = iM6404;
                                        c23243.m6408(8);
                                        break;
                                    case 142:
                                        i = iM6404;
                                        break;
                                    case 143:
                                        i = iM6404;
                                        m6412();
                                        break;
                                    case 144:
                                        i = iM6404;
                                        if (!this.f9226.f9171) {
                                            c23243.m6408(16);
                                            break;
                                        } else {
                                            c23243.m6410(4);
                                            c23243.m6410(2);
                                            c23243.m6410(2);
                                            boolean zM6399 = c23243.m6399();
                                            boolean zM63992 = c23243.m6399();
                                            c23243.m6410(3);
                                            c23243.m6410(3);
                                            this.f9226.m6374(zM6399, zM63992);
                                        }
                                    case 145:
                                        i = iM6404;
                                        if (this.f9226.f9171) {
                                            int iM6372 = C2319.m6372(c23243.m6410(2), c23243.m6410(2), c23243.m6410(2), c23243.m6410(2));
                                            int iM63722 = C2319.m6372(c23243.m6410(2), c23243.m6410(2), c23243.m6410(2), c23243.m6410(2));
                                            c23243.m6408(2);
                                            C2319.m6372(c23243.m6410(2), c23243.m6410(2), c23243.m6410(2), 0);
                                            this.f9226.m6376(iM6372, iM63722);
                                        } else {
                                            c23243.m6408(24);
                                        }
                                        break;
                                    case 146:
                                        i = iM6404;
                                        if (this.f9226.f9171) {
                                            c23243.m6408(4);
                                            int iM64105 = c23243.m6410(4);
                                            c23243.m6408(2);
                                            c23243.m6410(6);
                                            C2319 c23192 = this.f9226;
                                            if (c23192.f9163 != iM64105) {
                                                c23192.m6375('\n');
                                            }
                                            c23192.f9163 = iM64105;
                                        } else {
                                            c23243.m6408(16);
                                        }
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        ᵎˏ.ʿˏ(iM64103, "Invalid C1 command: ", "Cea708Decoder");
                                        i = iM6404;
                                        break;
                                    case 151:
                                        i = iM6404;
                                        if (this.f9226.f9171) {
                                            int iM63723 = C2319.m6372(c23243.m6410(2), c23243.m6410(2), c23243.m6410(2), c23243.m6410(2));
                                            c23243.m6410(2);
                                            C2319.m6372(c23243.m6410(2), c23243.m6410(2), c23243.m6410(2), 0);
                                            c23243.m6399();
                                            c23243.m6399();
                                            c23243.m6410(2);
                                            c23243.m6410(2);
                                            int iM64106 = c23243.m6410(2);
                                            c23243.m6408(8);
                                            C2319 c23193 = this.f9226;
                                            c23193.f9176 = iM63723;
                                            c23193.f9168 = iM64106;
                                        } else {
                                            c23243.m6408(32);
                                        }
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i11 = iM64103 - 152;
                                        C2319 c23194 = c2319Arr[i11];
                                        c23243.m6408(i2);
                                        boolean zM63993 = c23243.m6399();
                                        c23243.m6408(i2);
                                        int iM64107 = c23243.m6410(i4);
                                        boolean zM63994 = c23243.m6399();
                                        int iM64108 = c23243.m6410(7);
                                        int iM64109 = c23243.m6410(8);
                                        int iM641010 = c23243.m6410(4);
                                        int iM641011 = c23243.m6410(4);
                                        c23243.m6408(i2);
                                        c23243.m6408(6);
                                        c23243.m6408(i2);
                                        int iM641012 = c23243.m6410(3);
                                        i = iM6404;
                                        int iM641013 = c23243.m6410(3);
                                        c23194.f9171 = true;
                                        c23194.f9180 = zM63993;
                                        c23194.f9162 = iM64107;
                                        c23194.f9174 = zM63994;
                                        c23194.f9175 = iM64108;
                                        c23194.f9170 = iM64109;
                                        c23194.f9181 = iM641010;
                                        int i12 = iM641011 + 1;
                                        if (c23194.f9164 != i12) {
                                            c23194.f9164 = i12;
                                            while (true) {
                                                ArrayList arrayList = c23194.f9173;
                                                if (arrayList.size() >= c23194.f9164 || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iM641012 != 0 && c23194.f9165 != iM641012) {
                                            c23194.f9165 = iM641012;
                                            int i13 = iM641012 - 1;
                                            int i14 = C2319.f9157[i13];
                                            boolean z2 = C2319.f9152[i13];
                                            int i15 = C2319.f9155[i13];
                                            int i16 = C2319.f9158[i13];
                                            int i17 = C2319.f9159[i13];
                                            c23194.f9176 = i14;
                                            c23194.f9168 = i17;
                                        }
                                        if (iM641013 != 0 && c23194.f9166 != iM641013) {
                                            c23194.f9166 = iM641013;
                                            int i18 = iM641013 - 1;
                                            int i19 = C2319.f9154[i18];
                                            int i20 = C2319.f9151[i18];
                                            c23194.m6374(false, false);
                                            c23194.m6376(C2319.f9153, C2319.f9156[i18]);
                                        }
                                        if (this.f9232 != i11) {
                                            this.f9232 = i11;
                                            this.f9226 = c2319Arr[i11];
                                        }
                                        break;
                                }
                            } else {
                                i = iM6404;
                                if (iM64103 <= 255) {
                                    this.f9226.m6375((char) (iM64103 & 255));
                                } else {
                                    ᵎˏ.ʿˏ(iM64103, "Invalid base command: ", "Cea708Decoder");
                                }
                            }
                            z = true;
                        }
                        iM6404 = i;
                        i2 = 2;
                        i4 = 3;
                    }
                }
            }
        }
        if (z) {
            this.f9231 = m6411();
        }
        this.f9230 = null;
    }

    @Override // p153.AbstractC2320
    /* renamed from: ˏᵢ */
    public final void mo6380(C2321 c2321) {
        ByteBuffer byteBuffer = c2321.f13800;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C4457 c4457 = this.f9229;
        c4457.m10081(iLimit, bArrArray);
        while (c4457.m10096() >= 3) {
            int iM10086 = c4457.m10086();
            int i = iM10086 & 3;
            boolean z = (iM10086 & 4) == 4;
            byte bM10086 = (byte) c4457.m10086();
            byte bM100862 = (byte) c4457.m10086();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m6413();
                        int i2 = (bM10086 & 192) >> 6;
                        int i3 = this.f9224;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m6412();
                            AbstractC4464.m10144("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f9224 + " current=" + i2);
                        }
                        this.f9224 = i2;
                        int i4 = bM10086 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C2324 c2324 = new C2324(i2, i4);
                        this.f9230 = c2324;
                        c2324.f9220 = 1;
                        c2324.f9219[0] = bM100862;
                    } else {
                        AbstractC4464.m10142(i == 2);
                        C2324 c23242 = this.f9230;
                        if (c23242 == null) {
                            AbstractC4464.m10134("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = c23242.f9219;
                            int i5 = c23242.f9220;
                            int i6 = i5 + 1;
                            c23242.f9220 = i6;
                            bArr[i5] = bM10086;
                            c23242.f9220 = i5 + 2;
                            bArr[i6] = bM100862;
                        }
                    }
                    C2324 c23243 = this.f9230;
                    if (c23243.f9220 == (c23243.f9223 * 2) - 1) {
                        m6413();
                    }
                }
            }
        }
    }

    @Override // p153.AbstractC2320
    /* renamed from: ᐧʻ */
    public final ﾞᐧ mo6383() {
        List list = this.f9231;
        this.f9228 = list;
        list.getClass();
        return new ﾞᐧ(20, list);
    }
}
