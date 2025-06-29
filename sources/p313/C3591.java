package p313;

import android.os.Build;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import p064.AbstractC1465;
import p064.AbstractC1468;
import p220.AbstractC2850;

/* renamed from: ᐧᵎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3591 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Object f13809 = new Object();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public KeyStore f13810;

    public C3591() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (Build.VERSION.SDK_INT < 23) {
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f13810 = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m8497(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strM5020 = AbstractC1468.m5020(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(AbstractC2850.m7145(strM5020).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m8498(String str) {
        C3591 c3591 = new C3591();
        synchronized (f13809) {
            try {
                if (c3591.m8500(str)) {
                    return false;
                }
                m8497(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized C3590 m8499(String str) {
        C3590 c3590;
        c3590 = new C3590(AbstractC1468.m5020(str), this.f13810);
        byte[] bArrM5018 = AbstractC1465.m5018(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrM5018, c3590.mo4121(c3590.mo4122(bArrM5018, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return c3590;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized boolean m8500(String str) {
        String strM5020;
        strM5020 = AbstractC1468.m5020(str);
        try {
        } catch (NullPointerException unused) {
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f13810 = keyStore;
                keyStore.load(null);
                return this.f13810.containsAlias(strM5020);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            }
        }
        return this.f13810.containsAlias(strM5020);
    }
}
