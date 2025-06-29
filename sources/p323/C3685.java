package p323;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p179.C2495;
import p208.AbstractC2793;
import p254.C3182;
import p254.InterfaceC3157;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3173;
import p254.InterfaceC3177;
import p260.C3222;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4470;
import p383.C4457;
import p397.InterfaceC4603;

/* renamed from: ᴵˊ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3685 implements InterfaceC3165, InterfaceC3157 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f14161;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4457 f14162;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public InterfaceC3177 f14163;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public C2495 f14164;

    /* renamed from: ˉי, reason: contains not printable characters */
    public C3932 f14165;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f14166;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public C3684[] f14167;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public long f14168;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public int f14169;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f14170;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public C4457 f14171;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C3688 f14172;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 f14173;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f14174;

    /* renamed from: יʻ, reason: contains not printable characters */
    public long f14175;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC4603 f14176;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4457 f14177;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ArrayDeque f14178;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f14179;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public int f14180;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public int f14181;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public boolean f14182;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public int f14183;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4457 f14184;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final ArrayList f14185;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public int f14186;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public long[][] f14187;

    public C3685(InterfaceC4603 interfaceC4603, int i) {
        this.f14176 = interfaceC4603;
        this.f14161 = i;
        C3928 c3928 = AbstractC3980.f15360;
        this.f14165 = C3932.f15274;
        this.f14170 = (i & 4) != 0 ? 3 : 0;
        this.f14172 = new C3688();
        this.f14185 = new ArrayList();
        this.f14177 = new C4457(16);
        this.f14178 = new ArrayDeque();
        this.f14173 = new C4457(AbstractC2793.f10876);
        this.f14184 = new C4457(4);
        this.f14162 = new C4457();
        this.f14174 = -1;
        this.f14163 = InterfaceC3177.f12275;
        this.f14167 = new C3684[0];
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) {
        C3932 c3932M9207;
        InterfaceC3173 interfaceC3173M8639 = AbstractC3691.m8639(interfaceC3168, false, (this.f14161 & 2) != 0);
        if (interfaceC3173M8639 != null) {
            c3932M9207 = AbstractC3980.m9207(interfaceC3173M8639);
        } else {
            C3928 c3928 = AbstractC3980.f15360;
            c3932M9207 = C3932.f15274;
        }
        this.f14165 = c3932M9207;
        return interfaceC3173M8639 == null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x047a, code lost:
    
        r5 = r39.f14179;
        r6 = r39.f14177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0482, code lost:
    
        if (r5 != 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x048d, code lost:
    
        if (r40.mo4876(r6.f17171, 0, 8, true) != false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0492, code lost:
    
        if (r39.f14183 != 2) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0497, code lost:
    
        if ((r39.f14161 & 2) == 0) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0499, code lost:
    
        r0 = r39.f14163.mo4851(0, 4);
        r2 = r39.f14164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04a2, code lost:
    
        if (r2 != null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04a4, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04a6, code lost:
    
        r13 = new p166.C2401(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04b0, code lost:
    
        r2 = new p166.C2417();
        r2.f9601 = r13;
        ᵎﹳ.ᐧʻ.ˋˊ(r2, r0);
        r39.f14163.mo4850();
        r39.f14163.mo4858(new p254.C3176(-9223372036854775807L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04ce, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x04d0, code lost:
    
        r39.f14179 = 8;
        r6.m10108(0);
        r39.f14168 = r6.m10110();
        r39.f14166 = r6.m10092();
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04e9, code lost:
    
        r9 = r39.f14168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04ef, code lost:
    
        if (r9 != 1) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04f1, code lost:
    
        r40.readFully(r6.f17171, 8, 8);
        r39.f14179 += 8;
        r39.f14168 = r6.m10082();
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0508, code lost:
    
        if (r9 != 0) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x050a, code lost:
    
        r9 = r40.mo4861();
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0510, code lost:
    
        if (r9 != (-1)) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0512, code lost:
    
        r11 = (p323.C3692) r12.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0518, code lost:
    
        if (r11 == null) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x051a, code lost:
    
        r9 = r11.f14215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x051e, code lost:
    
        if (r9 == (-1)) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0520, code lost:
    
        r39.f14168 = (r9 - r40.mo4869()) + r39.f14179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x052b, code lost:
    
        r9 = r39.f14168;
        r11 = r39.f14179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0532, code lost:
    
        if (r9 < r11) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0534, code lost:
    
        r9 = r39.f14166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x053f, code lost:
    
        if (r9 == 1836019574) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0544, code lost:
    
        if (r9 == 1953653099) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0549, code lost:
    
        if (r9 == 1835297121) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x054e, code lost:
    
        if (r9 == 1835626086) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0553, code lost:
    
        if (r9 == 1937007212) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0558, code lost:
    
        if (r9 == 1701082227) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x055a, code lost:
    
        if (r9 != 1835365473) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0562, code lost:
    
        if (r9 == 1835296868) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0567, code lost:
    
        if (r9 == 1836476516) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0569, code lost:
    
        if (r9 == 1751411826) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x056e, code lost:
    
        if (r9 == 1937011556) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0573, code lost:
    
        if (r9 == 1937011827) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0578, code lost:
    
        if (r9 == 1937011571) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x057d, code lost:
    
        if (r9 == 1668576371) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0582, code lost:
    
        if (r9 == 1701606260) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0587, code lost:
    
        if (r9 == 1937011555) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x058c, code lost:
    
        if (r9 == 1937011578) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0591, code lost:
    
        if (r9 == 1937013298) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0596, code lost:
    
        if (r9 == 1937007471) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x059b, code lost:
    
        if (r9 == 1668232756) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05a0, code lost:
    
        if (r9 == 1953196132) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05a5, code lost:
    
        if (r9 == 1718909296) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05aa, code lost:
    
        if (r9 == 1969517665) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x05af, code lost:
    
        if (r9 == 1801812339) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05b4, code lost:
    
        if (r9 != 1768715124) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x05b9, code lost:
    
        r6 = r40.mo4869();
        r9 = r39.f14179;
        r31 = r6 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x05c7, code lost:
    
        if (r39.f14166 != 1836086884) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05c9, code lost:
    
        r39.f14164 = new p179.C2495(0, r31, -9223372036854775807L, r31 + r9, r39.f14168 - r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x05df, code lost:
    
        r39.f14171 = null;
        r39.f14170 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x05eb, code lost:
    
        if (r11 != 8) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x05ed, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x05ef, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x05f0, code lost:
    
        p383.AbstractC4464.m10132(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x05fa, code lost:
    
        if (r39.f14168 > 2147483647L) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x05fc, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x05fe, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x05ff, code lost:
    
        p383.AbstractC4464.m10132(r7);
        r7 = new p383.C4457((int) r39.f14168);
        java.lang.System.arraycopy(r6.f17171, 0, r7.f17171, 0, 8);
        r39.f14171 = r7;
        r39.f14170 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x061a, code lost:
    
        r15 = r40.mo4869();
        r3 = r39.f14168;
        r5 = r39.f14179;
        r8 = (r15 + r3) - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0628, code lost:
    
        if (r3 == r5) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x062c, code lost:
    
        if (r39.f14166 != 1835365473) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x062e, code lost:
    
        r14.m10099(8);
        r40.mo4853(r14.f17171, 0, 8);
        r4 = p323.AbstractC3693.f14217;
        r4 = r14.f17169;
        r14.m10085(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0645, code lost:
    
        if (r14.m10092() == 1751411826) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0647, code lost:
    
        r4 = r4 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0648, code lost:
    
        r14.m10108(r4);
        r40.mo4854(r14.f17169);
        r40.mo4860();
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0657, code lost:
    
        r12.push(new p323.C3692(r39.f14166, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0668, code lost:
    
        if (r39.f14168 != r39.f14179) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x066a, code lost:
    
        m8634(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0670, code lost:
    
        r39.f14170 = 0;
        r39.f14179 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x067d, code lost:
    
        throw androidx.media3.common.ParserException.m1096("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo4075(p254.InterfaceC3168 r40, p166.C2430 r41) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p323.C3685.mo4075(יי.ˑי, ˊﹶ.ᵎˏ):int");
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˋⁱ */
    public final long mo5502() {
        return this.f14175;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf A[PHI: r4
  0x00cf: PHI (r4v6 long) = (r4v3 long), (r4v9 long) binds: [B:32:0x0073, B:48:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6 A[EDGE_INSN: B:71:0x00d6->B:63:0x00d6 BREAK  A[LOOP:1: B:29:0x006c->B:62:0x00d1], SYNTHETIC] */
    @Override // p254.InterfaceC3157
    /* renamed from: ˏʾ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p254.C3180 mo5503(long r21) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p323.C3685.mo5503(long):יי.ﹳˑ");
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        return this.f14165;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        this.f14178.clear();
        this.f14179 = 0;
        this.f14174 = -1;
        this.f14181 = 0;
        this.f14169 = 0;
        this.f14180 = 0;
        if (j == 0) {
            if (this.f14170 != 3) {
                this.f14170 = 0;
                this.f14179 = 0;
                return;
            } else {
                C3688 c3688 = this.f14172;
                c3688.f14200.clear();
                c3688.f14198 = 0;
                this.f14185.clear();
                return;
            }
        }
        for (C3684 c3684 : this.f14167) {
            C3698 c3698 = c3684.f14156;
            int iM10195 = AbstractC4470.m10195(c3698.f14257, j2, false);
            while (true) {
                if (iM10195 < 0) {
                    iM10195 = -1;
                    break;
                } else if ((c3698.f14258[iM10195] & 1) != 0) {
                    break;
                } else {
                    iM10195--;
                }
            }
            if (iM10195 == -1) {
                iM10195 = c3698.m8655(j2);
            }
            c3684.f14157 = iM10195;
            C3182 c3182 = c3684.f14160;
            if (c3182 != null) {
                c3182.f12302 = false;
                c3182.f12304 = 0;
            }
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        if ((this.f14161 & 16) == 0) {
            interfaceC3177 = new C3222(interfaceC3177, this.f14176);
        }
        this.f14163 = interfaceC3177;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d5, code lost:
    
        r4 = r12.m10089(r23 - 12);
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e1, code lost:
    
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e8, code lost:
    
        if (r2 != 1851878757) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ea, code lost:
    
        r3 = r12.m10089(r23 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f5, code lost:
    
        if (r2 != 1684108385) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f7, code lost:
    
        r8 = r23;
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01fb, code lost:
    
        r12.m10085(r23 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0200, code lost:
    
        r9 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0204, code lost:
    
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0206, code lost:
    
        if (r4 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0208, code lost:
    
        if (r3 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020b, code lost:
    
        if (r5 != (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020e, code lost:
    
        r12.m10108(r5);
        r12.m10085(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0220, code lost:
    
        r4 = new p380.C4425(r4, r3, r12.m10089(r8 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0223, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0224, code lost:
    
        r12.m10108(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0229, code lost:
    
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x022e, code lost:
    
        r3 = 16777215 & r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0235, code lost:
    
        if (r3 != 6516084) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0237, code lost:
    
        r4 = p323.AbstractC3691.m8641(r4, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x023f, code lost:
    
        if (r3 == 7233901) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0244, code lost:
    
        if (r3 != 7631467) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x024b, code lost:
    
        if (r3 == 6516589) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0250, code lost:
    
        if (r3 != 7828084) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0257, code lost:
    
        if (r3 != 6578553) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0259, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TDRC", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0263, code lost:
    
        if (r3 != 4280916) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0265, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TPE1", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x026f, code lost:
    
        if (r3 != 7630703) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0271, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TSSE", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x027b, code lost:
    
        if (r3 != 6384738) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x027d, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TALB", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0287, code lost:
    
        if (r3 != 7108978) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0289, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "USLT", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0293, code lost:
    
        if (r3 != 6776174) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0295, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TCON", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x029d, code lost:
    
        if (r3 != 6779504) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x029f, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TIT1", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02a7, code lost:
    
        p383.AbstractC4464.m10148("MetadataUtil", "Skipped unknown metadata entry: " + p034.AbstractC1227.m4400(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02ba, code lost:
    
        r12.m10108(r13);
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02bf, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TCOM", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02c7, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TIT2", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02cf, code lost:
    
        if (r4 == null) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02d1, code lost:
    
        r7.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02d4, code lost:
    
        r5 = r28;
        r9 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e1, code lost:
    
        r12.m10108(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02e5, code lost:
    
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02ec, code lost:
    
        if (r7.isEmpty() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02ef, code lost:
    
        r4 = new p166.C2401(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0339, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        r12.m10108(r5);
        r5 = r5 + r14;
        r12.m10085(r3);
        r7 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        r13 = r12.f17169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r13 >= r5) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        r13 = r12.m10092() + r13;
        r4 = r12.m10092();
        r3 = (r4 >> 24) & 255;
        r28 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (r3 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r3 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        if (r4 != 1735291493) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        r2 = p380.AbstractC4427.m10038(p323.AbstractC3691.m8643(r12) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (r2 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        r3 = new p380.C4428("TCON", null, p345.AbstractC3980.m9207(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
    
        p383.AbstractC4464.m10144("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        r12.m10108(r13);
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ed, code lost:
    
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f6, code lost:
    
        if (r4 != 1684632427) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        r4 = p323.AbstractC3691.m8637(r4, "TPOS", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fe, code lost:
    
        r12.m10108(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0108, code lost:
    
        if (r4 != 1953655662) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010a, code lost:
    
        r4 = p323.AbstractC3691.m8637(r4, "TRCK", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0114, code lost:
    
        if (r4 != 1953329263) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0116, code lost:
    
        r4 = p323.AbstractC3691.m8644(r4, "TBPM", r12, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0122, code lost:
    
        if (r4 != 1668311404) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0124, code lost:
    
        r4 = p323.AbstractC3691.m8644(r4, "TCMP", r12, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012f, code lost:
    
        if (r4 != 1668249202) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0131, code lost:
    
        r4 = p323.AbstractC3691.m8645(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0139, code lost:
    
        if (r4 != 1631670868) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013b, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TPE2", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0145, code lost:
    
        if (r4 != 1936682605) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0147, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TSOT", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0151, code lost:
    
        if (r4 != 1936679276) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0153, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TSOA", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015d, code lost:
    
        if (r4 != 1936679282) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015f, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TSOP", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0169, code lost:
    
        if (r4 != 1936679265) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016b, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TSO2", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0175, code lost:
    
        if (r4 != 1936679791) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0177, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TSOC", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0181, code lost:
    
        if (r4 != 1920233063) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0183, code lost:
    
        r4 = p323.AbstractC3691.m8644(r4, "ITUNESADVISORY", r12, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018f, code lost:
    
        if (r4 != 1885823344) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0191, code lost:
    
        r4 = p323.AbstractC3691.m8644(r4, "ITUNESGAPLESS", r12, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019e, code lost:
    
        if (r4 != 1936683886) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a0, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TVSHOWSORT", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ab, code lost:
    
        if (r4 != 1953919848) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ad, code lost:
    
        r4 = p323.AbstractC3691.m8638(r4, "TVSHOW", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b8, code lost:
    
        if (r4 != 757935405) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ba, code lost:
    
        r3 = null;
        r4 = null;
        r5 = -1;
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01be, code lost:
    
        r14 = r12.f17169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c0, code lost:
    
        if (r14 >= r13) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c2, code lost:
    
        r23 = r12.m10092();
        r2 = r12.m10092();
        r12.m10085(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d3, code lost:
    
        if (r2 != 1835360622) goto L101;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06c4 A[LOOP:13: B:339:0x06c1->B:341:0x06c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06a0 A[EDGE_INSN: B:407:0x06a0->B:338:0x06a0 BREAK  A[LOOP:10: B:269:0x0559->B:337:0x0696], SYNTHETIC] */
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8634(long r34) {
        /*
            Method dump skipped, instructions count: 1882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p323.C3685.m8634(long):void");
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ﹶˆ */
    public final boolean mo5504() {
        return true;
    }
}
