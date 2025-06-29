package com.parse;

import com.parse.OfflineStore;

/* renamed from: com.parse.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0846 implements OfflineStore.SQLiteDatabaseCallable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ OfflineStore f3832;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f3833;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3834;

    public /* synthetic */ C0846(OfflineStore offlineStore, Object obj, int i) {
        this.f3834 = i;
        this.f3832 = offlineStore;
        this.f3833 = obj;
    }

    @Override // com.parse.OfflineStore.SQLiteDatabaseCallable
    public final Object call(ParseSQLiteDatabase parseSQLiteDatabase) {
        switch (this.f3834) {
            case 0:
                return this.f3832.lambda$unpinAllObjectsAsync$55((String) this.f3833, parseSQLiteDatabase);
            default:
                return this.f3832.lambda$fetchLocallyAsync$18((ParseObject) this.f3833, parseSQLiteDatabase);
        }
    }
}
