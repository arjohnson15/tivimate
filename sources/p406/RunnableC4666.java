package p406;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import com.bumptech.glide.ˑʽ;
import java.util.concurrent.TimeUnit;
import p414.C4722;
import p457.C5391;
import ˎˊ.ˆʿ;
import ᵢ.ʿʼ;

/* renamed from: ﹳʿ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC4666 implements Runnable {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final String f17800 = C5391.m12164("ForceStopRunnable");

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final long f17801 = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4722 f17802;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ʿʼ f17803;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f17804 = 0;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f17805;

    public RunnableC4666(Context context, C4722 c4722) {
        this.f17805 = context.getApplicationContext();
        this.f17802 = c4722;
        this.f17803 = c4722.f18129;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m10568(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f17801;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f17805;
        String str = f17800;
        C4722 c4722 = this.f17802;
        try {
            if (!m10569()) {
                return;
            }
            while (true) {
                try {
                    ˑʽ.ﹳˎ(context);
                    C5391.m12163().m12168(str, "Performing cleanup operations.");
                    try {
                        m10570();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e) {
                        int i = this.f17804 + 1;
                        this.f17804 = i;
                        if (i >= 3) {
                            String str2 = ˆʿ.ˋⁱ(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            C5391.m12163().m12170(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            c4722.f18131.getClass();
                            throw illegalStateException;
                        }
                        C5391.m12163().m12165(str, "Retrying after " + (i * 300), e);
                        try {
                            Thread.sleep(this.f17804 * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    C5391.m12163().m12167(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    c4722.f18131.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            c4722.m10637();
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m10569() {
        this.f17802.f18131.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f17800;
        if (zIsEmpty) {
            C5391.m12163().m12168(str, "The default process name was not specified.");
            return true;
        }
        boolean zM10567 = AbstractC4662.m10567(this.f17805);
        C5391.m12163().m12168(str, "Is default app process = " + zM10567);
        return zM10567;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10570() {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p406.RunnableC4666.m10570():void");
    }
}
