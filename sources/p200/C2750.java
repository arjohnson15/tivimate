package p200;

import java.util.Arrays;
import java.util.NoSuchElementException;
import p070.AbstractC1549;

/* renamed from: ˎٴ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2750 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object[] f10752;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f10753;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long[] f10754;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long[] f10755;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f10756;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f10757;

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
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
            boolean r3 = r1 instanceof p200.C2750
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            ˎٴ.ˑי r1 = (p200.C2750) r1
            int r3 = r1.f10753
            int r5 = r0.f10753
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f10752
            long[] r5 = r0.f10754
            long[] r6 = r0.f10755
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L63
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
            if (r15 == 0) goto L5e
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L3d:
            if (r13 >= r11) goto L5c
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L58
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r16 = r5[r14]
            long r14 = r1.m6998(r15)
            int r18 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r18 == 0) goto L58
            return r4
        L58:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L5c:
            if (r11 != r12) goto L63
        L5e:
            if (r8 == r7) goto L63
            int r8 = r8 + 1
            goto L23
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2750.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.f10752;
        long[] jArr = this.f10754;
        long[] jArr2 = this.f10755;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int iHashCode = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            long j2 = jArr[i5];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ ((int) (j2 ^ (j2 >>> 32)));
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

    public final String toString() {
        int i;
        int i2;
        if (this.f10753 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f10752;
        long[] jArr = this.f10754;
        long[] jArr2 = this.f10755;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Object obj = objArr[i7];
                            i2 = i3;
                            long j2 = jArr[i7];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j2);
                            i4++;
                            if (i4 < this.f10753) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m6996(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f10757;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f10755;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (AbstractC1549.m5138(this.f10752[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        r2 = r0.m6999(r5);
        r6 = 128;
        r13 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        if (r0.f10756 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        if (((r0.f10755[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
    
        r1 = r0;
        r36 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        r2 = r0.f10757;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r2 <= 8) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bf, code lost:
    
        if (java.lang.Long.compare((r0.f10753 * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c1, code lost:
    
        r2 = r0.f10755;
        r3 = r0.f10757;
        r8 = r0.f10752;
        r9 = r0.f10754;
        p200.AbstractC2745.m6983(r2, r3);
        r15 = 0;
        r27 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        if (r15 == r3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
    
        r19 = r15 >> 3;
        r22 = (r15 & 7) << 3;
        r28 = (r2[r19] >> r22) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00df, code lost:
    
        if (r28 != r6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e1, code lost:
    
        r27 = r15;
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ea, code lost:
    
        if (r28 == 254) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ef, code lost:
    
        r28 = r8[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        if (r28 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f3, code lost:
    
        r28 = r28.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f8, code lost:
    
        r28 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fa, code lost:
    
        r28 = r28 * r4;
        r4 = (r28 ^ (r28 << 16)) >>> 7;
        r30 = r0.m6999(r4);
        r4 = r4 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0119, code lost:
    
        if ((((r30 - r4) & r3) / 8) != (((r15 - r4) & r3) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011b, code lost:
    
        r36 = r11;
        r2[r19] = ((r28 & 127) << r22) | (r2[r19] & (~(255 << r22)));
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013d, code lost:
    
        r11 = r36;
        r4 = -862048943;
        r6 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0145, code lost:
    
        r36 = r11;
        r20 = r15;
        r4 = r30 >> 3;
        r6 = r2[r4];
        r10 = (r30 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0158, code lost:
    
        if (((r6 >> r10) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015a, code lost:
    
        r2[r4] = ((~(255 << r10)) & r6) | ((r28 & 127) << r10);
        r2[r19] = (r2[r19] & (~(255 << r22))) | (128 << r22);
        r8[r30] = r8[r20];
        r8[r20] = null;
        r9[r30] = r9[r20];
        r9[r20] = 0;
        r1 = r20;
        r27 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0186, code lost:
    
        r2[r4] = ((r28 & 127) << r10) | (r6 & (~(255 << r10)));
        r10 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0194, code lost:
    
        if (r10 != (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0196, code lost:
    
        r27 = p200.AbstractC2745.m6980(r2, r20 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x019d, code lost:
    
        r27 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x019f, code lost:
    
        r8[r27] = r8[r30];
        r8[r30] = r8[r20];
        r8[r20] = r8[r27];
        r9[r27] = r9[r30];
        r9[r30] = r9[r20];
        r9[r20] = r9[r27];
        r1 = r20 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b9, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r1 + 1;
        r0 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ce, code lost:
    
        r1 = r0;
        r36 = r11;
        r1.f10756 = p200.AbstractC2745.m6982(r1.f10757) - r1.f10753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e0, code lost:
    
        r1 = r0;
        r36 = r11;
        r0 = p200.AbstractC2745.m6985(r1.f10757);
        r2 = r1.f10755;
        r3 = r1.f10752;
        r4 = r1.f10754;
        r6 = r1.f10757;
        r1.m7000(r0);
        r0 = r1.f10755;
        r7 = r1.f10752;
        r8 = r1.f10754;
        r9 = r1.f10757;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ff, code lost:
    
        if (r10 >= r6) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x020f, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & r13) >= 128) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0211, code lost:
    
        r11 = r3[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0213, code lost:
    
        if (r11 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0215, code lost:
    
        r12 = r11.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x021d, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x021f, code lost:
    
        r12 = r12 * (-862048943);
        r12 = r12 ^ (r12 << 16);
        r15 = r1.m6999(r12 >>> 7);
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
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0257, code lost:
    
        r23 = r2;
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x025b, code lost:
    
        r10 = r10 + 1;
        r2 = r23;
        r3 = r24;
        r13 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0264, code lost:
    
        r2 = r1.m6999(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0268, code lost:
    
        r3 = 1;
        r1.f10753++;
        r0 = r1.f10756;
        r4 = r1.f10755;
        r5 = r2 >> 3;
        r6 = r4[r5];
        r8 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0283, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0286, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0287, code lost:
    
        r1.f10756 = r0 - r3;
        r0 = r1.f10757;
        r6 = (r6 & (~(255 << r8))) | (r36 << r8);
        r4[r5] = r6;
        r4[(((r2 - 7) & r0) + (r0 & 7)) >> 3] = r6;
        r0 = ~r2;
     */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6997(java.lang.String r39, long r40) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2750.m6997(java.lang.String, long):void");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long m6998(Object obj) {
        int iM6996 = m6996(obj);
        if (iM6996 >= 0) {
            return this.f10754[iM6996];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m6999(int i) {
        int i2 = this.f10757;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f10755;
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

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m7000(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC2745.m6981(i)) : 0;
        this.f10757 = iMax;
        if (iMax == 0) {
            jArr = AbstractC2745.f10739;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f10755 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f10756 = AbstractC2745.m6982(this.f10757) - this.f10753;
        this.f10752 = new Object[iMax];
        this.f10754 = new long[iMax];
    }
}
