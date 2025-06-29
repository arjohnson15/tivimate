package p378;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: ᵢٴ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4362 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static WindowInsets m9943(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m9944(View view) {
        view.requestApplyInsets();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static WindowInsets m9945(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
