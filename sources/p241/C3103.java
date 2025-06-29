package p241;

import androidx.datastore.preferences.protobuf.AbstractC0080;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* renamed from: ˑﹳ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3103 extends AbstractC0080 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ int f11988;

    public C3103(byte[] bArr, int i, int i2) throws InvalidKeyException {
        this.f11988 = i2;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f507 = AbstractC3104.m7617(bArr);
        this.f508 = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˑʽ */
    public final int[] mo573(int[] iArr, int i) {
        switch (this.f11988) {
            case 0:
                if (iArr.length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f507;
                int[] iArr4 = AbstractC3104.f11989;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i;
                System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr5 = new int[16];
                int[] iArr6 = new int[16];
                int[] iArr7 = (int[]) this.f507;
                int[] iArr8 = AbstractC3104.f11989;
                System.arraycopy(iArr8, 0, iArr6, 0, iArr8.length);
                System.arraycopy(iArr7, 0, iArr6, iArr8.length, 8);
                iArr6[12] = iArr[0];
                iArr6[13] = iArr[1];
                iArr6[14] = iArr[2];
                iArr6[15] = iArr[3];
                AbstractC3104.m7616(iArr6);
                iArr6[4] = iArr6[12];
                iArr6[5] = iArr6[13];
                iArr6[6] = iArr6[14];
                iArr6[7] = iArr6[15];
                int[] iArrCopyOf = Arrays.copyOf(iArr6, 8);
                System.arraycopy(iArr8, 0, iArr5, 0, iArr8.length);
                System.arraycopy(iArrCopyOf, 0, iArr5, iArr8.length, 8);
                iArr5[12] = i;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﹶˆ */
    public final int mo576() {
        switch (this.f11988) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
