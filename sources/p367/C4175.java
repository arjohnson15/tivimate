package p367;

import net.lingala.zip4j.exception.ZipException;
import p235.C3089;
import p383.C4456;
import ᴵﹳ.ٴˎ;

/* renamed from: ᵢ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4175 implements InterfaceC4174 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C4456 f16116;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public byte[] f16117;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f16118;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public byte[] f16119;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C3089 f16120;

    @Override // p367.InterfaceC4174
    /* renamed from: ᵎـ */
    public final int mo9591(byte[] bArr, int i, int i2) throws ZipException {
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                return i2;
            }
            int i5 = i3 + 16;
            int i6 = i5 <= i4 ? 16 : i4 - i3;
            this.f16116.m10070(bArr, i3, i6);
            int i7 = this.f16118;
            byte[] bArr2 = this.f16119;
            ٴˎ.ᴵʿ(i7, bArr2);
            C3089 c3089 = this.f16120;
            byte[] bArr3 = this.f16117;
            c3089.m7594(bArr2, bArr3);
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = i3 + i8;
                bArr[i9] = (byte) (bArr[i9] ^ bArr3[i8]);
            }
            this.f16118++;
            i3 = i5;
        }
    }
}
