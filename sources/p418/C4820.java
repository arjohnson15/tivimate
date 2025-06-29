package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4820 extends AbstractC0785 {
    private static final C4820 DEFAULT_INSTANCE;
    private static volatile InterfaceC0772 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        C4820 c4820 = new C4820();
        DEFAULT_INSTANCE = c4820;
        AbstractC0785.m3234(C4820.class, c4820);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10840(C4820 c4820) {
        c4820.tagSize_ = 16;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static C4785 m10841() {
        return (C4785) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static C4820 m10842() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final int m10843() {
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new C4820();
            case 4:
                return new C4785(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4820.class) {
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
