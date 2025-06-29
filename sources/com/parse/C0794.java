package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0794 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ParseUser f3681;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ParseOperationSet f3682;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3683;

    public /* synthetic */ C0794(ParseUser parseUser, ParseOperationSet parseOperationSet, int i) {
        this.f3683 = i;
        this.f3681 = parseUser;
        this.f3682 = parseOperationSet;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3683) {
            case 0:
                return this.f3681.lambda$resolveLazinessAsync$29(this.f3682, task);
            case 1:
                return this.f3681.lambda$signUpAsync$21(this.f3682, task);
            default:
                return this.f3681.lambda$resolveLazinessAsync$28(this.f3682, task);
        }
    }
}
