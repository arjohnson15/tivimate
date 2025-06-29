package p200;

import java.util.Arrays;

/* renamed from: ˎٴ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2743 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int[] f10727;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f10728;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int[] f10729;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long[] f10730;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f10731;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f10732;

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof p200.C2743
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            ˎٴ.ˉⁱ r1 = (p200.C2743) r1
            int r3 = r1.f10728
            int r5 = r0.f10728
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f10727
            int[] r5 = r0.f10729
            long[] r6 = r0.f10730
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L73
            r8 = 0
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L6e
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L3d:
            if (r13 >= r11) goto L6c
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L68
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r16 = r1.m6972(r15)
            if (r16 < 0) goto L5c
            int[] r15 = r1.f10729
            r15 = r15[r16]
            if (r14 == r15) goto L68
            return r4
        L5c:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Cannot find value for key "
            java.lang.String r2 = ـˈ.ˉᵎ.ˉⁱ(r2, r15)
            r1.<init>(r2)
            throw r1
        L68:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L6c:
            if (r11 != r12) goto L73
        L6e:
            if (r8 == r7) goto L73
            int r8 = r8 + 1
            goto L23
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2743.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.f10727;
        int[] iArr2 = this.f10729;
        long[] jArr = this.f10730;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            i3 += iArr2[i6] ^ iArr[i6];
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f10728
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.f10727
            int[] r3 = r0.f10729
            long[] r4 = r0.f10730
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
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
            if (r15 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L38:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f10728
            if (r8 >= r14) goto L60
            java.lang.String r14 = ", "
            r1.append(r14)
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1e
        L6b:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2743.toString():java.lang.String");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m6972(int i) {
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & 127;
        int i5 = this.f10732;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f10730;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.f10727[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m6973(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC2745.m6981(i)) : 0;
        this.f10732 = iMax;
        if (iMax == 0) {
            jArr = AbstractC2745.f10739;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f10730 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f10731 = AbstractC2745.m6982(this.f10732) - this.f10728;
        this.f10727 = new int[iMax];
        this.f10729 = new int[iMax];
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m6974(int i) {
        int i2 = this.f10732;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f10730;
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
}
