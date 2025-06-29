package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4849 extends AbstractC0785 {
    private static final C4849 DEFAULT_INSTANCE;
    private static volatile InterfaceC0772 PARSER;

    static {
        C4849 c4849 = new C4849();
        DEFAULT_INSTANCE = c4849;
        AbstractC0785.m3234(C4849.class, c4849);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static C4849 m10908() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static C4849 m10909(AbstractC0748 abstractC0748, C0747 c0747) {
        return (C4849) AbstractC0785.m3238(DEFAULT_INSTANCE, abstractC0748, c0747);
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new C4849();
            case 4:
                return new C4827(DEFAULT_INSTANCE, 0);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4849.class) {
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
