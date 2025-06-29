package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0795 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ParseUser f3684;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3685;

    public /* synthetic */ C0795(ParseUser parseUser, int i) {
        this.f3685 = i;
        this.f3684 = parseUser;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3685) {
            case 0:
                return CachedCurrentUserController.lambda$setAsync$2(this.f3684, task);
            case 1:
                return this.f3684.lambda$saveAsync$13(task);
            case 2:
                return this.f3684.lambda$saveAsync$14(task);
            default:
                return ParseUser.lambda$logInInBackground$0(this.f3684, task);
        }
    }
}
