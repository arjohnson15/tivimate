package com.parse;

import com.parse.ParseQuery;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.concurrent.Callable;

/* renamed from: com.parse.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0829 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ParseQuery.State f3782;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f3783;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3784 = 0;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ Object f3785;

    public /* synthetic */ CallableC0829(CacheQueryController cacheQueryController, ParseQuery.State state, String str) {
        this.f3783 = cacheQueryController;
        this.f3785 = str;
        this.f3782 = state;
    }

    public /* synthetic */ CallableC0829(ParseQuery parseQuery, ParseQuery.State state, TaskCompletionSource taskCompletionSource) {
        this.f3783 = parseQuery;
        this.f3782 = state;
        this.f3785 = taskCompletionSource;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3784) {
            case 0:
                return ((CacheQueryController) this.f3783).lambda$findFromCacheAsync$0((String) this.f3785, this.f3782);
            default:
                return ((ParseQuery) this.f3783).lambda$findAsync$2(this.f3782, (TaskCompletionSource) this.f3785);
        }
    }
}
