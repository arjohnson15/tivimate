package p225;

import android.view.ViewGroup;
import p378.AbstractC4345;
import p378.C4361;

/* renamed from: ˏᵢ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC3018 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C3017 f11659;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f11660;

    public /* synthetic */ RunnableC3018(LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017, int i) {
        this.f11660 = i;
        this.f11659 = layoutInflaterFactory2C3017;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f11660) {
            case 0:
                LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = this.f11659;
                if ((layoutInflaterFactory2C3017.f11638 & 1) != 0) {
                    layoutInflaterFactory2C3017.m7463(0);
                }
                if ((layoutInflaterFactory2C3017.f11638 & 4096) != 0) {
                    layoutInflaterFactory2C3017.m7463(108);
                }
                layoutInflaterFactory2C3017.f11622 = false;
                layoutInflaterFactory2C3017.f11638 = 0;
                break;
            default:
                LayoutInflaterFactory2C3017 layoutInflaterFactory2C30172 = this.f11659;
                layoutInflaterFactory2C30172.f11625.showAtLocation(layoutInflaterFactory2C30172.f11623, 55, 0, 0);
                C4361 c4361 = layoutInflaterFactory2C30172.f11618;
                if (c4361 != null) {
                    c4361.m9938();
                }
                if (!(layoutInflaterFactory2C30172.f11621 && (viewGroup = layoutInflaterFactory2C30172.f11652) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C30172.f11623.setAlpha(1.0f);
                    layoutInflaterFactory2C30172.f11623.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C30172.f11623.setAlpha(0.0f);
                    C4361 c4361M9885 = AbstractC4345.m9885(layoutInflaterFactory2C30172.f11623);
                    c4361M9885.m9941(1.0f);
                    layoutInflaterFactory2C30172.f11618 = c4361M9885;
                    c4361M9885.m9942(new C3024(0, this));
                    break;
                }
                break;
        }
    }
}
