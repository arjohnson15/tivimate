package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0809 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ OfflineStore f3716;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ ParseSQLiteDatabase f3717;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f3718;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3719 = 1;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ String f3720;

    public /* synthetic */ C0809(OfflineStore offlineStore, Object obj, String str, ParseSQLiteDatabase parseSQLiteDatabase) {
        this.f3716 = offlineStore;
        this.f3718 = obj;
        this.f3720 = str;
        this.f3717 = parseSQLiteDatabase;
    }

    public /* synthetic */ C0809(Object obj, OfflineStore offlineStore, ParseSQLiteDatabase parseSQLiteDatabase, String str) {
        this.f3718 = obj;
        this.f3716 = offlineStore;
        this.f3717 = parseSQLiteDatabase;
        this.f3720 = str;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3719) {
            case 0:
                return OfflineQueryLogic.lambda$fetchIncludeAsync$9(this.f3718, this.f3716, this.f3717, this.f3720, task);
            default:
                return OfflineQueryLogic.lambda$fetchIncludeAsync$6(this.f3716, this.f3718, this.f3720, this.f3717, task);
        }
    }
}
