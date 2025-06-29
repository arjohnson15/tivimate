package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ˊﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0807 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ParseUser f3709;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ String f3710;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3711;

    public /* synthetic */ C0807(ParseUser parseUser, String str, int i) {
        this.f3711 = i;
        this.f3709 = parseUser;
        this.f3710 = str;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3711) {
            case 0:
                return this.f3709.lambda$signUpInBackground$18(this.f3710, task);
            default:
                return this.f3709.lambda$synchronizeAuthDataAsync$23(this.f3710, task);
        }
    }
}
