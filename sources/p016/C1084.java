package p016;

import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0758;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.C0762;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Map;
import p064.AbstractC1465;
import p064.AbstractC1468;
import p064.InterfaceC1462;
import p065.AbstractC1524;
import p115.InterfaceC1822;
import p267.C3273;
import p334.C3789;
import p375.C4316;
import p418.C4779;
import p418.C4784;
import p418.C4789;
import p418.C4790;
import p418.C4791;
import p418.C4793;
import p418.C4795;
import p418.C4797;
import p418.C4798;
import p418.C4799;
import p418.C4803;
import p418.C4804;
import p418.C4805;
import p418.C4806;
import p418.C4807;
import p418.C4809;
import p418.C4811;
import p418.C4812;
import p418.C4817;
import p418.C4823;
import p418.C4825;
import p418.C4826;
import p418.C4828;
import p418.C4830;
import p418.C4832;
import p418.C4833;
import p418.C4834;
import p418.C4837;
import p418.C4838;
import p418.C4840;
import p418.C4841;
import p418.C4842;
import p418.C4844;
import p418.C4846;
import p418.C4847;
import p418.C4849;
import p418.C4850;
import p418.EnumC4813;
import ʿﾞ.ﹳﹳ;

/* renamed from: ʻᐧ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1084 extends ﹳﹳ {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f4655 = 0;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1524 f4656;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084(C1078 c1078) {
        super(C4793.class);
        this.f4656 = c1078;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084(C1078 c1078, byte b) {
        super(C4828.class);
        this.f4656 = c1078;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084(C1078 c1078, byte b, byte b2) {
        super(C4806.class);
        this.f4656 = c1078;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084(C1078 c1078, byte b, char c) {
        super(C4850.class);
        this.f4656 = c1078;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084(C1078 c1078, byte b, int i) {
        super(C4790.class);
        this.f4656 = c1078;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084(C1078 c1078, byte b, short s) {
        super(C4844.class);
        this.f4656 = c1078;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084(C1078 c1078, byte b, boolean z) {
        super(C4849.class);
        this.f4656 = c1078;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084(C1078 c1078, char c) {
        super(C4841.class);
        this.f4656 = c1078;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084(C1078 c1078, int i) {
        super(C4842.class);
        this.f4656 = c1078;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084(C1078 c1078, short s) {
        super(C4803.class);
        this.f4656 = c1078;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084(C3273 c3273) {
        super(C4779.class);
        this.f4656 = c3273;
    }

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public final void m4116(AbstractC0758 abstractC0758) throws GeneralSecurityException {
        switch (this.f4655) {
            case 0:
                C4793 c4793 = (C4793) abstractC0758;
                C1083[] c1083Arr = {new C1083(1, InterfaceC1462.class)};
                HashMap map = new HashMap();
                for (C1083 c1083 : c1083Arr) {
                    boolean zContainsKey = map.containsKey(c1083.f4654);
                    Class cls = c1083.f4654;
                    if (zContainsKey) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
                    }
                    map.put(cls, c1083);
                }
                if (c1083Arr.length > 0) {
                    Class cls2 = c1083Arr[0].f4654;
                }
                DesugarCollections.unmodifiableMap(map);
                C4828 c4828M10757 = c4793.m10757();
                AbstractC1468.m5022(c4828M10757.m10862());
                C4812 c4812M10861 = c4828M10757.m10861();
                if (c4812M10861.m10823() < 12 || c4812M10861.m10823() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                C1083[] c1083Arr2 = {new C1083(10, InterfaceC1822.class)};
                HashMap map2 = new HashMap();
                for (C1083 c10832 : c1083Arr2) {
                    boolean zContainsKey2 = map2.containsKey(c10832.f4654);
                    Class cls3 = c10832.f4654;
                    if (zContainsKey2) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                    }
                    map2.put(cls3, c10832);
                }
                if (c1083Arr2.length > 0) {
                    Class cls4 = c1083Arr2[0].f4654;
                }
                DesugarCollections.unmodifiableMap(map2);
                C4779 c4779M10758 = c4793.m10758();
                if (c4779M10758.m10711() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                C3273.m8072(c4779M10758.m10710());
                AbstractC1468.m5022(c4793.m10757().m10862());
                return;
            case 1:
                C4828 c4828 = (C4828) abstractC0758;
                AbstractC1468.m5022(c4828.m10862());
                C4812 c4812M108612 = c4828.m10861();
                ((C1078) this.f4656).getClass();
                if (c4812M108612.m10823() < 12 || c4812M108612.m10823() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                return;
            case 2:
                C4841 c4841 = (C4841) abstractC0758;
                AbstractC1468.m5022(c4841.m10886());
                if (c4841.m10887().m10779() != 12 && c4841.m10887().m10779() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 3:
                AbstractC1468.m5022(((C4842) abstractC0758).m10891());
                return;
            case 4:
                AbstractC1468.m5022(((C4803) abstractC0758).m10791());
                return;
            case 5:
                return;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return;
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                C4850 c4850 = (C4850) abstractC0758;
                if (c4850.m10912().isEmpty() || !c4850.m10913()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            case 8:
                return;
            case 9:
                C4779 c4779 = (C4779) abstractC0758;
                if (c4779.m10711() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                C3273.m8072(c4779.m10710());
                return;
            default:
                C4844 c4844 = (C4844) abstractC0758;
                if (c4844.m10901() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + c4844.m10901() + ". Valid keys must have 64 bytes.");
        }
    }

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public Map m4117() {
        switch (this.f4655) {
            case 0:
                HashMap map = new HashMap();
                map.put("AES128_CTR_HMAC_SHA256", C1078.m4105(16, 16, 1));
                map.put("AES128_CTR_HMAC_SHA256_RAW", C1078.m4105(16, 16, 3));
                map.put("AES256_CTR_HMAC_SHA256", C1078.m4105(32, 32, 1));
                map.put("AES256_CTR_HMAC_SHA256_RAW", C1078.m4105(32, 32, 3));
                return DesugarCollections.unmodifiableMap(map);
            case 1:
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                return super.ᵎʾ();
            case 2:
                HashMap map2 = new HashMap();
                map2.put("AES128_EAX", C1078.m4107(16, 1));
                map2.put("AES128_EAX_RAW", C1078.m4107(16, 3));
                map2.put("AES256_EAX", C1078.m4107(32, 1));
                map2.put("AES256_EAX_RAW", C1078.m4107(32, 3));
                return DesugarCollections.unmodifiableMap(map2);
            case 3:
                HashMap map3 = new HashMap();
                map3.put("AES128_GCM", C1078.m4106(16, 1));
                map3.put("AES128_GCM_RAW", C1078.m4106(16, 3));
                map3.put("AES256_GCM", C1078.m4106(32, 1));
                map3.put("AES256_GCM_RAW", C1078.m4106(32, 3));
                return DesugarCollections.unmodifiableMap(map3);
            case 4:
                HashMap map4 = new HashMap();
                map4.put("AES128_GCM_SIV", C1078.m4108(16, 1));
                map4.put("AES128_GCM_SIV_RAW", C1078.m4108(16, 3));
                map4.put("AES256_GCM_SIV", C1078.m4108(32, 1));
                map4.put("AES256_GCM_SIV_RAW", C1078.m4108(32, 3));
                return DesugarCollections.unmodifiableMap(map4);
            case 5:
                HashMap map5 = new HashMap();
                map5.put("CHACHA20_POLY1305", new C4316(C4849.m10908(), 1));
                map5.put("CHACHA20_POLY1305_RAW", new C4316(C4849.m10908(), 3));
                return DesugarCollections.unmodifiableMap(map5);
            case 8:
                HashMap map6 = new HashMap();
                map6.put("XCHACHA20_POLY1305", new C4316(C4790.m10742(), 1));
                map6.put("XCHACHA20_POLY1305_RAW", new C4316(C4790.m10742(), 3));
                return DesugarCollections.unmodifiableMap(map6);
            case 9:
                HashMap map7 = new HashMap();
                EnumC4813 enumC4813 = EnumC4813.f18331;
                map7.put("HMAC_SHA256_128BITTAG", C3273.m8073(32, 16, enumC4813, 1));
                map7.put("HMAC_SHA256_128BITTAG_RAW", C3273.m8073(32, 16, enumC4813, 3));
                map7.put("HMAC_SHA256_256BITTAG", C3273.m8073(32, 32, enumC4813, 1));
                map7.put("HMAC_SHA256_256BITTAG_RAW", C3273.m8073(32, 32, enumC4813, 3));
                EnumC4813 enumC48132 = EnumC4813.f18336;
                map7.put("HMAC_SHA512_128BITTAG", C3273.m8073(64, 16, enumC48132, 1));
                map7.put("HMAC_SHA512_128BITTAG_RAW", C3273.m8073(64, 16, enumC48132, 3));
                map7.put("HMAC_SHA512_256BITTAG", C3273.m8073(64, 32, enumC48132, 1));
                map7.put("HMAC_SHA512_256BITTAG_RAW", C3273.m8073(64, 32, enumC48132, 3));
                map7.put("HMAC_SHA512_512BITTAG", C3273.m8073(64, 64, enumC48132, 1));
                map7.put("HMAC_SHA512_512BITTAG_RAW", C3273.m8073(64, 64, enumC48132, 3));
                return DesugarCollections.unmodifiableMap(map7);
            case 10:
                HashMap map8 = new HashMap();
                C4837 c4837M10898 = C4844.m10898();
                c4837M10898.m2948();
                C4844.m10899((C4844) c4837M10898.f3527);
                map8.put("AES256_SIV", new C4316((C4844) c4837M10898.m2947(), 1));
                C4837 c4837M108982 = C4844.m10898();
                c4837M108982.m2948();
                C4844.m10899((C4844) c4837M108982.f3527);
                map8.put("AES256_SIV_RAW", new C4316((C4844) c4837M108982.m2947(), 3));
                return DesugarCollections.unmodifiableMap(map8);
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final AbstractC0758 m4118(AbstractC0758 abstractC0758) {
        AbstractC1524 abstractC1524 = this.f4656;
        switch (this.f4655) {
            case 0:
                C4793 c4793 = (C4793) abstractC0758;
                C1083[] c1083Arr = {new C1083(1, InterfaceC1462.class)};
                HashMap map = new HashMap();
                for (C1083 c1083 : c1083Arr) {
                    boolean zContainsKey = map.containsKey(c1083.f4654);
                    Class cls = c1083.f4654;
                    if (zContainsKey) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
                    }
                    map.put(cls, c1083);
                }
                if (c1083Arr.length > 0) {
                    Class cls2 = c1083Arr[0].f4654;
                }
                DesugarCollections.unmodifiableMap(map);
                C4828 c4828M10757 = c4793.m10757();
                C4807 c4807M10767 = C4795.m10767();
                C4812 c4812M10861 = c4828M10757.m10861();
                c4807M10767.m2948();
                C4795.m10772((C4795) c4807M10767.f3527, c4812M10861);
                byte[] bArrM5018 = AbstractC1465.m5018(c4828M10757.m10862());
                C0762 c0762M3129 = AbstractC0748.m3129(bArrM5018, 0, bArrM5018.length);
                c4807M10767.m2948();
                C4795.m10768((C4795) c4807M10767.f3527, c0762M3129);
                c4807M10767.m2948();
                C4795.m10769((C4795) c4807M10767.f3527);
                C4795 c4795 = (C4795) c4807M10767.m2947();
                C1083[] c1083Arr2 = {new C1083(10, InterfaceC1822.class)};
                HashMap map2 = new HashMap();
                for (C1083 c10832 : c1083Arr2) {
                    boolean zContainsKey2 = map2.containsKey(c10832.f4654);
                    Class cls3 = c10832.f4654;
                    if (zContainsKey2) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                    }
                    map2.put(cls3, c10832);
                }
                if (c1083Arr2.length > 0) {
                    Class cls4 = c1083Arr2[0].f4654;
                }
                DesugarCollections.unmodifiableMap(map2);
                C4779 c4779M10758 = c4793.m10758();
                C4838 c4838M10800 = C4805.m10800();
                c4838M10800.m2948();
                C4805.m10802((C4805) c4838M10800.f3527);
                C4834 c4834M10710 = c4779M10758.m10710();
                c4838M10800.m2948();
                C4805.m10805((C4805) c4838M10800.f3527, c4834M10710);
                byte[] bArrM50182 = AbstractC1465.m5018(c4779M10758.m10711());
                C0762 c0762M31292 = AbstractC0748.m3129(bArrM50182, 0, bArrM50182.length);
                c4838M10800.m2948();
                C4805.m10801((C4805) c4838M10800.f3527, c0762M31292);
                C4805 c4805 = (C4805) c4838M10800.m2947();
                C4823 c4823M10815 = C4809.m10815();
                c4823M10815.m2948();
                C4809.m10816((C4809) c4823M10815.f3527, c4795);
                c4823M10815.m2948();
                C4809.m10813((C4809) c4823M10815.f3527, c4805);
                ((C1078) abstractC1524).getClass();
                c4823M10815.m2948();
                C4809.m10814((C4809) c4823M10815.f3527);
                return (C4809) c4823M10815.m2947();
            case 1:
                C4828 c4828 = (C4828) abstractC0758;
                C4807 c4807M107672 = C4795.m10767();
                C4812 c4812M108612 = c4828.m10861();
                c4807M107672.m2948();
                C4795.m10772((C4795) c4807M107672.f3527, c4812M108612);
                byte[] bArrM50183 = AbstractC1465.m5018(c4828.m10862());
                C0762 c0762M31293 = AbstractC0748.m3129(bArrM50183, 0, bArrM50183.length);
                c4807M107672.m2948();
                C4795.m10768((C4795) c4807M107672.f3527, c0762M31293);
                ((C1078) abstractC1524).getClass();
                c4807M107672.m2948();
                C4795.m10769((C4795) c4807M107672.f3527);
                return (C4795) c4807M107672.m2947();
            case 2:
                C4841 c4841 = (C4841) abstractC0758;
                C4832 c4832M10795 = C4804.m10795();
                byte[] bArrM50184 = AbstractC1465.m5018(c4841.m10886());
                C0762 c0762M31294 = AbstractC0748.m3129(bArrM50184, 0, bArrM50184.length);
                c4832M10795.m2948();
                C4804.m10793((C4804) c4832M10795.f3527, c0762M31294);
                C4799 c4799M10887 = c4841.m10887();
                c4832M10795.m2948();
                C4804.m10796((C4804) c4832M10795.f3527, c4799M10887);
                ((C1078) abstractC1524).getClass();
                c4832M10795.m2948();
                C4804.m10794((C4804) c4832M10795.f3527);
                return (C4804) c4832M10795.m2947();
            case 3:
                C4847 c4847M10902 = C4846.m10902();
                byte[] bArrM50185 = AbstractC1465.m5018(((C4842) abstractC0758).m10891());
                C0762 c0762M31295 = AbstractC0748.m3129(bArrM50185, 0, bArrM50185.length);
                c4847M10902.m2948();
                C4846.m10905((C4846) c4847M10902.f3527, c0762M31295);
                ((C1078) abstractC1524).getClass();
                c4847M10902.m2948();
                C4846.m10904((C4846) c4847M10902.f3527);
                return (C4846) c4847M10902.m2947();
            case 4:
                C4791 c4791M10850 = C4826.m10850();
                byte[] bArrM50186 = AbstractC1465.m5018(((C4803) abstractC0758).m10791());
                C0762 c0762M31296 = AbstractC0748.m3129(bArrM50186, 0, bArrM50186.length);
                c4791M10850.m2948();
                C4826.m10853((C4826) c4791M10850.f3527, c0762M31296);
                ((C1078) abstractC1524).getClass();
                c4791M10850.m2948();
                C4826.m10852((C4826) c4791M10850.f3527);
                return (C4826) c4791M10850.m2947();
            case 5:
                C4798 c4798M10830 = C4817.m10830();
                ((C1078) abstractC1524).getClass();
                c4798M10830.m2948();
                C4817.m10832((C4817) c4798M10830.f3527);
                byte[] bArrM50187 = AbstractC1465.m5018(32);
                C0762 c0762M31297 = AbstractC0748.m3129(bArrM50187, 0, bArrM50187.length);
                c4798M10830.m2948();
                C4817.m10833((C4817) c4798M10830.f3527, c0762M31297);
                return (C4817) c4798M10830.m2947();
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                C4833 c4833M10864 = C4830.m10864();
                c4833M10864.m2948();
                C4830.m10867((C4830) c4833M10864.f3527, (C4806) abstractC0758);
                ((C1078) abstractC1524).getClass();
                c4833M10864.m2948();
                C4830.m10866((C4830) c4833M10864.f3527);
                return (C4830) c4833M10864.m2947();
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                C4811 c4811M10876 = C4840.m10876();
                c4811M10876.m2948();
                C4840.m10879((C4840) c4811M10876.f3527, (C4850) abstractC0758);
                ((C1078) abstractC1524).getClass();
                c4811M10876.m2948();
                C4840.m10878((C4840) c4811M10876.f3527);
                return (C4840) c4811M10876.m2947();
            case 8:
                C4797 c4797M10730 = C4784.m10730();
                ((C1078) abstractC1524).getClass();
                c4797M10730.m2948();
                C4784.m10732((C4784) c4797M10730.f3527);
                byte[] bArrM50188 = AbstractC1465.m5018(32);
                C0762 c0762M31298 = AbstractC0748.m3129(bArrM50188, 0, bArrM50188.length);
                c4797M10730.m2948();
                C4784.m10733((C4784) c4797M10730.f3527, c0762M31298);
                return (C4784) c4797M10730.m2947();
            case 9:
                C4779 c4779 = (C4779) abstractC0758;
                C4838 c4838M108002 = C4805.m10800();
                ((C3273) abstractC1524).getClass();
                c4838M108002.m2948();
                C4805.m10802((C4805) c4838M108002.f3527);
                C4834 c4834M107102 = c4779.m10710();
                c4838M108002.m2948();
                C4805.m10805((C4805) c4838M108002.f3527, c4834M107102);
                byte[] bArrM50189 = AbstractC1465.m5018(c4779.m10711());
                C0762 c0762M31299 = AbstractC0748.m3129(bArrM50189, 0, bArrM50189.length);
                c4838M108002.m2948();
                C4805.m10801((C4805) c4838M108002.f3527, c0762M31299);
                return (C4805) c4838M108002.m2947();
            default:
                C4825 c4825M10736 = C4789.m10736();
                byte[] bArrM501810 = AbstractC1465.m5018(((C4844) abstractC0758).m10901());
                C0762 c0762M312910 = AbstractC0748.m3129(bArrM501810, 0, bArrM501810.length);
                c4825M10736.m2948();
                C4789.m10739((C4789) c4825M10736.f3527, c0762M312910);
                ((C1078) abstractC1524).getClass();
                c4825M10736.m2948();
                C4789.m10738((C4789) c4825M10736.f3527);
                return (C4789) c4825M10736.m2947();
        }
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public final AbstractC0758 m4119(AbstractC0748 abstractC0748) {
        switch (this.f4655) {
            case 0:
                return C4793.m10754(abstractC0748, C0747.m3127());
            case 1:
                return C4828.m10859(abstractC0748, C0747.m3127());
            case 2:
                return C4841.m10883(abstractC0748, C0747.m3127());
            case 3:
                return C4842.m10890(abstractC0748, C0747.m3127());
            case 4:
                return C4803.m10790(abstractC0748, C0747.m3127());
            case 5:
                return C4849.m10909(abstractC0748, C0747.m3127());
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return C4806.m10809(abstractC0748, C0747.m3127());
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return C4850.m10910(abstractC0748, C0747.m3127());
            case 8:
                return C4790.m10743(abstractC0748, C0747.m3127());
            case 9:
                return C4779.m10708(abstractC0748, C0747.m3127());
            default:
                return C4844.m10900(abstractC0748, C0747.m3127());
        }
    }
}
