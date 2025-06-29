package p200;

import java.util.Arrays;
import p340.AbstractC3876;

/* renamed from: ˎٴ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2747 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long[] f10742;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f10743;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f10744;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long[] f10745;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f10746;

    public /* synthetic */ C2747() {
        this(6);
    }

    public C2747(int i) {
        this.f10745 = AbstractC2745.f10739;
        this.f10742 = AbstractC2759.f10790;
        if (i >= 0) {
            m6992(AbstractC2745.m6984(i));
        } else {
            AbstractC3876.m9071("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof p200.C2747
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            ˎٴ.ˏᴵ r1 = (p200.C2747) r1
            int r3 = r1.f10746
            int r5 = r0.f10746
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.f10742
            long[] r5 = r0.f10745
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = 0
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.m6990(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2747.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.f10742;
        long[] jArr2 = this.f10745;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i2 << 3) + i5];
                            i3 += (int) (j2 ^ (j2 >>> 32));
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[PHI: r7
  0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            long[] r2 = r0.f10742
            long[] r3 = r0.f10745
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r5 = 0
            r6 = 0
            r7 = 0
        L18:
            r8 = r3[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L5d
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L32:
            if (r12 >= r10) goto L5b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L57
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            r15 = -1
            if (r7 != r15) goto L4b
            java.lang.String r2 = "..."
            r1.append(r2)
            goto L67
        L4b:
            if (r7 == 0) goto L52
            java.lang.String r15 = ", "
            r1.append(r15)
        L52:
            r1.append(r13)
            int r7 = r7 + 1
        L57:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L32
        L5b:
            if (r10 != r11) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L18
        L62:
            java.lang.String r2 = "]"
            r1.append(r2)
        L67:
            java.lang.String r1 = r1.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2747.toString():java.lang.String");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6987(C2747 c2747) {
        long[] jArr = c2747.f10742;
        long[] jArr2 = c2747.f10745;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        long j2 = jArr[(i << 3) + i3];
                        this.f10742[m6994(j2)] = j2;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m6988(int i) {
        int i2 = this.f10744;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f10745;
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
    
        r24 = r5;
        r1 = ((~r10) << 6) & r10;
        r10 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        if ((r1 & (-9187201950435737472L)) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c1, code lost:
    
        r1 = -1;
     */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6989(p200.C2747 r26) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2747.m6989(ˎٴ.ˏᴵ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        r10 = -1;
     */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6990(long r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 32
            long r1 = r18 >>> r1
            long r1 = r18 ^ r1
            int r2 = (int) r1
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r1 = r2 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f10744
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = 0
        L1a:
            long[] r6 = r0.f10745
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L47:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L64
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f10742
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L5e
            goto L6e
        L5e:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L47
        L64:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 == 0) goto L72
            r10 = -1
        L6e:
            if (r10 < 0) goto L71
            r4 = 1
        L71:
            return r4
        L72:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2747.m6990(long):boolean");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6991(long j) {
        this.f10742[m6994(j)] = j;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m6992(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC2745.m6981(i)) : 0;
        this.f10744 = iMax;
        if (iMax == 0) {
            jArr = AbstractC2745.f10739;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f10745 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f10743 = AbstractC2745.m6982(this.f10744) - this.f10746;
        this.f10742 = new long[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        r11 = -1;
     */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6993(long r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = 32
            long r1 = r16 >>> r1
            long r1 = r16 ^ r1
            int r2 = (int) r1
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r1 = r2 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f10744
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
        L18:
            long[] r5 = r0.f10745
            int r6 = r1 >> 3
            r7 = r1 & 7
            int r7 = r7 << 3
            r8 = r5[r6]
            long r8 = r8 >>> r7
            int r6 = r6 + 1
            r10 = r5[r6]
            int r5 = 64 - r7
            long r5 = r10 << r5
            long r10 = (long) r7
            long r10 = -r10
            r7 = 63
            long r10 = r10 >> r7
            long r5 = r5 & r10
            long r5 = r5 | r8
            long r7 = (long) r2
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r9
            long r7 = r7 ^ r5
            long r9 = r7 - r9
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L45:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L62
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r1
            r11 = r11 & r3
            long[] r12 = r0.f10742
            r13 = r12[r11]
            int r12 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r12 != 0) goto L5c
            goto L6c
        L5c:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L45
        L62:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L72
            r11 = -1
        L6c:
            if (r11 < 0) goto L71
            r15.m6995(r11)
        L71:
            return
        L72:
            int r4 = r4 + 8
            int r1 = r1 + r4
            r1 = r1 & r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2747.m6993(long):void");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m6994(long j) {
        long[] jArr;
        long[] jArr2;
        int i;
        char c = ' ';
        int i2 = -862048943;
        int i3 = ((int) (j ^ (j >>> 32))) * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f10744;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.f10745;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = i9;
            long j2 = (((-i11) >> 63) & (jArr3[i10 + 1] << (64 - i11))) | (jArr3[i10] >>> i11);
            long j3 = i6;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            for (long j5 = (j4 - 72340172838076673L) & (~j4) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j5) >> 3)) & i7;
                if (this.f10742[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
            }
            int i13 = 8;
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                int iM6988 = m6988(i5);
                long j6 = 128;
                if (this.f10743 == 0 && ((this.f10745[iM6988 >> 3] >> ((iM6988 & 7) << 3)) & 255) != 254) {
                    int i14 = this.f10744;
                    if (i14 <= 8 || Long.compare((this.f10746 * 32) ^ Long.MIN_VALUE, (i14 * 25) ^ Long.MIN_VALUE) > 0) {
                        int iM6985 = AbstractC2745.m6985(this.f10744);
                        long[] jArr4 = this.f10745;
                        long[] jArr5 = this.f10742;
                        int i15 = this.f10744;
                        m6992(iM6985);
                        long[] jArr6 = this.f10745;
                        long[] jArr7 = this.f10742;
                        int i16 = this.f10744;
                        int i17 = 0;
                        while (i17 < i15) {
                            if (((jArr4[i17 >> 3] >> ((i17 & 7) << 3)) & 255) < j6) {
                                long j7 = jArr5[i17];
                                int i18 = ((int) (j7 ^ (j7 >>> 32))) * (-862048943);
                                int i19 = (i18 << 16) ^ i18;
                                int iM69882 = m6988(i19 >>> 7);
                                long j8 = i19 & 127;
                                int i20 = iM69882 >> 3;
                                int i21 = (iM69882 & 7) << 3;
                                jArr = jArr4;
                                jArr2 = jArr5;
                                long j9 = (jArr6[i20] & (~(255 << i21))) | (j8 << i21);
                                jArr6[i20] = j9;
                                jArr6[(((iM69882 - 7) & i16) + (i16 & 7)) >> 3] = j9;
                                jArr7[iM69882] = j7;
                            } else {
                                jArr = jArr4;
                                jArr2 = jArr5;
                            }
                            i17++;
                            jArr4 = jArr;
                            jArr5 = jArr2;
                            j6 = 128;
                        }
                    } else {
                        long[] jArr8 = this.f10745;
                        int i22 = this.f10744;
                        long[] jArr9 = this.f10742;
                        AbstractC2745.m6983(jArr8, i22);
                        int i23 = 0;
                        int i24 = -1;
                        while (i23 != i22) {
                            int i25 = i23 >> 3;
                            int i26 = (i23 & 7) << 3;
                            long j10 = (jArr8[i25] >> i26) & 255;
                            if (j10 == 128) {
                                i24 = i23;
                                i23++;
                            } else if (j10 != 254) {
                                i23++;
                            } else {
                                long j11 = jArr9[i23];
                                int i27 = ((int) (j11 ^ (j11 >>> c))) * i2;
                                int i28 = ((i27 << 16) ^ i27) >>> 7;
                                int iM69883 = m6988(i28);
                                int i29 = i28 & i22;
                                if (((iM69883 - i29) & i22) / 8 == ((i23 - i29) & i22) / i13) {
                                    jArr8[i25] = (jArr8[i25] & (~(255 << i26))) | ((r12 & 127) << i26);
                                    jArr8[jArr8.length - 1] = (jArr8[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i23++;
                                    c = ' ';
                                    i2 = -862048943;
                                } else {
                                    int iM6980 = i24;
                                    int i30 = iM69883 >> 3;
                                    long j12 = jArr8[i30];
                                    int i31 = (iM69883 & 7) << 3;
                                    if (((j12 >> i31) & 255) == 128) {
                                        int i32 = i23;
                                        jArr8[i30] = ((r12 & 127) << i31) | (j12 & (~(255 << i31)));
                                        jArr8[i25] = (jArr8[i25] & (~(255 << i26))) | (128 << i26);
                                        jArr9[iM69883] = jArr9[i32];
                                        jArr9[i32] = 0;
                                        iM6980 = i32;
                                        i = iM6980;
                                    } else {
                                        int i33 = i23;
                                        jArr8[i30] = ((r12 & 127) << i31) | (j12 & (~(255 << i31)));
                                        if (iM6980 == -1) {
                                            iM6980 = AbstractC2745.m6980(jArr8, i33 + 1, i22);
                                        }
                                        jArr9[iM6980] = jArr9[iM69883];
                                        jArr9[iM69883] = jArr9[i33];
                                        jArr9[i33] = jArr9[iM6980];
                                        i = i33 - 1;
                                    }
                                    jArr8[jArr8.length - 1] = (jArr8[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i23 = i + 1;
                                    i24 = iM6980;
                                    c = ' ';
                                    i2 = -862048943;
                                    i13 = 8;
                                }
                            }
                        }
                        this.f10743 = AbstractC2745.m6982(this.f10744) - this.f10746;
                    }
                    iM6988 = m6988(i5);
                }
                this.f10746++;
                int i34 = this.f10743;
                long[] jArr10 = this.f10745;
                int i35 = iM6988 >> 3;
                long j13 = jArr10[i35];
                int i36 = (iM6988 & 7) << 3;
                this.f10743 = i34 - (((j13 >> i36) & 255) != 128 ? 0 : 1);
                int i37 = this.f10744;
                long j14 = (j13 & (~(255 << i36))) | (j3 << i36);
                jArr10[i35] = j14;
                jArr10[(((iM6988 - 7) & i37) + (i37 & 7)) >> 3] = j14;
                return iM6988;
            }
            i9 = i12 + 8;
            i8 = (i8 + i9) & i7;
            c = ' ';
            i2 = -862048943;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m6995(int i) {
        this.f10746--;
        long[] jArr = this.f10745;
        int i2 = this.f10744;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }
}
