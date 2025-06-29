package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0849 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ParseOperationSet f3842;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3843;

    public /* synthetic */ C0849(ParseOperationSet parseOperationSet, int i) {
        this.f3843 = i;
        this.f3842 = parseOperationSet;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3843) {
            case 0:
                return ParseObject.lambda$enqueueSaveEventuallyOperationAsync$39(this.f3842, task);
            default:
                return ParseObject.lambda$enqueueSaveEventuallyOperationAsync$38(this.f3842, task);
        }
    }
}
