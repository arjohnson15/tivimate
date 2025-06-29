package com.parse;

import java.util.concurrent.Callable;

/* renamed from: com.parse.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0805 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f3704;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f3705;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3706;

    public /* synthetic */ CallableC0805(Object obj, int i, Object obj2) {
        this.f3706 = i;
        this.f3704 = obj;
        this.f3705 = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3706) {
            case 0:
                return ((FileObjectStore) this.f3704).lambda$setAsync$0((ParseObject) this.f3705);
            default:
                return ParseFile.lambda$progressCallbackOnMainThread$0((ProgressCallback) this.f3704, (Integer) this.f3705);
        }
    }
}
