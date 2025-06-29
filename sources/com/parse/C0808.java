package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0808 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ OfflineStore f3712;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ParseObject f3713;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3714;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ ParseSQLiteDatabase f3715;

    public /* synthetic */ C0808(OfflineStore offlineStore, ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase, int i) {
        this.f3714 = i;
        this.f3712 = offlineStore;
        this.f3713 = parseObject;
        this.f3715 = parseSQLiteDatabase;
    }

    public /* synthetic */ C0808(OfflineStore offlineStore, ParseSQLiteDatabase parseSQLiteDatabase, ParseObject parseObject, int i) {
        this.f3714 = i;
        this.f3712 = offlineStore;
        this.f3715 = parseSQLiteDatabase;
        this.f3713 = parseObject;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3714) {
            case 0:
                return this.f3712.lambda$updateDataForObjectAsync$36(this.f3713, this.f3715, task);
            case 1:
                return this.f3712.lambda$saveLocallyAsync$23(this.f3713, this.f3715, task);
            case 2:
                return this.f3712.lambda$deleteDataForObjectAsync$40(this.f3713, this.f3715, task);
            case 3:
                return this.f3712.lambda$deleteDataForObjectAsync$46(this.f3715, this.f3713, task);
            case 4:
                return this.f3712.lambda$updateDataForObjectAsync$33(this.f3713, this.f3715, task);
            default:
                return this.f3712.lambda$fetchLocallyAsync$16(this.f3715, this.f3713, task);
        }
    }
}
