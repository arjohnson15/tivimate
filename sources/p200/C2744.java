package p200;

import java.util.Arrays;
import p340.AbstractC3876;

/* renamed from: ˎٴ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2744 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f10734;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f10737;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f10738;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long[] f10736 = AbstractC2745.f10739;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int[] f10733 = AbstractC2748.f10747;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object[] f10735 = AbstractC3876.f14875;

    public C2744(int i) {
        if (i >= 0) {
            m6977(AbstractC2745.m6984(i));
        } else {
            AbstractC3876.m9071("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        r26 = r3;
        r7 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        r24 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2744.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.f10733;
        Object[] objArr = this.f10735;
        long[] jArr = this.f10736;
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
                            int i6 = iArr[i5];
                            Object obj = objArr[i5];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ i6;
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f10734
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.f10733
            java.lang.Object[] r3 = r0.f10735
            long[] r4 = r0.f10736
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
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
            if (r15 == 0) goto L6a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L64
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L56
            java.lang.String r14 = "(this)"
        L56:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f10734
            if (r8 >= r14) goto L64
            java.lang.String r14 = ", "
            r1.append(r14)
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L68:
            if (r11 != r12) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L1e
        L6f:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2744.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        r10 = -1;
     */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6975(int r14) {
        /*
            r13 = this;
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r14
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f10738
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L10:
            long[] r4 = r13.f10736
            int r5 = r0 >> 3
            r6 = r0 & 7
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
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3d:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L58
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f10733
            r11 = r11[r10]
            if (r11 != r14) goto L52
            goto L62
        L52:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3d
        L58:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L6b
            r10 = -1
        L62:
            if (r10 < 0) goto L69
            java.lang.Object[] r14 = r13.f10735
            r14 = r14[r10]
            goto L6a
        L69:
            r14 = 0
        L6a:
            return r14
        L6b:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2744.m6975(int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        r11 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        r3 = r0.m6978(r4);
        r6 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
    
        if (r0.f10737 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        if (((r0.f10736[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        r35 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
    
        r3 = r0.f10738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
    
        if (r3 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        if (java.lang.Long.compare((r0.f10734 * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        r3 = r0.f10736;
        r5 = r0.f10738;
        r8 = r0.f10733;
        r12 = r0.f10735;
        p200.AbstractC2745.m6983(r3, r5);
        r13 = -1;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bd, code lost:
    
        if (r15 == r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        r18 = r15 >> 3;
        r27 = (r15 & 7) << 3;
        r25 = (r3[r18] >> r27) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (r25 != r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        r37 = r15;
        r15 = r15 + 1;
        r13 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        if (r25 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00db, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00de, code lost:
    
        r25 = r8[r15] * r2;
        r2 = (r25 ^ (r25 << 16)) >>> 7;
        r28 = r0.m6978(r2);
        r2 = r2 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fc, code lost:
    
        if ((((r28 - r2) & r5) / 8) != (((r15 - r2) & r5) / r11)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fe, code lost:
    
        r3[r18] = ((r25 & 127) << r27) | (r3[r18] & (~(255 << r27)));
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r13 = r13;
        r12 = r12;
        r2 = -862048943;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
    
        r11 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0129, code lost:
    
        r29 = r12;
        r14 = r13;
        r2 = r15;
        r11 = r28 >> 3;
        r19 = r3[r11];
        r12 = (r28 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013b, code lost:
    
        if (((r19 >> r12) & 255) != r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013d, code lost:
    
        r3[r11] = (r19 & (~(255 << r12))) | ((r25 & 127) << r12);
        r3[r18] = (r3[r18] & (~(255 << r27))) | (128 << r27);
        r8[r28] = r8[r2];
        r8[r2] = 0;
        r29[r28] = r29[r2];
        r29[r2] = null;
        r7 = r2;
        r35 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016a, code lost:
    
        r35 = r9;
        r3[r11] = ((r25 & 127) << r12) | (r19 & (~(255 << r12)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0179, code lost:
    
        if (r14 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x017b, code lost:
    
        r13 = p200.AbstractC2745.m6980(r3, r2 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0182, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0183, code lost:
    
        r8[r13] = r8[r28];
        r8[r28] = r8[r2];
        r8[r2] = r8[r13];
        r29[r13] = r29[r28];
        r29[r28] = r29[r2];
        r29[r2] = r29[r13];
        r7 = r2 - 1;
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x019f, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r7 + 1;
        r13 = r2;
        r12 = r29;
        r9 = r35;
        r2 = -862048943;
        r6 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ba, code lost:
    
        r35 = r9;
        r0.f10737 = p200.AbstractC2745.m6982(r0.f10738) - r0.f10734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ca, code lost:
    
        r35 = r9;
        r2 = p200.AbstractC2745.m6985(r0.f10738);
        r3 = r0.f10736;
        r5 = r0.f10733;
        r6 = r0.f10735;
        r7 = r0.f10738;
        r0.m6977(r2);
        r2 = r0.f10736;
        r8 = r0.f10733;
        r9 = r0.f10735;
        r10 = r0.f10738;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e8, code lost:
    
        if (r11 >= r7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f9, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= 128) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fb, code lost:
    
        r12 = r5[r11];
        r15 = r12 * (-862048943);
        r13 = r0.m6978((r15 ^ (r15 << 16)) >>> 7);
        r18 = r13 >> 3;
        r21 = (r13 & 7) << 3;
        r0 = (r2[r18] & (~(255 << r21))) | ((r15 & 127) << r21);
        r2[r18] = r0;
        r2[(((r13 - 7) & r10) + (r10 & 7)) >> 3] = r0;
        r8[r13] = r12;
        r9[r13] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0231, code lost:
    
        r11 = r11 + 1;
        r0 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0238, code lost:
    
        r0 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x023a, code lost:
    
        r1 = r0.m6978(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023f, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0240, code lost:
    
        r3 = 1;
        r0.f10734++;
        r2 = r0.f10737;
        r4 = r0.f10736;
        r5 = r1 >> 3;
        r6 = r4[r5];
        r8 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x025a, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x025d, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x025e, code lost:
    
        r0.f10737 = r2 - r3;
        r2 = r0.f10738;
        r6 = (r6 & (~(255 << r8))) | (r35 << r8);
        r4[r5] = r6;
        r4[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r6;
        r17 = r1;
     */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6976(int r39, java.lang.Object r40) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2744.m6976(int, java.lang.Object):void");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m6977(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC2745.m6981(i)) : 0;
        this.f10738 = iMax;
        if (iMax == 0) {
            jArr = AbstractC2745.f10739;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f10736 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f10737 = AbstractC2745.m6982(this.f10738) - this.f10734;
        this.f10733 = new int[iMax];
        this.f10735 = new Object[iMax];
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m6978(int i) {
        int i2 = this.f10738;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f10736;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        r10 = -1;
     */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6979(int r14) {
        /*
            r13 = this;
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r14
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f10738
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L10:
            long[] r4 = r13.f10736
            int r5 = r0 >> 3
            r6 = r0 & 7
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
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3d:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L58
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f10733
            r11 = r11[r10]
            if (r11 != r14) goto L52
            goto L62
        L52:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3d
        L58:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L95
            r10 = -1
        L62:
            r14 = 0
            if (r10 < 0) goto L94
            int r0 = r13.f10734
            int r0 = r0 + (-1)
            r13.f10734 = r0
            long[] r0 = r13.f10736
            int r1 = r13.f10738
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
            java.lang.Object[] r0 = r13.f10735
            r1 = r0[r10]
            r0[r10] = r14
            return r1
        L94:
            return r14
        L95:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2744.m6979(int):java.lang.Object");
    }
}
