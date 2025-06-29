package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import p334.C3789;

/* renamed from: com.parse.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0827 implements Continuation {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ OfflineStore f3778;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ParseObject f3779;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3780;

    public /* synthetic */ C0827(OfflineStore offlineStore, ParseObject parseObject, int i) {
        this.f3780 = i;
        this.f3778 = offlineStore;
        this.f3779 = parseObject;
    }

    public /* synthetic */ C0827(ParseObject parseObject, OfflineStore offlineStore, int i) {
        this.f3780 = i;
        this.f3779 = parseObject;
        this.f3778 = offlineStore;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f3780) {
            case 0:
                return this.f3778.lambda$saveLocallyAsync$21(this.f3779, task);
            case 1:
                return this.f3778.lambda$deleteDataForObjectAsync$41(this.f3779, task);
            case 2:
                return this.f3778.lambda$deleteDataForObjectAsync$49(this.f3779, task);
            case 3:
                return this.f3778.lambda$updateDataForObjectAsync$35(this.f3779, task);
            case 4:
                return this.f3778.lambda$updateDataForObjectAsync$34(this.f3779, task);
            case 5:
                return this.f3778.lambda$fetchLocallyAsync$14(this.f3779, task);
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.f3779.lambda$handleSaveResultAsync$25(this.f3778, task);
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.f3779.lambda$handleSaveResultAsync$26(this.f3778, task);
            case 8:
                return this.f3779.lambda$handleSaveResultAsync$28(this.f3778, task);
            default:
                return this.f3779.lambda$handleDeleteResultAsync$58(this.f3778, task);
        }
    }
}
