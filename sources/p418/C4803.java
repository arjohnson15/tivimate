package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4803 extends AbstractC0785 {
    private static final C4803 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0772 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;

    static {
        C4803 c4803 = new C4803();
        DEFAULT_INSTANCE = c4803;
        AbstractC0785.m3234(C4803.class, c4803);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static C4788 m10788() {
        return (C4788) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10789(C4803 c4803, int i) {
        c4803.keySize_ = i;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static C4803 m10790(AbstractC0748 abstractC0748, C0747 c0747) {
        return (C4803) AbstractC0785.m3238(DEFAULT_INSTANCE, abstractC0748, c0747);
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
            case 3:
                return new C4803();
            case 4:
                return new C4788(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4803.class) {
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

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final int m10791() {
        return this.keySize_;
    }
}
