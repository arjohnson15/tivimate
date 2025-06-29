package p307;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Icon;

/* renamed from: ᐧˋ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3568 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Object m8453(Context context) {
        return context.getSystemService(AppOpsManager.class);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m8454(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m8455(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Notification.Action.Builder m8456(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m8457(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(0, j, pendingIntent);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m8458(Notification.Builder builder) {
        builder.setLargeIcon((Icon) null);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m8459(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
