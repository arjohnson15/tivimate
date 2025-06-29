package p161;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p026.C1160;
import p064.AbstractC1465;
import p064.AbstractC1468;
import p115.InterfaceC1830;
import p447.AbstractC5179;

/* renamed from: ˊᐧ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2351 implements InterfaceC1830 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C1160 f9317 = new C1160(6);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SecretKeySpec f9318;

    public C2351(byte[] bArr) throws InvalidAlgorithmParameterException {
        AbstractC1468.m5022(bArr.length);
        this.f9318 = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static AlgorithmParameterSpec m6453(int i, byte[] bArr) throws GeneralSecurityException, ClassNotFoundException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ʽᐧ */
    public final byte[] mo4121(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecM6453 = m6453(12, bArr);
        C1160 c1160 = f9317;
        ((Cipher) c1160.get()).init(2, this.f9318, algorithmParameterSpecM6453);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c1160.get()).updateAAD(bArr2);
        }
        return ((Cipher) c1160.get()).doFinal(bArr, 12, bArr.length - 12);
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ـﹶ */
    public final byte[] mo4122(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrM5018 = AbstractC1465.m5018(12);
        System.arraycopy(bArrM5018, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecM6453 = m6453(bArrM5018.length, bArrM5018);
        C1160 c1160 = f9317;
        ((Cipher) c1160.get()).init(1, this.f9318, algorithmParameterSpecM6453);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c1160.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) c1160.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(AbstractC5179.m11548(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }
}
