package com.parse;

import android.content.ContentValues;
import com.parse.OfflineQueryLogic;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONObject;
import p334.C3789;

/* renamed from: com.parse.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0813 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f3730;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f3731;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3732;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ Object f3733;

    public /* synthetic */ C0813(Object obj, Object obj2, Object obj3, int i) {
        this.f3732 = i;
        this.f3730 = obj;
        this.f3731 = obj2;
        this.f3733 = obj3;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3732) {
            case 0:
                return OfflineStore.lambda$fetchLocallyAsync$15((ParseObject) this.f3730, (JSONObject) this.f3731, (HashMap) this.f3733, task);
            case 1:
                return ((OfflineStore) this.f3730).lambda$saveLocallyAsync$24((ArrayList) this.f3731, (ParseSQLiteDatabase) this.f3733, task);
            case 2:
                return ((OfflineStore) this.f3730).lambda$findAsync$5((Capture) this.f3731, (ParseSQLiteDatabase) this.f3733, task);
            case 3:
                return OfflineStore.lambda$findAsync$6((Capture) this.f3730, (OfflineQueryLogic.ConstraintMatcher) this.f3731, (ParseSQLiteDatabase) this.f3733, task);
            case 4:
                return ((OfflineStore) this.f3730).lambda$unpinAsync$27((LinkedList) this.f3731, (ParseSQLiteDatabase) this.f3733, task);
            case 5:
                return OfflineStore.lambda$saveLocallyAsync$20((String) this.f3730, (Capture) this.f3731, (ParseSQLiteDatabase) this.f3733, task);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return OfflineStore.lambda$fetchLocallyAsync$12((Capture) this.f3730, (ParseSQLiteDatabase) this.f3731, (String[]) this.f3733, task);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((ParseFileController) this.f3730).lambda$saveAsync$1((ParseFile.State) this.f3731, (File) this.f3733, task);
            case 8:
                return ((ParseFileController) this.f3730).lambda$saveAsync$0((ParseFile.State) this.f3731, (byte[]) this.f3733, task);
            case 9:
                return ((ParseObject) this.f3730).lambda$handleSaveResultAsync$27((ParseObject.State) this.f3731, (ParseOperationSet) this.f3733, task);
            case 10:
                return ((ParseObject) this.f3730).lambda$saveAsync$34((ParseOperationSet) this.f3731, (String) this.f3733, task);
            case 11:
                return ((ParsePinningEventuallyQueue) this.f3730).lambda$runEventuallyAsync$12((EventuallyPin) this.f3731, (String) this.f3733, task);
            case 12:
                return ((ParsePinningEventuallyQueue) this.f3730).lambda$waitForOperationSetAndEventuallyPin$16((String) this.f3731, (TaskCompletionSource) this.f3733, task);
            case 13:
                return ((ParsePinningEventuallyQueue) this.f3730).lambda$process$20((EventuallyPin) this.f3731, (ParseOperationSet) this.f3733, task);
            case 14:
                return ((ParseSQLiteDatabase) this.f3730).lambda$insertOrThrowAsync$19((String) this.f3731, (ContentValues) this.f3733, task);
            case 15:
                return ((ParseSQLiteDatabase) this.f3730).lambda$rawQueryAsync$25((String) this.f3731, (String[]) this.f3733, task);
            case 16:
                return ((ParseFile) this.f3730).lambda$saveInBackground$4((ProgressCallback) this.f3731, (TaskCompletionSource) this.f3733, task);
            case 17:
                return ((ParseInstallation) this.f3730).lambda$saveAsync$1((String) this.f3731, (Task) this.f3733, task);
            default:
                return ((ParseQuery) this.f3730).lambda$findAsync$1((ParseQuery.State) this.f3731, (TaskCompletionSource) this.f3733, task);
        }
    }
}
