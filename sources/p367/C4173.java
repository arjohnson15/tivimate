package p367;

import java.security.InvalidKeyException;
import java.security.SecureRandom;
import net.lingala.zip4j.exception.ZipException;
import p235.C3089;
import p383.C4456;
import ˆʽ.ᵎˏ;
import ᴵﹳ.ٴˎ;

/* renamed from: ᵢ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4173 implements InterfaceC4176 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4456 f16106;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final byte[] f16108;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final byte[] f16110;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f16111;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3089 f16112;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final byte[] f16113;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final byte[] f16115;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final SecureRandom f16109 = new SecureRandom();

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f16107 = 1;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f16114 = 0;

    public C4173(char[] cArr, int i, boolean z) throws ZipException, InvalidKeyException {
        if (cArr == null || cArr.length == 0) {
            throw new ZipException("input password is empty or null");
        }
        if (i != 1 && i != 3) {
            throw new ZipException("Invalid AES key strength");
        }
        this.f16111 = false;
        this.f16108 = new byte[16];
        this.f16115 = new byte[16];
        int i2 = ᵎˏ.ˏᵢ(i);
        if (i2 != 8 && i2 != 16) {
            throw new ZipException("invalid salt size, cannot generate salt");
        }
        int i3 = i2 == 8 ? 2 : 4;
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i3; i4++) {
            int iNextInt = this.f16109.nextInt();
            int i5 = i4 * 4;
            bArr[i5] = (byte) (iNextInt >> 24);
            bArr[i5 + 1] = (byte) (iNextInt >> 16);
            bArr[i5 + 2] = (byte) (iNextInt >> 8);
            bArr[i5 + 3] = (byte) iNextInt;
        }
        this.f16113 = bArr;
        byte[] bArr2 = ٴˎ.ٴˎ(bArr, cArr, i, z);
        byte[] bArr3 = new byte[2];
        System.arraycopy(bArr2, ᵎˏ.ٴˎ(i) + ᵎˏ.ʿʼ(i), bArr3, 0, 2);
        this.f16110 = bArr3;
        this.f16112 = ٴˎ.ᐧʻ(i, bArr2);
        int i6 = ᵎˏ.ٴˎ(i);
        byte[] bArr4 = new byte[i6];
        System.arraycopy(bArr2, ᵎˏ.ʿʼ(i), bArr4, 0, i6);
        C4456 c4456 = new C4456("HmacSHA1");
        c4456.m10071(bArr4);
        this.f16106 = c4456;
    }

    @Override // p367.InterfaceC4176
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final int mo9590(byte[] bArr, int i, int i2) throws ZipException {
        int i3;
        if (this.f16111) {
            throw new ZipException("AES Encrypter is in finished state (A non 16 byte block has already been passed to encrypter)");
        }
        if (i2 % 16 != 0) {
            this.f16111 = true;
        }
        int i4 = i;
        while (true) {
            int i5 = i + i2;
            if (i4 >= i5) {
                return i2;
            }
            int i6 = i4 + 16;
            this.f16114 = i6 <= i5 ? 16 : i5 - i4;
            int i7 = this.f16107;
            byte[] bArr2 = this.f16115;
            ٴˎ.ᴵʿ(i7, bArr2);
            C3089 c3089 = this.f16112;
            byte[] bArr3 = this.f16108;
            c3089.m7594(bArr2, bArr3);
            int i8 = 0;
            while (true) {
                i3 = this.f16114;
                if (i8 < i3) {
                    int i9 = i4 + i8;
                    bArr[i9] = (byte) (bArr[i9] ^ bArr3[i8]);
                    i8++;
                }
            }
            this.f16106.m10070(bArr, i4, i3);
            this.f16107++;
            i4 = i6;
        }
    }
}
