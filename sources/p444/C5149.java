package p444;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import p081.AbstractC1705;
import p123.C1995;
import p183.EnumC2533;
import p306.C3554;
import p306.InterfaceC3553;
import ˈⁱ.ﹳﹳ;

/* renamed from: ﾞˆ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5149 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC3553 f19681;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C5150 f19682;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Context f19683;

    public C5149(Context context, InterfaceC3553 interfaceC3553, C5150 c5150) {
        this.f19683 = context;
        this.f19681 = interfaceC3553;
        this.f19682 = c5150;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11453(C1995 c1995, int i, boolean z) {
        Context context = this.f19683;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(c1995.f7594.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        EnumC2533 enumC2533 = c1995.f7593;
        adler32.update(byteBufferAllocate.putInt(AbstractC1705.m5421(enumC2533)).array());
        byte[] bArr = c1995.f7592;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        ﹳﹳ.ˋⁱ("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", c1995);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseM8438 = ((C3554) this.f19681).m8438();
        String strValueOf = String.valueOf(AbstractC1705.m5421(enumC2533));
        String str = c1995.f7594;
        Cursor cursorRawQuery = sQLiteDatabaseM8438.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C5150 c5150 = this.f19682;
            Long l = lValueOf;
            builder.setMinimumLatency(c5150.m11454(enumC2533, jLongValue, i));
            Set set = ((C5146) c5150.f19684.get(enumC2533)).f19671;
            if (set.contains(EnumC5153.f19701)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC5153.f19699)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC5153.f19698)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC1705.m5421(enumC2533));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {c1995, Integer.valueOf(value), Long.valueOf(c5150.m11454(enumC2533, jLongValue, i)), l, Integer.valueOf(i)};
            if (Log.isLoggable(ﹳﹳ.יʻ("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
