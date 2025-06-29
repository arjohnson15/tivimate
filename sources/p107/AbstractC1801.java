package p107;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.play_billing.ˎˑ;
import p009.C0996;
import ˆʽ.ᵎˏ;

/* renamed from: ˆᵔ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1801 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static float m5534(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static Intent m5535(Context context, C0996 c0996, IntentFilter intentFilter, int i) {
        return context.registerReceiver(c0996, intentFilter, null, null, i);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m5536(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static void m5537(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static void m5538(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static void m5539(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static float m5540(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Icon m5541(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m5542(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m5543(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static Intent m5544(Context context, C0996 c0996, IntentFilter intentFilter, int i) {
        if ((i & 4) == 0) {
            return context.registerReceiver(c0996, intentFilter, null, null, i & 1);
        }
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (ˎˑ.ﹳﹳ(context, str) == 0) {
            return context.registerReceiver(c0996, intentFilter, str, null);
        }
        throw new RuntimeException(ᵎˏ.ˑי("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m5545(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }
}
