package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0814 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Task f3734;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3735;

    public /* synthetic */ C0814(Task task, int i) {
        this.f3735 = i;
        this.f3734 = task;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3735) {
            case 0:
                return OfflineObjectStore.lambda$deleteAsync$6(this.f3734, task);
            case 1:
                return ParsePinningEventuallyQueue.lambda$process$18(this.f3734, task);
            case 2:
                return TaskQueue.lambda$waitFor$1(this.f3734, task);
            case 3:
                return TaskQueue.lambda$waitFor$0(this.f3734, task);
            case 4:
                return ParseObject.lambda$saveAsync$35(this.f3734, task);
            default:
                return ParseObject.lambda$saveAllAsync$12(this.f3734, task);
        }
    }
}
