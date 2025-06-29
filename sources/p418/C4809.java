package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4809 extends AbstractC0785 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C4809 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile InterfaceC0772 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C4795 aesCtrKey_;
    private C4805 hmacKey_;
    private int version_;

    static {
        C4809 c4809 = new C4809();
        DEFAULT_INSTANCE = c4809;
        AbstractC0785.m3234(C4809.class, c4809);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static C4809 m10812(AbstractC0748 abstractC0748, C0747 c0747) {
        return (C4809) AbstractC0785.m3238(DEFAULT_INSTANCE, abstractC0748, c0747);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static void m10813(C4809 c4809, C4805 c4805) {
        c4809.getClass();
        c4805.getClass();
        c4809.hmacKey_ = c4805;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10814(C4809 c4809) {
        c4809.version_ = 0;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static C4823 m10815() {
        return (C4823) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10816(C4809 c4809, C4795 c4795) {
        c4809.getClass();
        c4795.getClass();
        c4809.aesCtrKey_ = c4795;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4805 m10817() {
        C4805 c4805 = this.hmacKey_;
        return c4805 == null ? C4805.m10803() : c4805;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int m10818() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0785
    /* renamed from: ˏʾ */
    public final Object mo3242(int i) {
        switch (AbstractC1702.m5411(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new C4809();
            case 4:
                return new C4823(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4809.class) {
                        try {
                            c0738 = PARSER;
                            if (c0738 == null) {
                                c0738 = new C0738();
                                PARSER = c0738;
                            }
                        } finally {
                        }
                    }
                }
                return c0738;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4795 m10819() {
        C4795 c4795 = this.aesCtrKey_;
        return c4795 == null ? C4795.m10770() : c4795;
    }
}
