package p016;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p005.C0934;
import ʾי.ˑʽ;

/* renamed from: ʻᐧ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1088 extends AbstractC1068 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C1088 m4120(C1071 c1071, ˑʽ r4, Integer num) throws GeneralSecurityException {
        C1071 c10712 = C1071.f4623;
        if (c1071 != c10712 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c1071 + " the value of idRequirement must be non-null");
        }
        if (c1071 == c10712 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        C0934 c0934 = (C0934) r4.ˆʿ;
        if (c0934.f4123.length != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c0934.f4123.length);
        }
        if (c1071 == c10712) {
            C0934.m3799(new byte[0]);
        } else if (c1071 == C1071.f4615) {
            C0934.m3799(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (c1071 != C1071.f4614) {
                throw new IllegalStateException("Unknown Variant: " + c1071);
            }
            C0934.m3799(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new C1088();
    }
}
