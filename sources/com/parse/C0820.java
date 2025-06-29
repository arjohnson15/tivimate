package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0820 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ CachedCurrentInstallationController f3756;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ParseInstallation f3757;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3758;

    public /* synthetic */ C0820(CachedCurrentInstallationController cachedCurrentInstallationController, ParseInstallation parseInstallation, int i) {
        this.f3758 = i;
        this.f3756 = cachedCurrentInstallationController;
        this.f3757 = parseInstallation;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3758) {
            case 0:
                return this.f3756.lambda$setAsync$2(this.f3757, task);
            case 1:
                return this.f3756.lambda$setAsync$0(this.f3757, task);
            default:
                return this.f3756.lambda$setAsync$1(this.f3757, task);
        }
    }
}
