package p225;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.bumptech.glide.ﹳﹳ;
import java.util.WeakHashMap;
import p331.C3759;
import p378.AbstractC4345;
import p378.AbstractC4362;

/* renamed from: ˏᵢ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3024 extends ﹳﹳ {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f11697;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f11698;

    public /* synthetic */ C3024(int i, Object obj) {
        this.f11698 = i;
        this.f11697 = obj;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m7519() {
        Object obj = this.f11697;
        switch (this.f11698) {
            case 0:
                ((RunnableC3018) obj).f11659.f11623.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = (LayoutInflaterFactory2C3017) obj;
                layoutInflaterFactory2C3017.f11623.setVisibility(0);
                if (layoutInflaterFactory2C3017.f11623.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C3017.f11623.getParent();
                    WeakHashMap weakHashMap = AbstractC4345.f16838;
                    AbstractC4362.m9944(view);
                    break;
                }
                break;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7520() {
        Object obj = this.f11697;
        switch (this.f11698) {
            case 0:
                RunnableC3018 runnableC3018 = (RunnableC3018) obj;
                runnableC3018.f11659.f11623.setAlpha(1.0f);
                LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = runnableC3018.f11659;
                layoutInflaterFactory2C3017.f11618.m9942(null);
                layoutInflaterFactory2C3017.f11618 = null;
                break;
            case 1:
                LayoutInflaterFactory2C3017 layoutInflaterFactory2C30172 = (LayoutInflaterFactory2C3017) obj;
                layoutInflaterFactory2C30172.f11623.setAlpha(1.0f);
                layoutInflaterFactory2C30172.f11618.m9942(null);
                layoutInflaterFactory2C30172.f11618 = null;
                break;
            default:
                C3759 c3759 = (C3759) obj;
                ((LayoutInflaterFactory2C3017) c3759.f14523).f11623.setVisibility(8);
                LayoutInflaterFactory2C3017 layoutInflaterFactory2C30173 = (LayoutInflaterFactory2C3017) c3759.f14523;
                PopupWindow popupWindow = layoutInflaterFactory2C30173.f11625;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C30173.f11623.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C30173.f11623.getParent();
                    WeakHashMap weakHashMap = AbstractC4345.f16838;
                    AbstractC4362.m9944(view);
                }
                layoutInflaterFactory2C30173.f11623.m115();
                layoutInflaterFactory2C30173.f11618.m9942(null);
                layoutInflaterFactory2C30173.f11618 = null;
                ViewGroup viewGroup = layoutInflaterFactory2C30173.f11652;
                WeakHashMap weakHashMap2 = AbstractC4345.f16838;
                AbstractC4362.m9944(viewGroup);
                break;
        }
    }
}
