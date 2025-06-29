package p418;

import com.google.android.gms.internal.play_billing.C0654;
import com.google.crypto.tink.shaded.protobuf.AbstractC0724;
import com.google.crypto.tink.shaded.protobuf.AbstractC0785;
import com.google.crypto.tink.shaded.protobuf.C0733;
import com.google.crypto.tink.shaded.protobuf.C0736;
import com.google.crypto.tink.shaded.protobuf.C0738;
import com.google.crypto.tink.shaded.protobuf.C0740;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0767;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0727;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0772;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0780;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import p080.AbstractC1702;
import p334.C3789;

/* renamed from: ﹳᵔ.ˈﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4792 extends AbstractC0785 {
    private static final C4792 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile InterfaceC0772 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC0780 key_ = C0740.f3555;
    private int primaryKeyId_;

    static {
        C4792 c4792 = new C4792();
        DEFAULT_INSTANCE = c4792;
        AbstractC0785.m3234(C4792.class, c4792);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static C4792 m10744(ByteArrayInputStream byteArrayInputStream, C0747 c0747) throws InvalidProtocolBufferException {
        AbstractC0785 abstractC0785M3232 = AbstractC0785.m3232(DEFAULT_INSTANCE, new C0733(byteArrayInputStream), c0747);
        AbstractC0785.m3236(abstractC0785M3232);
        return (C4792) abstractC0785M3232;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static void m10745(C4792 c4792, int i) {
        c4792.primaryKeyId_ = i;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static C4802 m10746() {
        return (C4802) DEFAULT_INSTANCE.m3239();
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static C4792 m10747(byte[] bArr, C0747 c0747) {
        C4792 c4792 = DEFAULT_INSTANCE;
        int length = bArr.length;
        AbstractC0785 abstractC0785M3245 = c4792.m3245();
        try {
            C0736 c0736 = C0736.f3551;
            c0736.getClass();
            InterfaceC0727 interfaceC0727M3049 = c0736.m3049(abstractC0785M3245.getClass());
            C0654 c0654 = new C0654();
            c0747.getClass();
            interfaceC0727M3049.mo2937(abstractC0785M3245, bArr, 0, length, c0654);
            interfaceC0727M3049.mo2939(abstractC0785M3245);
            AbstractC0785.m3236(abstractC0785M3245);
            return (C4792) abstractC0785M3245;
        } catch (InvalidProtocolBufferException e) {
            if (e.f3520) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m2926();
        }
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static void m10748(C4792 c4792, C4780 c4780) {
        c4792.getClass();
        InterfaceC0780 interfaceC0780 = c4792.key_;
        if (!((AbstractC0724) interfaceC0780).f3523) {
            int size = interfaceC0780.size();
            c4792.key_ = interfaceC0780.mo2949(size == 0 ? 10 : size * 2);
        }
        c4792.key_.add(c4780);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final List m10749() {
        return this.key_;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final C4780 m10750(int i) {
        return (C4780) this.key_.get(i);
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int m10751() {
        return this.primaryKeyId_;
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
                return new C0767(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", C4780.class});
            case 3:
                return new C4792();
            case 4:
                return new C4802(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0772 c0738 = PARSER;
                if (c0738 == null) {
                    synchronized (C4792.class) {
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
    public final int m10752() {
        return this.key_.size();
    }
}
