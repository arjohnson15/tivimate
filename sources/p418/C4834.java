package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4834 extends AbstractC0785 {
    private static final C4834 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile InterfaceC0772 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        C4834 c4834 = new C4834();
        DEFAULT_INSTANCE = c4834;
        AbstractC0785.m3234(C4834.class, c4834);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static C4834 m10870() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C4835 m10871() {
        return (C4835) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10872(C4834 c4834, EnumC4813 enumC4813) {
        c4834.getClass();
        c4834.hash_ = enumC4813.m10824();
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10873(C4834 c4834, int i) {
        c4834.tagSize_ = i;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int m10874() {
        return this.tagSize_;
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new C4834();
            case 4:
                return new C4835(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4834.class) {
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
    public final EnumC4813 m10875() {
        int i = this.hash_;
        EnumC4813 enumC4813 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : EnumC4813.f18337 : EnumC4813.f18336 : EnumC4813.f18331 : EnumC4813.f18335 : EnumC4813.f18333 : EnumC4813.f18330;
        return enumC4813 == null ? EnumC4813.f18332 : enumC4813;
    }
}
