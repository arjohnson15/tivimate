package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ٴᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0831 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ParsePinningEventuallyQueue f3789;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3790;

    public /* synthetic */ C0831(ParsePinningEventuallyQueue parsePinningEventuallyQueue, int i) {
        this.f3790 = i;
        this.f3789 = parsePinningEventuallyQueue;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3790) {
            case 0:
                return this.f3789.lambda$runEventuallyAsync$13(task);
            case 1:
                return this.f3789.populateQueueAsync(task);
            case 2:
                return this.f3789.lambda$populateQueueAsync$9(task);
            default:
                return this.f3789.lambda$populateQueueAsync$10(task);
        }
    }
}
