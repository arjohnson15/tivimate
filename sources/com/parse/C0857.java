package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0857 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ OfflineStore f3870;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ String f3871;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3872;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ ParseSQLiteDatabase f3873;

    public /* synthetic */ C0857(OfflineStore offlineStore, String str, ParseSQLiteDatabase parseSQLiteDatabase, int i) {
        this.f3872 = i;
        this.f3870 = offlineStore;
        this.f3871 = str;
        this.f3873 = parseSQLiteDatabase;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3872) {
            case 0:
                return OfflineQueryLogic.lambda$fetchIncludeAsync$10(this.f3870, this.f3871, this.f3873, task);
            default:
                return this.f3870.lambda$findAsync$4(this.f3871, this.f3873, task);
        }
    }
}
