package p018;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import p078.AbstractC1685;
import p283.C3380;

/* renamed from: ʻⁱ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1113 extends AbstractC1685 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f4719;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public byte[] f4720;

    @Override // p078.AbstractC1685
    /* renamed from: ᵔˋ */
    public final void mo4125(C3380 c3380) throws Buffer$BufferException {
        c3380.m8843(2);
        byte bM8849 = c3380.m8849();
        c3380.m8843(1);
        this.f4719 = c3380.m8848();
        c3380.m8848();
        c3380.m8843(4);
        c3380.f14614 = bM8849;
        int i = this.f4719;
        byte[] bArr = new byte[i];
        c3380.m8839(i, bArr);
        this.f4720 = bArr;
    }
}
