package p061;

import p166.C2415;

/* renamed from: ʾـ.ᴵˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1410 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f5763 = -1;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5760 = -1;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f5762 = -1;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f5764 = -1;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f5761 = -1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p061.C1410 m4888(java.lang.String r10) {
        /*
            r0 = 1
            java.lang.String r1 = "Format:"
            boolean r1 = r10.startsWith(r1)
            p383.AbstractC4464.m10142(r1)
            r1 = 7
            java.lang.String r10 = r10.substring(r1)
            java.lang.String r1 = ","
            java.lang.String[] r10 = android.text.TextUtils.split(r10, r1)
            r1 = -1
            r2 = 0
            r3 = 0
            r4 = -1
            r5 = -1
            r6 = -1
            r7 = -1
        L1c:
            int r8 = r10.length
            if (r3 >= r8) goto L6d
            r8 = r10[r3]
            java.lang.String r8 = r8.trim()
            java.lang.String r8 = p395.AbstractC4535.m10327(r8)
            r8.getClass()
            int r9 = r8.hashCode()
            switch(r9) {
                case 100571: goto L56;
                case 3556653: goto L4b;
                case 109757538: goto L40;
                case 109780401: goto L35;
                default: goto L33;
            }
        L33:
            r8 = -1
            goto L60
        L35:
            java.lang.String r9 = "style"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L3e
            goto L33
        L3e:
            r8 = 3
            goto L60
        L40:
            java.lang.String r9 = "start"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L49
            goto L33
        L49:
            r8 = 2
            goto L60
        L4b:
            java.lang.String r9 = "text"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L54
            goto L33
        L54:
            r8 = 1
            goto L60
        L56:
            java.lang.String r9 = "end"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L5f
            goto L33
        L5f:
            r8 = 0
        L60:
            switch(r8) {
                case 0: goto L6a;
                case 1: goto L68;
                case 2: goto L66;
                case 3: goto L64;
                default: goto L63;
            }
        L63:
            goto L6b
        L64:
            r7 = r3
            goto L6b
        L66:
            r4 = r3
            goto L6b
        L68:
            r6 = r3
            goto L6b
        L6a:
            r5 = r3
        L6b:
            int r3 = r3 + r0
            goto L1c
        L6d:
            if (r4 == r1) goto L84
            if (r5 == r1) goto L84
            if (r6 == r1) goto L84
            ʾـ.ᴵˋ r0 = new ʾـ.ᴵˋ
            int r10 = r10.length
            r0.<init>()
            r0.f5763 = r4
            r0.f5760 = r5
            r0.f5762 = r7
            r0.f5764 = r6
            r0.f5761 = r10
            goto L85
        L84:
            r0 = 0
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p061.C1410.m4888(java.lang.String):ʾـ.ᴵˋ");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C2415 m4889() {
        return new C2415(this.f5763, this.f5760, this.f5762, this.f5764, this.f5761, null);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m4890(int i) {
        this.f5760 = i;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void m4891(int i) {
        this.f5764 = i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean m4892() {
        int i = this.f5763;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.f5764;
            int i4 = this.f5760;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.f5764;
            int i6 = this.f5762;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.f5761;
            int i8 = this.f5760;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.f5761;
            int i10 = this.f5762;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if ((i & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m4893(int i) {
        this.f5763 = i;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public void m4894(int i) {
        this.f5762 = i;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m4895(int i) {
        this.f5761 = i;
    }
}
