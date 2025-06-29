package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.io.Serializable;
import org.json.JSONArray;

/* renamed from: com.parse.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0852 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ int f3852;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f3853;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f3854;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3855 = 0;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ Object f3856;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ Object f3857;

    public /* synthetic */ C0852(OfflineStore offlineStore, JSONArray jSONArray, int i, String str, ParseSQLiteDatabase parseSQLiteDatabase) {
        this.f3854 = offlineStore;
        this.f3857 = jSONArray;
        this.f3852 = i;
        this.f3853 = str;
        this.f3856 = parseSQLiteDatabase;
    }

    public /* synthetic */ C0852(ParsePinningEventuallyQueue parsePinningEventuallyQueue, EventuallyPin eventuallyPin, ParseOperationSet parseOperationSet, int i, ParseObject parseObject) {
        this.f3854 = parsePinningEventuallyQueue;
        this.f3857 = eventuallyPin;
        this.f3853 = parseOperationSet;
        this.f3852 = i;
        this.f3856 = parseObject;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3855) {
            case 0:
                return OfflineQueryLogic.lambda$fetchIncludeAsync$7((OfflineStore) this.f3854, (JSONArray) this.f3857, this.f3852, (String) this.f3853, (ParseSQLiteDatabase) this.f3856, task);
            default:
                return ((ParsePinningEventuallyQueue) this.f3854).lambda$process$19((EventuallyPin) this.f3857, (ParseOperationSet) this.f3853, this.f3852, (ParseObject) this.f3856, task);
        }
    }
}
