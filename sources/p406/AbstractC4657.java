package p406;

import android.content.Context;
import android.os.PowerManager;
import p457.C5391;

/* renamed from: ﹳʿ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4657 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f17780 = C5391.m12164("WakeLocks");

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final PowerManager.WakeLock m10561(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        synchronized (C4664.f17795) {
        }
        return wakeLockNewWakeLock;
    }
}
