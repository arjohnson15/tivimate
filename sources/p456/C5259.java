package p456;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.internal.measurement.AbstractC0435;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5259 extends AbstractC5295 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C5235 f20369;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final AlarmManager f20370;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Integer f20371;

    public C5259(C5273 c5273) {
        super(c5273);
        this.f20370 = (AlarmManager) ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114.getSystemService("alarm");
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final AbstractC5274 m11758() {
        if (this.f20369 == null) {
            this.f20369 = new C5235(1, this, this.f20703.f20418);
        }
        return this.f20369;
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public final PendingIntent m11759() {
        Context context = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC0435.f2740);
    }

    @Override // p456.AbstractC5295
    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public final boolean mo11760() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.f20370;
        if (alarmManager != null) {
            alarmManager.cancel(m11759());
        }
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114.getSystemService("jobscheduler")) == null) {
            return false;
        }
        jobScheduler.cancel(m11762());
        return false;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final void m11761() {
        JobScheduler jobScheduler;
        m11909();
        ˏᵢ().f20566.m4533("Unscheduling upload");
        AlarmManager alarmManager = this.f20370;
        if (alarmManager != null) {
            alarmManager.cancel(m11759());
        }
        m11758().m11844();
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114.getSystemService("jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(m11762());
    }

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final int m11762() {
        if (this.f20371 == null) {
            this.f20371 = Integer.valueOf(("measurement" + ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114.getPackageName()).hashCode());
        }
        return this.f20371.intValue();
    }
}
