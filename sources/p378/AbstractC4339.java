package p378;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import org.lsposed.hiddenapibypass.library.R;
import p421.C4861;

/* renamed from: ᵢٴ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4339 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C4369 m9851(View view, C4369 c4369, Rect rect) {
        WindowInsets windowInsetsM9954 = c4369.m9954();
        if (windowInsetsM9954 != null) {
            return C4369.m9950(view, view.computeSystemWindowInsets(windowInsetsM9954, rect));
        }
        rect.setEmpty();
        return c4369;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static float m9852(View view) {
        return view.getElevation();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m9853(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static void m9854(View view, float f) {
        view.setElevation(f);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static void m9855(View view, InterfaceC4359 interfaceC4359) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id._2_res_0x7f0b037a, interfaceC4359);
        }
        if (interfaceC4359 == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id._2_res_0x7f0b0382));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC4388(view, interfaceC4359));
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static void m9856(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static void m9857(View view, float f) {
        view.setZ(f);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static float m9858(View view) {
        return view.getZ();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static ColorStateList m9859(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static void m9860(View view) {
        view.stopNestedScroll();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m9861(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id._2_res_0x7f0b0382);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C4369 m9862(View view) throws IllegalAccessException, IllegalArgumentException {
        if (!AbstractC4344.f16834 || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC4344.f16833.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC4344.f16831.get(obj);
            Rect rect2 = (Rect) AbstractC4344.f16832.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            AbstractC4342 c4335 = i >= 30 ? new C4335() : i >= 29 ? new C4375() : new C4348();
            c4335.mo9868(C4861.m10935(rect.left, rect.top, rect.right, rect.bottom));
            c4335.mo9872(C4861.m10935(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C4369 c4369Mo9867 = c4335.mo9867();
            c4369Mo9867.f16871.mo9837(c4369Mo9867);
            c4369Mo9867.f16871.mo9841(view.getRootView());
            return c4369Mo9867;
        } catch (IllegalAccessException e) {
            String str = "Failed to get insets from AttachInfo. " + e.getMessage();
            return null;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static String m9863(View view) {
        return view.getTransitionName();
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static void m9864(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static PorterDuff.Mode m9865(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static boolean m9866(View view) {
        return view.isNestedScrollingEnabled();
    }
}
