package p004;

import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import p222.C2900;

/* renamed from: ʻʿ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0921 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Handler m3762(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static String m3763(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static int m3764(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static int m3765(Object obj) {
        return ((Icon) obj).getType();
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static Uri m3766(Object obj) {
        return ((Icon) obj).getUri();
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static PrecomputedText.Params m3767(C2900 c2900) {
        return c2900.getTextMetricsParams();
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static boolean m3768(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m3769(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String[] m3770(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Handler m3771(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m3772(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m3773(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static void m3774(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m3775(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static int m3776(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
