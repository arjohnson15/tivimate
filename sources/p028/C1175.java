package p028;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Mac;
import net.lingala.zip4j.exception.ZipException;
import p223.AbstractC2978;
import p298.C3499;
import p298.C3500;
import p367.C4175;
import p367.InterfaceC4174;
import p383.C4456;
import ˆʽ.ᵎˏ;
import ᴵﹳ.ٴˎ;

/* renamed from: ʼˋ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1175 extends AbstractC1168 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f4859;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public byte[] f4860;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f4861;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f4862;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public int f4863;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public byte[] f4864;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f4865;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f4866;

    @Override // p028.AbstractC1168, java.io.InputStream
    public final int read() {
        byte[] bArr = this.f4860;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // p028.AbstractC1168, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // p028.AbstractC1168, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        this.f4862 = i2;
        this.f4863 = i;
        this.f4866 = 0;
        if (this.f4861 != 0) {
            m4230(i, bArr);
            int i3 = this.f4866;
            if (i3 == i2) {
                return i3;
            }
        }
        if (this.f4862 < 16) {
            byte[] bArr2 = this.f4864;
            int i4 = super.read(bArr2, 0, bArr2.length);
            this.f4865 = 0;
            if (i4 == -1) {
                this.f4861 = 0;
                int i5 = this.f4866;
                if (i5 > 0) {
                    return i5;
                }
                return -1;
            }
            this.f4861 = i4;
            m4230(this.f4863, bArr);
            int i6 = this.f4866;
            if (i6 == i2) {
                return i6;
            }
        }
        int i7 = this.f4863;
        int i8 = this.f4862;
        int i9 = super.read(bArr, i7, i8 - (i8 % 16));
        if (i9 != -1) {
            return i9 + this.f4866;
        }
        int i10 = this.f4866;
        if (i10 > 0) {
            return i10;
        }
        return -1;
    }

    @Override // p028.AbstractC1168
    /* renamed from: ʽᐧ */
    public final InterfaceC4174 mo4222(C3500 c3500, char[] cArr, boolean z) throws IOException, InvalidKeyException {
        C3499 c3499 = c3500.f13504;
        if (c3499 == null) {
            throw new IOException("invalid aes extra data record");
        }
        int i = c3499.f13554;
        if (i == 0) {
            throw new IOException("Invalid aes key strength in aes extra data record");
        }
        byte[] bArr = new byte[ᵎˏ.ˏᵢ(i)];
        m4223(bArr);
        byte[] bArr2 = new byte[2];
        m4223(bArr2);
        C4175 c4175 = new C4175();
        c4175.f16118 = 1;
        c4175.f16119 = new byte[16];
        c4175.f16117 = new byte[16];
        if (cArr == null || cArr.length <= 0) {
            throw new ZipException("empty or null password provided for AES decryption");
        }
        int i2 = c3499.f13554;
        byte[] bArr3 = ٴˎ.ٴˎ(bArr, cArr, i2, z);
        byte[] bArr4 = new byte[2];
        System.arraycopy(bArr3, ᵎˏ.ٴˎ(i2) + ᵎˏ.ʿʼ(i2), bArr4, 0, 2);
        if (!Arrays.equals(bArr2, bArr4)) {
            throw new ZipException("Wrong Password");
        }
        c4175.f16120 = ٴˎ.ᐧʻ(i2, bArr3);
        int i3 = ᵎˏ.ٴˎ(i2);
        byte[] bArr5 = new byte[i3];
        System.arraycopy(bArr3, ᵎˏ.ʿʼ(i2), bArr5, 0, i3);
        C4456 c4456 = new C4456("HmacSHA1");
        c4456.m10071(bArr5);
        c4175.f16116 = c4456;
        return c4175;
    }

    @Override // p028.AbstractC1168
    /* renamed from: ـﹶ */
    public final void mo4224(PushbackInputStream pushbackInputStream, int i) throws IllegalStateException, IOException {
        byte[] bArr = new byte[10];
        if (AbstractC2978.m7358(pushbackInputStream, bArr) != 10) {
            throw new ZipException("Invalid AES Mac bytes. Could not read sufficient data");
        }
        C4456 c4456 = ((C4175) this.f4832).f16116;
        if (((ByteArrayOutputStream) c4456.f17162).size() > 0) {
            c4456.m10072(i);
        }
        byte[] bArr2 = new byte[10];
        System.arraycopy(((Mac) c4456.f17163).doFinal(), 0, bArr2, 0, 10);
        if (!Arrays.equals(bArr, bArr2)) {
            throw new IOException("Reached end of data for this entry, but aes verification failed");
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m4230(int i, byte[] bArr) {
        int i2 = this.f4862;
        int i3 = this.f4861;
        if (i2 >= i3) {
            i2 = i3;
        }
        this.f4859 = i2;
        System.arraycopy(this.f4864, this.f4865, bArr, i, i2);
        int i4 = this.f4859;
        int i5 = this.f4865 + i4;
        this.f4865 = i5;
        if (i5 >= 15) {
            this.f4865 = 15;
        }
        int i6 = this.f4861 - i4;
        this.f4861 = i6;
        if (i6 <= 0) {
            this.f4861 = 0;
        }
        this.f4866 += i4;
        this.f4862 -= i4;
        this.f4863 += i4;
    }
}
