package p290;

import android.content.res.Resources;
import android.support.v4.media.session.AbstractC0001;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p315.AbstractC3608;
import ˈⁱ.ˉⁱ;

/* renamed from: ٴٴ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3409 extends ˉⁱ {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ int f13265;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3608 f13266;

    public /* synthetic */ C3409(AbstractC3608 abstractC3608, int i) {
        this.f13265 = i;
        this.f13266 = abstractC3608;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int m8266(View view) {
        switch (this.f13265) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f13266;
                return sideSheetBehavior.f3370 + sideSheetBehavior.f3375;
            default:
                return super.ˋⁱ(view);
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m8267(int i) throws Resources.NotFoundException {
        switch (this.f13265) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f13266;
                    if (sideSheetBehavior.f3381) {
                        sideSheetBehavior.m2879(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f13266;
                    if (bottomSheetBehavior.f3178) {
                        bottomSheetBehavior.m2812(1);
                        break;
                    }
                }
                break;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m8268(View view, int i) {
        switch (this.f13265) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f13266;
                return AbstractC0001.m26(i, sideSheetBehavior.f3379.ﾞˊ(), sideSheetBehavior.f3379.ˋˊ());
            default:
                return view.getLeft();
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean m8269(View view, int i) {
        WeakReference weakReference;
        switch (this.f13265) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f13266;
                if (sideSheetBehavior.f3376 != 1 && (weakReference = sideSheetBehavior.f3378) != null && weakReference.get() == view) {
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f13266;
                int i2 = bottomSheetBehavior.f3169;
                if (i2 != 1 && !bottomSheetBehavior.f3159) {
                    if (i2 == 3 && bottomSheetBehavior.f3152 == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f3158;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f3154;
                    if (weakReference3 == null || weakReference3.get() != view) {
                    }
                }
                break;
        }
        return false;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int m8270() {
        switch (this.f13265) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f13266;
                return bottomSheetBehavior.f3155 ? bottomSheetBehavior.f3196 : bottomSheetBehavior.f3186;
            default:
                return super.ᴵʿ();
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m8271(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f13265) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f13266;
                WeakReference weakReference = sideSheetBehavior.f3384;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f3379.ᵢٴ(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f3368;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f3379.ᐧʻ(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f13266).m2811(i2);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8272(android.view.View r6, float r7, float r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p290.C3409.m8272(android.view.View, float, float):void");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m8273(View view, int i) {
        switch (this.f13265) {
            case 0:
                return view.getTop();
            default:
                return AbstractC0001.m26(i, ((BottomSheetBehavior) this.f13266).m2828(), m8270());
        }
    }
}
