package p105;

import java.util.Arrays;

/* renamed from: ˆᐧ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1795 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final byte[] f6940;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 < 26; i2++) {
            byte b = (byte) (i2 + 10);
            bArr[i2 + 65] = b;
            bArr[i2 + 97] = b;
        }
        f6940 = bArr;
    }
}
