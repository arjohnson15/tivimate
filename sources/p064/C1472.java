package p064;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import p115.InterfaceC1822;
import p358.InterfaceC4073;

/* renamed from: ʾᵎ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1472 implements InterfaceC1822 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f5996;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC4073 f5997;

    public C1472(InterfaceC4073 interfaceC4073, int i) throws InvalidAlgorithmParameterException {
        this.f5997 = interfaceC4073;
        this.f5996 = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        interfaceC4073.mo8035(i, new byte[0]);
    }

    @Override // p115.InterfaceC1822
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] mo5026(byte[] bArr) {
        return this.f5997.mo8035(this.f5996, bArr);
    }

    @Override // p115.InterfaceC1822
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo5027(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(mo5026(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
