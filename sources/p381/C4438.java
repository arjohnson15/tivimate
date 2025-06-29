package p381;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p123.C1995;
import p191.EnumC2648;
import p306.C3545;
import p306.C3554;
import p439.InterfaceC5123;
import p444.C5152;
import ᵢ.ʿʼ;

/* renamed from: ᵢᵎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C4438 implements InterfaceC4442, InterfaceC5123 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f17103;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ Object f17104;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ long f17105;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Object f17106;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17107;

    public /* synthetic */ C4438(ScheduledExecutorServiceC4446 scheduledExecutorServiceC4446, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f17107 = i;
        this.f17103 = scheduledExecutorServiceC4446;
        this.f17104 = obj;
        this.f17105 = j;
        this.f17106 = timeUnit;
    }

    public /* synthetic */ C4438(C5152 c5152, Iterable iterable, C1995 c1995, long j) {
        this.f17107 = 2;
        this.f17103 = c5152;
        this.f17104 = iterable;
        this.f17106 = c1995;
        this.f17105 = j;
    }

    @Override // p381.InterfaceC4442
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public ScheduledFuture mo10063(ʿʼ r5) {
        switch (this.f17107) {
            case 0:
                ScheduledExecutorServiceC4446 scheduledExecutorServiceC4446 = (ScheduledExecutorServiceC4446) this.f17103;
                scheduledExecutorServiceC4446.getClass();
                return scheduledExecutorServiceC4446.f17133.schedule(new RunnableC4439(scheduledExecutorServiceC4446, (Runnable) this.f17104, r5, 1), this.f17105, (TimeUnit) this.f17106);
            default:
                ScheduledExecutorServiceC4446 scheduledExecutorServiceC44462 = (ScheduledExecutorServiceC4446) this.f17103;
                scheduledExecutorServiceC44462.getClass();
                return scheduledExecutorServiceC44462.f17133.schedule(new CallableC4445(scheduledExecutorServiceC44462, (Callable) this.f17104, r5, 0), this.f17105, (TimeUnit) this.f17106);
        }
    }

    @Override // p439.InterfaceC5123
    /* renamed from: ـﹶ */
    public Object mo4249() {
        C5152 c5152 = (C5152) this.f17103;
        C3554 c3554 = (C3554) c5152.f19692;
        c3554.getClass();
        Iterable iterable = (Iterable) this.f17104;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C3554.m8434(iterable);
            SQLiteDatabase sQLiteDatabaseM8438 = c3554.m8438();
            sQLiteDatabaseM8438.beginTransaction();
            try {
                sQLiteDatabaseM8438.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseM8438.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c3554.m8435(cursorRawQuery.getInt(0), EnumC2648.f10515, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseM8438.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseM8438.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseM8438.endTransaction();
            }
        }
        c3554.m8437(new C3545(c5152.f19695.m6468() + this.f17105, (C1995) this.f17106));
        return null;
    }
}
