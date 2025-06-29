package p141;

import android.net.Uri;
import android.util.Base64;
import p208.AbstractC2793;

/* renamed from: ˉˑ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2194 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Uri f8625;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2193 f8626;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067 A[PHI: r31
  0x0067: PHI (r31v19 java.lang.String) = 
  (r31v1 java.lang.String)
  (r31v2 java.lang.String)
  (r31v3 java.lang.String)
  (r31v4 java.lang.String)
  (r31v5 java.lang.String)
  (r31v6 java.lang.String)
  (r31v7 java.lang.String)
  (r31v8 java.lang.String)
  (r31v9 java.lang.String)
  (r31v10 java.lang.String)
  (r31v11 java.lang.String)
  (r31v12 java.lang.String)
  (r31v13 java.lang.String)
  (r31v14 java.lang.String)
  (r31v15 java.lang.String)
  (r31v16 java.lang.String)
  (r31v17 java.lang.String)
  (r31v20 java.lang.String)
 binds: [B:74:0x0159, B:70:0x014c, B:66:0x0141, B:62:0x0134, B:58:0x0127, B:54:0x011c, B:50:0x010f, B:46:0x0100, B:42:0x00f0, B:38:0x00e0, B:34:0x00d0, B:30:0x00c0, B:26:0x00b0, B:22:0x00a2, B:18:0x0092, B:14:0x0082, B:10:0x0072, B:7:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2194(p141.C2199 r39, p141.C2186 r40, android.net.Uri r41) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2116
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p141.C2194.<init>(ˉˑ.ˏᴵ, ˉˑ.ʽᐧ, android.net.Uri):void");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static byte[] m6124(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length + 4];
        System.arraycopy(AbstractC2793.f10876, 0, bArr, 0, 4);
        System.arraycopy(bArrDecode, 0, bArr, 4, bArrDecode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2194.class != obj.getClass()) {
            return false;
        }
        C2194 c2194 = (C2194) obj;
        return this.f8626.equals(c2194.f8626) && this.f8625.equals(c2194.f8625);
    }

    public final int hashCode() {
        return this.f8625.hashCode() + ((this.f8626.hashCode() + 217) * 31);
    }
}
