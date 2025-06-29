package p378;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import org.lsposed.hiddenapibypass.library.R;
import p273.C3343;
import p331.C3759;

/* renamed from: ᵢٴ.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4382 extends AbstractC4380 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final PathInterpolator f16888 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C3343 f16889 = new C3343();

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final DecelerateInterpolator f16890 = new DecelerateInterpolator();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m9966(View view) {
        C4389 c4389M9967 = m9967(view);
        if (c4389M9967 != null) {
            ((View) c4389M9967.f16911).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m9966(viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static C4389 m9967(View view) {
        Object tag = view.getTag(R.id._2_res_0x7f0b0382);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC4352) {
            return ((ViewOnApplyWindowInsetsListenerC4352) tag).f16858;
        }
        return null;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m9968(View view, C3759 c3759) {
        C4389 c4389M9967 = m9967(view);
        if (c4389M9967 != null) {
            View view2 = (View) c4389M9967.f16911;
            int[] iArr = (int[]) c4389M9967.f16915;
            view2.getLocationOnScreen(iArr);
            int i = c4389M9967.f16912 - iArr[1];
            c4389M9967.f16913 = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m9968(viewGroup.getChildAt(i2), c3759);
            }
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m9969(View view, WindowInsets windowInsets, boolean z) {
        C4389 c4389M9967 = m9967(view);
        if (c4389M9967 != null) {
            c4389M9967.f16910 = windowInsets;
            if (!z) {
                View view2 = (View) c4389M9967.f16911;
                int[] iArr = (int[]) c4389M9967.f16915;
                view2.getLocationOnScreen(iArr);
                z = true;
                c4389M9967.f16912 = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m9969(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m9970(View view, C4369 c4369, List list) {
        C4389 c4389M9967 = m9967(view);
        if (c4389M9967 != null) {
            c4389M9967.m9980(c4369, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m9970(viewGroup.getChildAt(i), c4369, list);
            }
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static WindowInsets m9971(View view, WindowInsets windowInsets) {
        return view.getTag(R.id._2_res_0x7f0b037a) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }
}
