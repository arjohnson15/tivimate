package com.parse;

import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0848 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Capture f3840;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3841;

    public /* synthetic */ C0848(Capture capture, int i) {
        this.f3841 = i;
        this.f3840 = capture;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3841) {
            case 0:
                return OfflineStore.lambda$deleteDataForObjectAsync$42(this.f3840, task);
            case 1:
                return OfflineStore.lambda$fetchLocallyAsync$13(this.f3840, task);
            default:
                return ParseCommandCache.lambda$waitForTaskWithoutLock$2(this.f3840, task);
        }
    }
}
