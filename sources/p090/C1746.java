package p090;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import p034.InterfaceC1226;

/* renamed from: ʿﹶ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1746 implements SQLiteDatabase.CursorFactory {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f6764;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f6765;

    public /* synthetic */ C1746(int i, Object obj) {
        this.f6765 = i;
        this.f6764 = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f6765) {
            case 0:
                ((InterfaceC1226) this.f6764).mo4396(new C1750(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                return (Cursor) ((C1745) this.f6764).mo5463(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
