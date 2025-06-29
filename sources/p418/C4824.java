package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0740;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0780;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ᐧʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4824 extends AbstractC0785 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final C4824 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile InterfaceC0772 PARSER;
    private String configName_ = "";
    private InterfaceC0780 entry_ = C0740.f3555;

    static {
        C4824 c4824 = new C4824();
        DEFAULT_INSTANCE = c4824;
        AbstractC0785.m3234(C4824.class, c4824);
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", C4839.class});
            case 3:
                return new C4824();
            case 4:
                return new C4827(DEFAULT_INSTANCE, 4);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4824.class) {
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
