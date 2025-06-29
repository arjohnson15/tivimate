package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.List;

/* renamed from: com.parse.ʾʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0793 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ OfflineStore f3677;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ List f3678;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3679;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ ParseSQLiteDatabase f3680;

    public /* synthetic */ C0793(OfflineStore offlineStore, List list, ParseSQLiteDatabase parseSQLiteDatabase, int i) {
        this.f3679 = i;
        this.f3677 = offlineStore;
        this.f3678 = list;
        this.f3680 = parseSQLiteDatabase;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3679) {
            case 0:
                return this.f3677.lambda$deleteObjects$30(this.f3678, this.f3680, task);
            default:
                return this.f3677.lambda$unpinAllObjectsAsync$54(this.f3678, this.f3680, task);
        }
    }
}
