package com.parse;

import android.content.ContentValues;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Map;

/* renamed from: com.parse.ⁱⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0850 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f3844;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ String f3845;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ String f3846;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3847 = 0;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ Object f3848;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ Object f3849;

    public /* synthetic */ C0850(ParseSQLiteDatabase parseSQLiteDatabase, String str, ContentValues contentValues, String str2, String[] strArr) {
        this.f3844 = parseSQLiteDatabase;
        this.f3846 = str;
        this.f3848 = contentValues;
        this.f3845 = str2;
        this.f3849 = strArr;
    }

    public /* synthetic */ C0850(ParseSQLiteDatabase parseSQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2) {
        this.f3844 = parseSQLiteDatabase;
        this.f3846 = str;
        this.f3849 = strArr;
        this.f3845 = str2;
        this.f3848 = strArr2;
    }

    public /* synthetic */ C0850(ParseUser parseUser, ParseUser parseUser2, String str, String str2, Map map) {
        this.f3844 = parseUser;
        this.f3848 = parseUser2;
        this.f3846 = str;
        this.f3845 = str2;
        this.f3849 = map;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3847) {
            case 0:
                return ((ParseSQLiteDatabase) this.f3844).lambda$updateAsync$21(this.f3846, (ContentValues) this.f3848, this.f3845, (String[]) this.f3849, task);
            case 1:
                return ((ParseSQLiteDatabase) this.f3844).lambda$queryAsync$14(this.f3846, (String[]) this.f3849, this.f3845, (String[]) this.f3848, task);
            default:
                return ((ParseUser) this.f3844).lambda$signUpAsync$19((ParseUser) this.f3848, this.f3846, this.f3845, (Map) this.f3849, task);
        }
    }
}
