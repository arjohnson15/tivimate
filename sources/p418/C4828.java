package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4828 extends AbstractC0785 {
    private static final C4828 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0772 PARSER;
    private int keySize_;
    private C4812 params_;

    static {
        C4828 c4828 = new C4828();
        DEFAULT_INSTANCE = c4828;
        AbstractC0785.m3234(C4828.class, c4828);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static C4828 m10856() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C4800 m10857() {
        return (C4800) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10858(C4828 c4828, C4812 c4812) {
        c4828.getClass();
        c4828.params_ = c4812;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static C4828 m10859(AbstractC0748 abstractC0748, C0747 c0747) {
        return (C4828) AbstractC0785.m3238(DEFAULT_INSTANCE, abstractC0748, c0747);
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10860(C4828 c4828, int i) {
        c4828.keySize_ = i;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4812 m10861() {
        C4812 c4812 = this.params_;
        return c4812 == null ? C4812.m10822() : c4812;
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
                return new C4828();
            case 4:
                return new C4800(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4828.class) {
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
    public final int m10862() {
        return this.keySize_;
    }
}
