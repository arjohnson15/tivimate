package p142;

import android.animation.TimeInterpolator;

/* renamed from: ˉי.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2225 implements TimeInterpolator {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f8850;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f8851;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int[] f8852;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = (int) ((f * this.f8851) + 0.5f);
        int i2 = this.f8850;
        int[] iArr = this.f8852;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        return (i3 / i2) + (i3 < i2 ? i / this.f8851 : 0.0f);
    }
}
