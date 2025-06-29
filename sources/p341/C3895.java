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

/* renamed from: ᵎˑ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3895 implements InterfaceC3165 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f15070;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3877 f15071 = new C3877();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4457 f15069 = new C4457(2786);

    @Override // p254.InterfaceC3165
    /* renamed from: ʽᐧ */
    public final void mo4073() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r5.f12219 = 0;
        r4 = r4 + 1;
     */
    @Override // p254.InterfaceC3165
    /* renamed from: ʿʼ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo4074(p254.InterfaceC3168 r14) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r13 = this;
            ᵢᵢ.ˋⁱ r0 = new ᵢᵢ.ˋⁱ
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f17171
            r5 = r14
            יי.ˉⁱ r5 = (p254.C3159) r5
            r5.mo4875(r4, r2, r1, r2)
            r0.m10108(r2)
            int r4 = r0.m10095()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L80
            r5.f12219 = r2
            r5.m7828(r3, r2)
            r4 = r3
        L24:
            r14 = 0
        L25:
            byte[] r6 = r0.f17171
            r8 = 6
            r5.mo4875(r6, r2, r8, r2)
            r0.m10108(r2)
            int r6 = r0.m10100()
            r9 = 2935(0xb77, float:4.113E-42)
            if (r6 == r9) goto L45
            r5.f12219 = r2
            int r4 = r4 + 1
            int r14 = r4 - r3
            r6 = 8192(0x2000, float:1.148E-41)
            if (r14 < r6) goto L41
            return r2
        L41:
            r5.m7828(r4, r2)
            goto L24
        L45:
            r6 = 1
            int r14 = r14 + r6
            r9 = 4
            if (r14 < r9) goto L4b
            return r6
        L4b:
            byte[] r10 = r0.f17171
            int r11 = r10.length
            r12 = -1
            if (r11 >= r8) goto L53
            r9 = -1
            goto L77
        L53:
            r11 = 5
            r11 = r10[r11]
            r11 = r11 & 248(0xf8, float:3.48E-43)
            int r11 = r11 >> r7
            if (r11 <= r1) goto L6b
            r8 = 2
            r9 = r10[r8]
            r9 = r9 & 7
            int r9 = r9 << 8
            r10 = r10[r7]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r9 = r9 | r10
            int r9 = r9 + r6
            int r9 = r9 * 2
            goto L77
        L6b:
            r6 = r10[r9]
            r9 = r6 & 192(0xc0, float:2.69E-43)
            int r8 = r9 >> 6
            r6 = r6 & 63
            int r9 = p254.AbstractC3152.m7812(r8, r6)
        L77:
            if (r9 != r12) goto L7a
            return r2
        L7a:
            int r9 = r9 + (-6)
            r5.m7828(r9, r2)
            goto L25
        L80:
            r0.m10085(r7)
            int r4 = r0.m10079()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.m7828(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: p341.C3895.mo4074(יי.ˑי):boolean");
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ˉי */
    public final int mo4075(InterfaceC3168 interfaceC3168, C2430 c2430) throws EOFException, InterruptedIOException {
        C4457 c4457 = this.f15069;
        int iMo3679 = ((C3159) interfaceC3168).mo3679(c4457.f17171, 0, 2786);
        if (iMo3679 == -1) {
            return -1;
        }
        c4457.m10108(0);
        c4457.m10104(iMo3679);
        boolean z = this.f15070;
        C3877 c3877 = this.f15071;
        if (!z) {
            c3877.f14888 = 0L;
            this.f15070 = true;
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
        this.f15070 = false;
        this.f15071.mo9076();
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ᐧʻ */
    public final void mo4084(InterfaceC3177 interfaceC3177) {
        this.f15071.mo9079(interfaceC3177, new C3898(0, 1));
        interfaceC3177.mo4850();
        interfaceC3177.mo4858(new C3176(-9223372036854775807L));
    }

    @Override // p254.InterfaceC3165
    /* renamed from: ﹳﹳ */
    public final InterfaceC3165 mo4086() {
        return this;
    }
}
