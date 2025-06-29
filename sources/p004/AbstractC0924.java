package p004;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* renamed from: ʻʿ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0924 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static float m3778(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static int m3779(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m3780(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m3781(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m3782() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m3783(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static boolean m3784(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static CharSequence m3785(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }
}
