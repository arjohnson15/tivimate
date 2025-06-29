package p064;

import android.support.v4.media.session.AbstractC0002;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p026.C1160;
import p115.InterfaceC1830;

/* renamed from: ʾᵎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1459 implements InterfaceC1830 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C1160 f5971 = new C1160(2);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C1160 f5972 = new C1160(3);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] f5973;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final SecretKeySpec f5974;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] f5975;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f5976;

    public C1459(int i, byte[] bArr) throws GeneralSecurityException {
        if (!AbstractC0002.m34(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f5976 = i;
        AbstractC1468.m5022(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f5974 = secretKeySpec;
        Cipher cipher = (Cipher) f5971.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrM5015 = m5015(cipher.doFinal(new byte[16]));
        this.f5975 = bArrM5015;
        this.f5973 = m5015(bArrM5015);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static byte[] m5014(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static byte[] m5015(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ʽᐧ */
    public final byte[] mo4121(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f5976;
        int i2 = (length - i) - 16;
        if (i2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f5971.get();
        SecretKeySpec secretKeySpec = this.f5974;
        cipher.init(1, secretKeySpec);
        byte[] bArrM5016 = m5016(cipher, 0, bArr, 0, this.f5976);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM50162 = m5016(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrM50163 = m5016(cipher, 2, bArr, this.f5976, i2);
        int length2 = bArr.length - 16;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[length2 + i3] ^ bArrM50162[i3]) ^ bArrM5016[i3]) ^ bArrM50163[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f5972.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrM5016));
        return cipher2.doFinal(bArr, i, i2);
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ـﹶ */
    public final byte[] mo4122(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f5976;
        if (length > 2147483631 - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i + 16];
        byte[] bArrM5018 = AbstractC1465.m5018(i);
        System.arraycopy(bArrM5018, 0, bArr3, 0, i);
        Cipher cipher = (Cipher) f5971.get();
        SecretKeySpec secretKeySpec = this.f5974;
        cipher.init(1, secretKeySpec);
        byte[] bArrM5016 = m5016(cipher, 0, bArrM5018, 0, bArrM5018.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM50162 = m5016(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f5972.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrM5016));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f5976);
        byte[] bArrM50163 = m5016(cipher, 2, bArr3, this.f5976, bArr.length);
        int length2 = bArr.length + i;
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[length2 + i2] = (byte) ((bArrM50162[i2] ^ bArrM5016[i2]) ^ bArrM50163[i2]);
        }
        return bArr3;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final byte[] m5016(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.f5975;
        if (i3 == 0) {
            return cipher.doFinal(m5014(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArrDoFinal[i5] = (byte) (bArrDoFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i4 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = m5014(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = Arrays.copyOf(this.f5973, 16);
            for (int i6 = 0; i6 < bArrCopyOfRange.length; i6++) {
                bArrCopyOf[i6] = (byte) (bArrCopyOf[i6] ^ bArrCopyOfRange[i6]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        }
        return cipher.doFinal(m5014(bArrDoFinal, bArrCopyOf));
    }
}
