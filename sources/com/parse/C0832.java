package com.parse;

import android.content.ContentValues;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ٴﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0832 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ int f3791;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ Object f3792;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f3793;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3794 = 1;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ Object f3795;

    public /* synthetic */ C0832(ParseSQLiteDatabase parseSQLiteDatabase, String str, ContentValues contentValues, int i) {
        this.f3793 = parseSQLiteDatabase;
        this.f3795 = str;
        this.f3792 = contentValues;
        this.f3791 = i;
    }

    public /* synthetic */ C0832(Task task, int i, ParseObject parseObject, ParseOperationSet parseOperationSet) {
        this.f3793 = task;
        this.f3791 = i;
        this.f3795 = parseObject;
        this.f3792 = parseOperationSet;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3794) {
            case 0:
                return ParsePinningEventuallyQueue.lambda$process$17((Task) this.f3793, this.f3791, (ParseObject) this.f3795, (ParseOperationSet) this.f3792, task);
            default:
                return ((ParseSQLiteDatabase) this.f3793).lambda$insertWithOnConflict$17((String) this.f3795, (ContentValues) this.f3792, this.f3791, task);
        }
    }
}
