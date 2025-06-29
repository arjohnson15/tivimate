package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4779 extends AbstractC0785 {
    private static final C4779 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0772 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private C4834 params_;
    private int version_;

    static {
        C4779 c4779 = new C4779();
        DEFAULT_INSTANCE = c4779;
        AbstractC0785.m3234(C4779.class, c4779);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static C4779 m10705() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C4836 m10706() {
        return (C4836) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10707(C4779 c4779, C4834 c4834) {
        c4779.getClass();
        c4779.params_ = c4834;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static C4779 m10708(AbstractC0748 abstractC0748, C0747 c0747) {
        return (C4779) AbstractC0785.m3238(DEFAULT_INSTANCE, abstractC0748, c0747);
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10709(C4779 c4779, int i) {
        c4779.keySize_ = i;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4834 m10710() {
        C4834 c4834 = this.params_;
        return c4834 == null ? C4834.m10870() : c4834;
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new C4779();
            case 4:
                return new C4836(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4779.class) {
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
    public final int m10711() {
        return this.keySize_;
    }
}
