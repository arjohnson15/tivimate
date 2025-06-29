package p446;

import p153.C2324;
import p221.AbstractC2855;

/* renamed from: ﾞˉ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5167 extends AbstractC2855 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C2324 f19751;

    @Override // p221.AbstractC2855
    /* renamed from: ʽᐧ */
    public final int mo7170(byte[] bArr) {
        C2324 c2324 = this.f19751;
        int length = c2324.f9220;
        if (length >= bArr.length) {
            length = bArr.length;
        }
        int i = c2324.f9223;
        int i2 = i + length;
        byte[] bArr2 = c2324.f9219;
        if (i2 <= bArr2.length) {
            System.arraycopy(bArr2, i, bArr, 0, length);
        } else {
            int length2 = bArr2.length - i;
            System.arraycopy(bArr2, i, bArr, 0, length2);
            System.arraycopy(bArr2, 0, bArr, length2, length - length2);
        }
        c2324.f9223 = (c2324.f9223 + length) % bArr2.length;
        c2324.f9220 -= length;
        return length;
    }

    @Override // p221.AbstractC2855
    /* renamed from: ـﹶ */
    public final int mo7171() {
        return this.f19751.f9220;
    }
}
