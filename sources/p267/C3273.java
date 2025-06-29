package p267;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0758;
import com.google.crypto.tink.shaded.protobuf.C0747;
import java.security.GeneralSecurityException;
import p016.C1083;
import p016.C1084;
import p033.C1219;
import p064.AbstractC1468;
import p065.AbstractC1524;
import p115.InterfaceC1822;
import p375.C4301;
import p375.C4316;
import p418.C4779;
import p418.C4782;
import p418.C4805;
import p418.C4820;
import p418.C4834;
import p418.C4835;
import p418.C4836;
import p418.C4843;
import p418.EnumC4796;
import p418.EnumC4813;
import ʿﾞ.ﹳﹳ;

/* renamed from: ـˎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3273 extends AbstractC1524 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C4301 f12745 = new C4301(C3275.class, new C1219(24));

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C4301 f12746 = new C4301(C3267.class, new C1219(26));

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f12747 = 1;

    public C3273() {
        super(C4805.class, new C1083(10, InterfaceC1822.class));
    }

    public /* synthetic */ C3273(Class cls, C1083[] c1083Arr) {
        super(cls, c1083Arr);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static void m8071(C4820 c4820) throws GeneralSecurityException {
        if (c4820.m10843() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c4820.m10843() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static void m8072(C4834 c4834) {
        if (c4834.m10874() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iOrdinal = c4834.m10875().ordinal();
        if (iOrdinal == 1) {
            if (c4834.m10874() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 2) {
            if (c4834.m10874() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 3) {
            if (c4834.m10874() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 4) {
            if (c4834.m10874() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (c4834.m10874() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static C4316 m8073(int i, int i2, EnumC4813 enumC4813, int i3) {
        C4836 c4836M10706 = C4779.m10706();
        C4835 c4835M10871 = C4834.m10871();
        c4835M10871.m2948();
        C4834.m10872((C4834) c4835M10871.f3527, enumC4813);
        c4835M10871.m2948();
        C4834.m10873((C4834) c4835M10871.f3527, i2);
        C4834 c4834 = (C4834) c4835M10871.m2947();
        c4836M10706.m2948();
        C4779.m10707((C4779) c4836M10706.f3527, c4834);
        c4836M10706.m2948();
        C4779.m10709((C4779) c4836M10706.f3527, i);
        return new C4316((C4779) c4836M10706.m2947(), i3);
    }

    @Override // p065.AbstractC1524
    /* renamed from: ʿʼ */
    public int mo4109() {
        switch (this.f12747) {
            case 1:
                return 2;
            default:
                return super.mo4109();
        }
    }

    @Override // p065.AbstractC1524
    /* renamed from: ˉי */
    public final EnumC4796 mo4110() {
        switch (this.f12747) {
        }
        return EnumC4796.f18325;
    }

    @Override // p065.AbstractC1524
    /* renamed from: ˋⁱ */
    public final void mo4111(AbstractC0758 abstractC0758) throws GeneralSecurityException {
        switch (this.f12747) {
            case 0:
                C4782 c4782 = (C4782) abstractC0758;
                AbstractC1468.m5021(c4782.m10728());
                if (c4782.m10729().size() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                m8071(c4782.m10727());
                return;
            default:
                C4805 c4805 = (C4805) abstractC0758;
                AbstractC1468.m5021(c4805.m10808());
                if (c4805.m10806().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                m8072(c4805.m10807());
                return;
        }
    }

    @Override // p065.AbstractC1524
    /* renamed from: ˏʾ */
    public final AbstractC0758 mo4112(AbstractC0748 abstractC0748) {
        switch (this.f12747) {
            case 0:
                return C4782.m10722(abstractC0748, C0747.m3127());
            default:
                return C4805.m10804(abstractC0748, C0747.m3127());
        }
    }

    @Override // p065.AbstractC1524
    /* renamed from: ٴˎ */
    public final String mo4113() {
        switch (this.f12747) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // p065.AbstractC1524
    /* renamed from: ﹶˆ */
    public final ﹳﹳ mo4114() {
        switch (this.f12747) {
            case 0:
                return new C3265(C4843.class);
            default:
                return new C1084(this);
        }
    }
}
