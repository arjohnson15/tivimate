package com.parse;

import com.parse.ParseObject;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* renamed from: com.parse.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0818 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ NetworkObjectController f3749;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ParseObject.State f3750;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3751;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ ParseDecoder f3752;

    public /* synthetic */ C0818(NetworkObjectController networkObjectController, ParseObject.State state, ParseDecoder parseDecoder, int i) {
        this.f3751 = i;
        this.f3749 = networkObjectController;
        this.f3750 = state;
        this.f3752 = parseDecoder;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3751) {
            case 0:
                return this.f3749.lambda$saveAsync$1(this.f3750, this.f3752, task);
            default:
                return this.f3749.lambda$saveAllAsync$2(this.f3750, this.f3752, task);
        }
    }
}
