package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0762;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4804 extends AbstractC0785 {
    private static final C4804 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0772 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0748 keyValue_ = AbstractC0748.f3592;
    private C4799 params_;
    private int version_;

    static {
        C4804 c4804 = new C4804();
        DEFAULT_INSTANCE = c4804;
        AbstractC0785.m3234(C4804.class, c4804);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static C4804 m10792(AbstractC0748 abstractC0748, C0747 c0747) {
        return (C4804) AbstractC0785.m3238(DEFAULT_INSTANCE, abstractC0748, c0747);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static void m10793(C4804 c4804, C0762 c0762) {
        c4804.getClass();
        c4804.keyValue_ = c0762;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10794(C4804 c4804) {
        c4804.version_ = 0;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static C4832 m10795() {
        return (C4832) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10796(C4804 c4804, C4799 c4799) {
        c4804.getClass();
        c4799.getClass();
        c4804.params_ = c4799;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4799 m10797() {
        C4799 c4799 = this.params_;
        return c4799 == null ? C4799.m10778() : c4799;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int m10798() {
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new C4804();
            case 4:
                return new C4832(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4804.class) {
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
    public final AbstractC0748 m10799() {
        return this.keyValue_;
    }
}
