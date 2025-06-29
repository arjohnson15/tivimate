package p379;

/* renamed from: ᵢᐧ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4417 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int[] f17042 = new int[10];

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f17043;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m10026(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f17042;
            if (i >= iArr.length) {
                return;
            }
            this.f17043 = (1 << i) | this.f17043;
            iArr[i] = i2;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m10027() {
        if ((this.f17043 & 128) != 0) {
            return this.f17042[7];
        }
        return 65535;
    }
}
