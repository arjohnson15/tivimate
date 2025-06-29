package p267;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0758;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0762;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import p064.AbstractC1465;
import p375.C4316;
import p418.C4782;
import p418.C4785;
import p418.C4810;
import p418.C4819;
import p418.C4820;
import p418.C4843;
import ʿﾞ.ﹳﹳ;

/* renamed from: ـˎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3265 extends ﹳﹳ {
    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public final void m8060(AbstractC0758 abstractC0758) throws GeneralSecurityException {
        C4843 c4843 = (C4843) abstractC0758;
        C3273.m8071(c4843.m10897());
        if (c4843.m10896() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public final Map m8061() {
        HashMap map = new HashMap();
        C4810 c4810M10892 = C4843.m10892();
        c4810M10892.m2948();
        C4843.m10894((C4843) c4810M10892.f3527);
        C4785 c4785M10841 = C4820.m10841();
        c4785M10841.m2948();
        C4820.m10840((C4820) c4785M10841.f3527);
        C4820 c4820 = (C4820) c4785M10841.m2947();
        c4810M10892.m2948();
        C4843.m10895((C4843) c4810M10892.f3527, c4820);
        map.put("AES_CMAC", new C4316((C4843) c4810M10892.m2947(), 1));
        C4810 c4810M108922 = C4843.m10892();
        c4810M108922.m2948();
        C4843.m10894((C4843) c4810M108922.f3527);
        C4785 c4785M108412 = C4820.m10841();
        c4785M108412.m2948();
        C4820.m10840((C4820) c4785M108412.f3527);
        C4820 c48202 = (C4820) c4785M108412.m2947();
        c4810M108922.m2948();
        C4843.m10895((C4843) c4810M108922.f3527, c48202);
        map.put("AES256_CMAC", new C4316((C4843) c4810M108922.m2947(), 1));
        C4810 c4810M108923 = C4843.m10892();
        c4810M108923.m2948();
        C4843.m10894((C4843) c4810M108923.f3527);
        C4785 c4785M108413 = C4820.m10841();
        c4785M108413.m2948();
        C4820.m10840((C4820) c4785M108413.f3527);
        C4820 c48203 = (C4820) c4785M108413.m2947();
        c4810M108923.m2948();
        C4843.m10895((C4843) c4810M108923.f3527, c48203);
        map.put("AES256_CMAC_RAW", new C4316((C4843) c4810M108923.m2947(), 3));
        return DesugarCollections.unmodifiableMap(map);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final AbstractC0758 m8062(AbstractC0758 abstractC0758) {
        C4843 c4843 = (C4843) abstractC0758;
        C4819 c4819M10725 = C4782.m10725();
        c4819M10725.m2948();
        C4782.m10724((C4782) c4819M10725.f3527);
        byte[] bArrM5018 = AbstractC1465.m5018(c4843.m10896());
        C0762 c0762M3129 = AbstractC0748.m3129(bArrM5018, 0, bArrM5018.length);
        c4819M10725.m2948();
        C4782.m10726((C4782) c4819M10725.f3527, c0762M3129);
        C4820 c4820M10897 = c4843.m10897();
        c4819M10725.m2948();
        C4782.m10723((C4782) c4819M10725.f3527, c4820M10897);
        return (C4782) c4819M10725.m2947();
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public final AbstractC0758 m8063(AbstractC0748 abstractC0748) {
        return C4843.m10893(abstractC0748, C0747.m3127());
    }
}
