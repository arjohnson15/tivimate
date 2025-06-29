package p015;

import androidx.media3.common.ParserException;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;
import p153.C2324;
import p166.C2401;
import p166.C2430;
import p209.C2799;
import p234.C3083;
import p254.AbstractC3152;
import p254.C3159;
import p254.C3176;
import p254.C3179;
import p254.InterfaceC3157;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p254.InterfaceC3178;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p380.C4437;
import p383.AbstractC4470;
import p383.C4457;

/* renamed from: ʻٴ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1066 implements InterfaceC3165 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public InterfaceC3177 f4595;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f4596;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public C1065 f4597;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f4598;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f4599;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C2401 f4600;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public InterfaceC3178 f4603;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public long f4605;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C3179 f4607;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] f4602 = new byte[42];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4457 f4594 = new C4457(0, new byte[32768]);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f4601 = false;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2430 f4606 = new C2430();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f4604 = 0;

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) throws EOFException, InterruptedIOException {
        C3159 c3159 = (C3159) interfaceC3168;
        C2401 c2401M7581 = new C3083(1).m7581(c3159, C4437.f17101);
        if (c2401M7581 != null) {
            int length = c2401M7581.f9491.length;
        }
        C4457 c4457 = new C4457(4);
        c3159.mo4875(c4457.f17171, 0, 4, false);
        return c4457.m10110() == 1716281667;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    public final int mo4075(InterfaceC3168 interfaceC3168, C2430 c2430) throws ParserException, EOFException, InterruptedIOException {
        C3179 c3179;
        InterfaceC3157 c3176;
        long j;
        long j2;
        boolean z;
        long j3;
        boolean zM7822;
        boolean z2 = true;
        int i = this.f4604;
        C2401 c2401 = null;
        if (i == 0) {
            ((C3159) interfaceC3168).f12219 = 0;
            C3159 c3159 = (C3159) interfaceC3168;
            long jMo4865 = c3159.mo4865();
            C2401 c2401M7581 = new C3083(1).m7581(c3159, !this.f4601 ? null : C4437.f17101);
            if (c2401M7581 != null && c2401M7581.f9491.length != 0) {
                c2401 = c2401M7581;
            }
            c3159.mo4854((int) (c3159.mo4865() - jMo4865));
            this.f4600 = c2401;
            this.f4604 = 1;
            return 0;
        }
        byte[] bArr = this.f4602;
        if (i == 1) {
            ((C3159) interfaceC3168).mo4875(bArr, 0, bArr.length, false);
            ((C3159) interfaceC3168).f12219 = 0;
            this.f4604 = 2;
            return 0;
        }
        int i2 = 3;
        if (i == 2) {
            C4457 c4457 = new C4457(4);
            ((C3159) interfaceC3168).mo4876(c4457.f17171, 0, 4, false);
            if (c4457.m10110() != 1716281667) {
                throw ParserException.m1097("Failed to read FLAC stream marker.", null);
            }
            this.f4604 = 3;
            return 0;
        }
        if (i == 3) {
            C3179 c31792 = this.f4607;
            boolean z3 = false;
            while (!z3) {
                ((C3159) interfaceC3168).f12219 = 0;
                byte[] bArr2 = new byte[4];
                C2324 c2324 = new C2324(4, bArr2);
                C3159 c31592 = (C3159) interfaceC3168;
                c31592.mo4875(bArr2, 0, 4, false);
                boolean zM6399 = c2324.m6399();
                int iM6410 = c2324.m6410(i);
                int iM64102 = c2324.m6410(24) + 4;
                if (iM6410 == 0) {
                    byte[] bArr3 = new byte[38];
                    c31592.mo4876(bArr3, 0, 38, false);
                    c31792 = new C3179(4, bArr3);
                } else {
                    if (c31792 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iM6410 == i2) {
                        C4457 c44572 = new C4457(iM64102);
                        c31592.mo4876(c44572.f17171, 0, iM64102, false);
                        c3179 = new C3179(c31792.f12283, c31792.f12276, c31792.f12282, c31792.f12286, c31792.f12277, c31792.f12285, c31792.f12281, c31792.f12278, AbstractC3152.m7804(c44572), c31792.f12279);
                    } else {
                        C2401 c24012 = c31792.f12279;
                        if (iM6410 == 4) {
                            C4457 c44573 = new C4457(iM64102);
                            c31592.mo4876(c44573.f17171, 0, iM64102, false);
                            c44573.m10085(4);
                            C2401 c2401M7819 = AbstractC3152.m7819(Arrays.asList((String[]) AbstractC3152.m7807(c44573, false, false).ˆʿ));
                            if (c24012 != null) {
                                c2401M7819 = c24012.m6492(c2401M7819);
                            }
                            c3179 = new C3179(c31792.f12283, c31792.f12276, c31792.f12282, c31792.f12286, c31792.f12277, c31792.f12285, c31792.f12281, c31792.f12278, c31792.f12280, c2401M7819);
                        } else if (iM6410 == 6) {
                            C4457 c44574 = new C4457(iM64102);
                            c31592.mo4876(c44574.f17171, 0, iM64102, false);
                            c44574.m10085(4);
                            C2401 c24013 = new C2401(AbstractC3980.m9207(C2799.m7077(c44574)));
                            if (c24012 != null) {
                                c24013 = c24012.m6492(c24013);
                            }
                            c3179 = new C3179(c31792.f12283, c31792.f12276, c31792.f12282, c31792.f12286, c31792.f12277, c31792.f12285, c31792.f12281, c31792.f12278, c31792.f12280, c24013);
                        } else {
                            c31592.mo4854(iM64102);
                        }
                    }
                    c31792 = c3179;
                }
                int i3 = AbstractC4470.f17202;
                this.f4607 = c31792;
                z3 = zM6399;
                i2 = 3;
                i = 7;
            }
            this.f4607.getClass();
            this.f4596 = Math.max(this.f4607.f12282, 6);
            InterfaceC3178 interfaceC3178 = this.f4603;
            int i4 = AbstractC4470.f17202;
            interfaceC3178.mo7840(this.f4607.m7848(bArr, this.f4600));
            this.f4604 = 4;
            return 0;
        }
        long j4 = 0;
        if (i == 4) {
            ((C3159) interfaceC3168).f12219 = 0;
            C4457 c44575 = new C4457(2);
            C3159 c31593 = (C3159) interfaceC3168;
            c31593.mo4875(c44575.f17171, 0, 2, false);
            int iM10100 = c44575.m10100();
            if ((iM10100 >> 2) != 16382) {
                c31593.f12219 = 0;
                throw ParserException.m1097("First frame does not start with sync code.", null);
            }
            c31593.f12219 = 0;
            this.f4599 = iM10100;
            InterfaceC3177 interfaceC3177 = this.f4595;
            int i5 = AbstractC4470.f17202;
            long j5 = c31593.f12217;
            this.f4607.getClass();
            C3179 c31793 = this.f4607;
            if (c31793.f12280 != null) {
                c3176 = new C3176(c31793, j5, 0);
            } else {
                long j6 = c31593.f12216;
                if (j6 == -1 || c31793.f12278 <= 0) {
                    c3176 = new C3176(c31793.m7847());
                } else {
                    int i6 = this.f4599;
                    C1067 c1067 = new C1067(0, c31793);
                    ᐧʻ r13 = new ᐧʻ(c31793, i6);
                    long jM7847 = c31793.m7847();
                    int i7 = c31793.f12282;
                    int i8 = c31793.f12286;
                    if (i8 > 0) {
                        j = j6;
                        j2 = ((i8 + i7) / 2) + 1;
                    } else {
                        j = j6;
                        int i9 = c31793.f12276;
                        int i10 = c31793.f12283;
                        j2 = (((((i10 != i9 || i10 <= 0) ? 4096L : i10) * c31793.f12285) * c31793.f12281) / 8) + 64;
                    }
                    C1065 c1065 = new C1065(c1067, r13, jM7847, c31793.f12278, j5, j, j2, Math.max(6, i7));
                    this.f4597 = c1065;
                    c3176 = c1065.f4592;
                }
            }
            interfaceC3177.mo4858(c3176);
            this.f4604 = 5;
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        this.f4603.getClass();
        this.f4607.getClass();
        C1065 c10652 = this.f4597;
        if (c10652 != null && c10652.f4591 != null) {
            return c10652.m4090((C3159) interfaceC3168, c2430);
        }
        if (this.f4605 == -1) {
            C3179 c31794 = this.f4607;
            ((C3159) interfaceC3168).f12219 = 0;
            C3159 c31594 = (C3159) interfaceC3168;
            c31594.m7828(1, false);
            byte[] bArr4 = new byte[1];
            c31594.mo4875(bArr4, 0, 1, false);
            boolean z4 = (bArr4[0] & 1) == 1;
            c31594.m7828(2, false);
            i = z4 ? 7 : 6;
            C4457 c44576 = new C4457(i);
            byte[] bArr5 = c44576.f17171;
            int i11 = 0;
            while (i11 < i) {
                int iM7825 = c31594.m7825(bArr5, i11, i - i11);
                if (iM7825 == -1) {
                    break;
                }
                i11 += iM7825;
            }
            c44576.m10104(i11);
            c31594.f12219 = 0;
            try {
                long jM10080 = c44576.m10080();
                if (!z4) {
                    jM10080 *= c31794.f12276;
                }
                j4 = jM10080;
            } catch (NumberFormatException unused) {
                z2 = false;
            }
            if (!z2) {
                throw ParserException.m1097(null, null);
            }
            this.f4605 = j4;
            return 0;
        }
        C4457 c44577 = this.f4594;
        int i12 = c44577.f17170;
        if (i12 < 32768) {
            int iMo3679 = ((C3159) interfaceC3168).mo3679(c44577.f17171, i12, 32768 - i12);
            z = iMo3679 == -1;
            if (!z) {
                c44577.m10104(i12 + iMo3679);
            } else if (c44577.m10096() == 0) {
                long j7 = this.f4605 * 1000000;
                C3179 c31795 = this.f4607;
                int i13 = AbstractC4470.f17202;
                this.f4603.mo7842(j7 / c31795.f12277, 1, this.f4598, 0, null);
                return -1;
            }
        } else {
            z = false;
        }
        int i14 = c44577.f17169;
        int i15 = this.f4598;
        int i16 = this.f4596;
        if (i15 < i16) {
            c44577.m10085(Math.min(i16 - i15, c44577.m10096()));
        }
        this.f4607.getClass();
        int i17 = c44577.f17169;
        while (true) {
            int i18 = c44577.f17170 - 16;
            C2430 c24302 = this.f4606;
            if (i17 <= i18) {
                c44577.m10108(i17);
                if (AbstractC3152.m7822(c44577, this.f4607, this.f4599, c24302)) {
                    c44577.m10108(i17);
                    j3 = c24302.f9656;
                    break;
                }
                i17++;
            } else {
                if (z) {
                    while (true) {
                        int i19 = c44577.f17170;
                        if (i17 > i19 - this.f4596) {
                            c44577.m10108(i19);
                            break;
                        }
                        c44577.m10108(i17);
                        try {
                            zM7822 = AbstractC3152.m7822(c44577, this.f4607, this.f4599, c24302);
                        } catch (IndexOutOfBoundsException unused2) {
                            zM7822 = false;
                        }
                        if (c44577.f17169 > c44577.f17170) {
                            zM7822 = false;
                        }
                        if (zM7822) {
                            c44577.m10108(i17);
                            j3 = c24302.f9656;
                            break;
                        }
                        i17++;
                    }
                } else {
                    c44577.m10108(i17);
                }
                j3 = -1;
            }
        }
        int i20 = c44577.f17169 - i14;
        c44577.m10108(i14);
        this.f4603.mo7841(i20, c44577);
        int i21 = i20 + this.f4598;
        this.f4598 = i21;
        if (j3 != -1) {
            long j8 = this.f4605 * 1000000;
            C3179 c31796 = this.f4607;
            int i22 = AbstractC4470.f17202;
            this.f4603.mo7842(j8 / c31796.f12277, 1, i21, 0, null);
            this.f4598 = 0;
            this.f4605 = j3;
        }
        if (c44577.m10096() >= 16) {
            return 0;
        }
        int iM10096 = c44577.m10096();
        byte[] bArr6 = c44577.f17171;
        System.arraycopy(bArr6, c44577.f17169, bArr6, 0, iM10096);
        c44577.m10108(0);
        c44577.m10104(iM10096);
        return 0;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˏᵢ */
    public final List mo4079() {
        C3928 c3928 = AbstractC3980.f15360;
        return C3932.f15274;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ـﹶ */
    public final void mo4082(long j, long j2) {
        if (j == 0) {
            this.f4604 = 0;
        } else {
            C1065 c1065 = this.f4597;
            if (c1065 != null) {
                c1065.m4091(j2);
            }
        }
        this.f4605 = j2 != 0 ? -1L : 0L;
        this.f4598 = 0;
        this.f4594.m10099(0);
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f4595 = interfaceC3177;
        this.f4603 = interfaceC3177.mo4851(0, 1);
        interfaceC3177.mo4850();
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
