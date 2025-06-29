package androidx.leanback.widget;

import p200.C2753;

/* renamed from: androidx.leanback.widget.ˊﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0151 extends AbstractC0154 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public C2753 f1067;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public Object f1068;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f1069;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f1070;

    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo912(int i, boolean z) {
        Object[] objArr = this.f1082;
        if (this.f1078.ᵎˏ() == 0) {
            return false;
        }
        if (!z && m937(i)) {
            return false;
        }
        try {
            if (!m920(i, z)) {
                return m926(i, z);
            }
            objArr[0] = null;
            this.f1068 = null;
            return true;
        } finally {
            objArr[0] = null;
            this.f1068 = null;
        }
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final int m913(int i) {
        int i2;
        C0179 c0179Mo919;
        int i3 = this.f1083;
        if (i3 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.f1081) {
            int i4 = this.f1078.ˋˊ(i3);
            if (((ˉⁱ) mo919(this.f1083)).ᐧⁱ == i) {
                return i4;
            }
            int i5 = this.f1083;
            do {
                i5++;
                if (i5 <= m925()) {
                    c0179Mo919 = mo919(i5);
                    i4 += c0179Mo919.f1140;
                }
            } while (((ˉⁱ) c0179Mo919).ᐧⁱ != i);
            return i4;
        }
        int i6 = this.f1078.ˋˊ(this.f1084);
        C0179 c0179Mo9192 = mo919(this.f1084);
        if (((ˉⁱ) c0179Mo9192).ᐧⁱ == i) {
            i2 = c0179Mo9192.f1141;
        } else {
            int i7 = this.f1084;
            do {
                i7--;
                if (i7 >= this.f1070) {
                    i6 -= c0179Mo9192.f1140;
                    c0179Mo9192 = mo919(i7);
                }
            } while (((ˉⁱ) c0179Mo9192).ᐧⁱ != i);
            i2 = c0179Mo9192.f1141;
        }
        return i6 + i2;
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ˉי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p061.C1423[] mo914(int r8, int r9) {
        /*
            r7 = this;
            r0 = 0
        L1:
            int r1 = r7.f1079
            if (r0 >= r1) goto L10
            ʾـ.ᵢʿ[] r1 = r7.f1080
            r1 = r1[r0]
            int r2 = r1.f5793
            r1.f5794 = r2
            int r0 = r0 + 1
            goto L1
        L10:
            if (r8 < 0) goto L5a
        L12:
            if (r8 > r9) goto L5a
            ʾـ.ᵢʿ[] r0 = r7.f1080
            androidx.leanback.widget.ᐧʼ r1 = r7.mo919(r8)
            int r1 = r1.ᐧⁱ
            r0 = r0[r1]
            int r1 = r0.m4926()
            if (r1 <= 0) goto L51
            int r1 = r0.f5793
            int r2 = r0.f5794
            if (r1 == r2) goto L4b
            int[] r3 = r0.f5795
            int r4 = r2 + (-1)
            int r5 = r0.f5796
            r4 = r4 & r5
            r4 = r3[r4]
            int r6 = r8 + (-1)
            if (r4 != r6) goto L51
            if (r1 == r2) goto L45
            int r2 = r2 + (-1)
            r1 = r2 & r5
            r2 = r3[r1]
            r0.f5794 = r1
            r0.m4928(r8)
            goto L57
        L45:
            java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
            r8.<init>()
            throw r8
        L4b:
            java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
            r8.<init>()
            throw r8
        L51:
            r0.m4928(r8)
            r0.m4928(r8)
        L57:
            int r8 = r8 + 1
            goto L12
        L5a:
            ʾـ.ᵢʿ[] r8 = r7.f1080
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0151.mo914(int, int):ʾـ.ᵢʿ[]");
    }

    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void mo915(int i) {
        super.mo915(i);
        int iM925 = (m925() - i) + 1;
        C2753 c2753 = this.f1067;
        c2753.m7007(iM925);
        if (c2753.m7006() == 0) {
            this.f1070 = -1;
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final int m916(int i) {
        C0179 c0179Mo919;
        int i2;
        int i3 = this.f1083;
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        if (!this.f1081) {
            int i4 = this.f1078.ˋˊ(i3);
            if (((ˉⁱ) mo919(this.f1083)).ᐧⁱ == i) {
                return i4;
            }
            int i5 = this.f1083;
            do {
                i5++;
                if (i5 <= m925()) {
                    c0179Mo919 = mo919(i5);
                    i4 += c0179Mo919.f1140;
                }
            } while (((ˉⁱ) c0179Mo919).ᐧⁱ != i);
            return i4;
        }
        int i6 = this.f1078.ˋˊ(this.f1084);
        C0179 c0179Mo9192 = mo919(this.f1084);
        if (((ˉⁱ) c0179Mo9192).ᐧⁱ == i) {
            i2 = c0179Mo9192.f1141;
        } else {
            int i7 = this.f1084;
            do {
                i7--;
                if (i7 >= this.f1070) {
                    i6 -= c0179Mo9192.f1140;
                    c0179Mo9192 = mo919(i7);
                }
            } while (((ˉⁱ) c0179Mo9192).ᐧⁱ != i);
            i2 = c0179Mo9192.f1141;
        }
        return i6 - i2;
        return Integer.MAX_VALUE;
    }

    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final boolean mo917(int i, boolean z) {
        Object[] objArr = this.f1082;
        if (this.f1078.ᵎˏ() == 0) {
            return false;
        }
        if (!z && m941(i)) {
            return false;
        }
        try {
            if (!m929(i, z)) {
                return m923(i, z);
            }
            objArr[0] = null;
            this.f1068 = null;
            return true;
        } finally {
            objArr[0] = null;
            this.f1068 = null;
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int m918(boolean z) {
        boolean z2 = false;
        if (z) {
            for (int i = this.f1084; i >= this.f1083; i--) {
                int i2 = ((ˉⁱ) mo919(i)).ᐧⁱ;
                if (i2 == 0) {
                    z2 = true;
                } else if (z2 && i2 == this.f1079 - 1) {
                    return i;
                }
            }
            return -1;
        }
        for (int i3 = this.f1083; i3 <= this.f1084; i3++) {
            int i4 = ((ˉⁱ) mo919(i3)).ᐧⁱ;
            if (i4 == this.f1079 - 1) {
                z2 = true;
            } else if (z2 && i4 == 0) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean m920(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        C2753 c2753 = this.f1067;
        if (c2753.m7006() == 0) {
            return false;
        }
        int i5 = this.f1078.ᵎˏ();
        int i6 = this.f1084;
        if (i6 >= 0) {
            i2 = i6 + 1;
            i3 = this.f1078.ˋˊ(i6);
        } else {
            int i7 = this.f1086;
            i2 = i7 != -1 ? i7 : 0;
            if (i2 > m925() + 1 || i2 < this.f1070) {
                c2753.m7003(c2753.m7006());
                return false;
            }
            if (i2 > m925()) {
                return false;
            }
            i3 = Integer.MAX_VALUE;
        }
        int iM925 = m925();
        int i8 = i2;
        while (i8 < i5 && i8 <= iM925) {
            C0179 c0179Mo919 = mo919(i8);
            if (i3 != Integer.MAX_VALUE) {
                i3 += c0179Mo919.f1140;
            }
            int i9 = ((ˉⁱ) c0179Mo919).ᐧⁱ;
            ʾי.ˑʽ r9 = this.f1078;
            Object[] objArr = this.f1082;
            int i10 = r9.ᵎـ(i8, true, objArr, false);
            if (i10 != c0179Mo919.f1141) {
                c0179Mo919.f1141 = i10;
                c2753.m7007(iM925 - i8);
                i4 = i8;
            } else {
                i4 = iM925;
            }
            this.f1084 = i8;
            if (this.f1083 < 0) {
                this.f1083 = i8;
            }
            this.f1078.ˏᵢ(objArr[0], i8, i10, i9, i3);
            if (!z && m937(i)) {
                return true;
            }
            if (i3 == Integer.MAX_VALUE) {
                i3 = this.f1078.ˋˊ(i8);
            }
            if (i9 == this.f1079 - 1 && z) {
                return true;
            }
            i8++;
            iM925 = i4;
        }
        return false;
    }

    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int mo921(int i, boolean z, int[] iArr) {
        int i2;
        int i3 = this.f1078.ˋˊ(i);
        C0179 c0179Mo919 = mo919(i);
        int i4 = ((ˉⁱ) c0179Mo919).ᐧⁱ;
        if (this.f1081) {
            int i5 = 1;
            i2 = i3 - this.f1078.יʻ(i);
            int i6 = i4;
            for (int i7 = i - 1; i5 < this.f1079 && i7 >= this.f1083; i7--) {
                i3 -= c0179Mo919.f1140;
                c0179Mo919 = mo919(i7);
                int i8 = ((ˉⁱ) c0179Mo919).ᐧⁱ;
                if (i8 != i6) {
                    i5++;
                    int i9 = i3 - this.f1078.יʻ(i7);
                    if (!z ? i9 >= i2 : i9 <= i2) {
                        i6 = i8;
                    } else {
                        i2 = i9;
                        i = i7;
                        i4 = i8;
                        i6 = i4;
                    }
                }
            }
        } else {
            int i10 = i4;
            int i11 = i10;
            int i12 = 1;
            int i13 = i3;
            for (int i14 = i + 1; i12 < this.f1079 && i14 <= this.f1084; i14++) {
                C0179 c0179Mo9192 = mo919(i14);
                i13 += c0179Mo9192.f1140;
                int i15 = ((ˉⁱ) c0179Mo9192).ᐧⁱ;
                if (i15 != i11) {
                    i12++;
                    if (!z ? i13 >= i3 : i13 <= i3) {
                        i11 = i15;
                    } else {
                        i3 = i13;
                        i = i14;
                        i10 = i15;
                        i11 = i10;
                    }
                }
            }
            i2 = i3;
            i4 = i10;
        }
        if (iArr != null) {
            iArr[0] = i4;
            iArr[1] = i;
        }
        return i2;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final int m922(int i, int i2, int i3) {
        int i4;
        int i5 = this.f1084;
        if (i5 >= 0 && (i5 != m925() || this.f1084 != i - 1)) {
            throw new IllegalStateException();
        }
        int i6 = this.f1084;
        C2753 c2753 = this.f1067;
        if (i6 >= 0) {
            i4 = i3 - this.f1078.ˋˊ(i6);
        } else if (c2753.m7006() <= 0 || i != m925() + 1) {
            i4 = 0;
        } else {
            int iM925 = m925();
            while (true) {
                if (iM925 < this.f1070) {
                    iM925 = m925();
                    break;
                }
                if (((ˉⁱ) mo919(iM925)).ᐧⁱ == i2) {
                    break;
                }
                iM925--;
            }
            i4 = this.f1081 ? (-mo919(iM925).f1141) - this.f1085 : mo919(iM925).f1141 + this.f1085;
            for (int i7 = iM925 + 1; i7 <= m925(); i7++) {
                i4 -= mo919(i7).f1140;
            }
        }
        C0179 c0179 = new C0179(i2, i4);
        Object[] objArr = (Object[]) c2753.f10767;
        int i8 = c2753.f10768;
        objArr[i8] = c0179;
        int i9 = c2753.f10770 & (i8 + 1);
        c2753.f10768 = i9;
        if (i9 == c2753.f10766) {
            c2753.m7002();
        }
        Object obj = this.f1068;
        if (obj != null) {
            c0179.f1141 = this.f1069;
            this.f1068 = null;
        } else {
            ʾי.ˑʽ r4 = this.f1078;
            Object[] objArr2 = this.f1082;
            c0179.f1141 = r4.ᵎـ(i, true, objArr2, false);
            obj = objArr2[0];
        }
        Object obj2 = obj;
        if (c2753.m7006() == 1) {
            this.f1084 = i;
            this.f1083 = i;
            this.f1070 = i;
        } else {
            int i10 = this.f1084;
            if (i10 < 0) {
                this.f1084 = i;
                this.f1083 = i;
            } else {
                this.f1084 = i10 + 1;
            }
        }
        this.f1078.ˏᵢ(obj2, i, c0179.f1141, i2, i3);
        return c0179.f1141;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x012c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x012d, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0144, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd A[LOOP:2: B:86:0x00fd->B:102:0x0121, LOOP_START, PHI: r5 r8 r9
  0x00fd: PHI (r5v13 int) = (r5v6 int), (r5v19 int) binds: [B:85:0x00fb, B:102:0x0121] A[DONT_GENERATE, DONT_INLINE]
  0x00fd: PHI (r8v19 int) = (r8v17 int), (r8v20 int) binds: [B:85:0x00fb, B:102:0x0121] A[DONT_GENERATE, DONT_INLINE]
  0x00fd: PHI (r9v7 int) = (r9v6 int), (r9v9 int) binds: [B:85:0x00fb, B:102:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: יʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m923(int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0151.m923(int, boolean):boolean");
    }

    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int mo924(int i, boolean z, int[] iArr) {
        int i2;
        int i3 = this.f1078.ˋˊ(i);
        C0179 c0179Mo919 = mo919(i);
        int i4 = ((ˉⁱ) c0179Mo919).ᐧⁱ;
        if (this.f1081) {
            i2 = i4;
            int i5 = i2;
            int i6 = 1;
            int i7 = i3;
            for (int i8 = i + 1; i6 < this.f1079 && i8 <= this.f1084; i8++) {
                C0179 c0179Mo9192 = mo919(i8);
                i7 += c0179Mo9192.f1140;
                int i9 = ((ˉⁱ) c0179Mo9192).ᐧⁱ;
                if (i9 != i5) {
                    i6++;
                    if (!z ? i7 >= i3 : i7 <= i3) {
                        i5 = i9;
                    } else {
                        i3 = i7;
                        i = i8;
                        i2 = i9;
                        i5 = i2;
                    }
                }
            }
        } else {
            int i10 = 1;
            int i11 = i4;
            C0179 c0179Mo9193 = c0179Mo919;
            int i12 = i3;
            i3 = this.f1078.יʻ(i) + i3;
            i2 = i11;
            for (int i13 = i - 1; i10 < this.f1079 && i13 >= this.f1083; i13--) {
                i12 -= c0179Mo9193.f1140;
                c0179Mo9193 = mo919(i13);
                int i14 = ((ˉⁱ) c0179Mo9193).ᐧⁱ;
                if (i14 != i11) {
                    i10++;
                    int i15 = this.f1078.יʻ(i13) + i12;
                    if (!z ? i15 >= i3 : i15 <= i3) {
                        i11 = i14;
                    } else {
                        i3 = i15;
                        i = i13;
                        i2 = i14;
                        i11 = i2;
                    }
                }
            }
        }
        if (iArr != null) {
            iArr[0] = i2;
            iArr[1] = i;
        }
        return i3;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final int m925() {
        return (this.f1067.m7006() + this.f1070) - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0137, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0138, code lost:
    
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x014f, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108 A[LOOP:2: B:88:0x0108->B:104:0x012c, LOOP_START, PHI: r6 r9 r10
  0x0108: PHI (r6v13 int) = (r6v6 int), (r6v18 int) binds: [B:87:0x0106, B:104:0x012c] A[DONT_GENERATE, DONT_INLINE]
  0x0108: PHI (r9v20 int) = (r9v18 int), (r9v21 int) binds: [B:87:0x0106, B:104:0x012c] A[DONT_GENERATE, DONT_INLINE]
  0x0108: PHI (r10v6 int) = (r10v5 int), (r10v8 int) binds: [B:87:0x0106, B:104:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ᵎـ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m926(int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0151.m926(int, boolean):boolean");
    }

    @Override // androidx.leanback.widget.AbstractC0154
    /* renamed from: ﹳˎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C0179 mo919(int i) {
        int i2 = i - this.f1070;
        if (i2 < 0) {
            return null;
        }
        C2753 c2753 = this.f1067;
        if (i2 >= c2753.m7006()) {
            return null;
        }
        if (i2 < 0) {
            c2753.getClass();
        } else if (i2 < c2753.m7006()) {
            return (C0179) ((Object[]) c2753.f10767)[c2753.f10770 & (c2753.f10766 + i2)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final int m928(int i, int i2, int i3) {
        int i4 = this.f1083;
        if (i4 >= 0 && (i4 != this.f1070 || i4 != i + 1)) {
            throw new IllegalStateException();
        }
        int i5 = this.f1070;
        C0179 c0179Mo919 = i5 >= 0 ? mo919(i5) : null;
        int i6 = this.f1078.ˋˊ(this.f1070);
        C0179 c0179 = new C0179(i2, 0);
        C2753 c2753 = this.f1067;
        int i7 = (c2753.f10766 - 1) & c2753.f10770;
        c2753.f10766 = i7;
        ((Object[]) c2753.f10767)[i7] = c0179;
        if (i7 == c2753.f10768) {
            c2753.m7002();
        }
        Object obj = this.f1068;
        if (obj != null) {
            c0179.f1141 = this.f1069;
            this.f1068 = null;
        } else {
            ʾי.ˑʽ r1 = this.f1078;
            Object[] objArr = this.f1082;
            c0179.f1141 = r1.ᵎـ(i, false, objArr, false);
            obj = objArr[0];
        }
        Object obj2 = obj;
        this.f1083 = i;
        this.f1070 = i;
        if (this.f1084 < 0) {
            this.f1084 = i;
        }
        int i8 = !this.f1081 ? i3 - c0179.f1141 : i3 + c0179.f1141;
        if (c0179Mo919 != null) {
            c0179Mo919.f1140 = i6 - i8;
        }
        this.f1078.ˏᵢ(obj2, i, c0179.f1141, i2, i8);
        return c0179.f1141;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean m929(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        C2753 c2753 = this.f1067;
        if (c2753.m7006() == 0) {
            return false;
        }
        int i5 = this.f1083;
        if (i5 < 0) {
            int i6 = this.f1086;
            i2 = i6 != -1 ? i6 : 0;
            if (i2 <= m925()) {
                int i7 = this.f1070;
                if (i2 >= i7 - 1) {
                    if (i2 < i7) {
                        return false;
                    }
                    i3 = Integer.MAX_VALUE;
                    i4 = 0;
                }
            }
            c2753.m7003(c2753.m7006());
            return false;
        }
        i3 = this.f1078.ˋˊ(i5);
        i4 = mo919(this.f1083).f1140;
        i2 = this.f1083 - 1;
        int iMax = Math.max(((GridLayoutManager) this.f1078.ˆʿ).f825, this.f1070);
        while (i2 >= iMax) {
            C0179 c0179Mo919 = mo919(i2);
            int i8 = ((ˉⁱ) c0179Mo919).ᐧⁱ;
            ʾי.ˑʽ r8 = this.f1078;
            Object[] objArr = this.f1082;
            int i9 = r8.ᵎـ(i2, false, objArr, false);
            if (i9 != c0179Mo919.f1141) {
                c2753.m7003((i2 + 1) - this.f1070);
                this.f1070 = this.f1083;
                this.f1068 = objArr[0];
                this.f1069 = i9;
                return false;
            }
            this.f1083 = i2;
            if (this.f1084 < 0) {
                this.f1084 = i2;
            }
            this.f1078.ˏᵢ(objArr[0], i2, i9, i8, i3 - i4);
            if (!z && m941(i)) {
                return true;
            }
            i3 = this.f1078.ˋˊ(i2);
            i4 = c0179Mo919.f1140;
            if (i8 == 0 && z) {
                return true;
            }
            i2--;
        }
        return false;
    }
}
