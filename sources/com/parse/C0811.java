package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ˋﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0811 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ParseFile f3722;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ ProgressCallback f3723;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Task f3724;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3725 = 1;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ String f3726;

    public /* synthetic */ C0811(ParseFile parseFile, Task task, String str, ProgressCallback progressCallback) {
        this.f3722 = parseFile;
        this.f3724 = task;
        this.f3726 = str;
        this.f3723 = progressCallback;
    }

    public /* synthetic */ C0811(ParseFile parseFile, String str, ProgressCallback progressCallback, Task task) {
        this.f3722 = parseFile;
        this.f3726 = str;
        this.f3723 = progressCallback;
        this.f3724 = task;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3725) {
            case 0:
                return this.f3722.lambda$saveAsync$6(this.f3726, this.f3723, this.f3724, task);
            default:
                return this.f3722.lambda$saveAsync$3(this.f3724, this.f3726, this.f3723, task);
        }
    }
}
