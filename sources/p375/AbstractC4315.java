package p375;

import com.google.crypto.tink.internal.TinkBugException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import p005.C0934;

/* renamed from: ᵢˏ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4315 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f16768 = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0934 m9802(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new TinkBugException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        return C0934.m3799(bArr);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m9803() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }
}
