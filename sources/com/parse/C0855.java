package com.parse;

import android.database.sqlite.SQLiteOpenHelper;
import com.parse.OfflineQueryLogic;
import com.parse.OfflineStore;
import com.parse.ParseQuery;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p334.C3789;

/* renamed from: com.parse.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0855 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f3864;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f3865;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3866;

    public /* synthetic */ C0855(Object obj, int i, Object obj2) {
        this.f3866 = i;
        this.f3864 = obj;
        this.f3865 = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3866) {
            case 0:
                return ((CachedCurrentUserController) this.f3864).lambda$logOutAsync$11((Task) this.f3865, task);
            case 1:
                return ((NetworkUserController) this.f3864).lambda$logInAsync$2((ParseRESTUserCommand) this.f3865, task);
            case 2:
                return OfflineObjectStore.lambda$migrate$1((ParseObjectStore) this.f3864, (ParseObjectStore) this.f3865, task);
            case 3:
                return ((OfflineObjectStore) this.f3864).lambda$setAsync$2((ParseObject) this.f3865, task);
            case 4:
                return OfflineQueryLogic.lambda$fetchIncludeAsync$8(this.f3864, (String) this.f3865, task);
            case 5:
                return ((OfflineQueryLogic.SubQueryMatcher) this.f3864).lambda$matchesAsync$0((ParseObject) this.f3865, task);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return OfflineStore.lambda$findAsync$3((ParseQuery.State) this.f3864, (ParseSQLiteDatabase) this.f3865, task);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return OfflineStore.lambda$findAsync$7((List) this.f3864, (Capture) this.f3865, task);
            case 8:
                return ((OfflineStore) this.f3864).lambda$getPointerAsync$2((String) this.f3865, task);
            case 9:
                return ((OfflineStore) this.f3864).lambda$unpinAsync$29((LinkedList) this.f3865, task);
            case 10:
                return OfflineStore.lambda$getOrCreateUUIDAsync$1((TaskCompletionSource) this.f3864, (String) this.f3865, task);
            case 11:
                return OfflineStore.lambda$runWithManagedTransaction$66((OfflineStore.SQLiteDatabaseCallable) this.f3864, (ParseSQLiteDatabase) this.f3865, task);
            case 12:
                return OfflineStore.lambda$fetchLocallyAsync$17((TaskCompletionSource) this.f3864, (ParseObject) this.f3865, task);
            case 13:
                return ParseCommandCache.lambda$maybeRunAllCommandsNow$3((ParseRESTCommand) this.f3864, (TaskCompletionSource) this.f3865, task);
            case 14:
                return ((ParsePinningEventuallyQueue) this.f3864).lambda$runEventuallyAsync$11((String) this.f3865, task);
            case 15:
                return ((ParseSQLiteDatabase) this.f3864).lambda$open$4((SQLiteOpenHelper) this.f3865, task);
            case 16:
                return ParseCloud.lambda$callFunctionInBackground$0((String) this.f3864, (Map) this.f3865, task);
            case 17:
                return ((ParseFile) this.f3864).lambda$saveInBackground$5((TaskCompletionSource) this.f3865, task);
            case 18:
                return ParseObject.saveAllAsync((ArrayList) this.f3864, (String) this.f3865, task);
            case 19:
                return ParseObject.lambda$enqueueForAll$0((ArrayList) this.f3864, (Task) this.f3865, task);
            case 20:
                return ParseObject.lambda$saveInBackground$30((ParseACL) this.f3864, (ParseUser) this.f3865, task);
            case 21:
                return ((ParseObject) this.f3864).lambda$saveAsync$33((String) this.f3865, task);
            case 22:
                return ((ParseQuery) this.f3864).lambda$perform$0((TaskCompletionSource) this.f3865, task);
            default:
                return ((ParseUser) this.f3864).lambda$signUpAsync$20((Task) this.f3865, task);
        }
    }
}
