package p201;

import java.util.Arrays;
import p117.AbstractC1845;

/* renamed from: ˎᐧ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2762 extends AbstractC2761 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f10793;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean[] f10794;

    public C2762(AbstractC1845 abstractC1845, byte[] bArr, int i) {
        super(abstractC1845, bArr);
        this.f10793 = i;
        int length = (bArr.length * 8) - i;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = true;
            if ((bArr[i2 / 8] & (1 << (7 - (i2 % 8)))) == 0) {
                z = false;
            }
            zArr[i2] = z;
        }
        this.f10794 = zArr;
    }

    @Override // p117.AbstractC1841
    /* renamed from: ٴˎ */
    public final String mo5603() {
        return Arrays.toString(this.f10794);
    }

    @Override // p117.AbstractC1841
    /* renamed from: ﹳﹳ */
    public final Object mo5457() {
        boolean[] zArr = this.f10794;
        return Arrays.copyOf(zArr, zArr.length);
    }
}
