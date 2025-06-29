package com.parse;

import com.parse.OfflineQueryLogic;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0801 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ OfflineQueryLogic.ConstraintMatcher f3696;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ParseObject f3697;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3698;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ ParseSQLiteDatabase f3699;

    public /* synthetic */ C0801(OfflineQueryLogic.ConstraintMatcher constraintMatcher, ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase, int i) {
        this.f3698 = i;
        this.f3696 = constraintMatcher;
        this.f3697 = parseObject;
        this.f3699 = parseSQLiteDatabase;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3698) {
            case 0:
                return OfflineQueryLogic.AnonymousClass6.lambda$matchesAsync$0(this.f3696, this.f3697, this.f3699, task);
            default:
                return OfflineQueryLogic.AnonymousClass9.lambda$matchesAsync$0(this.f3696, this.f3697, this.f3699, task);
        }
    }
}
