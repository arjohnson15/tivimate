package p306;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p081.AbstractC1705;
import p084.C1715;
import p123.C1995;
import p139.C2125;
import p165.InterfaceC2393;
import p183.C2531;
import p191.EnumC2648;
import p439.InterfaceC5122;
import p439.InterfaceC5123;
import p452.InterfaceC5193;

/* renamed from: ᐧˈ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3554 implements InterfaceC3553, InterfaceC5122, InterfaceC3549 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final C2531 f13718 = new C2531("proto");

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC2393 f13719;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final InterfaceC5193 f13720;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC2393 f13721;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C3550 f13722;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3547 f13723;

    public C3554(InterfaceC2393 interfaceC2393, InterfaceC2393 interfaceC23932, C3550 c3550, C3547 c3547, InterfaceC5193 interfaceC5193) {
        this.f13723 = c3547;
        this.f13719 = interfaceC2393;
        this.f13721 = interfaceC23932;
        this.f13722 = c3550;
        this.f13720 = interfaceC5193;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Long m8432(SQLiteDatabase sQLiteDatabase, C1995 c1995) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c1995.f7594, String.valueOf(AbstractC1705.m5421(c1995.f7593))));
        byte[] bArr = c1995.f7592;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static Object m8433(Cursor cursor, InterfaceC3552 interfaceC3552) {
        try {
            return interfaceC3552.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static String m8434(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C3544) it.next()).f13700);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13723.close();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m8435(long j, EnumC2648 enumC2648, String str) {
        m8437(new C1715(j, str, enumC2648));
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Object m8436(InterfaceC5123 interfaceC5123) {
        SQLiteDatabase sQLiteDatabaseM8438 = m8438();
        InterfaceC2393 interfaceC2393 = this.f13721;
        long jM6468 = interfaceC2393.m6468();
        while (true) {
            try {
                sQLiteDatabaseM8438.beginTransaction();
                try {
                    Object objMo4249 = interfaceC5123.mo4249();
                    sQLiteDatabaseM8438.setTransactionSuccessful();
                    return objMo4249;
                } finally {
                    sQLiteDatabaseM8438.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC2393.m6468() >= this.f13722.f13714 + jM6468) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object m8437(InterfaceC3552 interfaceC3552) {
        SQLiteDatabase sQLiteDatabaseM8438 = m8438();
        sQLiteDatabaseM8438.beginTransaction();
        try {
            Object objApply = interfaceC3552.apply(sQLiteDatabaseM8438);
            sQLiteDatabaseM8438.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM8438.endTransaction();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SQLiteDatabase m8438() {
        C3547 c3547 = this.f13723;
        Objects.requireNonNull(c3547);
        InterfaceC2393 interfaceC2393 = this.f13721;
        long jM6468 = interfaceC2393.m6468();
        while (true) {
            try {
                return c3547.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC2393.m6468() >= this.f13722.f13714 + jM6468) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ArrayList m8439(SQLiteDatabase sQLiteDatabase, C1995 c1995, int i) {
        ArrayList arrayList = new ArrayList();
        Long lM8432 = m8432(sQLiteDatabase, c1995);
        if (lM8432 == null) {
            return arrayList;
        }
        m8433(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lM8432.toString()}, null, null, null, String.valueOf(i)), new C2125(this, arrayList, c1995, 2));
        return arrayList;
    }
}
