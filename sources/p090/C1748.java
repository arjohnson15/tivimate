package p090;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import p034.AbstractC1227;
import p034.InterfaceC1224;
import p070.AbstractC1549;
import p080.AbstractC1702;
import p321.C3666;
import ʾי.ˑʽ;

/* renamed from: ʿﹶ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1748 extends SQLiteOpenHelper {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final /* synthetic */ int f6768 = 0;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ˑʽ f6769;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f6770;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final AbstractC1227 f6771;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean f6772;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f6773;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3666 f6774;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f6775;

    public C1748(Context context, String str, final ˑʽ r9, final AbstractC1227 abstractC1227, boolean z) {
        super(context, str, null, abstractC1227.f5033, new DatabaseErrorHandler() { // from class: ʿﹶ.ʿʼ
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = C1748.f6768;
                ˑʽ r0 = r9;
                C1749 c1749 = (C1749) r0.ˆʿ;
                if (c1749 == null || !AbstractC1549.m5138(c1749.f6780, sQLiteDatabase)) {
                    c1749 = new C1749(sQLiteDatabase);
                    r0.ˆʿ = c1749;
                }
                abstractC1227.m4403(c1749);
            }
        });
        this.f6773 = context;
        this.f6769 = r9;
        this.f6771 = abstractC1227;
        this.f6772 = z;
        this.f6774 = new C3666(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() throws IOException {
        C3666 c3666 = this.f6774;
        try {
            c3666.m8623(c3666.f14058);
            super.close();
            this.f6769.ˆʿ = null;
            this.f6775 = false;
        } finally {
            c3666.m8622();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean z = this.f6770;
        AbstractC1227 abstractC1227 = this.f6771;
        if (!z && abstractC1227.f5033 != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            abstractC1227.mo4405(m5464(sQLiteDatabase));
        } catch (Throwable th) {
            throw new C1747(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f6771.mo4404(m5464(sQLiteDatabase));
        } catch (Throwable th) {
            throw new C1747(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f6770 = true;
        try {
            this.f6771.mo4406(m5464(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C1747(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f6770) {
            try {
                this.f6771.mo4408(m5464(sQLiteDatabase));
            } catch (Throwable th) {
                throw new C1747(5, th);
            }
        }
        this.f6775 = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f6770 = true;
        try {
            this.f6771.mo4412(m5464(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C1747(3, th);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1749 m5464(SQLiteDatabase sQLiteDatabase) {
        ˑʽ r0 = this.f6769;
        C1749 c1749 = (C1749) r0.ˆʿ;
        if (c1749 != null && AbstractC1549.m5138(c1749.f6780, sQLiteDatabase)) {
            return c1749;
        }
        C1749 c17492 = new C1749(sQLiteDatabase);
        r0.ˆʿ = c17492;
        return c17492;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.database.sqlite.SQLiteDatabase] */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final SQLiteDatabase m5465(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.f6775;
        Context context = this.f6773;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                String str = "Invalid database parent file, not a directory: " + parentFile;
            }
        }
        try {
            z = z != 0 ? getWritableDatabase() : getReadableDatabase();
            return z;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                z = z != 0 ? getWritableDatabase() : getReadableDatabase();
                return z;
            } catch (Throwable th) {
                th = th;
                if (th instanceof C1747) {
                    C1747 c1747 = (C1747) th;
                    int iM5411 = AbstractC1702.m5411(c1747.f6767);
                    th = c1747.f6766;
                    if (iM5411 == 0 || iM5411 == 1 || iM5411 == 2 || iM5411 == 3 || !(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f6772) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return z != 0 ? getWritableDatabase() : getReadableDatabase();
                } catch (C1747 e) {
                    throw e.f6766;
                }
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC1224 m5466(boolean z) throws IOException {
        C3666 c3666 = this.f6774;
        try {
            c3666.m8623((this.f6775 || getDatabaseName() == null) ? false : true);
            this.f6770 = false;
            SQLiteDatabase sQLiteDatabaseM5465 = m5465(z);
            if (!this.f6770) {
                C1749 c1749M5464 = m5464(sQLiteDatabaseM5465);
                c3666.m8622();
                return c1749M5464;
            }
            close();
            InterfaceC1224 interfaceC1224M5466 = m5466(z);
            c3666.m8622();
            return interfaceC1224M5466;
        } catch (Throwable th) {
            c3666.m8622();
            throw th;
        }
    }
}
