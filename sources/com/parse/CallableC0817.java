package com.parse;

import java.util.concurrent.Callable;

/* renamed from: com.parse.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0817 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ FileObjectStore f3747;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3748;

    public /* synthetic */ CallableC0817(FileObjectStore fileObjectStore, int i) {
        this.f3748 = i;
        this.f3747 = fileObjectStore;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3748) {
            case 0:
                return this.f3747.lambda$getAsync$1();
            default:
                return this.f3747.lambda$deleteAsync$2();
        }
    }
}
