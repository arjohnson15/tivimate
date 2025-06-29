package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0853 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ CachedCurrentUserController f3858;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3859;

    public /* synthetic */ C0853(CachedCurrentUserController cachedCurrentUserController, int i) {
        this.f3859 = i;
        this.f3858 = cachedCurrentUserController;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3859) {
            case 0:
                return this.f3858.lambda$logOutAsync$12(task);
            default:
                return this.f3858.lambda$logOutAsync$10(task);
        }
    }
}
