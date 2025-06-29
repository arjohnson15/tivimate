package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ˎˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0812 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ParseObject f3727;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ParseOperationSet f3728;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3729;

    public /* synthetic */ C0812(ParseObject parseObject, ParseOperationSet parseOperationSet, int i) {
        this.f3729 = i;
        this.f3727 = parseObject;
        this.f3728 = parseOperationSet;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3729) {
            case 0:
                return this.f3727.lambda$saveAsync$36(this.f3728, task);
            default:
                return ParseObject.lambda$saveAllAsync$13(this.f3727, this.f3728, task);
        }
    }
}
