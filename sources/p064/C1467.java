package p064;

import android.support.v4.media.session.AbstractC0002;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import p026.C1160;
import p115.InterfaceC1830;
import p241.C3102;
import p241.C3105;
import p447.AbstractC5179;

/* renamed from: ʾᵎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1467 implements InterfaceC1830 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f5986;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5987;

    public C1467(int i, byte[] bArr) throws GeneralSecurityException {
        this.f5987 = i;
        switch (i) {
            case 1:
                this.f5986 = new C3105(0, bArr);
                return;
            case 2:
                this.f5986 = new C3105(1, bArr);
                return;
            default:
                if (!AbstractC0002.m45(2)) {
                    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                }
                this.f5986 = new C3102(bArr);
                return;
        }
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ʽᐧ */
    public final byte[] mo4121(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f5987) {
            case 0:
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
                C3102 c3102 = (C3102) this.f5986;
                c3102.getClass();
                if (bArrCopyOf.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                boolean z = c3102.f11986;
                if (bArr.length < (z ? 28 : 16)) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (z && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec algorithmParameterSpecM7615 = C3102.m7615(bArrCopyOf);
                C1160 c1160 = C3102.f11985;
                ((Cipher) c1160.get()).init(2, c3102.f11987, algorithmParameterSpecM7615);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) c1160.get()).updateAAD(bArr2);
                }
                int i = z ? 12 : 0;
                int length = bArr.length;
                if (z) {
                    length -= 12;
                }
                return ((Cipher) c1160.get()).doFinal(bArr, i, length);
            case 1:
                if (bArr.length < 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((C3105) this.f5986).m7416(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
            default:
                if (bArr.length < 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((C3105) this.f5986).m7416(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ـﹶ */
    public final byte[] mo4122(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f5987) {
            case 0:
                byte[] bArrM5018 = AbstractC1465.m5018(12);
                C3102 c3102 = (C3102) this.f5986;
                c3102.getClass();
                if (bArrM5018.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                if (bArr.length > 2147483619) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                boolean z = c3102.f11986;
                byte[] bArr3 = new byte[z ? bArr.length + 28 : bArr.length + 16];
                if (z) {
                    System.arraycopy(bArrM5018, 0, bArr3, 0, 12);
                }
                AlgorithmParameterSpec algorithmParameterSpecM7615 = C3102.m7615(bArrM5018);
                C1160 c1160 = C3102.f11985;
                ((Cipher) c1160.get()).init(1, c3102.f11987, algorithmParameterSpecM7615);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) c1160.get()).updateAAD(bArr2);
                }
                int iDoFinal = ((Cipher) c1160.get()).doFinal(bArr, 0, bArr.length, bArr3, z ? 12 : 0);
                if (iDoFinal == bArr.length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(AbstractC5179.m11548(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
            case 1:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrM50182 = AbstractC1465.m5018(12);
                byteBufferAllocate.put(bArrM50182);
                ((C3105) this.f5986).m7421(byteBufferAllocate, bArrM50182, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrM50183 = AbstractC1465.m5018(24);
                byteBufferAllocate2.put(bArrM50183);
                ((C3105) this.f5986).m7421(byteBufferAllocate2, bArrM50183, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }
}
