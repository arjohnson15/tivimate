package com.parse;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
class ParseSQLiteDatabase {
    private static final ExecutorService dbExecutor = Executors.newSingleThreadExecutor();
    private static final TaskQueue taskQueue = new TaskQueue();
    private SQLiteDatabase db;
    private final int openFlags;
    private final Object currentLock = new Object();
    private final TaskCompletionSource<Void> tcs = new TaskCompletionSource<>();
    private Task<Void> current = null;

    private ParseSQLiteDatabase(int i) {
        this.openFlags = i;
        taskQueue.enqueue(new C0823(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$beginTransactionAsync$6(Task task) {
        this.db.beginTransaction();
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$beginTransactionAsync$7(Task task) {
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$closeAsync$12(Task task) {
        try {
            this.db.close();
            this.tcs.setResult(null);
            return this.tcs.getTask();
        } catch (Throwable th) {
            this.tcs.setResult(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$closeAsync$13(Task task) {
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$deleteAsync$23(String str, String str2, String[] strArr, Task task) {
        return Integer.valueOf(this.db.delete(str, str2, strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$deleteAsync$24(Task task) {
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$endTransactionAsync$10(Task task) {
        this.db.endTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$endTransactionAsync$11(Task task) {
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$insertOrThrowAsync$19(String str, ContentValues contentValues, Task task) {
        return Long.valueOf(this.db.insertOrThrow(str, null, contentValues));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$insertOrThrowAsync$20(Task task) {
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$insertWithOnConflict$17(String str, ContentValues contentValues, int i, Task task) {
        return Long.valueOf(this.db.insertWithOnConflict(str, null, contentValues, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$insertWithOnConflict$18(Task task) {
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$new$0(Task task) {
        synchronized (this.currentLock) {
            this.current = task;
        }
        return this.tcs.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SQLiteDatabase lambda$open$4(SQLiteOpenHelper sQLiteOpenHelper, Task task) {
        return (this.openFlags & 1) == 1 ? sQLiteOpenHelper.getReadableDatabase() : sQLiteOpenHelper.getWritableDatabase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$open$5(Task task) {
        this.db = (SQLiteDatabase) task.getResult();
        return task.makeVoid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$openDatabaseAsync$1(ParseSQLiteDatabase parseSQLiteDatabase, Task task) {
        return Task.forResult(parseSQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cursor lambda$queryAsync$14(String str, String[] strArr, String str2, String[] strArr2, Task task) {
        return this.db.query(str, strArr, str2, strArr2, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Cursor lambda$queryAsync$15(Task task) {
        Cursor cursor = (Cursor) task.getResult();
        cursor.getCount();
        return cursor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$queryAsync$16(Task task) {
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cursor lambda$rawQueryAsync$25(String str, String[] strArr, Task task) {
        return this.db.rawQuery(str, strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Cursor lambda$rawQueryAsync$26(Task task) {
        Cursor cursor = (Cursor) task.getResult();
        cursor.getCount();
        return cursor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$rawQueryAsync$27(Task task) {
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$setTransactionSuccessfulAsync$8(Task task) {
        this.db.setTransactionSuccessful();
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$setTransactionSuccessfulAsync$9(Task task) {
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$updateAsync$21(String str, ContentValues contentValues, String str2, String[] strArr, Task task) {
        return Integer.valueOf(this.db.update(str, contentValues, str2, strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$updateAsync$22(Task task) {
        return task;
    }

    public static Task<ParseSQLiteDatabase> openDatabaseAsync(SQLiteOpenHelper sQLiteOpenHelper, int i) {
        ParseSQLiteDatabase parseSQLiteDatabase = new ParseSQLiteDatabase(i);
        return parseSQLiteDatabase.open(sQLiteOpenHelper).continueWithTask(new C0823(parseSQLiteDatabase, 8));
    }

    public Task<Void> beginTransactionAsync() {
        Task<Void> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task taskContinueWithTask2 = this.current.continueWithTask(new C0823(this, 10), dbExecutor);
            this.current = taskContinueWithTask2;
            taskContinueWithTask = taskContinueWithTask2.continueWithTask(new C0833(13), Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }

    public Task<Void> closeAsync() {
        Task<Void> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task taskContinueWithTask2 = this.current.continueWithTask(new C0823(this, 12), dbExecutor);
            this.current = taskContinueWithTask2;
            taskContinueWithTask = taskContinueWithTask2.continueWithTask(new C0833(14), Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }

    public Task<Void> deleteAsync(String str, String str2, String[] strArr) {
        Task<Void> taskMakeVoid;
        synchronized (this.currentLock) {
            Task<TContinuationResult> taskOnSuccess = this.current.onSuccess(new C0837(this, str, str2, strArr), dbExecutor);
            this.current = taskOnSuccess.makeVoid();
            taskMakeVoid = taskOnSuccess.continueWithTask(new C0833(8), Task.BACKGROUND_EXECUTOR).makeVoid();
        }
        return taskMakeVoid;
    }

    public Task<Void> endTransactionAsync() {
        Task<Void> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task taskContinueWith = this.current.continueWith(new C0823(this, 7), dbExecutor);
            this.current = taskContinueWith;
            taskContinueWithTask = taskContinueWith.continueWithTask(new C0833(12), Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }

    public Task<Void> insertOrThrowAsync(String str, ContentValues contentValues) {
        Task<Void> taskMakeVoid;
        synchronized (this.currentLock) {
            Task<TContinuationResult> taskOnSuccess = this.current.onSuccess(new C0813(this, str, contentValues, 14), dbExecutor);
            this.current = taskOnSuccess.makeVoid();
            taskMakeVoid = taskOnSuccess.continueWithTask(new C0833(11), Task.BACKGROUND_EXECUTOR).makeVoid();
        }
        return taskMakeVoid;
    }

    public Task<Void> insertWithOnConflict(String str, ContentValues contentValues, int i) {
        Task<Void> taskMakeVoid;
        synchronized (this.currentLock) {
            Task<TContinuationResult> taskOnSuccess = this.current.onSuccess(new C0832(this, str, contentValues, i), dbExecutor);
            this.current = taskOnSuccess.makeVoid();
            taskMakeVoid = taskOnSuccess.continueWithTask(new C0833(10), Task.BACKGROUND_EXECUTOR).makeVoid();
        }
        return taskMakeVoid;
    }

    public Task<Void> open(SQLiteOpenHelper sQLiteOpenHelper) {
        Task<Void> taskContinueWithTask;
        synchronized (this.currentLock) {
            taskContinueWithTask = this.current.continueWith(new C0855(this, 15, sQLiteOpenHelper), dbExecutor).continueWithTask(new C0823(this, 9), Task.BACKGROUND_EXECUTOR);
            this.current = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public Task<Cursor> queryAsync(String str, String[] strArr, String str2, String[] strArr2) {
        Task<Cursor> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task<Void> task = this.current;
            C0850 c0850 = new C0850(this, str, strArr, str2, strArr2);
            ExecutorService executorService = dbExecutor;
            Task taskOnSuccess = task.onSuccess(c0850, executorService).onSuccess(new C0833(16), executorService);
            this.current = taskOnSuccess.makeVoid();
            taskContinueWithTask = taskOnSuccess.continueWithTask(new C0833(17), Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }

    public Task<Cursor> rawQueryAsync(String str, String[] strArr) {
        Task<Cursor> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task<Void> task = this.current;
            C0813 c0813 = new C0813(this, str, strArr, 15);
            ExecutorService executorService = dbExecutor;
            Task taskOnSuccess = task.onSuccess(c0813, executorService).onSuccess(new C0833(6), executorService);
            this.current = taskOnSuccess.makeVoid();
            taskContinueWithTask = taskOnSuccess.continueWithTask(new C0833(7), Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }

    public Task<Void> setTransactionSuccessfulAsync() {
        Task<Void> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task taskOnSuccessTask = this.current.onSuccessTask(new C0823(this, 13), dbExecutor);
            this.current = taskOnSuccessTask;
            taskContinueWithTask = taskOnSuccessTask.continueWithTask(new C0833(15), Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }

    public Task<Integer> updateAsync(String str, ContentValues contentValues, String str2, String[] strArr) {
        Task<Integer> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task<TContinuationResult> taskOnSuccess = this.current.onSuccess(new C0850(this, str, contentValues, str2, strArr), dbExecutor);
            this.current = taskOnSuccess.makeVoid();
            taskContinueWithTask = taskOnSuccess.continueWithTask(new C0833(9), Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }
}
