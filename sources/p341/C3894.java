package p341;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p015.C1065;
import p153.C2324;
import p166.C2430;
import p254.C3159;
import p254.C3176;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p331.C3758;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4464;
import p383.C4457;
import p383.C4458;
import ˈˉ.ﹳﹳ;

/* renamed from: ᵎˑ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3894 implements InterfaceC3165 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f15059;

    /* renamed from: ˉי, reason: contains not printable characters */
    public InterfaceC3177 f15060;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f15061;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long f15062;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f15065;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f15066;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C1065 f15068;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4458 f15064 = new C4458(0);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4457 f15063 = new C4457(4096);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final SparseArray f15058 = new SparseArray();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3908 f15067 = new C3908();

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    public final boolean mo4074(InterfaceC3168 interfaceC3168) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C3159 c3159 = (C3159) interfaceC3168;
        c3159.mo4875(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c3159.m7828(bArr[13] & 7, false);
        c3159.mo4875(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    public final int mo4075(InterfaceC3168 interfaceC3168, C2430 c2430) throws EOFException, InterruptedIOException {
        long j;
        InterfaceC3891 c3883;
        long jM9098;
        int i;
        long jM90982;
        AbstractC4464.m10146(this.f15060);
        long j2 = ((C3159) interfaceC3168).f12216;
        C3908 c3908 = this.f15067;
        if (j2 != -1 && !c3908.f15200) {
            boolean z = c3908.f15198;
            C4457 c4457 = c3908.f15197;
            if (!z) {
                C3159 c3159 = (C3159) interfaceC3168;
                long j3 = c3159.f12216;
                int iMin = (int) Math.min(20000L, j3);
                long j4 = j3 - iMin;
                if (c3159.f12217 != j4) {
                    c2430.f9656 = j4;
                    i = 1;
                } else {
                    c4457.m10099(iMin);
                    c3159.f12219 = 0;
                    c3159.mo4875(c4457.f17171, 0, iMin, false);
                    int i2 = c4457.f17169;
                    int i3 = c4457.f17170 - 4;
                    while (true) {
                        if (i3 < i2) {
                            jM90982 = -9223372036854775807L;
                            break;
                        }
                        if (C3908.m9097(i3, c4457.f17171) == 442) {
                            c4457.m10108(i3 + 4);
                            jM90982 = C3908.m9098(c4457);
                            if (jM90982 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i3--;
                    }
                    c3908.f15203 = jM90982;
                    c3908.f15198 = true;
                    i = 0;
                }
            } else {
                if (c3908.f15203 == -9223372036854775807L) {
                    c3908.m9099((C3159) interfaceC3168);
                    return 0;
                }
                if (c3908.f15204) {
                    long j5 = c3908.f15202;
                    if (j5 == -9223372036854775807L) {
                        c3908.m9099((C3159) interfaceC3168);
                        return 0;
                    }
                    C4458 c4458 = c3908.f15201;
                    c3908.f15199 = c4458.m10115(c3908.f15203) - c4458.m10112(j5);
                    c3908.m9099((C3159) interfaceC3168);
                    return 0;
                }
                C3159 c31592 = (C3159) interfaceC3168;
                int iMin2 = (int) Math.min(20000L, c31592.f12216);
                long j6 = 0;
                if (c31592.f12217 != j6) {
                    c2430.f9656 = j6;
                    i = 1;
                } else {
                    c4457.m10099(iMin2);
                    c31592.f12219 = 0;
                    c31592.mo4875(c4457.f17171, 0, iMin2, false);
                    int i4 = c4457.f17169;
                    int i5 = c4457.f17170;
                    while (true) {
                        if (i4 >= i5 - 3) {
                            jM9098 = -9223372036854775807L;
                            break;
                        }
                        if (C3908.m9097(i4, c4457.f17171) == 442) {
                            c4457.m10108(i4 + 4);
                            jM9098 = C3908.m9098(c4457);
                            if (jM9098 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i4++;
                    }
                    c3908.f15202 = jM9098;
                    c3908.f15204 = true;
                    i = 0;
                }
            }
            return i;
        }
        if (this.f15061) {
            j = j2;
        } else {
            this.f15061 = true;
            long j7 = c3908.f15199;
            if (j7 != -9223372036854775807L) {
                j = j2;
                C1065 c1065 = new C1065(new ﹳﹳ(28), new C3758(c3908.f15201), j7, j7 + 1, 0L, j2, 188L, 1000);
                this.f15068 = c1065;
                this.f15060.mo4858(c1065.f4592);
            } else {
                j = j2;
                this.f15060.mo4858(new C3176(j7));
            }
        }
        C1065 c10652 = this.f15068;
        if (c10652 != null && c10652.f4591 != null) {
            return c10652.m4090((C3159) interfaceC3168, c2430);
        }
        C3159 c31593 = (C3159) interfaceC3168;
        c31593.f12219 = 0;
        long jMo4865 = j2 != -1 ? j - c31593.mo4865() : -1L;
        if (jMo4865 != -1 && jMo4865 < 4) {
            return -1;
        }
        C4457 c44572 = this.f15063;
        if (!c31593.mo4875(c44572.f17171, 0, 4, true)) {
            return -1;
        }
        c44572.m10108(0);
        int iM10092 = c44572.m10092();
        if (iM10092 == 441) {
            return -1;
        }
        if (iM10092 == 442) {
            c31593.mo4875(c44572.f17171, 0, 10, false);
            c44572.m10108(9);
            c31593.mo4854((c44572.m10086() & 7) + 14);
            return 0;
        }
        if (iM10092 == 443) {
            c31593.mo4875(c44572.f17171, 0, 2, false);
            c44572.m10108(0);
            c31593.mo4854(c44572.m10100() + 6);
            return 0;
        }
        if (((iM10092 & (-256)) >> 8) != 1) {
            c31593.mo4854(1);
            return 0;
        }
        int i6 = iM10092 & 255;
        SparseArray sparseArray = this.f15058;
        C3907 c3907 = (C3907) sparseArray.get(i6);
        if (!this.f15059) {
            if (c3907 == null) {
                if (i6 == 189) {
                    c3883 = new C3877();
                    this.f15065 = true;
                    this.f15062 = c31593.f12217;
                } else if ((iM10092 & 224) == 192) {
                    c3883 = new C3901(null, 0);
                    this.f15065 = true;
                    this.f15062 = c31593.f12217;
                } else if ((iM10092 & 240) == 224) {
                    c3883 = new C3883(null);
                    this.f15066 = true;
                    this.f15062 = c31593.f12217;
                } else {
                    c3883 = null;
                }
                if (c3883 != null) {
                    c3883.mo9079(this.f15060, new C3898(i6, 256));
                    c3907 = new C3907(c3883, this.f15064);
                    sparseArray.put(i6, c3907);
                }
            }
            if (c31593.f12217 > ((this.f15065 && this.f15066) ? this.f15062 + 8192 : 1048576L)) {
                this.f15059 = true;
                this.f15060.mo4850();
            }
        }
        c31593.mo4875(c44572.f17171, 0, 2, false);
        c44572.m10108(0);
        int iM10100 = c44572.m10100() + 6;
        if (c3907 == null) {
            c31593.mo4854(iM10100);
            return 0;
        }
        c44572.m10099(iM10100);
        c31593.mo4876(c44572.f17171, 0, iM10100, false);
        c44572.m10108(6);
        C2324 c2324 = c3907.f15192;
        c44572.m10097(c2324.f9219, 0, 3);
        c2324.m6407(0);
        c2324.m6408(8);
        c3907.f15196 = c2324.m6399();
        c3907.f15191 = c2324.m6399();
        c2324.m6408(6);
        c44572.m10097(c2324.f9219, 0, c2324.m6410(8));
        c2324.m6407(0);
        c3907.f15195 = 0L;
        if (c3907.f15196) {
            c2324.m6408(4);
            c2324.m6408(1);
            c2324.m6408(1);
            long jM6410 = (c2324.m6410(3) << 30) | (c2324.m6410(15) << 15) | c2324.m6410(15);
            c2324.m6408(1);
            boolean z2 = c3907.f15194;
            C4458 c44582 = c3907.f15190;
            if (!z2 && c3907.f15191) {
                c2324.m6408(4);
                c2324.m6408(1);
                c2324.m6408(1);
                c2324.m6408(1);
                c44582.m10112((c2324.m6410(15) << 15) | (c2324.m6410(3) << 30) | c2324.m6410(15));
                c3907.f15194 = true;
            }
            c3907.f15195 = c44582.m10112(jM6410);
        }
        long j8 = c3907.f15195;
        InterfaceC3891 interfaceC3891 = c3907.f15193;
        interfaceC3891.mo9075(4, j8);
        interfaceC3891.mo9077(c44572);
        interfaceC3891.mo9078(false);
        c44572.m10104(c44572.f17171.length);
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
        C4458 c4458 = this.f15064;
        boolean z = c4458.m10113() == -9223372036854775807L;
        if (!z) {
            long jM10119 = c4458.m10119();
            z = (jM10119 == -9223372036854775807L || jM10119 == 0 || jM10119 == j2) ? false : true;
        }
        if (z) {
            c4458.m10118(j2);
        }
        C1065 c1065 = this.f15068;
        if (c1065 != null) {
            c1065.m4091(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f15058;
            if (i >= sparseArray.size()) {
                return;
            }
            C3907 c3907 = (C3907) sparseArray.valueAt(i);
            c3907.f15194 = false;
            c3907.f15193.mo9076();
            i++;
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f15060 = interfaceC3177;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
