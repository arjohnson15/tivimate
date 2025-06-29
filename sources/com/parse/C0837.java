package com.parse;

import com.parse.ParseQuery;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.http.ParseHttpRequest;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p334.C3789;

/* renamed from: com.parse.ᴵʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0837 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f3807;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ Object f3808;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f3809;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3810;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ Object f3811;

    public /* synthetic */ C0837(OfflineStore offlineStore, Object obj, ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase, int i) {
        this.f3810 = i;
        this.f3811 = offlineStore;
        this.f3808 = obj;
        this.f3807 = parseObject;
        this.f3809 = parseSQLiteDatabase;
    }

    public /* synthetic */ C0837(ParseObject parseObject, JSONObject jSONObject, String str, ParseSQLiteDatabase parseSQLiteDatabase) {
        this.f3810 = 1;
        this.f3807 = parseObject;
        this.f3811 = jSONObject;
        this.f3808 = str;
        this.f3809 = parseSQLiteDatabase;
    }

    public /* synthetic */ C0837(ParseSQLiteDatabase parseSQLiteDatabase, String str, String str2, String[] strArr) {
        this.f3810 = 5;
        this.f3809 = parseSQLiteDatabase;
        this.f3811 = str;
        this.f3807 = str2;
        this.f3808 = strArr;
    }

    public /* synthetic */ C0837(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f3810 = i;
        this.f3811 = obj;
        this.f3807 = obj2;
        this.f3808 = obj3;
        this.f3809 = obj4;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3810) {
            case 0:
                return ((OfflineStore) this.f3811).lambda$findAsync$9((ParseObject) this.f3807, (ParseQuery.State) this.f3808, (ParseSQLiteDatabase) this.f3809, task);
            case 1:
                return OfflineStore.lambda$updateDataForObjectAsync$37((ParseObject) this.f3807, (JSONObject) this.f3811, (String) this.f3808, (ParseSQLiteDatabase) this.f3809, task);
            case 2:
                return ((OfflineStore) this.f3811).lambda$findFromPinAsync$58((ParseQuery.State) this.f3808, (ParseUser) this.f3807, (ParseSQLiteDatabase) this.f3809, task);
            case 3:
                return ((OfflineStore) this.f3811).lambda$saveLocallyAsync$19((Capture) this.f3808, (ParseObject) this.f3807, (ParseSQLiteDatabase) this.f3809, task);
            case 4:
                return ((ParseRequest) this.f3811).lambda$sendOneRequestAsync$0((ParseHttpClient) this.f3807, (ParseHttpRequest) this.f3808, (ProgressCallback) this.f3809, task);
            case 5:
                return ((ParseSQLiteDatabase) this.f3809).lambda$deleteAsync$23((String) this.f3811, (String) this.f3807, (String[]) this.f3808, task);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((ParseUser) this.f3811).lambda$signUpAsync$22((ParseOperationSet) this.f3807, (String) this.f3808, (String) this.f3809, task);
            default:
                return ParseObject.lambda$deepSaveAsync$11((Capture) this.f3811, (AtomicBoolean) this.f3807, (AtomicBoolean) this.f3808, (String) this.f3809, task);
        }
    }
}
