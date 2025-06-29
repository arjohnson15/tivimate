package p313;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import p115.InterfaceC1830;
import ᵎﹳ.ᐧʻ;

/* renamed from: ᐧᵎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3590 implements InterfaceC1830 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SecretKey f13808;

    public C3590(String str, KeyStore keyStore) throws InvalidKeyException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f13808 = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(ᐧʻ.ﾞˊ("Keystore cannot load the key with ID: ", str));
        }
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ʽᐧ */
    public final byte[] mo4121(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, InterruptedException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        try {
            return m8495(bArr, bArr2);
        } catch (ProviderException e) {
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return m8495(bArr, bArr2);
        } catch (AEADBadTagException e2) {
            throw e2;
        } catch (GeneralSecurityException e3) {
            Thread.sleep((int) (Math.random() * 100.0d));
            return m8495(bArr, bArr2);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final byte[] m8495(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f13808, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ـﹶ */
    public final byte[] mo4122(byte[] bArr, byte[] bArr2) throws InterruptedException {
        try {
            return m8496(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return m8496(bArr, bArr2);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final byte[] m8496(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.f13808);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }
}
