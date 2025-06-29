package p018;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import p078.AbstractC1685;
import p283.C3380;

/* renamed from: ʻⁱ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1101 extends AbstractC1685 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public byte[] f4693;

    @Override // p078.AbstractC1685
    /* renamed from: ᵔˋ */
    public final void mo4125(C3380 c3380) throws Buffer$BufferException {
        c3380.m8843(2);
        int iM8852 = c3380.f14613.m8852(c3380);
        int iM8848 = c3380.m8848();
        if (iM8852 > 0) {
            c3380.f14614 = iM8852;
            byte[] bArr = new byte[iM8848];
            c3380.m8839(iM8848, bArr);
            this.f4693 = bArr;
        }
    }
}
