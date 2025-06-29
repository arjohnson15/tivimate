package p414;

import android.content.Context;
import android.content.SharedPreferences;
import p034.InterfaceC1224;
import p270.AbstractC3293;

/* renamed from: ﹳـ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4713 extends AbstractC3293 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ int f18085 = 1;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Context f18086;

    public C4713(Context context) {
        super(9, 10);
        this.f18086 = context;
    }

    public C4713(Context context, int i, int i2) {
        super(i, i2);
        this.f18086 = context;
    }

    @Override // p270.AbstractC3293
    /* renamed from: ـﹶ */
    public final void mo8104(InterfaceC1224 interfaceC1224) {
        Context context = this.f18086;
        switch (this.f18085) {
            case 0:
                if (this.f12826 >= 10) {
                    interfaceC1224.mo4387(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                interfaceC1224.mo4392("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    interfaceC1224.mo4386();
                    try {
                        interfaceC1224.mo4387(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        interfaceC1224.mo4387(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        interfaceC1224.mo4390();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    interfaceC1224.mo4386();
                    try {
                        interfaceC1224.mo4387(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        interfaceC1224.mo4387(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        interfaceC1224.mo4390();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }
}
