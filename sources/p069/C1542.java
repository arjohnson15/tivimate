package p069;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: ʾﾞ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1542 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final String[] f6267 = {"*", "FCM", "GCM", ""};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f6268;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SharedPreferences f6269;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1542(p210.C2804 r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.m7085()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.Context r2 = r4.f10936
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)
            r3.f6269 = r0
            r4.m7085()
            ˏʼ.ˏᵢ r0 = r4.f10935
            java.lang.String r1 = r0.f10919
            if (r1 == 0) goto L1b
            goto L48
        L1b:
            r4.m7085()
            java.lang.String r4 = "1:"
            java.lang.String r1 = r0.f10918
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            java.lang.String r4 = "2:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            goto L48
        L31:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r1.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3e
        L3c:
            r1 = r2
            goto L48
        L3e:
            r0 = 1
            r1 = r4[r0]
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L48
            goto L3c
        L48:
            r3.f6268 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p069.C1542.<init>(ˏʼ.ٴˎ):void");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String m5129() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f6269) {
            String strEncodeToString = null;
            String string = this.f6269.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                String str = "Invalid key stored " + e;
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return strEncodeToString;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String m5130() {
        String string;
        synchronized (this.f6269) {
            string = this.f6269.getString("|S|id", null);
        }
        return string;
    }
}
