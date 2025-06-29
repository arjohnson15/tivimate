package p241;

import android.os.Build;
import android.support.v4.media.session.AbstractC0002;
import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p026.C1160;
import p064.AbstractC1468;
import p375.AbstractC4315;

/* renamed from: ˑﹳ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3102 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1160 f11985 = new C1160(8);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f11986;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SecretKeySpec f11987;

    public C3102(byte[] bArr) throws GeneralSecurityException {
        if (!AbstractC0002.m45(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC1468.m5022(bArr.length);
        this.f11987 = new SecretKeySpec(bArr, "AES");
        this.f11986 = true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static AlgorithmParameterSpec m7615(byte[] bArr) {
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i = AbstractC4315.f16768;
            Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
            if ((numValueOf != null ? numValueOf.intValue() : -1) <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }
}
