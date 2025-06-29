package com.parse;

import com.parse.OfflineStore;
import com.parse.ParseUser;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import org.json.JSONObject;
import p334.C3789;

/* renamed from: com.parse.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0798 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f3688;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3689;

    public /* synthetic */ C0798(int i, Object obj) {
        this.f3689 = i;
        this.f3688 = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3689) {
            case 0:
                return OfflineStore.lambda$getParsePin$50((String) this.f3688, task);
            case 1:
                return ((OfflineStore.OfflineEncoder) this.f3688).lambda$whenFinished$0(task);
            case 2:
                return OfflineStore.OfflineEncoder.lambda$encodeRelatedObject$1((JSONObject) this.f3688, task);
            case 3:
                return ((ParseCloudCodeController) this.f3688).lambda$callFunctionInBackground$0(task);
            case 4:
                return ((ParseRequest) this.f3688).lambda$sendOneRequestAsync$1(task);
            case 5:
                return ParseUser.lambda$resolveLazinessAsync$26((ParseUser.State) this.f3688, task);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((ParseFile) this.f3688).lambda$saveAsync$2(task);
            default:
                return ((ParseInstallation) this.f3688).lambda$handleSaveResultAsync$2(task);
        }
    }
}
