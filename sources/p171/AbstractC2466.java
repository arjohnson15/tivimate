package p171;

import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: ˋˉ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2466 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m6582(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m6583(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static CharSequence m6584(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Icon m6585(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m6586(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m6587(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }
}
