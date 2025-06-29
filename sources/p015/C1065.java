package p015;

import p166.C2430;
import p254.C3153;
import p254.C3159;
import p254.C3171;
import p254.InterfaceC3172;
import p254.InterfaceC3183;

/* renamed from: ʻٴ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1065 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC3183 f4590;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C3171 f4591;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3153 f4592;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f4593;

    public C1065(InterfaceC3172 interfaceC3172, InterfaceC3183 interfaceC3183, long j, long j2, long j3, long j4, long j5, int i) {
        this.f4590 = interfaceC3183;
        this.f4593 = i;
        this.f4592 = new C3153(interfaceC3172, j, j2, j3, j4, j5);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m4088(C3159 c3159, long j, C2430 c2430) {
        if (j == c3159.f12217) {
            return 0;
        }
        c2430.f9656 = j;
        return 1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m4089(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        return m4088(r28, r8, r29);
     */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m4090(p254.C3159 r28, p166.C2430 r29) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            יי.ٴˎ r3 = r0.f4591
            p383.AbstractC4464.m10146(r3)
            long r4 = r3.f12265
            long r6 = r3.f12266
            long r8 = r3.f12262
            long r6 = r6 - r4
            int r10 = r0.f4593
            long r10 = (long) r10
            r12 = 0
            יי.ﹶˆ r13 = r0.f4590
            int r14 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r14 > 0) goto L26
            r0.f4591 = r12
            r13.mo7562()
            int r1 = m4088(r1, r4, r2)
            return r1
        L26:
            long r4 = r1.f12217
            long r4 = r8 - r4
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto Lc5
            r10 = 262144(0x40000, double:1.295163E-318)
            int r14 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r14 > 0) goto Lc5
            int r5 = (int) r4
            r1.mo4854(r5)
            r4 = 0
            r1.f12219 = r4
            long r4 = r3.f12260
            יי.ˏᵢ r4 = r13.mo7567(r1, r4)
            r5 = -3
            int r14 = r4.f12243
            if (r14 == r5) goto Lb8
            r5 = -2
            long r8 = r4.f12241
            r16 = r13
            long r12 = r4.f12242
            if (r14 == r5) goto L99
            r4 = -1
            if (r14 == r4) goto L7a
            if (r14 != 0) goto L72
            long r3 = r1.f12217
            long r3 = r12 - r3
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 < 0) goto L67
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 > 0) goto L67
            int r4 = (int) r3
            r1.mo4854(r4)
        L67:
            r3 = 0
            r0.f4591 = r3
            r16.mo7562()
            int r1 = m4088(r1, r12, r2)
            return r1
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid case"
            r1.<init>(r2)
            throw r1
        L7a:
            r3.f12261 = r8
            r3.f12266 = r12
            long r4 = r3.f12267
            long r6 = r3.f12265
            long r10 = r3.f12263
            long r14 = r3.f12260
            r15 = r14
            r17 = r4
            r19 = r8
            r21 = r6
            r23 = r12
            r25 = r10
            long r4 = p254.C3171.m7838(r15, r17, r19, r21, r23, r25)
            r3.f12262 = r4
            goto L6
        L99:
            r3.f12267 = r8
            r3.f12265 = r12
            long r4 = r3.f12261
            long r6 = r3.f12266
            long r10 = r3.f12263
            long r14 = r3.f12260
            r15 = r14
            r17 = r8
            r19 = r4
            r21 = r12
            r23 = r6
            r25 = r10
            long r4 = p254.C3171.m7838(r15, r17, r19, r21, r23, r25)
            r3.f12262 = r4
            goto L6
        Lb8:
            r3 = r12
            r16 = r13
            r0.f4591 = r3
            r16.mo7562()
            int r1 = m4088(r1, r8, r2)
            return r1
        Lc5:
            int r1 = m4088(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.C1065.m4090(יי.ˉⁱ, ˊﹶ.ᵎˏ):int");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m4091(long j) {
        C3171 c3171 = this.f4591;
        if (c3171 == null || c3171.f12264 != j) {
            C3153 c3153 = this.f4592;
            this.f4591 = new C3171(j, c3153.f12193.mo4095(j), c3153.f12192, c3153.f12195, c3153.f12191, c3153.f12194);
        }
    }
}
