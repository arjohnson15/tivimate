package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0429 implements InterfaceC0489, Iterable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f2728;

    public C0429(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f2728 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0429) {
            return this.f2728.equals(((C0429) obj).f2728);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2728.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0411(0, this);
    }

    public final String toString() {
        return ˆʽ.ᵎˏ.ˎٴ(new StringBuilder("\""), this.f2728, "\"");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ʿʼ */
    public final Double mo1860() {
        String str = this.f2728;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˉי */
    public final InterfaceC0489 mo1862() {
        return new C0429(this.f2728);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c9 A[PHI: r0 r2 r7 r16
  0x01c9: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v9 java.lang.String) binds: [B:103:0x01c7, B:99:0x01b5] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:103:0x01c7, B:99:0x01b5] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v6 java.lang.String) binds: [B:103:0x01c7, B:99:0x01b5] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r16v5 java.lang.String) = (r16v4 java.lang.String), (r16v6 java.lang.String) binds: [B:103:0x01c7, B:99:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f6 A[PHI: r0 r2 r3 r7 r16 r19
  0x01f6: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v6 java.lang.String) binds: [B:111:0x01f4, B:107:0x01df] A[DONT_GENERATE, DONT_INLINE]
  0x01f6: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:111:0x01f4, B:107:0x01df] A[DONT_GENERATE, DONT_INLINE]
  0x01f6: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:111:0x01f4, B:107:0x01df] A[DONT_GENERATE, DONT_INLINE]
  0x01f6: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v3 java.lang.String) binds: [B:111:0x01f4, B:107:0x01df] A[DONT_GENERATE, DONT_INLINE]
  0x01f6: PHI (r16v2 java.lang.String) = (r16v1 java.lang.String), (r16v3 java.lang.String) binds: [B:111:0x01f4, B:107:0x01df] A[DONT_GENERATE, DONT_INLINE]
  0x01f6: PHI (r19v2 java.lang.String) = (r19v1 java.lang.String), (r19v3 java.lang.String) binds: [B:111:0x01f4, B:107:0x01df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a9  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˏᴵ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0489 mo1866(java.lang.String r23, ﹶˋ.ـﹶ r24, java.util.ArrayList r25) {
        /*
            Method dump skipped, instructions count: 1858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0429.mo1866(java.lang.String, ﹶˋ.ـﹶ, java.util.ArrayList):com.google.android.gms.internal.measurement.ᴵʿ");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˑʽ */
    public final Iterator mo1867() {
        return new C0411(1, this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹳﹳ */
    public final Boolean mo1875() {
        return Boolean.valueOf(!this.f2728.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹶˆ */
    public final String mo1876() {
        return this.f2728;
    }
}
