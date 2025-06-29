package p341;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p166.C2430;
import p254.C3159;
import p254.C3176;
import p254.InterfaceC3165;
import p254.InterfaceC3168;
import p254.InterfaceC3177;
import p345.AbstractC3980;
import p345.C3928;
import p345.C3932;
import p383.C4457;

/* renamed from: ᵎˑ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3892 implements InterfaceC3165 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f15043;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3877 f15044 = new C3877(0, 1, null);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4457 f15042 = new C4457(16384);

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r5.f12219 = 0;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if ((r1 - r3) < 8192) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        return false;
     */
    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo4074(p254.InterfaceC3168 r15) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r14 = this;
            ᵢᵢ.ˋⁱ r0 = new ᵢᵢ.ˋⁱ
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f17171
            r5 = r15
            יי.ˉⁱ r5 = (p254.C3159) r5
            r5.mo4875(r4, r2, r1, r2)
            r0.m10108(r2)
            int r4 = r0.m10095()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L8f
            r5.f12219 = r2
            r5.m7828(r3, r2)
            r1 = r3
        L24:
            r15 = 0
        L25:
            byte[] r4 = r0.f17171
            r6 = 7
            r5.mo4875(r4, r2, r6, r2)
            r0.m10108(r2)
            int r4 = r0.m10100()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r4 == r8) goto L4b
            if (r4 == r9) goto L4b
            r5.f12219 = r2
            int r1 = r1 + 1
            int r15 = r1 - r3
            r4 = 8192(0x2000, float:1.148E-41)
            if (r15 < r4) goto L47
            return r2
        L47:
            r5.m7828(r1, r2)
            goto L24
        L4b:
            r8 = 1
            int r15 = r15 + r8
            r10 = 4
            if (r15 < r10) goto L51
            return r8
        L51:
            byte[] r8 = r0.f17171
            int r11 = r8.length
            r12 = -1
            if (r11 >= r6) goto L59
            r11 = -1
            goto L86
        L59:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r7]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L80
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L81
        L80:
            r6 = 4
        L81:
            if (r4 != r9) goto L85
            int r6 = r6 + 2
        L85:
            int r11 = r11 + r6
        L86:
            if (r11 != r12) goto L89
            return r2
        L89:
            int r11 = r11 + (-7)
            r5.m7828(r11, r2)
            goto L25
        L8f:
            r0.m10085(r7)
            int r4 = r0.m10079()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.m7828(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: p341.C3892.mo4074(יי.ˑי):boolean");
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    public final int mo4075(InterfaceC3168 interfaceC3168, C2430 c2430) throws EOFException, InterruptedIOException {
        C4457 c4457 = this.f15042;
        int iMo3679 = ((C3159) interfaceC3168).mo3679(c4457.f17171, 0, 16384);
        if (iMo3679 == -1) {
            return -1;
        }
        c4457.m10108(0);
        c4457.m10104(iMo3679);
        boolean z = this.f15043;
        C3877 c3877 = this.f15044;
        if (!z) {
            c3877.f14888 = 0L;
            this.f15043 = true;
        }
        c3877.mo9077(c4457);
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
        this.f15043 = false;
        this.f15044.mo9076();
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f15044.mo9079(interfaceC3177, new C3898(0, 1));
        interfaceC3177.mo4850();
        interfaceC3177.mo4858(new C3176(-9223372036854775807L));
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
