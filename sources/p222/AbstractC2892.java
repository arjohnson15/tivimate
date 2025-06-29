package p222;

import android.widget.TextView;

/* renamed from: ˏᴵ.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2892 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m7230(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m7231(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m7232(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static boolean m7233(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
