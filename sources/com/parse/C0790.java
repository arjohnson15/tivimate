package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.List;

/* renamed from: com.parse.ʻﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0790 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ String f3669;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ List f3670;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3671 = 1;

    public /* synthetic */ C0790(String str, List list) {
        this.f3669 = str;
        this.f3670 = list;
    }

    public /* synthetic */ C0790(List list, String str) {
        this.f3670 = list;
        this.f3669 = str;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3671) {
            case 0:
                return ParseObject.lambda$saveAllAsync$14(this.f3670, this.f3669, task);
            default:
                return ParseObject.lambda$pinAllInBackground$24(this.f3669, this.f3670, task);
        }
    }
}
