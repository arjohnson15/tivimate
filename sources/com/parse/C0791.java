package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ʽˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0791 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ParsePinningEventuallyQueue f3672;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ EventuallyPin f3673;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3674;

    public /* synthetic */ C0791(ParsePinningEventuallyQueue parsePinningEventuallyQueue, EventuallyPin eventuallyPin, int i) {
        this.f3674 = i;
        this.f3672 = parsePinningEventuallyQueue;
        this.f3673 = eventuallyPin;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3674) {
            case 0:
                return this.f3672.lambda$runEventuallyAsync$14(this.f3673, task);
            default:
                return this.f3672.lambda$runEventuallyAsync$15(this.f3673, task);
        }
    }
}
