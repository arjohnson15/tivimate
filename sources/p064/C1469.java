package p064;

import android.support.v4.media.session.AbstractC0002;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p026.C1160;

/* renamed from: ʾᵎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1469 implements InterfaceC1462 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C1160 f5988 = new C1160(1);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f5989;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f5990;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SecretKeySpec f5991;

    public C1469(int i, byte[] bArr) throws GeneralSecurityException {
        if (!AbstractC0002.m45(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC1468.m5022(bArr.length);
        this.f5991 = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f5988.get()).getBlockSize();
        this.f5990 = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f5989 = i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m5023(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f5988.get();
        byte[] bArr4 = new byte[this.f5990];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f5989);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f5991;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
