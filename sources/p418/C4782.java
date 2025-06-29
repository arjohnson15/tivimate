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

/* renamed from: ﹳᵔ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4782 extends AbstractC0785 {
    private static final C4782 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile InterfaceC0772 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0748 keyValue_ = AbstractC0748.f3592;
    private C4820 params_;
    private int version_;

    static {
        C4782 c4782 = new C4782();
        DEFAULT_INSTANCE = c4782;
        AbstractC0785.m3234(C4782.class, c4782);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static C4782 m10722(AbstractC0748 abstractC0748, C0747 c0747) {
        return (C4782) AbstractC0785.m3238(DEFAULT_INSTANCE, abstractC0748, c0747);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static void m10723(C4782 c4782, C4820 c4820) {
        c4782.getClass();
        c4820.getClass();
        c4782.params_ = c4820;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10724(C4782 c4782) {
        c4782.version_ = 0;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static C4819 m10725() {
        return (C4819) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10726(C4782 c4782, C0762 c0762) {
        c4782.getClass();
        c4782.keyValue_ = c0762;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4820 m10727() {
        C4820 c4820 = this.params_;
        return c4820 == null ? C4820.m10842() : c4820;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int m10728() {
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C4782();
            case 4:
                return new C4819(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4782.class) {
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
    public final AbstractC0748 m10729() {
        return this.keyValue_;
    }
}
