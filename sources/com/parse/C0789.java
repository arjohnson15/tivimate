package com.parse;

import com.parse.OfflineStore;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0789 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ OfflineStore.SQLiteDatabaseCallable f3667;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3668;

    public /* synthetic */ C0789(OfflineStore.SQLiteDatabaseCallable sQLiteDatabaseCallable, int i) {
        this.f3668 = i;
        this.f3667 = sQLiteDatabaseCallable;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3668) {
            case 0:
                return OfflineStore.lambda$runWithManagedTransaction$67(this.f3667, task);
            default:
                return OfflineStore.lambda$runWithManagedConnection$63(this.f3667, task);
        }
    }
}
