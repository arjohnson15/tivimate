package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.AbstractC0629;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public ResultReceiver f2285;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f2286;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f2287;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public ResultReceiver f2288;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent;
        int i;
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC0629.m2642("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f2286 = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f2288 = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f2285 = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f2287 = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            return;
        }
        AbstractC0629.m2642("ProxyBillingActivity", "Launching Play Store billing flow");
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f2287 = true;
                i = 110;
            } else {
                i = 100;
            }
        } else {
            if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f2288 = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.f2285 = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                i = 101;
            } else {
                pendingIntent = null;
            }
            i = 100;
        }
        try {
            this.f2286 = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            AbstractC0629.m2647("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.f2288;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f2285;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentM1521 = m1521();
                    if (this.f2287) {
                        intentM1521.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentM1521.putExtra("RESPONSE_CODE", 6);
                    intentM1521.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentM1521);
                }
            }
            this.f2286 = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f2286) {
            Intent intentM1521 = m1521();
            intentM1521.putExtra("RESPONSE_CODE", 1);
            intentM1521.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentM1521);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f2288;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f2285;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f2286);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f2287);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Intent m1521() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }
}
