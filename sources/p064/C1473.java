package p064;

import android.support.v4.media.session.AbstractC0001;
import android.support.v4.media.session.AbstractC0002;
import com.bumptech.glide.ﹳﹳ;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p115.InterfaceC1828;
import p266.C3262;
import p447.AbstractC5179;

/* renamed from: ʾᵎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1473 implements InterfaceC1828 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] f6001;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3262 f6002;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final List f5999 = Arrays.asList(64);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final byte[] f6000 = new byte[16];

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final byte[] f5998 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    public C1473(byte[] bArr) throws GeneralSecurityException {
        if (!AbstractC0002.m34(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!f5999.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(AbstractC5179.m11550(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f6001 = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f6002 = new C3262(bArrCopyOfRange);
    }

    @Override // p115.InterfaceC1828
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] mo5028(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) C1461.f5979.f5981.mo5019("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.f6001, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, m5029(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final byte[] m5029(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrM23;
        int length = bArr.length;
        C3262 c3262 = this.f6002;
        if (length == 0) {
            return c3262.mo8035(16, f5998);
        }
        byte[] bArrMo8035 = c3262.mo8035(16, f6000);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrMo8035 = AbstractC0001.m23(ﹳﹳ.ˋⁱ(bArrMo8035), c3262.mo8035(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrMo8035.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - bArrMo8035.length;
            bArrM23 = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < bArrMo8035.length; i2++) {
                int i3 = length2 + i2;
                bArrM23[i3] = (byte) (bArrM23[i3] ^ bArrMo8035[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = Byte.MIN_VALUE;
            bArrM23 = AbstractC0001.m23(bArrCopyOf, ﹳﹳ.ˋⁱ(bArrMo8035));
        }
        return c3262.mo8035(16, bArrM23);
    }

    @Override // p115.InterfaceC1828
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] mo5030(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) C1461.f5979.f5981.mo5019("AES/CTR/NoPadding");
        byte[] bArrM5029 = m5029(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrM5029.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.f6001, "AES"), new IvParameterSpec(bArr3));
        return AbstractC0001.m11(bArrM5029, cipher.doFinal(bArr));
    }
}
