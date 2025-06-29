package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0762;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ˉᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4794 extends AbstractC0785 {
    private static final C4794 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC0772 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC0748 value_ = AbstractC0748.f3592;

    static {
        C4794 c4794 = new C4794();
        DEFAULT_INSTANCE = c4794;
        AbstractC0785.m3234(C4794.class, c4794);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static C4786 m10759() {
        return (C4786) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static void m10760(C4794 c4794, EnumC4778 enumC4778) {
        c4794.getClass();
        c4794.outputPrefixType_ = enumC4778.m10704();
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10761(C4794 c4794, String str) {
        c4794.getClass();
        str.getClass();
        c4794.typeUrl_ = str;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static C4794 m10762() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10763(C4794 c4794, C0762 c0762) {
        c4794.getClass();
        c4794.value_ = c0762;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final EnumC4778 m10764() {
        EnumC4778 enumC4778M10703 = EnumC4778.m10703(this.outputPrefixType_);
        return enumC4778M10703 == null ? EnumC4778.f18320 : enumC4778M10703;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String m10765() {
        return this.typeUrl_;
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new C4794();
            case 4:
                return new C4786(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4794.class) {
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

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final AbstractC0748 m10766() {
        return this.value_;
    }
}
