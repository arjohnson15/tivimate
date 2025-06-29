package p323;

import android.support.v4.media.session.AbstractC0002;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p166.AbstractC2435;
import p166.C2405;
import p166.C2413;
import p166.C2417;
import p166.C2431;
import p208.AbstractC2793;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3173;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p260.C3222;
import p331.C3767;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;
import p383.C4458;
import p397.InterfaceC4603;
import p424.C4904;

/* renamed from: ᴵˊ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3683 implements InterfaceC3165 {

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final byte[] f14118 = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final C2431 f14119;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f14120;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public int f14122;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f14123;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f14124;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public long f14125;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C4457 f14126;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public InterfaceC3178[] f14128;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public C4457 f14129;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f14131;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public int f14132;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C4458 f14133;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3697 f14136;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final C4904 f14137;

    /* renamed from: יʻ, reason: contains not printable characters */
    public long f14138;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f14139;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC4603 f14140;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f14143;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C3700 f14144;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public int f14146;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public C3932 f14147;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public InterfaceC3177 f14148;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public long f14149;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public long f14150;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final List f14151;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public InterfaceC3178[] f14152;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final byte[] f14153;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public int f14154;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public long f14155;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C3767 f14127 = new C3767(11);

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C4457 f14130 = new C4457(16);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4457 f14141 = new C4457(AbstractC2793.f10876);

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C4457 f14142 = new C4457(5);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C4457 f14135 = new C4457();

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final ArrayDeque f14145 = new ArrayDeque();

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final ArrayDeque f14134 = new ArrayDeque();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final SparseArray f14121 = new SparseArray();

    static {
        C2417 c2417 = new C2417();
        c2417.f9602 = AbstractC2435.m6559("application/x-emsg");
        f14119 = new C2431(c2417);
    }

    public C3683(InterfaceC4603 interfaceC4603, int i, C4458 c4458, C3697 c3697, List list, C4904 c4904) {
        this.f14140 = interfaceC4603;
        this.f14120 = i;
        this.f14133 = c4458;
        this.f14136 = c3697;
        this.f14151 = DesugarCollections.unmodifiableList(list);
        this.f14137 = c4904;
        byte[] bArr = new byte[16];
        this.f14153 = bArr;
        this.f14126 = new C4457(bArr);
        C3928 c3928 = AbstractC3980.f15360;
        this.f14147 = C3932.f15274;
        this.f14150 = -9223372036854775807L;
        this.f14138 = -9223372036854775807L;
        this.f14125 = -9223372036854775807L;
        this.f14148 = InterfaceC3177.f12275;
        this.f14152 = new InterfaceC3178[0];
        this.f14128 = new InterfaceC3178[0];
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C2405 m8631(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            C3681 c3681 = (C3681) arrayList.get(i);
            if (c3681.f5033 == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = c3681.f14112.f17171;
                ᐧʻ r6 = AbstractC3691.m8640(bArr);
                UUID uuid = r6 == null ? null : (UUID) r6.ˎˑ;
                if (uuid == null) {
                    AbstractC4464.m10144("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C2413(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C2405(null, false, (C2413[]) arrayList2.toArray(new C2413[0]));
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m8632(C4457 c4457, int i, C3696 c3696) throws ParserException {
        c4457.m10108(i + 8);
        int iM10092 = c4457.m10092();
        if ((iM10092 & 1) != 0) {
            throw ParserException.m1096("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM10092 & 2) != 0;
        int iM10106 = c4457.m10106();
        if (iM10106 == 0) {
            Arrays.fill(c3696.f14227, 0, c3696.f14225, false);
            return;
        }
        if (iM10106 != c3696.f14225) {
            StringBuilder sbM40 = AbstractC0002.m40(iM10106, "Senc sample count ", " is different from fragment sample count");
            sbM40.append(c3696.f14225);
            throw ParserException.m1097(sbM40.toString(), null);
        }
        Arrays.fill(c3696.f14227, 0, iM10106, z);
        int iM10096 = c4457.m10096();
        C4457 c44572 = c3696.f14237;
        c44572.m10099(iM10096);
        c3696.f14229 = true;
        c3696.f14230 = true;
        c4457.m10097(c44572.f17171, 0, c44572.f17170);
        c44572.m10108(0);
        c3696.f14230 = false;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) {
        C3932 c3932M9207;
        InterfaceC3173 interfaceC3173M8639 = AbstractC3691.m8639(interfaceC3168, true, false);
        if (interfaceC3173M8639 != null) {
            c3932M9207 = AbstractC3980.m9207(interfaceC3173M8639);
        } else {
            C3928 c3928 = AbstractC3980.f15360;
            c3932M9207 = C3932.f15274;
        }
        this.f14147 = c3932M9207;
        return interfaceC3173M8639 == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ef, code lost:
    
        if ("video/hevc".equals(r2) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f7, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f9, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fb, code lost:
    
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fe, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ff, code lost:
    
        r30.f14124 = r2;
        r30.f14131 += 5;
        r30.f14123 += r8;
        r4 = r19;
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0210, code lost:
    
        r13 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021b, code lost:
    
        throw androidx.media3.common.ParserException.m1097("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021c, code lost:
    
        r19 = r4;
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0223, code lost:
    
        if (r30.f14124 == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0225, code lost:
    
        r4 = r30.f14135;
        r4.m10099(r2);
        r23 = r8;
        r24 = r14;
        ((p254.C3159) r31).mo4876(r4.f17171, 0, r30.f14143, false);
        r11.mo7841(r30.f14143, r4);
        r2 = r30.f14143;
        r5 = p208.AbstractC2793.m7075(r4.f17170, r4.f17171);
        r4.m10108("video/hevc".equals(r13.f9667) ? 1 : 0);
        r4.m10104(r5);
        p254.AbstractC3152.m7816(r9, r4, r30.f14128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x025a, code lost:
    
        r23 = r8;
        r24 = r14;
        r2 = r11.mo7843(r31, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0263, code lost:
    
        r30.f14131 += r2;
        r30.f14143 -= r2;
        r4 = r19;
        r5 = r22;
        r8 = r23;
        r14 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0276, code lost:
    
        r29 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0279, code lost:
    
        r29 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027b, code lost:
    
        r2 = r30.f14131;
        r4 = r30.f14123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x027f, code lost:
    
        if (r2 >= r4) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0281, code lost:
    
        r30.f14131 += r11.mo7843(r31, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x028f, code lost:
    
        if (r3.f14263 != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0291, code lost:
    
        r1 = r3.f14270.f14258[r3.f14268];
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a0, code lost:
    
        if (r7.f14226[r3.f14268] == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a2, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a4, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a9, code lost:
    
        if (r3.m8658() == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ab, code lost:
    
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ae, code lost:
    
        r25 = r1;
        r1 = r3.m8658();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b4, code lost:
    
        if (r1 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b6, code lost:
    
        r28 = r1.f14190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02bb, code lost:
    
        r28 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02bd, code lost:
    
        r11.mo7842(r9, r25, r30.f14123, 0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ce, code lost:
    
        if (r12.isEmpty() != false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d0, code lost:
    
        r1 = (p323.C3689) r12.removeFirst();
        r30.f14154 -= r1.f14202;
        r2 = r1.f14201;
        r4 = r1.f14203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e1, code lost:
    
        if (r2 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e3, code lost:
    
        r4 = r4 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e4, code lost:
    
        r2 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e6, code lost:
    
        if (r29 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e8, code lost:
    
        r4 = r2.m10116(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ec, code lost:
    
        r6 = r30.f14152;
        r7 = r6.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f0, code lost:
    
        if (r8 >= r7) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f2, code lost:
    
        r6[r8].mo7842(r4, 1, r1.f14202, r30.f14154, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0308, code lost:
    
        r29 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x030f, code lost:
    
        if (r3.m8656() != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0311, code lost:
    
        r30.f14144 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0314, code lost:
    
        r30.f14132 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        r4 = r30.f14132;
        r7 = r3.f14260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        if (r4 != 3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        if (r3.f14263 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        r4 = r3.f14270.f14259[r3.f14268];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
    
        r4 = r7.f14231[r3.f14268];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        r30.f14123 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        if (r3.f14268 >= r3.f14271) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        ((p254.C3159) r31).mo4854(r4);
        r1 = r3.m8658();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        if (r1 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        r2 = r7.f14237;
        r1 = r1.f14192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
    
        if (r1 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ee, code lost:
    
        r2.m10085(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f1, code lost:
    
        r1 = r3.f14268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f5, code lost:
    
        if (r7.f14229 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fb, code lost:
    
        if (r7.f14227[r1] == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fd, code lost:
    
        r2.m10085(r2.m10100() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
    
        if (r3.m8656() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010c, code lost:
    
        r30.f14144 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010f, code lost:
    
        r30.f14132 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0112, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011b, code lost:
    
        if (r3.f14270.f14256.f14249 != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011d, code lost:
    
        r30.f14123 = r4 - 8;
        ((p254.C3159) r31).mo4854(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0136, code lost:
    
        if ("audio/ac4".equals(r3.f14270.f14256.f14248.f9667) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0138, code lost:
    
        r30.f14131 = r3.m8657(r30.f14123, 7);
        r4 = r30.f14123;
        r9 = r30.f14126;
        p254.AbstractC3152.m7823(r4, r9);
        r3.f14267.mo7841(7, r9);
        r30.f14131 += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0153, code lost:
    
        r30.f14131 = r3.m8657(r30.f14123, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015b, code lost:
    
        r30.f14123 += r30.f14131;
        r30.f14132 = 4;
        r30.f14143 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0167, code lost:
    
        r4 = r3.f14270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016b, code lost:
    
        if (r3.f14263 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
    
        r9 = r4.f14257[r3.f14268];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0174, code lost:
    
        r9 = r7.f14240[r3.f14268];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017b, code lost:
    
        if (r13 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017d, code lost:
    
        r9 = r13.m10116(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0181, code lost:
    
        r4 = r4.f14256;
        r8 = r4.f14243;
        r11 = r3.f14267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0187, code lost:
    
        if (r8 == 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0189, code lost:
    
        r14 = r30.f14142;
        r15 = r14.f17171;
        r15[0] = 0;
        r15[1] = 0;
        r15[2] = 0;
        r5 = r8 + 1;
        r8 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019f, code lost:
    
        if (r30.f14131 >= r30.f14123) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a1, code lost:
    
        r2 = r30.f14143;
        r29 = r13;
        r13 = r4.f14248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a9, code lost:
    
        if (r2 != 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ab, code lost:
    
        r19 = r4;
        ((p254.C3159) r31).mo4876(r15, r8, r5, false);
        r14.m10108(0);
        r2 = r14.m10092();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bc, code lost:
    
        if (r2 < 1) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01be, code lost:
    
        r30.f14143 = r2 - 1;
        r2 = r30.f14141;
        r2.m10108(0);
        r11.mo7841(4, r2);
        r11.mo7841(1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d2, code lost:
    
        if (r30.f14128.length <= 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d4, code lost:
    
        r2 = r13.f9667;
        r13 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        if ("video/avc".equals(r2) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e0, code lost:
    
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e5, code lost:
    
        if ((r13 & 31) == 6) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e8, code lost:
    
        r22 = r5;
     */
    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo4075(p254.InterfaceC3168 r31, p166.C2430 r32) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p323.C3683.mo4075(יי.ˑי, ˊﹶ.ᵎˏ):int");
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        return this.f14147;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        SparseArray sparseArray = this.f14121;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C3700) sparseArray.valueAt(i)).m8659();
        }
        this.f14134.clear();
        this.f14154 = 0;
        this.f14138 = j2;
        this.f14145.clear();
        this.f14132 = 0;
        this.f14122 = 0;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        int i;
        int i2 = this.f14120;
        InterfaceC3177 c3222 = (i2 & 32) == 0 ? new C3222(interfaceC3177, this.f14140) : interfaceC3177;
        this.f14148 = c3222;
        this.f14132 = 0;
        this.f14122 = 0;
        InterfaceC3178[] interfaceC3178Arr = new InterfaceC3178[2];
        this.f14152 = interfaceC3178Arr;
        C4904 c4904 = this.f14137;
        if (c4904 != null) {
            interfaceC3178Arr[0] = c4904;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((i2 & 4) != 0) {
            interfaceC3178Arr[i] = c3222.mo4851(100, 5);
            i3 = 101;
            i++;
        }
        InterfaceC3178[] interfaceC3178Arr2 = (InterfaceC3178[]) AbstractC4470.m10205(i, this.f14152);
        this.f14152 = interfaceC3178Arr2;
        for (InterfaceC3178 interfaceC3178 : interfaceC3178Arr2) {
            interfaceC3178.mo7840(f14119);
        }
        List list = this.f14151;
        this.f14128 = new InterfaceC3178[list.size()];
        int i4 = 0;
        while (i4 < this.f14128.length) {
            InterfaceC3178 interfaceC3178Mo4851 = this.f14148.mo4851(i3, 3);
            interfaceC3178Mo4851.mo7840((C2431) list.get(i4));
            this.f14128[i4] = interfaceC3178Mo4851;
            i4++;
            i3++;
        }
        C3697 c3697 = this.f14136;
        if (c3697 != null) {
            this.f14121.put(0, new C3700(interfaceC3177.mo4851(0, c3697.f14241), new C3698(this.f14136, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C3694(0, 0, 0, 0)));
            this.f14148.mo4850();
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:359:0x07eb, code lost:
    
        r5 = r0;
        r5.f14132 = 0;
        r5.f14122 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x07f1, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03dc  */
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8633(long r54) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p323.C3683.m8633(long):void");
    }
}
