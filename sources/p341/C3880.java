package p341;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p015.C1065;
import p052.C1329;
import p166.C2430;
import p230.C3071;
import p254.C3159;
import p254.C3176;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p260.C3222;
import p331.C3759;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.AbstractC4464;
import p383.C4457;
import p383.C4458;
import p397.InterfaceC4603;
import ˆˑ.ﹳﹳ;

/* renamed from: ᵎˑ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3880 implements InterfaceC3165 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f14917;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4457 f14918;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public int f14919;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final SparseBooleanArray f14920;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C3899 f14921;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C1065 f14922;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean f14923;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final SparseBooleanArray f14924;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f14925;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final InterfaceC4603 f14926;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f14927;

    /* renamed from: ˑי, reason: contains not printable characters */
    public boolean f14928;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f14929;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final SparseIntArray f14930;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C1329 f14931;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public InterfaceC3177 f14932;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public InterfaceC3881 f14933;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public boolean f14934;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public int f14935;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final List f14936;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final SparseArray f14937;

    public C3880(int i, int i2, InterfaceC4603 interfaceC4603, C4458 c4458, C1329 c1329, int i3) {
        this.f14931 = c1329;
        this.f14927 = i3;
        this.f14929 = i;
        this.f14917 = i2;
        this.f14926 = interfaceC4603;
        if (i == 1 || i == 2) {
            this.f14936 = Collections.singletonList(c4458);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f14936 = arrayList;
            arrayList.add(c4458);
        }
        this.f14918 = new C4457(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f14920 = sparseBooleanArray;
        this.f14924 = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f14937 = sparseArray;
        this.f14930 = new SparseIntArray();
        this.f14921 = new C3899(i3);
        this.f14932 = InterfaceC3177.f12275;
        this.f14919 = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            sparseArray.put(sparseArray2.keyAt(i4), (InterfaceC3881) sparseArray2.valueAt(i4));
        }
        sparseArray.put(0, new C3882(new C3759(this)));
        this.f14933 = null;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo4074(p254.InterfaceC3168 r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            ᵢᵢ.ˋⁱ r0 = r6.f14918
            byte[] r0 = r0.f17171
            יי.ˉⁱ r7 = (p254.C3159) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.mo4875(r0, r1, r2, r1)
            r2 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = 0
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.mo4854(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341.C3880.mo4074(יי.ˑי):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    public final int mo4075(InterfaceC3168 interfaceC3168, C2430 c2430) throws ParserException, EOFException, InterruptedIOException {
        int i;
        long j;
        ?? r2;
        int i2;
        int i3;
        int i4;
        long j2;
        long j3;
        long j4 = ((C3159) interfaceC3168).f12216;
        int i5 = this.f14929;
        boolean z = i5 == 2;
        if (this.f14928) {
            C3899 c3899 = this.f14921;
            if (j4 != -1 && !z && !c3899.f15107) {
                int i6 = this.f14919;
                if (i6 <= 0) {
                    c3899.m9093((C3159) interfaceC3168);
                    return 0;
                }
                boolean z2 = c3899.f15105;
                C4457 c4457 = c3899.f15103;
                int i7 = c3899.f15104;
                if (!z2) {
                    C3159 c3159 = (C3159) interfaceC3168;
                    long j5 = c3159.f12216;
                    int iMin = (int) Math.min(i7, j5);
                    long j6 = j5 - iMin;
                    if (c3159.f12217 == j6) {
                        c4457.m10099(iMin);
                        c3159.f12219 = 0;
                        c3159.mo4875(c4457.f17171, 0, iMin, false);
                        int i8 = c4457.f17169;
                        int i9 = c4457.f17170;
                        int i10 = i9 - 188;
                        while (true) {
                            if (i10 < i8) {
                                j3 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = c4457.f17171;
                            int i11 = -4;
                            int i12 = 0;
                            while (true) {
                                if (i11 > 4) {
                                    break;
                                }
                                int i13 = (i11 * 188) + i10;
                                if (i13 < i8 || i13 >= i9 || bArr[i13] != 71) {
                                    i12 = 0;
                                } else {
                                    i12++;
                                    if (i12 == 5) {
                                        long j7 = ﹳﹳ.ﾞˊ(c4457, i10, i6);
                                        if (j7 != -9223372036854775807L) {
                                            j3 = j7;
                                            break;
                                        }
                                    }
                                }
                                i11++;
                            }
                            i10--;
                        }
                        c3899.f15102 = j3;
                        c3899.f15105 = true;
                        return 0;
                    }
                    c2430.f9656 = j6;
                } else {
                    if (c3899.f15102 == -9223372036854775807L) {
                        c3899.m9093((C3159) interfaceC3168);
                        return 0;
                    }
                    if (c3899.f15101) {
                        long j8 = c3899.f15106;
                        if (j8 == -9223372036854775807L) {
                            c3899.m9093((C3159) interfaceC3168);
                            return 0;
                        }
                        C4458 c4458 = c3899.f15100;
                        c3899.f15108 = c4458.m10115(c3899.f15102) - c4458.m10112(j8);
                        c3899.m9093((C3159) interfaceC3168);
                        return 0;
                    }
                    C3159 c31592 = (C3159) interfaceC3168;
                    int iMin2 = (int) Math.min(i7, c31592.f12216);
                    long j9 = 0;
                    if (c31592.f12217 == j9) {
                        c4457.m10099(iMin2);
                        c31592.f12219 = 0;
                        c31592.mo4875(c4457.f17171, 0, iMin2, false);
                        int i14 = c4457.f17169;
                        int i15 = c4457.f17170;
                        while (true) {
                            if (i14 >= i15) {
                                j2 = -9223372036854775807L;
                                break;
                            }
                            if (c4457.f17171[i14] == 71) {
                                long j10 = ﹳﹳ.ﾞˊ(c4457, i14, i6);
                                if (j10 != -9223372036854775807L) {
                                    j2 = j10;
                                    break;
                                }
                            }
                            i14++;
                        }
                        c3899.f15106 = j2;
                        c3899.f15101 = true;
                        return 0;
                    }
                    c2430.f9656 = j9;
                }
                return 1;
            }
            if (this.f14934) {
                i = i5;
                j = j4;
            } else {
                this.f14934 = true;
                long j11 = c3899.f15108;
                if (j11 != -9223372036854775807L) {
                    int i16 = this.f14919;
                    ˈˉ.ﹳﹳ r4 = new ˈˉ.ﹳﹳ(28);
                    int i17 = this.f14927;
                    C4458 c44582 = c3899.f15100;
                    C3071 c3071 = new C3071();
                    c3071.f11851 = i16;
                    c3071.f11849 = c44582;
                    c3071.f11848 = i17;
                    c3071.f11850 = new C4457();
                    i = i5;
                    j = j4;
                    C1065 c1065 = new C1065(r4, c3071, j11, j11 + 1, 0L, j4, 188L, 940);
                    this.f14922 = c1065;
                    this.f14932.mo4858(c1065.f4592);
                } else {
                    i = i5;
                    j = j4;
                    this.f14932.mo4858(new C3176(j11));
                }
            }
            if (this.f14923) {
                this.f14923 = false;
                mo4082(0L, 0L);
                if (((C3159) interfaceC3168).f12217 != 0) {
                    c2430.f9656 = 0L;
                    return 1;
                }
            }
            r2 = 1;
            r2 = 1;
            C1065 c10652 = this.f14922;
            if (c10652 != null && c10652.f4591 != null) {
                return c10652.m4090((C3159) interfaceC3168, c2430);
            }
        } else {
            i = i5;
            j = j4;
            r2 = 1;
        }
        C4457 c44572 = this.f14918;
        byte[] bArr2 = c44572.f17171;
        if (9400 - c44572.f17169 < 188) {
            int iM10096 = c44572.m10096();
            if (iM10096 > 0) {
                System.arraycopy(bArr2, c44572.f17169, bArr2, 0, iM10096);
            }
            c44572.m10081(iM10096, bArr2);
        }
        while (true) {
            int iM100962 = c44572.m10096();
            SparseArray sparseArray = this.f14937;
            if (iM100962 >= 188) {
                int i18 = c44572.f17169;
                int i19 = c44572.f17170;
                byte[] bArr3 = c44572.f17171;
                int i20 = i18;
                while (i20 < i19 && bArr3[i20] != 71) {
                    i20++;
                }
                c44572.m10108(i20);
                int i21 = i20 + 188;
                if (i21 > i19) {
                    int i22 = (i20 - i18) + this.f14935;
                    this.f14935 = i22;
                    i2 = i;
                    i3 = 2;
                    if (i2 == 2 && i22 > 376) {
                        throw ParserException.m1097("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                    i4 = 0;
                } else {
                    i2 = i;
                    i3 = 2;
                    i4 = 0;
                    this.f14935 = 0;
                }
                int i23 = c44572.f17170;
                if (i21 > i23) {
                    return i4;
                }
                int iM10092 = c44572.m10092();
                if ((8388608 & iM10092) != 0) {
                    c44572.m10108(i21);
                    return i4;
                }
                int i24 = (4194304 & iM10092) != 0 ? 1 : 0;
                int i25 = (2096896 & iM10092) >> 8;
                boolean z3 = (iM10092 & 32) != 0;
                InterfaceC3881 interfaceC3881 = (iM10092 & 16) != 0 ? (InterfaceC3881) sparseArray.get(i25) : null;
                if (interfaceC3881 == null) {
                    c44572.m10108(i21);
                    return 0;
                }
                if (i2 != i3) {
                    int i26 = iM10092 & 15;
                    SparseIntArray sparseIntArray = this.f14930;
                    int i27 = sparseIntArray.get(i25, i26 - 1);
                    sparseIntArray.put(i25, i26);
                    if (i27 == i26) {
                        c44572.m10108(i21);
                        return 0;
                    }
                    if (i26 != ((i27 + r2) & 15)) {
                        interfaceC3881.mo9081();
                    }
                }
                if (z3) {
                    int iM10086 = c44572.m10086();
                    i24 |= (c44572.m10086() & 64) != 0 ? 2 : 0;
                    c44572.m10085(iM10086 - r2);
                }
                boolean z4 = this.f14928;
                if (i2 == i3 || z4 || !this.f14924.get(i25, false)) {
                    c44572.m10104(i21);
                    interfaceC3881.mo9080(i24, c44572);
                    c44572.m10104(i23);
                }
                if (i2 != i3 && !z4 && this.f14928 && j != -1) {
                    this.f14923 = r2;
                }
                c44572.m10108(i21);
                return 0;
            }
            int i28 = c44572.f17170;
            int iMo3679 = ((C3159) interfaceC3168).mo3679(bArr2, i28, 9400 - i28);
            if (iMo3679 == -1) {
                for (int i29 = 0; i29 < sparseArray.size(); i29++) {
                    InterfaceC3881 interfaceC38812 = (InterfaceC3881) sparseArray.valueAt(i29);
                    if (interfaceC38812 instanceof C3885) {
                        C3885 c3885 = (C3885) interfaceC38812;
                        if (c3885.f14975 == 3 && c3885.f14971 == -1 && (!z || !(c3885.f14976 instanceof C3883))) {
                            c3885.mo9080(r2, new C4457());
                        }
                    }
                }
                return -1;
            }
            c44572.m10104(i28 + iMo3679);
        }
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
        C1065 c1065;
        AbstractC4464.m10132(this.f14929 != 2);
        List list = this.f14936;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C4458 c4458 = (C4458) list.get(i);
            boolean z = c4458.m10113() == -9223372036854775807L;
            if (!z) {
                long jM10119 = c4458.m10119();
                z = (jM10119 == -9223372036854775807L || jM10119 == 0 || jM10119 == j2) ? false : true;
            }
            if (z) {
                c4458.m10118(j2);
            }
        }
        if (j2 != 0 && (c1065 = this.f14922) != null) {
            c1065.m4091(j2);
        }
        this.f14918.m10099(0);
        this.f14930.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f14937;
            if (i2 >= sparseArray.size()) {
                this.f14935 = 0;
                return;
            } else {
                ((InterfaceC3881) sparseArray.valueAt(i2)).mo9081();
                i2++;
            }
        }
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        if ((this.f14917 & 1) == 0) {
            interfaceC3177 = new C3222(interfaceC3177, this.f14926);
        }
        this.f14932 = interfaceC3177;
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
