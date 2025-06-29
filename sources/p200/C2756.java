package p200;

import java.util.Arrays;
import p340.AbstractC3876;

/* renamed from: ˎٴ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2756 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object[] f10780;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f10781;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object[] f10782;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long[] f10783;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f10784;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f10785;

    public /* synthetic */ C2756() {
        this(6);
    }

    public C2756(int i) {
        this.f10783 = AbstractC2745.f10739;
        Object[] objArr = AbstractC3876.f14875;
        this.f10780 = objArr;
        this.f10782 = objArr;
        if (i >= 0) {
            m7025(AbstractC2745.m6984(i));
        } else {
            AbstractC3876.m9071("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        r26 = r3;
        r7 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        r24 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2756.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.f10780;
        Object[] objArr2 = this.f10782;
        long[] jArr = this.f10783;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int iHashCode = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return iHashCode;
                    }
                }
                if (i2 == length) {
                    i = iHashCode;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[PHI: r8
  0x0070: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f10781
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f10780
            java.lang.Object[] r3 = r0.f10782
            long[] r4 = r0.f10783
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L75
            r6 = 0
            r7 = 0
            r8 = 0
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L70
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L38:
            if (r13 >= r11) goto L6e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L6a
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            java.lang.String r16 = "(this)"
            if (r15 != r0) goto L50
            r15 = r16
        L50:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L5c
            r14 = r16
        L5c:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f10781
            if (r8 >= r14) goto L6a
            java.lang.String r14 = ", "
            r1.append(r14)
        L6a:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L6e:
            if (r11 != r12) goto L75
        L70:
            if (r7 == r5) goto L75
            int r7 = r7 + 1
            goto L1e
        L75:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2756.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        r10 = -1;
     */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7023(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = 0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f10785
            int r1 = r1 >>> 7
        L17:
            r1 = r1 & r3
            long[] r4 = r13.f10783
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L45:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L64
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f10780
            r11 = r11[r10]
            boolean r11 = p070.AbstractC1549.m5138(r11, r14)
            if (r11 == 0) goto L5e
            goto L6e
        L5e:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L45
        L64:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L77
            r10 = -1
        L6e:
            if (r10 < 0) goto L75
            java.lang.Object[] r14 = r13.f10782
            r14 = r14[r10]
            goto L76
        L75:
            r14 = 0
        L76:
            return r14
        L77:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2756.m7023(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        r2 = r0.m7026(r5);
        r6 = 128;
        r13 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        if (r0.f10784 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        if (((r0.f10783[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
    
        r1 = r0;
        r30 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        r2 = r0.f10785;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r2 <= 8) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bf, code lost:
    
        if (java.lang.Long.compare((r0.f10781 * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c1, code lost:
    
        r2 = r0.f10783;
        r3 = r0.f10785;
        r8 = r0.f10780;
        r9 = r0.f10782;
        p200.AbstractC2745.m6983(r2, r3);
        r15 = 0;
        r23 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        if (r15 == r3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
    
        r18 = r15 >> 3;
        r19 = (r15 & 7) << 3;
        r24 = (r2[r18] >> r19) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00df, code lost:
    
        if (r24 != r6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e1, code lost:
    
        r23 = r15;
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ea, code lost:
    
        if (r24 == 254) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ef, code lost:
    
        r24 = r8[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        if (r24 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f3, code lost:
    
        r24 = r24.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f8, code lost:
    
        r24 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fa, code lost:
    
        r24 = r24 * r4;
        r4 = (r24 ^ (r24 << 16)) >>> 7;
        r26 = r0.m7026(r4);
        r4 = r4 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0114, code lost:
    
        if ((((r26 - r4) & r3) / 8) != (((r15 - r4) & r3) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0116, code lost:
    
        r30 = r11;
        r2[r18] = ((r24 & 127) << r19) | (r2[r18] & (~(255 << r19)));
        r2[r2.length - 1] = r2[0];
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0134, code lost:
    
        r11 = r30;
        r4 = -862048943;
        r6 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013c, code lost:
    
        r30 = r11;
        r20 = r15;
        r4 = r26 >> 3;
        r6 = r2[r4];
        r10 = (r26 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014f, code lost:
    
        if (((r6 >> r10) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0151, code lost:
    
        r2[r4] = ((~(255 << r10)) & r6) | ((r24 & 127) << r10);
        r2[r18] = (r2[r18] & (~(255 << r19))) | (128 << r19);
        r8[r26] = r8[r20];
        r8[r20] = null;
        r9[r26] = r9[r20];
        r9[r20] = null;
        r1 = r20;
        r23 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017d, code lost:
    
        r2[r4] = ((r24 & 127) << r10) | (r6 & (~(255 << r10)));
        r10 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018b, code lost:
    
        if (r10 != (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018d, code lost:
    
        r23 = p200.AbstractC2745.m6980(r2, r20 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0194, code lost:
    
        r23 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0196, code lost:
    
        r8[r23] = r8[r26];
        r8[r26] = r8[r20];
        r8[r20] = r8[r23];
        r9[r23] = r9[r26];
        r9[r26] = r9[r20];
        r9[r20] = r9[r23];
        r1 = r20 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b0, code lost:
    
        r2[r2.length - 1] = r2[0];
        r15 = r1 + 1;
        r0 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c1, code lost:
    
        r1 = r0;
        r30 = r11;
        r1.f10784 = p200.AbstractC2745.m6982(r1.f10785) - r1.f10781;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d3, code lost:
    
        r1 = r0;
        r30 = r11;
        r0 = p200.AbstractC2745.m6985(r1.f10785);
        r2 = r1.f10783;
        r3 = r1.f10780;
        r4 = r1.f10782;
        r6 = r1.f10785;
        r1.m7025(r0);
        r0 = r1.f10783;
        r7 = r1.f10780;
        r8 = r1.f10782;
        r9 = r1.f10785;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f2, code lost:
    
        if (r10 >= r6) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0202, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & r13) >= 128) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0204, code lost:
    
        r11 = r3[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0206, code lost:
    
        if (r11 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0208, code lost:
    
        r12 = r11.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0210, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0212, code lost:
    
        r12 = r12 * (-862048943);
        r12 = r12 ^ (r12 << 16);
        r15 = r1.m7026(r12 >>> 7);
        r13 = r12 & 127;
        r12 = r15 >> 3;
        r19 = (r15 & 7) << 3;
        r23 = r2;
        r24 = r3;
        r2 = (r0[r12] & (~(255 << r19))) | (r13 << r19);
        r0[r12] = r2;
        r0[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r2;
        r7[r15] = r11;
        r8[r15] = r4[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x024a, code lost:
    
        r23 = r2;
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x024e, code lost:
    
        r10 = r10 + 1;
        r2 = r23;
        r3 = r24;
        r13 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0257, code lost:
    
        r2 = r1.m7026(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x025b, code lost:
    
        r3 = 1;
        r1.f10781++;
        r0 = r1.f10784;
        r4 = r1.f10783;
        r5 = r2 >> 3;
        r6 = r4[r5];
        r8 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0276, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0279, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x027a, code lost:
    
        r1.f10784 = r0 - r3;
        r0 = r1.f10785;
        r6 = (r6 & (~(255 << r8))) | (r30 << r8);
        r4[r5] = r6;
        r4[(((r2 - 7) & r0) + (r0 & 7)) >> 3] = r6;
        r0 = ~r2;
     */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7024(java.lang.Object r33, java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2756.m7024(java.lang.Object, java.lang.Object):void");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7025(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC2745.m6981(i)) : 0;
        this.f10785 = iMax;
        if (iMax == 0) {
            jArr = AbstractC2745.f10739;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f10783 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f10784 = AbstractC2745.m6982(this.f10785) - this.f10781;
        this.f10780 = new Object[iMax];
        this.f10782 = new Object[iMax];
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m7026(int i) {
        int i2 = this.f10785;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f10783;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        r10 = -1;
     */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7027(java.lang.String r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = 0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f10785
            int r1 = r1 >>> 7
        L17:
            r1 = r1 & r3
            long[] r4 = r13.f10783
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L45:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L64
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f10780
            r11 = r11[r10]
            boolean r11 = p070.AbstractC1549.m5138(r11, r14)
            if (r11 == 0) goto L5e
            goto L6e
        L5e:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L45
        L64:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto La5
            r10 = -1
        L6e:
            r14 = 0
            if (r10 < 0) goto La4
            int r0 = r13.f10781
            int r0 = r0 + (-1)
            r13.f10781 = r0
            long[] r0 = r13.f10783
            int r1 = r13.f10785
            int r2 = r10 >> 3
            r3 = r10 & 7
            int r3 = r3 << 3
            r4 = r0[r2]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r6 = r6 << r3
            long r3 = r4 | r6
            r0[r2] = r3
            int r2 = r10 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r0 = r13.f10780
            r0[r10] = r14
            java.lang.Object[] r0 = r13.f10782
            r1 = r0[r10]
            r0[r10] = r14
            return r1
        La4:
            return r14
        La5:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2756.m7027(java.lang.String):java.lang.Object");
    }
}
