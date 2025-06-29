package p064;

import android.support.v4.media.session.AbstractC0001;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p115.InterfaceC1822;
import p115.InterfaceC1830;
import ـˈ.ˉᵎ;

/* renamed from: ʾᵎ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1471 implements InterfaceC1830 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC1822 f5993;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f5994;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC1462 f5995;

    public C1471(InterfaceC1462 interfaceC1462, InterfaceC1822 interfaceC1822, int i) {
        this.f5995 = interfaceC1462;
        this.f5993 = interfaceC1822;
        this.f5994 = i;
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ʽᐧ */
    public final byte[] mo4121(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f5994;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f5993.mo5027(bArrCopyOfRange2, AbstractC0001.m11(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        C1469 c1469 = (C1469) this.f5995;
        c1469.getClass();
        int length2 = bArrCopyOfRange.length;
        int i2 = c1469.f5989;
        if (length2 < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i2);
        int length3 = bArrCopyOfRange.length;
        int i3 = c1469.f5989;
        byte[] bArr4 = new byte[length3 - i3];
        c1469.m5023(bArrCopyOfRange, i3, bArrCopyOfRange.length - i3, bArr4, 0, bArr3, false);
        return bArr4;
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ـﹶ */
    public final byte[] mo4122(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        C1469 c1469 = (C1469) this.f5995;
        c1469.getClass();
        int length = bArr.length;
        int i = c1469.f5989;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            throw new GeneralSecurityException(ˉᵎ.ˉⁱ("plaintext length can not exceed ", i2));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] bArrM5018 = AbstractC1465.m5018(i);
        System.arraycopy(bArrM5018, 0, bArr3, 0, i);
        c1469.m5023(bArr, 0, bArr.length, bArr3, c1469.f5989, bArrM5018, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return AbstractC0001.m11(bArr3, this.f5993.mo5026(AbstractC0001.m11(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
