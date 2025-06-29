package p016;

import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.C0747;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.parse.Parse;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import p029.C1182;
import p033.C1213;
import p033.C1218;
import p115.AbstractC1820;
import p115.C1826;
import p122.AbstractC1920;
import p166.C2414;
import p183.InterfaceC2536;
import p260.C3222;
import p266.C3262;
import p310.C3580;
import p331.C3762;
import p375.C4305;
import p375.InterfaceC4298;
import p383.InterfaceC4461;
import p383.InterfaceC4472;
import p418.C4784;
import p418.C4804;
import p418.C4817;
import p418.C4826;
import p418.C4846;
import p418.EnumC4778;
import p450.InterfaceC5190;
import p450.InterfaceC5191;
import ʾי.ˑʽ;

/* renamed from: ʻᐧ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1072 implements InterfaceC4298, Parse.UserTokenCalculator, InterfaceC2536, InterfaceC5191, InterfaceC4461, InterfaceC4472 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4629;

    public /* synthetic */ C1072(int i) {
        this.f4629 = i;
    }

    public /* synthetic */ C1072(C1218 c1218, ExoPlaybackException exoPlaybackException) {
        this.f4629 = 22;
    }

    @Override // p183.InterfaceC2536
    public Object apply(Object obj) {
        C1182.f4886.getClass();
        return C3580.f13770.ˎٴ((AbstractC1920) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // p383.InterfaceC4461
    /* renamed from: ʽᐧ */
    public void mo4092(Object obj) {
        C1213 c1213 = (C1213) obj;
        switch (this.f4629) {
            case 8:
                c1213.getClass();
                break;
            case 9:
                c1213.getClass();
                break;
            case 10:
                c1213.getClass();
                break;
            case 11:
                c1213.getClass();
                break;
            case 12:
                c1213.getClass();
                break;
            case 13:
                c1213.getClass();
                break;
            case 14:
                c1213.getClass();
                break;
            case 15:
                c1213.getClass();
                break;
            case 16:
                c1213.getClass();
                break;
            case 17:
                c1213.getClass();
                break;
            case 18:
                c1213.getClass();
                break;
            case 19:
                c1213.getClass();
                break;
            case 20:
                c1213.getClass();
                break;
            case 21:
                c1213.getClass();
                break;
            case 22:
                c1213.getClass();
                break;
            case 23:
                c1213.getClass();
                break;
            case 24:
                c1213.getClass();
                break;
            case 25:
            default:
                c1213.getClass();
                break;
            case 26:
                c1213.getClass();
                break;
            case 27:
                c1213.getClass();
                break;
            case 28:
                c1213.getClass();
                break;
        }
    }

    @Override // p375.InterfaceC4298
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public AbstractC1820 mo4102(C4305 c4305) throws GeneralSecurityException {
        C1071 c1071;
        C1071 c10712;
        boolean z = false;
        C1826 c1826 = C1826.f7049;
        int i = 2;
        switch (this.f4629) {
            case 0:
                if (!((String) c4305.f16748).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    C4804 c4804M10792 = C4804.m10792((AbstractC0748) c4305.f16747, C0747.m3127());
                    if (c4804M10792.m10798() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C1071 c10713 = C1071.f4612;
                    int size = c4804M10792.m10799().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    int iM10779 = c4804M10792.m10797().m10779();
                    if (iM10779 != 12 && iM10779 != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iM10779)));
                    }
                    EnumC4778 enumC4778 = (EnumC4778) c4305.f16746;
                    int iOrdinal = enumC4778.ordinal();
                    if (iOrdinal == 1) {
                        c10713 = C1071.f4619;
                    } else if (iOrdinal == 2) {
                        c10713 = C1071.f4625;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC4778.m10704());
                        }
                        c10713 = C1071.f4625;
                    }
                    C1076 c1076 = new C1076(size, iM10779, 16, c10713);
                    C3222 c3222 = new C3222(i, z);
                    c3222.f12539 = null;
                    c3222.f12540 = null;
                    c3222.f12538 = c1076;
                    c3222.f12539 = ˑʽ.ᴵʿ(c4804M10792.m10799().m3130(), c1826);
                    c3222.f12540 = (Integer) c4305.f16749;
                    return c3222.m7933();
                } catch (InvalidProtocolBufferException unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 1:
                if (!((String) c4305.f16748).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    C4846 c4846M10903 = C4846.m10903((AbstractC0748) c4305.f16747, C0747.m3127());
                    if (c4846M10903.m10907() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C1071 c10714 = C1071.f4618;
                    int size2 = c4846M10903.m10906().size();
                    if (size2 != 16 && size2 != 24 && size2 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                    }
                    EnumC4778 enumC47782 = (EnumC4778) c4305.f16746;
                    int iOrdinal2 = enumC47782.ordinal();
                    if (iOrdinal2 == 1) {
                        c10714 = C1071.f4621;
                    } else if (iOrdinal2 == 2) {
                        c10714 = C1071.f4622;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC47782.m10704());
                        }
                        c10714 = C1071.f4622;
                    }
                    C1077 c1077 = new C1077(size2, 12, 16, c10714);
                    C3262 c3262 = new C3262();
                    c3262.f12724 = null;
                    c3262.f12725 = null;
                    c3262.f12726 = c1077;
                    c3262.f12724 = ˑʽ.ᴵʿ(c4846M10903.m10906().m3130(), c1826);
                    c3262.f12725 = (Integer) c4305.f16749;
                    return c3262.m8032();
                } catch (InvalidProtocolBufferException unused2) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 2:
                if (!((String) c4305.f16748).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    C4826 c4826M10851 = C4826.m10851((AbstractC0748) c4305.f16747, C0747.m3127());
                    if (c4826M10851.m10855() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C1071 c10715 = C1071.f4616;
                    int size3 = c4826M10851.m10854().size();
                    if (size3 != 16 && size3 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                    }
                    EnumC4778 enumC47783 = (EnumC4778) c4305.f16746;
                    int iOrdinal3 = enumC47783.ordinal();
                    if (iOrdinal3 == 1) {
                        c10715 = C1071.f4626;
                    } else if (iOrdinal3 == 2) {
                        c10715 = C1071.f4613;
                    } else if (iOrdinal3 != 3) {
                        if (iOrdinal3 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC47783.m10704());
                        }
                        c10715 = C1071.f4613;
                    }
                    C1075 c1075 = new C1075(size3, c10715);
                    C3762 c3762 = new C3762(i);
                    c3762.f14531 = null;
                    c3762.f14532 = null;
                    c3762.f14530 = c1075;
                    c3762.f14531 = ˑʽ.ᴵʿ(c4826M10851.m10854().m3130(), c1826);
                    c3762.f14532 = (Integer) c4305.f16749;
                    return c3762.m8790();
                } catch (InvalidProtocolBufferException unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 3:
                if (!((String) c4305.f16748).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    C4817 c4817M10831 = C4817.m10831((AbstractC0748) c4305.f16747, C0747.m3127());
                    if (c4817M10831.m10835() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    EnumC4778 enumC47784 = (EnumC4778) c4305.f16746;
                    int iOrdinal4 = enumC47784.ordinal();
                    if (iOrdinal4 == 1) {
                        c1071 = C1071.f4614;
                    } else if (iOrdinal4 == 2) {
                        c1071 = C1071.f4615;
                    } else if (iOrdinal4 == 3) {
                        c1071 = C1071.f4623;
                    } else {
                        if (iOrdinal4 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC47784.m10704());
                        }
                        c1071 = C1071.f4615;
                    }
                    return C1088.m4120(c1071, ˑʽ.ᴵʿ(c4817M10831.m10834().m3130(), c1826), (Integer) c4305.f16749);
                } catch (InvalidProtocolBufferException unused4) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            default:
                if (!((String) c4305.f16748).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    C4784 c4784M10731 = C4784.m10731((AbstractC0748) c4305.f16747, C0747.m3127());
                    if (c4784M10731.m10735() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    EnumC4778 enumC47785 = (EnumC4778) c4305.f16746;
                    int iOrdinal5 = enumC47785.ordinal();
                    if (iOrdinal5 == 1) {
                        c10712 = C1071.f4617;
                    } else if (iOrdinal5 == 2) {
                        c10712 = C1071.f4620;
                    } else if (iOrdinal5 == 3) {
                        c10712 = C1071.f4624;
                    } else {
                        if (iOrdinal5 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC47785.m10704());
                        }
                        c10712 = C1071.f4620;
                    }
                    return C1092.m4123(c10712, ˑʽ.ᴵʿ(c4784M10731.m10734().m3130(), c1826), (Integer) c4305.f16749);
                } catch (InvalidProtocolBufferException unused5) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // p383.InterfaceC4472
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public void mo4103(Object obj, C2414 c2414) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:254:0x04d5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:255:0x04d8. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0408  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m4104(java.lang.String r35, java.lang.String r36) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 3536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p016.C1072.m4104(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // p450.InterfaceC5191
    /* renamed from: ᐧʻ */
    public void mo4097(InterfaceC5190 interfaceC5190) {
    }
}
