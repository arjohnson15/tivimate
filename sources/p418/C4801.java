package p418;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0762;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ˋﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4801 extends AbstractC0785 {
    private static final C4801 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC0772 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC0748 value_ = AbstractC0748.f3592;

    static {
        C4801 c4801 = new C4801();
        DEFAULT_INSTANCE = c4801;
        AbstractC0785.m3234(C4801.class, c4801);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static C4848 m10780() {
        return (C4848) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static void m10781(C4801 c4801, EnumC4796 enumC4796) {
        c4801.getClass();
        if (enumC4796 != EnumC4796.f18328) {
            c4801.keyMaterialType_ = enumC4796.f18329;
        } else {
            enumC4796.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10782(C4801 c4801, String str) {
        c4801.getClass();
        str.getClass();
        c4801.typeUrl_ = str;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static C4801 m10783() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10784(C4801 c4801, C0762 c0762) {
        c4801.getClass();
        c4801.value_ = c0762;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final EnumC4796 m10785() {
        int i = this.keyMaterialType_;
        EnumC4796 enumC4796 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : EnumC4796.f18327 : EnumC4796.f18323 : EnumC4796.f18326 : EnumC4796.f18325 : EnumC4796.f18322;
        return enumC4796 == null ? EnumC4796.f18328 : enumC4796;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String m10786() {
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new C4801();
            case 4:
                return new C4848(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4801.class) {
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
    public final AbstractC0748 m10787() {
        return this.value_;
    }
}
