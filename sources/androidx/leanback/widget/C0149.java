package androidx.leanback.widget;

/* renamed from: androidx.leanback.widget.ˊˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0149 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f1054;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public boolean f1055;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f1056;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f1058;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f1062;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f1063;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f1053 = 2;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f1060 = 3;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f1061 = 0;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public float f1057 = 50.0f;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f1052 = Integer.MIN_VALUE;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f1059 = Integer.MAX_VALUE;

    public final String toString() {
        return " min:" + this.f1052 + " " + this.f1062 + " max:" + this.f1059 + " " + this.f1058;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m909(int i) {
        int i2;
        int i3;
        int i4 = this.f1063;
        int iM911 = m911();
        int i5 = this.f1052;
        boolean z = i5 == Integer.MIN_VALUE;
        int i6 = this.f1059;
        boolean z2 = i6 == Integer.MAX_VALUE;
        if (!z) {
            int i7 = this.f1054;
            int i8 = iM911 - i7;
            if (this.f1055 ? (this.f1060 & 2) != 0 : (this.f1060 & 1) != 0) {
                if (i - i5 <= i8) {
                    int i9 = i5 - i7;
                    return (z2 || i9 <= (i3 = this.f1058)) ? i9 : i3;
                }
            }
        }
        if (!z2) {
            int i10 = this.f1056;
            int i11 = (i4 - iM911) - i10;
            if (this.f1055 ? (1 & this.f1060) != 0 : (this.f1060 & 2) != 0) {
                if (i6 - i <= i11) {
                    int i12 = i6 - (i4 - i10);
                    return (z || i12 >= (i2 = this.f1062)) ? i12 : i2;
                }
            }
        }
        return i - iM911;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r6.f1062 = r0 - r6.f1054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        r6.f1058 = (r4 - r6.f1054) - r7;
     */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m910(int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0149.m910(int, int, int, int):void");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m911() {
        if (this.f1055) {
            int i = this.f1061;
            int i2 = i >= 0 ? this.f1063 - i : -i;
            float f = this.f1057;
            return f != -1.0f ? i2 - ((int) ((this.f1063 * f) / 100.0f)) : i2;
        }
        int i3 = this.f1061;
        if (i3 < 0) {
            i3 += this.f1063;
        }
        float f2 = this.f1057;
        return f2 != -1.0f ? i3 + ((int) ((this.f1063 * f2) / 100.0f)) : i3;
    }
}
