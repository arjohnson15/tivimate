package p225;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.bumptech.glide.ﹳﹳ;
import java.util.WeakHashMap;
import p331.C3759;
import p378.AbstractC4345;
import p378.AbstractC4362;

/* renamed from: ˏᵢ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3003 extends ﹳﹳ {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C3016 f11530;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f11531;

    public /* synthetic */ C3003(C3016 c3016, int i) {
        this.f11531 = i;
        this.f11530 = c3016;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7430() {
        View view;
        C3016 c3016 = this.f11530;
        switch (this.f11531) {
            case 0:
                if (c3016.f11591 && (view = c3016.f11597) != null) {
                    view.setTranslationY(0.0f);
                    c3016.f11602.setTranslationY(0.0f);
                }
                c3016.f11602.setVisibility(8);
                c3016.f11602.setTransitioning(false);
                c3016.f11599 = null;
                C3759 c3759 = c3016.f11590;
                if (c3759 != null) {
                    c3759.m8749(c3016.f11585);
                    c3016.f11585 = null;
                    c3016.f11590 = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c3016.f11593;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC4345.f16838;
                    AbstractC4362.m9944(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                c3016.f11599 = null;
                c3016.f11602.requestLayout();
                break;
        }
    }
}
