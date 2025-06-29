package p372;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p000.C0876;
import p000.C0882;
import p000.InterfaceC0875;
import p000.InterfaceC0880;

/* renamed from: ᵢˆ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4229 implements InterfaceC0875 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final byte[] f16372;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final byte[] f16373;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public CipherInputStream f16374;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC0875 f16375;

    public C4229(InterfaceC0875 interfaceC0875, byte[] bArr, byte[] bArr2) {
        this.f16375 = interfaceC0875;
        this.f16372 = bArr;
        this.f16373 = bArr2;
    }

    @Override // p000.InterfaceC0875
    public final void close() {
        if (this.f16374 != null) {
            this.f16374 = null;
            this.f16375.close();
        }
    }

    @Override // p166.InterfaceC2442
    /* renamed from: ˆʿ */
    public final int mo3679(byte[] bArr, int i, int i2) throws IOException {
        this.f16374.getClass();
        int i3 = this.f16374.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˉי */
    public final Map mo3674() {
        return this.f16375.mo3674();
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˏᴵ */
    public final long mo3680(C0882 c0882) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f16372, "AES"), new IvParameterSpec(this.f16373));
                C0876 c0876 = new C0876(this.f16375, c0882);
                this.f16374 = new CipherInputStream(c0876, cipher);
                c0876.m3690();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ˑי */
    public final Uri mo3681() {
        return this.f16375.mo3681();
    }

    @Override // p000.InterfaceC0875
    /* renamed from: ﹶˆ */
    public final void mo3678(InterfaceC0880 interfaceC0880) {
        interfaceC0880.getClass();
        this.f16375.mo3678(interfaceC0880);
    }
}
