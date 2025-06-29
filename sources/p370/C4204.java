package p370;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p331.C3760;
import p331.C3768;
import p414.InterfaceC4728;
import p457.C5391;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵢʾ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4204 implements InterfaceC4728 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final String f16212 = C5391.m12164("SystemAlarmScheduler");

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f16213;

    public C4204(Context context) {
        this.f16213 = context.getApplicationContext();
    }

    @Override // p414.InterfaceC4728
    /* renamed from: ʿʼ */
    public final void mo7032(C3768... c3768Arr) {
        for (C3768 c3768 : c3768Arr) {
            C5391.m12163().m12168(f16212, "Scheduling work with workSpecId " + c3768.f14575);
            C3760 c3760 = ـﹶ.ˋˊ(c3768);
            String str = C4196.f16169;
            Context context = this.f16213;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            C4196.m9625(intent, c3760);
            context.startService(intent);
        }
    }

    @Override // p414.InterfaceC4728
    /* renamed from: ـﹶ */
    public final void mo7033(String str) {
        String str2 = C4196.f16169;
        Context context = this.f16213;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(intent);
    }

    @Override // p414.InterfaceC4728
    /* renamed from: ﹳﹳ */
    public final boolean mo7036() {
        return true;
    }
}
