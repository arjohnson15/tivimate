package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ٴﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4822 extends AbstractC0785 {
    private static final C4822 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile InterfaceC0772 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        C4822 c4822 = new C4822();
        DEFAULT_INSTANCE = c4822;
        AbstractC0785.m3234(C4822.class, c4822);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static void m10844(C4822 c4822, EnumC4829 enumC4829) {
        c4822.getClass();
        c4822.status_ = enumC4829.m10863();
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C4821 m10845() {
        return (C4821) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10846(C4822 c4822, String str) {
        c4822.getClass();
        str.getClass();
        c4822.typeUrl_ = str;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static void m10847(C4822 c4822, int i) {
        c4822.keyId_ = i;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10848(C4822 c4822, EnumC4778 enumC4778) {
        c4822.getClass();
        c4822.outputPrefixType_ = enumC4778.m10704();
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int m10849() {
        return this.keyId_;
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new C4822();
            case 4:
                return new C4821(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4822.class) {
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
