package p290;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p371.AbstractC4205;
import p438.C5072;
import p438.C5092;
import p438.C5118;
import p438.SurfaceHolderCallbackC5075;
import ˆʽ.ᵎˏ;

/* renamed from: ٴٴ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3408 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f13262;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13263;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f13264;

    public /* synthetic */ RunnableC3408(int i, int i2, Object obj) {
        this.f13264 = i2;
        this.f13263 = obj;
        this.f13262 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13264) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f13263;
                View view = (View) sideSheetBehavior.f3378.get();
                if (view != null) {
                    sideSheetBehavior.m2881(view, this.f13262, false);
                    break;
                }
                break;
            case 1:
                ((AbstractC4205) this.f13263).mo7177(this.f13262);
                break;
            default:
                C5092 c5092 = ((C5072) this.f13263).f19229;
                c5092.getClass();
                int i = this.f13262;
                if (i != -3 && i != -2) {
                    if (i == -1) {
                        SurfaceHolderCallbackC5075 surfaceHolderCallbackC5075 = c5092.f19369;
                        if (surfaceHolderCallbackC5075 != null) {
                            C5118 c5118 = surfaceHolderCallbackC5075.f19247;
                            c5118.m11370(-1, c5118.m11362(), 2);
                        }
                        c5092.m11294();
                        c5092.m11293(1);
                        break;
                    } else if (i == 1) {
                        c5092.m11293(2);
                        SurfaceHolderCallbackC5075 surfaceHolderCallbackC50752 = c5092.f19369;
                        if (surfaceHolderCallbackC50752 != null) {
                            C5118 c51182 = surfaceHolderCallbackC50752.f19247;
                            c51182.m11370(1, c51182.m11362(), 1);
                            break;
                        }
                    } else {
                        ᵎˏ.ʿˏ(i, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else {
                    c5092.m11293(4);
                    break;
                }
                break;
        }
    }
}
