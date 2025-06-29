package p267;

import android.support.v4.media.session.AbstractC0001;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import p115.AbstractC1820;
import p115.C1825;
import p115.InterfaceC1822;
import p260.C3222;
import p271.C3295;
import p375.AbstractC4308;
import p375.C4310;
import p375.C4311;
import p418.EnumC4778;
import ـˊ.ʿʼ;

/* renamed from: ـˎ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3271 implements InterfaceC1822 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ʿʼ f12742;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ʿʼ f12743;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3222 f12744;

    public C3271(C3222 c3222) throws GeneralSecurityException {
        this.f12744 = c3222;
        boolean zIsEmpty = ((C3295) c3222.f12540).f12833.isEmpty();
        ʿʼ r1 = AbstractC4308.f16754;
        if (zIsEmpty) {
            this.f12742 = r1;
            this.f12743 = r1;
            return;
        }
        C4310 c4310 = (C4310) C4311.f16757.f16759.get();
        c4310 = c4310 == null ? C4311.f16758 : c4310;
        AbstractC4308.m9801(c3222);
        c4310.getClass();
        this.f12742 = r1;
        this.f12743 = r1;
    }

    @Override // p115.InterfaceC1822
    /* renamed from: ʽᐧ */
    public final byte[] mo5026(byte[] bArr) throws GeneralSecurityException {
        ʿʼ r3 = this.f12742;
        C3222 c3222 = this.f12744;
        if (((C1825) c3222.f12539).f7042.equals(EnumC4778.f18318)) {
            bArr = AbstractC0001.m11(bArr, C3274.f12748);
        }
        try {
            byte[] bArr2 = ((C1825) c3222.f12539).f7044;
            byte[] bArrM11 = AbstractC0001.m11(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((InterfaceC1822) ((C1825) c3222.f12539).f7041).mo5026(bArr));
            int i = ((C1825) c3222.f12539).f7046;
            int length = bArr.length;
            r3.getClass();
            return bArrM11;
        } catch (GeneralSecurityException e) {
            r3.getClass();
            throw e;
        }
    }

    @Override // p115.InterfaceC1822
    /* renamed from: ـﹶ */
    public final void mo5027(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        ʿʼ r1 = this.f12743;
        if (length <= 5) {
            r1.getClass();
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        C3222 c3222 = this.f12744;
        for (C1825 c1825 : c3222.m7940(bArrCopyOf)) {
            byte[] bArrM11 = c1825.f7042.equals(EnumC4778.f18318) ? AbstractC0001.m11(bArr2, C3274.f12748) : bArr2;
            try {
                ((InterfaceC1822) c1825.f7041).mo5027(bArrCopyOfRange, bArrM11);
                int length2 = bArrM11.length;
                r1.getClass();
                return;
            } catch (GeneralSecurityException e) {
                C3274.f12750.info("tag prefix matches a key, but cannot verify: " + e);
            }
        }
        Iterator it = c3222.m7940(AbstractC1820.f7037).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC1822) ((C1825) it.next()).f7041).mo5027(bArr, bArr2);
                int length3 = bArr2.length;
                r1.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        r1.getClass();
        throw new GeneralSecurityException("invalid MAC");
    }
}
