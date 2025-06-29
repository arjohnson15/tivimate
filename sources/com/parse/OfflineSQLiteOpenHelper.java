package com.parse;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
class OfflineSQLiteOpenHelper extends ParseSQLiteOpenHelper {
    public OfflineSQLiteOpenHelper(Context context) {
        super(context, "ParseOfflineStore", null, 4);
    }

    private void createSchema(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE ParseObjects (uuid TEXT PRIMARY KEY, className TEXT NOT NULL, objectId TEXT, json TEXT, isDeletingEventually INTEGER DEFAULT 0, UNIQUE(className, objectId));");
        sQLiteDatabase.execSQL("CREATE TABLE Dependencies (key TEXT NOT NULL, uuid TEXT NOT NULL, PRIMARY KEY(key, uuid));");
    }

    @Override // com.parse.ParseSQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        createSchema(sQLiteDatabase);
    }

    @Override // com.parse.ParseSQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
