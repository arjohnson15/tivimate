package p263;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.impl.foreground.SystemForegroundService;
import p457.C5391;

/* renamed from: ـʽ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3257 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m8013(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            C5391 c5391M12163 = C5391.m12163();
            String str = SystemForegroundService.f1781;
            if (c5391M12163.f20867 <= 5) {
            }
        }
    }
}
