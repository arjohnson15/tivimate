package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ʻﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4780 extends AbstractC0785 {
    private static final C4780 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile InterfaceC0772 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private C4801 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        C4780 c4780 = new C4780();
        DEFAULT_INSTANCE = c4780;
        AbstractC0785.m3234(C4780.class, c4780);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static void m10712(C4780 c4780) {
        EnumC4829 enumC4829 = EnumC4829.f18342;
        c4780.getClass();
        c4780.status_ = enumC4829.m10863();
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10713(C4780 c4780, C4801 c4801) {
        c4780.getClass();
        c4780.keyData_ = c4801;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static void m10714(C4780 c4780, int i) {
        c4780.keyId_ = i;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10715(C4780 c4780, EnumC4778 enumC4778) {
        c4780.getClass();
        c4780.outputPrefixType_ = enumC4778.m10704();
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static C4816 m10716() {
        return (C4816) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4801 m10717() {
        C4801 c4801 = this.keyData_;
        return c4801 == null ? C4801.m10783() : c4801;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final EnumC4829 m10718() {
        int i = this.status_;
        EnumC4829 enumC4829 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : EnumC4829.f18341 : EnumC4829.f18343 : EnumC4829.f18342 : EnumC4829.f18340;
        return enumC4829 == null ? EnumC4829.f18344 : enumC4829;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int m10719() {
        return this.keyId_;
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new C4780();
            case 4:
                return new C4816(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4780.class) {
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
    public final EnumC4778 m10720() {
        EnumC4778 enumC4778M10703 = EnumC4778.m10703(this.outputPrefixType_);
        return enumC4778M10703 == null ? EnumC4778.f18320 : enumC4778M10703;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean m10721() {
        return this.keyData_ != null;
    }
}
