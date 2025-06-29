package p307;

import android.app.AppOpsManager;
import android.app.Notification;
import android.content.Context;

/* renamed from: ᐧˋ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3570 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static AppOpsManager m8465(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m8466(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m8467(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m8468(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m8469(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }
}
