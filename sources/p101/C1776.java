package p101;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import p061.C1389;
import p153.C2324;
import p166.AbstractC2435;
import p166.C2401;
import p166.C2417;
import p166.C2431;
import p193.C2705;
import p254.AbstractC3152;
import p254.C3169;
import p345.AbstractC3980;
import p383.AbstractC4464;
import p383.C4457;
import p456.C5349;
import ˏᵢ.ᵢٴ;

/* renamed from: ˆˏ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1776 extends AbstractC1783 {

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public ᵢٴ f6889;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f6890;

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f6891;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public C1389 f6892;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public C3169 f6893;

    @Override // p101.AbstractC1783
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long mo5496(C4457 c4457) {
        byte b = c4457.f17171[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        C1389 c1389 = this.f6892;
        AbstractC4464.m10146(c1389);
        boolean z = ((C2705[]) c1389.f5669)[(b >> 1) & (255 >>> (8 - c1389.f5664))].f10605;
        C3169 c3169 = (C3169) c1389.f5666;
        int i = !z ? c3169.f12251 : c3169.f12254;
        long j = this.f6891 ? (this.f6890 + i) / 4 : 0;
        byte[] bArr = c4457.f17171;
        int length = bArr.length;
        int i2 = c4457.f17170 + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            c4457.m10081(bArrCopyOf.length, bArrCopyOf);
        } else {
            c4457.m10104(i2);
        }
        byte[] bArr2 = c4457.f17171;
        int i3 = c4457.f17170;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.f6891 = true;
        this.f6890 = i;
        return j;
    }

    /* JADX WARN: Type inference failed for: r1v49, types: [byte[], java.io.Serializable] */
    @Override // p101.AbstractC1783
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean mo5497(C4457 c4457, long j, C5349 c5349) throws ParserException {
        C1389 c1389;
        C3169 c3169;
        C3169 c31692;
        byte[] bArr;
        long jFloor;
        if (this.f6892 != null) {
            ((C2431) c5349.f20756).getClass();
            return false;
        }
        C3169 c31693 = this.f6893;
        int i = 4;
        if (c31693 == null) {
            AbstractC3152.m7824(1, c4457, false);
            c4457.m10101();
            int iM10086 = c4457.m10086();
            int iM10101 = c4457.m10101();
            int iM10083 = c4457.m10083();
            if (iM10083 <= 0) {
                iM10083 = -1;
            }
            int iM100832 = c4457.m10083();
            int i2 = iM100832 <= 0 ? -1 : iM100832;
            c4457.m10083();
            int iM100862 = c4457.m10086();
            int iPow = (int) Math.pow(2.0d, iM100862 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iM100862 & 240) >> 4);
            c4457.m10086();
            ?? CopyOf = Arrays.copyOf(c4457.f17171, c4457.f17170);
            C3169 c31694 = new C3169();
            c31694.f12253 = iM10086;
            c31694.f12250 = iM10101;
            c31694.f12252 = iM10083;
            c31694.f12256 = i2;
            c31694.f12251 = iPow;
            c31694.f12254 = iPow2;
            c31694.f12255 = CopyOf;
            this.f6893 = c31694;
        } else {
            ᵢٴ r8 = this.f6889;
            if (r8 == null) {
                this.f6889 = AbstractC3152.m7807(c4457, true, true);
            } else {
                int i3 = c4457.f17170;
                byte[] bArr2 = new byte[i3];
                System.arraycopy(c4457.f17171, 0, bArr2, 0, i3);
                int i4 = 5;
                AbstractC3152.m7824(5, c4457, false);
                int iM100863 = c4457.m10086() + 1;
                C2324 c2324 = new C2324(c4457.f17171);
                c2324.m6408(c4457.f17169 * 8);
                int i5 = 0;
                while (true) {
                    int i6 = 2;
                    int i7 = 16;
                    if (i5 >= iM100863) {
                        C3169 c31695 = c31693;
                        byte[] bArr3 = bArr2;
                        int i8 = 6;
                        int iM6410 = c2324.m6410(6) + 1;
                        for (int i9 = 0; i9 < iM6410; i9++) {
                            if (c2324.m6410(16) != 0) {
                                throw ParserException.m1097("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iM64102 = c2324.m6410(6) + 1;
                        int i10 = 0;
                        while (true) {
                            int i11 = 3;
                            if (i10 < iM64102) {
                                int iM64103 = c2324.m6410(i7);
                                if (iM64103 == 0) {
                                    int i12 = 8;
                                    c2324.m6408(8);
                                    c2324.m6408(16);
                                    c2324.m6408(16);
                                    c2324.m6408(6);
                                    c2324.m6408(8);
                                    int iM64104 = c2324.m6410(4) + 1;
                                    int i13 = 0;
                                    while (i13 < iM64104) {
                                        c2324.m6408(i12);
                                        i13++;
                                        i12 = 8;
                                    }
                                } else {
                                    if (iM64103 != 1) {
                                        throw ParserException.m1097("floor type greater than 1 not decodable: " + iM64103, null);
                                    }
                                    int iM64105 = c2324.m6410(5);
                                    int[] iArr = new int[iM64105];
                                    int i14 = -1;
                                    for (int i15 = 0; i15 < iM64105; i15++) {
                                        int iM64106 = c2324.m6410(4);
                                        iArr[i15] = iM64106;
                                        if (iM64106 > i14) {
                                            i14 = iM64106;
                                        }
                                    }
                                    int i16 = i14 + 1;
                                    int[] iArr2 = new int[i16];
                                    int i17 = 0;
                                    while (i17 < i16) {
                                        iArr2[i17] = c2324.m6410(i11) + 1;
                                        int iM64107 = c2324.m6410(i6);
                                        int i18 = 8;
                                        if (iM64107 > 0) {
                                            c2324.m6408(8);
                                        }
                                        int i19 = 0;
                                        while (i19 < (1 << iM64107)) {
                                            c2324.m6408(i18);
                                            i19++;
                                            i18 = 8;
                                        }
                                        i17++;
                                        i11 = 3;
                                        i6 = 2;
                                    }
                                    c2324.m6408(2);
                                    int iM64108 = c2324.m6410(4);
                                    int i20 = 0;
                                    int i21 = 0;
                                    for (int i22 = 0; i22 < iM64105; i22++) {
                                        i20 += iArr2[iArr[i22]];
                                        while (i21 < i20) {
                                            c2324.m6408(iM64108);
                                            i21++;
                                        }
                                    }
                                }
                                i10++;
                                i8 = 6;
                                i7 = 16;
                                i6 = 2;
                            } else {
                                int iM64109 = c2324.m6410(i8) + 1;
                                int i23 = 0;
                                while (i23 < iM64109) {
                                    if (c2324.m6410(16) > 2) {
                                        throw ParserException.m1097("residueType greater than 2 is not decodable", null);
                                    }
                                    c2324.m6408(24);
                                    c2324.m6408(24);
                                    c2324.m6408(24);
                                    int iM641010 = c2324.m6410(i8) + 1;
                                    int i24 = 8;
                                    c2324.m6408(8);
                                    int[] iArr3 = new int[iM641010];
                                    for (int i25 = 0; i25 < iM641010; i25++) {
                                        iArr3[i25] = ((c2324.m6399() ? c2324.m6410(5) : 0) * 8) + c2324.m6410(3);
                                    }
                                    int i26 = 0;
                                    while (i26 < iM641010) {
                                        int i27 = 0;
                                        while (i27 < i24) {
                                            if ((iArr3[i26] & (1 << i27)) != 0) {
                                                c2324.m6408(i24);
                                            }
                                            i27++;
                                            i24 = 8;
                                        }
                                        i26++;
                                        i24 = 8;
                                    }
                                    i23++;
                                    i8 = 6;
                                }
                                int iM641011 = c2324.m6410(i8) + 1;
                                int i28 = 0;
                                while (i28 < iM641011) {
                                    int iM641012 = c2324.m6410(16);
                                    if (iM641012 != 0) {
                                        AbstractC4464.m10134("VorbisUtil", "mapping type other than 0 not supported: " + iM641012);
                                        c3169 = c31695;
                                    } else {
                                        int iM641013 = c2324.m6399() ? c2324.m6410(4) + 1 : 1;
                                        boolean zM6399 = c2324.m6399();
                                        c3169 = c31695;
                                        int i29 = c3169.f12253;
                                        if (zM6399) {
                                            int iM641014 = c2324.m6410(8) + 1;
                                            for (int i30 = 0; i30 < iM641014; i30++) {
                                                int i31 = i29 - 1;
                                                c2324.m6408(AbstractC3152.m7818(i31));
                                                c2324.m6408(AbstractC3152.m7818(i31));
                                            }
                                        }
                                        if (c2324.m6410(2) != 0) {
                                            throw ParserException.m1097("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iM641013 > 1) {
                                            for (int i32 = 0; i32 < i29; i32++) {
                                                c2324.m6408(4);
                                            }
                                        }
                                        for (int i33 = 0; i33 < iM641013; i33++) {
                                            c2324.m6408(8);
                                            c2324.m6408(8);
                                            c2324.m6408(8);
                                        }
                                    }
                                    i28++;
                                    c31695 = c3169;
                                }
                                C3169 c31696 = c31695;
                                int iM641015 = c2324.m6410(6);
                                int i34 = iM641015 + 1;
                                C2705[] c2705Arr = new C2705[i34];
                                for (int i35 = 0; i35 < i34; i35++) {
                                    boolean zM63992 = c2324.m6399();
                                    c2324.m6410(16);
                                    c2324.m6410(16);
                                    c2324.m6410(8);
                                    C2705 c2705 = new C2705();
                                    c2705.f10605 = zM63992;
                                    c2705Arr[i35] = c2705;
                                }
                                if (!c2324.m6399()) {
                                    throw ParserException.m1097("framing bit after modes not set as expected", null);
                                }
                                c1389 = new C1389(c31696, r8, bArr3, c2705Arr, AbstractC3152.m7818(iM641015));
                            }
                        }
                    } else {
                        if (c2324.m6410(24) != 5653314) {
                            throw ParserException.m1097("expected code book to start with [0x56, 0x43, 0x42] at " + ((c2324.f9223 * 8) + c2324.f9220), null);
                        }
                        int iM641016 = c2324.m6410(16);
                        int iM641017 = c2324.m6410(24);
                        if (c2324.m6399()) {
                            c2324.m6408(i4);
                            for (int iM641018 = 0; iM641018 < iM641017; iM641018 += c2324.m6410(AbstractC3152.m7818(iM641017 - iM641018))) {
                            }
                        } else {
                            boolean zM63993 = c2324.m6399();
                            for (int i36 = 0; i36 < iM641017; i36++) {
                                if (!zM63993) {
                                    c2324.m6408(i4);
                                } else if (c2324.m6399()) {
                                    c2324.m6408(i4);
                                }
                            }
                        }
                        int iM641019 = c2324.m6410(i);
                        if (iM641019 > 2) {
                            throw ParserException.m1097("lookup type greater than 2 not decodable: " + iM641019, null);
                        }
                        if (iM641019 == 1 || iM641019 == 2) {
                            c2324.m6408(32);
                            c2324.m6408(32);
                            int iM641020 = c2324.m6410(i) + 1;
                            c2324.m6408(1);
                            if (iM641019 != 1) {
                                c31692 = c31693;
                                bArr = bArr2;
                                jFloor = iM641017 * iM641016;
                            } else if (iM641016 != 0) {
                                c31692 = c31693;
                                bArr = bArr2;
                                jFloor = (long) Math.floor(Math.pow(iM641017, 1.0d / iM641016));
                            } else {
                                c31692 = c31693;
                                bArr = bArr2;
                                jFloor = 0;
                            }
                            c2324.m6408((int) (jFloor * iM641020));
                        } else {
                            c31692 = c31693;
                            bArr = bArr2;
                        }
                        i5++;
                        c31693 = c31692;
                        bArr2 = bArr;
                        i = 4;
                        i4 = 5;
                    }
                }
            }
        }
        c1389 = null;
        this.f6892 = c1389;
        if (c1389 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        C3169 c31697 = (C3169) c1389.f5666;
        arrayList.add((byte[]) c31697.f12255);
        arrayList.add((byte[]) c1389.f5665);
        C2401 c2401M7819 = AbstractC3152.m7819(AbstractC3980.m9210((String[]) ((ᵢٴ) c1389.f5667).ˆʿ));
        C2417 c2417 = new C2417();
        c2417.f9602 = AbstractC2435.m6559("audio/vorbis");
        c2417.f9616 = c31697.f12256;
        c2417.f9610 = c31697.f12252;
        c2417.f9624 = c31697.f12253;
        c2417.f9600 = c31697.f12250;
        c2417.f9609 = arrayList;
        c2417.f9601 = c2401M7819;
        c5349.f20756 = new C2431(c2417);
        return true;
    }

    @Override // p101.AbstractC1783
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo5498(long j) {
        this.f6919 = j;
        this.f6891 = j != 0;
        C3169 c3169 = this.f6893;
        this.f6890 = c3169 != null ? c3169.f12251 : 0;
    }

    @Override // p101.AbstractC1783
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo5499(boolean z) {
        super.mo5499(z);
        if (z) {
            this.f6892 = null;
            this.f6893 = null;
            this.f6889 = null;
        }
        this.f6890 = 0;
        this.f6891 = false;
    }
}
