package androidx.fragment.app;

import android.view.View;
import ـˈ.ˉᵎ;

/* renamed from: androidx.fragment.app.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0106 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0091 f657;

    public AbstractC0106(C0091 c0091) {
        this.f657 = c0091;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m708() {
        int i;
        C0091 c0091 = this.f657;
        View view = c0091.f555.mView;
        if (view != null) {
            i = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Unknown visibility ", visibility));
                    }
                    i = 3;
                }
            }
        } else {
            i = 0;
        }
        int i2 = c0091.f556;
        return i == i2 || !(i == 2 || i2 == 2);
    }
}
