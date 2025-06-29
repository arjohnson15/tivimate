package com.parse;

import com.parse.OfflineQueryLogic;

/* renamed from: com.parse.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0797 implements OfflineQueryLogic.Decider {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3687;

    public /* synthetic */ C0797(int i) {
        this.f3687 = i;
    }

    @Override // com.parse.OfflineQueryLogic.Decider
    public final boolean decide(Object obj, Object obj2) {
        switch (this.f3687) {
            case 0:
                return OfflineQueryLogic.lambda$matchesEqualConstraint$0(obj, obj2);
            case 1:
                return obj.equals(obj2);
            case 2:
                return OfflineQueryLogic.lambda$matchesLessThanOrEqualToConstraint$2(obj, obj2);
            case 3:
                return OfflineQueryLogic.lambda$matchesGreaterThanOrEqualToConstraint$4(obj, obj2);
            case 4:
                return OfflineQueryLogic.lambda$matchesGreaterThanConstraint$3(obj, obj2);
            default:
                return OfflineQueryLogic.lambda$matchesLessThanConstraint$1(obj, obj2);
        }
    }
}
