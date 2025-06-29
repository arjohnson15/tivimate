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
import p418.EnumC4813;

/* renamed from: ـˎ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3268 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C4300 f12734;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C4307 f12735;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C4304 f12736;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C4309 f12737;

    static {
        C0934 c0934M9802 = AbstractC4315.m9802("type.googleapis.com/google.crypto.tink.HmacKey");
        f12736 = new C4304(C3270.class);
        f12734 = new C4300(c0934M9802);
        f12735 = new C4307(C3267.class);
        f12737 = new C4309(c0934M9802, new C1219(27));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C3279 m8067(EnumC4778 enumC4778) throws GeneralSecurityException {
        int iOrdinal = enumC4778.ordinal();
        if (iOrdinal == 1) {
            return C3279.f12759;
        }
        if (iOrdinal == 2) {
            return C3279.f12767;
        }
        if (iOrdinal == 3) {
            return C3279.f12762;
        }
        if (iOrdinal == 4) {
            return C3279.f12760;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC4778.m10704());
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3279 m8068(EnumC4813 enumC4813) throws GeneralSecurityException {
        int iOrdinal = enumC4813.ordinal();
        if (iOrdinal == 1) {
            return C3279.f12766;
        }
        if (iOrdinal == 2) {
            return C3279.f12758;
        }
        if (iOrdinal == 3) {
            return C3279.f12769;
        }
        if (iOrdinal == 4) {
            return C3279.f12761;
        }
        if (iOrdinal == 5) {
            return C3279.f12763;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC4813.m10824());
    }
}
