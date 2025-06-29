package p267;

import java.security.GeneralSecurityException;
import p005.C0934;
import p033.C1219;
import p375.AbstractC4315;
import p375.C4300;
import p375.C4304;
import p375.C4307;
import p375.C4309;
import p418.EnumC4778;

/* renamed from: ـˎ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3276 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C4300 f12753;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C4307 f12754;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C4304 f12755;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C4309 f12756;

    static {
        C0934 c0934M9802 = AbstractC4315.m9802("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f12755 = new C4304(C3266.class);
        f12753 = new C4300(c0934M9802);
        f12754 = new C4307(C3275.class);
        f12756 = new C4309(c0934M9802, new C1219(25));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3279 m8074(EnumC4778 enumC4778) throws GeneralSecurityException {
        int iOrdinal = enumC4778.ordinal();
        if (iOrdinal == 1) {
            return C3279.f12764;
        }
        if (iOrdinal == 2) {
            return C3279.f12757;
        }
        if (iOrdinal == 3) {
            return C3279.f12765;
        }
        if (iOrdinal == 4) {
            return C3279.f12768;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC4778.m10704());
    }
}
