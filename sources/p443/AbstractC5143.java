package p443;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import p181.C2511;

/* renamed from: ﾞʿ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5143 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m11448(KeyGenParameterSpec keyGenParameterSpec) {
        return keyGenParameterSpec.getKeystoreAlias();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2511 m11449(ᐧʻ r5) {
        int i = r5.ˆʿ;
        if (i == 0 && ((KeyGenParameterSpec) r5.ᐧˋ) == null) {
            throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
        }
        if (i == 1) {
            r5.ᐧˋ = new KeyGenParameterSpec.Builder((String) r5.ˎˑ, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        }
        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) r5.ᐧˋ;
        if (keyGenParameterSpec == null) {
            throw new NullPointerException("KeyGenParameterSpec was null after build() check");
        }
        Object obj = AbstractC5145.f19669;
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        }
        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
        synchronized (AbstractC5145.f19669) {
            String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpec);
                    keyGenerator.generateKey();
                } catch (ProviderException e) {
                    throw new GeneralSecurityException(e.getMessage(), e);
                }
            }
        }
        return new C2511((KeyGenParameterSpec) r5.ᐧˋ, keyGenParameterSpec.getKeystoreAlias());
    }
}
