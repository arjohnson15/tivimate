package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0819 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ CachedCurrentUserController f3753;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3754;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3755;

    public /* synthetic */ C0819(CachedCurrentUserController cachedCurrentUserController, boolean z, int i) {
        this.f3755 = i;
        this.f3753 = cachedCurrentUserController;
        this.f3754 = z;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3755) {
            case 0:
                return this.f3753.lambda$getAsync$15(this.f3754, task);
            case 1:
                return this.f3753.lambda$getAsync$14(this.f3754, task);
            default:
                return this.f3753.lambda$getAsync$13(this.f3754, task);
        }
    }
}
