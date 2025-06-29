package com.parse;

import android.content.Context;
import android.content.Intent;
import com.parse.ConnectivityNotifier;

/* renamed from: com.parse.ᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0844 implements ConnectivityNotifier.ConnectivityListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ ParseEventuallyQueue f3826;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3827;

    public /* synthetic */ C0844(ParseEventuallyQueue parseEventuallyQueue, int i) {
        this.f3827 = i;
        this.f3826 = parseEventuallyQueue;
    }

    @Override // com.parse.ConnectivityNotifier.ConnectivityListener
    public final void networkConnectivityStatusChanged(Context context, Intent intent) {
        switch (this.f3827) {
            case 0:
                ((ParseCommandCache) this.f3826).lambda$new$1(context, intent);
                break;
            default:
                ((ParsePinningEventuallyQueue) this.f3826).lambda$new$0(context, intent);
                break;
        }
    }
}
