package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0724;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0740;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0780;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ـᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4818 extends AbstractC0785 {
    private static final C4818 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile InterfaceC0772 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC0780 keyInfo_ = C0740.f3555;
    private int primaryKeyId_;

    static {
        C4818 c4818 = new C4818();
        DEFAULT_INSTANCE = c4818;
        AbstractC0785.m3234(C4818.class, c4818);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10836(C4818 c4818, int i) {
        c4818.primaryKeyId_ = i;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static C4781 m10837() {
        return (C4781) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10838(C4818 c4818, C4822 c4822) {
        c4818.getClass();
        InterfaceC0780 interfaceC0780 = c4818.keyInfo_;
        if (!((AbstractC0724) interfaceC0780).f3523) {
            int size = interfaceC0780.size();
            c4818.keyInfo_ = interfaceC0780.mo2949(size == 0 ? 10 : size * 2);
        }
        c4818.keyInfo_.add(c4822);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final C4822 m10839() {
        return (C4822) this.keyInfo_.get(0);
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C4822.class});
            case 3:
                return new C4818();
            case 4:
                return new C4781(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4818.class) {
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
