package p361;

import ˈי.ʾˈ;

/* renamed from: ᵔᵔ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4091 extends ʾˈ {
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m9384(C4107 c4107, float f, float f2) {
        float f3 = f2 * f;
        c4107.m9423(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        C4100 c4100 = new C4100(0.0f, 0.0f, f4, f4);
        c4100.f15829 = 180.0f;
        c4100.f15830 = 90.0f;
        c4107.f15877.add(c4100);
        C4101 c4101 = new C4101(c4100);
        c4107.m9422(180.0f);
        c4107.f15878.add(c4101);
        c4107.f15879 = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d = 270.0f;
        c4107.f15873 = (((float) Math.cos(Math.toRadians(d))) * f6) + f5;
        c4107.f15875 = (f6 * ((float) Math.sin(Math.toRadians(d)))) + f5;
    }
}
