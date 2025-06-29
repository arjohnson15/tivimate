package com.parse;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.parse.boltsinternal.Task;

/* loaded from: classes.dex */
abstract class ParseSQLiteOpenHelper {
    private final SQLiteOpenHelper helper;

    public ParseSQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this.helper = new SQLiteOpenHelper(context, str, cursorFactory, i) { // from class: com.parse.ParseSQLiteOpenHelper.1
            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                ParseSQLiteOpenHelper.this.onCreate(sQLiteDatabase);
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onOpen(SQLiteDatabase sQLiteDatabase) {
                super.onOpen(sQLiteDatabase);
                ParseSQLiteOpenHelper.this.onOpen(sQLiteDatabase);
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                ParseSQLiteOpenHelper.this.onUpgrade(sQLiteDatabase, i2, i3);
            }
        };
    }

    private Task<ParseSQLiteDatabase> getDatabaseAsync(boolean z) {
        return ParseSQLiteDatabase.openDatabaseAsync(this.helper, !z ? 1 : 0);
    }

    public Task<ParseSQLiteDatabase> getWritableDatabaseAsync() {
        return getDatabaseAsync(true);
    }

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);
}
