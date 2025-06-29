package p154;

import com.hierynomus.ntlm.NtlmException;
import com.hierynomus.security.SecurityException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import p180.AbstractC2497;
import p332.C3776;
import p409.InterfaceC4674;
import p409.InterfaceC4675;

/* renamed from: ˊˊ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2328 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final /* synthetic */ int f9238 = 0;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC4674 f9239;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SecureRandom f9240;

    static {
        Charset charset = AbstractC2497.f9930;
    }

    public C2328(SecureRandom secureRandom, InterfaceC4674 interfaceC4674) {
        this.f9240 = secureRandom;
        this.f9239 = interfaceC4674;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] m6414(byte[] bArr, byte[]... bArr2) {
        try {
            InterfaceC4675 interfaceC4675M10574 = this.f9239.m10574("HmacMD5");
            interfaceC4675M10574.mo6780(bArr);
            for (byte[] bArr3 : bArr2) {
                interfaceC4675M10574.mo6778(bArr3);
            }
            return interfaceC4675M10574.mo6781();
        } catch (SecurityException e) {
            throw new NtlmException(e);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] m6415(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.f9240.nextBytes(bArr2);
        long jConvert = (TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) / 100) + 116444736000000000L;
        if (bArr == null) {
            bArr = new byte[0];
        }
        C3776 c3776 = new C3776();
        c3776.mo6214((byte) 1);
        c3776.mo6214((byte) 1);
        c3776.m8847(0);
        c3776.m8844(0L);
        c3776.f14613.m8856(c3776, jConvert);
        c3776.mo6213(8, bArr2);
        c3776.m8844(0L);
        c3776.mo6213(bArr.length, bArr);
        c3776.m8844(0L);
        return c3776.m8838();
    }
}
