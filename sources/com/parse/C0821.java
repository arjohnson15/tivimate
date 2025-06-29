package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;

/* renamed from: com.parse.ˑʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0821 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ TaskCompletionSource f3759;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3760;

    public /* synthetic */ C0821(TaskCompletionSource taskCompletionSource, int i) {
        this.f3760 = i;
        this.f3759 = taskCompletionSource;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3760) {
            case 0:
                return ParseRequest.lambda$executeAsync$2(this.f3759, task);
            default:
                return ParseObject.lambda$enqueueForAll$1(this.f3759, task);
        }
    }
}
