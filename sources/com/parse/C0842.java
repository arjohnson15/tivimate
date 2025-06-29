package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0842 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ NetworkUserController f3822;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3823;

    public /* synthetic */ C0842(NetworkUserController networkUserController, int i) {
        this.f3823 = i;
        this.f3822 = networkUserController;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3823) {
            case 0:
                return this.f3822.lambda$logInAsync$1(task);
            default:
                return this.f3822.lambda$signUpAsync$0(task);
        }
    }
}
