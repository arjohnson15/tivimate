package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0830 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ CachedCurrentUserController f3786;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ParseUser f3787;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3788;

    public /* synthetic */ C0830(CachedCurrentUserController cachedCurrentUserController, ParseUser parseUser, int i) {
        this.f3788 = i;
        this.f3786 = cachedCurrentUserController;
        this.f3787 = parseUser;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3788) {
            case 0:
                return this.f3786.lambda$setAsync$4(this.f3787, task);
            case 1:
                return this.f3786.lambda$setAsync$3(this.f3787, task);
            case 2:
                return this.f3786.lambda$setAsync$5(this.f3787, task);
            default:
                return this.f3786.lambda$setAsync$1(this.f3787, task);
        }
    }
}
