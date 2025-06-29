package p064;

import java.security.SecureRandom;
import p026.C1160;

/* renamed from: ʾᵎ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1465 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C1160 f5983 = new C1160(4);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static byte[] m5018(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f5983.get()).nextBytes(bArr);
        return bArr;
    }
}
