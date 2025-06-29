package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4841 extends AbstractC0785 {
    private static final C4841 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0772 PARSER;
    private int keySize_;
    private C4799 params_;

    static {
        C4841 c4841 = new C4841();
        DEFAULT_INSTANCE = c4841;
        AbstractC0785.m3234(C4841.class, c4841);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static C4831 m10882() {
        return (C4831) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C4841 m10883(AbstractC0748 abstractC0748, C0747 c0747) {
        return (C4841) AbstractC0785.m3238(DEFAULT_INSTANCE, abstractC0748, c0747);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10884(C4841 c4841, C4799 c4799) {
        c4841.getClass();
        c4841.params_ = c4799;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10885(C4841 c4841, int i) {
        c4841.keySize_ = i;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final int m10886() {
        return this.keySize_;
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new C4841();
            case 4:
                return new C4831(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4841.class) {
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
    public final C4799 m10887() {
        C4799 c4799 = this.params_;
        return c4799 == null ? C4799.m10778() : c4799;
    }
}
