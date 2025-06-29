package com.parse;

import com.parse.OfflineQueryLogic;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import p334.C3789;

/* renamed from: com.parse.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0833 implements Continuation {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3796;

    public /* synthetic */ C0833(int i) {
        this.f3796 = i;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3796) {
            case 0:
                return CachedCurrentUserController.lambda$setAsync$0(task);
            case 1:
                return CachedCurrentUserController.lambda$getCurrentSessionTokenAsync$8(task);
            case 2:
                return CachedCurrentUserController.lambda$logOutAsync$9(task);
            case 3:
                return EventuallyPin.lambda$findAllPinned$2(task);
            case 4:
                return OfflineQueryLogic.AnonymousClass2.lambda$matchesAsync$0(task);
            case 5:
                return OfflineQueryLogic.AnonymousClass4.lambda$matchesAsync$0(task);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return ParseSQLiteDatabase.lambda$rawQueryAsync$26(task);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return ParseSQLiteDatabase.lambda$rawQueryAsync$27(task);
            case 8:
                return ParseSQLiteDatabase.lambda$deleteAsync$24(task);
            case 9:
                return ParseSQLiteDatabase.lambda$updateAsync$22(task);
            case 10:
                return ParseSQLiteDatabase.lambda$insertWithOnConflict$18(task);
            case 11:
                return ParseSQLiteDatabase.lambda$insertOrThrowAsync$20(task);
            case 12:
                return ParseSQLiteDatabase.lambda$endTransactionAsync$11(task);
            case 13:
                return ParseSQLiteDatabase.lambda$beginTransactionAsync$7(task);
            case 14:
                return ParseSQLiteDatabase.lambda$closeAsync$13(task);
            case 15:
                return ParseSQLiteDatabase.lambda$setTransactionSuccessfulAsync$9(task);
            case 16:
                return ParseSQLiteDatabase.lambda$queryAsync$15(task);
            case 17:
                return ParseSQLiteDatabase.lambda$queryAsync$16(task);
            case 18:
                return TaskQueue.lambda$getTaskToAwait$2(task);
            case 19:
                return Parse.lambda$initialize$1(task);
            case 20:
                return ParseObject.lambda$handleDeleteEventuallyResultAsync$42(task);
            case 21:
                return ParseUser.lambda$resolveLazinessAsync$27(task);
            default:
                return ParseUser.lambda$logInInBackground$1(task);
        }
    }
}
