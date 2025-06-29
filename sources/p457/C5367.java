package p457;

import android.app.Notification;

/* renamed from: ﾞﹶ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5367 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f20830;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Notification f20831;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f20832;

    public C5367(int i, Notification notification, int i2) {
        this.f20832 = i;
        this.f20831 = notification;
        this.f20830 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5367.class != obj.getClass()) {
            return false;
        }
        C5367 c5367 = (C5367) obj;
        if (this.f20832 == c5367.f20832 && this.f20830 == c5367.f20830) {
            return this.f20831.equals(c5367.f20831);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20831.hashCode() + (((this.f20832 * 31) + this.f20830) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f20832 + ", mForegroundServiceType=" + this.f20830 + ", mNotification=" + this.f20831 + '}';
    }
}
