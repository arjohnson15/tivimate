package p323;

import android.util.Pair;
import androidx.media3.common.ParserException;
import p034.AbstractC1227;
import p101.C1778;
import p166.AbstractC2435;
import p208.C2797;
import p254.AbstractC3152;
import p353.AbstractC4010;
import p383.AbstractC4470;
import p383.C4457;

/* renamed from: ᴵˊ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3693 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final byte[] f14217;

    static {
        int i = AbstractC4470.f17202;
        f14217 = "OpusHead".getBytes(AbstractC4010.f15450);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m8649(C4457 c4457) {
        int iM10086 = c4457.m10086();
        int i = iM10086 & 127;
        while ((iM10086 & 128) == 128) {
            iM10086 = c4457.m10086();
            i = (i << 7) | (iM10086 & 127);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0baa  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0d31  */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p230.C3071 m8650(p383.C4457 r64, int r65, int r66, java.lang.String r67, p166.C2405 r68, boolean r69) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 4091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p323.AbstractC3693.m8650(ᵢᵢ.ˋⁱ, int, int, java.lang.String, ˊﹶ.ˉⁱ, boolean):ˑˈ.ٴˎ");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C2797 m8651(C4457 c4457) {
        long jM10094;
        long jM100942;
        c4457.m10108(8);
        if (AbstractC1227.m4399(c4457.m10092()) == 0) {
            jM10094 = c4457.m10110();
            jM100942 = c4457.m10110();
        } else {
            jM10094 = c4457.m10094();
            jM100942 = c4457.m10094();
        }
        return new C2797(jM10094, jM100942, c4457.m10110());
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1778 m8652(int i, C4457 c4457) {
        c4457.m10108(i + 12);
        c4457.m10085(1);
        m8649(c4457);
        c4457.m10085(2);
        int iM10086 = c4457.m10086();
        if ((iM10086 & 128) != 0) {
            c4457.m10085(2);
        }
        if ((iM10086 & 64) != 0) {
            c4457.m10085(c4457.m10086());
        }
        if ((iM10086 & 32) != 0) {
            c4457.m10085(2);
        }
        c4457.m10085(1);
        m8649(c4457);
        String strM6549 = AbstractC2435.m6549(c4457.m10086());
        if ("audio/mpeg".equals(strM6549) || "audio/vnd.dts".equals(strM6549) || "audio/vnd.dts.hd".equals(strM6549)) {
            return new C1778(strM6549, null, -1L, -1L);
        }
        c4457.m10085(4);
        long jM10110 = c4457.m10110();
        long jM101102 = c4457.m10110();
        c4457.m10085(1);
        int iM8649 = m8649(c4457);
        byte[] bArr = new byte[iM8649];
        c4457.m10097(bArr, 0, iM8649);
        return new C1778(strM6549, bArr, jM101102 > 0 ? jM101102 : -1L, jM10110 > 0 ? jM10110 : -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        r5 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x05cc A[SYNTHETIC] */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList m8653(p323.C3692 r44, p254.C3160 r45, long r46, p166.C2405 r48, boolean r49, boolean r50, p353.InterfaceC4019 r51) {
        /*
            Method dump skipped, instructions count: 2370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p323.AbstractC3693.m8653(ᴵˊ.ـﹶ, יי.ˋˊ, long, ˊﹶ.ˉⁱ, boolean, boolean, ᵔʿ.ٴˎ):java.util.ArrayList");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static Pair m8654(C4457 c4457, int i, int i2) throws ParserException {
        Integer num;
        C3686 c3686;
        Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = c4457.f17169;
        while (i5 - i < i2) {
            c4457.m10108(i5);
            int iM10092 = c4457.m10092();
            AbstractC3152.m7803("childAtomSize must be positive", iM10092 > 0);
            if (c4457.m10092() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String strM10105 = null;
                Integer numValueOf = null;
                while (i6 - i5 < iM10092) {
                    c4457.m10108(i6);
                    int iM100922 = c4457.m10092();
                    int iM100923 = c4457.m10092();
                    if (iM100923 == 1718775137) {
                        numValueOf = Integer.valueOf(c4457.m10092());
                    } else if (iM100923 == 1935894637) {
                        c4457.m10085(4);
                        strM10105 = c4457.m10105(4, AbstractC4010.f15450);
                    } else if (iM100923 == 1935894633) {
                        i7 = i6;
                        i8 = iM100922;
                    }
                    i6 += iM100922;
                }
                if ("cenc".equals(strM10105) || "cbc1".equals(strM10105) || "cens".equals(strM10105) || "cbcs".equals(strM10105)) {
                    AbstractC3152.m7803("frma atom is mandatory", numValueOf != null);
                    AbstractC3152.m7803("schi atom is mandatory", i7 != -1);
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            num = numValueOf;
                            c3686 = null;
                            break;
                        }
                        c4457.m10108(i9);
                        int iM100924 = c4457.m10092();
                        if (c4457.m10092() == 1952804451) {
                            int iM4399 = AbstractC1227.m4399(c4457.m10092());
                            c4457.m10085(1);
                            if (iM4399 == 0) {
                                c4457.m10085(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iM10086 = c4457.m10086();
                                int i10 = (iM10086 & 240) >> 4;
                                i3 = iM10086 & 15;
                                i4 = i10;
                            }
                            boolean z = c4457.m10086() == 1;
                            int iM100862 = c4457.m10086();
                            byte[] bArr2 = new byte[16];
                            c4457.m10097(bArr2, 0, 16);
                            if (z && iM100862 == 0) {
                                int iM100863 = c4457.m10086();
                                byte[] bArr3 = new byte[iM100863];
                                c4457.m10097(bArr3, 0, iM100863);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            c3686 = new C3686(z, strM10105, iM100862, bArr2, i4, i3, bArr);
                        } else {
                            i9 += iM100924;
                        }
                    }
                    AbstractC3152.m7803("tenc atom is mandatory", c3686 != null);
                    int i11 = AbstractC4470.f17202;
                    pairCreate = Pair.create(num, c3686);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iM10092;
        }
        return null;
    }
}
