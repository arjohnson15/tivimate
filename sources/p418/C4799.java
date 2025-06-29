package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4799 extends AbstractC0785 {
    private static final C4799 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile InterfaceC0772 PARSER;
    private int ivSize_;

    static {
        C4799 c4799 = new C4799();
        DEFAULT_INSTANCE = c4799;
        AbstractC0785.m3234(C4799.class, c4799);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10776(C4799 c4799) {
        c4799.ivSize_ = 16;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static C4787 m10777() {
        return (C4787) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static C4799 m10778() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final int m10779() {
        return this.ivSize_;
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new C4799();
            case 4:
                return new C4787(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4799.class) {
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
}
