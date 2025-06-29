package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4793 extends AbstractC0785 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C4793 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile InterfaceC0772 PARSER;
    private C4828 aesCtrKeyFormat_;
    private C4779 hmacKeyFormat_;

    static {
        C4793 c4793 = new C4793();
        DEFAULT_INSTANCE = c4793;
        AbstractC0785.m3234(C4793.class, c4793);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static C4845 m10753() {
        return (C4845) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static C4793 m10754(AbstractC0748 abstractC0748, C0747 c0747) {
        return (C4793) AbstractC0785.m3238(DEFAULT_INSTANCE, abstractC0748, c0747);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10755(C4793 c4793, C4828 c4828) {
        c4793.getClass();
        c4793.aesCtrKeyFormat_ = c4828;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10756(C4793 c4793, C4779 c4779) {
        c4793.getClass();
        c4793.hmacKeyFormat_ = c4779;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final C4828 m10757() {
        C4828 c4828 = this.aesCtrKeyFormat_;
        return c4828 == null ? C4828.m10856() : c4828;
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new C4793();
            case 4:
                return new C4845(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4793.class) {
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
    public final C4779 m10758() {
        C4779 c4779 = this.hmacKeyFormat_;
        return c4779 == null ? C4779.m10705() : c4779;
    }
}
