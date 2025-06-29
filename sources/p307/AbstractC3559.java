package p307;

import android.app.Notification;
import android.app.NotificationManager;

/* renamed from: ᐧˋ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3559 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m8440(Notification.Action.Builder builder, boolean z) {
        builder.setAllowGeneratedReplies(z);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m8441(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m8442(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }
}
