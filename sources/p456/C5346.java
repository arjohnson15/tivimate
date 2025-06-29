package p456;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5346 extends AbstractC5257 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C5264 f20736;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f20737;

    public C5346(C5236 c5236) {
        super(c5236);
        this.f20736 = new C5264(this, ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static long m12030(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j = cursorQuery.getLong(0);
            cursorQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final boolean m12031() {
        m11846();
        if (this.f20737 || !((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114.getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseM12032 = m12032();
                        if (sQLiteDatabaseM12032 == null) {
                            this.f20737 = true;
                            if (sQLiteDatabaseM12032 != null) {
                                sQLiteDatabaseM12032.close();
                            }
                            return false;
                        }
                        sQLiteDatabaseM12032.beginTransaction();
                        sQLiteDatabaseM12032.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseM12032.setTransactionSuccessful();
                        sQLiteDatabaseM12032.endTransaction();
                        sQLiteDatabaseM12032.close();
                        return true;
                    } catch (SQLiteFullException e) {
                        ˏᵢ().f20571.m4531(e, "Error deleting app launch break from local database");
                        this.f20737 = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteException e2) {
                if (0 != 0) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                ˏᵢ().f20571.m4531(e2, "Error deleting app launch break from local database");
                this.f20737 = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        ˏᵢ().f20568.m4533("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public final SQLiteDatabase m12032() {
        if (this.f20737) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f20736.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f20737 = true;
        return null;
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public final void m12033() {
        int iDelete;
        m11846();
        try {
            SQLiteDatabase sQLiteDatabaseM12032 = m12032();
            if (sQLiteDatabaseM12032 == null || (iDelete = sQLiteDatabaseM12032.delete("messages", null, null)) <= 0) {
                return;
            }
            ˏᵢ().f20566.m4531(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            ˏᵢ().f20571.m4531(e, "Error resetting local analytics data. error");
        }
    }

    @Override // p456.AbstractC5257
    /* renamed from: ᴵˋ */
    public final boolean mo11715() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0120  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m12034(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5346.m12034(int, byte[]):boolean");
    }
}
