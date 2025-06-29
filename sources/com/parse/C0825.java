package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0825 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ OfflineStore f3771;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ ParseSQLiteDatabase f3772;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ParseObject f3773;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3774;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ String f3775;

    public /* synthetic */ C0825(OfflineStore offlineStore, ParseObject parseObject, String str, ParseSQLiteDatabase parseSQLiteDatabase, int i) {
        this.f3774 = i;
        this.f3771 = offlineStore;
        this.f3773 = parseObject;
        this.f3775 = str;
        this.f3772 = parseSQLiteDatabase;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3774) {
            case 0:
                return OfflineQueryLogic.lambda$fetchIncludesAsync$11(this.f3771, this.f3773, this.f3775, this.f3772, task);
            default:
                return this.f3771.lambda$deleteDataForObjectAsync$45(this.f3773, this.f3775, this.f3772, task);
        }
    }
}
