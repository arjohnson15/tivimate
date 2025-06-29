package p026;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import p064.C1461;
import p158.AbstractC2339;
import p334.C3789;

/* renamed from: ʼˉ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1160 extends ThreadLocal {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4817;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f4817) {
            case 0:
                return 0L;
            case 1:
                try {
                    return (Cipher) C1461.f5979.f5981.mo5019("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 2:
                try {
                    return (Cipher) C1461.f5979.f5981.mo5019("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case 3:
                try {
                    return (Cipher) C1461.f5979.f5981.mo5019("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 4:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 5:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC2339.f9299);
                return simpleDateFormat;
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                try {
                    return (Cipher) C1461.f5979.f5981.mo5019("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return new char[1024];
            case 8:
                try {
                    return (Cipher) C1461.f5979.f5981.mo5019("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            default:
                return new Random();
        }
    }
}
