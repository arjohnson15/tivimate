package p200;

import java.util.Arrays;
import p340.AbstractC3876;

/* renamed from: ˎٴ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2754 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long[] f10771;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f10772;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object[] f10773;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long[] f10774;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f10775;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f10776;

    public /* synthetic */ C2754() {
        this(6);
    }

    public C2754(int i) {
        this.f10774 = AbstractC2745.f10739;
        this.f10771 = AbstractC2759.f10790;
        this.f10773 = AbstractC3876.f14875;
        if (i >= 0) {
            m7010(AbstractC2745.m6984(i));
        } else {
            AbstractC3876.m9071("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
    
        r27 = r3;
        r7 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e4, code lost:
    
        r25 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2754.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.f10771;
        Object[] objArr = this.f10773;
        long[] jArr2 = this.f10774;
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
                            long j2 = jArr[i5];
                            Object obj = objArr[i5];
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
        if (this.f10772 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f10771;
        Object[] objArr = this.f10773;
        long[] jArr2 = this.f10774;
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
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.f10772) {
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        r11 = -1;
     */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7008(long r16) {
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
            int r3 = r0.f10776
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
        L18:
            long[] r5 = r0.f10774
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
            long[] r12 = r0.f10771
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
            if (r7 == 0) goto L75
            r11 = -1
        L6c:
            if (r11 < 0) goto L73
            java.lang.Object[] r1 = r0.f10773
            r1 = r1[r11]
            goto L74
        L73:
            r1 = 0
        L74:
            return r1
        L75:
            int r4 = r4 + 8
            int r1 = r1 + r4
            r1 = r1 & r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2754.m7008(long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
    
        r11 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0074, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0076, code lost:
    
        r3 = m7011(r4);
        r6 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
    
        if (r40.f10775 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
    
        if (((r40.f10774[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        r3 = r40.f10776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        if (r3 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b2, code lost:
    
        if (java.lang.Long.compare((r40.f10772 * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
    
        r3 = r40.f10774;
        r5 = r40.f10776;
        r8 = r40.f10771;
        r12 = r40.f10773;
        p200.AbstractC2745.m6983(r3, r5);
        r13 = -1;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:
    
        if (r15 == r5) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:
    
        r16 = r15 >> 3;
        r29 = (r15 & 7) << 3;
        r27 = (r3[r16] >> r29) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d1, code lost:
    
        if (r27 != r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d3, code lost:
    
        r39 = r15;
        r15 = r15 + 1;
        r13 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:
    
        if (r27 == 254) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00df, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
    
        r27 = r8[r15];
        r7 = ((int) (r27 ^ (r27 >>> r1))) * r2;
        r6 = (r7 << 16) ^ r7;
        r7 = r6 >>> 7;
        r27 = m7011(r7);
        r7 = r7 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0104, code lost:
    
        if ((((r27 - r7) & r5) / 8) != (((r15 - r7) & r5) / r11)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0106, code lost:
    
        r3[r16] = ((r6 & 127) << r29) | (r3[r16] & (~(255 << r29)));
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r13 = r13;
        r1 = ' ';
        r6 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012f, code lost:
    
        r14 = r13;
        r7 = r15;
        r19 = r27 >> 3;
        r35 = r3[r19];
        r20 = (r27 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0141, code lost:
    
        if (((r35 >> r20) & 255) != 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0143, code lost:
    
        r3[r19] = ((r6 & 127) << r20) | (r35 & (~(255 << r20)));
        r3[r16] = (r3[r16] & (~(255 << r29))) | (128 << r29);
        r8[r27] = r8[r7];
        r8[r7] = 0;
        r12[r27] = r12[r7];
        r12[r7] = null;
        r2 = r7;
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016f, code lost:
    
        r1 = r6 & 127;
        r6 = r12;
        r3[r19] = (r1 << r20) | (r35 & (~(255 << r20)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017e, code lost:
    
        if (r14 != (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0180, code lost:
    
        r13 = p200.AbstractC2745.m6980(r3, r7 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0187, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0188, code lost:
    
        r8[r13] = r8[r27];
        r8[r27] = r8[r7];
        r8[r7] = r8[r13];
        r6[r13] = r6[r27];
        r6[r27] = r6[r7];
        r6[r7] = r6[r13];
        r2 = r7 - 1;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a3, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r2 + 1;
        r12 = r6;
        r13 = r7;
        r1 = ' ';
        r2 = -862048943;
        r6 = 128;
        r11 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01be, code lost:
    
        r14 = 0;
        r40.f10775 = p200.AbstractC2745.m6982(r40.f10776) - r40.f10772;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cb, code lost:
    
        r14 = 0;
        m7012(p200.AbstractC2745.m6985(r40.f10776));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d5, code lost:
    
        r17 = m7011(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01dc, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01de, code lost:
    
        r40.f10772++;
        r1 = r40.f10775;
        r3 = r40.f10774;
        r4 = r17 >> 3;
        r5 = r3[r4];
        r7 = (r17 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f8, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fa, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fb, code lost:
    
        r40.f10775 = r1 - r14;
        r1 = r40.f10776;
        r5 = (r5 & (~(255 << r7))) | (r9 << r7);
        r3[r4] = r5;
        r3[(((r17 - 7) & r1) + (r1 & 7)) >> 3] = r5;
     */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7009(long r41, java.lang.Object r43) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200.C2754.m7009(long, java.lang.Object):void");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7010(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC2745.m6981(i)) : 0;
        this.f10776 = iMax;
        if (iMax == 0) {
            jArr = AbstractC2745.f10739;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f10774 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f10775 = AbstractC2745.m6982(this.f10776) - this.f10772;
        this.f10771 = new long[iMax];
        this.f10773 = new Object[iMax];
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m7011(int i) {
        int i2 = this.f10776;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f10774;
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
    public final void m7012(int i) {
        long[] jArr;
        C2754 c2754 = this;
        long[] jArr2 = c2754.f10774;
        long[] jArr3 = c2754.f10771;
        Object[] objArr = c2754.f10773;
        int i2 = c2754.f10776;
        m7010(i);
        long[] jArr4 = c2754.f10774;
        long[] jArr5 = c2754.f10771;
        Object[] objArr2 = c2754.f10773;
        int i3 = c2754.f10776;
        int i4 = 0;
        while (i4 < i2) {
            if (((jArr2[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                long j = jArr3[i4];
                int i5 = ((int) ((j >>> 32) ^ j)) * (-862048943);
                int i6 = (i5 << 16) ^ i5;
                int iM7011 = c2754.m7011(i6 >>> 7);
                long j2 = i6 & 127;
                int i7 = iM7011 >> 3;
                int i8 = (iM7011 & 7) << 3;
                jArr = jArr2;
                long j3 = (jArr4[i7] & (~(255 << i8))) | (j2 << i8);
                jArr4[i7] = j3;
                jArr4[(((iM7011 - 7) & i3) + (i3 & 7)) >> 3] = j3;
                jArr5[iM7011] = j;
                objArr2[iM7011] = objArr[i4];
            } else {
                jArr = jArr2;
            }
            i4++;
            c2754 = this;
            jArr2 = jArr;
        }
    }
}
