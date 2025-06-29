package com.android.billingclient.api;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.leanback.widget.ﾞᐧ;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.AbstractC0629;
import p071.AbstractC1570;
import p071.C1568;
import p226.AbstractActivityC3030;
import p286.C3389;
import ˊﹶ.ˋˉ;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends AbstractActivityC3030 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public AbstractC1570 f2289;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public ResultReceiver f2290;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ResultReceiver f2291;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public AbstractC1570 f2292;

    @Override // p226.AbstractActivityC3030, p307.AbstractActivityC3565, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2292 = registerForActivityResult(new C3389(3), new ˋˉ(1, this));
        this.f2289 = registerForActivityResult(new C3389(3), new ﾞᐧ(22, this));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f2290 = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f2291 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        AbstractC0629.m2642("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f2290 = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f2292.mo5158(new C1568(pendingIntent.getIntentSender(), null, 0, 0));
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f2291 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f2289.mo5158(new C1568(pendingIntent2.getIntentSender(), null, 0, 0));
        }
    }

    @Override // p226.AbstractActivityC3030, p307.AbstractActivityC3565, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f2290;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f2291;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
