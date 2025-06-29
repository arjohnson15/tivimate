package p088;

import com.hierynomus.security.SecurityException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import p017.AbstractC1094;
import p120.C1865;
import p224.C2981;
import p224.C2982;

/* renamed from: ʿᵢ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1739 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f6747;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f6748;

    public /* synthetic */ C1739(int i) {
        this.f6748 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5459(byte[] bArr) throws InvalidKeyException, SecurityException {
        switch (this.f6748) {
            case 0:
                Cipher cipher = (Cipher) this.f6747;
                try {
                    cipher.init(1, new SecretKeySpec(bArr, cipher.getAlgorithm().split("/")[0]));
                    return;
                } catch (InvalidKeyException e) {
                    throw new SecurityException(e);
                }
            case 1:
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, length);
                if (AbstractC1094.m4124(0, bArr)) {
                    throw new IllegalArgumentException("attempt to create weak DES key");
                }
                int length2 = bArr.length;
                for (int i = 0; i < length2; i += 8) {
                    if (AbstractC1094.m4124(i, bArr)) {
                        throw new IllegalArgumentException("attempt to create weak DESede key");
                    }
                }
                C1865 c1865 = (C1865) this.f6747;
                c1865.getClass();
                c1865.m5629();
                C2982 c2982 = (C2982) c1865.f7123;
                c2982.getClass();
                if (length > 8) {
                    throw new IllegalArgumentException("DES key too long - should be 8 bytes");
                }
                int[] iArr = new int[32];
                boolean[] zArr = new boolean[56];
                boolean[] zArr2 = new boolean[56];
                for (int i2 = 0; i2 < 56; i2++) {
                    byte b = C2982.f11473[i2];
                    zArr[i2] = (C2982.f11462[b & 7] & bArr2[b >>> 3]) != 0;
                }
                for (int i3 = 0; i3 < 16; i3++) {
                    int i4 = i3 << 1;
                    int i5 = i4 + 1;
                    iArr[i5] = 0;
                    iArr[i4] = 0;
                    int i6 = 0;
                    while (true) {
                        byte[] bArr3 = C2982.f11463;
                        if (i6 < 28) {
                            int i7 = bArr3[i3] + i6;
                            if (i7 < 28) {
                                zArr2[i6] = zArr[i7];
                            } else {
                                zArr2[i6] = zArr[i7 - 28];
                            }
                            i6++;
                        } else {
                            for (int i8 = 28; i8 < 56; i8++) {
                                int i9 = bArr3[i3] + i8;
                                if (i9 < 56) {
                                    zArr2[i8] = zArr[i9];
                                } else {
                                    zArr2[i8] = zArr[i9 - 28];
                                }
                            }
                            for (int i10 = 0; i10 < 24; i10++) {
                                byte[] bArr4 = C2982.f11470;
                                boolean z = zArr2[bArr4[i10]];
                                int[] iArr2 = C2982.f11469;
                                if (z) {
                                    iArr[i4] = iArr[i4] | iArr2[i10];
                                }
                                if (zArr2[bArr4[i10 + 24]]) {
                                    iArr[i5] = iArr[i5] | iArr2[i10];
                                }
                            }
                        }
                    }
                }
                for (int i11 = 0; i11 != 32; i11 += 2) {
                    int i12 = iArr[i11];
                    int i13 = i11 + 1;
                    int i14 = iArr[i13];
                    iArr[i11] = ((16515072 & i14) >>> 10) | ((i12 & 16515072) << 6) | ((i12 & 4032) << 10) | ((i14 & 4032) >>> 6);
                    iArr[i13] = ((i12 & 63) << 16) | ((i12 & 258048) << 12) | ((258048 & i14) >>> 4) | (i14 & 63);
                }
                c2982.f11475 = iArr;
                return;
            default:
                int length3 = bArr.length;
                byte[] bArr5 = new byte[length3];
                System.arraycopy(bArr, 0, bArr5, 0, length3);
                C2981 c2981 = (C2981) this.f6747;
                c2981.getClass();
                c2981.f11461 = bArr5;
                c2981.m7404(bArr5);
                return;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m5460(byte[] bArr, int i, byte[] bArr2) throws SecurityException {
        int i2;
        switch (this.f6748) {
            case 0:
                try {
                    return ((Cipher) this.f6747).update(bArr, 0, i, bArr2, 0);
                } catch (ShortBufferException e) {
                    throw new SecurityException(e);
                }
            case 1:
                C1865 c1865 = (C1865) this.f6747;
                if (i < 0) {
                    c1865.getClass();
                    throw new IllegalArgumentException("Can't have a negative input length!");
                }
                C2982 c2982 = (C2982) c1865.f7123;
                c2982.getClass();
                int i3 = c1865.f7122;
                int i4 = i + i3;
                byte[] bArr3 = (byte[]) c1865.f7126;
                int length = i4 - (i4 % bArr3.length);
                if (length > 0 && length > bArr2.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                int length2 = bArr3.length - i3;
                if (i > length2) {
                    System.arraycopy(bArr, 0, bArr3, i3, length2);
                    c2982.m7405(0, 0, bArr3, bArr2);
                    c1865.f7122 = 0;
                    i -= length2;
                    i2 = 8;
                    while (i > bArr3.length) {
                        c2982.m7405(length2, i2, bArr, bArr2);
                        i2 += 8;
                        i -= 8;
                        length2 += 8;
                    }
                } else {
                    i2 = 0;
                    length2 = 0;
                }
                System.arraycopy(bArr, length2, bArr3, c1865.f7122, i);
                int i5 = c1865.f7122 + i;
                c1865.f7122 = i5;
                if (i5 != bArr3.length) {
                    return i2;
                }
                c2982.m7405(0, i2, bArr3, bArr2);
                int i6 = i2 + 8;
                c1865.f7122 = 0;
                return i6;
            default:
                C2981 c2981 = (C2981) this.f6747;
                c2981.getClass();
                if (i > bArr.length) {
                    throw new DataLengthException("input buffer too short");
                }
                if (i > bArr2.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                for (int i7 = 0; i7 < i; i7++) {
                    int i8 = (c2981.f11458 + 1) & 255;
                    c2981.f11458 = i8;
                    byte[] bArr4 = c2981.f11460;
                    byte b = bArr4[i8];
                    int i9 = (c2981.f11459 + b) & 255;
                    c2981.f11459 = i9;
                    bArr4[i8] = bArr4[i9];
                    bArr4[i9] = b;
                    bArr2[i7] = (byte) (bArr4[(bArr4[i8] + b) & 255] ^ bArr[i7]);
                }
                return i;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m5461(int i, byte[] bArr) throws SecurityException {
        switch (this.f6748) {
            case 0:
                try {
                    return ((Cipher) this.f6747).doFinal(bArr, i);
                } catch (BadPaddingException | IllegalBlockSizeException | ShortBufferException e) {
                    throw new SecurityException(e);
                }
            case 1:
                try {
                    return ((C1865) this.f6747).m5628(i, bArr);
                } catch (InvalidCipherTextException e2) {
                    throw new SecurityException(e2);
                }
            default:
                C2981 c2981 = (C2981) this.f6747;
                c2981.m7404(c2981.f11461);
                return 0;
        }
    }
}
