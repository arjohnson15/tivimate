package com.parse;

import android.content.Context;
import com.parse.boltsinternal.Capture;
import java.util.concurrent.Callable;

/* renamed from: com.parse.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0806 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f3707;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3708;

    public /* synthetic */ CallableC0806(int i, Object obj) {
        this.f3708 = i;
        this.f3707 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3708) {
            case 0:
                return ((ParseCurrentConfigController) this.f3707).lambda$getCurrentConfigAsync$1();
            case 1:
                return Parse.lambda$initialize$0((Context) this.f3707);
            default:
                return ParseObject.lambda$deepSaveAsync$9((Capture) this.f3707);
        }
    }
}
