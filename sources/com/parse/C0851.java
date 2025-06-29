package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0851 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ParseObject f3850;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3851;

    public /* synthetic */ C0851(ParseObject parseObject, int i) {
        this.f3851 = i;
        this.f3850 = parseObject;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3851) {
            case 0:
                return OfflineObjectStore.lambda$migrate$0(this.f3850, task);
            case 1:
                return OfflineStore.lambda$getOrCreateUUIDAsync$0(this.f3850, task);
            case 2:
                return this.f3850.lambda$handleSaveResultAsync$29(task);
            case 3:
                return ParseObject.lambda$pinAllInBackground$22(this.f3850, task);
            case 4:
                return this.f3850.lambda$saveInBackground$31(task);
            default:
                return this.f3850.lambda$saveInBackground$32(task);
        }
    }
}
