package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import p334.C3789;

/* renamed from: com.parse.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0823 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ParseSQLiteDatabase f3766;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3767;

    public /* synthetic */ C0823(ParseSQLiteDatabase parseSQLiteDatabase, int i) {
        this.f3767 = i;
        this.f3766 = parseSQLiteDatabase;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3767) {
            case 0:
                return OfflineStore.lambda$deleteDataForObjectAsync$38(this.f3766, task);
            case 1:
                return OfflineStore.lambda$deleteDataForObjectAsync$39(this.f3766, task);
            case 2:
                return OfflineStore.lambda$runWithManagedTransaction$64(this.f3766, task);
            case 3:
                return OfflineStore.lambda$runWithManagedTransaction$65(this.f3766, task);
            case 4:
                return OfflineStore.lambda$runWithManagedConnection$62(this.f3766, task);
            case 5:
                return OfflineStore.lambda$updateDataForObjectAsync$31(this.f3766, task);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return OfflineStore.lambda$updateDataForObjectAsync$32(this.f3766, task);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.f3766.lambda$endTransactionAsync$10(task);
            case 8:
                return ParseSQLiteDatabase.lambda$openDatabaseAsync$1(this.f3766, task);
            case 9:
                return this.f3766.lambda$open$5(task);
            case 10:
                return this.f3766.lambda$beginTransactionAsync$6(task);
            case 11:
                return this.f3766.lambda$new$0(task);
            case 12:
                return this.f3766.lambda$closeAsync$12(task);
            default:
                return this.f3766.lambda$setTransactionSuccessfulAsync$8(task);
        }
    }
}
