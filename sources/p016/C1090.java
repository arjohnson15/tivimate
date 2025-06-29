package p016;

import android.support.v4.media.session.AbstractC0001;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import p115.AbstractC1820;
import p115.C1825;
import p115.InterfaceC1830;
import p260.C3222;
import p271.C3295;
import p375.AbstractC4308;
import p375.C4310;
import p375.C4311;
import ـˊ.ʿʼ;

/* renamed from: ʻᐧ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1090 implements InterfaceC1830 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ʿʼ f4665;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ʿʼ f4666;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3222 f4667;

    public C1090(C3222 c3222) throws GeneralSecurityException {
        this.f4667 = c3222;
        boolean zIsEmpty = ((C3295) c3222.f12540).f12833.isEmpty();
        ʿʼ r1 = AbstractC4308.f16754;
        if (zIsEmpty) {
            this.f4665 = r1;
            this.f4666 = r1;
            return;
        }
        C4310 c4310 = (C4310) C4311.f16757.f16759.get();
        c4310 = c4310 == null ? C4311.f16758 : c4310;
        AbstractC4308.m9801(c3222);
        c4310.getClass();
        this.f4665 = r1;
        this.f4666 = r1;
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] mo4121(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        C3222 c3222 = this.f4667;
        ʿʼ r2 = this.f4666;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = c3222.m7940(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrMo4121 = ((InterfaceC1830) ((C1825) it.next()).f7041).mo4121(bArrCopyOfRange, bArr2);
                    r2.getClass();
                    return bArrMo4121;
                } catch (GeneralSecurityException e) {
                    C1069.f4611.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it2 = c3222.m7940(AbstractC1820.f7037).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrMo41212 = ((InterfaceC1830) ((C1825) it2.next()).f7041).mo4121(bArr, bArr2);
                r2.getClass();
                return bArrMo41212;
            } catch (GeneralSecurityException unused) {
            }
        }
        r2.getClass();
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // p115.InterfaceC1830
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final byte[] mo4122(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ʿʼ r0 = this.f4665;
        C3222 c3222 = this.f4667;
        try {
            byte[] bArr3 = ((C1825) c3222.f12539).f7044;
            byte[] bArrM11 = AbstractC0001.m11(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((InterfaceC1830) ((C1825) c3222.f12539).f7041).mo4122(bArr, bArr2));
            int i = ((C1825) c3222.f12539).f7046;
            int length = bArr.length;
            r0.getClass();
            return bArrM11;
        } catch (GeneralSecurityException e) {
            r0.getClass();
            throw e;
        }
    }
}
