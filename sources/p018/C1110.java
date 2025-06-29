package p018;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import p078.AbstractC1685;
import p283.C3380;

/* renamed from: ʻⁱ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1110 extends AbstractC1685 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public byte[] f4710;

    @Override // p078.AbstractC1685
    /* renamed from: ᵔˋ */
    public final void mo4125(C3380 c3380) throws Buffer$BufferException {
        c3380.m8843(2);
        c3380.m8843(2);
        c3380.m8848();
        c3380.m8839(8, new byte[8]);
        c3380.m8839(8, new byte[8]);
        int iM8848 = c3380.m8848();
        int iM88482 = c3380.m8848();
        int iM88483 = c3380.m8848();
        int iM88484 = c3380.m8848();
        c3380.m8843(4);
        c3380.m8843(4);
        if (iM88482 > 0) {
            c3380.f14614 = iM8848;
            c3380.m8842(iM88482);
        }
        if (iM88484 > 0) {
            c3380.f14614 = iM88483;
            byte[] bArr = new byte[iM88484];
            c3380.m8839(iM88484, bArr);
            this.f4710 = bArr;
        }
    }
}
