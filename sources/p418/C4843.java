package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4843 extends AbstractC0785 {
    private static final C4843 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0772 PARSER;
    private int keySize_;
    private C4820 params_;

    static {
        C4843 c4843 = new C4843();
        DEFAULT_INSTANCE = c4843;
        AbstractC0785.m3234(C4843.class, c4843);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static C4810 m10892() {
        return (C4810) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C4843 m10893(AbstractC0748 abstractC0748, C0747 c0747) {
        return (C4843) AbstractC0785.m3238(DEFAULT_INSTANCE, abstractC0748, c0747);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10894(C4843 c4843) {
        c4843.keySize_ = 32;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10895(C4843 c4843, C4820 c4820) {
        c4843.getClass();
        c4843.params_ = c4820;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final int m10896() {
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new C4843();
            case 4:
                return new C4810(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4843.class) {
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
    public final C4820 m10897() {
        C4820 c4820 = this.params_;
        return c4820 == null ? C4820.m10842() : c4820;
    }
}
