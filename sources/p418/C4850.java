package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ﾞﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4850 extends AbstractC0785 {
    private static final C4850 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile InterfaceC0772 PARSER;
    private C4794 dekTemplate_;
    private String kekUri_ = "";

    static {
        C4850 c4850 = new C4850();
        DEFAULT_INSTANCE = c4850;
        AbstractC0785.m3234(C4850.class, c4850);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static C4850 m10910(AbstractC0748 abstractC0748, C0747 c0747) {
        return (C4850) AbstractC0785.m3238(DEFAULT_INSTANCE, abstractC0748, c0747);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static C4850 m10911() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final String m10912() {
        return this.kekUri_;
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new C4850();
            case 4:
                return new C4827(DEFAULT_INSTANCE, 3);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4850.class) {
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
    public final boolean m10913() {
        return this.dekTemplate_ != null;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final C4794 m10914() {
        C4794 c4794 = this.dekTemplate_;
        return c4794 == null ? C4794.m10762() : c4794;
    }
}
