package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.List;

/* renamed from: com.parse.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0803 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ List f3701;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3702;

    public /* synthetic */ C0803(List list, int i) {
        this.f3702 = i;
        this.f3701 = list;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3702) {
            case 0:
                return EventuallyPin.lambda$findAllPinned$1(this.f3701, task);
            default:
                return OfflineStore.lambda$findAsync$10(this.f3701, task);
        }
    }
}
