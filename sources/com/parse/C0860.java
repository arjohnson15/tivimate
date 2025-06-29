package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.List;

/* renamed from: com.parse.ﾞﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0860 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3880;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f3881;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3882 = 1;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ Object f3883;

    public /* synthetic */ C0860(String str, List list, boolean z) {
        this.f3881 = str;
        this.f3883 = list;
        this.f3880 = z;
    }

    public /* synthetic */ C0860(boolean z, TaskCompletionSource taskCompletionSource, ParseCallback2 parseCallback2) {
        this.f3880 = z;
        this.f3881 = taskCompletionSource;
        this.f3883 = parseCallback2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3882) {
            case 0:
                return ParseTaskUtils.lambda$callbackOnMainThreadAsync$2(this.f3880, (TaskCompletionSource) this.f3881, (ParseCallback2) this.f3883, task);
            default:
                return ParseObject.lambda$pinAllInBackground$23((String) this.f3881, (List) this.f3883, this.f3880, task);
        }
    }
}
