package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0835 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ OfflineStore f3800;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ParseSQLiteDatabase f3801;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3802;

    public /* synthetic */ C0835(OfflineStore offlineStore, ParseSQLiteDatabase parseSQLiteDatabase, int i) {
        this.f3802 = i;
        this.f3800 = offlineStore;
        this.f3801 = parseSQLiteDatabase;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3802) {
            case 0:
                return this.f3800.lambda$unpinAsync$25(this.f3801, task);
            case 1:
                return this.f3800.lambda$saveLocallyAsync$22(this.f3801, task);
            case 2:
                return this.f3800.lambda$unpinAllObjectsAsync$56(this.f3801, task);
            default:
                return this.f3800.lambda$deleteDataForObjectAsync$44(this.f3801, task);
        }
    }
}
