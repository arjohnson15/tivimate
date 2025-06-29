package p361;

import ˈי.ʾˈ;

/* renamed from: ᵔᵔ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4093 extends ʾˈ {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f15798;

    public C4093(int i) {
        this.f15798 = i;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final float m9394(C4105 c4105) {
        float[] fArr = c4105.f15869;
        if (fArr != null) {
            return fArr[this.f15798];
        }
        return 0.0f;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m9395(C4105 c4105, float f) {
        float[] fArr = c4105.f15869;
        if (fArr != null) {
            fArr[this.f15798] = f;
            c4105.invalidateSelf();
        }
    }
}
