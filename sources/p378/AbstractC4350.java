package p378;

import android.view.View;

/* renamed from: ᵢٴ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4350 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m9902(View view) {
        return view.isAccessibilityHeading();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m9903(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static boolean m9904(View view) {
        return view.isScreenReaderFocusable();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static CharSequence m9905(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m9906(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m9907(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }
}
